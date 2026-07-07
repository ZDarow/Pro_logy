package p185r1;

/* renamed from: r1.b */
/* loaded from: classes.dex */
public final class C2059b {

    /* renamed from: a */
    public final int f8385a;

    /* renamed from: b */
    public final int f8386b;

    /* renamed from: c */
    public final int f8387c;

    /* renamed from: d */
    public final int f8388d;

    public C2059b(android.graphics.Rect rect) {
        int i4 = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        this.f8385a = i4;
        this.f8386b = i5;
        this.f8387c = i6;
        this.f8388d = i7;
        if (i4 > i6) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m150i(i4, i6, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i5 > i7) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m150i(i5, i7, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    /* renamed from: a */
    public final int m4118a() {
        return this.f8388d - this.f8386b;
    }

    /* renamed from: b */
    public final int m4119b() {
        return this.f8387c - this.f8385a;
    }

    /* renamed from: c */
    public final android.graphics.Rect m4120c() {
        return new android.graphics.Rect(this.f8385a, this.f8386b, this.f8387c, this.f8388d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p185r1.C2059b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        p185r1.C2059b c2059b = (p185r1.C2059b) obj;
        return this.f8385a == c2059b.f8385a && this.f8386b == c2059b.f8386b && this.f8387c == c2059b.f8387c && this.f8388d == c2059b.f8388d;
    }

    public final int hashCode() {
        return (((((this.f8385a * 31) + this.f8386b) * 31) + this.f8387c) * 31) + this.f8388d;
    }

    public final java.lang.String toString() {
        return p185r1.C2059b.class.getSimpleName() + " { [" + this.f8385a + ',' + this.f8386b + ',' + this.f8387c + ',' + this.f8388d + "] }";
    }
}
