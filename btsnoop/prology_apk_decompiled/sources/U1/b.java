package U1;

import L1.g;
import T.H;
import W.y;
import Y.x;
import android.content.Context;
import j0.h;
import j0.i;
import j0.j;

/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: l, reason: collision with root package name */
    public final Context f2520l;

    @Override // j0.i
    public j G(h hVar) {
        Context context;
        int i4 = y.f2709a;
        if (i4 < 23 || (i4 < 31 && ((context = this.f2520l) == null || i4 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new g(23, false).G(hVar);
        }
        int g4 = H.g(hVar.f6829c.f2325m);
        W.a.r("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + y.F(g4));
        return new x(g4).G(hVar);
    }
}
