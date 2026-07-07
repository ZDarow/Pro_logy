package p097Y2;

/* renamed from: Y2.a */
/* loaded from: classes.dex */
public final class C0914a implements p034H2.InterfaceC0248b {

    /* renamed from: l */
    public p035I.C0291m f3237l;

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "p0");
        p035I.C0291m c0291m = this.f3237l;
        if (c0291m != null) {
            c0291m.m702s(null);
        }
        this.f3237l = null;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "binding");
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        p154k3.AbstractC1803h.m3778d(interfaceC0376f, "getBinaryMessenger(...)");
        android.content.Context context = (android.content.Context) c0247a.f719l;
        p154k3.AbstractC1803h.m3778d(context, "getApplicationContext(...)");
        this.f3237l = new p035I.C0291m(interfaceC0376f, "PonnamKarthik/fluttertoast");
        p094Y.C0886x c0886x = new p094Y.C0886x((char) 0, 2);
        c0886x.f3175m = context;
        p035I.C0291m c0291m = this.f3237l;
        if (c0291m != null) {
            c0291m.m702s(c0886x);
        }
    }
}
