package p035I;

/* renamed from: I.f */
/* loaded from: classes.dex */
public final class C0284f extends p120d3.AbstractC1297g implements p149j3.InterfaceC1737l {

    /* renamed from: p */
    public int f844p;

    @Override // p149j3.InterfaceC1737l
    /* renamed from: b */
    public final java.lang.Object mo661b(java.lang.Object obj) {
        p120d3.AbstractC1297g abstractC1297g = new p120d3.AbstractC1297g(1, (p110b3.InterfaceC1190d) obj);
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        abstractC1297g.mo660k(c0934g);
        return c0934g;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        int i4 = this.f844p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            this.f844p = 1;
            throw null;
        }
        if (i4 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p176p1.AbstractC1949a.m3913P(obj);
        return p100Z2.C0934g.f3298a;
    }
}
