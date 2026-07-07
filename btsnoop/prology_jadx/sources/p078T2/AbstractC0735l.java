package p078T2;

/* renamed from: T2.l */
/* loaded from: classes.dex */
public abstract class AbstractC0735l {

    /* renamed from: a */
    public final p078T2.C0736m f2538a;

    /* renamed from: b */
    public final io.flutter.view.TextureRegistry$SurfaceProducer f2539b;

    /* renamed from: c */
    public final p102a0.InterfaceC0994s f2540c;

    public AbstractC0735l(p078T2.C0736m c0736m, p076T.C0659B c0659b, p078T2.C0737n c0737n, io.flutter.view.TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, p081U2.C0754d c0754d) {
        p102a0.C0944H m2032a;
        this.f2538a = c0736m;
        this.f2539b = textureRegistry$SurfaceProducer;
        switch (c0754d.f2614a) {
            case 0:
                android.content.Context context = c0754d.f2615b;
                p102a0.C0992q c0992q = new p102a0.C0992q(context);
                p179q0.InterfaceC1963E mo555h = c0754d.f2616c.mo555h(context);
                p086W.AbstractC0781a.m1421j(!c0992q.f3701r);
                c0992q.f3687d = new p102a0.C0988n(1, mo555h);
                m2032a = c0992q.m2032a();
                break;
            default:
                android.content.Context context2 = c0754d.f2615b;
                p102a0.C0992q c0992q2 = new p102a0.C0992q(context2);
                p179q0.InterfaceC1963E mo555h2 = c0754d.f2616c.mo555h(context2);
                p086W.AbstractC0781a.m1421j(!c0992q2.f3701r);
                c0992q2.f3687d = new p102a0.C0988n(1, mo555h2);
                m2032a = c0992q2.m2032a();
                break;
        }
        this.f2540c = m2032a;
        p129f2.C1415c0 m3166o = p129f2.AbstractC1393I.m3166o(c0659b);
        m2032a.m1848U();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < m3166o.f5746o; i4++) {
            arrayList.add(m2032a.f3369q.mo2673c((p076T.C0659B) m3166o.get(i4)));
        }
        m2032a.m1836I(arrayList);
        ((p102a0.C0944H) this.f2540c).m1831D();
        p102a0.InterfaceC0994s interfaceC0994s = this.f2540c;
        p078T2.AbstractC0724a mo1322a = mo1322a(interfaceC0994s, textureRegistry$SurfaceProducer);
        p102a0.C0944H c0944h = (p102a0.C0944H) interfaceC0994s;
        c0944h.getClass();
        c0944h.f3364l.m1440a(mo1322a);
        ((p102a0.C0944H) this.f2540c).m1835H(new p076T.C0691e(3, 0, 1), !c0737n.f2542a);
    }

    /* renamed from: a */
    public abstract p078T2.AbstractC0724a mo1322a(p102a0.InterfaceC0994s interfaceC0994s, io.flutter.view.TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    /* renamed from: b */
    public void mo1323b() {
        ((p102a0.C0944H) this.f2540c).m1832E();
    }
}
