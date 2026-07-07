package p076T;

/* renamed from: T.x */
/* loaded from: classes.dex */
public final class C0710x {

    /* renamed from: a */
    public final long f2444a;

    /* renamed from: b */
    public final long f2445b;

    /* renamed from: c */
    public final long f2446c;

    /* renamed from: d */
    public final float f2447d;

    /* renamed from: e */
    public final float f2448e;

    static {
        new p076T.C0709w().m1301a();
        p086W.AbstractC0805y.m1587H(0);
        p086W.AbstractC0805y.m1587H(1);
        p086W.AbstractC0805y.m1587H(2);
        p086W.AbstractC0805y.m1587H(3);
        p086W.AbstractC0805y.m1587H(4);
    }

    public C0710x(p076T.C0709w c0709w) {
        long j4 = c0709w.f2439a;
        long j5 = c0709w.f2440b;
        long j6 = c0709w.f2441c;
        float f4 = c0709w.f2442d;
        float f5 = c0709w.f2443e;
        this.f2444a = j4;
        this.f2445b = j5;
        this.f2446c = j6;
        this.f2447d = f4;
        this.f2448e = f5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, T.w] */
    /* renamed from: a */
    public final p076T.C0709w m1302a() {
        ?? obj = new java.lang.Object();
        obj.f2439a = this.f2444a;
        obj.f2440b = this.f2445b;
        obj.f2441c = this.f2446c;
        obj.f2442d = this.f2447d;
        obj.f2443e = this.f2448e;
        return obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p076T.C0710x)) {
            return false;
        }
        p076T.C0710x c0710x = (p076T.C0710x) obj;
        return this.f2444a == c0710x.f2444a && this.f2445b == c0710x.f2445b && this.f2446c == c0710x.f2446c && this.f2447d == c0710x.f2447d && this.f2448e == c0710x.f2448e;
    }

    public final int hashCode() {
        long j4 = this.f2444a;
        long j5 = this.f2445b;
        int i4 = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f2446c;
        int i5 = (i4 + ((int) ((j6 >>> 32) ^ j6))) * 31;
        float f4 = this.f2447d;
        int floatToIntBits = (i5 + (f4 != 0.0f ? java.lang.Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.f2448e;
        return floatToIntBits + (f5 != 0.0f ? java.lang.Float.floatToIntBits(f5) : 0);
    }
}
