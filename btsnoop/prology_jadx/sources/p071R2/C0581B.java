package p071R2;

/* renamed from: R2.B */
/* loaded from: classes.dex */
public final class C0581B extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public /* synthetic */ java.lang.Object f1821p;

    /* renamed from: q */
    public final /* synthetic */ p048M.C0397d f1822q;

    /* renamed from: r */
    public final /* synthetic */ boolean f1823r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0581B(p048M.C0397d c0397d, boolean z4, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f1822q = c0397d;
        this.f1823r = z4;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p071R2.C0581B c0581b = new p071R2.C0581B(this.f1822q, this.f1823r, interfaceC1190d);
        c0581b.f1821p = obj;
        return c0581b;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        p071R2.C0581B c0581b = (p071R2.C0581B) mo659g((p110b3.InterfaceC1190d) obj2, (p048M.C0395b) obj);
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        c0581b.mo660k(c0934g);
        return c0934g;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p176p1.AbstractC1949a.m3913P(obj);
        ((p048M.C0395b) this.f1821p).m857d(this.f1822q, java.lang.Boolean.valueOf(this.f1823r));
        return p100Z2.C0934g.f3298a;
    }
}
