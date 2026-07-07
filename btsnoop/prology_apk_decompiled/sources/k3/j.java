package k3;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7099a;

    public j(Class cls) {
        this.f7099a = cls;
    }

    @Override // k3.d
    public final Class a() {
        return this.f7099a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (h.a(this.f7099a, ((j) obj).f7099a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7099a.hashCode();
    }

    public final String toString() {
        return this.f7099a + " (Kotlin reflection is not available)";
    }
}
