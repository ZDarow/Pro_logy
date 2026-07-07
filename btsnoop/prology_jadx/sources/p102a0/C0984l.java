package p102a0;

/* renamed from: a0.l */
/* loaded from: classes.dex */
public final class C0984l {

    /* renamed from: a */
    public final android.content.Context f3659a;

    /* renamed from: b */
    public final p080U1.C0749b f3660b;

    public C0984l(android.content.Context context) {
        this.f3659a = context;
        this.f3660b = new p080U1.C0749b(context);
    }

    /* renamed from: a */
    public final p102a0.AbstractC0970e[] m2028a(android.os.Handler handler, p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E, p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E2, p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E3, p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E4) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p080U1.C0749b c0749b = this.f3660b;
        android.content.Context context = this.f3659a;
        arrayList.add(new p206w0.C2317m(context, c0749b, handler, surfaceHolderCallbackC0941E));
        p054N1.C0463r c0463r = new p054N1.C0463r(context);
        p086W.AbstractC0781a.m1421j(!c0463r.f1351a);
        c0463r.f1351a = true;
        if (((android.support.v4.media.session.C1061t) c0463r.f1354d) == null) {
            c0463r.f1354d = new android.support.v4.media.session.C1061t(new p079U.InterfaceC0743d[0]);
        }
        if (((p094Y.C0886x) c0463r.f1356f) == null) {
            c0463r.f1356f = new p094Y.C0886x(8, context);
        }
        arrayList.add(new p112c0.C1214M(this.f3659a, c0749b, handler, surfaceHolderCallbackC0941E2, new p112c0.C1211J(c0463r)));
        arrayList.add(new p188s0.C2139d(surfaceHolderCallbackC0941E3, handler.getLooper()));
        arrayList.add(new p151k0.C1752b(surfaceHolderCallbackC0941E4, handler.getLooper()));
        arrayList.add(new p211x0.C2367a());
        arrayList.add(new p141i0.C1535h(p141i0.InterfaceC1530c.f6371e));
        return (p102a0.AbstractC0970e[]) arrayList.toArray(new p102a0.AbstractC0970e[0]);
    }
}
