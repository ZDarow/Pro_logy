package p206w0;

/* renamed from: w0.f */
/* loaded from: classes.dex */
public final class C2310f {

    /* renamed from: a */
    public final android.content.Context f9113a;

    /* renamed from: b */
    public final int f9114b;

    /* renamed from: c */
    public final java.util.ArrayList f9115c;

    /* renamed from: d */
    public p076T.C0702p f9116d;

    /* renamed from: e */
    public long f9117e;

    /* renamed from: f */
    public boolean f9118f;

    /* renamed from: g */
    public long f9119g;

    /* renamed from: h */
    public p206w0.InterfaceC2327w f9120h;

    /* renamed from: i */
    public java.util.concurrent.Executor f9121i;

    /* renamed from: j */
    public final /* synthetic */ p206w0.C2311g f9122j;

    public C2310f(p206w0.C2311g c2311g, android.content.Context context) {
        this.f9122j = c2311g;
        this.f9113a = context;
        this.f9114b = p086W.AbstractC0805y.m1589J(context) ? 1 : 5;
        this.f9115c = new java.util.ArrayList();
        this.f9117e = -9223372036854775807L;
        this.f9120h = p206w0.InterfaceC2327w.f9244j;
        this.f9121i = p206w0.C2311g.f9123m;
    }

    /* renamed from: a */
    public final void m4488a(boolean z4) {
        this.f9118f = false;
        this.f9117e = -9223372036854775807L;
        p206w0.C2311g c2311g = this.f9122j;
        if (c2311g.f9135l == 1) {
            c2311g.f9134k++;
            c2311g.f9126c.m4528a();
            p086W.C0802v c0802v = c2311g.f9132i;
            p086W.AbstractC0781a.m1422k(c0802v);
            c0802v.m1570c(new p026F2.RunnableC0226c(13, c2311g));
        }
        if (z4) {
            p206w0.C2320p c2320p = c2311g.f9125b;
            p206w0.C2323s c2323s = c2320p.f9197b;
            c2323s.f9224m = 0L;
            c2323s.f9227p = -1L;
            c2323s.f9225n = -1L;
            c2320p.f9202g = -9223372036854775807L;
            c2320p.f9200e = -9223372036854775807L;
            c2320p.m4519c(1);
            c2320p.f9203h = -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public final void m4489b(p076T.C0702p c0702p) {
        p206w0.C2311g c2311g = this.f9122j;
        p086W.AbstractC0781a.m1421j(c2311g.f9135l == 0);
        p076T.C0695i c0695i = c0702p.f2421z;
        if (c0695i == null || !c0695i.m1284d()) {
            c0695i = p076T.C0695i.f2330h;
        }
        if (c0695i.f2333c != 7 || p086W.AbstractC0805y.f2801a < 34) {
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        p086W.AbstractC0781a.m1422k(myLooper);
        c2311g.f9132i = c2311g.f9128e.m1565a(myLooper, null);
        try {
            p206w0.C2307c c2307c = c2311g.f9127d;
            p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
            p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
            c2307c.m4486a();
            android.util.Pair pair = c2311g.f9133j;
            if (pair == null) {
                throw null;
            }
            int i4 = ((p086W.C0799s) pair.second).f2790a;
            throw null;
        } catch (p076T.C0686b0 e4) {
            throw new p206w0.C2328x(e4, c0702p);
        }
    }

    /* renamed from: c */
    public final void m4490c() {
        if (this.f9116d == null) {
            return;
        }
        new java.util.ArrayList().addAll(this.f9115c);
        p076T.C0702p c0702p = this.f9116d;
        c0702p.getClass();
        p086W.AbstractC0781a.m1422k(null);
        p076T.C0695i c0695i = c0702p.f2421z;
        if (c0695i == null || !c0695i.m1284d()) {
            p076T.C0695i c0695i2 = p076T.C0695i.f2330h;
        }
        int i4 = c0702p.f2414s;
        p086W.AbstractC0781a.m1415d("width must be positive, but is: " + i4, i4 > 0);
        int i5 = c0702p.f2415t;
        p086W.AbstractC0781a.m1415d("height must be positive, but is: " + i5, i5 > 0);
        throw null;
    }

    /* renamed from: d */
    public final void m4491d(long j4, long j5) {
        try {
            this.f9122j.m4493a(j4, j5);
        } catch (p102a0.C0986m e4) {
            p076T.C0702p c0702p = this.f9116d;
            if (c0702p == null) {
                c0702p = new p076T.C0702p(new p076T.C0701o());
            }
            throw new p206w0.C2328x(e4, c0702p);
        }
    }

    /* renamed from: e */
    public final void m4492e(android.view.Surface surface, p086W.C0799s c0799s) {
        p206w0.C2311g c2311g = this.f9122j;
        android.util.Pair pair = c2311g.f9133j;
        if (pair != null && ((android.view.Surface) pair.first).equals(surface) && ((p086W.C0799s) c2311g.f9133j.second).equals(c0799s)) {
            return;
        }
        c2311g.f9133j = android.util.Pair.create(surface, c0799s);
        int i4 = c0799s.f2790a;
    }
}
