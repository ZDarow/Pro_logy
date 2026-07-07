package p086W;

/* renamed from: W.w */
/* loaded from: classes.dex */
public final class C0803w {

    /* renamed from: a */
    public long f2796a;

    /* renamed from: b */
    public long f2797b;

    /* renamed from: c */
    public long f2798c;

    /* renamed from: d */
    public final java.lang.ThreadLocal f2799d = new java.lang.ThreadLocal();

    public C0803w(long j4) {
        m1578f(j4);
    }

    /* renamed from: a */
    public final synchronized long m1573a(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!m1577e()) {
                long j5 = this.f2796a;
                if (j5 == 9223372036854775806L) {
                    java.lang.Long l4 = (java.lang.Long) this.f2799d.get();
                    l4.getClass();
                    j5 = l4.longValue();
                }
                this.f2797b = j5 - j4;
                notifyAll();
            }
            this.f2798c = j4;
            return j4 + this.f2797b;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized long m1574b(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j5 = this.f2798c;
            if (j5 != -9223372036854775807L) {
                long j6 = (j5 * 90000) / 1000000;
                long j7 = (4294967296L + j6) / 8589934592L;
                long j8 = ((j7 - 1) * 8589934592L) + j4;
                long j9 = (j7 * 8589934592L) + j4;
                j4 = java.lang.Math.abs(j8 - j6) < java.lang.Math.abs(j9 - j6) ? j8 : j9;
            }
            return m1573a((j4 * 1000000) / 90000);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized long m1575c(long j4) {
        long j5;
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j6 = this.f2798c;
            if (j6 != -9223372036854775807L) {
                long j7 = (j6 * 90000) / 1000000;
                long j8 = j7 / 8589934592L;
                long j9 = (j8 * 8589934592L) + j4;
                j5 = ((j8 + 1) * 8589934592L) + j4;
                if (j9 >= j7) {
                    j5 = j9;
                }
            } else {
                j5 = j4;
            }
            return m1573a((j5 * 1000000) / 90000);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* renamed from: d */
    public final synchronized long m1576d() {
        long j4;
        j4 = this.f2796a;
        if (j4 == Long.MAX_VALUE || j4 == 9223372036854775806L) {
            j4 = -9223372036854775807L;
        }
        return j4;
    }

    /* renamed from: e */
    public final synchronized boolean m1577e() {
        return this.f2797b != -9223372036854775807L;
    }

    /* renamed from: f */
    public final synchronized void m1578f(long j4) {
        this.f2796a = j4;
        this.f2797b = j4 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f2798c = -9223372036854775807L;
    }

    /* renamed from: g */
    public final synchronized void m1579g(long j4, boolean z4) {
        try {
            p086W.AbstractC0781a.m1421j(this.f2796a == 9223372036854775806L);
            if (m1577e()) {
                return;
            }
            if (z4) {
                this.f2799d.set(java.lang.Long.valueOf(j4));
            } else {
                while (!m1577e()) {
                    wait();
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
