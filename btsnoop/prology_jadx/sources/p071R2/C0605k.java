package p071R2;

/* renamed from: R2.k */
/* loaded from: classes.dex */
public final class C0605k extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public /* synthetic */ java.lang.Object f1886p;

    /* renamed from: q */
    public final /* synthetic */ p048M.C0397d f1887q;

    /* renamed from: r */
    public final /* synthetic */ java.lang.String f1888r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0605k(p048M.C0397d c0397d, java.lang.String str, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f1887q = c0397d;
        this.f1888r = str;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p071R2.C0605k c0605k = new p071R2.C0605k(this.f1887q, this.f1888r, interfaceC1190d);
        c0605k.f1886p = obj;
        return c0605k;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        p071R2.C0605k c0605k = (p071R2.C0605k) mo659g((p110b3.InterfaceC1190d) obj2, (p048M.C0395b) obj);
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        c0605k.mo660k(c0934g);
        return c0934g;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p176p1.AbstractC1949a.m3913P(obj);
        ((p048M.C0395b) this.f1886p).m857d(this.f1887q, this.f1888r);
        return p100Z2.C0934g.f3298a;
    }
}
