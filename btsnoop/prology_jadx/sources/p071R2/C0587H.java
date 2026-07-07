package p071R2;

/* renamed from: R2.H */
/* loaded from: classes.dex */
public final class C0587H extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public /* synthetic */ java.lang.Object f1843p;

    /* renamed from: q */
    public final /* synthetic */ p048M.C0397d f1844q;

    /* renamed from: r */
    public final /* synthetic */ long f1845r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0587H(p048M.C0397d c0397d, long j4, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f1844q = c0397d;
        this.f1845r = j4;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p071R2.C0587H c0587h = new p071R2.C0587H(this.f1844q, this.f1845r, interfaceC1190d);
        c0587h.f1843p = obj;
        return c0587h;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        p071R2.C0587H c0587h = (p071R2.C0587H) mo659g((p110b3.InterfaceC1190d) obj2, (p048M.C0395b) obj);
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        c0587h.mo660k(c0934g);
        return c0934g;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p176p1.AbstractC1949a.m3913P(obj);
        ((p048M.C0395b) this.f1843p).m857d(this.f1844q, new java.lang.Long(this.f1845r));
        return p100Z2.C0934g.f3298a;
    }
}
