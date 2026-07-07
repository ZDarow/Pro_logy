package Y1;

import android.text.TextUtils;
import d2.C0243f;
import d2.C0246i;

/* loaded from: classes.dex */
public final class b extends M1.f {

    /* renamed from: i, reason: collision with root package name */
    public static final B1.d f3081i = new B1.d("LocationServices.API", new Q1.b(1), (F1.g) new Object());

    public C0246i d(F1.d dVar) {
        String simpleName = F1.d.class.getSimpleName();
        O1.s.e(dVar, "Listener must not be null");
        if (TextUtils.isEmpty(simpleName)) {
            throw new IllegalArgumentException("Listener type must not be empty");
        }
        C0246i b4 = b(new N1.g(dVar, simpleName), 2418);
        b4.getClass();
        C0246i c0246i = new C0246i();
        b4.f4982b.e(new C0243f(c0246i));
        b4.f();
        return c0246i;
    }
}
