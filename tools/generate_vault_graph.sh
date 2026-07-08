#!/usr/bin/env bash
# ======================================================================
# Generate documentation graph for Obsidian vault/
# ======================================================================
set -e

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"
VAULT_DIR="$PROJECT_ROOT/vault"

# Python
if [ -f "$SCRIPT_DIR/.venv/bin/python3" ]; then
    PYTHON="$SCRIPT_DIR/.venv/bin/python3"
else
    PYTHON="python3"
fi

echo "📊 Generating graph for Obsidian vault..."
echo "  Source: $VAULT_DIR"
echo "  Output: $VAULT_DIR/graph.html"

# Сканируем vault
$PYTHON "$SCRIPT_DIR/graph_generator.py" \
    --docs-dir "$VAULT_DIR" \
    --output "$VAULT_DIR/graph.html" \
    --no-tfidf

# Создаём Obsidian-заметку для встраивания графа
NOTE_PATH="$VAULT_DIR/📊 Graph.md"
cat > "$NOTE_PATH" << 'NOTE'
---
title: "📊 Dependency Graph"
tags: [graph, visualization, index]
cssclass: graph-embed
---

# 📊 Dependency Graph

## Интерактивный граф документации

```html
<iframe src="graph.html" width="100%" height="600px" style="border:none;border-radius:8px;"></iframe>
```

### Управление
| Действие | Клавиша/клик |
|----------|-------------|
| Панорамирование | Drag по фону |
| Зум | Колесо мыши |
| Инфо об узле | Клик на узле |
| Изоляция узла | Double-click |
| Кратчайший путь | Ctrl+Click → Ctrl+Click |
| Смена темы | Кнопка 🌓 или клавиша T |
| Фильтры | Кнопка ⚙ |
| Экспорт PNG | Кнопка ⬇ или Ctrl+E |
| Сброс | Esc или кнопка ⟲ |

### Связанные файлы
- `graph.html` — сам граф
- `graph.json` — данные графа (для Dataview/API)
- `graph.graphml` — граф в формате GraphML

> [!info] Авто-обновление
> Граф регенерируется через `make graph-vault`.
NOTE

echo "  Obsidian note: $NOTE_PATH"
echo ""
echo "✅ Done! Open vault/graph.html in browser or embed in Obsidian."
echo "   Or run: make graph-vault"
