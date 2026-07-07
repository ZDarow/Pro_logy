package T;

import B2.AbstractC0007h;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public Object f2143a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2144b;

    /* renamed from: c, reason: collision with root package name */
    public int f2145c;

    /* renamed from: d, reason: collision with root package name */
    public long f2146d;

    /* renamed from: e, reason: collision with root package name */
    public long f2147e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2148f;

    /* renamed from: g, reason: collision with root package name */
    public C0081b f2149g = C0081b.f2225c;

    static {
        AbstractC0007h.n(0, 1, 2, 3, 4);
    }

    public final long a(int i4, int i5) {
        C0080a a4 = this.f2149g.a(i4);
        if (a4.f2217a != -1) {
            return a4.f2222f[i5];
        }
        return -9223372036854775807L;
    }

    public final int b(long j4) {
        int i4;
        C0080a a4;
        int i5;
        C0081b c0081b = this.f2149g;
        long j5 = this.f2146d;
        c0081b.getClass();
        if (j4 == Long.MIN_VALUE) {
            return -1;
        }
        if (j5 != -9223372036854775807L && j4 >= j5) {
            return -1;
        }
        int i6 = 0;
        while (true) {
            i4 = c0081b.f2227a;
            if (i6 >= i4) {
                break;
            }
            c0081b.a(i6).getClass();
            c0081b.a(i6).getClass();
            if (0 > j4 && ((i5 = (a4 = c0081b.a(i6)).f2217a) == -1 || a4.a(-1) < i5)) {
                break;
            }
            i6++;
        }
        if (i6 < i4) {
            return i6;
        }
        return -1;
    }

    public final int c(long j4) {
        C0081b c0081b = this.f2149g;
        int i4 = c0081b.f2227a - 1;
        c0081b.b(i4);
        while (i4 >= 0 && j4 != Long.MIN_VALUE) {
            c0081b.a(i4).getClass();
            if (j4 >= 0) {
                break;
            }
            i4--;
        }
        if (i4 >= 0) {
            C0080a a4 = c0081b.a(i4);
            int i5 = a4.f2217a;
            if (i5 == -1) {
                return i4;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = a4.f2221e[i6];
                if (i7 == 0 || i7 == 1) {
                    return i4;
                }
            }
        }
        return -1;
    }

    public final long d(int i4) {
        this.f2149g.a(i4).getClass();
        return 0L;
    }

    public final int e(int i4) {
        return this.f2149g.a(i4).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !S.class.equals(obj.getClass())) {
            return false;
        }
        S s = (S) obj;
        return W.y.a(this.f2143a, s.f2143a) && W.y.a(this.f2144b, s.f2144b) && this.f2145c == s.f2145c && this.f2146d == s.f2146d && this.f2147e == s.f2147e && this.f2148f == s.f2148f && W.y.a(this.f2149g, s.f2149g);
    }

    public final boolean f(int i4) {
        C0081b c0081b = this.f2149g;
        if (i4 != c0081b.f2227a - 1) {
            return false;
        }
        c0081b.b(i4);
        return false;
    }

    public final boolean g(int i4) {
        this.f2149g.a(i4).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i4, long j4, long j5, C0081b c0081b, boolean z4) {
        this.f2143a = obj;
        this.f2144b = obj2;
        this.f2145c = i4;
        this.f2146d = j4;
        this.f2147e = j5;
        this.f2149g = c0081b;
        this.f2148f = z4;
    }

    public final int hashCode() {
        Object obj = this.f2143a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f2144b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f2145c) * 31;
        long j4 = this.f2146d;
        int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f2147e;
        return this.f2149g.hashCode() + ((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f2148f ? 1 : 0)) * 31);
    }
}
