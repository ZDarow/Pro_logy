package p206w0;

/* renamed from: w0.a */
/* loaded from: classes.dex */
public final class C2305a implements p206w0.InterfaceC2327w, p208w2.InterfaceC2337c {

    /* renamed from: l */
    public java.lang.Object f9102l;

    public /* synthetic */ C2305a(java.lang.Object obj) {
        this.f9102l = obj;
    }

    @Override // p208w2.InterfaceC2337c
    /* renamed from: a */
    public void mo686a(java.lang.String str, java.util.HashMap hashMap) {
        ((p047L2.InterfaceC0386p) this.f9102l).mo741a("sqlite_error", str, hashMap);
    }

    @Override // p208w2.InterfaceC2337c
    /* renamed from: c */
    public void mo687c(java.io.Serializable serializable) {
        ((p047L2.InterfaceC0386p) this.f9102l).mo742b(serializable);
    }

    @Override // p206w0.InterfaceC2327w
    /* renamed from: d */
    public void mo4115d() {
        p206w0.C2317m c2317m = (p206w0.C2317m) this.f9102l;
        p086W.AbstractC0781a.m1422k(c2317m.f9167c1);
        android.view.Surface surface = c2317m.f9167c1;
        p112c0.C1232n c1232n = c2317m.f9156R0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p206w0.RunnableC2326v(c1232n, surface, android.os.SystemClock.elapsedRealtime()));
        }
        c2317m.f9170f1 = true;
    }

    @Override // p206w0.InterfaceC2327w
    /* renamed from: e */
    public void mo4116e() {
        ((p206w0.C2317m) this.f9102l).m4511K0(0, 1);
    }
}
