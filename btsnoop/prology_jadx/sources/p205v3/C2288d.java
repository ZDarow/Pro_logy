package p205v3;

/* renamed from: v3.d */
/* loaded from: classes.dex */
public final class C2288d extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f9069p;

    /* renamed from: q */
    public /* synthetic */ java.lang.Object f9070q;

    /* renamed from: r */
    public final /* synthetic */ p200u3.InterfaceC2251e f9071r;

    /* renamed from: s */
    public final /* synthetic */ p205v3.AbstractC2290f f9072s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2288d(p200u3.InterfaceC2251e interfaceC2251e, p205v3.AbstractC2290f abstractC2290f, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f9071r = interfaceC2251e;
        this.f9072s = abstractC2290f;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p205v3.C2288d c2288d = new p205v3.C2288d(this.f9071r, this.f9072s, interfaceC1190d);
        c2288d.f9070q = obj;
        return c2288d;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p205v3.C2288d) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f9069p;
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p187r3.InterfaceC2130u interfaceC2130u = (p187r3.InterfaceC2130u) this.f9070q;
            p205v3.AbstractC2290f abstractC2290f = this.f9072s;
            int i5 = abstractC2290f.f9077m;
            if (i5 == -3) {
                i5 = -2;
            }
            p149j3.InterfaceC1741p c2289e = new p205v3.C2289e(abstractC2290f, null);
            p195t3.C2189b m4373a = p195t3.AbstractC2196i.m4373a(i5, abstractC2290f.f9078n, 4);
            p110b3.InterfaceC1195i m4242a = p187r3.AbstractC2131v.m4242a(interfaceC2130u.mo2652h(), abstractC2290f.f9076l, true);
            p218y3.C2421d c2421d = p187r3.AbstractC2074B.f8425a;
            if (m4242a != c2421d && m4242a.mo678j(p110b3.C1191e.f4622l) == null) {
                m4242a = m4242a.mo676c(c2421d);
            }
            p195t3.C2201n c2201n = new p195t3.C2201n(m4242a, m4373a);
            c2201n.m4214W(3, c2201n, c2289e);
            this.f9069p = 1;
            java.lang.Object m4452b = p200u3.AbstractC2264r.m4452b(this.f9071r, c2201n, true, this);
            if (m4452b != enumC1252a) {
                m4452b = c0934g;
            }
            if (m4452b == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p176p1.AbstractC1949a.m3913P(obj);
        }
        return c0934g;
    }
}
