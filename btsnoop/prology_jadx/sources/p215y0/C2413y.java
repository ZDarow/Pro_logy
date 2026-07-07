package p215y0;

/* renamed from: y0.y */
/* loaded from: classes.dex */
public final class C2413y {

    /* renamed from: a */
    public final p215y0.C2382A f9503a;

    /* renamed from: b */
    public final p215y0.C2382A f9504b;

    public C2413y(p215y0.C2382A c2382a, p215y0.C2382A c2382a2) {
        this.f9503a = c2382a;
        this.f9504b = c2382a2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p215y0.C2413y.class != obj.getClass()) {
            return false;
        }
        p215y0.C2413y c2413y = (p215y0.C2413y) obj;
        return this.f9503a.equals(c2413y.f9503a) && this.f9504b.equals(c2413y.f9504b);
    }

    public final int hashCode() {
        return this.f9504b.hashCode() + (this.f9503a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        p215y0.C2382A c2382a = this.f9503a;
        sb.append(c2382a);
        p215y0.C2382A c2382a2 = this.f9504b;
        if (c2382a.equals(c2382a2)) {
            str = "";
        } else {
            str = ", " + c2382a2;
        }
        return p009B2.AbstractC0051h.m154m(sb, str, "]");
    }
}
