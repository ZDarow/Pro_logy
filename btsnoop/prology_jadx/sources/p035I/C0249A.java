package p035I;

/* renamed from: I.A */
/* loaded from: classes.dex */
public final class C0249A extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f724p;

    /* renamed from: q */
    public final /* synthetic */ p035I.C0265Q f725q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249A(p035I.C0265Q c0265q, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f725q = c0265q;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p035I.C0249A(this.f725q, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p035I.C0249A) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f724p;
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        p035I.C0265Q c0265q = this.f725q;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            this.f724p = 1;
            java.lang.Object m4239U = ((p187r3.C2120l) c0265q.f799t.f877m).m4239U(this);
            if (m4239U != enumC1252a) {
                m4239U = c0934g;
            }
            if (m4239U == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    p176p1.AbstractC1949a.m3913P(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p176p1.AbstractC1949a.m3913P(obj);
        }
        p200u3.InterfaceC2250d interfaceC2250d = c0265q.m669h().f829c;
        p200u3.InterfaceC2250d m4483a = interfaceC2250d instanceof p205v3.InterfaceC2294j ? p205v3.AbstractC2296l.m4483a((p205v3.InterfaceC2294j) interfaceC2250d, null, 0, 2, 1) : new p205v3.C2292h(interfaceC2250d, p110b3.C1196j.f4623l, 0, 2);
        p035I.C0304z c0304z = new p035I.C0304z(0, c0265q);
        this.f724p = 2;
        return m4483a.mo266C(c0304z, this) == enumC1252a ? enumC1252a : c0934g;
    }
}
