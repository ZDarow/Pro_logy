package p161m0;

/* renamed from: m0.l */
/* loaded from: classes.dex */
public final class RunnableC1855l implements java.lang.Runnable, java.io.Closeable {

    /* renamed from: l */
    public final android.os.Handler f7515l = p086W.AbstractC0805y.m1619n(null);

    /* renamed from: m */
    public final long f7516m;

    /* renamed from: n */
    public boolean f7517n;

    /* renamed from: o */
    public final /* synthetic */ p161m0.C1856m f7518o;

    public RunnableC1855l(p161m0.C1856m c1856m, long j4) {
        this.f7518o = c1856m;
        this.f7516m = j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7517n = false;
        this.f7515l.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        p161m0.C1856m c1856m = this.f7518o;
        p063P2.C0528a c0528a = c1856m.f7529r;
        c0528a.m1031l(c0528a.m1027h(4, c1856m.f7533v, p129f2.C1425h0.f5764r, c1856m.f7530s));
        this.f7515l.postDelayed(this, this.f7516m);
    }
}
