package p093X2;

/* renamed from: X2.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0848i implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f3035l;

    /* renamed from: m */
    public final /* synthetic */ int f3036m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f3037n;

    public /* synthetic */ RunnableC0848i(int i4, int i5, java.lang.Object obj) {
        this.f3035l = i5;
        this.f3037n = obj;
        this.f3036m = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3035l) {
            case 0:
                p093X2.C0849j c0849j = (p093X2.C0849j) ((p006B.C0020c) this.f3037n).f88m;
                c0849j.f3043e.m2206B0(null);
                android.util.SparseArray sparseArray = c0849j.f3045g.f3078v;
                int i4 = this.f3036m;
                sparseArray.remove(i4);
                android.util.Log.d("FlutterBluePlugin", "Disconnected (id: " + i4 + ")");
                return;
            case 1:
                ((p043K2.C0335k) this.f3037n).mo742b(java.lang.Integer.valueOf(this.f3036m));
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                p102a0.C0968d c0968d = ((p102a0.C0966c) this.f3037n).f3520b;
                c0968d.getClass();
                int i5 = this.f3036m;
                if (i5 == -3 || i5 == -2) {
                    if (i5 != -2) {
                        p076T.C0691e c0691e = c0968d.f3527d;
                        if (!(c0691e != null && c0691e.f2316a == 1)) {
                            c0968d.m1974c(4);
                            return;
                        }
                    }
                    p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E = c0968d.f3526c;
                    if (surfaceHolderCallbackC0941E != null) {
                        p102a0.C0944H c0944h = surfaceHolderCallbackC0941E.f3316a;
                        c0944h.m1845R(0, 1, c0944h.m1860w());
                    }
                    c0968d.m1974c(3);
                    return;
                }
                if (i5 == -1) {
                    p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E2 = c0968d.f3526c;
                    if (surfaceHolderCallbackC0941E2 != null) {
                        p102a0.C0944H c0944h2 = surfaceHolderCallbackC0941E2.f3316a;
                        c0944h2.m1845R(-1, 2, c0944h2.m1860w());
                    }
                    c0968d.m1972a();
                    c0968d.m1974c(1);
                    return;
                }
                if (i5 != 1) {
                    p009B2.AbstractC0051h.m156o(i5, "Unknown focus change type: ", "AudioFocusManager");
                    return;
                }
                c0968d.m1974c(2);
                p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E3 = c0968d.f3526c;
                if (surfaceHolderCallbackC0941E3 != null) {
                    p102a0.C0944H c0944h3 = surfaceHolderCallbackC0941E3.f3316a;
                    c0944h3.m1845R(1, 1, c0944h3.m1860w());
                    return;
                }
                return;
            default:
                int i6 = this.f3036m & 4;
                p077T0.C0722j c0722j = ((io.flutter.plugin.platform.ViewOnSystemUiVisibilityChangeListenerC1582e) this.f3037n).f6572b;
                if (i6 == 0) {
                    p008B1.C0026d c0026d = (p008B1.C0026d) c0722j.f2504n;
                    c0026d.getClass();
                    ((p035I.C0291m) c0026d.f99m).m694j("SystemChrome.systemUIChange", java.util.Arrays.asList(java.lang.Boolean.TRUE), null);
                    return;
                } else {
                    p008B1.C0026d c0026d2 = (p008B1.C0026d) c0722j.f2504n;
                    c0026d2.getClass();
                    ((p035I.C0291m) c0026d2.f99m).m694j("SystemChrome.systemUIChange", java.util.Arrays.asList(java.lang.Boolean.FALSE), null);
                    return;
                }
        }
    }
}
