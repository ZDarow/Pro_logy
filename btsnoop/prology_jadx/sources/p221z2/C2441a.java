package p221z2;

/* renamed from: z2.a */
/* loaded from: classes.dex */
public final class C2441a implements p034H2.InterfaceC0248b, p000.InterfaceC1298e, p038I2.InterfaceC0309a {

    /* renamed from: l */
    public p206w0.C2305a f9599l;

    /* renamed from: a */
    public final void m4680a(p000.C1162b c1162b) {
        p206w0.C2305a c2305a = this.f9599l;
        p154k3.AbstractC1803h.m3776b(c2305a);
        p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) c2305a.f9102l;
        if (abstractActivityC0047d == null) {
            throw new p112c0.C1235q();
        }
        p154k3.AbstractC1803h.m3776b(abstractActivityC0047d);
        boolean z4 = (abstractActivityC0047d.getWindow().getAttributes().flags & 128) != 0;
        java.lang.Boolean bool = c1162b.f4478a;
        p154k3.AbstractC1803h.m3776b(bool);
        if (bool.booleanValue()) {
            if (z4) {
                return;
            }
            abstractActivityC0047d.getWindow().addFlags(128);
        } else if (z4) {
            abstractActivityC0047d.getWindow().clearFlags(128);
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "binding");
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        p154k3.AbstractC1803h.m3778d(interfaceC0376f, "getBinaryMessenger(...)");
        p000.C1254d.m2949a(p000.InterfaceC1298e.f5184d, interfaceC0376f, null);
        this.f9599l = null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, w0.a] */
    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "flutterPluginBinding");
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        p154k3.AbstractC1803h.m3778d(interfaceC0376f, "getBinaryMessenger(...)");
        p000.C1254d.m2949a(p000.InterfaceC1298e.f5184d, interfaceC0376f, this);
        this.f9599l = new java.lang.Object();
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: e */
    public final void mo531e() {
        p206w0.C2305a c2305a = this.f9599l;
        if (c2305a != null) {
            c2305a.f9102l = null;
        }
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: f */
    public final void mo532f(p013C2.C0139d c0139d) {
        p154k3.AbstractC1803h.m3779e(c0139d, "binding");
        mo534h(c0139d);
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: g */
    public final void mo533g() {
        mo531e();
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: h */
    public final void mo534h(p013C2.C0139d c0139d) {
        p154k3.AbstractC1803h.m3779e(c0139d, "binding");
        p206w0.C2305a c2305a = this.f9599l;
        if (c2305a != null) {
            c2305a.f9102l = (p009B2.AbstractActivityC0047d) c0139d.f375a;
        }
    }
}
