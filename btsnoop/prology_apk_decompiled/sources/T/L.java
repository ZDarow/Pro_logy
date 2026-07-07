package T;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final C0093n f2130a;

    static {
        new SparseBooleanArray();
        W.a.j(!false);
        W.y.H(0);
    }

    public L(C0093n c0093n) {
        this.f2130a = c0093n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L) {
            return this.f2130a.equals(((L) obj).f2130a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2130a.hashCode();
    }
}
