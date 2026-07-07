package p206w0;

/* renamed from: w0.s */
/* loaded from: classes.dex */
public final class C2323s {

    /* renamed from: a */
    public final p206w0.C2313i f9212a;

    /* renamed from: b */
    public final io.flutter.view.C1619p f9213b;

    /* renamed from: c */
    public final p206w0.ChoreographerFrameCallbackC2322r f9214c;

    /* renamed from: d */
    public boolean f9215d;

    /* renamed from: e */
    public android.view.Surface f9216e;

    /* renamed from: f */
    public float f9217f;

    /* renamed from: g */
    public float f9218g;

    /* renamed from: h */
    public float f9219h;

    /* renamed from: i */
    public float f9220i;

    /* renamed from: j */
    public int f9221j;

    /* renamed from: k */
    public long f9222k;

    /* renamed from: l */
    public long f9223l;

    /* renamed from: m */
    public long f9224m;

    /* renamed from: n */
    public long f9225n;

    /* renamed from: o */
    public long f9226o;

    /* renamed from: p */
    public long f9227p;

    /* renamed from: q */
    public long f9228q;

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.i, java.lang.Object] */
    public C2323s(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager;
        ?? obj = new java.lang.Object();
        obj.f9144a = new p206w0.C2312h();
        obj.f9145b = new p206w0.C2312h();
        obj.f9147d = -9223372036854775807L;
        this.f9212a = obj;
        io.flutter.view.C1619p c1619p = (context == null || (displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display")) == null) ? null : new io.flutter.view.C1619p(this, displayManager, 1);
        this.f9213b = c1619p;
        this.f9214c = c1619p != null ? p206w0.ChoreographerFrameCallbackC2322r.f9207p : null;
        this.f9222k = -9223372036854775807L;
        this.f9223l = -9223372036854775807L;
        this.f9217f = -1.0f;
        this.f9220i = 1.0f;
        this.f9221j = 0;
    }

    /* renamed from: a */
    public static void m4524a(p206w0.C2323s c2323s, android.view.Display display) {
        c2323s.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c2323s.f9222k = refreshRate;
            c2323s.f9223l = (refreshRate * 80) / 100;
        } else {
            p086W.AbstractC0781a.m1410A("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c2323s.f9222k = -9223372036854775807L;
            c2323s.f9223l = -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public final void m4525b() {
        android.view.Surface surface;
        if (p086W.AbstractC0805y.f2801a < 30 || (surface = this.f9216e) == null || this.f9221j == Integer.MIN_VALUE || this.f9219h == 0.0f) {
            return;
        }
        this.f9219h = 0.0f;
        p206w0.AbstractC2321q.m4523a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4526c() {
        /*
            r9 = this;
            int r0 = p086W.AbstractC0805y.f2801a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f9216e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            w0.i r0 = r9.f9212a
            w0.h r2 = r0.f9144a
            boolean r2 = r2.m4494a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            w0.h r2 = r0.f9144a
            boolean r2 = r2.m4494a()
            if (r2 == 0) goto L37
            w0.h r2 = r0.f9144a
            long r4 = r2.f9140e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f9141f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f9217f
        L3b:
            float r4 = r9.f9218g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            w0.h r1 = r0.f9144a
            boolean r1 = r1.m4494a()
            if (r1 == 0) goto L71
            w0.h r1 = r0.f9144a
            boolean r1 = r1.m4494a()
            if (r1 == 0) goto L5f
            w0.h r0 = r0.f9144a
            long r0 = r0.f9141f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f9218g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f9148e
            if (r0 < r1) goto L8d
        L87:
            r9.f9218g = r2
            r0 = 0
            r9.m4527d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p206w0.C2323s.m4526c():void");
    }

    /* renamed from: d */
    public final void m4527d(boolean z4) {
        android.view.Surface surface;
        float f4;
        if (p086W.AbstractC0805y.f2801a < 30 || (surface = this.f9216e) == null || this.f9221j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f9215d) {
            float f5 = this.f9218g;
            if (f5 != -1.0f) {
                f4 = f5 * this.f9220i;
                if (z4 && this.f9219h == f4) {
                    return;
                }
                this.f9219h = f4;
                p206w0.AbstractC2321q.m4523a(surface, f4);
            }
        }
        f4 = 0.0f;
        if (z4) {
        }
        this.f9219h = f4;
        p206w0.AbstractC2321q.m4523a(surface, f4);
    }
}
