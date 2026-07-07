package e0;

import W.y;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f5082d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5083e;

    /* renamed from: f, reason: collision with root package name */
    public final List f5084f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5085g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5086h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5087i;

    public n(j jVar, long j4, long j5, long j6, long j7, List list, long j8, long j9, long j10) {
        super(jVar, j4, j5);
        this.f5082d = j6;
        this.f5083e = j7;
        this.f5084f = list;
        this.f5087i = j8;
        this.f5085g = j9;
        this.f5086h = j10;
    }

    public final long b(long j4, long j5) {
        long d4 = d(j4);
        return d4 != -1 ? d4 : (int) (f((j5 - this.f5086h) + this.f5087i, j4) - c(j4, j5));
    }

    public final long c(long j4, long j5) {
        long d4 = d(j4);
        long j6 = this.f5082d;
        if (d4 == -1) {
            long j7 = this.f5085g;
            if (j7 != -9223372036854775807L) {
                return Math.max(j6, f((j5 - this.f5086h) - j7, j4));
            }
        }
        return j6;
    }

    public abstract long d(long j4);

    public final long e(long j4, long j5) {
        long j6 = this.f5097b;
        long j7 = this.f5082d;
        List list = this.f5084f;
        if (list != null) {
            return (((q) list.get((int) (j4 - j7))).f5093b * 1000000) / j6;
        }
        long d4 = d(j5);
        return (d4 == -1 || j4 != (j7 + d4) - 1) ? (this.f5083e * 1000000) / j6 : j5 - g(j4);
    }

    public final long f(long j4, long j5) {
        long d4 = d(j5);
        long j6 = this.f5082d;
        if (d4 == 0) {
            return j6;
        }
        if (this.f5084f == null) {
            long j7 = (j4 / ((this.f5083e * 1000000) / this.f5097b)) + j6;
            return j7 < j6 ? j6 : d4 == -1 ? j7 : Math.min(j7, (j6 + d4) - 1);
        }
        long j8 = (d4 + j6) - 1;
        long j9 = j6;
        while (j9 <= j8) {
            long j10 = ((j8 - j9) / 2) + j9;
            long g4 = g(j10);
            if (g4 < j4) {
                j9 = j10 + 1;
            } else {
                if (g4 <= j4) {
                    return j10;
                }
                j8 = j10 - 1;
            }
        }
        return j9 == j6 ? j9 : j8;
    }

    public final long g(long j4) {
        long j5 = this.f5082d;
        List list = this.f5084f;
        long j6 = list != null ? ((q) list.get((int) (j4 - j5))).f5092a - this.f5098c : (j4 - j5) * this.f5083e;
        int i4 = y.f2709a;
        return y.U(j6, 1000000L, this.f5097b, RoundingMode.FLOOR);
    }

    public abstract j h(k kVar, long j4);

    public boolean i() {
        return this.f5084f != null;
    }
}
