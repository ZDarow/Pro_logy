package p005A3;

/* renamed from: A3.a */
/* loaded from: classes.dex */
public class C0017a implements p034H2.InterfaceC0248b, p047L2.InterfaceC0385o {

    /* renamed from: l */
    public p035I.C0291m f84l;

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public final void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        if (!c0384n.f1133a.equals("getPlatformVersion")) {
            c0335k.mo743c();
            return;
        }
        c0335k.mo742b("Android " + android.os.Build.VERSION.RELEASE);
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        this.f84l.m702s(null);
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p035I.C0291m c0291m = new p035I.C0291m((p047L2.InterfaceC0376f) c0247a.f720m, "flutter_native_splash");
        this.f84l = c0291m;
        c0291m.m702s(this);
    }
}
