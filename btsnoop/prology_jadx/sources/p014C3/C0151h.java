package p014C3;

/* renamed from: C3.h */
/* loaded from: classes.dex */
public final class C0151h extends p154k3.AbstractC1804i implements p149j3.InterfaceC1741p {

    /* renamed from: m */
    public final /* synthetic */ p010B3.C0085p f412m;

    /* renamed from: n */
    public final /* synthetic */ p154k3.C1811p f413n;

    /* renamed from: o */
    public final /* synthetic */ p154k3.C1811p f414o;

    /* renamed from: p */
    public final /* synthetic */ p154k3.C1811p f415p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0151h(p010B3.C0085p c0085p, p154k3.C1811p c1811p, p154k3.C1811p c1811p2, p154k3.C1811p c1811p3) {
        super(2);
        this.f412m = c0085p;
        this.f413n = c1811p;
        this.f414o = c1811p2;
        this.f415p = c1811p3;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        if (intValue == 21589) {
            if (longValue < 1) {
                throw new java.io.IOException("bad zip: extended timestamp extra too short");
            }
            p010B3.C0085p c0085p = this.f412m;
            c0085p.m345f(1L);
            byte m294e = c0085p.f263m.m294e();
            boolean z4 = (m294e & 1) == 1;
            boolean z5 = (m294e & 2) == 2;
            boolean z6 = (m294e & 4) == 4;
            long j4 = z4 ? 5L : 1L;
            if (z5) {
                j4 += 4;
            }
            if (z6) {
                j4 += 4;
            }
            if (longValue < j4) {
                throw new java.io.IOException("bad zip: extended timestamp extra too short");
            }
            if (z4) {
                this.f413n.f7374l = java.lang.Long.valueOf(c0085p.m341a() * 1000);
            }
            if (z5) {
                this.f414o.f7374l = java.lang.Long.valueOf(c0085p.m341a() * 1000);
            }
            if (z6) {
                this.f415p.f7374l = java.lang.Long.valueOf(c0085p.m341a() * 1000);
            }
        }
        return p100Z2.C0934g.f3298a;
    }
}
