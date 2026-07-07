package p102a0;

/* renamed from: a0.V */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0957V implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f3477l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f3478m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f3479n;

    /* renamed from: o */
    public final /* synthetic */ java.lang.Object f3480o;

    public /* synthetic */ RunnableC0957V(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i4) {
        this.f3477l = i4;
        this.f3478m = obj;
        this.f3479n = obj2;
        this.f3480o = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, q0.J] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3477l) {
            case 0:
                p102a0.C0958W c0958w = (p102a0.C0958W) this.f3478m;
                c0958w.getClass();
                p129f2.C1415c0 m3157g = ((p129f2.C1390F) this.f3479n).m3157g();
                p107b0.C1170e c1170e = c0958w.f3483c;
                p076T.InterfaceC0672O interfaceC0672O = c1170e.f4503r;
                interfaceC0672O.getClass();
                p013C2.C0139d c0139d = c1170e.f4500o;
                c0139d.getClass();
                c0139d.f376b = p129f2.AbstractC1393I.m3162j(m3157g);
                if (!m3157g.isEmpty()) {
                    c0139d.f379e = (p179q0.C1964F) m3157g.get(0);
                    p179q0.C1964F c1964f = (p179q0.C1964F) this.f3480o;
                    c1964f.getClass();
                    c0139d.f380f = c1964f;
                }
                if (((p179q0.C1964F) c0139d.f378d) == null) {
                    c0139d.f378d = p013C2.C0139d.m476e(interfaceC0672O, (p129f2.AbstractC1393I) c0139d.f376b, (p179q0.C1964F) c0139d.f379e, (p076T.C0675S) c0139d.f375a);
                }
                c0139d.m483j(((p102a0.C0944H) interfaceC0672O).m1857t());
                return;
            case 1:
                p153k2.C1795h c1795h = (p153k2.C1795h) this.f3478m;
                p035I.C0291m c0291m = c1795h.f7340m;
                java.lang.String str = (java.lang.String) this.f3479n;
                if (c0291m != null) {
                    c0291m.m694j(str, (java.util.HashMap) this.f3480o, null);
                    return;
                } else {
                    c1795h.m3765C("invokeMethodUIThread: tried to call method on closed channel: ".concat(str), 3);
                    return;
                }
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                p009B2.C0067x c0067x = ((p161m0.C1849f) this.f3478m).f7472n;
                java.lang.String str2 = (java.lang.String) this.f3479n;
                p161m0.C1859p c1859p = (p161m0.C1859p) c0067x.f219m;
                c1859p.f7543c = str2;
                p161m0.InterfaceC1848e interfaceC1848e = (p161m0.InterfaceC1848e) this.f3480o;
                p161m0.C1842G mo3807x = interfaceC1848e.mo3807x();
                p161m0.C1861r c1861r = c1859p.f7544d;
                if (mo3807x != null) {
                    p161m0.C1856m c1856m = c1861r.f7561o;
                    int mo3806m = interfaceC1848e.mo3806m();
                    p161m0.C1868y c1868y = c1856m.f7531t;
                    c1868y.f7596n.put(java.lang.Integer.valueOf(mo3806m), mo3807x);
                    c1861r.f7557G = true;
                }
                c1861r.m3838z();
                return;
            default:
                p127f0.C1372e c1372e = (p127f0.C1372e) this.f3478m;
                int i4 = c1372e.f5648a;
                this.f3479n.mo705z(i4, c1372e.f5649b, (p166n0.C1891g) this.f3480o);
                return;
        }
    }
}
