package a0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final q0.F f3350a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3351b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3352c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3353d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3354e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3355f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3356g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3357h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3358i;

    public U(q0.F f4, long j4, long j5, long j6, long j7, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean z8 = true;
        W.a.e(!z7 || z5);
        W.a.e(!z6 || z5);
        if (z4 && (z5 || z6 || z7)) {
            z8 = false;
        }
        W.a.e(z8);
        this.f3350a = f4;
        this.f3351b = j4;
        this.f3352c = j5;
        this.f3353d = j6;
        this.f3354e = j7;
        this.f3355f = z4;
        this.f3356g = z5;
        this.f3357h = z6;
        this.f3358i = z7;
    }

    public final U a(long j4) {
        if (j4 == this.f3352c) {
            return this;
        }
        return new U(this.f3350a, this.f3351b, j4, this.f3353d, this.f3354e, this.f3355f, this.f3356g, this.f3357h, this.f3358i);
    }

    public final U b(long j4) {
        if (j4 == this.f3351b) {
            return this;
        }
        return new U(this.f3350a, j4, this.f3352c, this.f3353d, this.f3354e, this.f3355f, this.f3356g, this.f3357h, this.f3358i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U.class != obj.getClass()) {
            return false;
        }
        U u4 = (U) obj;
        return this.f3351b == u4.f3351b && this.f3352c == u4.f3352c && this.f3353d == u4.f3353d && this.f3354e == u4.f3354e && this.f3355f == u4.f3355f && this.f3356g == u4.f3356g && this.f3357h == u4.f3357h && this.f3358i == u4.f3358i && W.y.a(this.f3350a, u4.f3350a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f3350a.hashCode() + 527) * 31) + ((int) this.f3351b)) * 31) + ((int) this.f3352c)) * 31) + ((int) this.f3353d)) * 31) + ((int) this.f3354e)) * 31) + (this.f3355f ? 1 : 0)) * 31) + (this.f3356g ? 1 : 0)) * 31) + (this.f3357h ? 1 : 0)) * 31) + (this.f3358i ? 1 : 0);
    }
}
