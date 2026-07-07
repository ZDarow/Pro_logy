package p075S2;

/* renamed from: S2.e */
/* loaded from: classes.dex */
public final class C0652e {

    /* renamed from: a */
    public java.lang.Boolean f2134a;

    /* renamed from: b */
    public java.lang.Boolean f2135b;

    /* renamed from: c */
    public java.util.Map f2136c;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p075S2.C0652e.class != obj.getClass()) {
            return false;
        }
        p075S2.C0652e c0652e = (p075S2.C0652e) obj;
        return this.f2134a.equals(c0652e.f2134a) && this.f2135b.equals(c0652e.f2135b) && this.f2136c.equals(c0652e.f2136c);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f2134a, this.f2135b, this.f2136c);
    }
}
