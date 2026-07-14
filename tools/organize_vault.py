#!/usr/bin/env python3
"""Организация vault: распределение .md файлов по категориям + дедупликация"""

import shutil
import re
import os
from pathlib import Path
from collections import defaultdict

VAULT = Path('vault')
DRY_RUN = False  # set True to preview without moving


def read_frontmatter_tags(content):
    """Извлекает теги из frontmatter."""
    m = re.match(r'^---\s*\n(.*?)\n---', content, re.DOTALL)
    if not m:
        return []
    tags = re.findall(r'tags:\s*\[([^\]]*)\]', m.group(1))
    if tags:
        return [t.strip() for t in tags[0].split(',')]
    tags = re.findall(r'tags:\s*\[?([^\]]+?)\]?', m.group(1))
    if tags:
        return [t.strip() for t in tags[0].split(',')]
    return []


def categorize_file(filepath):
    """Определяет категорию для файла на основе пути и тегов."""
    path_str = str(filepath.as_posix())
    name = filepath.stem.lower()
    rel = str(filepath.relative_to(VAULT)).lower()

    try:
        content = filepath.read_text(encoding='utf-8', errors='ignore')
    except Exception:
        content = ''
    tags = [t.lower() for t in read_frontmatter_tags(content)]

    # 01-Protocol
    protocol_keywords = ['protocol', 'rcsp', 'spec']
    if any(k in name for k in ['protocol', 'rcsp']):
        if 'analysis' not in name and 'analysis' not in rel:
            return '01-Protocol'
    if 'spec' in name and 'reverse' in name:
        return '01-Protocol'
    if 'specs' in rel:
        return '01-Protocol'

    # 02-Analysis
    analysis_keywords = ['analysis', 'report', 'decompilation', 'hci_analysis',
                         'reverse', 'frida', 'crc', 'apk_analysis', 'dynamic']
    if any(k in name for k in analysis_keywords):
        return '02-Analysis'
    if 'cache_reports' in rel:
        return '02-Analysis'
    if 'prology_analysis' in rel:
        return '02-Analysis'
    if name.startswith('crc_'):
        return '02-Analysis'
    # toolkit docs that are clearly analysis
    if 'toolkit_analysis' in rel and any(k in name for k in
           ['cheatsheet', 'index', 'quick_reference', 'troubleshooting',
            'frida', 'android_emulator']):
        return '02-Analysis'

    # 04-Guides
    guide_keywords = ['guide', 'dsp', 'howto', 'setup', 'termux', 'readme']
    if any(k in name for k in guide_keywords):
        if 'toolkit_analysis' in rel and 'toolkit' not in name:
            return '04-Guides'
    if 'dsp' in name:
        return '04-Guides'
    if name.startswith('readme_dsp'):
        return '04-Guides'

    # 03-Toolkit
    toolkit_keywords = ['toolkit', 'command', 'ble_reverse', 'esp32',
                        'instrumentation', 'peripheral', 'emulator']
    if any(k in name for k in toolkit_keywords):
        return '03-Toolkit'
    if 'esp32' in rel:
        return '03-Toolkit'
    if 'cmd300' in rel:
        return '03-Toolkit'
    if 'toolkit_analysis' in rel and name == 'readme':
        return '03-Toolkit'
    if 'flutter_linux' in rel:
        return '03-Toolkit'
    if 'agents.md' in name:
        return '03-Toolkit'

    # 00-Inbox — всё неопределённое
    return '00-Inbox'


def resolve_duplicates(files_by_stem):
    """Возвращает маппинг: {Path: target_folder} с разрешением дубликатов."""
    mapping = {}

    for stem, files in files_by_stem.items():
        if len(files) == 1:
            f = files[0]
            cat = categorize_file(f)
            mapping[f] = cat
        else:
            # Дубликаты — сортируем по длине пути (самый короткий = основной)
            files_sorted = sorted(files, key=lambda p: len(str(p)))
            primary = files_sorted[0]

            # Основной идёт в категорию
            cat = categorize_file(primary)
            mapping[primary] = cat

            # Остальные — в 99-Archive с переименованием
            for dup in files_sorted[1:]:
                dup_name = dup.stem
                # Определяем контекст из пути
                parts = dup.relative_to(VAULT).parts
                context = '_'.join(p for p in parts[:-1] if p not in
                                   ['toolkit_analysis', 'docs', 'cache_reports', 'specs'])
                if context:
                    new_stem = f"{dup_name}_from_{context}"
                else:
                    new_stem = f"{dup_name}_dup"
                mapping[dup] = ('99-Archive', new_stem)

    return mapping


def update_wiki_links(filepath, old_stem, new_stem):
    """Обновляет wiki-ссылки в файле при переименовании стема."""
    try:
        content = filepath.read_text(encoding='utf-8', errors='ignore')
        # Заменяем [[old_stem]] на [[new_stem]] и [[old_stem|text]] на [[new_stem|text]]
        updated = re.sub(
            rf'\[\[{re.escape(old_stem)}(\||\]\])',
            lambda m: f'[[{new_stem}{m.group(1)}',
            content
        )
        if updated != content:
            filepath.write_text(updated, encoding='utf-8')
            return True
    except Exception:
        pass
    return False


def main():
    # Собираем все .md файлы (кроме 99-Templates и .obsidian)
    md_files = []
    for f in VAULT.rglob('*.md'):
        rel = f.relative_to(VAULT).as_posix()
        if rel.startswith('99-Templates/') or rel.startswith('.obsidian/') or \
           rel.startswith('00-Inbox/') or rel.startswith('01-Protocol/') or \
           rel.startswith('02-Analysis/') or rel.startswith('03-Toolkit/') or \
           rel.startswith('04-Guides/') or rel.startswith('05-Scripts/') or \
           rel.startswith('99-Archive/') or rel.startswith('99-Assets/'):
            continue
        md_files.append(f)

    print(f"📂 Найдено {len(md_files)} файлов для организации")

    # Группируем по стему
    files_by_stem = defaultdict(list)
    for f in md_files:
        files_by_stem[f.stem].append(f)

    duplicates = {k: v for k, v in files_by_stem.items() if len(v) > 1}
    if duplicates:
        print(f"\n⚠️  Дубликаты ({len(duplicates)} имён):")
        for stem, files in sorted(duplicates.items()):
            print(f"   {stem}:")
            for f in files:
                print(f"     - {f.relative_to(VAULT)}")

    # Получаем маппинг
    mapping = resolve_duplicates(files_by_stem)

    # Собираем rename-действия для дубликатов
    renames = {}

    print("\n📋 План перемещения:")
    for f, target in sorted(mapping.items(), key=lambda x: str(x[0])):
        if isinstance(target, tuple):
            folder, new_stem = target
            new_path = VAULT / folder / f"{new_stem}.md"
            renames[f.stem] = (f.stem, new_stem)
        else:
            folder = target
            new_path = VAULT / folder / f.name

        rel_old = f.relative_to(VAULT)
        rel_new = new_path.relative_to(VAULT)
        if rel_old != rel_new:
            print(f"   {rel_old} → {rel_new}")

    if DRY_RUN:
        print("\n🔍 DRY RUN — ничего не перемещено")
        return

    # Выполняем перемещение
    print("\n🚚 Перемещение файлов...")
    moved = 0
    for f, target in mapping.items():
        if isinstance(target, tuple):
            folder, new_stem = target
            new_path = VAULT / folder / f"{new_stem}.md"
        else:
            folder = target
            new_path = VAULT / folder / f.name

        rel_old = f.relative_to(VAULT)
        rel_new = new_path.relative_to(VAULT)
        if rel_old == rel_new:
            continue

        new_path.parent.mkdir(parents=True, exist_ok=True)
        shutil.move(str(f), str(new_path))
        moved += 1

    print(f"   Перемещено: {moved}")

    # Обновляем wiki-ссылки в перемещённых/переименованных файлах
    if renames:
        print("\n🔗 Обновление wiki-ссылок...")
        link_updates = 0
        for md_file in VAULT.rglob('*.md'):
            if '99-Templates' in str(md_file) or '.obsidian' in str(md_file):
                continue
            for old_stem, (_, new_stem) in renames.items():
                if update_wiki_links(md_file, old_stem, new_stem):
                    link_updates += 1
        print(f"   Обновлено ссылок в {link_updates} файлах")

    # Удаляем пустые папки
    print("\n🧹 Очистка пустых папок...")
    deleted_dirs = 0
    for dirpath, dirnames, filenames in os.walk(str(VAULT), topdown=False):
        path = Path(dirpath)
        if path == VAULT:
            continue
        if any(part.startswith('.obsidian') for part in path.parts):
            continue
        if not any(path.iterdir()):
            path.rmdir()
            deleted_dirs += 1
    print(f"   Удалено пустых папок: {deleted_dirs}")

    # Итог
    print(f"\n✅ Готово! Файлы распределены по категориям.")


if __name__ == '__main__':
    main()
