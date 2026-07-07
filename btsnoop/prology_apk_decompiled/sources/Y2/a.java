package Y2;

import I.C0044m;
import L2.f;
import Y.x;
import android.content.Context;
import k3.h;

/* loaded from: classes.dex */
public final class a implements H2.b {

    /* renamed from: l, reason: collision with root package name */
    public C0044m f3126l;

    @Override // H2.b
    public final void b(H2.a aVar) {
        h.e(aVar, "p0");
        C0044m c0044m = this.f3126l;
        if (c0044m != null) {
            c0044m.s(null);
        }
        this.f3126l = null;
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        h.e(aVar, "binding");
        f fVar = (f) aVar.f709m;
        h.d(fVar, "getBinaryMessenger(...)");
        Context context = (Context) aVar.f708l;
        h.d(context, "getApplicationContext(...)");
        this.f3126l = new C0044m(fVar, "PonnamKarthik/fluttertoast");
        x xVar = new x((char) 0, 2);
        xVar.f3065m = context;
        C0044m c0044m = this.f3126l;
        if (c0044m != null) {
            c0044m.s(xVar);
        }
    }
}
