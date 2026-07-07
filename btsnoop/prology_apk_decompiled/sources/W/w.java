package W;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long f2704a;

    /* renamed from: b, reason: collision with root package name */
    public long f2705b;

    /* renamed from: c, reason: collision with root package name */
    public long f2706c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f2707d = new ThreadLocal();

    public w(long j4) {
        f(j4);
    }

    public final synchronized long a(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long j5 = this.f2704a;
                if (j5 == 9223372036854775806L) {
                    Long l4 = (Long) this.f2707d.get();
                    l4.getClass();
                    j5 = l4.longValue();
                }
                this.f2705b = j5 - j4;
                notifyAll();
            }
            this.f2706c = j4;
            return j4 + this.f2705b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j5 = this.f2706c;
            if (j5 != -9223372036854775807L) {
                long j6 = (j5 * 90000) / 1000000;
                long j7 = (4294967296L + j6) / 8589934592L;
                long j8 = ((j7 - 1) * 8589934592L) + j4;
                long j9 = (j7 * 8589934592L) + j4;
                j4 = Math.abs(j8 - j6) < Math.abs(j9 - j6) ? j8 : j9;
            }
            return a((j4 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j4) {
        long j5;
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j6 = this.f2706c;
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
            return a((j5 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j4;
        j4 = this.f2704a;
        if (j4 == Long.MAX_VALUE || j4 == 9223372036854775806L) {
            j4 = -9223372036854775807L;
        }
        return j4;
    }

    public final synchronized boolean e() {
        return this.f2705b != -9223372036854775807L;
    }

    public final synchronized void f(long j4) {
        this.f2704a = j4;
        this.f2705b = j4 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f2706c = -9223372036854775807L;
    }

    public final synchronized void g(long j4, boolean z4) {
        try {
            a.j(this.f2704a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z4) {
                this.f2707d.set(Long.valueOf(j4));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
