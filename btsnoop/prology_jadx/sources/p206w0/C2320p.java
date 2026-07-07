package p206w0;

/* renamed from: w0.p */
/* loaded from: classes.dex */
public final class C2320p {

    /* renamed from: a */
    public final p206w0.C2317m f9196a;

    /* renamed from: b */
    public final p206w0.C2323s f9197b;

    /* renamed from: c */
    public boolean f9198c;

    /* renamed from: f */
    public long f9201f;

    /* renamed from: i */
    public boolean f9204i;

    /* renamed from: d */
    public int f9199d = 0;

    /* renamed from: e */
    public long f9200e = -9223372036854775807L;

    /* renamed from: g */
    public long f9202g = -9223372036854775807L;

    /* renamed from: h */
    public long f9203h = -9223372036854775807L;

    /* renamed from: j */
    public float f9205j = 1.0f;

    /* renamed from: k */
    public p086W.C0800t f9206k = p086W.C0800t.f2792a;

    public C2320p(android.content.Context context, p206w0.C2317m c2317m) {
        this.f9196a = c2317m;
        this.f9197b = new p206w0.C2323s(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x010a, code lost:
    
        if (r13 > 100000) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0115, code lost:
    
        if (r25 >= r29) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if ((r13 == 0 ? false : r10.f9142g[(int) ((r13 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m4517a(long r23, long r25, long r27, long r29, boolean r31, p009B2.C0038I r32) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p206w0.C2320p.m4517a(long, long, long, long, boolean, B2.I):int");
    }

    /* renamed from: b */
    public final void m4518b(boolean z4) {
        this.f9204i = z4;
        this.f9206k.getClass();
        this.f9203h = android.os.SystemClock.elapsedRealtime() + 5000;
    }

    /* renamed from: c */
    public final void m4519c(int i4) {
        this.f9199d = java.lang.Math.min(this.f9199d, i4);
    }

    /* renamed from: d */
    public final void m4520d() {
        this.f9198c = true;
        this.f9206k.getClass();
        this.f9201f = p086W.AbstractC0805y.m1592M(android.os.SystemClock.elapsedRealtime());
        p206w0.C2323s c2323s = this.f9197b;
        c2323s.f9215d = true;
        c2323s.f9224m = 0L;
        c2323s.f9227p = -1L;
        c2323s.f9225n = -1L;
        io.flutter.view.C1619p c1619p = c2323s.f9213b;
        if (c1619p != null) {
            p206w0.ChoreographerFrameCallbackC2322r choreographerFrameCallbackC2322r = c2323s.f9214c;
            choreographerFrameCallbackC2322r.getClass();
            choreographerFrameCallbackC2322r.f9209m.sendEmptyMessage(2);
            android.os.Handler m1619n = p086W.AbstractC0805y.m1619n(null);
            android.hardware.display.DisplayManager displayManager = c1619p.f6790b;
            displayManager.registerDisplayListener(c1619p, m1619n);
            p206w0.C2323s.m4524a((p206w0.C2323s) c1619p.f6791c, displayManager.getDisplay(0));
        }
        c2323s.m4527d(false);
    }

    /* renamed from: e */
    public final void m4521e() {
        this.f9198c = false;
        this.f9203h = -9223372036854775807L;
        p206w0.C2323s c2323s = this.f9197b;
        c2323s.f9215d = false;
        io.flutter.view.C1619p c1619p = c2323s.f9213b;
        if (c1619p != null) {
            c1619p.f6790b.unregisterDisplayListener(c1619p);
            p206w0.ChoreographerFrameCallbackC2322r choreographerFrameCallbackC2322r = c2323s.f9214c;
            choreographerFrameCallbackC2322r.getClass();
            choreographerFrameCallbackC2322r.f9209m.sendEmptyMessage(3);
        }
        c2323s.m4525b();
    }

    /* renamed from: f */
    public final void m4522f(float f4) {
        p206w0.C2323s c2323s = this.f9197b;
        c2323s.f9217f = f4;
        p206w0.C2313i c2313i = c2323s.f9212a;
        c2313i.f9144a.m4496c();
        c2313i.f9145b.m4496c();
        c2313i.f9146c = false;
        c2313i.f9147d = -9223372036854775807L;
        c2313i.f9148e = 0;
        c2323s.m4526c();
    }
}
