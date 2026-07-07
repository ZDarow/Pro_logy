package r3;

/* renamed from: r3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8168a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.l f8169b;

    public C0528o(Object obj, j3.l lVar) {
        this.f8168a = obj;
        this.f8169b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0528o)) {
            return false;
        }
        C0528o c0528o = (C0528o) obj;
        return k3.h.a(this.f8168a, c0528o.f8168a) && k3.h.a(this.f8169b, c0528o.f8169b);
    }

    public final int hashCode() {
        Object obj = this.f8168a;
        return this.f8169b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f8168a + ", onCancellation=" + this.f8169b + ')';
    }
}
