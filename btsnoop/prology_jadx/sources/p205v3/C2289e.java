package p205v3;

/* renamed from: v3.e */
/* loaded from: classes.dex */
public final class C2289e extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f9073p;

    /* renamed from: q */
    public /* synthetic */ java.lang.Object f9074q;

    /* renamed from: r */
    public final /* synthetic */ p205v3.AbstractC2290f f9075r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2289e(p205v3.AbstractC2290f abstractC2290f, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f9075r = abstractC2290f;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p205v3.C2289e c2289e = new p205v3.C2289e(this.f9075r, interfaceC1190d);
        c2289e.f9074q = obj;
        return c2289e;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p205v3.C2289e) mo659g((p110b3.InterfaceC1190d) obj2, (p195t3.InterfaceC2202o) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f9073p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p195t3.InterfaceC2202o interfaceC2202o = (p195t3.InterfaceC2202o) this.f9074q;
            this.f9073p = 1;
            if (this.f9075r.mo4445a(interfaceC2202o, this) == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p176p1.AbstractC1949a.m3913P(obj);
        }
        return p100Z2.C0934g.f3298a;
    }
}
