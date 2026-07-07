package p102a0;

/* renamed from: a0.m0 */
/* loaded from: classes.dex */
public final class C0987m0 {

    /* renamed from: c */
    public static final p102a0.C0987m0 f3671c;

    /* renamed from: a */
    public final long f3672a;

    /* renamed from: b */
    public final long f3673b;

    static {
        p102a0.C0987m0 c0987m0 = new p102a0.C0987m0(0L, 0L);
        new p102a0.C0987m0(Long.MAX_VALUE, Long.MAX_VALUE);
        new p102a0.C0987m0(Long.MAX_VALUE, 0L);
        new p102a0.C0987m0(0L, Long.MAX_VALUE);
        f3671c = c0987m0;
    }

    public C0987m0(long j4, long j5) {
        p086W.AbstractC0781a.m1416e(j4 >= 0);
        p086W.AbstractC0781a.m1416e(j5 >= 0);
        this.f3672a = j4;
        this.f3673b = j5;
    }

    /* renamed from: a */
    public final long m2029a(long j4, long j5, long j6) {
        long j7 = this.f3672a;
        long j8 = this.f3673b;
        if (j7 == 0 && j8 == 0) {
            return j4;
        }
        int i4 = p086W.AbstractC0805y.f2801a;
        long j9 = j4 - j7;
        if (((j7 ^ j4) & (j4 ^ j9)) < 0) {
            j9 = Long.MIN_VALUE;
        }
        long j10 = j4 + j8;
        if (((j8 ^ j10) & (j4 ^ j10)) < 0) {
            j10 = Long.MAX_VALUE;
        }
        boolean z4 = false;
        boolean z5 = j9 <= j5 && j5 <= j10;
        if (j9 <= j6 && j6 <= j10) {
            z4 = true;
        }
        return (z5 && z4) ? java.lang.Math.abs(j5 - j4) <= java.lang.Math.abs(j6 - j4) ? j5 : j6 : z5 ? j5 : z4 ? j6 : j9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p102a0.C0987m0.class != obj.getClass()) {
            return false;
        }
        p102a0.C0987m0 c0987m0 = (p102a0.C0987m0) obj;
        return this.f3672a == c0987m0.f3672a && this.f3673b == c0987m0.f3673b;
    }

    public final int hashCode() {
        return (((int) this.f3672a) * 31) + ((int) this.f3673b);
    }
}
