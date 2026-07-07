package p083V0;

/* renamed from: V0.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0776n implements p086W.InterfaceC0783c, p086W.InterfaceC0788h {

    /* renamed from: l */
    public final /* synthetic */ int f2718l;

    /* renamed from: m */
    public final /* synthetic */ long f2719m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f2720n;

    public /* synthetic */ C0776n(p083V0.C0777o c0777o, long j4, int i4) {
        this.f2720n = c0777o;
        this.f2719m = j4;
        this.f2718l = i4;
    }

    @Override // p086W.InterfaceC0783c
    public void accept(java.lang.Object obj) {
        p083V0.C0763a c0763a = (p083V0.C0763a) obj;
        p083V0.C0777o c0777o = (p083V0.C0777o) this.f2720n;
        p086W.AbstractC0781a.m1422k(c0777o.f2728h);
        byte[] m583t = p025F1.C0215g.m583t(c0763a.f2687a, c0763a.f2689c);
        p086W.C0798r c0798r = c0777o.f2723c;
        c0798r.getClass();
        c0798r.m1535E(m583t, m583t.length);
        c0777o.f2721a.mo1405a(c0798r, m583t.length, 0);
        long j4 = c0763a.f2688b;
        long j5 = this.f2719m;
        if (j4 == -9223372036854775807L) {
            p086W.AbstractC0781a.m1421j(c0777o.f2728h.f2413r == Long.MAX_VALUE);
        } else {
            long j6 = c0777o.f2728h.f2413r;
            j5 = j6 == Long.MAX_VALUE ? j5 + j4 : j4 + j6;
        }
        c0777o.f2721a.mo1406b(j5, this.f2718l, m583t.length, 0, null);
    }

    @Override // p086W.InterfaceC0788h
    /* renamed from: b */
    public void mo285b(java.lang.Object obj) {
        p107b0.C1175j c1175j = (p107b0.C1175j) obj;
        c1175j.getClass();
        p107b0.C1166a c1166a = (p107b0.C1166a) this.f2720n;
        p179q0.C1964F c1964f = c1166a.f4485d;
        if (c1964f != null) {
            java.lang.String m2749c = c1175j.f4524b.m2749c(c1166a.f4483b, c1964f);
            java.util.HashMap hashMap = c1175j.f4530h;
            java.lang.Long l4 = (java.lang.Long) hashMap.get(m2749c);
            java.util.HashMap hashMap2 = c1175j.f4529g;
            java.lang.Long l5 = (java.lang.Long) hashMap2.get(m2749c);
            hashMap.put(m2749c, java.lang.Long.valueOf((l4 == null ? 0L : l4.longValue()) + this.f2719m));
            hashMap2.put(m2749c, java.lang.Long.valueOf((l5 != null ? l5.longValue() : 0L) + this.f2718l));
        }
    }

    public /* synthetic */ C0776n(p107b0.C1166a c1166a, int i4, long j4, long j5) {
        this.f2720n = c1166a;
        this.f2718l = i4;
        this.f2719m = j4;
    }
}
