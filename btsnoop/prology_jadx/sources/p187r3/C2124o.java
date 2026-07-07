package p187r3;

/* renamed from: r3.o */
/* loaded from: classes.dex */
public final class C2124o {

    /* renamed from: a */
    public final java.lang.Object f8486a;

    /* renamed from: b */
    public final p149j3.InterfaceC1737l f8487b;

    public C2124o(java.lang.Object obj, p149j3.InterfaceC1737l interfaceC1737l) {
        this.f8486a = obj;
        this.f8487b = interfaceC1737l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p187r3.C2124o)) {
            return false;
        }
        p187r3.C2124o c2124o = (p187r3.C2124o) obj;
        return p154k3.AbstractC1803h.m3775a(this.f8486a, c2124o.f8486a) && p154k3.AbstractC1803h.m3775a(this.f8487b, c2124o.f8487b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f8486a;
        return this.f8487b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return "CompletedWithCancellation(result=" + this.f8486a + ", onCancellation=" + this.f8487b + ')';
    }
}
