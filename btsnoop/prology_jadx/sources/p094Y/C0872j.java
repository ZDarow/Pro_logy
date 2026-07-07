package p094Y;

/* renamed from: Y.j */
/* loaded from: classes.dex */
public final class C0872j extends java.io.InputStream {

    /* renamed from: l */
    public final p094Y.InterfaceC0870h f3122l;

    /* renamed from: m */
    public final p094Y.C0874l f3123m;

    /* renamed from: o */
    public boolean f3125o = false;

    /* renamed from: p */
    public boolean f3126p = false;

    /* renamed from: n */
    public final byte[] f3124n = new byte[1];

    public C0872j(p094Y.InterfaceC0870h interfaceC0870h, p094Y.C0874l c0874l) {
        this.f3122l = interfaceC0870h;
        this.f3123m = c0874l;
    }

    /* renamed from: a */
    public final void m1694a() {
        if (this.f3125o) {
            return;
        }
        this.f3122l.mo1686b(this.f3123m);
        this.f3125o = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3126p) {
            return;
        }
        this.f3122l.close();
        this.f3126p = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f3124n;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        p086W.AbstractC0781a.m1421j(!this.f3126p);
        m1694a();
        int read = this.f3122l.read(bArr, i4, i5);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
