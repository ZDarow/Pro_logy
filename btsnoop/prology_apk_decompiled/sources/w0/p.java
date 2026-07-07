package w0;

import W.y;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final m f8838a;

    /* renamed from: b, reason: collision with root package name */
    public final s f8839b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8840c;

    /* renamed from: f, reason: collision with root package name */
    public long f8843f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8846i;

    /* renamed from: d, reason: collision with root package name */
    public int f8841d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f8842e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f8844g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f8845h = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public float f8847j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public W.t f8848k = W.t.f2700a;

    public p(Context context, m mVar) {
        this.f8838a = mVar;
        this.f8839b = new s(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x010a, code lost:
    
        if (r13 > 100000) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0115, code lost:
    
        if (r25 >= r29) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if ((r13 == 0 ? false : r10.f8787g[(int) ((r13 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r23, long r25, long r27, long r29, boolean r31, B2.I r32) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.p.a(long, long, long, long, boolean, B2.I):int");
    }

    public final void b(boolean z4) {
        this.f8846i = z4;
        this.f8848k.getClass();
        this.f8845h = SystemClock.elapsedRealtime() + 5000;
    }

    public final void c(int i4) {
        this.f8841d = Math.min(this.f8841d, i4);
    }

    public final void d() {
        this.f8840c = true;
        this.f8848k.getClass();
        this.f8843f = y.M(SystemClock.elapsedRealtime());
        s sVar = this.f8839b;
        sVar.f8857d = true;
        sVar.f8866m = 0L;
        sVar.f8869p = -1L;
        sVar.f8867n = -1L;
        io.flutter.view.p pVar = sVar.f8855b;
        if (pVar != null) {
            r rVar = sVar.f8856c;
            rVar.getClass();
            rVar.f8851m.sendEmptyMessage(2);
            Handler n4 = y.n(null);
            DisplayManager displayManager = pVar.f6543b;
            displayManager.registerDisplayListener(pVar, n4);
            s.a((s) pVar.f6544c, displayManager.getDisplay(0));
        }
        sVar.d(false);
    }

    public final void e() {
        this.f8840c = false;
        this.f8845h = -9223372036854775807L;
        s sVar = this.f8839b;
        sVar.f8857d = false;
        io.flutter.view.p pVar = sVar.f8855b;
        if (pVar != null) {
            pVar.f6543b.unregisterDisplayListener(pVar);
            r rVar = sVar.f8856c;
            rVar.getClass();
            rVar.f8851m.sendEmptyMessage(3);
        }
        sVar.b();
    }

    public final void f(float f4) {
        s sVar = this.f8839b;
        sVar.f8859f = f4;
        C0599i c0599i = sVar.f8854a;
        c0599i.f8789a.c();
        c0599i.f8790b.c();
        c0599i.f8791c = false;
        c0599i.f8792d = -9223372036854775807L;
        c0599i.f8793e = 0;
        sVar.c();
    }
}
