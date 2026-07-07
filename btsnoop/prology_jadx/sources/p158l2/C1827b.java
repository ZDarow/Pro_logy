package p158l2;

/* renamed from: l2.b */
/* loaded from: classes.dex */
public final class C1827b implements p034H2.InterfaceC0248b, p047L2.InterfaceC0385o, p038I2.InterfaceC0309a {

    /* renamed from: l */
    public final p163m2.C1872a f7395l;

    /* renamed from: m */
    public final p025F1.C0215g f7396m;

    /* renamed from: n */
    public p013C2.C0139d f7397n;

    /* renamed from: o */
    public p035I.C0291m f7398o;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m2.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [F1.g, java.lang.Object] */
    public C1827b() {
        ?? obj = new java.lang.Object();
        obj.f7614m = android.os.Build.VERSION.SDK_INT >= 33 ? new java.lang.String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES"} : new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        this.f7395l = obj;
        this.f7396m = new java.lang.Object();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x017c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0bd2  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0bd9  */
    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo42I(p047L2.C0384n r28, final p043K2.C0335k r29) {
        /*
            Method dump skipped, instructions count: 3276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158l2.C1827b.mo42I(L2.n, K2.k):void");
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "binding");
        p035I.C0291m c0291m = this.f7398o;
        if (c0291m != null) {
            c0291m.m702s(null);
        } else {
            p154k3.AbstractC1803h.m3783i("channel");
            throw null;
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "flutterPluginBinding");
        p035I.C0291m c0291m = new p035I.C0291m((p047L2.InterfaceC0376f) c0247a.f720m, "com.lucasjosino.on_audio_query");
        this.f7398o = c0291m;
        c0291m.m702s(this);
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: e */
    public final void mo531e() {
        p013C2.C0139d c0139d = this.f7397n;
        if (c0139d != null) {
            ((java.util.HashSet) c0139d.f376b).remove(this.f7395l);
        }
        this.f7397n = null;
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
        p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) c0139d.f375a;
        p154k3.AbstractC1803h.m3778d(abstractActivityC0047d, "getActivity(...)");
        p101a.AbstractC0936a.f3302c = new java.lang.ref.WeakReference(abstractActivityC0047d.getApplicationContext());
        p101a.AbstractC0936a.f3303d = new java.lang.ref.WeakReference(abstractActivityC0047d);
        this.f7397n = c0139d;
        ((java.util.HashSet) c0139d.f376b).add(this.f7395l);
    }
}
