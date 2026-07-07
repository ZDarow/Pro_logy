package t3;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f8461a;

    public g(Throwable th) {
        this.f8461a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (k3.h.a(this.f8461a, ((g) obj).f8461a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f8461a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // t3.h
    public final String toString() {
        return "Closed(" + this.f8461a + ')';
    }
}
