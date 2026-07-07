package w0;

import W.y;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final C0599i f8854a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.view.p f8855b;

    /* renamed from: c, reason: collision with root package name */
    public final r f8856c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8857d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f8858e;

    /* renamed from: f, reason: collision with root package name */
    public float f8859f;

    /* renamed from: g, reason: collision with root package name */
    public float f8860g;

    /* renamed from: h, reason: collision with root package name */
    public float f8861h;

    /* renamed from: i, reason: collision with root package name */
    public float f8862i;

    /* renamed from: j, reason: collision with root package name */
    public int f8863j;

    /* renamed from: k, reason: collision with root package name */
    public long f8864k;

    /* renamed from: l, reason: collision with root package name */
    public long f8865l;

    /* renamed from: m, reason: collision with root package name */
    public long f8866m;

    /* renamed from: n, reason: collision with root package name */
    public long f8867n;

    /* renamed from: o, reason: collision with root package name */
    public long f8868o;

    /* renamed from: p, reason: collision with root package name */
    public long f8869p;

    /* renamed from: q, reason: collision with root package name */
    public long f8870q;

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.i, java.lang.Object] */
    public s(Context context) {
        DisplayManager displayManager;
        ?? obj = new Object();
        obj.f8789a = new C0598h();
        obj.f8790b = new C0598h();
        obj.f8792d = -9223372036854775807L;
        this.f8854a = obj;
        io.flutter.view.p pVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new io.flutter.view.p(this, displayManager, 1);
        this.f8855b = pVar;
        this.f8856c = pVar != null ? r.f8849p : null;
        this.f8864k = -9223372036854775807L;
        this.f8865l = -9223372036854775807L;
        this.f8859f = -1.0f;
        this.f8862i = 1.0f;
        this.f8863j = 0;
    }

    public static void a(s sVar, Display display) {
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            sVar.f8864k = refreshRate;
            sVar.f8865l = (refreshRate * 80) / 100;
        } else {
            W.a.A("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            sVar.f8864k = -9223372036854775807L;
            sVar.f8865l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (y.f2709a < 30 || (surface = this.f8858e) == null || this.f8863j == Integer.MIN_VALUE || this.f8861h == 0.0f) {
            return;
        }
        this.f8861h = 0.0f;
        q.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = W.y.f2709a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f8858e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            w0.i r0 = r9.f8854a
            w0.h r2 = r0.f8789a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            w0.h r2 = r0.f8789a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            w0.h r2 = r0.f8789a
            long r4 = r2.f8785e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f8786f
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
            float r2 = r9.f8859f
        L3b:
            float r4 = r9.f8860g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            w0.h r1 = r0.f8789a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            w0.h r1 = r0.f8789a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            w0.h r0 = r0.f8789a
            long r0 = r0.f8786f
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
            float r1 = r9.f8860g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f8793e
            if (r0 < r1) goto L8d
        L87:
            r9.f8860g = r2
            r0 = 0
            r9.d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.s.c():void");
    }

    public final void d(boolean z4) {
        Surface surface;
        float f4;
        if (y.f2709a < 30 || (surface = this.f8858e) == null || this.f8863j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f8857d) {
            float f5 = this.f8860g;
            if (f5 != -1.0f) {
                f4 = f5 * this.f8862i;
                if (z4 && this.f8861h == f4) {
                    return;
                }
                this.f8861h = f4;
                q.a(surface, f4);
            }
        }
        f4 = 0.0f;
        if (z4) {
        }
        this.f8861h = f4;
        q.a(surface, f4);
    }
}
