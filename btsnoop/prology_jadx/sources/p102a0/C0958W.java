package p102a0;

/* renamed from: a0.W */
/* loaded from: classes.dex */
public final class C0958W {

    /* renamed from: c */
    public final p107b0.C1170e f3483c;

    /* renamed from: d */
    public final p086W.C0802v f3484d;

    /* renamed from: e */
    public final p009B2.C0067x f3485e;

    /* renamed from: f */
    public long f3486f;

    /* renamed from: g */
    public int f3487g;

    /* renamed from: h */
    public boolean f3488h;

    /* renamed from: i */
    public p102a0.C0955T f3489i;

    /* renamed from: j */
    public p102a0.C0955T f3490j;

    /* renamed from: k */
    public p102a0.C0955T f3491k;

    /* renamed from: l */
    public int f3492l;

    /* renamed from: m */
    public java.lang.Object f3493m;

    /* renamed from: n */
    public long f3494n;

    /* renamed from: a */
    public final p076T.C0675S f3481a = new p076T.C0675S();

    /* renamed from: b */
    public final p076T.C0676T f3482b = new p076T.C0676T();

    /* renamed from: o */
    public java.util.ArrayList f3495o = new java.util.ArrayList();

    public C0958W(p107b0.C1170e c1170e, p086W.C0802v c0802v, p009B2.C0067x c0067x, p102a0.C0993r c0993r) {
        this.f3483c = c1170e;
        this.f3484d = c0802v;
        this.f3485e = c0067x;
    }

    /* renamed from: l */
    public static p179q0.C1964F m1946l(p076T.AbstractC0677U abstractC0677U, java.lang.Object obj, long j4, long j5, p076T.C0676T c0676t, p076T.C0675S c0675s) {
        abstractC0677U.mo1251g(obj, c0675s);
        abstractC0677U.m1255n(c0675s.f2225c, c0676t);
        abstractC0677U.mo1231b(obj);
        int i4 = c0675s.f2229g.f2307a;
        if (i4 != 0) {
            if (i4 == 1) {
                c0675s.m1242f(0);
            }
            c0675s.f2229g.getClass();
            c0675s.m1243g(0);
        }
        abstractC0677U.mo1251g(obj, c0675s);
        int m1239c = c0675s.m1239c(j4);
        return m1239c == -1 ? new p179q0.C1964F(obj, j5, c0675s.m1238b(j4)) : new p179q0.C1964F(obj, m1239c, c0675s.m1241e(m1239c), j5, -1);
    }

    /* renamed from: a */
    public final p102a0.C0955T m1947a() {
        p102a0.C0955T c0955t = this.f3489i;
        if (c0955t == null) {
            return null;
        }
        if (c0955t == this.f3490j) {
            this.f3490j = c0955t.f3464l;
        }
        c0955t.m1941g();
        int i4 = this.f3492l - 1;
        this.f3492l = i4;
        if (i4 == 0) {
            this.f3491k = null;
            p102a0.C0955T c0955t2 = this.f3489i;
            this.f3493m = c0955t2.f3454b;
            this.f3494n = c0955t2.f3458f.f3468a.f7963d;
        }
        this.f3489i = this.f3489i.f3464l;
        m1956j();
        return this.f3489i;
    }

    /* renamed from: b */
    public final void m1948b() {
        if (this.f3492l == 0) {
            return;
        }
        p102a0.C0955T c0955t = this.f3489i;
        p086W.AbstractC0781a.m1422k(c0955t);
        this.f3493m = c0955t.f3454b;
        this.f3494n = c0955t.f3458f.f3468a.f7963d;
        while (c0955t != null) {
            c0955t.m1941g();
            c0955t = c0955t.f3464l;
        }
        this.f3489i = null;
        this.f3491k = null;
        this.f3490j = null;
        this.f3492l = 0;
        m1956j();
    }

    /* renamed from: c */
    public final p102a0.C0956U m1949c(p076T.AbstractC0677U abstractC0677U, p102a0.C0955T c0955t, long j4) {
        p102a0.C0956U m1952f;
        long j5;
        p102a0.C0956U c0956u = c0955t.f3458f;
        long j6 = (c0955t.f3467o + c0956u.f3472e) - j4;
        if (c0956u.f3474g) {
            p102a0.C0956U c0956u2 = c0955t.f3458f;
            p179q0.C1964F c1964f = c0956u2.f3468a;
            int m1249d = abstractC0677U.m1249d(abstractC0677U.mo1231b(c1964f.f7960a), this.f3481a, this.f3482b, this.f3487g, this.f3488h);
            if (m1249d != -1) {
                p076T.C0675S c0675s = this.f3481a;
                int i4 = abstractC0677U.mo1232f(m1249d, c0675s, true).f2225c;
                java.lang.Object obj = c0675s.f2224b;
                obj.getClass();
                long j7 = c1964f.f7963d;
                long j8 = 0;
                if (abstractC0677U.mo1235m(i4, this.f3482b, 0L).f2245n == m1249d) {
                    android.util.Pair m1253j = abstractC0677U.m1253j(this.f3482b, this.f3481a, i4, -9223372036854775807L, java.lang.Math.max(0L, j6));
                    if (m1253j != null) {
                        obj = m1253j.first;
                        long longValue = ((java.lang.Long) m1253j.second).longValue();
                        p102a0.C0955T c0955t2 = c0955t.f3464l;
                        if (c0955t2 == null || !c0955t2.f3454b.equals(obj)) {
                            j7 = m1959n(obj);
                            if (j7 == -1) {
                                j7 = this.f3486f;
                                this.f3486f = 1 + j7;
                            }
                        } else {
                            j7 = c0955t2.f3458f.f3468a.f7963d;
                        }
                        j5 = longValue;
                        j8 = -9223372036854775807L;
                    }
                } else {
                    j5 = 0;
                }
                p179q0.C1964F m1946l = m1946l(abstractC0677U, obj, j5, j7, this.f3482b, this.f3481a);
                if (j8 != -9223372036854775807L && c0956u2.f3470c != -9223372036854775807L) {
                    int i5 = abstractC0677U.mo1251g(c1964f.f7960a, c0675s).f2229g.f2307a;
                    c0675s.f2229g.getClass();
                    if (i5 > 0) {
                        c0675s.m1243g(0);
                    }
                }
                return m1950d(abstractC0677U, m1946l, j8, j5);
            }
            return null;
        }
        p179q0.C1964F c1964f2 = c0956u.f3468a;
        java.lang.Object obj2 = c1964f2.f7960a;
        p076T.C0675S c0675s2 = this.f3481a;
        abstractC0677U.mo1251g(obj2, c0675s2);
        boolean m3968b = c1964f2.m3968b();
        java.lang.Object obj3 = c1964f2.f7960a;
        if (m3968b) {
            p076T.C0685b c0685b = c0675s2.f2229g;
            int i6 = c1964f2.f7961b;
            int i7 = c0685b.m1265a(i6).f2297a;
            if (i7 != -1) {
                int m1262a = c0675s2.f2229g.m1265a(i6).m1262a(c1964f2.f7962c);
                if (m1262a < i7) {
                    m1952f = m1951e(abstractC0677U, c1964f2.f7960a, i6, m1262a, c0956u.f3470c, c1964f2.f7963d);
                } else {
                    long j9 = c0956u.f3470c;
                    if (j9 == -9223372036854775807L) {
                        android.util.Pair m1253j2 = abstractC0677U.m1253j(this.f3482b, c0675s2, c0675s2.f2225c, -9223372036854775807L, java.lang.Math.max(0L, j6));
                        if (m1253j2 != null) {
                            j9 = ((java.lang.Long) m1253j2.second).longValue();
                        }
                    }
                    abstractC0677U.mo1251g(obj3, c0675s2);
                    int i8 = c1964f2.f7961b;
                    c0675s2.m1240d(i8);
                    c0675s2.f2229g.m1265a(i8).getClass();
                    m1952f = m1952f(abstractC0677U, c1964f2.f7960a, java.lang.Math.max(0L, j9), c0956u.f3470c, c1964f2.f7963d);
                }
            }
            return null;
        }
        int i9 = c1964f2.f7964e;
        if (i9 != -1) {
            c0675s2.m1242f(i9);
        }
        int m1241e = c0675s2.m1241e(i9);
        c0675s2.m1243g(i9);
        if (m1241e != c0675s2.f2229g.m1265a(i9).f2297a) {
            m1952f = m1951e(abstractC0677U, c1964f2.f7960a, c1964f2.f7964e, m1241e, c0956u.f3472e, c1964f2.f7963d);
        } else {
            abstractC0677U.mo1251g(obj3, c0675s2);
            c0675s2.m1240d(i9);
            c0675s2.f2229g.m1265a(i9).getClass();
            m1952f = m1952f(abstractC0677U, c1964f2.f7960a, 0L, c0956u.f3472e, c1964f2.f7963d);
        }
        return m1952f;
    }

    /* renamed from: d */
    public final p102a0.C0956U m1950d(p076T.AbstractC0677U abstractC0677U, p179q0.C1964F c1964f, long j4, long j5) {
        abstractC0677U.mo1251g(c1964f.f7960a, this.f3481a);
        if (!c1964f.m3968b()) {
            return m1952f(abstractC0677U, c1964f.f7960a, j5, j4, c1964f.f7963d);
        }
        return m1951e(abstractC0677U, c1964f.f7960a, c1964f.f7961b, c1964f.f7962c, j4, c1964f.f7963d);
    }

    /* renamed from: e */
    public final p102a0.C0956U m1951e(p076T.AbstractC0677U abstractC0677U, java.lang.Object obj, int i4, int i5, long j4, long j5) {
        p179q0.C1964F c1964f = new p179q0.C1964F(obj, i4, i5, j5, -1);
        p076T.C0675S c0675s = this.f3481a;
        long m1237a = abstractC0677U.mo1251g(obj, c0675s).m1237a(i4, i5);
        if (i5 == c0675s.m1241e(i4)) {
            c0675s.f2229g.getClass();
        }
        c0675s.m1243g(i4);
        return new p102a0.C0956U(c1964f, (m1237a == -9223372036854775807L || 0 < m1237a) ? 0L : java.lang.Math.max(0L, m1237a - 1), j4, -9223372036854775807L, m1237a, false, false, false, false);
    }

    /* renamed from: f */
    public final p102a0.C0956U m1952f(p076T.AbstractC0677U abstractC0677U, java.lang.Object obj, long j4, long j5, long j6) {
        long j7;
        p076T.C0675S c0675s = this.f3481a;
        abstractC0677U.mo1251g(obj, c0675s);
        int m1238b = c0675s.m1238b(j4);
        if (m1238b != -1) {
            c0675s.m1242f(m1238b);
        }
        boolean z4 = false;
        if (m1238b != -1) {
            c0675s.m1243g(m1238b);
        } else if (c0675s.f2229g.f2307a > 0) {
            c0675s.m1243g(0);
        }
        p179q0.C1964F c1964f = new p179q0.C1964F(obj, j6, m1238b);
        if (!c1964f.m3968b() && m1238b == -1) {
            z4 = true;
        }
        boolean m1955i = m1955i(abstractC0677U, c1964f);
        boolean m1954h = m1954h(abstractC0677U, c1964f, z4);
        if (m1238b != -1) {
            c0675s.m1243g(m1238b);
        }
        if (m1238b != -1) {
            c0675s.m1240d(m1238b);
            j7 = 0;
        } else {
            j7 = -9223372036854775807L;
        }
        long j8 = (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? c0675s.f2226d : j7;
        return new p102a0.C0956U(c1964f, (j8 == -9223372036854775807L || j4 < j8) ? j4 : java.lang.Math.max(0L, j8 - 1), j5, j7, j8, false, z4, m1955i, m1954h);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p102a0.C0956U m1953g(p076T.AbstractC0677U r20, p102a0.C0956U r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            q0.F r3 = r2.f3468a
            boolean r4 = r3.m3968b()
            r5 = -1
            int r6 = r3.f7964e
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
            boolean r13 = r0.m1955i(r1, r3)
            boolean r14 = r0.m1954h(r1, r3, r12)
            java.lang.Object r4 = r3.f7960a
            T.S r7 = r0.f3481a
            r1.mo1251g(r4, r7)
            boolean r1 = r3.m3968b()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L3b
            if (r6 != r5) goto L35
            goto L3b
        L35:
            r7.m1240d(r6)
            r10 = 0
            goto L3c
        L3b:
            r10 = r8
        L3c:
            boolean r1 = r3.m3968b()
            int r4 = r3.f7961b
            if (r1 == 0) goto L4c
            int r1 = r3.f7962c
            long r8 = r7.m1237a(r4, r1)
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
            long r8 = r7.f2226d
            goto L4a
        L5c:
            boolean r1 = r3.m3968b()
            if (r1 == 0) goto L66
            r7.m1243g(r4)
            goto L6b
        L66:
            if (r6 == r5) goto L6b
            r7.m1243g(r6)
        L6b:
            a0.U r17 = new a0.U
            long r4 = r2.f3469b
            long r6 = r2.f3470c
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
        throw new UnsupportedOperationException("Method not decompiled: p102a0.C0958W.m1953g(T.U, a0.U):a0.U");
    }

    /* renamed from: h */
    public final boolean m1954h(p076T.AbstractC0677U abstractC0677U, p179q0.C1964F c1964f, boolean z4) {
        int mo1231b = abstractC0677U.mo1231b(c1964f.f7960a);
        if (abstractC0677U.mo1235m(abstractC0677U.mo1232f(mo1231b, this.f3481a, false).f2225c, this.f3482b, 0L).f2240i) {
            return false;
        }
        return abstractC0677U.m1249d(mo1231b, this.f3481a, this.f3482b, this.f3487g, this.f3488h) == -1 && z4;
    }

    /* renamed from: i */
    public final boolean m1955i(p076T.AbstractC0677U abstractC0677U, p179q0.C1964F c1964f) {
        if (!(!c1964f.m3968b() && c1964f.f7964e == -1)) {
            return false;
        }
        java.lang.Object obj = c1964f.f7960a;
        return abstractC0677U.mo1235m(abstractC0677U.mo1251g(obj, this.f3481a).f2225c, this.f3482b, 0L).f2246o == abstractC0677U.mo1231b(obj);
    }

    /* renamed from: j */
    public final void m1956j() {
        p129f2.C1390F m3161i = p129f2.AbstractC1393I.m3161i();
        for (p102a0.C0955T c0955t = this.f3489i; c0955t != null; c0955t = c0955t.f3464l) {
            m3161i.m3145a(c0955t.f3458f.f3468a);
        }
        p102a0.C0955T c0955t2 = this.f3490j;
        this.f3484d.m1570c(new p102a0.RunnableC0957V(this, m3161i, c0955t2 == null ? null : c0955t2.f3458f.f3468a, 0));
    }

    /* renamed from: k */
    public final boolean m1957k(p102a0.C0955T c0955t) {
        p086W.AbstractC0781a.m1422k(c0955t);
        boolean z4 = false;
        if (c0955t.equals(this.f3491k)) {
            return false;
        }
        this.f3491k = c0955t;
        while (true) {
            c0955t = c0955t.f3464l;
            if (c0955t == null) {
                break;
            }
            if (c0955t == this.f3490j) {
                this.f3490j = this.f3489i;
                z4 = true;
            }
            c0955t.m1941g();
            this.f3492l--;
        }
        p102a0.C0955T c0955t2 = this.f3491k;
        c0955t2.getClass();
        if (c0955t2.f3464l != null) {
            c0955t2.m1936b();
            c0955t2.f3464l = null;
            c0955t2.m1937c();
        }
        m1956j();
        return z4;
    }

    /* renamed from: m */
    public final p179q0.C1964F m1958m(p076T.AbstractC0677U abstractC0677U, java.lang.Object obj, long j4) {
        long m1959n;
        int mo1231b;
        java.lang.Object obj2 = obj;
        p076T.C0675S c0675s = this.f3481a;
        int i4 = abstractC0677U.mo1251g(obj2, c0675s).f2225c;
        java.lang.Object obj3 = this.f3493m;
        if (obj3 == null || (mo1231b = abstractC0677U.mo1231b(obj3)) == -1 || abstractC0677U.mo1232f(mo1231b, c0675s, false).f2225c != i4) {
            p102a0.C0955T c0955t = this.f3489i;
            while (true) {
                if (c0955t == null) {
                    p102a0.C0955T c0955t2 = this.f3489i;
                    while (true) {
                        if (c0955t2 != null) {
                            int mo1231b2 = abstractC0677U.mo1231b(c0955t2.f3454b);
                            if (mo1231b2 != -1 && abstractC0677U.mo1232f(mo1231b2, c0675s, false).f2225c == i4) {
                                m1959n = c0955t2.f3458f.f3468a.f7963d;
                                break;
                            }
                            c0955t2 = c0955t2.f3464l;
                        } else {
                            m1959n = m1959n(obj2);
                            if (m1959n == -1) {
                                m1959n = this.f3486f;
                                this.f3486f = 1 + m1959n;
                                if (this.f3489i == null) {
                                    this.f3493m = obj2;
                                    this.f3494n = m1959n;
                                }
                            }
                        }
                    }
                } else {
                    if (c0955t.f3454b.equals(obj2)) {
                        m1959n = c0955t.f3458f.f3468a.f7963d;
                        break;
                    }
                    c0955t = c0955t.f3464l;
                }
            }
        } else {
            m1959n = this.f3494n;
        }
        long j5 = m1959n;
        abstractC0677U.mo1251g(obj2, c0675s);
        int i5 = c0675s.f2225c;
        p076T.C0676T c0676t = this.f3482b;
        abstractC0677U.m1255n(i5, c0676t);
        boolean z4 = false;
        for (int mo1231b3 = abstractC0677U.mo1231b(obj); mo1231b3 >= c0676t.f2245n; mo1231b3--) {
            abstractC0677U.mo1232f(mo1231b3, c0675s, true);
            boolean z5 = c0675s.f2229g.f2307a > 0;
            z4 |= z5;
            if (c0675s.m1239c(c0675s.f2226d) != -1) {
                obj2 = c0675s.f2224b;
                obj2.getClass();
            }
            if (z4 && (!z5 || c0675s.f2226d != 0)) {
                break;
            }
        }
        return m1946l(abstractC0677U, obj2, j4, j5, this.f3482b, this.f3481a);
    }

    /* renamed from: n */
    public final long m1959n(java.lang.Object obj) {
        for (int i4 = 0; i4 < this.f3495o.size(); i4++) {
            p102a0.C0955T c0955t = (p102a0.C0955T) this.f3495o.get(i4);
            if (c0955t.f3454b.equals(obj)) {
                return c0955t.f3458f.f3468a.f7963d;
            }
        }
        return -1L;
    }

    /* renamed from: o */
    public final boolean m1960o(p076T.AbstractC0677U abstractC0677U) {
        p102a0.C0955T c0955t;
        p102a0.C0955T c0955t2 = this.f3489i;
        if (c0955t2 == null) {
            return true;
        }
        int mo1231b = abstractC0677U.mo1231b(c0955t2.f3454b);
        while (true) {
            mo1231b = abstractC0677U.m1249d(mo1231b, this.f3481a, this.f3482b, this.f3487g, this.f3488h);
            while (true) {
                c0955t2.getClass();
                c0955t = c0955t2.f3464l;
                if (c0955t == null || c0955t2.f3458f.f3474g) {
                    break;
                }
                c0955t2 = c0955t;
            }
            if (mo1231b == -1 || c0955t == null || abstractC0677U.mo1231b(c0955t.f3454b) != mo1231b) {
                break;
            }
            c0955t2 = c0955t;
        }
        boolean m1957k = m1957k(c0955t2);
        c0955t2.f3458f = m1953g(abstractC0677U, c0955t2.f3458f);
        return !m1957k;
    }

    /* renamed from: p */
    public final boolean m1961p(p076T.AbstractC0677U abstractC0677U, long j4, long j5) {
        p102a0.C0956U c0956u;
        p102a0.C0955T c0955t = this.f3489i;
        p102a0.C0955T c0955t2 = null;
        while (c0955t != null) {
            p102a0.C0956U c0956u2 = c0955t.f3458f;
            if (c0955t2 == null) {
                c0956u = m1953g(abstractC0677U, c0956u2);
            } else {
                p102a0.C0956U m1949c = m1949c(abstractC0677U, c0955t2, j4);
                if (m1949c == null) {
                    return !m1957k(c0955t2);
                }
                if (c0956u2.f3469b != m1949c.f3469b || !c0956u2.f3468a.equals(m1949c.f3468a)) {
                    return !m1957k(c0955t2);
                }
                c0956u = m1949c;
            }
            c0955t.f3458f = c0956u.m1944a(c0956u2.f3470c);
            long j6 = c0956u2.f3472e;
            if (j6 != -9223372036854775807L) {
                long j7 = c0956u.f3472e;
                if (j6 != j7) {
                    c0955t.m1943i();
                    return (m1957k(c0955t) || (c0955t == this.f3490j && !c0955t.f3458f.f3473f && ((j5 > Long.MIN_VALUE ? 1 : (j5 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j5 > ((j7 > (-9223372036854775807L) ? 1 : (j7 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c0955t.f3467o + j7) ? 1 : (j5 == ((j7 > (-9223372036854775807L) ? 1 : (j7 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c0955t.f3467o + j7) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            c0955t2 = c0955t;
            c0955t = c0955t.f3464l;
        }
        return true;
    }
}
