package p035I;

/* renamed from: I.o */
/* loaded from: classes.dex */
public final class C0293o extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f882p;

    /* renamed from: q */
    public final /* synthetic */ p035I.C0265Q f883q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0293o(p035I.C0265Q c0265q, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f883q = c0265q;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p035I.C0293o(this.f883q, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p035I.C0293o) mo659g((p110b3.InterfaceC1190d) obj2, (p200u3.InterfaceC2251e) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f882p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            this.f882p = 1;
            if (p035I.C0265Q.m664e(this.f883q, this) == enumC1252a) {
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
