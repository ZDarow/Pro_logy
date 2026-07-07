package p161m0;

/* renamed from: m0.y */
/* loaded from: classes.dex */
public final class C1868y implements java.io.Closeable {

    /* renamed from: r */
    public static final java.nio.charset.Charset f7593r = p124e2.AbstractC1356d.f5630c;

    /* renamed from: l */
    public final p094Y.C0886x f7594l;

    /* renamed from: m */
    public final p197u0.C2227n f7595m = new p197u0.C2227n("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: n */
    public final java.util.Map f7596n = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: o */
    public p161m0.C1867x f7597o;

    /* renamed from: p */
    public java.net.Socket f7598p;

    /* renamed from: q */
    public volatile boolean f7599q;

    public C1868y(p094Y.C0886x c0886x) {
        this.f7594l = c0886x;
    }

    /* renamed from: a */
    public final void m3841a(java.net.Socket socket) {
        this.f7598p = socket;
        this.f7597o = new p161m0.C1867x(this, socket.getOutputStream());
        this.f7595m.m4434f(new p161m0.C1866w(this, socket.getInputStream()), new p129f2.C1408Y(18, this), 0);
    }

    /* renamed from: b */
    public final void m3842b(p129f2.C1415c0 c1415c0) {
        p086W.AbstractC0781a.m1422k(this.f7597o);
        p161m0.C1867x c1867x = this.f7597o;
        c1867x.getClass();
        c1867x.f7591n.post(new p086W.RunnableC0793m(c1867x, new p124e2.C1358f(p161m0.AbstractC1869z.f7607h).m3115b(c1415c0).getBytes(f7593r), c1415c0, 10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7599q) {
            return;
        }
        try {
            p161m0.C1867x c1867x = this.f7597o;
            if (c1867x != null) {
                c1867x.close();
            }
            this.f7595m.m4433e(null);
            java.net.Socket socket = this.f7598p;
            if (socket != null) {
                socket.close();
            }
            this.f7599q = true;
        } catch (java.lang.Throwable th) {
            this.f7599q = true;
            throw th;
        }
    }
}
