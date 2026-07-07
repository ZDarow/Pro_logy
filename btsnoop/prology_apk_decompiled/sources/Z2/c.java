package Z2;

import java.io.Serializable;
import k3.h;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final Throwable f3181l;

    public c(Throwable th) {
        h.e(th, "exception");
        this.f3181l = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (h.a(this.f3181l, ((c) obj).f3181l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3181l.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3181l + ')';
    }
}
