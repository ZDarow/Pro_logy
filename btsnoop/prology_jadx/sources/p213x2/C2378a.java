package p213x2;

/* renamed from: x2.a */
/* loaded from: classes.dex */
public final class C2378a implements p034H2.InterfaceC0248b {

    /* renamed from: l */
    public p035I.C0291m f9345l;

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "binding");
        p035I.C0291m c0291m = this.f9345l;
        if (c0291m != null) {
            c0291m.m702s(null);
        } else {
            p154k3.AbstractC1803h.m3783i("methodChannel");
            throw null;
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "binding");
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        p154k3.AbstractC1803h.m3778d(interfaceC0376f, "getBinaryMessenger(...)");
        android.content.Context context = (android.content.Context) c0247a.f719l;
        p154k3.AbstractC1803h.m3778d(context, "getApplicationContext(...)");
        this.f9345l = new p035I.C0291m(interfaceC0376f, "dev.fluttercommunity.plus/device_info");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        p154k3.AbstractC1803h.m3778d(packageManager, "getPackageManager(...)");
        java.lang.Object systemService = context.getSystemService("activity");
        p154k3.AbstractC1803h.m3777c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.content.ContentResolver contentResolver = context.getContentResolver();
        p154k3.AbstractC1803h.m3776b(contentResolver);
        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(packageManager, (android.app.ActivityManager) systemService, contentResolver, 29);
        p035I.C0291m c0291m = this.f9345l;
        if (c0291m != null) {
            c0291m.m702s(c1061t);
        } else {
            p154k3.AbstractC1803h.m3783i("methodChannel");
            throw null;
        }
    }
}
