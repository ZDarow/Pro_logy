package T;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f2230e = new d0(0, 0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f2231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2232b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2233c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2234d;

    static {
        W.y.H(0);
        W.y.H(1);
        W.y.H(2);
        W.y.H(3);
    }

    public d0(int i4, int i5, int i6, float f4) {
        this.f2231a = i4;
        this.f2232b = i5;
        this.f2233c = i6;
        this.f2234d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f2231a == d0Var.f2231a && this.f2232b == d0Var.f2232b && this.f2233c == d0Var.f2233c && this.f2234d == d0Var.f2234d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2234d) + ((((((217 + this.f2231a) * 31) + this.f2232b) * 31) + this.f2233c) * 31);
    }
}
