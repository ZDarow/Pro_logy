package A3;

import H2.b;
import I.C0044m;
import K2.k;
import L2.f;
import L2.n;
import L2.o;
import android.os.Build;

/* loaded from: classes.dex */
public class a implements b, o {

    /* renamed from: l, reason: collision with root package name */
    public C0044m f81l;

    @Override // L2.o
    public final void I(n nVar, k kVar) {
        if (!nVar.f1094a.equals("getPlatformVersion")) {
            kVar.c();
            return;
        }
        kVar.b("Android " + Build.VERSION.RELEASE);
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        this.f81l.s(null);
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        C0044m c0044m = new C0044m((f) aVar.f709m, "flutter_native_splash");
        this.f81l = c0044m;
        c0044m.s(this);
    }
}
