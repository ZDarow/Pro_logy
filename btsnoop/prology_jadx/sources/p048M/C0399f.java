package p048M;

/* renamed from: M.f */
/* loaded from: classes.dex */
public final class C0399f extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f1148p;

    /* renamed from: q */
    public /* synthetic */ java.lang.Object f1149q;

    /* renamed from: r */
    public final /* synthetic */ p120d3.AbstractC1297g f1150r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0399f(p149j3.InterfaceC1741p interfaceC1741p, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f1150r = (p120d3.AbstractC1297g) interfaceC1741p;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.g, j3.p] */
    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p048M.C0399f c0399f = new p048M.C0399f(this.f1150r, interfaceC1190d);
        c0399f.f1149q = obj;
        return c0399f;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p048M.C0399f) mo659g((p110b3.InterfaceC1190d) obj2, (p048M.C0395b) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [d3.g, j3.p] */
    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f1148p;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p048M.C0395b c0395b = (p048M.C0395b) this.f1149q;
            p176p1.AbstractC1949a.m3913P(obj);
            return c0395b;
        }
        p176p1.AbstractC1949a.m3913P(obj);
        p048M.C0395b c0395b2 = new p048M.C0395b(new java.util.LinkedHashMap(((p048M.C0395b) this.f1149q).m854a()), false);
        this.f1149q = c0395b2;
        this.f1148p = 1;
        return this.f1150r.mo502h(c0395b2, this) == enumC1252a ? enumC1252a : c0395b2;
    }
}
