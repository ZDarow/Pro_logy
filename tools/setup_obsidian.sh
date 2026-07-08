#!/bin/bash
set -e

echo "🟣 Setting up Obsidian vault for Pro_logy..."

VAULT_DIR="vault"

# 1. Создаём структуру
mkdir -p "$VAULT_DIR"/{00-Inbox,01-Protocol,02-Analysis,03-Toolkit,04-Guides,05-Scripts,99-Archive,99-Templates,99-Assets,.obsidian}

# 2. Копируем документацию
cp -r docs/* "$VAULT_DIR"/ 2>/dev/null || true
cp -r specs/* "$VAULT_DIR"/ 2>/dev/null || true

# 3. Конвертируем в Obsidian формат (wiki-links + frontmatter)
python3 tools/convert_to_obsidian.py

# 4. Распределяем по категориям
python3 tools/organize_vault.py

# 5. Копируем .obsidian конфиги
cp vault/.obsidian/app.json vault/.obsidian/app.json 2>/dev/null || true

echo "✅ Vault готов!"
echo "📂 Откройте в Obsidian: $(pwd)/$VAULT_DIR"
echo ""
echo "📊 Рекомендуемые плагины (установить вручную):"
echo "   - Dataview (blacksmithgu/obsidian-dataview)"
echo "   - Excalidraw (zsviczian/obsidian-excalidraw-plugin)"
echo "   - Obsidian Charts"
echo "   - Tag Wrangler"
echo "   - Templater"
