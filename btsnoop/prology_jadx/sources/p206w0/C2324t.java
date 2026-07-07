package p206w0;

/* renamed from: w0.t */
/* loaded from: classes.dex */
public final class C2324t {

    /* renamed from: a */
    public final p206w0.C2305a f9229a;

    /* renamed from: b */
    public final p206w0.C2320p f9230b;

    /* renamed from: c */
    public final p009B2.C0038I f9231c = new p009B2.C0038I();

    /* renamed from: d */
    public final p073S0.C0629g f9232d = new p073S0.C0629g();

    /* renamed from: e */
    public final p073S0.C0629g f9233e = new p073S0.C0629g();

    /* renamed from: f */
    public final p086W.C0792l f9234f;

    /* renamed from: g */
    public p076T.C0690d0 f9235g;

    /* renamed from: h */
    public p076T.C0690d0 f9236h;

    /* renamed from: i */
    public long f9237i;

    /* renamed from: j */
    public long f9238j;

    /* JADX WARN: Type inference failed for: r3v4, types: [W.l, java.lang.Object] */
    public C2324t(p206w0.C2305a c2305a, p206w0.C2320p c2320p) {
        this.f9229a = c2305a;
        this.f9230b = c2320p;
        ?? obj = new java.lang.Object();
        int highestOneBit = java.lang.Integer.bitCount(16) != 1 ? java.lang.Integer.highestOneBit(15) << 1 : 16;
        obj.f2765a = 0;
        obj.f2766b = 0;
        obj.f2768d = new long[highestOneBit];
        obj.f2767c = highestOneBit - 1;
        this.f9234f = obj;
        this.f9236h = p076T.C0690d0.f2310e;
        this.f9238j = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m4528a() {
        p086W.C0792l c0792l = this.f9234f;
        c0792l.f2765a = 0;
        c0792l.f2766b = 0;
        this.f9238j = -9223372036854775807L;
        p073S0.C0629g c0629g = this.f9233e;
        if (c0629g.m1151i() > 0) {
            p086W.AbstractC0781a.m1416e(c0629g.m1151i() > 0);
            while (c0629g.m1151i() > 1) {
                c0629g.m1148f();
            }
            java.lang.Object m1148f = c0629g.m1148f();
            m1148f.getClass();
            c0629g.m1143a(0L, (java.lang.Long) m1148f);
        }
        p076T.C0690d0 c0690d0 = this.f9235g;
        p073S0.C0629g c0629g2 = this.f9232d;
        if (c0690d0 != null) {
            c0629g2.m1145c();
            return;
        }
        if (c0629g2.m1151i() > 0) {
            p086W.AbstractC0781a.m1416e(c0629g2.m1151i() > 0);
            while (c0629g2.m1151i() > 1) {
                c0629g2.m1148f();
            }
            java.lang.Object m1148f2 = c0629g2.m1148f();
            m1148f2.getClass();
            this.f9235g = (p076T.C0690d0) m1148f2;
        }
    }
}
