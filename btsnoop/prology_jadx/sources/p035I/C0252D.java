package p035I;

/* renamed from: I.D */
/* loaded from: classes.dex */
public final class C0252D extends p120d3.AbstractC1297g implements p149j3.InterfaceC1737l {

    /* renamed from: p */
    public java.lang.Throwable f737p;

    /* renamed from: q */
    public int f738q;

    /* renamed from: r */
    public final /* synthetic */ p035I.C0265Q f739r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0252D(p035I.C0265Q c0265q, p110b3.InterfaceC1190d interfaceC1190d) {
        super(1, interfaceC1190d);
        this.f739r = c0265q;
    }

    @Override // p149j3.InterfaceC1737l
    /* renamed from: b */
    public final java.lang.Object mo661b(java.lang.Object obj) {
        return new p035I.C0252D(this.f739r, (p110b3.InterfaceC1190d) obj).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        java.lang.Throwable th;
        p035I.AbstractC0277b0 abstractC0277b0;
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f738q;
        p035I.C0265Q c0265q = this.f739r;
        try {
        } catch (java.lang.Throwable th2) {
            p035I.C0275a0 m669h = c0265q.m669h();
            this.f737p = th2;
            this.f738q = 2;
            java.lang.Integer m673a = m669h.m673a();
            if (m673a == enumC1252a) {
                return enumC1252a;
            }
            th = th2;
            obj = m673a;
        }
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            this.f738q = 1;
            obj = p035I.C0265Q.m666g(c0265q, true, this);
            if (obj == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f737p;
                p176p1.AbstractC1949a.m3913P(obj);
                abstractC0277b0 = new p035I.C0268U(th, ((java.lang.Number) obj).intValue());
                return new p100Z2.C0929b(abstractC0277b0, java.lang.Boolean.TRUE);
            }
            p176p1.AbstractC1949a.m3913P(obj);
        }
        abstractC0277b0 = (p035I.AbstractC0277b0) obj;
        return new p100Z2.C0929b(abstractC0277b0, java.lang.Boolean.TRUE);
    }
}
