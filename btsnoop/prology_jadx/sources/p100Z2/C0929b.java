package p100Z2;

/* renamed from: Z2.b */
/* loaded from: classes.dex */
public final class C0929b implements java.io.Serializable {

    /* renamed from: l */
    public final java.lang.Object f3291l;

    /* renamed from: m */
    public final java.lang.Object f3292m;

    public C0929b(java.lang.Object obj, java.lang.Object obj2) {
        this.f3291l = obj;
        this.f3292m = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p100Z2.C0929b)) {
            return false;
        }
        p100Z2.C0929b c0929b = (p100Z2.C0929b) obj;
        return p154k3.AbstractC1803h.m3775a(this.f3291l, c0929b.f3291l) && p154k3.AbstractC1803h.m3775a(this.f3292m, c0929b.f3292m);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f3291l;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f3292m;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "(" + this.f3291l + ", " + this.f3292m + ')';
    }
}
