package e0;

import T.C0095p;
import android.support.v4.media.session.t;
import h2.AbstractC0318a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: j, reason: collision with root package name */
    public final t f5089j;

    /* renamed from: k, reason: collision with root package name */
    public final t f5090k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5091l;

    public p(j jVar, long j4, long j5, long j6, long j7, long j8, List list, long j9, t tVar, t tVar2, long j10, long j11) {
        super(jVar, j4, j5, j6, j8, list, j9, j10, j11);
        this.f5089j = tVar;
        this.f5090k = tVar2;
        this.f5091l = j7;
    }

    @Override // e0.s
    public final j a(m mVar) {
        t tVar = this.f5089j;
        if (tVar == null) {
            return this.f5096a;
        }
        C0095p c0095p = mVar.f5077l;
        return new j(0L, -1L, tVar.S(c0095p.f2313a, 0L, c0095p.f2321i, 0L));
    }

    @Override // e0.n
    public final long d(long j4) {
        if (this.f5084f != null) {
            return r0.size();
        }
        long j5 = this.f5091l;
        if (j5 != -1) {
            return (j5 - this.f5082d) + 1;
        }
        if (j4 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j4).multiply(BigInteger.valueOf(this.f5097b));
        BigInteger multiply2 = BigInteger.valueOf(this.f5083e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i4 = AbstractC0318a.f5997a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // e0.n
    public final j h(k kVar, long j4) {
        long j5 = this.f5082d;
        List list = this.f5084f;
        long j6 = list != null ? ((q) list.get((int) (j4 - j5))).f5092a : (j4 - j5) * this.f5083e;
        C0095p c0095p = kVar.f5077l;
        return new j(0L, -1L, this.f5090k.S(c0095p.f2313a, j4, c0095p.f2321i, j6));
    }
}
