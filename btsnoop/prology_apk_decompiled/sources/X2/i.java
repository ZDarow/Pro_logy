package X2;

import B2.AbstractC0007h;
import I.C0044m;
import T.C0084e;
import a0.C0118H;
import a0.C0123c;
import a0.C0124d;
import a0.SurfaceHolderCallbackC0115E;
import android.util.Log;
import android.util.SparseArray;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2937l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2938m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2939n;

    public /* synthetic */ i(int i4, int i5, Object obj) {
        this.f2937l = i5;
        this.f2939n = obj;
        this.f2938m = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2937l) {
            case 0:
                j jVar = (j) ((B.c) this.f2939n).f85m;
                jVar.f2945e.B0(null);
                SparseArray sparseArray = jVar.f2947g.f2979v;
                int i4 = this.f2938m;
                sparseArray.remove(i4);
                Log.d("FlutterBluePlugin", "Disconnected (id: " + i4 + ")");
                return;
            case 1:
                ((K2.k) this.f2939n).b(Integer.valueOf(this.f2938m));
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                C0124d c0124d = ((C0123c) this.f2939n).f3402b;
                c0124d.getClass();
                int i5 = this.f2938m;
                if (i5 == -3 || i5 == -2) {
                    if (i5 != -2) {
                        C0084e c0084e = c0124d.f3409d;
                        if (!(c0084e != null && c0084e.f2236a == 1)) {
                            c0124d.c(4);
                            return;
                        }
                    }
                    SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E = c0124d.f3408c;
                    if (surfaceHolderCallbackC0115E != null) {
                        C0118H c0118h = surfaceHolderCallbackC0115E.f3204a;
                        c0118h.R(0, 1, c0118h.w());
                    }
                    c0124d.c(3);
                    return;
                }
                if (i5 == -1) {
                    SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E2 = c0124d.f3408c;
                    if (surfaceHolderCallbackC0115E2 != null) {
                        C0118H c0118h2 = surfaceHolderCallbackC0115E2.f3204a;
                        c0118h2.R(-1, 2, c0118h2.w());
                    }
                    c0124d.a();
                    c0124d.c(1);
                    return;
                }
                if (i5 != 1) {
                    AbstractC0007h.o(i5, "Unknown focus change type: ", "AudioFocusManager");
                    return;
                }
                c0124d.c(2);
                SurfaceHolderCallbackC0115E surfaceHolderCallbackC0115E3 = c0124d.f3408c;
                if (surfaceHolderCallbackC0115E3 != null) {
                    C0118H c0118h3 = surfaceHolderCallbackC0115E3.f3204a;
                    c0118h3.R(1, 1, c0118h3.w());
                    return;
                }
                return;
            default:
                int i6 = this.f2938m & 4;
                T0.j jVar2 = ((io.flutter.plugin.platform.e) this.f2939n).f6337b;
                if (i6 == 0) {
                    B1.d dVar = (B1.d) jVar2.f2417n;
                    dVar.getClass();
                    ((C0044m) dVar.f96m).j("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                } else {
                    B1.d dVar2 = (B1.d) jVar2.f2417n;
                    dVar2.getClass();
                    ((C0044m) dVar2.f96m).j("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                    return;
                }
        }
    }
}
