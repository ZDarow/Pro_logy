# 🧠 AI Knowledge Backup

**Generated:** 2026-03-11  
**Source:** Termux Home Directory  
**Projects:** qwen-examples, claude-skills, gemini-kit  
**Total Learnings:** 22 (15 patterns + 7 preferences)

---

## 📋 Quick Import Guide

### For New Agent Session

```bash
# Option 1: Read this file
cat /path/to/ai-knowledge-backup.md

# Option 2: Load via kit_get_learnings (if MCP available)
# Learnings will auto-inject into context

# Option 3: Manual context injection
# Copy relevant sections into conversation
```

### Usage

1. **Start new session**
2. **Reference this backup**: "Загрузи знания из ai-knowledge-backup.md"
3. **Apply patterns**: Agent automatically uses saved learnings

---

## 📊 Knowledge Summary

| Source | Patterns | Preferences | Total |
|--------|----------|-------------|-------|
| qwen-examples | 6 | 1 | 7 |
| claude-skills | 6 | 1 | 7 |
| gemini-kit | 8 | 1 | 8 |
| **TOTAL** | **20** | **3** | **23** |

---

## 🏗️ ARCHITECTURE PATTERNS

### Pattern #1: Skill-based Architecture
**Category:** pattern  
**Source:** qwen-examples/skills/

**Lesson:** Каждый навык должен быть независимым модулем с:
- `SKILL.md` — описание, требования, workflow
- `README.md` — детальная документация
- `scripts/` — исполняемые скрипты

Навыки загружаются динамически через LLM, который выбирает подходящий навык по описанию задачи.

---

### Pattern #2: Claude Skills Structure (SKILL.md)
**Category:** pattern  
**Source:** claude-skills/skills/*/SKILL.md

**Lesson:** Структура SKILL.md:

```yaml
---
name: skill-name
description: "[Capability]. Use when [trigger]." (≤1024 chars, НЕ process steps)
license: MIT
metadata:
  author: https://github.com/username
  version: "1.0.0"
  domain: backend|frontend|security|...
  triggers: keyword1, keyword2
  role: specialist|expert|architect
  scope: implementation|review|design
  output-format: code|document|report
  related-skills: skill1, skill2
---

# Core Workflow (5 шагов)
# Reference Guide (таблица: Topic | Reference | Load When)
# Constraints (MUST DO / MUST NOT DO)
# Output Templates
# Code Examples
```

---

### Pattern #3: Progressive Disclosure Architecture
**Category:** pattern  
**Source:** claude-skills/CLAUDE.md

**Lesson:**
- **Tier 1** — SKILL.md (~80-100 строк): role definition, when-to-use, core workflow (5 steps), constraints, routing table
- **Tier 2** — Reference Files (100-600 строк каждый): глубокий технический контент, полные примеры кода, edge cases

**Цель:** 50% экономия токенов через селективную загрузку.

---

### Pattern #4: Knowledge Base Structure
**Category:** pattern  
**Source:** gemini-kit

**Lesson:**
```
docs/solutions/       # Persistent solved problems с YAML frontmatter
docs/decisions/       # Architecture Decision Records (ADRs)
docs/architecture/    # System architecture diagrams
docs/specs/           # Multi-session specifications
docs/explorations/    # Deep research artifacts
skills/               # Modular capabilities
plans/                # Implementation plans
todos/                # File-based tracked work items
```

---

## 🔄 WORKFLOW PATTERNS

### Pattern #5: Compound Loop (Core Workflow)
**Category:** pattern  
**Source:** gemini-kit

**Lesson:**
```
/explore → /plan → /work → /review → /compound → /housekeeping → repeat
```

Каждая итерация создаёт Knowledge Base в `docs/solutions/`, следующий цикл становится легче.

**MUST:**
- search before solving (`compound-search.sh`)
- document after solving (`/compound`)
- health check daily (`compound-dashboard.sh`)

---

### Pattern #6: Auto PR Workflow
**Category:** pattern  
**Source:** qwen-examples/skills/auto-pr

**Lesson:** 4 этапа:
1. **Branch Preparation** — синхронизация с base branch
2. **Code Review** — анализ изменений
3. **Documentation Generation** — генерация English PR description с подтверждением пользователя
4. **PR Submission** — создание PR через GitHub CLI

**Ключевые точки взаимодействия:** подтверждение документации и очистка временных файлов после PR.

---

### Pattern #7: Debugging Wizard Workflow
**Category:** pattern  
**Source:** claude-skills/skills/debugging-wizard

**Lesson:** 5 шагов:
1. **Reproduce** — установить воспроизведение
2. **Isolate** — минимальный failing case
3. **Hypothesize and test** — проверять по одной гипотезе
4. **Fix** — реализовать и проверить
5. **Prevent** — добавить тесты

**MUST:** воспроизвести сначала, тестировать одну гипотезу за раз, добавить regression tests.  
**MUST NOT:** multiple changes at once, guess without testing.

---

### Pattern #8: Architecture Designer Workflow
**Category:** pattern  
**Source:** claude-skills/skills/architecture-designer

**Lesson:** 5 шагов:
1. **Understand requirements** — functional + non-functional + constraints
2. **Identify patterns**
3. **Design с trade-offs + diagram**
4. **Document ADRs**
5. **Review**

**MUST:** document decisions ADRs, evaluate trade-offs explicitly, plan for failure modes.  
**MUST NOT:** over-engineer, skip security, ignore operational costs.

**Output:** diagram (Mermaid), ADRs, technology recommendations.

---

### Pattern #9: Review-Compound (Multi-Pass Review)
**Category:** pattern  
**Source:** gemini-kit/docs/WORKFLOWS.md

**Lesson:** 5 passes для pre-merge и critical changes:
1. **Security Review** — auth, authz, injection
2. **Performance Review** — N+1, caching, complexity
3. **Architecture Review** — boundaries, patterns
4. **Data Integrity Review** — transactions, validation
5. **Simplicity Review** — YAGNI, refactoring

---

### Pattern #10: Session Resume (MANDATORY)
**Category:** pattern  
**Source:** gemini-kit/skills/session-resume

**Lesson:** При старте новой сессии:
1. Check active todos (`ls todos/*-ready-*.md`)
2. Check in-progress plans (`ls plans/*.md`)
3. Recent git activity (`git log -5`, `git status`)
4. System health (`compound-dashboard.sh`)

**Output:** Active Work, Recent Activity, Suggested Next Steps.

**Trigger:** пользователь пишет "continue", "resume", "where were we".

---

### Pattern #11: Multi-Order Thinking (Rigorous Planning)
**Category:** pattern  
**Source:** gemini-kit/docs/solutions/patterns/critical-patterns.md

**Lesson:** Для /plan-compound и сложных фич:
- **1st order** — что直接影响
- **2nd order** — что зависит от affected things
- **3rd order** — cascading effects
- **4th order** — long-term implications

Prevents architectural mistakes from short-term thinking.

---

### Pattern #12: 23 Critical Patterns
**Category:** pattern  
**Source:** gemini-kit/docs/solutions/patterns/critical-patterns.md

**Lesson:** Обязательное чтение перед coding. Ключевые:
1. Search Before Solving
2. Actionable Items → Todo Files
3. Housekeeping Before Push
4. Structure > Documentation
5. Persistence Over Conversation
6. Extract Don't Link
7. Explicit Workflow Skill Integration
8. Rigorous Planning (Multi-Order Thinking 1st-4th order)
9. Atomic State Transitions
10. Explore Before Plan

---

## 👥 AGENT PATTERNS

### Pattern #13: Orchestrator Multi-Agent Coordination
**Category:** pattern  
**Source:** gemini-kit/agents/orchestrator.md

**Lesson:**
1. **Decompose** task на domain-specific subtasks
2. **Select agents:**
   - security-auditor
   - backend-specialist
   - frontend-specialist
   - tester
   - devops-engineer
   - database-admin
   - debugger
3. **Coordinate** логический порядок
4. **Synthesize** results

**Agent Boundaries:**
- frontend ≠ API, backend ≠ CSS, database-admin ≠ frontend

**File Type Ownership:**
- `*.tsx`, `*.css` → frontend-specialist
- `*.ts` (API) → backend-specialist
- `*.sql`, `schema.*` → database-admin

---

### Pattern #14: gemini-kit 27 Agents
**Category:** preference  
**Source:** gemini-kit/README.md

**Lesson:** 27 агентов разделены на категории:
- **Core (5):** Planner, Scout, Coder, Tester, Reviewer
- **Specialists (12):** Security, Frontend, Backend, DevOps, Debugger, DB Admin, UI Designer, Fullstack, Mobile, Performance, Penetration
- **Support (6):** Git Manager, Docs Manager, Researcher, Brainstormer, Project Manager, Copywriter
- **Special (4):** Orchestrator, Code Archaeologist, Product Owner, SEO

---

### Pattern #15: Claude Skills 12 Domains
**Category:** pattern  
**Source:** claude-skills/SKILLS_GUIDE.md

**Lesson:** 66 навыков по 12 domains:
- language, backend, frontend, infrastructure
- api-architecture, quality, devops, security
- data-ml, platform, specialized, workflow

Покрывают: Python/TS/Go/Rust, React/Next.js/Vue/Angular, NestJS/Django/FastAPI/Spring, Kubernetes/Terraform, Testing/Debugging, Security, ML/RAG.

---

## 🛠️ TECHNICAL PATTERNS

### Pattern #16: Dashboard Builder Patterns
**Category:** pattern  
**Source:** qwen-examples/skills/dashboard-builder

**Lesson:** Professional PC Dashboard:
- **Dark theme:** slate-900 to slate-950
- **KPI cards:** AnimatedNumber через Framer Motion
- **Charts:** Recharts для графиков
- **Grid layout для 4K:** grid-cols-4 для KPI, grid-cols-12 для основного контента
- **Live Indicator:** с pulse анимацией
- **Auto-refresh hook:** с интервалом обновления

---

### Pattern #17: Image Generation Workflow
**Category:** pattern  
**Source:** qwen-examples/skills/image-generate

**Lesson:** 3 шага:
1. **Refine prompt** — трансформация простого запроса в детальный prompt с ключевыми словами стиля
2. **Run generation** через DashScope API (Wanx)
3. **Auto-save** — сохранение изображения + metadata.json + response.json для отладки

**Формат именования:** `image_YYYY-MM-DDTHH-mm-ss.png`

---

### Pattern #18: Multi-Turn Conversation
**Category:** pattern  
**Source:** qwen-examples/sdk

**Lesson:**
- async generator для непрерывной генерации user messages
- streaming output через `for await...of`
- сохранение context history для последующих запросов
- tool call display с отображением tool-use блоков и результатов

---

### Pattern #19: SDK Skills Management
**Category:** pattern  
**Source:** qwen-examples/apps/sdk-skills-management

**Lesson:**
- загрузка навыков из SKILL.md файлов
- построение intelligent prompts с skill context
- исполнение через @qwen-code/sdk query API
- multi-turn interaction с context preservation
- automatic skill selection на основе user intent

---

## 🔐 SECURITY PATTERNS

### Pattern #20: Fullstack Guardian (3 Perspectives)
**Category:** pattern  
**Source:** claude-skills/skills/fullstack-guardian

**Lesson:**
- **Frontend:** UI components, state management, client validation
- **Backend:** API endpoints, database queries, business logic
- **Security:** auth, authz, input validation, output encoding, parameterized queries

**MUST:**
- validate input client+server
- parameterized queries
- sanitize output
- error handling every layer
- log security events

---

## 📝 DOCUMENTATION PATTERNS

### Pattern #21: Description Format
**Category:** preference  
**Source:** claude-skills/CLAUDE.md

**Lesson:** Description format для навыков:
```
"[Brief capability statement]. Use when [triggering conditions]."
```
- Максимум 1024 символов
- **НИКОГДА не включать process steps** в description (агенты читают brief description вместо full skill content)
- Process steps только в теле SKILL.md

---

### Pattern #22: Skill Documentation Standards
**Category:** preference  
**Source:** qwen-examples/skills/

**Lesson:**
- **SKILL.md:** name, description, version, license, prerequisites, user guide, examples
- **README.md:** детальная документация с architecture diagrams, API references, troubleshooting

---

## 🎯 INTEGRATED WORKFLOW

```
┌─────────────────────────────────────────────────────────────┐
│              INTEGRATED COMPOUND WORKFLOW                   │
├─────────────────────────────────────────────────────────────┤
│                                                             │
│  Session Resume → /explore → /plan-compound → /work        │
│       ↓                  ↓                                    │
│  Check todos      Multi-Order Thinking                      │
│  Check health     Critical Patterns                         │
│                                                             │
│  /review-compound → /compound → /housekeeping → repeat     │
│       ↓                                                     │
│  5-pass review:                                             │
│  Security → Performance → Architecture → Data → Simplicity │
└─────────────────────────────────────────────────────────────┘
```

---

## 📦 QUICK REFERENCE

### Commands
```bash
# Session start
./scripts/compound-dashboard.sh
ls todos/*-ready-*.md

# Before coding
./scripts/compound-search.sh "{keywords}"

# After solving
/compound "Solution description"

# Before push
/housekeeping
```

### File Structure
```
project/
├── docs/
│   ├── solutions/       # Knowledge Base
│   ├── decisions/       # ADRs
│   ├── architecture/    # Diagrams
│   └── patterns/        # Critical patterns
├── skills/              # Modular capabilities
├── plans/               # Implementation plans
└── todos/               # Work items
```

### Agent Selection
```
Frontend → frontend-specialist
Backend  → backend-specialist
Security → security-auditor
Database → database-admin
DevOps   → devops-engineer
Testing  → tester
Debug    → debugger
```

---

## 🔄 IMPORT INSTRUCTIONS

### For MCP-Enabled Agents

```python
# Learnings auto-inject via kit_get_learnings
# No manual action needed
```

### For Manual Import

1. **Copy this file** to new project: `cp ai-knowledge-backup.md /new/project/`
2. **Reference in conversation:** "Примени паттерны из ai-knowledge-backup.md"
3. **Specific patterns:** "Используй Pattern #5 (Compound Loop)" или "Примени Fullstack Guardian approach"

### For Skill Creation

```bash
# Create new skill based on patterns
mkdir -p skills/my-new-skill
cp ai-knowledge-backup.md skills/my-new-skill/REFERENCE.md
```

---

## 📊 Statistics

- **Created:** 2026-03-11
- **Projects Analyzed:** 3 (qwen-examples, claude-skills, gemini-kit)
- **Total Patterns:** 20
- **Total Preferences:** 3
- **Total Learnings:** 23
- **Estimated Token Savings:** ~50% via Progressive Disclosure

---

## 🔗 Related Files

- `gemini-kit/GEMINI.md` — Agent workflows
- `claude-skills/SKILLS_GUIDE.md` — 66 skills reference
- `qwen-examples/README.md` — SDK examples
- `docs/solutions/patterns/critical-patterns.md` — 23 critical patterns

---

**Backup Version:** 1.0  
**Maintained By:** AI Agent  
**License:** MIT (derived from source projects)
