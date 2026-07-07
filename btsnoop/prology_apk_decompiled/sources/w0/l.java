package w0;

import W.y;
import a0.C0133m;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import c0.C0215n;

/* loaded from: classes.dex */
public final class l implements Handler.Callback {

    /* renamed from: l, reason: collision with root package name */
    public final Handler f8794l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f8795m;

    public l(m mVar, j0.j jVar) {
        this.f8795m = mVar;
        Handler n4 = y.n(this);
        this.f8794l = n4;
        jVar.o(this, n4);
    }

    public final void a(long j4) {
        Surface surface;
        m mVar = this.f8795m;
        if (this != mVar.t1 || mVar.f6883V == null) {
            return;
        }
        if (j4 == Long.MAX_VALUE) {
            mVar.f6866I0 = true;
            return;
        }
        try {
            mVar.x0(j4);
            mVar.D0(mVar.f8822o1);
            mVar.f6869K0.f3450e++;
            p pVar = mVar.U0;
            boolean z4 = pVar.f8841d != 3;
            pVar.f8841d = 3;
            pVar.f8848k.getClass();
            pVar.f8843f = y.M(SystemClock.elapsedRealtime());
            if (z4 && (surface = mVar.f8811c1) != null) {
                C0215n c0215n = mVar.f8801R0;
                Handler handler = c0215n.f4631a;
                if (handler != null) {
                    handler.post(new v(c0215n, surface, SystemClock.elapsedRealtime()));
                }
                mVar.f8814f1 = true;
            }
            mVar.f0(j4);
        } catch (C0133m e4) {
            mVar.f6867J0 = e4;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i4 = message.arg1;
        int i5 = message.arg2;
        int i6 = y.f2709a;
        a(((i4 & 4294967295L) << 32) | (4294967295L & i5));
        return true;
    }
}
