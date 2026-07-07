package M;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1108a;

    public d(String str) {
        k3.h.e(str, "name");
        this.f1108a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return k3.h.a(this.f1108a, ((d) obj).f1108a);
    }

    public final int hashCode() {
        return this.f1108a.hashCode();
    }

    public final String toString() {
        return this.f1108a;
    }
}
