#!/usr/bin/env python3
"""
PROLOGY Documentation Graph Generator
======================================
Сканирует все .md файлы в docs/, парсит frontmatter, markdown-ссылки, заголовки,
строит граф документации через networkx и генерирует интерактивный HTML/JSON/GraphML.

Возможности:
  - Параллельный парсинг (ThreadPoolExecutor)
  - Кэширование результатов (MD5 + JSON cache)
  - TF-IDF семантические связи между документами
  - Экспорт в HTML (D3.js), JSON, GraphML

Использование:
    python tools/graph_generator.py [--docs-dir docs] [--output docs/graph.html]
    python tools/graph_generator.py --format json --output docs/graph.json
    python tools/graph_generator.py --no-cache
"""

import argparse
import hashlib
import json
import os
import re
import sys
import time
from collections import defaultdict, Counter
from concurrent.futures import ThreadPoolExecutor, as_completed
from pathlib import Path

import markdown
from bs4 import BeautifulSoup
import networkx as nx
from jinja2 import Environment, FileSystemLoader


# ======================================================================
# Категории файлов (определяются по пути и содержимому)
# ======================================================================
CATEGORY_RULES = [
    (r'(?<!\\d)protocol|01-protocol', 'protocol'),
    (r'analysis|report|02-analysis', 'analysis'),
    (r'toolkit|03-toolkit', 'toolkit'),
    (r'guide|04-guides|modification|mod', 'guide'),
    (r'dsp|equalizer|eq', 'dsp'),
    (r'spec|specification', 'spec'),
    (r'cache_report|99-archive', 'report'),
    (r'ble|bluetooth', 'ble'),
    (r'esp32|arduino|sketch', 'esp32'),
    (r'frida', 'frida'),
    (r'rcsp', 'rcsp'),
    (r'readme|index|moc|graph|00-inbox|inbox', 'index'),
]

CATEGORY_COLORS = {
    'protocol': '#4CAF50',
    'analysis': '#2196F3',
    'toolkit': '#FF9800',
    'guide': '#9C27B0',
    'dsp': '#F44336',
    'spec': '#00BCD4',
    'report': '#795548',
    'ble': '#03A9F4',
    'esp32': '#8BC34A',
    'frida': '#E91E63',
    'rcsp': '#607D8B',
    'index': '#FFC107',
    'other': '#9E9E9E',
}

CATEGORY_ICONS = {
    'protocol': '🔌',
    'analysis': '🔬',
    'toolkit': '🛠️',
    'guide': '📖',
    'dsp': '🎛️',
    'spec': '📋',
    'report': '📊',
    'ble': '📡',
    'esp32': '⚙️',
    'frida': '🔧',
    'rcsp': '🔗',
    'index': '📑',
    'other': '📄',
}

# TF-IDF threshold for implicit edges
TFIDF_THRESHOLD = 0.25
TFIDF_MIN_OVERLAP = 0.15  # lower bound for small docs

# Cache file
CACHE_FILE = 'tools/.graph_cache.json'


# ======================================================================
# Парсинг .md файлов
# ======================================================================

def categorize_file(rel_path: str) -> str:
    """Определяет категорию файла по его относительному пути."""
    lower = rel_path.lower().replace('/', '_').replace('\\', '_')
    for pattern, category in CATEGORY_RULES:
        if re.search(pattern, lower):
            return category
    return 'other'


def extract_title(filepath: Path, content: str) -> str:
    """Извлекает заголовок из frontmatter или первого H1."""
    # Frontmatter (--- title: ... ---)
    fm_match = re.match(r'^---\s*\n(.*?)\n---', content, re.DOTALL)
    if fm_match:
        fm_text = fm_match.group(1)
        title_match = re.search(r'^title\s*[=:]\s*["\']?(.+?)["\']?\s*$', fm_text, re.MULTILINE)
        if title_match:
            return title_match.group(1).strip()

    # Первый H1 (# ...)
    h1_match = re.search(r'^#\s+(.+)$', content, re.MULTILINE)
    if h1_match:
        return h1_match.group(1).strip()

    # Имя файла как заголовок
    stem = filepath.stem.replace('_', ' ').replace('-', ' ').title()
    return stem


def extract_links(content: str) -> list[str]:
    """Извлекает все возможные ссылки на .md файлы из содержимого."""
    result = set()

    # 1. [[wiki-style links]]
    for link in re.findall(r'\[\[([^\]]+)\]\]', content):
        parts = link.split('|')
        result.add(parts[0].strip().lower().replace(' ', '_') + '.md')

    # 2. [text](url) markdown links
    for match in re.finditer(r'\[([^\]]*)\]\(([^)]+)\)', content):
        url = match.group(2).split('#')[0].split('?')[0]
        if url.endswith('.md'):
            result.add(url.lower())

    # 3. Inline mentions: `protocol.md` or `filename.md`
    for match in re.finditer(r'`([a-zA-Z0-9_/.-]+\.md)`', content):
        result.add(match.group(1).lower())

    # 4. Table cell mentions: | protocol.md | or | protocol.md — description
    for match in re.finditer(r'\|\s*([a-zA-Z0-9_/.-]+\.md)\s*[|\n]', content):
        result.add(match.group(1).lower())

    # 5. Plain text mentions: "see protocol.md for" or "file: protocol.md"
    for match in re.finditer(r'(?:see|file|file:|`)?\s*(\w[\w/.-]*\.md)', content, re.IGNORECASE):
        fname = match.group(1).lower()
        if fname.startswith(('http', 'www', '#')):
            continue
        if not fname.endswith('.md'):
            continue
        if len(fname) > 120:
            continue
        result.add(fname)

    return list(result)


def extract_headings(content: str) -> list[dict]:
    """Извлекает структуру заголовков."""
    headings = []
    for match in re.finditer(r'^(#{1,6})\s+(.+)$', content, re.MULTILINE):
        level = len(match.group(1))
        text = match.group(2).strip()
        headings.append({'level': level, 'text': text})
    return headings


def extract_code_blocks(content: str) -> list[dict]:
    """Извлекает блоки кода с языком."""
    blocks = []
    for match in re.finditer(r'```(\w*)\n(.*?)```', content, re.DOTALL):
        lang = match.group(1) or 'text'
        code = match.group(2).strip()
        if code:
            blocks.append({'language': lang, 'lines': len(code.split('\n'))})
    return blocks


def count_words(content: str) -> int:
    """Подсчитывает количество слов в содержимом (без кода)."""
    clean = re.sub(r'```.*?```', '', content, flags=re.DOTALL)
    clean = re.sub(r'<[^>]+>', '', clean)
    return len(clean.split())


def extract_plain_text(content: str) -> str:
    """Извлекает чистый текст (без кода и разметки) для TF-IDF."""
    text = re.sub(r'```.*?```', '', content, flags=re.DOTALL)
    text = re.sub(r'<[^>]+>', '', text)
    text = re.sub(r'[#*_~`>|\[\]()\-+]', ' ', text)
    text = re.sub(r'\s+', ' ', text).strip()
    return text.lower()


def parse_md_file(filepath: Path, docs_root: Path) -> dict:
    """Парсит .md файл и возвращает метаданные."""
    content = filepath.read_text(encoding='utf-8', errors='replace')
    rel_path = str(filepath.relative_to(docs_root))

    title = extract_title(filepath, content)
    links = extract_links(content)
    headings = extract_headings(content)
    code_blocks = extract_code_blocks(content)
    word_count = count_words(content)
    plain_text = extract_plain_text(content)
    category = categorize_file(rel_path)

    return {
        'path': rel_path,
        'title': title,
        'category': category,
        'word_count': word_count,
        'headings': headings,
        'links': links,
        'code_blocks': code_blocks,
        'plain_text': plain_text,
        'depth': len(rel_path.split(os.sep)) - 1,
    }


# ======================================================================
# Cache
# ======================================================================

def file_md5(filepath: Path) -> str:
    """Вычисляет MD5-хеш файла."""
    h = hashlib.md5()
    with open(filepath, 'rb') as f:
        for chunk in iter(lambda: f.read(65536), b''):
            h.update(chunk)
    return h.hexdigest()


def load_cache(cache_path: Path) -> dict:
    """Загружает кэш парсинга."""
    if cache_path.exists():
        try:
            return json.loads(cache_path.read_text(encoding='utf-8'))
        except (json.JSONDecodeError, OSError):
            pass
    return {}


def save_cache(cache_path: Path, cache: dict):
    """Сохраняет кэш парсинга."""
    cache_path.parent.mkdir(parents=True, exist_ok=True)
    cache_path.write_text(
        json.dumps(cache, ensure_ascii=False, indent=2),
        encoding='utf-8',
    )


def parse_with_cache(
    filepath: Path,
    docs_root: Path,
    cache: dict,
    no_cache: bool,
) -> dict | None:
    """Парсит файл, используя кэш если хеш совпадает."""
    rel_path = str(filepath.relative_to(docs_root))
    current_md5 = file_md5(filepath)

    if not no_cache and rel_path in cache:
        cached = cache[rel_path]
        if cached.get('md5') == current_md5:
            meta = cached.get('meta')
            if meta:
                return meta

    # Парсим
    meta = parse_md_file(filepath, docs_root)
    return meta


# ======================================================================
# Построение графа
# ======================================================================

def build_graph(files: list[dict], docs_root: Path, enable_tfidf: bool = True) -> nx.DiGraph:
    """Строит ориентированный граф документации."""
    G = nx.DiGraph()

    # Карта: путь -> индекс в files
    path_map = {}
    for i, f in enumerate(files):
        key = f['path'].lower()
        path_map[key] = i
        basename = os.path.basename(key)
        path_map[basename] = i
        stem = os.path.splitext(basename)[0]
        path_map[stem] = i

    for i, f in enumerate(files):
        G.add_node(i, **f)

    # Явные связи (markdown-ссылки)
    for i, f in enumerate(files):
        for link in f['links']:
            link = link.strip().lower()
            if not link.endswith('.md'):
                link += '.md'

            target = _resolve_link(link, path_map, files)
            if target is not None and target != i and not G.has_edge(i, target):
                G.add_edge(i, target, implicit=False)

    # Implicit edges: файлы в одной директории
    dir_groups = defaultdict(list)
    for i, f in enumerate(files):
        dir_name = os.path.dirname(f['path'])
        dir_groups[dir_name].append(i)

    for dir_name, members in dir_groups.items():
        if len(members) < 2:
            continue
        for i in range(len(members)):
            for j in range(i + 1, len(members)):
                a, b = members[i], members[j]
                if not G.has_edge(a, b) and not G.has_edge(b, a):
                    G.add_edge(a, b, weight=0.3, implicit=True)

    # Implicit edges: общие keywords в заголовках
    _add_keyword_edges(G, files)

    # Implicit edges: TF-IDF семантическая близость
    if enable_tfidf:
        _add_tfidf_edges(G, files, docs_root)

    return G


def _resolve_link(link: str, path_map: dict, files: list) -> int | None:
    """Пытается найти файл по ссылке разными способами."""
    target = path_map.get(link)

    if target is None:
        link_basename = os.path.basename(link)
        target = path_map.get(link_basename)

    if target is None:
        link_stem = os.path.splitext(link)[0]
        for j, fj in enumerate(files):
            fj_stem = os.path.splitext(os.path.basename(fj['path']))[0]
            if fj_stem.lower() == link_stem.lower():
                target = j
                break

    if target is None:
        link_clean = link.replace('\\', '/')
        for j, fj in enumerate(files):
            if fj['path'].lower() == link_clean:
                target = j
                break

    if target is None:
        link_parts = link.split('/')
        link_parts = [p for p in link_parts if p and p != '.' and p != '..']
        for j, fj in enumerate(files):
            fj_parts = fj['path'].lower().split('/')
            if len(fj_parts) >= len(link_parts) and fj_parts[-len(link_parts):] == link_parts:
                target = j
                break

    if target is None:
        link_filename = os.path.basename(link)
        for j, fj in enumerate(files):
            fj_filename = os.path.basename(fj['path'].lower())
            if fj_filename == link_filename:
                target = j
                break

    return target


def _add_keyword_edges(G: nx.DiGraph, files: list[dict]):
    """Добавляет рёбра между файлами с общими keywords в заголовках."""
    stop_words = {'the', 'a', 'an', 'in', 'on', 'at', 'to', 'for', 'of', 'and', 'or',
                  'is', 'are', 'was', 'were', 'this', 'that', 'with', 'from', 'by',
                  'как', 'для', 'и', 'в', 'на', 'с', 'по', 'из', 'у', 'от', 'к',
                  'это', 'что', 'при', 'все', 'его', 'ее', 'не', 'no', 'setup',
                  'guide', 'report', 'analysis', 'overview', 'index'}

    title_keywords = {}
    for i, f in enumerate(files):
        title = f['title'].lower()
        words = set(re.findall(r'[a-zа-яё0-9]+', title))
        words = words - stop_words
        words = {w for w in words if len(w) > 3}
        title_keywords[i] = words

    indices = list(range(len(files)))
    min_overlap = 2

    for i in range(len(indices)):
        for j in range(i + 1, len(indices)):
            a, b = indices[i], indices[j]
            overlap = title_keywords[a] & title_keywords[b]
            if len(overlap) >= min_overlap:
                if not G.has_edge(a, b) and not G.has_edge(b, a):
                    G.add_edge(a, b, weight=0.2, implicit=True)


def _add_tfidf_edges(G: nx.DiGraph, files: list[dict], docs_root: Path):
    """Добавляет рёбра на основе TF-IDF косинусной близости текстов."""
    try:
        from sklearn.feature_extraction.text import TfidfVectorizer
        from sklearn.metrics.pairwise import cosine_similarity
    except ImportError:
        print('  Note: scikit-learn not installed. TF-IDF edges disabled.')
        print('  Install: pip install scikit-learn')
        return

    # Собираем тексты (без кода)
    texts = []
    valid_indices = []
    for i, f in enumerate(files):
        text = f.get('plain_text', '')
        # Используем и заголовок (с весом)
        title_text = f['title'].lower() + ' ' + f['title'].lower()
        combined = title_text + ' ' + text
        if len(combined.split()) > 5:  # минимум 5 слов
            texts.append(combined)
            valid_indices.append(i)

    if len(texts) < 2:
        return

    # TF-IDF + косинусная близость
    vectorizer = TfidfVectorizer(
        max_features=500,
        stop_words=['the', 'a', 'an', 'in', 'on', 'at', 'to', 'for', 'of', 'and', 'or',
                     'is', 'are', 'was', 'were', 'this', 'that', 'with', 'from', 'by',
                     'как', 'для', 'и', 'в', 'на', 'с', 'по', 'из', 'у', 'от', 'к',
                     'это', 'что', 'при', 'все', 'его', 'ее', 'не', 'no'],
        ngram_range=(1, 2),
        sublinear_tf=True,
    )

    try:
        tfidf_matrix = vectorizer.fit_transform(texts)
        similarities = cosine_similarity(tfidf_matrix)
    except Exception as e:
        print(f'  Warning: TF-IDF failed: {e}')
        return

    # Добавляем рёбра для пар с высокой близостью
    edge_count = 0
    for i in range(len(valid_indices)):
        for j in range(i + 1, len(valid_indices)):
            sim = similarities[i, j]
            a, b = valid_indices[i], valid_indices[j]

            # Адаптивный порог: для коротких документов снижаем
            avg_words = (len(files[a].get('plain_text', '').split()) +
                         len(files[b].get('plain_text', '').split())) / 2
            threshold = TFIDF_THRESHOLD if avg_words > 50 else TFIDF_MIN_OVERLAP

            if sim >= threshold:
                if not G.has_edge(a, b) and not G.has_edge(b, a):
                    G.add_edge(a, b, weight=round(sim, 3), implicit=True)
                    edge_count += 1

    if edge_count > 0:
        print(f'  TF-IDF edges added: {edge_count}')


# ======================================================================
# Генерация вывода
# ======================================================================

def generate_html(G: nx.DiGraph, output_path: Path, template_dir: Path) -> str:
    """Генерирует HTML-файл с D3.js графом."""
    nodes, links, stats, categories = _prepare_graph_data(G)

    graph_data = {
        'nodes': nodes,
        'links': links,
        'stats': stats,
        'categories': categories,
        'colors': {cat: color for cat, color in CATEGORY_COLORS.items()},
        'icons': CATEGORY_ICONS,
    }

    env = Environment(loader=FileSystemLoader(str(template_dir)))
    template = env.get_template('graph_template.html')

    html = template.render(
        graph_data=json.dumps(graph_data, ensure_ascii=False, indent=2),
        title='PROLOGY Documentation Graph',
    )

    output_path.write_text(html, encoding='utf-8')
    print(f'  → HTML graph generated: {output_path}')
    print(f'    Nodes: {stats["total_nodes"]}, Edges: {stats["total_edges"]} '
          f'(explicit: {stats["explicit_edges"]}, implicit: {stats["implicit_edges"]})')
    print(f'    Density: {stats["density"]}, Avg degree: {stats["avg_degree"]}')

    return html


def generate_json(G: nx.DiGraph, output_path: Path):
    """Экспортирует граф в JSON."""
    nodes, links, stats, categories = _prepare_graph_data(G)

    graph_data = {
        'nodes': nodes,
        'links': links,
        'stats': stats,
        'categories': categories,
        'colors': CATEGORY_COLORS,
    }

    output_path.write_text(
        json.dumps(graph_data, ensure_ascii=False, indent=2),
        encoding='utf-8',
    )
    print(f'  → JSON exported: {output_path}')
    print(f'    Nodes: {len(nodes)}, Edges: {len(links)}')


def generate_graphml(G: nx.DiGraph, output_path: Path):
    """Экспортирует граф в GraphML XML."""
    # Добавляем атрибуты узлов как строки для GraphML
    H = nx.DiGraph()
    for node_id in G.nodes():
        attrs = G.nodes[node_id]
        H.add_node(
            str(node_id),
            label=attrs['title'],
            path=attrs['path'],
            category=attrs['category'],
            word_count=str(attrs['word_count']),
            depth=str(attrs['depth']),
            degree=str(G.degree(node_id)),
        )

    for src, dst, data in G.edges(data=True):
        label = 'explicit' if not data.get('implicit') else 'implicit'
        H.add_edge(str(src), str(dst), type=label, weight=str(data.get('weight', 1)))

    nx.write_graphml(H, str(output_path), encoding='utf-8')
    print(f'  → GraphML exported: {output_path}')
    print(f'    Nodes: {H.number_of_nodes()}, Edges: {H.number_of_edges()}')


def _prepare_graph_data(G: nx.DiGraph) -> tuple:
    """Подготавливает общие данные nodes/links/stats/categories."""
    nodes = []
    for node_id in G.nodes():
        attrs = G.nodes[node_id]
        # Определяем группу директории для коллапса
        parts = attrs['path'].split('/')
        dir_group = parts[0] if len(parts) > 1 else '_root'
        nodes.append({
            'id': node_id,
            'path': attrs['path'],
            'title': attrs['title'],
            'category': attrs['category'],
            'word_count': attrs['word_count'],
            'depth': attrs['depth'],
            'headings': attrs['headings'],
            'code_blocks': attrs['code_blocks'],
            'links_out': len(attrs['links']),
            'degree': G.degree(node_id),
            'in_degree': G.in_degree(node_id),
            'out_degree': G.out_degree(node_id),
            'dir_group': dir_group,
        })

    links = []
    for src, dst, data in G.edges(data=True):
        links.append({
            'source': src,
            'target': dst,
            'implicit': data.get('implicit', False),
            'weight': data.get('weight', 1),
        })

    explicit_edges = sum(
        1 for _, _, d in G.edges(data=True) if not d.get('implicit', False)
    )
    implicit_edges = G.number_of_edges() - explicit_edges

    max_depth = max((n['depth'] for n in nodes), default=0)

    stats = {
        'total_nodes': G.number_of_nodes(),
        'total_edges': G.number_of_edges(),
        'explicit_edges': explicit_edges,
        'implicit_edges': implicit_edges,
        'density': round(nx.density(G), 4),
        'avg_degree': round(sum(dict(G.degree()).values()) / max(G.number_of_nodes(), 1), 2),
        'avg_in_degree': round(sum(d for _, d in G.in_degree()) / max(G.number_of_nodes(), 1), 2),
        'avg_out_degree': round(sum(d for _, d in G.out_degree()) / max(G.number_of_nodes(), 1), 2),
        'category_counts': dict(Counter(n['category'] for n in nodes)),
        'max_depth': max_depth,
        'depth_distribution': dict(Counter(n['depth'] for n in nodes)),
        'dir_groups': dict(Counter(n['dir_group'] for n in nodes)),
    }

    categories = {}
    for cat, color in CATEGORY_COLORS.items():
        count = stats['category_counts'].get(cat, 0)
        if count > 0:
            categories[cat] = {
                'color': color,
                'icon': CATEGORY_ICONS.get(cat, '📄'),
                'count': count,
            }

    return nodes, links, stats, categories


# ======================================================================
# Main
# ======================================================================

def main():
    parser = argparse.ArgumentParser(
        description='PROLOGY Documentation Graph Generator'
    )
    parser.add_argument(
        '--docs-dir', default='docs',
        help='Path to docs directory (default: docs)',
    )
    parser.add_argument(
        '--output', default='docs/graph.html',
        help='Output file path (default: docs/graph.html)',
    )
    parser.add_argument(
        '--template-dir', default=None,
        help='Template directory (default: tools/templates)',
    )
    parser.add_argument(
        '--format', dest='output_format', default='html',
        choices=['html', 'json', 'graphml'],
        help='Output format (default: html)',
    )
    parser.add_argument(
        '--no-cache', action='store_true',
        help='Force re-parse all files, ignore cache',
    )
    parser.add_argument(
        '--no-tfidf', action='store_true',
        help='Disable TF-IDF semantic edges',
    )
    parser.add_argument(
        '--workers', type=int, default=None,
        help='Number of parallel parser workers (default: CPU count)',
    )
    args = parser.parse_args()

    script_dir = Path(__file__).resolve().parent
    project_root = script_dir.parent

    docs_dir = (project_root / args.docs_dir).resolve()
    if not docs_dir.is_dir():
        print(f'Error: docs directory not found: {docs_dir}')
        sys.exit(1)

    output_path = (project_root / args.output).resolve()
    template_dir = Path(args.template_dir) if args.template_dir else (script_dir / 'templates')
    cache_path = project_root / CACHE_FILE

    print(f'Scanning: {docs_dir}')
    print(f'Output:   {output_path}')
    print(f'Format:   {args.output_format}')
    print(f'Cache:    {"disabled" if args.no_cache else str(cache_path)}')
    print(f'TF-IDF:   {"disabled" if args.no_tfidf else "enabled"}')
    print()

    # Сканируем .md файлы
    md_files = sorted(docs_dir.rglob('*.md'))
    md_files = [f for f in md_files if 'node_modules' not in str(f) and '.git' not in str(f)]

    if not md_files:
        print('No .md files found!')
        sys.exit(1)

    print(f'Found {len(md_files)} .md files')
    print()

    # Загрузка кэша
    cache = {} if args.no_cache else load_cache(cache_path)
    cache_changed = False

    # Параллельный парсинг
    workers = args.workers or min(os.cpu_count() or 4, 8)
    print(f'Parsing with {workers} workers...')

    parse_start = time.time()

    # Сначала собираем все хеши
    file_hashes = {}
    for f in md_files:
        rel_path = str(f.relative_to(docs_dir))
        if not args.no_cache and rel_path in cache:
            cached = cache[rel_path]
            current_md5 = file_md5(f)
            file_hashes[rel_path] = current_md5
            if cached.get('md5') == current_md5 and cached.get('meta'):
                continue  # skip, use cache
        file_hashes[rel_path] = None  # will be parsed

    files_to_parse = [
        f for f in md_files
        if file_hashes.get(str(f.relative_to(docs_dir))) is None
    ]

    # Парсим только изменившиеся файлы
    files = []
    parsed_meta = {}

    if files_to_parse:
        print(f'  Files to (re)parse: {len(files_to_parse)}')
        with ThreadPoolExecutor(max_workers=workers) as executor:
            future_map = {
                executor.submit(parse_md_file, f, docs_dir): f
                for f in files_to_parse
            }
            for future in as_completed(future_map):
                fpath = future_map[future]
                rel_path = str(fpath.relative_to(docs_dir))
                try:
                    meta = future.result()
                    parsed_meta[rel_path] = meta
                except Exception as e:
                    print(f'  Warning: failed to parse {rel_path}: {e}')

    # Собираем все метаданные (кэш + новое)
    for f in md_files:
        rel_path = str(f.relative_to(docs_dir))
        if rel_path in parsed_meta:
            files.append(parsed_meta[rel_path])
            # Обновляем кэш
            cache[rel_path] = {
                'md5': file_hashes.get(rel_path) or file_md5(f),
                'meta': parsed_meta[rel_path],
            }
            cache_changed = True
        elif not args.no_cache and rel_path in cache:
            cached_meta = cache[rel_path].get('meta')
            if cached_meta:
                files.append(cached_meta)

    parse_elapsed = time.time() - parse_start
    print(f'  Parsed {len(files)} files in {parse_elapsed:.1f}s')

    # Сохраняем кэш
    if cache_changed:
        save_cache(cache_path, cache)
        print(f'  Cache saved: {len(cache)} entries')

    print()

    # Строим граф
    build_start = time.time()
    G = build_graph(files, docs_dir, enable_tfidf=not args.no_tfidf)
    build_elapsed = time.time() - build_start
    print(f'Graph built: {G.number_of_nodes()} nodes, {G.number_of_edges()} edges')
    print(f'  in {build_elapsed:.2f}s')
    print()

    # Генерация вывода
    if args.output_format == 'json':
        generate_json(G, output_path)
    elif args.output_format == 'graphml':
        generate_graphml(G, output_path)
    else:
        generate_html(G, output_path, template_dir)

    print()
    print(f'Done! Total time: {time.time() - parse_start + build_elapsed:.1f}s')
    if args.output_format == 'html':
        print(f'Open: file://{output_path}')


if __name__ == '__main__':
    main()
