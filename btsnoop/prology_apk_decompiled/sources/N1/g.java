package N1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1279a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1280b;

    public g(Object obj, String str) {
        this.f1279a = obj;
        this.f1280b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1279a == gVar.f1279a && this.f1280b.equals(gVar.f1280b);
    }

    public final int hashCode() {
        return this.f1280b.hashCode() + (System.identityHashCode(this.f1279a) * 31);
    }
}
