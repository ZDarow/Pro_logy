package X2;

import W.y;
import a0.C0118H;
import a0.C0141v;
import android.util.Log;
import c0.C0215n;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2934l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2935m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2936n;

    public /* synthetic */ h(Object obj, boolean z4, int i4) {
        this.f2934l = i4;
        this.f2936n = obj;
        this.f2935m = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f2935m;
        Object obj = this.f2936n;
        switch (this.f2934l) {
            case 0:
                j jVar = (j) obj;
                int i4 = jVar.f2943c;
                if (!z4) {
                    Log.d("FlutterBluePlugin", "onDisconnected by local (id: " + i4 + ")");
                    return;
                }
                Log.d("FlutterBluePlugin", "onDisconnected by remote (id: " + i4 + ")");
                L2.h hVar = jVar.f2944d;
                if (hVar != null) {
                    hVar.a();
                    jVar.f2944d = null;
                    return;
                }
                return;
            default:
                C0215n c0215n = (C0215n) obj;
                c0215n.getClass();
                int i5 = y.f2709a;
                C0118H c0118h = c0215n.f4632b.f3204a;
                if (c0118h.f3231X == z4) {
                    return;
                }
                c0118h.f3231X = z4;
                c0118h.f3251l.e(23, new C0141v(2, z4));
                return;
        }
    }
}
