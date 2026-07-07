package a0;

import T.C0081b;
import android.util.Pair;
import f2.C0278F;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: c, reason: collision with root package name */
    public final b0.e f3365c;

    /* renamed from: d, reason: collision with root package name */
    public final W.v f3366d;

    /* renamed from: e, reason: collision with root package name */
    public final B2.x f3367e;

    /* renamed from: f, reason: collision with root package name */
    public long f3368f;

    /* renamed from: g, reason: collision with root package name */
    public int f3369g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3370h;

    /* renamed from: i, reason: collision with root package name */
    public T f3371i;

    /* renamed from: j, reason: collision with root package name */
    public T f3372j;

    /* renamed from: k, reason: collision with root package name */
    public T f3373k;

    /* renamed from: l, reason: collision with root package name */
    public int f3374l;

    /* renamed from: m, reason: collision with root package name */
    public Object f3375m;

    /* renamed from: n, reason: collision with root package name */
    public long f3376n;

    /* renamed from: a, reason: collision with root package name */
    public final T.S f3363a = new T.S();

    /* renamed from: b, reason: collision with root package name */
    public final T.T f3364b = new T.T();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3377o = new ArrayList();

    public W(b0.e eVar, W.v vVar, B2.x xVar, r rVar) {
        this.f3365c = eVar;
        this.f3366d = vVar;
        this.f3367e = xVar;
    }

    public static q0.F l(T.U u4, Object obj, long j4, long j5, T.T t4, T.S s) {
        u4.g(obj, s);
        u4.n(s.f2145c, t4);
        u4.b(obj);
        int i4 = s.f2149g.f2227a;
        if (i4 != 0) {
            if (i4 == 1) {
                s.f(0);
            }
            s.f2149g.getClass();
            s.g(0);
        }
        u4.g(obj, s);
        int c4 = s.c(j4);
        return c4 == -1 ? new q0.F(obj, j5, s.b(j4)) : new q0.F(obj, c4, s.e(c4), j5, -1);
    }

    public final T a() {
        T t4 = this.f3371i;
        if (t4 == null) {
            return null;
        }
        if (t4 == this.f3372j) {
            this.f3372j = t4.f3346l;
        }
        t4.g();
        int i4 = this.f3374l - 1;
        this.f3374l = i4;
        if (i4 == 0) {
            this.f3373k = null;
            T t5 = this.f3371i;
            this.f3375m = t5.f3336b;
            this.f3376n = t5.f3340f.f3350a.f7671d;
        }
        this.f3371i = this.f3371i.f3346l;
        j();
        return this.f3371i;
    }

    public final void b() {
        if (this.f3374l == 0) {
            return;
        }
        T t4 = this.f3371i;
        W.a.k(t4);
        this.f3375m = t4.f3336b;
        this.f3376n = t4.f3340f.f3350a.f7671d;
        while (t4 != null) {
            t4.g();
            t4 = t4.f3346l;
        }
        this.f3371i = null;
        this.f3373k = null;
        this.f3372j = null;
        this.f3374l = 0;
        j();
    }

    public final U c(T.U u4, T t4, long j4) {
        U f4;
        long j5;
        U u5 = t4.f3340f;
        long j6 = (t4.f3349o + u5.f3354e) - j4;
        if (u5.f3356g) {
            U u6 = t4.f3340f;
            q0.F f5 = u6.f3350a;
            int d4 = u4.d(u4.b(f5.f7668a), this.f3363a, this.f3364b, this.f3369g, this.f3370h);
            if (d4 != -1) {
                T.S s = this.f3363a;
                int i4 = u4.f(d4, s, true).f2145c;
                Object obj = s.f2144b;
                obj.getClass();
                long j7 = f5.f7671d;
                long j8 = 0;
                if (u4.m(i4, this.f3364b, 0L).f2165n == d4) {
                    Pair j9 = u4.j(this.f3364b, this.f3363a, i4, -9223372036854775807L, Math.max(0L, j6));
                    if (j9 != null) {
                        obj = j9.first;
                        long longValue = ((Long) j9.second).longValue();
                        T t5 = t4.f3346l;
                        if (t5 == null || !t5.f3336b.equals(obj)) {
                            j7 = n(obj);
                            if (j7 == -1) {
                                j7 = this.f3368f;
                                this.f3368f = 1 + j7;
                            }
                        } else {
                            j7 = t5.f3340f.f3350a.f7671d;
                        }
                        j5 = longValue;
                        j8 = -9223372036854775807L;
                    }
                } else {
                    j5 = 0;
                }
                q0.F l4 = l(u4, obj, j5, j7, this.f3364b, this.f3363a);
                if (j8 != -9223372036854775807L && u6.f3352c != -9223372036854775807L) {
                    int i5 = u4.g(f5.f7668a, s).f2149g.f2227a;
                    s.f2149g.getClass();
                    if (i5 > 0) {
                        s.g(0);
                    }
                }
                return d(u4, l4, j8, j5);
            }
            return null;
        }
        q0.F f6 = u5.f3350a;
        Object obj2 = f6.f7668a;
        T.S s4 = this.f3363a;
        u4.g(obj2, s4);
        boolean b4 = f6.b();
        Object obj3 = f6.f7668a;
        if (b4) {
            C0081b c0081b = s4.f2149g;
            int i6 = f6.f7669b;
            int i7 = c0081b.a(i6).f2217a;
            if (i7 != -1) {
                int a4 = s4.f2149g.a(i6).a(f6.f7670c);
                if (a4 < i7) {
                    f4 = e(u4, f6.f7668a, i6, a4, u5.f3352c, f6.f7671d);
                } else {
                    long j10 = u5.f3352c;
                    if (j10 == -9223372036854775807L) {
                        Pair j11 = u4.j(this.f3364b, s4, s4.f2145c, -9223372036854775807L, Math.max(0L, j6));
                        if (j11 != null) {
                            j10 = ((Long) j11.second).longValue();
                        }
                    }
                    u4.g(obj3, s4);
                    int i8 = f6.f7669b;
                    s4.d(i8);
                    s4.f2149g.a(i8).getClass();
                    f4 = f(u4, f6.f7668a, Math.max(0L, j10), u5.f3352c, f6.f7671d);
                }
            }
            return null;
        }
        int i9 = f6.f7672e;
        if (i9 != -1) {
            s4.f(i9);
        }
        int e4 = s4.e(i9);
        s4.g(i9);
        if (e4 != s4.f2149g.a(i9).f2217a) {
            f4 = e(u4, f6.f7668a, f6.f7672e, e4, u5.f3354e, f6.f7671d);
        } else {
            u4.g(obj3, s4);
            s4.d(i9);
            s4.f2149g.a(i9).getClass();
            f4 = f(u4, f6.f7668a, 0L, u5.f3354e, f6.f7671d);
        }
        return f4;
    }

    public final U d(T.U u4, q0.F f4, long j4, long j5) {
        u4.g(f4.f7668a, this.f3363a);
        if (!f4.b()) {
            return f(u4, f4.f7668a, j5, j4, f4.f7671d);
        }
        return e(u4, f4.f7668a, f4.f7669b, f4.f7670c, j4, f4.f7671d);
    }

    public final U e(T.U u4, Object obj, int i4, int i5, long j4, long j5) {
        q0.F f4 = new q0.F(obj, i4, i5, j5, -1);
        T.S s = this.f3363a;
        long a4 = u4.g(obj, s).a(i4, i5);
        if (i5 == s.e(i4)) {
            s.f2149g.getClass();
        }
        s.g(i4);
        return new U(f4, (a4 == -9223372036854775807L || 0 < a4) ? 0L : Math.max(0L, a4 - 1), j4, -9223372036854775807L, a4, false, false, false, false);
    }

    public final U f(T.U u4, Object obj, long j4, long j5, long j6) {
        long j7;
        T.S s = this.f3363a;
        u4.g(obj, s);
        int b4 = s.b(j4);
        if (b4 != -1) {
            s.f(b4);
        }
        boolean z4 = false;
        if (b4 != -1) {
            s.g(b4);
        } else if (s.f2149g.f2227a > 0) {
            s.g(0);
        }
        q0.F f4 = new q0.F(obj, j6, b4);
        if (!f4.b() && b4 == -1) {
            z4 = true;
        }
        boolean i4 = i(u4, f4);
        boolean h4 = h(u4, f4, z4);
        if (b4 != -1) {
            s.g(b4);
        }
        if (b4 != -1) {
            s.d(b4);
            j7 = 0;
        } else {
            j7 = -9223372036854775807L;
        }
        long j8 = (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? s.f2146d : j7;
        return new U(f4, (j8 == -9223372036854775807L || j4 < j8) ? j4 : Math.max(0L, j8 - 1), j5, j7, j8, false, z4, i4, h4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a0.U g(T.U r20, a0.U r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            q0.F r3 = r2.f3350a
            boolean r4 = r3.b()
            r5 = -1
            int r6 = r3.f7672e
            if (r4 != 0) goto L16
            if (r6 != r5) goto L16
            r4 = 1
        L14:
            r12 = r4
            goto L18
        L16:
            r4 = 0
            goto L14
        L18:
            boolean r13 = r0.i(r1, r3)
            boolean r14 = r0.h(r1, r3, r12)
            java.lang.Object r4 = r3.f7668a
            T.S r7 = r0.f3363a
            r1.g(r4, r7)
            boolean r1 = r3.b()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L3b
            if (r6 != r5) goto L35
            goto L3b
        L35:
            r7.d(r6)
            r10 = 0
            goto L3c
        L3b:
            r10 = r8
        L3c:
            boolean r1 = r3.b()
            int r4 = r3.f7669b
            if (r1 == 0) goto L4c
            int r1 = r3.f7670c
            long r8 = r7.a(r4, r1)
        L4a:
            r15 = r8
            goto L5c
        L4c:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L59
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L57
            goto L59
        L57:
            r15 = r10
            goto L5c
        L59:
            long r8 = r7.f2146d
            goto L4a
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L66
            r7.g(r4)
            goto L6b
        L66:
            if (r6 == r5) goto L6b
            r7.g(r6)
        L6b:
            a0.U r17 = new a0.U
            long r4 = r2.f3351b
            long r6 = r2.f3352c
            r18 = 0
            r1 = r17
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r10
            r9 = r15
            r11 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.W.g(T.U, a0.U):a0.U");
    }

    public final boolean h(T.U u4, q0.F f4, boolean z4) {
        int b4 = u4.b(f4.f7668a);
        if (u4.m(u4.f(b4, this.f3363a, false).f2145c, this.f3364b, 0L).f2160i) {
            return false;
        }
        return u4.d(b4, this.f3363a, this.f3364b, this.f3369g, this.f3370h) == -1 && z4;
    }

    public final boolean i(T.U u4, q0.F f4) {
        if (!(!f4.b() && f4.f7672e == -1)) {
            return false;
        }
        Object obj = f4.f7668a;
        return u4.m(u4.g(obj, this.f3363a).f2145c, this.f3364b, 0L).f2166o == u4.b(obj);
    }

    public final void j() {
        C0278F i4 = f2.I.i();
        for (T t4 = this.f3371i; t4 != null; t4 = t4.f3346l) {
            i4.a(t4.f3340f.f3350a);
        }
        T t5 = this.f3372j;
        this.f3366d.c(new V(this, i4, t5 == null ? null : t5.f3340f.f3350a, 0));
    }

    public final boolean k(T t4) {
        W.a.k(t4);
        boolean z4 = false;
        if (t4.equals(this.f3373k)) {
            return false;
        }
        this.f3373k = t4;
        while (true) {
            t4 = t4.f3346l;
            if (t4 == null) {
                break;
            }
            if (t4 == this.f3372j) {
                this.f3372j = this.f3371i;
                z4 = true;
            }
            t4.g();
            this.f3374l--;
        }
        T t5 = this.f3373k;
        t5.getClass();
        if (t5.f3346l != null) {
            t5.b();
            t5.f3346l = null;
            t5.c();
        }
        j();
        return z4;
    }

    public final q0.F m(T.U u4, Object obj, long j4) {
        long n4;
        int b4;
        Object obj2 = obj;
        T.S s = this.f3363a;
        int i4 = u4.g(obj2, s).f2145c;
        Object obj3 = this.f3375m;
        if (obj3 == null || (b4 = u4.b(obj3)) == -1 || u4.f(b4, s, false).f2145c != i4) {
            T t4 = this.f3371i;
            while (true) {
                if (t4 == null) {
                    T t5 = this.f3371i;
                    while (true) {
                        if (t5 != null) {
                            int b5 = u4.b(t5.f3336b);
                            if (b5 != -1 && u4.f(b5, s, false).f2145c == i4) {
                                n4 = t5.f3340f.f3350a.f7671d;
                                break;
                            }
                            t5 = t5.f3346l;
                        } else {
                            n4 = n(obj2);
                            if (n4 == -1) {
                                n4 = this.f3368f;
                                this.f3368f = 1 + n4;
                                if (this.f3371i == null) {
                                    this.f3375m = obj2;
                                    this.f3376n = n4;
                                }
                            }
                        }
                    }
                } else {
                    if (t4.f3336b.equals(obj2)) {
                        n4 = t4.f3340f.f3350a.f7671d;
                        break;
                    }
                    t4 = t4.f3346l;
                }
            }
        } else {
            n4 = this.f3376n;
        }
        long j5 = n4;
        u4.g(obj2, s);
        int i5 = s.f2145c;
        T.T t6 = this.f3364b;
        u4.n(i5, t6);
        boolean z4 = false;
        for (int b6 = u4.b(obj); b6 >= t6.f2165n; b6--) {
            u4.f(b6, s, true);
            boolean z5 = s.f2149g.f2227a > 0;
            z4 |= z5;
            if (s.c(s.f2146d) != -1) {
                obj2 = s.f2144b;
                obj2.getClass();
            }
            if (z4 && (!z5 || s.f2146d != 0)) {
                break;
            }
        }
        return l(u4, obj2, j4, j5, this.f3364b, this.f3363a);
    }

    public final long n(Object obj) {
        for (int i4 = 0; i4 < this.f3377o.size(); i4++) {
            T t4 = (T) this.f3377o.get(i4);
            if (t4.f3336b.equals(obj)) {
                return t4.f3340f.f3350a.f7671d;
            }
        }
        return -1L;
    }

    public final boolean o(T.U u4) {
        T t4;
        T t5 = this.f3371i;
        if (t5 == null) {
            return true;
        }
        int b4 = u4.b(t5.f3336b);
        while (true) {
            b4 = u4.d(b4, this.f3363a, this.f3364b, this.f3369g, this.f3370h);
            while (true) {
                t5.getClass();
                t4 = t5.f3346l;
                if (t4 == null || t5.f3340f.f3356g) {
                    break;
                }
                t5 = t4;
            }
            if (b4 == -1 || t4 == null || u4.b(t4.f3336b) != b4) {
                break;
            }
            t5 = t4;
        }
        boolean k4 = k(t5);
        t5.f3340f = g(u4, t5.f3340f);
        return !k4;
    }

    public final boolean p(T.U u4, long j4, long j5) {
        U u5;
        T t4 = this.f3371i;
        T t5 = null;
        while (t4 != null) {
            U u6 = t4.f3340f;
            if (t5 == null) {
                u5 = g(u4, u6);
            } else {
                U c4 = c(u4, t5, j4);
                if (c4 == null) {
                    return !k(t5);
                }
                if (u6.f3351b != c4.f3351b || !u6.f3350a.equals(c4.f3350a)) {
                    return !k(t5);
                }
                u5 = c4;
            }
            t4.f3340f = u5.a(u6.f3352c);
            long j6 = u6.f3354e;
            if (j6 != -9223372036854775807L) {
                long j7 = u5.f3354e;
                if (j6 != j7) {
                    t4.i();
                    return (k(t4) || (t4 == this.f3372j && !t4.f3340f.f3355f && ((j5 > Long.MIN_VALUE ? 1 : (j5 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j5 > ((j7 > (-9223372036854775807L) ? 1 : (j7 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : t4.f3349o + j7) ? 1 : (j5 == ((j7 > (-9223372036854775807L) ? 1 : (j7 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : t4.f3349o + j7) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            t5 = t4;
            t4 = t4.f3346l;
        }
        return true;
    }
}
