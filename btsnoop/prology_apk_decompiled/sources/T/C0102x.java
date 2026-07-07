package T;

/* renamed from: T.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102x {

    /* renamed from: a, reason: collision with root package name */
    public final long f2359a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2360b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2361c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2362d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2363e;

    static {
        new C0101w().a();
        W.y.H(0);
        W.y.H(1);
        W.y.H(2);
        W.y.H(3);
        W.y.H(4);
    }

    public C0102x(C0101w c0101w) {
        long j4 = c0101w.f2354a;
        long j5 = c0101w.f2355b;
        long j6 = c0101w.f2356c;
        float f4 = c0101w.f2357d;
        float f5 = c0101w.f2358e;
        this.f2359a = j4;
        this.f2360b = j5;
        this.f2361c = j6;
        this.f2362d = f4;
        this.f2363e = f5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, T.w] */
    public final C0101w a() {
        ?? obj = new Object();
        obj.f2354a = this.f2359a;
        obj.f2355b = this.f2360b;
        obj.f2356c = this.f2361c;
        obj.f2357d = this.f2362d;
        obj.f2358e = this.f2363e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0102x)) {
            return false;
        }
        C0102x c0102x = (C0102x) obj;
        return this.f2359a == c0102x.f2359a && this.f2360b == c0102x.f2360b && this.f2361c == c0102x.f2361c && this.f2362d == c0102x.f2362d && this.f2363e == c0102x.f2363e;
    }

    public final int hashCode() {
        long j4 = this.f2359a;
        long j5 = this.f2360b;
        int i4 = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f2361c;
        int i5 = (i4 + ((int) ((j6 >>> 32) ^ j6))) * 31;
        float f4 = this.f2362d;
        int floatToIntBits = (i5 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.f2363e;
        return floatToIntBits + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0);
    }
}
