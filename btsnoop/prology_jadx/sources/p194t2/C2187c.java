package p194t2;

/* renamed from: t2.c */
/* loaded from: classes.dex */
public class C2187c implements p034H2.InterfaceC0248b {

    /* renamed from: l */
    public p035I.C0291m f8759l;

    /* renamed from: m */
    public android.support.v4.media.session.C1061t f8760m;

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        this.f8760m.m2217a0();
        this.f8760m = null;
        this.f8759l.m702s(null);
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        android.content.Context context = (android.content.Context) c0247a.f719l;
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        this.f8760m = new android.support.v4.media.session.C1061t(context, interfaceC0376f);
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, "com.ryanheise.just_audio.methods");
        this.f8759l = c0291m;
        c0291m.m702s(this.f8760m);
        ((p013C2.C0138c) c0247a.f722o).f372v.add(new p013C2.C0136a(1, this));
    }
}
