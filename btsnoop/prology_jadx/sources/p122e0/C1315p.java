package p122e0;

/* renamed from: e0.p */
/* loaded from: classes.dex */
public final class C1315p extends p122e0.AbstractC1313n {

    /* renamed from: j */
    public final android.support.v4.media.session.C1061t f5277j;

    /* renamed from: k */
    public final android.support.v4.media.session.C1061t f5278k;

    /* renamed from: l */
    public final long f5279l;

    public C1315p(p122e0.C1309j c1309j, long j4, long j5, long j6, long j7, long j8, java.util.List list, long j9, android.support.v4.media.session.C1061t c1061t, android.support.v4.media.session.C1061t c1061t2, long j10, long j11) {
        super(c1309j, j4, j5, j6, j8, list, j9, j10, j11);
        this.f5277j = c1061t;
        this.f5278k = c1061t2;
        this.f5279l = j7;
    }

    @Override // p122e0.AbstractC1318s
    /* renamed from: a */
    public final p122e0.C1309j mo3078a(p122e0.AbstractC1312m abstractC1312m) {
        android.support.v4.media.session.C1061t c1061t = this.f5277j;
        if (c1061t == null) {
            return this.f5284a;
        }
        p076T.C0702p c0702p = abstractC1312m.f5265l;
        return new p122e0.C1309j(0L, -1L, c1061t.m2209S(c0702p.f2396a, 0L, c0702p.f2404i, 0L));
    }

    @Override // p122e0.AbstractC1313n
    /* renamed from: d */
    public final long mo3072d(long j4) {
        if (this.f5272f != null) {
            return r0.size();
        }
        long j5 = this.f5279l;
        if (j5 != -1) {
            return (j5 - this.f5270d) + 1;
        }
        if (j4 == -9223372036854775807L) {
            return -1L;
        }
        java.math.BigInteger multiply = java.math.BigInteger.valueOf(j4).multiply(java.math.BigInteger.valueOf(this.f5285b));
        java.math.BigInteger multiply2 = java.math.BigInteger.valueOf(this.f5271e).multiply(java.math.BigInteger.valueOf(1000000L));
        java.math.RoundingMode roundingMode = java.math.RoundingMode.CEILING;
        int i4 = p138h2.AbstractC1503a.f6217a;
        return new java.math.BigDecimal(multiply).divide(new java.math.BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // p122e0.AbstractC1313n
    /* renamed from: h */
    public final p122e0.C1309j mo3076h(p122e0.C1310k c1310k, long j4) {
        long j5 = this.f5270d;
        java.util.List list = this.f5272f;
        long j6 = list != null ? ((p122e0.C1316q) list.get((int) (j4 - j5))).f5280a : (j4 - j5) * this.f5271e;
        p076T.C0702p c0702p = c1310k.f5265l;
        return new p122e0.C1309j(0L, -1L, this.f5278k.m2209S(c0702p.f2396a, j4, c0702p.f2404i, j6));
    }
}
