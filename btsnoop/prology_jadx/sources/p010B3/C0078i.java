package p010B3;

/* renamed from: B3.i */
/* loaded from: classes.dex */
public class C0078i extends p010B3.AbstractC0075f {
    @Override // p010B3.AbstractC0075f
    /* renamed from: b */
    public p010B3.C0074e mo323b(p010B3.C0081l c0081l) {
        p154k3.AbstractC1803h.m3779e(c0081l, "path");
        java.io.File m337e = c0081l.m337e();
        boolean isFile = m337e.isFile();
        boolean isDirectory = m337e.isDirectory();
        long lastModified = m337e.lastModified();
        long length = m337e.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || m337e.exists()) {
            return new p010B3.C0074e(isFile, isDirectory, java.lang.Long.valueOf(length), null, java.lang.Long.valueOf(lastModified), null);
        }
        return null;
    }

    /* renamed from: c */
    public void mo328c(p010B3.C0081l c0081l, p010B3.C0081l c0081l2) {
        p154k3.AbstractC1803h.m3779e(c0081l2, "target");
        if (c0081l.m337e().renameTo(c0081l2.m337e())) {
            return;
        }
        throw new java.io.IOException("failed to move " + c0081l + " to " + c0081l2);
    }

    /* renamed from: d */
    public final void m329d(p010B3.C0081l c0081l) {
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        java.io.File m337e = c0081l.m337e();
        if (m337e.delete() || !m337e.exists()) {
            return;
        }
        throw new java.io.IOException("failed to delete " + c0081l);
    }

    /* renamed from: e */
    public final p010B3.C0077h m330e(p010B3.C0081l c0081l) {
        return new p010B3.C0077h(false, new java.io.RandomAccessFile(c0081l.m337e(), "r"));
    }

    /* renamed from: f */
    public final p010B3.InterfaceC0089t m331f(p010B3.C0081l c0081l) {
        p154k3.AbstractC1803h.m3779e(c0081l, "file");
        java.io.File m337e = c0081l.m337e();
        int i4 = p010B3.AbstractC0080k.f254a;
        return new p010B3.C0076g(new java.io.FileInputStream(m337e));
    }

    public java.lang.String toString() {
        return "JvmSystemFileSystem";
    }
}
