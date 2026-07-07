package B3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class i extends f {
    @Override // B3.f
    public e b(l lVar) {
        k3.h.e(lVar, "path");
        File e4 = lVar.e();
        boolean isFile = e4.isFile();
        boolean isDirectory = e4.isDirectory();
        long lastModified = e4.lastModified();
        long length = e4.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || e4.exists()) {
            return new e(isFile, isDirectory, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    public void c(l lVar, l lVar2) {
        k3.h.e(lVar2, "target");
        if (lVar.e().renameTo(lVar2.e())) {
            return;
        }
        throw new IOException("failed to move " + lVar + " to " + lVar2);
    }

    public final void d(l lVar) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File e4 = lVar.e();
        if (e4.delete() || !e4.exists()) {
            return;
        }
        throw new IOException("failed to delete " + lVar);
    }

    public final h e(l lVar) {
        return new h(false, new RandomAccessFile(lVar.e(), "r"));
    }

    public final t f(l lVar) {
        k3.h.e(lVar, "file");
        File e4 = lVar.e();
        int i4 = k.f249a;
        return new g(new FileInputStream(e4));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
