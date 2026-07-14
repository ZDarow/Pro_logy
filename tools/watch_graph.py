#!/usr/bin/env python3
"""
PROLOGY Documentation Graph Watcher
====================================
Автоматически перегенерирует граф документации при изменениях в docs/.

Использование:
    python tools/watch_graph.py [--docs-dir docs] [--output docs/graph.html]

Зависимости:
    pip install watchdog
"""

import argparse
import os
import subprocess
import sys
import time
from pathlib import Path

from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler


class DocsChangeHandler(FileSystemEventHandler):
    def __init__(self, generator_args: list[str], debounce: float = 2.0):
        self.generator_args = generator_args
        self.debounce = debounce
        self._last_trigger = 0.0
        self._pending = False

    def on_any_event(self, event):
        if event.is_directory:
            return
        if not event.src_path.endswith('.md'):
            return
        if '.git' in event.src_path or 'node_modules' in event.src_path:
            return

        now = time.time()
        if now - self._last_trigger < self.debounce:
            self._pending = True
            return

        self._last_trigger = now
        self._pending = False
        self._regenerate()

    def _regenerate(self):
        print(f'\n[{time.strftime("%H:%M:%S")}] Change detected, regenerating...')
        try:
            subprocess.run(self.generator_args, check=True)
            print(f'  Done at {time.strftime("%H:%M:%S")}')
        except subprocess.CalledProcessError as e:
            print(f'  Error: {e}')


def main():
    parser = argparse.ArgumentParser(
        description='PROLOGY Documentation Graph Watcher'
    )
    parser.add_argument(
        '--docs-dir', default='docs',
        help='Path to docs directory (default: docs)',
    )
    parser.add_argument(
        '--output', default='docs/graph.html',
        help='Output HTML file path (default: docs/graph.html)',
    )
    parser.add_argument(
        '--debounce', type=float, default=2.0,
        help='Debounce interval in seconds (default: 2.0)',
    )
    args = parser.parse_args()

    script_dir = Path(__file__).resolve().parent
    project_root = script_dir.parent
    docs_dir = (project_root / args.docs_dir).resolve()

    if not docs_dir.is_dir():
        print(f'Error: docs directory not found: {docs_dir}')
        sys.exit(1)

    # Путь к генератору (через .venv если есть)
    venv_python = script_dir / '.venv' / 'bin' / 'python3'
    if venv_python.exists():
        python = str(venv_python)
    else:
        python = sys.executable

    generator_script = script_dir / 'graph_generator.py'
    generator_cmd = [
        python, str(generator_script),
        '--docs-dir', str(docs_dir),
        '--output', str(project_root / args.output),
    ]

    # Первичная генерация
    print('Initial graph generation...')
    subprocess.run(generator_cmd, check=True)
    print(f'Watching {docs_dir} for changes (debounce={args.debounce}s)...')
    print('Press Ctrl+C to stop.')

    handler = DocsChangeHandler(generator_cmd, debounce=args.debounce)
    observer = Observer()
    observer.schedule(handler, str(docs_dir), recursive=True)
    observer.start()

    try:
        while True:
            time.sleep(1)
            # Debounce check: если событие пришло во время предыдущей генерации
            if handler._pending:
                now = time.time()
                if now - handler._last_trigger >= handler.debounce:
                    handler._pending = False
                    handler._last_trigger = now
                    handler._regenerate()
    except KeyboardInterrupt:
        print('\nStopping...')
        observer.stop()
    observer.join()


if __name__ == '__main__':
    main()
