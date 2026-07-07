package q0;

import T.C0081b;

/* renamed from: q0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473e extends AbstractC0489v {

    /* renamed from: c, reason: collision with root package name */
    public final long f7828c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7829d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7830e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7831f;

    public C0473e(T.U u4, long j4, long j5) {
        super(u4);
        boolean z4 = false;
        if (u4.h() != 1) {
            throw new C0474f(0);
        }
        T.T m4 = u4.m(0, new T.T(), 0L);
        long max = Math.max(0L, j4);
        if (!m4.f2162k && max != 0 && !m4.f2159h) {
            throw new C0474f(1);
        }
        long max2 = j5 == Long.MIN_VALUE ? m4.f2164m : Math.max(0L, j5);
        long j6 = m4.f2164m;
        if (j6 != -9223372036854775807L) {
            max2 = max2 > j6 ? j6 : max2;
            if (max > max2) {
                throw new C0474f(2);
            }
        }
        this.f7828c = max;
        this.f7829d = max2;
        this.f7830e = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (m4.f2160i && (max2 == -9223372036854775807L || (j6 != -9223372036854775807L && max2 == j6))) {
            z4 = true;
        }
        this.f7831f = z4;
    }

    @Override // q0.AbstractC0489v, T.U
    public final T.S f(int i4, T.S s, boolean z4) {
        this.f7923b.f(0, s, z4);
        long j4 = s.f2147e - this.f7828c;
        long j5 = this.f7830e;
        s.h(s.f2143a, s.f2144b, 0, j5 == -9223372036854775807L ? -9223372036854775807L : j5 - j4, j4, C0081b.f2225c, false);
        return s;
    }

    @Override // q0.AbstractC0489v, T.U
    public final T.T m(int i4, T.T t4, long j4) {
        this.f7923b.m(0, t4, 0L);
        long j5 = t4.f2167p;
        long j6 = this.f7828c;
        t4.f2167p = j5 + j6;
        t4.f2164m = this.f7830e;
        t4.f2160i = this.f7831f;
        long j7 = t4.f2163l;
        if (j7 != -9223372036854775807L) {
            long max = Math.max(j7, j6);
            t4.f2163l = max;
            long j8 = this.f7829d;
            if (j8 != -9223372036854775807L) {
                max = Math.min(max, j8);
            }
            t4.f2163l = max - j6;
        }
        long Z3 = W.y.Z(j6);
        long j9 = t4.f2156e;
        if (j9 != -9223372036854775807L) {
            t4.f2156e = j9 + Z3;
        }
        long j10 = t4.f2157f;
        if (j10 != -9223372036854775807L) {
            t4.f2157f = j10 + Z3;
        }
        return t4;
    }
}
