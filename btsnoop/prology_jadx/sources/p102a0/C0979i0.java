package p102a0;

/* renamed from: a0.i0 */
/* loaded from: classes.dex */
public final class C0979i0 {

    /* renamed from: a */
    public final p102a0.AbstractC0970e f3625a;

    /* renamed from: b */
    public final p102a0.InterfaceC0975g0 f3626b;

    /* renamed from: c */
    public final p086W.C0800t f3627c;

    /* renamed from: d */
    public int f3628d;

    /* renamed from: e */
    public java.lang.Object f3629e;

    /* renamed from: f */
    public final android.os.Looper f3630f;

    /* renamed from: g */
    public boolean f3631g;

    /* renamed from: h */
    public boolean f3632h;

    /* renamed from: i */
    public boolean f3633i;

    public C0979i0(p102a0.InterfaceC0975g0 interfaceC0975g0, p102a0.AbstractC0970e abstractC0970e, p076T.AbstractC0677U abstractC0677U, int i4, p086W.C0800t c0800t, android.os.Looper looper) {
        this.f3626b = interfaceC0975g0;
        this.f3625a = abstractC0970e;
        this.f3630f = looper;
        this.f3627c = c0800t;
    }

    /* renamed from: a */
    public final synchronized void m2021a(long j4) {
        boolean z4;
        p086W.AbstractC0781a.m1421j(this.f3631g);
        p086W.AbstractC0781a.m1421j(this.f3630f.getThread() != java.lang.Thread.currentThread());
        this.f3627c.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() + j4;
        while (true) {
            z4 = this.f3633i;
            if (z4 || j4 <= 0) {
                break;
            }
            this.f3627c.getClass();
            wait(j4);
            this.f3627c.getClass();
            j4 = elapsedRealtime - android.os.SystemClock.elapsedRealtime();
        }
        if (!z4) {
            throw new java.util.concurrent.TimeoutException("Message delivery timed out.");
        }
    }

    /* renamed from: b */
    public final synchronized void m2022b(boolean z4) {
        this.f3632h = z4 | this.f3632h;
        this.f3633i = true;
        notifyAll();
    }

    /* renamed from: c */
    public final void m2023c() {
        p086W.AbstractC0781a.m1421j(!this.f3631g);
        this.f3631g = true;
        p102a0.C0950N c0950n = (p102a0.C0950N) this.f3626b;
        synchronized (c0950n) {
            if (!c0950n.f3409K && c0950n.f3438u.getThread().isAlive()) {
                c0950n.f3436s.m1569a(14, this).m1567b();
                return;
            }
            p086W.AbstractC0781a.m1410A("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            m2022b(false);
        }
    }
}
