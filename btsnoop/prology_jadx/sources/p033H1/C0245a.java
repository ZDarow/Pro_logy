package p033H1;

/* renamed from: H1.a */
/* loaded from: classes.dex */
public final class C0245a implements p034H2.InterfaceC0248b, p038I2.InterfaceC0309a {

    /* renamed from: l */
    public p033H1.C0246b f711l;

    /* renamed from: m */
    public p035I.C0291m f712m;

    /* renamed from: n */
    public p013C2.C0139d f713n;

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        this.f712m.m702s(null);
        this.f712m = null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [F1.g, java.lang.Object] */
    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        android.content.Context context = (android.content.Context) c0247a.f719l;
        this.f711l = new p033H1.C0246b(context);
        p035I.C0291m c0291m = new p035I.C0291m((p047L2.InterfaceC0376f) c0247a.f720m, "flutter.baseflow.com/permissions/methods");
        this.f712m = c0291m;
        c0291m.m702s(new p008B1.C0026d(context, new p046L1.C0363g(4, false), this.f711l, new java.lang.Object()));
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: e */
    public final void mo531e() {
        p033H1.C0246b c0246b = this.f711l;
        if (c0246b != null) {
            c0246b.f716n = null;
        }
        p013C2.C0139d c0139d = this.f713n;
        if (c0139d != null) {
            ((java.util.HashSet) c0139d.f377c).remove(c0246b);
            p013C2.C0139d c0139d2 = this.f713n;
            ((java.util.HashSet) c0139d2.f376b).remove(this.f711l);
        }
        this.f713n = null;
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: f */
    public final void mo532f(p013C2.C0139d c0139d) {
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
        p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) c0139d.f375a;
        p033H1.C0246b c0246b = this.f711l;
        if (c0246b != null) {
            c0246b.f716n = abstractActivityC0047d;
        }
        this.f713n = c0139d;
        c0139d.m480a(c0246b);
        p013C2.C0139d c0139d2 = this.f713n;
        ((java.util.HashSet) c0139d2.f376b).add(this.f711l);
    }
}
