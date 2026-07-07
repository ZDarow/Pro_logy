package p122e0;

/* renamed from: e0.n */
/* loaded from: classes.dex */
public abstract class AbstractC1313n extends p122e0.AbstractC1318s {

    /* renamed from: d */
    public final long f5270d;

    /* renamed from: e */
    public final long f5271e;

    /* renamed from: f */
    public final java.util.List f5272f;

    /* renamed from: g */
    public final long f5273g;

    /* renamed from: h */
    public final long f5274h;

    /* renamed from: i */
    public final long f5275i;

    public AbstractC1313n(p122e0.C1309j c1309j, long j4, long j5, long j6, long j7, java.util.List list, long j8, long j9, long j10) {
        super(c1309j, j4, j5);
        this.f5270d = j6;
        this.f5271e = j7;
        this.f5272f = list;
        this.f5275i = j8;
        this.f5273g = j9;
        this.f5274h = j10;
    }

    /* renamed from: b */
    public final long m3070b(long j4, long j5) {
        long mo3072d = mo3072d(j4);
        return mo3072d != -1 ? mo3072d : (int) (m3074f((j5 - this.f5274h) + this.f5275i, j4) - m3071c(j4, j5));
    }

    /* renamed from: c */
    public final long m3071c(long j4, long j5) {
        long mo3072d = mo3072d(j4);
        long j6 = this.f5270d;
        if (mo3072d == -1) {
            long j7 = this.f5273g;
            if (j7 != -9223372036854775807L) {
                return java.lang.Math.max(j6, m3074f((j5 - this.f5274h) - j7, j4));
            }
        }
        return j6;
    }

    /* renamed from: d */
    public abstract long mo3072d(long j4);

    /* renamed from: e */
    public final long m3073e(long j4, long j5) {
        long j6 = this.f5285b;
        long j7 = this.f5270d;
        java.util.List list = this.f5272f;
        if (list != null) {
            return (((p122e0.C1316q) list.get((int) (j4 - j7))).f5281b * 1000000) / j6;
        }
        long mo3072d = mo3072d(j5);
        return (mo3072d == -1 || j4 != (j7 + mo3072d) - 1) ? (this.f5271e * 1000000) / j6 : j5 - m3075g(j4);
    }

    /* renamed from: f */
    public final long m3074f(long j4, long j5) {
        long mo3072d = mo3072d(j5);
        long j6 = this.f5270d;
        if (mo3072d == 0) {
            return j6;
        }
        if (this.f5272f == null) {
            long j7 = (j4 / ((this.f5271e * 1000000) / this.f5285b)) + j6;
            return j7 < j6 ? j6 : mo3072d == -1 ? j7 : java.lang.Math.min(j7, (j6 + mo3072d) - 1);
        }
        long j8 = (mo3072d + j6) - 1;
        long j9 = j6;
        while (j9 <= j8) {
            long j10 = ((j8 - j9) / 2) + j9;
            long m3075g = m3075g(j10);
            if (m3075g < j4) {
                j9 = j10 + 1;
            } else {
                if (m3075g <= j4) {
                    return j10;
                }
                j8 = j10 - 1;
            }
        }
        return j9 == j6 ? j9 : j8;
    }

    /* renamed from: g */
    public final long m3075g(long j4) {
        long j5 = this.f5270d;
        java.util.List list = this.f5272f;
        long j6 = list != null ? ((p122e0.C1316q) list.get((int) (j4 - j5))).f5280a - this.f5286c : (j4 - j5) * this.f5271e;
        int i4 = p086W.AbstractC0805y.f2801a;
        return p086W.AbstractC0805y.m1600U(j6, 1000000L, this.f5285b, java.math.RoundingMode.FLOOR);
    }

    /* renamed from: h */
    public abstract p122e0.C1309j mo3076h(p122e0.C1310k c1310k, long j4);

    /* renamed from: i */
    public boolean mo3077i() {
        return this.f5272f != null;
    }
}
