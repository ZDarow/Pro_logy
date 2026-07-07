# 🧠 AI Knowledge Backup — Инструкция по Использованию

## 📍 Расположение Файлов

```
/data/data/com.termux/files/home/
├── ai-knowledge-backup.md      # Полный бекап знаний (515 строк)
└── load-knowledge-backup.sh    # Скрипт загрузки
```

---

## 🚀 Быстрый Старт

### Для Нового Агента

**Шаг 1:** Запустить загрузчик
```bash
./load-knowledge-backup.sh
```

**Шаг 2:** В диалоге с агентом указать:
```
Загрузи знания из ai-knowledge-backup.md
```

Или конкретный паттерн:
```
Примени Pattern #5 (Compound Loop) для этой задачи
```

---

## 📋 3 Способа Загрузки

### Способ 1: Автоматическая (MCP)
Если агент поддерживает MCP (Model Context Protocol):

```python
# Learnings автоматически инжектятся через:
kit_get_learnings(query="все навыки", limit=50)
```

**Действия:** Никаких — знания загружаются автоматически.

---

### Способ 2: Ручная (Чтение Файла)

```bash
# Полный файл
cat ~/ai-knowledge-backup.md

# Конкретная секция
sed -n '/## 🔄 WORKFLOW PATTERNS/,/## 👥 AGENT PATTERNS/p' ~/ai-knowledge-backup.md

# Конкретный паттерн
grep -A 15 "### Pattern #5" ~/ai-knowledge-backup.md
```

---

### Способ 3: Контекстная (В Диалоге)

**Примеры запросов:**

```
📌 Общие:
- "Используй знания из ai-knowledge-backup.md"
- "Примени изученные паттерны из qwen-examples и claude-skills"
- "Загрузи контекст из бекапа знаний"

📌 Конкретные:
- "Примени Pattern #5 (Compound Loop): /explore → /plan → /work → /review → /compound"
- "Используй Fullstack Guardian 3-perspective approach"
- "Следуй Debugging Wizard workflow: Reproduce → Isolate → Hypothesize → Fix → Prevent"
- "Сделай Session Resume по Pattern #10"

📌 По категориям:
- "Покажи все Architecture patterns (#1-4)"
- "Какие есть Workflow patterns?"
- "Дай список Agent patterns"
```

---

## 🎯 Сценарии Использования

### Сценарий 1: Новая Сессия Разработки

```bash
# 1. Проверка состояния
./load-knowledge-backup.sh

# 2. В диалоге:
"Загрузи Session Resume pattern (#10) и проверь активные todos"
```

---

### Сценарий 2: Создание Нового Навыка

```bash
# 1. Загрузить паттерны структуры
grep -A 20 "### Pattern #2" ~/ai-knowledge-backup.md

# 2. В диалоге:
"Создай новый навык по структуре из Pattern #2 (Claude Skills Structure)"
```

---

### Сценарий 3: Code Review

```bash
# 1. Загрузить паттерн review
grep -A 10 "### Pattern #9" ~/ai-knowledge-backup.md

# 2. В диалоге:
"Проведи code review используя Pattern #9 (5-pass review: Security→Performance→Architecture→Data→Simplicity)"
```

---

### Сценарий 4: Отладка Багов

```bash
# 1. Загрузить debugging workflow
grep -A 15 "### Pattern #7" ~/ai-knowledge-backup.md

# 2. В диалоге:
"Найди баг используя Pattern #7 (Debugging Wizard: Reproduce→Isolate→Hypothesize→Fix→Prevent)"
```

---

### Сценарий 5: Планирование Фичи

```bash
# 1. Загрузить planning patterns
grep -A 10 "### Pattern #11" ~/ai-knowledge-backup.md

# 2. В диалоге:
"Спланируй фичу используя Pattern #11 (Multi-Order Thinking: 1st→2nd→3rd→4th order)"
```

---

## 📊 Карта Паттернов

| Категория | Паттерны | Когда Использовать |
|-----------|----------|-------------------|
| 🏗️ Architecture | #1-4 | Создание навыков, структура проекта |
| 🔄 Workflows | #5-12 | Разработка, review, планирование |
| 👥 Agents | #13-15 | Multi-agent координация |
| 🛠️ Technical | #16-19 | UI, генерация, SDK |
| 🔐 Security | #20 | Fullstack с безопасностью |
| 📝 Documentation | #21-22 | Документирование навыков |

---

## 🔍 Поиск Паттернов

### По Номеру
```bash
grep -A 20 "### Pattern #5" ~/ai-knowledge-backup.md
```

### По Названию
```bash
grep -A 20 "Compound Loop" ~/ai-knowledge-backup.md
```

### По Категории
```bash
sed -n '/## 🔄 WORKFLOW PATTERNS/,/## 👥 AGENT PATTERNS/p' ~/ai-knowledge-backup.md
```

### По Ключевым Словам
```bash
grep -i "workflow" ~/ai-knowledge-backup.md | head -10
```

---

## 💡 Лучшие Практики

### ✅ DO (Делай)

1. **Всегда загружай контекст** в начале новой сессии
2. **Ссылайся на конкретные паттерны** по номеру или названию
3. **Применяй Compound Loop** для каждой фичи
4. **Читай Critical Patterns** перед coding
5. **Документируй решения** через /compound

### ❌ DON'T (Не делай)

1. **Не начинай coding** без загрузки контекста
2. **Не игнорируй Session Resume** после перерыва
3. **Не пропускай review** (особенно Security pass)
4. **Не создавай велосипеды** — сначала search в Knowledge Base
5. **Не оставляй todos** без atomic state transitions

---

## 📈 Статистика Бекапа

```
Файл: ai-knowledge-backup.md
Размер: 515 строк
Паттерны: 22 (20 patterns + 2 preferences)
Проекты: 3 (qwen-examples, claude-skills, gemini-kit)
Категории: 6 (Architecture, Workflows, Agents, Technical, Security, Documentation)
```

---

## 🔄 Обновление Бекапа

Для добавления новых знаний:

1. **Сохранить новое знание:**
   ```python
   kit_save_learning(category="pattern", lesson="...")
   ```

2. **Обновить бекап:**
   ```bash
   # Запустить скрипт обновления (если есть)
   ./scripts/update-knowledge-backup.sh
   ```

3. **Или вручную:**
   - Открыть `ai-knowledge-backup.md`
   - Добавить новый паттерн в соответствующую секцию
   - Обновить статистику

---

## 🎓 Примеры Использования

### Пример 1: Fullstack Разработка

```
User: "Создай API endpoint с frontend формой"

Agent (с загруженными знаниями):
"Применяю Pattern #20 (Fullstack Guardian 3-perspective):

1. Backend: API endpoint с parameterized queries
2. Frontend: Форма с client-side validation
3. Security: Auth, authz, input validation, output encoding

Следую Pattern #5 (Compound Loop):
/explore → /plan → /work → /review → /compound"
```

---

### Пример 2: Debugging

```
User: "Приложение падает с ошибкой"

Agent (с загруженными знаниями):
"Применяю Pattern #7 (Debugging Wizard):

1. Reproduce: Устанавливаю стабильное воспроизведение
2. Isolate: Нахожу минимальный failing case
3. Hypothesize and test: Проверяю по одной гипотезе
4. Fix: Реализую и проверяю решение
5. Prevent: Добавляю regression test

MUST NOT: multiple changes at once, guess without testing"
```

---

### Пример 3: Architecture Design

```
User: "Спроектируй архитектуру микросервиса"

Agent (с загруженными знаниями):
"Применяю Pattern #8 (Architecture Designer):

1. Understand requirements: functional + non-functional + constraints
2. Identify patterns: Microservices, event-driven
3. Design с trade-offs: Mermaid diagram
4. Document ADRs: Architecture Decision Records
5. Review: С stakeholders

MUST: evaluate trade-offs explicitly, plan for failure modes
MUST NOT: over-engineer, skip security"
```

---

## 🔗 Связанные Файлы

```
~/ai-knowledge-backup.md          # Главный бекап
~/load-knowledge-backup.sh        # Загрузчик
~/gemini-kit/GEMINI.md            # Gemini-Kit workflows
~/claude-skills/SKILLS_GUIDE.md   # 66 навыков
~/qwen-examples/README.md         # SDK примеры
```

---

## ❓ FAQ

**Q: Как часто обновлять бекап?**  
A: После каждой значимой сессии с новыми знаниями.

**Q: Можно ли удалить старые паттерны?**  
A: Нет, все паттерны важны. Архивируй только устаревшие.

**Q: Что если агент не читает бекап?**  
A: Используй явные ссылки: "Pattern #5 из ai-knowledge-backup.md".

**Q: Как поделиться бекапом?**  
A: Скопируй файл на другой девайс или в облако.

---

**Версия:** 1.0  
**Создано:** 2026-03-11  
**Лицензия:** MIT (наследовано из исходных проектов)
