package p000;

/* renamed from: b */
/* loaded from: classes.dex */
public final class C1162b {

    /* renamed from: a */
    public final java.lang.Boolean f4478a;

    public C1162b(java.lang.Boolean bool) {
        this.f4478a = bool;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p000.C1162b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return p176p1.AbstractC1949a.m3944w(p176p1.AbstractC1949a.m3904E(this.f4478a), p176p1.AbstractC1949a.m3904E(((p000.C1162b) obj).f4478a));
    }

    public final int hashCode() {
        return p176p1.AbstractC1949a.m3904E(this.f4478a).hashCode();
    }

    public final java.lang.String toString() {
        return "ToggleMessage(enable=" + this.f4478a + ")";
    }
}
