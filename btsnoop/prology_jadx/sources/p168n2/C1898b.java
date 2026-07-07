package p168n2;

/* renamed from: n2.b */
/* loaded from: classes.dex */
public final class C1898b extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f7738p;

    /* renamed from: q */
    public final /* synthetic */ p168n2.C1899c f7739q;

    /* renamed from: r */
    public final /* synthetic */ p047L2.InterfaceC0386p f7740r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1898b(p168n2.C1899c c1899c, p047L2.InterfaceC0386p interfaceC0386p, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f7739q = c1899c;
        this.f7740r = interfaceC0386p;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p168n2.C1898b(this.f7739q, this.f7740r, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p168n2.C1898b) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f7738p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            this.f7738p = 1;
            obj = p187r3.AbstractC2131v.m4255n(p187r3.AbstractC2074B.f8426b, new p168n2.C1897a(this.f7739q, null), this);
            if (obj == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p176p1.AbstractC1949a.m3913P(obj);
        }
        this.f7740r.mo742b((java.util.ArrayList) obj);
        return p100Z2.C0934g.f3298a;
    }
}
