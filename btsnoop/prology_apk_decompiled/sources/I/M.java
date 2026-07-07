package I;

import java.util.concurrent.CancellationException;
import r3.C0527n;

/* loaded from: classes.dex */
public final class M extends k3.i implements j3.p {

    /* renamed from: m, reason: collision with root package name */
    public static final M f757m = new k3.i(2);

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        T t4 = (T) obj;
        Throwable th = (Throwable) obj2;
        k3.h.e(t4, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        t4.f783b.K(new C0527n(th, false));
        return Z2.g.f3186a;
    }
}
