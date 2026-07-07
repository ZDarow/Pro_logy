package p010B3;

/* renamed from: B3.j */
/* loaded from: classes.dex */
public final class C0079j extends p010B3.C0078i {
    /* renamed from: g */
    public static java.lang.Long m332g(java.nio.file.attribute.FileTime fileTime) {
        long millis = fileTime.toMillis();
        java.lang.Long valueOf = java.lang.Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // p010B3.C0078i, p010B3.AbstractC0075f
    /* renamed from: b */
    public final p010B3.C0074e mo323b(p010B3.C0081l c0081l) {
        p154k3.AbstractC1803h.m3779e(c0081l, "path");
        java.nio.file.Path m338f = c0081l.m338f();
        try {
            java.nio.file.attribute.BasicFileAttributes readAttributes = java.nio.file.Files.readAttributes(m338f, (java.lang.Class<java.nio.file.attribute.BasicFileAttributes>) java.nio.file.attribute.BasicFileAttributes.class, java.nio.file.LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path readSymbolicLink = readAttributes.isSymbolicLink() ? java.nio.file.Files.readSymbolicLink(m338f) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                java.lang.String str = p010B3.C0081l.f255m;
                p025F1.C0215g.m584u(readSymbolicLink.toString(), false);
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(readAttributes.size());
            java.nio.file.attribute.FileTime creationTime = readAttributes.creationTime();
            java.lang.Long m332g = creationTime != null ? m332g(creationTime) : null;
            java.nio.file.attribute.FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            java.lang.Long m332g2 = lastModifiedTime != null ? m332g(lastModifiedTime) : null;
            java.nio.file.attribute.FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new p010B3.C0074e(isRegularFile, isDirectory, valueOf, m332g, m332g2, lastAccessTime != null ? m332g(lastAccessTime) : null);
        } catch (java.nio.file.NoSuchFileException | java.nio.file.FileSystemException unused) {
            return null;
        }
    }

    @Override // p010B3.C0078i
    /* renamed from: c */
    public final void mo328c(p010B3.C0081l c0081l, p010B3.C0081l c0081l2) {
        p154k3.AbstractC1803h.m3779e(c0081l2, "target");
        try {
            java.nio.file.Files.move(c0081l.m338f(), c0081l2.m338f(), java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new java.io.IOException("atomic move not supported");
        } catch (java.nio.file.NoSuchFileException e4) {
            throw new java.io.FileNotFoundException(e4.getMessage());
        }
    }

    @Override // p010B3.C0078i
    public final java.lang.String toString() {
        return "NioSystemFileSystem";
    }
}
