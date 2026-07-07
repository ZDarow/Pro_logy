package p179q0;

/* renamed from: q0.F */
/* loaded from: classes.dex */
public final class C1964F {

    /* renamed from: a */
    public final java.lang.Object f7960a;

    /* renamed from: b */
    public final int f7961b;

    /* renamed from: c */
    public final int f7962c;

    /* renamed from: d */
    public final long f7963d;

    /* renamed from: e */
    public final int f7964e;

    public C1964F(java.lang.Object obj) {
        this(-1L, obj);
    }

    /* renamed from: a */
    public final p179q0.C1964F m3967a(java.lang.Object obj) {
        if (this.f7960a.equals(obj)) {
            return this;
        }
        return new p179q0.C1964F(obj, this.f7961b, this.f7962c, this.f7963d, this.f7964e);
    }

    /* renamed from: b */
    public final boolean m3968b() {
        return this.f7961b != -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p179q0.C1964F)) {
            return false;
        }
        p179q0.C1964F c1964f = (p179q0.C1964F) obj;
        return this.f7960a.equals(c1964f.f7960a) && this.f7961b == c1964f.f7961b && this.f7962c == c1964f.f7962c && this.f7963d == c1964f.f7963d && this.f7964e == c1964f.f7964e;
    }

    public final int hashCode() {
        return ((((((((this.f7960a.hashCode() + 527) * 31) + this.f7961b) * 31) + this.f7962c) * 31) + ((int) this.f7963d)) * 31) + this.f7964e;
    }

    public C1964F(long j4, java.lang.Object obj) {
        this(obj, -1, -1, j4, -1);
    }

    public C1964F(java.lang.Object obj, long j4, int i4) {
        this(obj, -1, -1, j4, i4);
    }

    public C1964F(java.lang.Object obj, int i4, int i5, long j4, int i6) {
        this.f7960a = obj;
        this.f7961b = i4;
        this.f7962c = i5;
        this.f7963d = j4;
        this.f7964e = i6;
    }
}
