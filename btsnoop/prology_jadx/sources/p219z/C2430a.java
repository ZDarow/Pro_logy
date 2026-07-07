package p219z;

/* renamed from: z.a */
/* loaded from: classes.dex */
public final class C2430a {

    /* renamed from: a */
    public java.lang.String f9550a;

    /* renamed from: b */
    public java.lang.String f9551b;

    /* renamed from: c */
    public java.util.List f9552c;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p219z.C2430a)) {
            return false;
        }
        p219z.C2430a c2430a = (p219z.C2430a) obj;
        return java.util.Objects.equals(this.f9550a, c2430a.f9550a) && java.util.Objects.equals(this.f9551b, c2430a.f9551b) && java.util.Objects.equals(this.f9552c, c2430a.f9552c);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f9550a, this.f9551b, this.f9552c);
    }
}
