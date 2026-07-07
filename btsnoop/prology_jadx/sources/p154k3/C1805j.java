package p154k3;

/* renamed from: k3.j */
/* loaded from: classes.dex */
public final class C1805j implements p154k3.InterfaceC1799d {

    /* renamed from: a */
    public final java.lang.Class f7369a;

    public C1805j(java.lang.Class cls) {
        this.f7369a = cls;
    }

    @Override // p154k3.InterfaceC1799d
    /* renamed from: a */
    public final java.lang.Class mo3773a() {
        return this.f7369a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p154k3.C1805j) {
            if (p154k3.AbstractC1803h.m3775a(this.f7369a, ((p154k3.C1805j) obj).f7369a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7369a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f7369a + " (Kotlin reflection is not available)";
    }
}
