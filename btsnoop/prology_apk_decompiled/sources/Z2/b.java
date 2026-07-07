package Z2;

import java.io.Serializable;
import k3.h;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final Object f3179l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f3180m;

    public b(Object obj, Object obj2) {
        this.f3179l = obj;
        this.f3180m = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f3179l, bVar.f3179l) && h.a(this.f3180m, bVar.f3180m);
    }

    public final int hashCode() {
        Object obj = this.f3179l;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f3180m;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f3179l + ", " + this.f3180m + ')';
    }
}
