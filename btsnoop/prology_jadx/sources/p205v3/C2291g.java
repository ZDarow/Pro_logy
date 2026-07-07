package p205v3;

/* renamed from: v3.g */
/* loaded from: classes.dex */
public final class C2291g extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f9079p;

    /* renamed from: q */
    public /* synthetic */ java.lang.Object f9080q;

    /* renamed from: r */
    public final /* synthetic */ p205v3.C2292h f9081r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2291g(p205v3.C2292h c2292h, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f9081r = c2292h;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p205v3.C2291g c2291g = new p205v3.C2291g(this.f9081r, interfaceC1190d);
        c2291g.f9080q = obj;
        return c2291g;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p205v3.C2291g) mo659g((p110b3.InterfaceC1190d) obj2, (p200u3.InterfaceC2251e) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f9079p;
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p200u3.InterfaceC2251e interfaceC2251e = (p200u3.InterfaceC2251e) this.f9080q;
            this.f9079p = 1;
            java.lang.Object mo266C = this.f9081r.f9082o.mo266C(interfaceC2251e, this);
            if (mo266C != enumC1252a) {
                mo266C = c0934g;
            }
            if (mo266C == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p176p1.AbstractC1949a.m3913P(obj);
        }
        return c0934g;
    }
}
