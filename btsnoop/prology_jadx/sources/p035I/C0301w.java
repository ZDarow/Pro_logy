package p035I;

/* renamed from: I.w */
/* loaded from: classes.dex */
public final class C0301w extends p120d3.AbstractC1297g implements p149j3.InterfaceC1737l {

    /* renamed from: p */
    public int f904p;

    /* renamed from: q */
    public final /* synthetic */ p035I.C0256H f905q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0301w(p035I.C0256H c0256h, p110b3.InterfaceC1190d interfaceC1190d) {
        super(1, interfaceC1190d);
        this.f905q = c0256h;
    }

    @Override // p149j3.InterfaceC1737l
    /* renamed from: b */
    public final java.lang.Object mo661b(java.lang.Object obj) {
        return new p035I.C0301w(this.f905q, (p110b3.InterfaceC1190d) obj).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f904p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            this.f904p = 1;
            obj = this.f905q.mo661b(this);
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
