package p196u;

/* renamed from: u.b */
/* loaded from: classes.dex */
public final class C2207b {

    /* renamed from: e */
    public static final p196u.C2207b f8809e = new p196u.C2207b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f8810a;

    /* renamed from: b */
    public final int f8811b;

    /* renamed from: c */
    public final int f8812c;

    /* renamed from: d */
    public final int f8813d;

    public C2207b(int i4, int i5, int i6, int i7) {
        this.f8810a = i4;
        this.f8811b = i5;
        this.f8812c = i6;
        this.f8813d = i7;
    }

    /* renamed from: a */
    public static p196u.C2207b m4386a(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f8809e : new p196u.C2207b(i4, i5, i6, i7);
    }

    /* renamed from: b */
    public static p196u.C2207b m4387b(android.graphics.Insets insets) {
        int i4;
        int i5;
        int i6;
        int i7;
        i4 = insets.left;
        i5 = insets.top;
        i6 = insets.right;
        i7 = insets.bottom;
        return m4386a(i4, i5, i6, i7);
    }

    /* renamed from: c */
    public final android.graphics.Insets m4388c() {
        return p183r.AbstractC2036d.m4089a(this.f8810a, this.f8811b, this.f8812c, this.f8813d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p196u.C2207b.class != obj.getClass()) {
            return false;
        }
        p196u.C2207b c2207b = (p196u.C2207b) obj;
        return this.f8813d == c2207b.f8813d && this.f8810a == c2207b.f8810a && this.f8812c == c2207b.f8812c && this.f8811b == c2207b.f8811b;
    }

    public final int hashCode() {
        return (((((this.f8810a * 31) + this.f8811b) * 31) + this.f8812c) * 31) + this.f8813d;
    }

    public final java.lang.String toString() {
        return "Insets{left=" + this.f8810a + ", top=" + this.f8811b + ", right=" + this.f8812c + ", bottom=" + this.f8813d + '}';
    }
}
