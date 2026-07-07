package p035I;

/* renamed from: I.E */
/* loaded from: classes.dex */
public final class C0253E extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public java.lang.Throwable f740p;

    /* renamed from: q */
    public int f741q;

    /* renamed from: r */
    public /* synthetic */ boolean f742r;

    /* renamed from: s */
    public final /* synthetic */ p035I.C0265Q f743s;

    /* renamed from: t */
    public final /* synthetic */ int f744t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253E(p035I.C0265Q c0265q, int i4, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f743s = c0265q;
        this.f744t = i4;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p035I.C0253E c0253e = new p035I.C0253E(this.f743s, this.f744t, interfaceC1190d);
        c0253e.f742r = ((java.lang.Boolean) obj).booleanValue();
        return c0253e;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return ((p035I.C0253E) mo659g((p110b3.InterfaceC1190d) obj2, bool)).mo660k(p100Z2.C0934g.f3298a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        java.lang.Throwable th;
        int i4;
        boolean z4;
        p035I.AbstractC0277b0 abstractC0277b0;
        boolean z5;
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        boolean z6 = this.f741q;
        p035I.C0265Q c0265q = this.f743s;
        try {
        } catch (java.lang.Throwable th2) {
            if (z6 != 0) {
                p035I.C0275a0 m669h = c0265q.m669h();
                this.f740p = th2;
                this.f742r = z6;
                this.f741q = 2;
                java.lang.Integer m673a = m669h.m673a();
                if (m673a == enumC1252a) {
                    return enumC1252a;
                }
                z4 = z6;
                th = th2;
                obj = m673a;
            } else {
                boolean z7 = z6;
                th = th2;
                i4 = this.f744t;
                z4 = z7;
            }
        }
        if (z6 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            boolean z8 = this.f742r;
            this.f742r = z8;
            this.f741q = 1;
            obj = p035I.C0265Q.m666g(c0265q, z8, this);
            z6 = z8;
            if (obj == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (z6 != 1) {
                if (z6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = this.f742r;
                th = this.f740p;
                p176p1.AbstractC1949a.m3913P(obj);
                i4 = ((java.lang.Number) obj).intValue();
                p035I.C0268U c0268u = new p035I.C0268U(th, i4);
                z5 = z4;
                abstractC0277b0 = c0268u;
                return new p100Z2.C0929b(abstractC0277b0, java.lang.Boolean.valueOf(z5));
            }
            boolean z9 = this.f742r;
            p176p1.AbstractC1949a.m3913P(obj);
            z6 = z9;
        }
        abstractC0277b0 = (p035I.AbstractC0277b0) obj;
        z5 = z6;
        return new p100Z2.C0929b(abstractC0277b0, java.lang.Boolean.valueOf(z5));
    }
}
