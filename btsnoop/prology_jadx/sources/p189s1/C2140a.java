package p189s1;

/* renamed from: s1.a */
/* loaded from: classes.dex */
public final class C2140a extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f8533p;

    /* renamed from: q */
    public final /* synthetic */ p200u3.InterfaceC2250d f8534q;

    /* renamed from: r */
    public final /* synthetic */ p009B2.C0060q f8535r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2140a(p200u3.InterfaceC2250d interfaceC2250d, p009B2.C0060q c0060q, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f8534q = interfaceC2250d;
        this.f8535r = c0060q;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p189s1.C2140a(this.f8534q, this.f8535r, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p189s1.C2140a) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f8533p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p035I.C0304z c0304z = new p035I.C0304z(1, this.f8535r);
            this.f8533p = 1;
            if (this.f8534q.mo266C(c0304z, this) == enumC1252a) {
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
