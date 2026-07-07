package p206w0;

/* renamed from: w0.l */
/* loaded from: classes.dex */
public final class C2316l implements android.os.Handler.Callback {

    /* renamed from: l */
    public final android.os.Handler f9149l;

    /* renamed from: m */
    public final /* synthetic */ p206w0.C2317m f9150m;

    public C2316l(p206w0.C2317m c2317m, p146j0.InterfaceC1706j interfaceC1706j) {
        this.f9150m = c2317m;
        android.os.Handler m1619n = p086W.AbstractC0805y.m1619n(this);
        this.f9149l = m1619n;
        interfaceC1706j.mo2235o(this, m1619n);
    }

    /* renamed from: a */
    public final void m4498a(long j4) {
        android.view.Surface surface;
        p206w0.C2317m c2317m = this.f9150m;
        if (this != c2317m.f9184t1 || c2317m.f7145V == null) {
            return;
        }
        if (j4 == Long.MAX_VALUE) {
            c2317m.f7127I0 = true;
            return;
        }
        try {
            c2317m.m3713x0(j4);
            c2317m.m4504D0(c2317m.f9179o1);
            c2317m.f7131K0.f3570e++;
            p206w0.C2320p c2320p = c2317m.f9159U0;
            boolean z4 = c2320p.f9199d != 3;
            c2320p.f9199d = 3;
            c2320p.f9206k.getClass();
            c2320p.f9201f = p086W.AbstractC0805y.m1592M(android.os.SystemClock.elapsedRealtime());
            if (z4 && (surface = c2317m.f9167c1) != null) {
                p112c0.C1232n c1232n = c2317m.f9156R0;
                android.os.Handler handler = c1232n.f4797a;
                if (handler != null) {
                    handler.post(new p206w0.RunnableC2326v(c1232n, surface, android.os.SystemClock.elapsedRealtime()));
                }
                c2317m.f9170f1 = true;
            }
            c2317m.mo3700f0(j4);
        } catch (p102a0.C0986m e4) {
            c2317m.f7129J0 = e4;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 0) {
            return false;
        }
        int i4 = message.arg1;
        int i5 = message.arg2;
        int i6 = p086W.AbstractC0805y.f2801a;
        m4498a(((i4 & 4294967295L) << 32) | (4294967295L & i5));
        return true;
    }
}
