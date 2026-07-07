package p006B;

/* renamed from: B.b */
/* loaded from: classes.dex */
public final class C0019b {

    /* renamed from: a */
    public final java.lang.Object f85a;

    /* renamed from: b */
    public final java.lang.Object f86b;

    public C0019b(java.lang.Object obj, java.lang.Object obj2) {
        this.f85a = obj;
        this.f86b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p006B.C0019b)) {
            return false;
        }
        p006B.C0019b c0019b = (p006B.C0019b) obj;
        return java.util.Objects.equals(c0019b.f85a, this.f85a) && java.util.Objects.equals(c0019b.f86b, this.f86b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f85a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.f86b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final java.lang.String toString() {
        return "Pair{" + this.f85a + " " + this.f86b + "}";
    }
}
