package p035I;

/* renamed from: I.I */
/* loaded from: classes.dex */
public final class C0257I extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f765p;

    /* renamed from: q */
    public final /* synthetic */ p035I.C0265Q f766q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0257I(p035I.C0265Q c0265q, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f766q = c0265q;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p035I.C0257I(this.f766q, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p035I.C0257I) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f765p;
        p035I.C0265Q c0265q = this.f766q;
        try {
            if (i4 == 0) {
                p176p1.AbstractC1949a.m3913P(obj);
                if (c0265q.f798s.m273h() instanceof p035I.C0266S) {
                    return c0265q.f798s.m273h();
                }
                this.f765p = 1;
                if (c0265q.m670i(this) == enumC1252a) {
                    return enumC1252a;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p176p1.AbstractC1949a.m3913P(obj);
                    return (p035I.AbstractC0277b0) obj;
                }
                p176p1.AbstractC1949a.m3913P(obj);
            }
            this.f765p = 2;
            obj = p035I.C0265Q.m665f(c0265q, false, this);
            if (obj == enumC1252a) {
                return enumC1252a;
            }
            return (p035I.AbstractC0277b0) obj;
        } catch (java.lang.Throwable th) {
            return new p035I.C0268U(th, -1);
        }
    }
}
