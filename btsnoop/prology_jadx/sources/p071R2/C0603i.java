package p071R2;

/* renamed from: R2.i */
/* loaded from: classes.dex */
public final class C0603i extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public /* synthetic */ java.lang.Object f1881p;

    /* renamed from: q */
    public final /* synthetic */ java.util.List f1882q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0603i(java.util.List list, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f1882q = list;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p071R2.C0603i c0603i = new p071R2.C0603i(this.f1882q, interfaceC1190d);
        c0603i.f1881p = obj;
        return c0603i;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        p071R2.C0603i c0603i = (p071R2.C0603i) mo659g((p110b3.InterfaceC1190d) obj2, (p048M.C0395b) obj);
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        c0603i.mo660k(c0934g);
        return c0934g;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p176p1.AbstractC1949a.m3913P(obj);
        p048M.C0395b c0395b = (p048M.C0395b) this.f1881p;
        java.util.List<java.lang.String> list = this.f1882q;
        if (list != null) {
            for (java.lang.String str : list) {
                p154k3.AbstractC1803h.m3779e(str, "name");
                p048M.C0397d c0397d = new p048M.C0397d(str);
                c0395b.m855b();
                c0395b.f1142a.remove(c0397d);
            }
        } else {
            c0395b.m855b();
            c0395b.f1142a.clear();
        }
        return p100Z2.C0934g.f3298a;
    }
}
