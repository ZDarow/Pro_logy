package defpackage;

import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f3187a;

    public a(Boolean bool) {
        this.f3187a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC0462a.w(AbstractC0462a.E(this.f3187a), AbstractC0462a.E(((a) obj).f3187a));
    }

    public final int hashCode() {
        return AbstractC0462a.E(this.f3187a).hashCode();
    }

    public final String toString() {
        return "IsEnabledMessage(enabled=" + this.f3187a + ")";
    }
}
