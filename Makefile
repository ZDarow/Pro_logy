# PROLOGY Project Makefile
# ========================

# Python (используем .venv в tools/ если есть)
PYTHON := $(shell [ -f tools/.venv/bin/python3 ] && echo "tools/.venv/bin/python3" || echo "python3")

# Директории
DOCS_DIR  := docs
TOOLS_DIR := tools
OUTPUT    := $(DOCS_DIR)/graph.html
GEN       := $(PYTHON) $(TOOLS_DIR)/graph_generator.py

# Флаги генератора (можно переопределить)
FLAGS    :=

# ======================================================================
# DOCUMENTATION GRAPH
# ======================================================================

.PHONY: graph open watch clean stats json graphml fresh install-all help

## Сгенерировать интерактивный граф документации (HTML)
graph:
	@echo "Generating documentation graph..."
	@$(GEN) --docs-dir $(DOCS_DIR) --output $(OUTPUT) $(FLAGS)
	@echo ""
	@echo "Graph: $(OUTPUT)"

## Сгенерировать граф из Obsidian vault/
graph-vault:
	@echo "Generating graph from Obsidian vault..."
	@$(GEN) --docs-dir vault --output vault/graph.html --no-tfidf $(FLAGS)
	@echo ""
	@echo "Graph: vault/graph.html"

## Сгенерировать JSON-дамп графа
json:
	@$(GEN) --docs-dir $(DOCS_DIR) --output $(DOCS_DIR)/graph.json --format json $(FLAGS)

## Сгенерировать GraphML-файл графа
graphml:
	@$(GEN) --docs-dir $(DOCS_DIR) --output $(DOCS_DIR)/graph.graphml --format graphml $(FLAGS)

## Сгенерировать HTML граф с полным перепарсингом (без кэша)
fresh:
	@$(GEN) --docs-dir $(DOCS_DIR) --output $(OUTPUT) --no-cache $(FLAGS)

## Сгенерировать и открыть в браузере
open: graph
	@echo "Opening in browser..."
	@if command -v xdg-open > /dev/null 2>&1; then \
		xdg-open $(OUTPUT); \
	elif command -v open > /dev/null 2>&1; then \
		open $(OUTPUT); \
	elif command -v sensible-browser > /dev/null 2>&1; then \
		sensible-browser $(OUTPUT); \
	else \
		echo "Open $(OUTPUT) manually in your browser."; \
	fi

## Автоматическая перегенерация при изменениях в docs/
watch:
	@$(PYTHON) $(TOOLS_DIR)/watch_graph.py \
		--docs-dir $(DOCS_DIR) \
		--output $(OUTPUT)

## Удалить сгенерированные файлы
clean:
	@rm -f $(OUTPUT) $(DOCS_DIR)/graph.json $(DOCS_DIR)/graph.graphml vault/graph.html
	@echo "Removed generated graph files"

## Установить pre-commit hook
install-hooks:
	@cp tools/githooks/pre-commit .git/hooks/pre-commit
	@chmod +x .git/hooks/pre-commit
	@echo "Pre-commit hook installed"

## Полная установка: venv + deps + hooks + генерация
install-all:
	@echo "=== Installing PROLOGY Graph Tools ==="
	@echo ""
	@echo "1. Creating Python virtual environment..."
	@python3 -m venv tools/.venv
	@echo ""
	@echo "2. Installing dependencies..."
	@tools/.venv/bin/pip3 install -q networkx markdown beautifulsoup4 jinja2 watchdog scikit-learn
	@echo "   Dependencies installed"
	@echo ""
	@echo "3. Installing git hooks..."
	@$(MAKE) install-hooks
	@echo ""
	@echo "4. Generating documentation graph (docs/)..."
	@$(MAKE) graph
	@echo ""
	@echo "5. Generating vault graph..."
	@$(MAKE) graph-vault
	@echo ""
	@echo "=== Installation complete ==="
	@echo "Run 'make help' for available commands."

## Показать статистику по .md файлам в docs/
stats:
	@echo "=== Documentation Statistics ==="
	@echo "Total .md files: $$(find $(DOCS_DIR) -name '*.md' -not -path '*/node_modules/*' | wc -l)"
	@echo "Total size: $$(du -sh $(DOCS_DIR) 2>/dev/null | cut -f1)"
	@echo ""
	@echo "=== Top 10 largest files ==="
	@find $(DOCS_DIR) -name '*.md' -not -path '*/node_modules/*' -exec wc -w {} + | sort -rn | head -10

## Очистить кэш парсинга
clean-cache:
	@rm -f $(TOOLS_DIR)/.graph_cache.json
	@echo "Cache cleared"

## Помощь
help:
	@echo "PROLOGY Documentation Graph Tools"
	@echo "================================="
	@echo ""
	@echo "Usage: make <target> [FLAGS=...]"
	@echo ""
	@echo "Targets:"
	@echo "  graph        Generate interactive graph (HTML, from docs/)"
	@echo "  graph-vault  Generate graph from Obsidian vault/"
	@echo "  json         Export graph as JSON"
	@echo "  graphml      Export graph as GraphML XML"
	@echo "  fresh        Regenerate from scratch (ignore cache)"
	@echo "  open         Generate and open in browser"
	@echo "  watch        Auto-regenerate on changes in docs/"
	@echo "  clean        Remove generated graph files"
	@echo "  clean-cache  Remove parse cache"
	@echo "  install-hooks Install git pre-commit hook"
	@echo "  install-all  Full setup: venv + deps + hooks + graph"
	@echo "  stats        Show documentation statistics"
	@echo "  help         Show this help"
	@echo ""
	@echo "Flags:"
	@echo "  FLAGS=--no-tfidf    Disable TF-IDF semantic edges"
	@echo "  FLAGS=--no-cache    Force re-parse all files"
	@echo "  FLAGS=--workers=4   Set parser workers"
