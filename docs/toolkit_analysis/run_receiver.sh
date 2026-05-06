#!/bin/bash
# Запуск управления ресивером PROLOGY через виртуальное окружение

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
VENV_DIR="$SCRIPT_DIR/venv"

if [ ! -d "$VENV_DIR" ]; then
    echo "❌ Виртуальное окружение не найдено: $VENV_DIR"
    echo "Выполните: cd $SCRIPT_DIR && python3 -m venv venv && source venv/bin/activate && pip install bleak"
    exit 1
fi

source "$VENV_DIR/bin/activate"
python3 "$SCRIPT_DIR/linux_receiver_control.py" "$@"
