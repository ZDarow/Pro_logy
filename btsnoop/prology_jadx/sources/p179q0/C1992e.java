package p179q0;

/* renamed from: q0.e */
/* loaded from: classes.dex */
public final class C1992e extends p179q0.AbstractC2017v {

    /* renamed from: c */
    public final long f8131c;

    /* renamed from: d */
    public final long f8132d;

    /* renamed from: e */
    public final long f8133e;

    /* renamed from: f */
    public final boolean f8134f;

    public C1992e(p076T.AbstractC0677U abstractC0677U, long j4, long j5) {
        super(abstractC0677U);
        boolean z4 = false;
        if (abstractC0677U.mo1233h() != 1) {
            throw new p179q0.C1994f(0);
        }
        p076T.C0676T mo1235m = abstractC0677U.mo1235m(0, new p076T.C0676T(), 0L);
        long max = java.lang.Math.max(0L, j4);
        if (!mo1235m.f2242k && max != 0 && !mo1235m.f2239h) {
            throw new p179q0.C1994f(1);
        }
        long max2 = j5 == Long.MIN_VALUE ? mo1235m.f2244m : java.lang.Math.max(0L, j5);
        long j6 = mo1235m.f2244m;
        if (j6 != -9223372036854775807L) {
            max2 = max2 > j6 ? j6 : max2;
            if (max > max2) {
                throw new p179q0.C1994f(2);
            }
        }
        this.f8131c = max;
        this.f8132d = max2;
        this.f8133e = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (mo1235m.f2240i && (max2 == -9223372036854775807L || (j6 != -9223372036854775807L && max2 == j6))) {
            z4 = true;
        }
        this.f8134f = z4;
    }

    @Override // p179q0.AbstractC2017v, p076T.AbstractC0677U
    /* renamed from: f */
    public final p076T.C0675S mo1232f(int i4, p076T.C0675S c0675s, boolean z4) {
        this.f8231b.mo1232f(0, c0675s, z4);
        long j4 = c0675s.f2227e - this.f8131c;
        long j5 = this.f8133e;
        c0675s.m1244h(c0675s.f2223a, c0675s.f2224b, 0, j5 == -9223372036854775807L ? -9223372036854775807L : j5 - j4, j4, p076T.C0685b.f2305c, false);
        return c0675s;
    }

    @Override // p179q0.AbstractC2017v, p076T.AbstractC0677U
    /* renamed from: m */
    public final p076T.C0676T mo1235m(int i4, p076T.C0676T c0676t, long j4) {
        this.f8231b.mo1235m(0, c0676t, 0L);
        long j5 = c0676t.f2247p;
        long j6 = this.f8131c;
        c0676t.f2247p = j5 + j6;
        c0676t.f2244m = this.f8133e;
        c0676t.f2240i = this.f8134f;
        long j7 = c0676t.f2243l;
        if (j7 != -9223372036854775807L) {
            long max = java.lang.Math.max(j7, j6);
            c0676t.f2243l = max;
            long j8 = this.f8132d;
            if (j8 != -9223372036854775807L) {
                max = java.lang.Math.min(max, j8);
            }
            c0676t.f2243l = max - j6;
        }
        long m1605Z = p086W.AbstractC0805y.m1605Z(j6);
        long j9 = c0676t.f2236e;
        if (j9 != -9223372036854775807L) {
            c0676t.f2236e = j9 + m1605Z;
        }
        long j10 = c0676t.f2237f;
        if (j10 != -9223372036854775807L) {
            c0676t.f2237f = j10 + m1605Z;
        }
        return c0676t;
    }
}
