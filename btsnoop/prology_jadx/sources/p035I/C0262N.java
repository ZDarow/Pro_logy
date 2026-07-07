package p035I;

/* renamed from: I.N */
/* loaded from: classes.dex */
public final class C0262N extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f777p;

    /* renamed from: q */
    public /* synthetic */ java.lang.Object f778q;

    /* renamed from: r */
    public final /* synthetic */ p035I.C0265Q f779r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0262N(p035I.C0265Q c0265q, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f779r = c0265q;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p035I.C0262N c0262n = new p035I.C0262N(this.f779r, interfaceC1190d);
        c0262n.f778q = obj;
        return c0262n;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p035I.C0262N) mo659g((p110b3.InterfaceC1190d) obj2, (p035I.C0267T) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f777p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p035I.C0267T c0267t = (p035I.C0267T) this.f778q;
            this.f777p = 1;
            if (p035I.C0265Q.m663c(this.f779r, c0267t, this) == enumC1252a) {
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
