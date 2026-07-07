package p198u1;

/* renamed from: u1.k */
/* loaded from: classes.dex */
public final class C2243k {

    /* renamed from: a */
    public final p185r1.C2059b f8933a;

    /* renamed from: b */
    public final p011C.C0105O f8934b;

    public C2243k(p185r1.C2059b c2059b, p011C.C0105O c0105o) {
        p154k3.AbstractC1803h.m3779e(c0105o, "_windowInsetsCompat");
        this.f8933a = c2059b;
        this.f8934b = c0105o;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p198u1.C2243k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        p198u1.C2243k c2243k = (p198u1.C2243k) obj;
        return p154k3.AbstractC1803h.m3775a(this.f8933a, c2243k.f8933a) && p154k3.AbstractC1803h.m3775a(this.f8934b, c2243k.f8934b);
    }

    public final int hashCode() {
        return this.f8934b.hashCode() + (this.f8933a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "WindowMetrics( bounds=" + this.f8933a + ", windowInsetsCompat=" + this.f8934b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2243k(android.graphics.Rect rect, p011C.C0105O c0105o) {
        this(new p185r1.C2059b(rect), c0105o);
        p154k3.AbstractC1803h.m3779e(c0105o, "insets");
    }
}
