package p093X2;

/* renamed from: X2.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0847h implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f3032l;

    /* renamed from: m */
    public final /* synthetic */ boolean f3033m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f3034n;

    public /* synthetic */ RunnableC0847h(java.lang.Object obj, boolean z4, int i4) {
        this.f3032l = i4;
        this.f3034n = obj;
        this.f3033m = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f3033m;
        java.lang.Object obj = this.f3034n;
        switch (this.f3032l) {
            case 0:
                p093X2.C0849j c0849j = (p093X2.C0849j) obj;
                int i4 = c0849j.f3041c;
                if (!z4) {
                    android.util.Log.d("FlutterBluePlugin", "onDisconnected by local (id: " + i4 + ")");
                    return;
                }
                android.util.Log.d("FlutterBluePlugin", "onDisconnected by remote (id: " + i4 + ")");
                p047L2.C0378h c0378h = c0849j.f3042d;
                if (c0378h != null) {
                    c0378h.m828a();
                    c0849j.f3042d = null;
                    return;
                }
                return;
            default:
                p112c0.C1232n c1232n = (p112c0.C1232n) obj;
                c1232n.getClass();
                int i5 = p086W.AbstractC0805y.f2801a;
                p102a0.C0944H c0944h = c1232n.f4798b.f3316a;
                if (c0944h.f3344X == z4) {
                    return;
                }
                c0944h.f3344X = z4;
                c0944h.f3364l.m1444e(23, new p102a0.C0997v(2, z4));
                return;
        }
    }
}
