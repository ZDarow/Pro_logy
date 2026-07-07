package p076T;

/* renamed from: T.r */
/* loaded from: classes.dex */
public final class C0704r {

    /* renamed from: a */
    public final java.lang.String f2423a;

    /* renamed from: b */
    public final java.lang.String f2424b;

    static {
        p086W.AbstractC0805y.m1587H(0);
        p086W.AbstractC0805y.m1587H(1);
    }

    public C0704r(java.lang.String str, java.lang.String str2) {
        this.f2423a = p086W.AbstractC0805y.m1593N(str);
        this.f2424b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0704r.class != obj.getClass()) {
            return false;
        }
        p076T.C0704r c0704r = (p076T.C0704r) obj;
        return p086W.AbstractC0805y.m1606a(this.f2423a, c0704r.f2423a) && p086W.AbstractC0805y.m1606a(this.f2424b, c0704r.f2424b);
    }

    public final int hashCode() {
        int hashCode = this.f2424b.hashCode() * 31;
        java.lang.String str = this.f2423a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
