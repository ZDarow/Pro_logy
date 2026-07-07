package p035I;

/* renamed from: I.q */
/* loaded from: classes.dex */
public final class C0295q extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public /* synthetic */ java.lang.Object f885p;

    /* renamed from: q */
    public final /* synthetic */ p035I.AbstractC0277b0 f886q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0295q(p035I.AbstractC0277b0 abstractC0277b0, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f886q = abstractC0277b0;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p035I.C0295q c0295q = new p035I.C0295q(this.f886q, interfaceC1190d);
        c0295q.f885p = obj;
        return c0295q;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p035I.C0295q) mo659g((p110b3.InterfaceC1190d) obj2, (p035I.AbstractC0277b0) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p176p1.AbstractC1949a.m3913P(obj);
        p035I.AbstractC0277b0 abstractC0277b0 = (p035I.AbstractC0277b0) this.f885p;
        return java.lang.Boolean.valueOf((abstractC0277b0 instanceof p035I.C0278c) && abstractC0277b0.f830a <= this.f886q.f830a);
    }
}
