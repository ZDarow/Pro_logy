package p122e0;

/* renamed from: e0.j */
/* loaded from: classes.dex */
public final class C1309j {

    /* renamed from: a */
    public final long f5258a;

    /* renamed from: b */
    public final long f5259b;

    /* renamed from: c */
    public final java.lang.String f5260c;

    /* renamed from: d */
    public int f5261d;

    public C1309j(long j4, long j5, java.lang.String str) {
        this.f5260c = str == null ? "" : str;
        this.f5258a = j4;
        this.f5259b = j5;
    }

    /* renamed from: a */
    public final p122e0.C1309j m3066a(p122e0.C1309j c1309j, java.lang.String str) {
        long j4;
        java.lang.String m1435x = p086W.AbstractC0781a.m1435x(str, this.f5260c);
        if (c1309j == null || !m1435x.equals(p086W.AbstractC0781a.m1435x(str, c1309j.f5260c))) {
            return null;
        }
        long j5 = this.f5259b;
        long j6 = c1309j.f5259b;
        if (j5 != -1) {
            long j7 = this.f5258a;
            j4 = j5;
            if (j7 + j5 == c1309j.f5258a) {
                return new p122e0.C1309j(j7, j6 == -1 ? -1L : j4 + j6, m1435x);
            }
        } else {
            j4 = j5;
        }
        if (j6 != -1) {
            long j8 = c1309j.f5258a;
            if (j8 + j6 == this.f5258a) {
                return new p122e0.C1309j(j8, j4 == -1 ? -1L : j6 + j4, m1435x);
            }
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p122e0.C1309j.class != obj.getClass()) {
            return false;
        }
        p122e0.C1309j c1309j = (p122e0.C1309j) obj;
        return this.f5258a == c1309j.f5258a && this.f5259b == c1309j.f5259b && this.f5260c.equals(c1309j.f5260c);
    }

    public final int hashCode() {
        if (this.f5261d == 0) {
            this.f5261d = this.f5260c.hashCode() + ((((527 + ((int) this.f5258a)) * 31) + ((int) this.f5259b)) * 31);
        }
        return this.f5261d;
    }

    public final java.lang.String toString() {
        return "RangedUri(referenceUri=" + this.f5260c + ", start=" + this.f5258a + ", length=" + this.f5259b + ")";
    }
}
