package p035I;

/* renamed from: I.r */
/* loaded from: classes.dex */
public final class C0296r extends p120d3.AbstractC1297g implements p149j3.InterfaceC1742q {

    /* renamed from: p */
    public final /* synthetic */ int f887p = 1;

    /* renamed from: q */
    public int f888q;

    /* renamed from: r */
    public /* synthetic */ java.lang.Object f889r;

    public /* synthetic */ C0296r(int i4, p110b3.InterfaceC1190d interfaceC1190d) {
        super(i4, interfaceC1190d);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        switch (this.f887p) {
            case 0:
                p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
                int i4 = this.f888q;
                if (i4 == 0) {
                    p176p1.AbstractC1949a.m3913P(obj);
                    this.f888q = 1;
                    if (p035I.C0265Q.m662a((p035I.C0265Q) this.f889r, this) == enumC1252a) {
                        return enumC1252a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p176p1.AbstractC1949a.m3913P(obj);
                }
                return p100Z2.C0934g.f3298a;
            default:
                p115c3.EnumC1252a enumC1252a2 = p115c3.EnumC1252a.f4880l;
                int i5 = this.f888q;
                if (i5 == 0) {
                    p176p1.AbstractC1949a.m3913P(obj);
                    p040K.C0313c c0313c = (p040K.C0313c) this.f889r;
                    this.f888q = 1;
                    c0313c.getClass();
                    obj = p040K.C0313c.m712a(c0313c, this);
                    if (obj == enumC1252a2) {
                        return enumC1252a2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p176p1.AbstractC1949a.m3913P(obj);
                }
                return obj;
        }
    }

    /* renamed from: p */
    public final java.lang.Object m706p(java.lang.Object obj, java.lang.Object obj2, p120d3.AbstractC1292b abstractC1292b) {
        switch (this.f887p) {
            case 0:
                return new p035I.C0296r((p035I.C0265Q) this.f889r, abstractC1292b).mo660k(p100Z2.C0934g.f3298a);
            default:
                ((java.lang.Boolean) obj2).getClass();
                p035I.C0296r c0296r = new p035I.C0296r(3, abstractC1292b);
                c0296r.f889r = (p040K.C0313c) obj;
                return c0296r.mo660k(p100Z2.C0934g.f3298a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0296r(p035I.C0265Q c0265q, p110b3.InterfaceC1190d interfaceC1190d) {
        super(3, interfaceC1190d);
        this.f889r = c0265q;
    }
}
