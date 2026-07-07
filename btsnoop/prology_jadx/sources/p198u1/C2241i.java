package p198u1;

/* renamed from: u1.i */
/* loaded from: classes.dex */
public final class C2241i extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f8928p;

    /* renamed from: q */
    public /* synthetic */ java.lang.Object f8929q;

    /* renamed from: r */
    public final /* synthetic */ p198u1.C2234b f8930r;

    /* renamed from: s */
    public final /* synthetic */ android.app.Activity f8931s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2241i(p198u1.C2234b c2234b, android.app.Activity activity, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f8930r = c2234b;
        this.f8931s = activity;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p198u1.C2241i c2241i = new p198u1.C2241i(this.f8930r, this.f8931s, interfaceC1190d);
        c2241i.f8929q = obj;
        return c2241i;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p198u1.C2241i) mo659g((p110b3.InterfaceC1190d) obj2, (p195t3.InterfaceC2202o) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f8928p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p195t3.InterfaceC2202o interfaceC2202o = (p195t3.InterfaceC2202o) this.f8929q;
            p009B2.C0060q c0060q = new p009B2.C0060q(1, interfaceC2202o);
            p198u1.C2234b c2234b = this.f8930r;
            ((p203v1.InterfaceC2270a) c2234b.f8914m).mo4459b(this.f8931s, new p142i1.ExecutorC1537b(0), c0060q);
            p044L.C0344b c0344b = new p044L.C0344b(1, c2234b, c0060q);
            this.f8928p = 1;
            if (p195t3.AbstractC2196i.m4374b(interfaceC2202o, c0344b, this) == enumC1252a) {
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
