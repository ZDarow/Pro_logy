package p071R2;

/* renamed from: R2.E */
/* loaded from: classes.dex */
public final class C0584E extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public /* synthetic */ java.lang.Object f1832p;

    /* renamed from: q */
    public final /* synthetic */ p048M.C0397d f1833q;

    /* renamed from: r */
    public final /* synthetic */ double f1834r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0584E(p048M.C0397d c0397d, double d4, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f1833q = c0397d;
        this.f1834r = d4;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p071R2.C0584E c0584e = new p071R2.C0584E(this.f1833q, this.f1834r, interfaceC1190d);
        c0584e.f1832p = obj;
        return c0584e;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        p071R2.C0584E c0584e = (p071R2.C0584E) mo659g((p110b3.InterfaceC1190d) obj2, (p048M.C0395b) obj);
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        c0584e.mo660k(c0934g);
        return c0934g;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p176p1.AbstractC1949a.m3913P(obj);
        ((p048M.C0395b) this.f1832p).m857d(this.f1833q, new java.lang.Double(this.f1834r));
        return p100Z2.C0934g.f3298a;
    }
}
