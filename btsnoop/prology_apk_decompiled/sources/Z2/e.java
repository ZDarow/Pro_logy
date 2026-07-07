package Z2;

import java.io.Serializable;
import k3.h;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public j3.a f3182l;

    /* renamed from: m, reason: collision with root package name */
    public volatile Object f3183m = f.f3185a;

    /* renamed from: n, reason: collision with root package name */
    public final Object f3184n = this;

    public e(j3.a aVar) {
        this.f3182l = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f3183m;
        f fVar = f.f3185a;
        if (obj2 != fVar) {
            return obj2;
        }
        synchronized (this.f3184n) {
            obj = this.f3183m;
            if (obj == fVar) {
                j3.a aVar = this.f3182l;
                h.b(aVar);
                obj = aVar.c();
                this.f3183m = obj;
                this.f3182l = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f3183m != f.f3185a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
