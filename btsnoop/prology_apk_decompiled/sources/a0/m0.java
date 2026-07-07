package a0;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f3548c;

    /* renamed from: a, reason: collision with root package name */
    public final long f3549a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3550b;

    static {
        m0 m0Var = new m0(0L, 0L);
        new m0(Long.MAX_VALUE, Long.MAX_VALUE);
        new m0(Long.MAX_VALUE, 0L);
        new m0(0L, Long.MAX_VALUE);
        f3548c = m0Var;
    }

    public m0(long j4, long j5) {
        W.a.e(j4 >= 0);
        W.a.e(j5 >= 0);
        this.f3549a = j4;
        this.f3550b = j5;
    }

    public final long a(long j4, long j5, long j6) {
        long j7 = this.f3549a;
        long j8 = this.f3550b;
        if (j7 == 0 && j8 == 0) {
            return j4;
        }
        int i4 = W.y.f2709a;
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
        return (z5 && z4) ? Math.abs(j5 - j4) <= Math.abs(j6 - j4) ? j5 : j6 : z5 ? j5 : z4 ? j6 : j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f3549a == m0Var.f3549a && this.f3550b == m0Var.f3550b;
    }

    public final int hashCode() {
        return (((int) this.f3549a) * 31) + ((int) this.f3550b);
    }
}
