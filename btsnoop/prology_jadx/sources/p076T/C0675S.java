package p076T;

/* renamed from: T.S */
/* loaded from: classes.dex */
public final class C0675S {

    /* renamed from: a */
    public java.lang.Object f2223a;

    /* renamed from: b */
    public java.lang.Object f2224b;

    /* renamed from: c */
    public int f2225c;

    /* renamed from: d */
    public long f2226d;

    /* renamed from: e */
    public long f2227e;

    /* renamed from: f */
    public boolean f2228f;

    /* renamed from: g */
    public p076T.C0685b f2229g = p076T.C0685b.f2305c;

    static {
        p009B2.AbstractC0051h.m155n(0, 1, 2, 3, 4);
    }

    /* renamed from: a */
    public final long m1237a(int i4, int i5) {
        p076T.C0683a m1265a = this.f2229g.m1265a(i4);
        if (m1265a.f2297a != -1) {
            return m1265a.f2302f[i5];
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public final int m1238b(long j4) {
        int i4;
        p076T.C0683a m1265a;
        int i5;
        p076T.C0685b c0685b = this.f2229g;
        long j5 = this.f2226d;
        c0685b.getClass();
        if (j4 == Long.MIN_VALUE) {
            return -1;
        }
        if (j5 != -9223372036854775807L && j4 >= j5) {
            return -1;
        }
        int i6 = 0;
        while (true) {
            i4 = c0685b.f2307a;
            if (i6 >= i4) {
                break;
            }
            c0685b.m1265a(i6).getClass();
            c0685b.m1265a(i6).getClass();
            if (0 > j4 && ((i5 = (m1265a = c0685b.m1265a(i6)).f2297a) == -1 || m1265a.m1262a(-1) < i5)) {
                break;
            }
            i6++;
        }
        if (i6 < i4) {
            return i6;
        }
        return -1;
    }

    /* renamed from: c */
    public final int m1239c(long j4) {
        p076T.C0685b c0685b = this.f2229g;
        int i4 = c0685b.f2307a - 1;
        c0685b.m1266b(i4);
        while (i4 >= 0 && j4 != Long.MIN_VALUE) {
            c0685b.m1265a(i4).getClass();
            if (j4 >= 0) {
                break;
            }
            i4--;
        }
        if (i4 >= 0) {
            p076T.C0683a m1265a = c0685b.m1265a(i4);
            int i5 = m1265a.f2297a;
            if (i5 == -1) {
                return i4;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = m1265a.f2301e[i6];
                if (i7 == 0 || i7 == 1) {
                    return i4;
                }
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final long m1240d(int i4) {
        this.f2229g.m1265a(i4).getClass();
        return 0L;
    }

    /* renamed from: e */
    public final int m1241e(int i4) {
        return this.f2229g.m1265a(i4).m1262a(-1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p076T.C0675S.class.equals(obj.getClass())) {
            return false;
        }
        p076T.C0675S c0675s = (p076T.C0675S) obj;
        return p086W.AbstractC0805y.m1606a(this.f2223a, c0675s.f2223a) && p086W.AbstractC0805y.m1606a(this.f2224b, c0675s.f2224b) && this.f2225c == c0675s.f2225c && this.f2226d == c0675s.f2226d && this.f2227e == c0675s.f2227e && this.f2228f == c0675s.f2228f && p086W.AbstractC0805y.m1606a(this.f2229g, c0675s.f2229g);
    }

    /* renamed from: f */
    public final boolean m1242f(int i4) {
        p076T.C0685b c0685b = this.f2229g;
        if (i4 != c0685b.f2307a - 1) {
            return false;
        }
        c0685b.m1266b(i4);
        return false;
    }

    /* renamed from: g */
    public final boolean m1243g(int i4) {
        this.f2229g.m1265a(i4).getClass();
        return false;
    }

    /* renamed from: h */
    public final void m1244h(java.lang.Object obj, java.lang.Object obj2, int i4, long j4, long j5, p076T.C0685b c0685b, boolean z4) {
        this.f2223a = obj;
        this.f2224b = obj2;
        this.f2225c = i4;
        this.f2226d = j4;
        this.f2227e = j5;
        this.f2229g = c0685b;
        this.f2228f = z4;
    }

    public final int hashCode() {
        java.lang.Object obj = this.f2223a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        java.lang.Object obj2 = this.f2224b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f2225c) * 31;
        long j4 = this.f2226d;
        int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f2227e;
        return this.f2229g.hashCode() + ((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f2228f ? 1 : 0)) * 31);
    }
}
