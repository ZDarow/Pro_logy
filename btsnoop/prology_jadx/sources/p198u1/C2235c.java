package p198u1;

/* renamed from: u1.c */
/* loaded from: classes.dex */
public final class C2235c {

    /* renamed from: a */
    public final p185r1.C2059b f8915a;

    /* renamed from: b */
    public final p198u1.C2234b f8916b;

    /* renamed from: c */
    public final p198u1.C2234b f8917c;

    public C2235c(p185r1.C2059b c2059b, p198u1.C2234b c2234b, p198u1.C2234b c2234b2) {
        this.f8915a = c2059b;
        this.f8916b = c2234b;
        this.f8917c = c2234b2;
        if (c2059b.m4119b() == 0 && c2059b.m4118a() == 0) {
            throw new java.lang.IllegalArgumentException("Bounds must be non zero");
        }
        if (c2059b.f8385a != 0 && c2059b.f8386b != 0) {
            throw new java.lang.IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p198u1.C2235c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        p198u1.C2235c c2235c = (p198u1.C2235c) obj;
        return p154k3.AbstractC1803h.m3775a(this.f8915a, c2235c.f8915a) && p154k3.AbstractC1803h.m3775a(this.f8916b, c2235c.f8916b) && p154k3.AbstractC1803h.m3775a(this.f8917c, c2235c.f8917c);
    }

    public final int hashCode() {
        return this.f8917c.hashCode() + ((this.f8916b.hashCode() + (this.f8915a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return p198u1.C2235c.class.getSimpleName() + " { " + this.f8915a + ", type=" + this.f8916b + ", state=" + this.f8917c + " }";
    }
}
