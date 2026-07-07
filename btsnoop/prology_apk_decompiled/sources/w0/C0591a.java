package w0;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import c0.C0215n;
import java.io.Serializable;
import java.util.HashMap;
import w2.InterfaceC0608c;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591a implements w, InterfaceC0608c {

    /* renamed from: l, reason: collision with root package name */
    public Object f8747l;

    public /* synthetic */ C0591a(Object obj) {
        this.f8747l = obj;
    }

    @Override // w2.InterfaceC0608c
    public void a(String str, HashMap hashMap) {
        ((L2.p) this.f8747l).a("sqlite_error", str, hashMap);
    }

    @Override // w2.InterfaceC0608c
    public void c(Serializable serializable) {
        ((L2.p) this.f8747l).b(serializable);
    }

    @Override // w0.w
    public void d() {
        m mVar = (m) this.f8747l;
        W.a.k(mVar.f8811c1);
        Surface surface = mVar.f8811c1;
        C0215n c0215n = mVar.f8801R0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new v(c0215n, surface, SystemClock.elapsedRealtime()));
        }
        mVar.f8814f1 = true;
    }

    @Override // w0.w
    public void e() {
        ((m) this.f8747l).K0(0, 1);
    }
}
