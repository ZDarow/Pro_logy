package l3;

import java.util.Random;
import k3.h;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: n, reason: collision with root package name */
    public final b f7129n = new ThreadLocal();

    @Override // l3.a
    public final Random a() {
        Object obj = this.f7129n.get();
        h.d(obj, "get(...)");
        return (Random) obj;
    }
}
