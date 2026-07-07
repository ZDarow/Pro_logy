package p100Z2;

/* renamed from: Z2.c */
/* loaded from: classes.dex */
public final class C0930c implements java.io.Serializable {

    /* renamed from: l */
    public final java.lang.Throwable f3293l;

    public C0930c(java.lang.Throwable th) {
        p154k3.AbstractC1803h.m3779e(th, "exception");
        this.f3293l = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p100Z2.C0930c) {
            if (p154k3.AbstractC1803h.m3775a(this.f3293l, ((p100Z2.C0930c) obj).f3293l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3293l.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(" + this.f3293l + ')';
    }
}
