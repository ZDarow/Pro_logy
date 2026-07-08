#!/usr/bin/env python3
"""Конвертер markdown-ссылок в Obsidian wiki-links"""

import re
import os
from pathlib import Path
from collections import defaultdict


class ObsidianConverter:
    def __init__(self, vault_dir='vault'):
        self.vault_dir = Path(vault_dir)
        self.md_link_pattern = re.compile(r'\[([^\]]+)\]\(([^)]+)\)')
        self.stats = defaultdict(int)
    
    def convert_link(self, match):
        """Конвертирует одну markdown-ссылку"""
        text, link = match.groups()
        
        # Пропускаем внешние ссылки
        if link.startswith(('http://', 'https://', 'mailto:')):
            self.stats['external'] += 1
            return match.group(0)
        
        # Пропускаем изображения
        if link.endswith(('.png', '.jpg', '.jpeg', '.gif', '.svg')):
            self.stats['images'] += 1
            return match.group(0)
        
        # Обрабатываем markdown файлы
        if '.md' in link:
            # Убираем якоря и параметры
            clean_link = link.split('#')[0].split('?')[0]
            
            # Извлекаем имя файла без пути
            filename = Path(clean_link).stem
            
            # Формируем wiki-link
            if text == filename or text == clean_link:
                self.stats['simple'] += 1
                return f'[[{filename}]]'
            else:
                self.stats['aliased'] += 1
                return f'[[{filename}|{text}]]'
        
        self.stats['other'] += 1
        return match.group(0)
    
    def convert_file(self, file_path):
        """Конвертирует один файл"""
        try:
            with open(file_path, 'r', encoding='utf-8') as f:
                content = f.read()
            
            new_content = self.md_link_pattern.sub(self.convert_link, content)
            
            if new_content != content:
                with open(file_path, 'w', encoding='utf-8') as f:
                    f.write(new_content)
                self.stats['files_modified'] += 1
            
            self.stats['files_processed'] += 1
        except Exception as e:
            print(f"⚠️  Ошибка {file_path}: {e}")
    
    def add_frontmatter(self, file_path):
        """Добавляет frontmatter с метаданными"""
        try:
            with open(file_path, 'r', encoding='utf-8') as f:
                content = f.read()
            
            # Пропускаем если уже есть frontmatter
            if content.startswith('---'):
                return
            
            # Определяем теги по имени файла
            tags = self._infer_tags(file_path)
            
            # Формируем frontmatter
            filename = Path(file_path).stem
            frontmatter = f"""---
title: {filename}
tags: [{', '.join(tags)}]
created: {int(Path(file_path).stat().st_mtime)}
---

"""
            
            with open(file_path, 'w', encoding='utf-8') as f:
                f.write(frontmatter + content)
            
            self.stats['frontmatter_added'] += 1
        except Exception as e:
            print(f"⚠️  Ошибка frontmatter {file_path}: {e}")
    
    def _infer_tags(self, file_path):
        """Определяет теги по имени файла"""
        name = Path(file_path).stem.lower()
        tags = ['prology']
        
        tag_map = {
            'protocol': 'protocol',
            'rcsp': 'protocol',
            'ble': 'ble',
            'analysis': 'analysis',
            'toolkit': 'toolkit',
            'command': 'commands',
            'guide': 'guide',
            'dsp': 'dsp',
            'spec': 'specification',
            'apk': 'reverse-engineering',
            'dump': 'reverse-engineering',
        }
        
        for keyword, tag in tag_map.items():
            if keyword in name:
                tags.append(tag)
        
        return tags
    
    def create_moc(self):
        """Создаёт Map of Content (главный индекс)"""
        moc_content = """---
title: Pro_logy — Главный индекс
tags: [moc, prology, index]
---

# 🚗 Pro_logy Documentation

Мобильное приложение для управления автомагнитолами Prology через BLE.

## 📚 Разделы

### 🔌 Протокол
- [[protocol]] — Полная документация BLE протокола
- [[RCSP_PROTOCOL]] — Спецификация RCSP

### 🔬 Анализ
- [[APK_ANALYSIS_REPORT]] — Анализ оригинального APK
- [[PROLOGY_MAX_ANALYSIS]] — Расширенный анализ

### 🛠️ Toolkit
- [[PROLOGY_TOOLKIT_ANALYSIS]] — Обзор toolkit
- [[COMMANDS]] — Справочник команд

### 📖 Руководства
- [[DSP_MODIFICATION_GUIDE]] — Модификация DSP
- [[Prology_DSP]] — DSP функции

### 📋 Спецификации
- [[prology_reverse_spec]] — Reverse spec в EARS формате

## 🔗 Быстрые ссылки
- [[TOOLKIT_INDEX]] — Индекс инструментов
- [[DSP_ANALYSIS_REPORT]] — Анализ DSP

## 🏷️ Теги
#protocol #analysis #toolkit #guide #dsp #ble #reverse-engineering
"""
        
        moc_path = self.vault_dir / '00-Inbox' / '🗺️ Pro_logy MOC.md'
        moc_path.parent.mkdir(parents=True, exist_ok=True)
        
        with open(moc_path, 'w', encoding='utf-8') as f:
            f.write(moc_content)
        
        print(f"✅ Создан MOC: {moc_path}")
    
    def run(self):
        """Запускает полную конвертацию"""
        print("=" * 60)
        print("🔄 Obsidian Vault Converter")
        print("=" * 60)
        
        md_files = list(self.vault_dir.rglob('*.md'))
        print(f"\n📂 Найдено {len(md_files)} markdown файлов")
        
        # Конвертируем ссылки
        print("\n🔗 Конвертация ссылок...")
        for md_file in md_files:
            self.convert_file(md_file)
        
        # Добавляем frontmatter
        print("\n📝 Добавление frontmatter...")
        for md_file in md_files:
            self.add_frontmatter(md_file)
        
        # Создаём MOC
        self.create_moc()
        
        # Статистика
        print("\n📊 Статистика:")
        for key, value in self.stats.items():
            print(f"   {key}: {value}")
        
        print(f"\n✅ Vault готов: {self.vault_dir.absolute()}")


if __name__ == '__main__':
    converter = ObsidianConverter()
    converter.run()
