package p195t3;

/* renamed from: t3.g */
/* loaded from: classes.dex */
public final class C2194g extends p195t3.C2195h {

    /* renamed from: a */
    public final java.lang.Throwable f8798a;

    public C2194g(java.lang.Throwable th) {
        this.f8798a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p195t3.C2194g) {
            if (p154k3.AbstractC1803h.m3775a(this.f8798a, ((p195t3.C2194g) obj).f8798a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Throwable th = this.f8798a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p195t3.C2195h
    public final java.lang.String toString() {
        return "Closed(" + this.f8798a + ')';
    }
}
