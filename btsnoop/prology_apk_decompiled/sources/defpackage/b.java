package defpackage;

import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f4322a;

    public b(Boolean bool) {
        this.f4322a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC0462a.w(AbstractC0462a.E(this.f4322a), AbstractC0462a.E(((b) obj).f4322a));
    }

    public final int hashCode() {
        return AbstractC0462a.E(this.f4322a).hashCode();
    }

    public final String toString() {
        return "ToggleMessage(enable=" + this.f4322a + ")";
    }
}
