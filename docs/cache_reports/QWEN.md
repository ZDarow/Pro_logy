# QWEN.md — Termux Home Directory Context

## 📋 Обзор

Это домашняя директория **Termux** (Android-терминал) с набором проектов, инструментов и конфигураций для разработки. Основная среда — мобильная разработка и тестирование, с акцентом на Python-скрипты, Android-проекты и инструменты для pentesting.

---

## 🗂️ Структура Директорий

```
/data/data/com.termux/files/home/
├── .qwen/                    # Конфигурация Qwen Code (AI-ассистент)
├── claude-skills/            # Claude Skills — 66 навыков для разработки
├── Cracker-Tool/             # Python-инструмент для pentesting/hacking
├── Exclave/                  # Android proxy client (fork SagerNet)
├── qwen-examples/            # Примеры и демо для Qwen Code SDK
├── storage/                  # Ссылки на внешнее хранилище Android
├── .android/                 # ADB ключи и конфигурация
├── .ssh/                     # SSH ключи
├── .npm/ .nvm/               # Node.js и npm кэш
├── .cache/ .config/          # Системные конфиги
└── .termux/                  # Termux специфичные настройки
```

---

## 🏗️ Основные Проекты

### 1. **gemini-kit** — AI Engineering Team для Gemini CLI
**Путь:** `/data/data/com.termux/files/home/gemini-kit`

- **Тип:** TypeScript/Node.js расширение для Gemini CLI
- **Версия:** 4.0.0
- **Описание:** Набор из 27 специализированных AI-агентов, 45 команд и 33 рабочих процессов для разработки ПО
- **Особенности:**
  - **Compound System:** `/explore → /plan → /work → /review → /compound` — сохранение решений для повторного использования
  - **Learning System:** AI обучается из обратной связи пользователя
  - **23 Critical Patterns:** Документированные ошибки для предотвращения повторения
  - **Auto-checkpoint:** Автоматический Git backup перед изменениями
  - **Security Hooks:** Блокировка секретов (30+ паттернов)
- **Агенты (27):**
  - Core: Planner, Scout, Coder, Tester, Reviewer
  - Specialists: Security Auditor, Frontend/Backend Specialist, DevOps Engineer, Debugger
  - Support: Git Manager, Docs Manager, Researcher, Brainstormer, Project Manager
  - Specialized: Orchestrator, Code Archaeologist, Product Owner, SEO Specialist
- **Навыки (15):** React, Next.js, Tailwind, API Design, Docker, Security, Testing, Mobile
- **Команды (45+):** `/plan`, `/review`, `/cook`, `/debug`, `/test`, `/fullstack`, `/doc`, `/git`, `/pr`
- **Сборка:**
  ```bash
  npm install && npm run build
  npm run test          # 291 тестов
  npm run lint
  ```
- **Установка:**
  ```bash
  git clone https://github.com/nth5693/gemini-kit.git ~/.gemini/extensions/gemini-kit
  cd ~/.gemini/extensions/gemini-kit
  npm install && npm run build
  gemini extensions link $(pwd)
  ```
- **Лицензия:** MIT

### 2. **Exclave** — Android Proxy Client
**Путь:** `/data/data/com.termux/files/home/Exclave`

- **Тип:** Android приложение (Kotlin/Java, Gradle)
- **Описание:** Прокси-клиент с поддержкой множественных протоколов (Shadowsocks, Trojan, Hysteria 2, VMess/VLESS, WireGuard, SSH, SOCKS и др.)
- **Особенности:**
  - Группировка и подписки
  - Маршрутизация трафика
  - Цепочки прокси
  - Кастомное ядро V2Ray
- **Сборка:**
  ```bash
  ./run lib core              # Сборка libsagernetcore
  ./gradlew :app:downloadAssets
  ./gradlew :app:assembleOssRelease
  ```
- **Требования:** JDK 21, Go 1.25, Android SDK 36, NDK r29
- **Лицензия:** GPL-3.0

### 3. **Cracker-Tool** — Pentesting Инструмент
**Путь:** `/data/data/com.termux/files/home/Cracker-Tool`

- **Тип:** Python-скрипты для Termux
- **Описание:** Набор инструментов для тестирования безопасности и pentesting
- **Функции (25+):**
  - IP Tool, Subdomain Scanner
  - DDoS Attack Tool (с Cloudflare Bypass)
  - Admin Finder, Hash Cracker
  - SQL Injection Tool
  - Video Downloader, Text-to-Voice
  - Python Obfuscator
  - Telegram Kit, Temp Mail
  - Kali Nethunter Installer
  - ZIP Password Cracker
- **Запуск:**
  ```bash
  cd Cracker-Tool
  python cracker-main.py
  # или
  cracker
  ```
- **Установка:**
  ```bash
  pkg install git python
  git clone https://github.com/cracker911181/Cracker-Tool
  ```
- **Автор:** CRACKER911181

### 4. **Qwen Examples** — Примеры Qwen Code SDK
**Путь:** `/data/data/com.termux/files/home/qwen-examples`

- **Тип:** Демо-проекты и навыки для Qwen Code
- **Описание:** Коллекция примеров использования Qwen Code SDK
- **Структура:**
  - `apps/` — Готовые приложения (ProtoFlow, DesignPrint, CoWork, NoteGenius, PromoStudio)
  - `sdk/` — Примеры использования SDK
  - `skills/` — Навыки (YouTube Transcript, Image Generation, Auto PR, Dashboard Builder)
  - `vibe/` — Маркетинговые материалы
- **Навыки:**
  - **YouTube Transcript Extractor** — Извлечение транскриптов с таймкодами
  - **Image Generation** — Генерация изображений через DashScope (Wanx)
  - **Auto PR** — Автоматическое создание Pull Request
  - **Dashboard Builder** — Full-stack дашборды (React/Next.js + shadcn/ui)

### 5. **Claude Skills** — Набор Навыков для Claude Code
**Путь:** `/data/data/com.termux/files/home/claude-skills`

- **Тип:** Плагины и навыки для Claude Code
- **Описание:** 66 специализированных навыков для fullstack-разработки
- **Категории:**
  - Backend (NestJS, FastAPI, Django, Spring Boot)
  - Frontend (React, Vue, Next.js, Angular)
  - DevOps (Kubernetes, Terraform, CI/CD)
  - Security (Security Auditor, Secure Code Guardian)
  - Data/ML (ML Pipeline, Pandas, Spark)
  - 9 рабочих процессов (workflow)
- **Установка:**
  ```bash
  /plugin marketplace add jeffallan/claude-skills
  /plugin install fullstack-dev-skills@jeffallan
  ```
- **Документация:** [SKILLS_GUIDE.md](claude-skills/SKILLS_GUIDE.md)

---

## ⚙️ Конфигурация

### Termux Настройки
**Файл:** `.termux/termux.properties`

- Конфигурация дополнительных клавиш (extra-keys)
- Настройки курсора, цветов, fullscreen
- Горячие клавиши для сессий
- **Перезагрузка:** `termux-reload-settings`

### Qwen Code Конфигурация
**Файл:** `.qwen/settings.json`

```json
{
  "security": { "selectedType": "qwen-oauth" },
  "model": { "name": "coder-model" },
  "general": { "language": "ru", "outputLanguage": "Ru" },
  "tools": { "approvalMode": "yolo" }
}
```

### NVM Конфигурация
**Файл:** `.bashrc`

- Node Version Manager настроен для управления версиями Node.js
- Автозагрузка bash completion

### NPM Настройки
**Файл:** `.npmrc`

```
foreground-scripts=true
registry=https://registry.npmmirror.com
```

---

## 🛠️ Установка и Запуск

### Системные Зависимости
**Скрипт:** `setup.sh`

```bash
#!/data/data/com.termux/files/usr/bin/bash
pkg install -y python clang libjpeg-turbo libpng freetype
pip install --upgrade pip
pip install numpy matplotlib scipy
termux-setup-storage
```

### Быстрый Старт

1. **Обновление системы:**
   ```bash
   pkg update && pkg upgrade
   ```

2. **Установка зависимостей:**
   ```bash
   bash setup.sh
   ```

3. **Запуск проектов:**
   ```bash
   # Cracker-Tool
   cd Cracker-Tool && python cracker-main.py

   # Exclave (сборка)
   cd Exclave && ./run lib core

   # Qwen Examples
   cd qwen-examples
   ```

---

## 📦 Доступ к Хранилищу

Termux предоставляет доступ к внешнему хранилищу через симлинки:

```
storage/
├── dcim/          → /storage/emulated/0/DCIM
├── downloads/     → /storage/emulated/0/Download
├── external-1/    → Внешняя SD-карта
├── movies/        → /storage/emulated/0/Movies
├── music/         → /storage/emulated/0/Music
├── pictures/      → /storage/emulated/0/Pictures
└── shared/        → /storage/emulated/0
```

**Разрешение доступа:**
```bash
termux-setup-storage
```

---

## 🔐 Безопасность

- **SSH ключи:** `.ssh/`
- **ADB ключи:** `.android/adbkey`, `.android/adb_known_hosts.pb`
- **Qwen OAuth:** `.qwen/oauth_creds.json`

> ⚠️ **Внимание:** Cracker-Tool предназначен только для легального тестирования безопасности. Использование в злонамеренных целях запрещено.

---

## 📚 Ресурсы и Документация

| Проект | Документация |
|--------|--------------|
| gemini-kit | [README.md](gemini-kit/README.md), [QUICKSTART.md](gemini-kit/QUICKSTART.md), [GEMINI.md](gemini-kit/GEMINI.md) |
| Exclave | [README.md](Exclave/README.md), [Wiki](https://github.com/dyhkwong/Exclave/wiki) |
| Cracker-Tool | [README](Cracker-Tool/README), [YouTube Tutorial](https://youtu.be/jd0w9qs2PQM) |
| Qwen Examples | [README.md](qwen-examples/README.md) |
| Claude Skills | [README.md](claude-skills/README.md), [SKILLS_GUIDE.md](claude-skills/SKILLS_GUIDE.md) |

---

## 🎯 Рекомендуемые Практики

### Для Разработки
1. Используйте `.qwen/` для конфигурации AI-ассистента
2. Применяйте навыки из `claude-skills/` для ускорения разработки
3. Для Android-разработки используйте Exclave как референс

### Для Pentesting
1. Все инструменты в Cracker-Tool требуют root/termux-среды
2. Используйте `termux-setup-storage` для доступа к файлам
3. Логи и результаты сохраняются в соответствующих поддиректориях

### Для Qwen Code
1. Изучите примеры в `qwen-examples/sdk/`
2. Используйте готовые навыки из `qwen-examples/skills/`
3. Настройте OAuth через `.qwen/oauth_creds.json`

---

## 🔧 Полезные Команды

```bash
# Termux
termux-setup-storage          # Доступ к хранилищу
termux-reload-settings        # Перезагрузка настроек
pkg install <package>         # Установка пакетов

# Git
git clone <repo>              # Клонирование репозиториев
git status                    # Статус репозитория

# Python
python3 script.py             # Запуск Python-скриптов
pip install <package>         # Установка Python-пакетов

# Node.js
nvm install <version>         # Установка версии Node.js
npm install <package>         # Установка npm-пакетов

# gemini-kit (Gemini CLI)
gemini                        # Запуск Gemini CLI
/plan [task]                  # Создать план реализации
/explore [topic]              # Исследовать тему
/work                         # Выполнить план по шагам
/review [file]                # Code review
/compound                     # Документировать решение
/housekeeping                 # Очистка перед git push
/debug [issue]                # Отладка с анализом причин
/test [file]                  # Написать и запустить тесты
/fullstack [feature]          # Full-stack разработка
/git [action]                 # Git операции
/pr [description]             # Создать Pull Request

# Exclave Build
./run lib core                # Сборка ядра
./gradlew :app:assembleOssRelease  # Сборка APK

# Cracker-Tool
cracker                       # Запуск инструмента
```

---

## 📊 Сводка

| Категория | Проекты |
|-----------|---------|
| **AI/LLM Extensions** | gemini-kit (27 агентов), Qwen Examples, Claude Skills (66 навыков) |
| **Android Разработка** | Exclave (Kotlin/Gradle) |
| **Python/Pentesting** | Cracker-Tool (25+ инструментов) |
| **Конфигурация** | Termux, Qwen Code, NVM, NPM |
| **Безопасность** | SSH, ADB, OAuth ключи |

---

## 📝 Заметки

- Эта директория содержит как production-проекты, так и инструменты для тестирования
- Некоторые проекты требуют специфичных версий (JDK 21, Go 1.25, Python 3.9+)
- Для работы с Qwen Code требуется OAuth-аутентификация
- Все проекты находятся в активной разработке

---

**Последнее обновление:** 2026-03-10  
**Среда:** Termux на Android  
**Язык вывода:** Русский (по умолчанию)
