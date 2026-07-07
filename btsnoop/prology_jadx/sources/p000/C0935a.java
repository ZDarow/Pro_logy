package p000;

/* renamed from: a */
/* loaded from: classes.dex */
public final class C0935a {

    /* renamed from: a */
    public final java.lang.Boolean f3299a;

    public C0935a(java.lang.Boolean bool) {
        this.f3299a = bool;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p000.C0935a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return p176p1.AbstractC1949a.m3944w(p176p1.AbstractC1949a.m3904E(this.f3299a), p176p1.AbstractC1949a.m3904E(((p000.C0935a) obj).f3299a));
    }

    public final int hashCode() {
        return p176p1.AbstractC1949a.m3904E(this.f3299a).hashCode();
    }

    public final java.lang.String toString() {
        return "IsEnabledMessage(enabled=" + this.f3299a + ")";
    }
}
