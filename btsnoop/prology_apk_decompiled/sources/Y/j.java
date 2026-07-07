package Y;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: l, reason: collision with root package name */
    public final h f3016l;

    /* renamed from: m, reason: collision with root package name */
    public final l f3017m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3019o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3020p = false;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f3018n = new byte[1];

    public j(h hVar, l lVar) {
        this.f3016l = hVar;
        this.f3017m = lVar;
    }

    public final void a() {
        if (this.f3019o) {
            return;
        }
        this.f3016l.b(this.f3017m);
        this.f3019o = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3020p) {
            return;
        }
        this.f3016l.close();
        this.f3020p = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f3018n;
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
        W.a.j(!this.f3020p);
        a();
        int read = this.f3016l.read(bArr, i4, i5);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
