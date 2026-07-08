#!/usr/bin/env python3
"""Синхронизация docs/ → vault/ с автораспределением по категориям"""

import shutil
import re
from pathlib import Path
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler
from convert_to_obsidian import ObsidianConverter
from organize_vault import categorize_file


class SyncHandler(FileSystemEventHandler):
    def __init__(self, source='docs', target='vault'):
        self.source = Path(source)
        self.target = Path(target)
    
    def on_modified(self, event):
        if event.src_path.endswith('.md'):
            self.sync_file(event.src_path)
    
    def on_created(self, event):
        if event.src_path.endswith('.md'):
            self.sync_file(event.src_path)
    
    def sync_file(self, src_path):
        src = Path(src_path)
        rel_path = src.relative_to(self.source)
        dst = self.target / rel_path
        
        dst.parent.mkdir(parents=True, exist_ok=True)
        shutil.copy2(src, dst)
        
        # Конвертируем в Obsidian формат
        converter = ObsidianConverter(str(self.target))
        converter.convert_file(dst)
        converter.add_frontmatter(dst)
        
        # Распределяем по категориям
        category = categorize_file(dst)
        cat_path = self.target / category / dst.name
        
        if cat_path != dst:
            cat_path.parent.mkdir(parents=True, exist_ok=True)
            if cat_path.exists():
                cat_path.unlink()
            shutil.move(str(dst), str(cat_path))
            print(f"✅ Synced + categorized: {rel_path} → {category}/")
        else:
            print(f"✅ Synced: {rel_path}")
    
    def bulk_sync(self):
        """Разовая синхронизация всех файлов из source в target с категоризацией."""
        print(f"🔄 Bulk sync: {self.source} → {self.target}")
        
        md_files = list(self.source.rglob('*.md'))
        for src in md_files:
            rel_path = src.relative_to(self.source)
            dst = self.target / rel_path
            
            dst.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(src, dst)
            
            converter = ObsidianConverter(str(self.target))
            converter.convert_file(dst)
            converter.add_frontmatter(dst)
            
            category = categorize_file(dst)
            cat_path = self.target / category / dst.name
            
            if cat_path != dst:
                cat_path.parent.mkdir(parents=True, exist_ok=True)
                if cat_path.exists():
                    cat_path.unlink()
                shutil.move(str(dst), str(cat_path))
        
        print(f"✅ Synced {len(md_files)} files")


if __name__ == '__main__':
    import time
    import sys
    
    handler = SyncHandler()
    
    # Если передан --watch — запускаем в режиме реального времени
    if '--watch' in sys.argv:
        observer = Observer()
        observer.schedule(handler, 'docs', recursive=True)
        observer.start()
        
        print("🔄 Sync watcher started (Ctrl+C to stop)")
        try:
            while True:
                time.sleep(1)
        except KeyboardInterrupt:
            observer.stop()
        observer.join()
    else:
        # Разовый запуск
        handler.bulk_sync()
