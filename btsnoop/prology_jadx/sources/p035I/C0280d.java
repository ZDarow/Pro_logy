package p035I;

/* renamed from: I.d */
/* loaded from: classes.dex */
public final class C0280d extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f834p;

    /* renamed from: q */
    public /* synthetic */ java.lang.Object f835q;

    /* renamed from: r */
    public final /* synthetic */ java.util.List f836r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0280d(java.util.List list, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f836r = list;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p035I.C0280d c0280d = new p035I.C0280d(this.f836r, interfaceC1190d);
        c0280d.f835q = obj;
        return c0280d;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p035I.C0280d) mo659g((p110b3.InterfaceC1190d) obj2, (p035I.C0289k) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f834p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p035I.C0289k c0289k = (p035I.C0289k) this.f835q;
            this.f834p = 1;
            if (p101a.AbstractC0936a.m1791b(this.f836r, c0289k, this) == enumC1252a) {
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
