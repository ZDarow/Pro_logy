package B3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: classes.dex */
public final class j extends i {
    public static Long g(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // B3.i, B3.f
    public final e b(l lVar) {
        k3.h.e(lVar, "path");
        Path f4 = lVar.f();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(f4, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(f4) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = l.f250m;
                F1.g.u(readSymbolicLink.toString(), false);
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long g4 = creationTime != null ? g(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long g5 = lastModifiedTime != null ? g(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new e(isRegularFile, isDirectory, valueOf, g4, g5, lastAccessTime != null ? g(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // B3.i
    public final void c(l lVar, l lVar2) {
        k3.h.e(lVar2, "target");
        try {
            Files.move(lVar.f(), lVar2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e4) {
            throw new FileNotFoundException(e4.getMessage());
        }
    }

    @Override // B3.i
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
