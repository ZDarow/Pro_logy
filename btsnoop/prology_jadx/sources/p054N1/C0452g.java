package p054N1;

/* renamed from: N1.g */
/* loaded from: classes.dex */
public final class C0452g {

    /* renamed from: a */
    public final java.lang.Object f1323a;

    /* renamed from: b */
    public final java.lang.String f1324b;

    public C0452g(java.lang.Object obj, java.lang.String str) {
        this.f1323a = obj;
        this.f1324b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p054N1.C0452g)) {
            return false;
        }
        p054N1.C0452g c0452g = (p054N1.C0452g) obj;
        return this.f1323a == c0452g.f1323a && this.f1324b.equals(c0452g.f1324b);
    }

    public final int hashCode() {
        return this.f1324b.hashCode() + (java.lang.System.identityHashCode(this.f1323a) * 31);
    }
}
