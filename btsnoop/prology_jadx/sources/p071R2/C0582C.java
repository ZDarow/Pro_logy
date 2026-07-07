package p071R2;

/* renamed from: R2.C */
/* loaded from: classes.dex */
public final class C0582C extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f1824p;

    /* renamed from: q */
    public final /* synthetic */ java.lang.String f1825q;

    /* renamed from: r */
    public final /* synthetic */ p071R2.C0590K f1826r;

    /* renamed from: s */
    public final /* synthetic */ boolean f1827s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0582C(java.lang.String str, p071R2.C0590K c0590k, boolean z4, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f1825q = str;
        this.f1826r = c0590k;
        this.f1827s = z4;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        return new p071R2.C0582C(this.f1825q, this.f1826r, this.f1827s, interfaceC1190d);
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p071R2.C0582C) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f1824p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p048M.C0397d c0397d = new p048M.C0397d(this.f1825q);
            android.content.Context context = this.f1826r.f1854l;
            if (context == null) {
                p154k3.AbstractC1803h.m3783i("context");
                throw null;
            }
            p043K2.C0339o m1119a = p071R2.AbstractC0591L.m1119a(context);
            p071R2.C0581B c0581b = new p071R2.C0581B(c0397d, this.f1827s, null);
            this.f1824p = 1;
            if (m1119a.mo667b(new p048M.C0399f(c0581b, null), this) == enumC1252a) {
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
