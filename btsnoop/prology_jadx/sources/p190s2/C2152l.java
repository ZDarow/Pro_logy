package p190s2;

/* renamed from: s2.l */
/* loaded from: classes.dex */
public final class C2152l {

    /* renamed from: a */
    public final java.lang.String f8586a;

    /* renamed from: b */
    public final java.util.Map f8587b;

    public C2152l(java.lang.String str, java.util.Map map) {
        this.f8586a = str;
        this.f8587b = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p190s2.C2152l.class != obj.getClass()) {
            return false;
        }
        p190s2.C2152l c2152l = (p190s2.C2152l) obj;
        return this.f8586a.equals(c2152l.f8586a) && java.util.Objects.equals(this.f8587b, c2152l.f8587b);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f8586a, this.f8587b);
    }
}
