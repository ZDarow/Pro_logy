package p048M;

/* renamed from: M.c */
/* loaded from: classes.dex */
public final class C0396c extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f1144p;

    /* renamed from: q */
    public /* synthetic */ java.lang.Object f1145q;

    /* renamed from: r */
    public final /* synthetic */ p120d3.AbstractC1297g f1146r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0396c(p149j3.InterfaceC1741p interfaceC1741p, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f1146r = (p120d3.AbstractC1297g) interfaceC1741p;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.g, j3.p] */
    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p048M.C0396c c0396c = new p048M.C0396c(this.f1146r, interfaceC1190d);
        c0396c.f1145q = obj;
        return c0396c;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p048M.C0396c) mo659g((p110b3.InterfaceC1190d) obj2, (p048M.C0395b) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [d3.g, j3.p] */
    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f1144p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p048M.C0395b c0395b = (p048M.C0395b) this.f1145q;
            this.f1144p = 1;
            obj = this.f1146r.mo502h(c0395b, this);
            if (obj == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p176p1.AbstractC1949a.m3913P(obj);
        }
        p048M.C0395b c0395b2 = (p048M.C0395b) obj;
        p154k3.AbstractC1803h.m3777c(c0395b2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        c0395b2.f1143b.f931a.set(true);
        return c0395b2;
    }
}
