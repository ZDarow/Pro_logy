package u1;

import androidx.window.extensions.layout.WindowLayoutComponent;
import q1.C0494a;
import w1.C0602c;
import w1.C0603d;

/* loaded from: classes.dex */
public final class f extends k3.i implements j3.a {

    /* renamed from: m, reason: collision with root package name */
    public static final f f8580m = new k3.i(0);

    @Override // j3.a
    public final Object c() {
        WindowLayoutComponent a4;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            e eVar = classLoader != null ? new e(classLoader, new C0494a(classLoader)) : null;
            if (eVar == null || (a4 = eVar.a()) == null) {
                return null;
            }
            k3.h.d(classLoader, "loader");
            C0494a c0494a = new C0494a(classLoader);
            int a5 = r1.e.a();
            return a5 >= 2 ? new C0603d(a4) : a5 == 1 ? new C0602c(a4, c0494a) : new Object();
        } catch (Throwable unused) {
            g gVar = g.f8581a;
            return null;
        }
    }
}
