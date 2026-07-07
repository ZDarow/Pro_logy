package p035I;

/* renamed from: I.J */
/* loaded from: classes.dex */
public final class C0258J extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f767p;

    /* renamed from: q */
    public final /* synthetic */ p120d3.AbstractC1297g f768q;

    /* renamed from: r */
    public final /* synthetic */ p035I.C0278c f769r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0258J(p149j3.InterfaceC1741p interfaceC1741p, p035I.C0278c c0278c, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f768q = (p120d3.AbstractC1297g) interfaceC1741p;
        this.f769r = c0278c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d3.g, j3.p] */
    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p035I.C0258J(this.f768q, this.f769r, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p035I.C0258J) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [d3.g, j3.p] */
    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f767p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            java.lang.Object obj2 = this.f769r.f831b;
            this.f767p = 1;
            obj = this.f768q.mo502h(obj2, this);
            if (obj == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p176p1.AbstractC1949a.m3913P(obj);
        }
        return obj;
    }
}
