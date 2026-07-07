package p094Y;

/* renamed from: Y.b */
/* loaded from: classes.dex */
public final class C0864b extends p094Y.AbstractC0865c {

    /* renamed from: p */
    public final android.content.res.AssetManager f3101p;

    /* renamed from: q */
    public android.net.Uri f3102q;

    /* renamed from: r */
    public java.io.InputStream f3103r;

    /* renamed from: s */
    public long f3104s;

    /* renamed from: t */
    public boolean f3105t;

    public C0864b(android.content.Context context) {
        super(false);
        this.f3101p = context.getAssets();
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        try {
            android.net.Uri uri = c0874l.f3135a;
            long j4 = c0874l.f3139e;
            this.f3102q = uri;
            java.lang.String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m1692f();
            java.io.InputStream open = this.f3101p.open(path, 1);
            this.f3103r = open;
            if (open.skip(j4) < j4) {
                throw new p094Y.C0871i((java.lang.Exception) null, 2008);
            }
            long j5 = c0874l.f3140f;
            if (j5 != -1) {
                this.f3104s = j5;
            } else {
                long available = this.f3103r.available();
                this.f3104s = available;
                if (available == 2147483647L) {
                    this.f3104s = -1L;
                }
            }
            this.f3105t = true;
            m1693i(c0874l);
            return this.f3104s;
        } catch (p094Y.C0863a e4) {
            throw e4;
        } catch (java.io.IOException e5) {
            throw new p094Y.C0871i(e5, e5 instanceof java.io.FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        this.f3102q = null;
        try {
            try {
                java.io.InputStream inputStream = this.f3103r;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (java.io.IOException e4) {
                throw new p094Y.C0871i(e4, 2000);
            }
        } finally {
            this.f3103r = null;
            if (this.f3105t) {
                this.f3105t = false;
                m1691c();
            }
        }
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        return this.f3102q;
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f3104s;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i5 = (int) java.lang.Math.min(j4, i5);
            } catch (java.io.IOException e4) {
                throw new p094Y.C0871i(e4, 2000);
            }
        }
        java.io.InputStream inputStream = this.f3103r;
        int i6 = p086W.AbstractC0805y.f2801a;
        int read = inputStream.read(bArr, i4, i5);
        if (read == -1) {
            return -1;
        }
        long j5 = this.f3104s;
        if (j5 != -1) {
            this.f3104s = j5 - read;
        }
        m1690a(read);
        return read;
    }
}
