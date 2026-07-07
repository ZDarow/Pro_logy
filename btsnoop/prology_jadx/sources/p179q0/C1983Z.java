package p179q0;

/* renamed from: q0.Z */
/* loaded from: classes.dex */
public class C1983Z implements p215y0.InterfaceC2387F {

    /* renamed from: A */
    public p076T.C0702p f8078A;

    /* renamed from: B */
    public p076T.C0702p f8079B;

    /* renamed from: C */
    public long f8080C;

    /* renamed from: D */
    public boolean f8081D;

    /* renamed from: E */
    public boolean f8082E;

    /* renamed from: F */
    public long f8083F;

    /* renamed from: G */
    public boolean f8084G;

    /* renamed from: a */
    public final p179q0.C1980W f8085a;

    /* renamed from: c */
    public final p063P2.C0528a f8087c;

    /* renamed from: d */
    public final p127f0.InterfaceC1376i f8088d;

    /* renamed from: e */
    public final p127f0.C1372e f8089e;

    /* renamed from: f */
    public p179q0.InterfaceC1982Y f8090f;

    /* renamed from: g */
    public p076T.C0702p f8091g;

    /* renamed from: h */
    public p043K2.C0339o f8092h;

    /* renamed from: p */
    public int f8100p;

    /* renamed from: q */
    public int f8101q;

    /* renamed from: r */
    public int f8102r;

    /* renamed from: s */
    public int f8103s;

    /* renamed from: t */
    public long f8104t;

    /* renamed from: u */
    public long f8105u;

    /* renamed from: v */
    public long f8106v;

    /* renamed from: w */
    public boolean f8107w;

    /* renamed from: x */
    public boolean f8108x;

    /* renamed from: y */
    public boolean f8109y;

    /* renamed from: z */
    public boolean f8110z;

    /* renamed from: b */
    public final p141i0.C1534g f8086b = new java.lang.Object();

    /* renamed from: i */
    public int f8093i = 1000;

    /* renamed from: j */
    public long[] f8094j = new long[1000];

    /* renamed from: k */
    public long[] f8095k = new long[1000];

    /* renamed from: n */
    public long[] f8098n = new long[1000];

    /* renamed from: m */
    public int[] f8097m = new int[1000];

    /* renamed from: l */
    public int[] f8096l = new int[1000];

    /* renamed from: o */
    public p215y0.C2386E[] f8099o = new p215y0.C2386E[1000];

    /* JADX WARN: Type inference failed for: r1v1, types: [i0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [P2.a, java.lang.Object] */
    public C1983Z(p197u0.C2218e c2218e, p127f0.InterfaceC1376i interfaceC1376i, p127f0.C1372e c1372e) {
        this.f8088d = interfaceC1376i;
        this.f8089e = c1372e;
        this.f8085a = new p179q0.C1980W(c2218e);
        p107b0.C1169d c1169d = new p107b0.C1169d(18);
        ?? obj = new java.lang.Object();
        obj.f1552m = new android.util.SparseArray();
        obj.f1553n = c1169d;
        obj.f1551l = -1;
        this.f8087c = obj;
        this.f8104t = Long.MIN_VALUE;
        this.f8105u = Long.MIN_VALUE;
        this.f8106v = Long.MIN_VALUE;
        this.f8109y = true;
        this.f8108x = true;
        this.f8081D = true;
    }

    /* renamed from: A */
    public final synchronized boolean m4007A(int i4) {
        synchronized (this) {
            this.f8103s = 0;
            p179q0.C1980W c1980w = this.f8085a;
            c1980w.f8073e = c1980w.f8072d;
        }
        int i5 = this.f8101q;
        if (i4 >= i5 && i4 <= this.f8100p + i5) {
            this.f8104t = Long.MIN_VALUE;
            this.f8103s = i4 - i5;
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final synchronized boolean m4008B(long j4, boolean z4) {
        int m4015j;
        try {
            synchronized (this) {
                this.f8103s = 0;
                p179q0.C1980W c1980w = this.f8085a;
                c1980w.f8073e = c1980w.f8072d;
            }
        } finally {
        }
        int m4019o = m4019o(0);
        if (m4022r() && j4 >= this.f8098n[m4019o] && (j4 <= this.f8106v || z4)) {
            if (this.f8081D) {
                int i4 = this.f8100p - this.f8103s;
                m4015j = 0;
                while (true) {
                    if (m4015j >= i4) {
                        if (!z4) {
                            i4 = -1;
                        }
                        m4015j = i4;
                    } else if (this.f8098n[m4019o] < j4) {
                        m4019o++;
                        if (m4019o == this.f8093i) {
                            m4019o = 0;
                        }
                        m4015j++;
                    }
                }
            } else {
                m4015j = m4015j(m4019o, this.f8100p - this.f8103s, j4, true);
            }
            if (m4015j == -1) {
                return false;
            }
            this.f8104t = j4;
            this.f8103s += m4015j;
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final synchronized void m4009C(int i4) {
        boolean z4;
        if (i4 >= 0) {
            try {
                if (this.f8103s + i4 <= this.f8100p) {
                    z4 = true;
                    p086W.AbstractC0781a.m1416e(z4);
                    this.f8103s += i4;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        z4 = false;
        p086W.AbstractC0781a.m1416e(z4);
        this.f8103s += i4;
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: a */
    public final void mo1405a(p086W.C0798r c0798r, int i4, int i5) {
        while (true) {
            p179q0.C1980W c1980w = this.f8085a;
            if (i4 <= 0) {
                c1980w.getClass();
                return;
            }
            int m4006c = c1980w.m4006c(i4);
            p073S0.C0627e c0627e = c1980w.f8074f;
            p197u0.C2214a c2214a = (p197u0.C2214a) c0627e.f1969n;
            c0798r.m1544f(c2214a.f8831a, ((int) (c1980w.f8075g - c0627e.f1967l)) + c2214a.f8832b, m4006c);
            i4 -= m4006c;
            long j4 = c1980w.f8075g + m4006c;
            c1980w.f8075g = j4;
            p073S0.C0627e c0627e2 = c1980w.f8074f;
            if (j4 == c0627e2.f1968m) {
                c1980w.f8074f = (p073S0.C0627e) c0627e2.f1970o;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x013b, code lost:
    
        if (((p179q0.C1981X) r0.valueAt(r0.size() - 1)).f8076a.equals(r16.f8079B) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p215y0.InterfaceC2387F
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1406b(long r17, int r19, int r20, int r21, p215y0.C2386E r22) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p179q0.C1983Z.mo1406b(long, int, int, int, y0.E):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
    
        if (r1 == 16) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    @Override // p215y0.InterfaceC2387F
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1407c(p076T.C0702p r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p179q0.C1983Z.mo1407c(T.p):void");
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: d */
    public final int mo1408d(p076T.InterfaceC0696j interfaceC0696j, int i4, boolean z4) {
        p179q0.C1980W c1980w = this.f8085a;
        int m4006c = c1980w.m4006c(i4);
        p073S0.C0627e c0627e = c1980w.f8074f;
        p197u0.C2214a c2214a = (p197u0.C2214a) c0627e.f1969n;
        int read = interfaceC0696j.read(c2214a.f8831a, ((int) (c1980w.f8075g - c0627e.f1967l)) + c2214a.f8832b, m4006c);
        if (read == -1) {
            if (z4) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        long j4 = c1980w.f8075g + read;
        c1980w.f8075g = j4;
        p073S0.C0627e c0627e2 = c1980w.f8074f;
        if (j4 != c0627e2.f1968m) {
            return read;
        }
        c1980w.f8074f = (p073S0.C0627e) c0627e2.f1970o;
        return read;
    }

    /* renamed from: e */
    public final long m4010e(int i4) {
        this.f8105u = java.lang.Math.max(this.f8105u, m4017m(i4));
        this.f8100p -= i4;
        int i5 = this.f8101q + i4;
        this.f8101q = i5;
        int i6 = this.f8102r + i4;
        this.f8102r = i6;
        int i7 = this.f8093i;
        if (i6 >= i7) {
            this.f8102r = i6 - i7;
        }
        int i8 = this.f8103s - i4;
        this.f8103s = i8;
        int i9 = 0;
        if (i8 < 0) {
            this.f8103s = 0;
        }
        while (true) {
            p063P2.C0528a c0528a = this.f8087c;
            android.util.SparseArray sparseArray = (android.util.SparseArray) c0528a.f1552m;
            if (i9 >= sparseArray.size() - 1) {
                break;
            }
            int i10 = i9 + 1;
            if (i5 < sparseArray.keyAt(i10)) {
                break;
            }
            ((p107b0.C1169d) c0528a.f1553n).accept(sparseArray.valueAt(i9));
            sparseArray.removeAt(i9);
            int i11 = c0528a.f1551l;
            if (i11 > 0) {
                c0528a.f1551l = i11 - 1;
            }
            i9 = i10;
        }
        if (this.f8100p != 0) {
            return this.f8095k[this.f8102r];
        }
        int i12 = this.f8102r;
        if (i12 == 0) {
            i12 = this.f8093i;
        }
        return this.f8095k[i12 - 1] + this.f8096l[r7];
    }

    /* renamed from: f */
    public final void m4011f(long j4, boolean z4) {
        long j5;
        int i4;
        p179q0.C1980W c1980w = this.f8085a;
        synchronized (this) {
            try {
                int i5 = this.f8100p;
                j5 = -1;
                if (i5 != 0) {
                    long[] jArr = this.f8098n;
                    int i6 = this.f8102r;
                    if (j4 >= jArr[i6]) {
                        if (z4 && (i4 = this.f8103s) != i5) {
                            i5 = i4 + 1;
                        }
                        int m4015j = m4015j(i6, i5, j4, false);
                        if (m4015j != -1) {
                            j5 = m4010e(m4015j);
                        }
                    }
                }
            } finally {
            }
        }
        c1980w.m4005b(j5);
    }

    /* renamed from: g */
    public final void m4012g() {
        long m4010e;
        p179q0.C1980W c1980w = this.f8085a;
        synchronized (this) {
            int i4 = this.f8100p;
            m4010e = i4 == 0 ? -1L : m4010e(i4);
        }
        c1980w.m4005b(m4010e);
    }

    /* renamed from: h */
    public final long m4013h(int i4) {
        int i5 = this.f8101q;
        int i6 = this.f8100p;
        int i7 = (i5 + i6) - i4;
        boolean z4 = false;
        p086W.AbstractC0781a.m1416e(i7 >= 0 && i7 <= i6 - this.f8103s);
        int i8 = this.f8100p - i7;
        this.f8100p = i8;
        this.f8106v = java.lang.Math.max(this.f8105u, m4017m(i8));
        if (i7 == 0 && this.f8107w) {
            z4 = true;
        }
        this.f8107w = z4;
        p063P2.C0528a c0528a = this.f8087c;
        android.util.SparseArray sparseArray = (android.util.SparseArray) c0528a.f1552m;
        for (int size = sparseArray.size() - 1; size >= 0 && i4 < sparseArray.keyAt(size); size--) {
            ((p107b0.C1169d) c0528a.f1553n).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        c0528a.f1551l = sparseArray.size() > 0 ? java.lang.Math.min(c0528a.f1551l, sparseArray.size() - 1) : -1;
        int i9 = this.f8100p;
        if (i9 == 0) {
            return 0L;
        }
        return this.f8095k[m4019o(i9 - 1)] + this.f8096l[r9];
    }

    /* renamed from: i */
    public final void m4014i(int i4) {
        long m4013h = m4013h(i4);
        p179q0.C1980W c1980w = this.f8085a;
        p086W.AbstractC0781a.m1416e(m4013h <= c1980w.f8075g);
        c1980w.f8075g = m4013h;
        int i5 = c1980w.f8070b;
        if (m4013h != 0) {
            p073S0.C0627e c0627e = c1980w.f8072d;
            if (m4013h != c0627e.f1967l) {
                while (c1980w.f8075g > c0627e.f1968m) {
                    c0627e = (p073S0.C0627e) c0627e.f1970o;
                }
                p073S0.C0627e c0627e2 = (p073S0.C0627e) c0627e.f1970o;
                c0627e2.getClass();
                c1980w.m4004a(c0627e2);
                p073S0.C0627e c0627e3 = new p073S0.C0627e(c0627e.f1968m, i5);
                c0627e.f1970o = c0627e3;
                if (c1980w.f8075g == c0627e.f1968m) {
                    c0627e = c0627e3;
                }
                c1980w.f8074f = c0627e;
                if (c1980w.f8073e == c0627e2) {
                    c1980w.f8073e = c0627e3;
                    return;
                }
                return;
            }
        }
        c1980w.m4004a(c1980w.f8072d);
        p073S0.C0627e c0627e4 = new p073S0.C0627e(c1980w.f8075g, i5);
        c1980w.f8072d = c0627e4;
        c1980w.f8073e = c0627e4;
        c1980w.f8074f = c0627e4;
    }

    /* renamed from: j */
    public final int m4015j(int i4, int i5, long j4, boolean z4) {
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            long j5 = this.f8098n[i4];
            if (j5 > j4) {
                break;
            }
            if (!z4 || (this.f8097m[i4] & 1) != 0) {
                i6 = i7;
                if (j5 == j4) {
                    break;
                }
            }
            i4++;
            if (i4 == this.f8093i) {
                i4 = 0;
            }
        }
        return i6;
    }

    /* renamed from: k */
    public p076T.C0702p mo3289k(p076T.C0702p c0702p) {
        if (this.f8083F == 0 || c0702p.f2413r == Long.MAX_VALUE) {
            return c0702p;
        }
        p076T.C0701o m1295a = c0702p.m1295a();
        m1295a.f2375q = c0702p.f2413r + this.f8083F;
        return new p076T.C0702p(m1295a);
    }

    /* renamed from: l */
    public final synchronized long m4016l() {
        return this.f8106v;
    }

    /* renamed from: m */
    public final long m4017m(int i4) {
        long j4 = Long.MIN_VALUE;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int m4019o = m4019o(i4 - 1);
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = java.lang.Math.max(j4, this.f8098n[m4019o]);
            if ((this.f8097m[m4019o] & 1) != 0) {
                break;
            }
            m4019o--;
            if (m4019o == -1) {
                m4019o = this.f8093i - 1;
            }
        }
        return j4;
    }

    /* renamed from: n */
    public final int m4018n() {
        return this.f8101q + this.f8103s;
    }

    /* renamed from: o */
    public final int m4019o(int i4) {
        int i5 = this.f8102r + i4;
        int i6 = this.f8093i;
        return i5 < i6 ? i5 : i5 - i6;
    }

    /* renamed from: p */
    public final synchronized int m4020p(long j4, boolean z4) {
        int m4019o = m4019o(this.f8103s);
        if (m4022r() && j4 >= this.f8098n[m4019o]) {
            if (j4 > this.f8106v && z4) {
                return this.f8100p - this.f8103s;
            }
            int m4015j = m4015j(m4019o, this.f8100p - this.f8103s, j4, true);
            if (m4015j == -1) {
                return 0;
            }
            return m4015j;
        }
        return 0;
    }

    /* renamed from: q */
    public final synchronized p076T.C0702p m4021q() {
        return this.f8109y ? null : this.f8079B;
    }

    /* renamed from: r */
    public final boolean m4022r() {
        return this.f8103s != this.f8100p;
    }

    /* renamed from: s */
    public final synchronized boolean m4023s(boolean z4) {
        p076T.C0702p c0702p;
        boolean z5 = true;
        if (m4022r()) {
            if (((p179q0.C1981X) this.f8087c.m1025f(m4018n())).f8076a != this.f8091g) {
                return true;
            }
            return m4024t(m4019o(this.f8103s));
        }
        if (!z4 && !this.f8107w && ((c0702p = this.f8079B) == null || c0702p == this.f8091g)) {
            z5 = false;
        }
        return z5;
    }

    /* renamed from: t */
    public final boolean m4024t(int i4) {
        p043K2.C0339o c0339o = this.f8092h;
        if (c0339o == null || c0339o.m765t() == 4) {
            return true;
        }
        if ((this.f8097m[i4] & 1073741824) == 0) {
            this.f8092h.getClass();
        }
        return false;
    }

    /* renamed from: u */
    public final void m4025u() {
        p043K2.C0339o c0339o = this.f8092h;
        if (c0339o == null || c0339o.m765t() != 1) {
            return;
        }
        p127f0.C1370c m763p = this.f8092h.m763p();
        m763p.getClass();
        throw m763p;
    }

    /* renamed from: v */
    public final void m4026v(p076T.C0702p c0702p, p094Y.C0886x c0886x) {
        p076T.C0702p c0702p2;
        p076T.C0702p c0702p3 = this.f8091g;
        boolean z4 = c0702p3 == null;
        p076T.C0699m c0699m = c0702p3 == null ? null : c0702p3.f2412q;
        this.f8091g = c0702p;
        p076T.C0699m c0699m2 = c0702p.f2412q;
        p127f0.InterfaceC1376i interfaceC1376i = this.f8088d;
        if (interfaceC1376i != null) {
            int mo3132d = interfaceC1376i.mo3132d(c0702p);
            p076T.C0701o m1295a = c0702p.m1295a();
            m1295a.f2358I = mo3132d;
            c0702p2 = new p076T.C0702p(m1295a);
        } else {
            c0702p2 = c0702p;
        }
        c0886x.f3176n = c0702p2;
        c0886x.f3175m = this.f8092h;
        if (interfaceC1376i == null) {
            return;
        }
        if (z4 || !p086W.AbstractC0805y.m1606a(c0699m, c0699m2)) {
            p043K2.C0339o c0339o = this.f8092h;
            p127f0.C1372e c1372e = this.f8089e;
            p043K2.C0339o mo3130a = interfaceC1376i.mo3130a(c1372e, c0702p);
            this.f8092h = mo3130a;
            c0886x.f3175m = mo3130a;
            if (c0339o != null) {
                c0339o.m752K(c1372e);
            }
        }
    }

    /* renamed from: w */
    public final synchronized long m4027w() {
        try {
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return m4022r() ? this.f8094j[m4019o(this.f8103s)] : this.f8080C;
    }

    /* renamed from: x */
    public final int m4028x(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4, boolean z4) {
        int i5;
        boolean z5 = (i4 & 2) != 0;
        p141i0.C1534g c1534g = this.f8086b;
        synchronized (this) {
            try {
                c0921f.f3252q = false;
                i5 = -3;
                if (m4022r()) {
                    p076T.C0702p c0702p = ((p179q0.C1981X) this.f8087c.m1025f(m4018n())).f8076a;
                    if (!z5 && c0702p == this.f8091g) {
                        int m4019o = m4019o(this.f8103s);
                        if (m4024t(m4019o)) {
                            c0921f.f1957m = this.f8097m[m4019o];
                            if (this.f8103s == this.f8100p - 1 && (z4 || this.f8107w)) {
                                c0921f.m1137a(536870912);
                            }
                            c0921f.f3253r = this.f8098n[m4019o];
                            c1534g.f6376a = this.f8096l[m4019o];
                            c1534g.f6377b = this.f8095k[m4019o];
                            c1534g.f6378c = this.f8099o[m4019o];
                            i5 = -4;
                        } else {
                            c0921f.f3252q = true;
                        }
                    }
                    m4026v(c0702p, c0886x);
                    i5 = -5;
                } else {
                    if (!z4 && !this.f8107w) {
                        p076T.C0702p c0702p2 = this.f8079B;
                        if (c0702p2 == null || (!z5 && c0702p2 == this.f8091g)) {
                        }
                        m4026v(c0702p2, c0886x);
                        i5 = -5;
                    }
                    c0921f.f1957m = 4;
                    c0921f.f3253r = Long.MIN_VALUE;
                    i5 = -4;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (i5 == -4 && !c0921f.m1138c(4)) {
            boolean z6 = (i4 & 1) != 0;
            if ((i4 & 4) == 0) {
                if (z6) {
                    p179q0.C1980W c1980w = this.f8085a;
                    p179q0.C1980W.m4003f(c1980w.f8073e, c0921f, this.f8086b, c1980w.f8071c);
                } else {
                    p179q0.C1980W c1980w2 = this.f8085a;
                    c1980w2.f8073e = p179q0.C1980W.m4003f(c1980w2.f8073e, c0921f, this.f8086b, c1980w2.f8071c);
                }
            }
            if (!z6) {
                this.f8103s++;
            }
        }
        return i5;
    }

    /* renamed from: y */
    public final void m4029y() {
        m4030z(true);
        p043K2.C0339o c0339o = this.f8092h;
        if (c0339o != null) {
            c0339o.m752K(this.f8089e);
            this.f8092h = null;
            this.f8091g = null;
        }
    }

    /* renamed from: z */
    public final void m4030z(boolean z4) {
        p063P2.C0528a c0528a;
        android.util.SparseArray sparseArray;
        p179q0.C1980W c1980w = this.f8085a;
        c1980w.m4004a(c1980w.f8072d);
        p073S0.C0627e c0627e = c1980w.f8072d;
        int i4 = 0;
        p086W.AbstractC0781a.m1421j(((p197u0.C2214a) c0627e.f1969n) == null);
        c0627e.f1967l = 0L;
        c0627e.f1968m = c1980w.f8070b;
        p073S0.C0627e c0627e2 = c1980w.f8072d;
        c1980w.f8073e = c0627e2;
        c1980w.f8074f = c0627e2;
        c1980w.f8075g = 0L;
        c1980w.f8069a.m4423b();
        this.f8100p = 0;
        this.f8101q = 0;
        this.f8102r = 0;
        this.f8103s = 0;
        this.f8108x = true;
        this.f8104t = Long.MIN_VALUE;
        this.f8105u = Long.MIN_VALUE;
        this.f8106v = Long.MIN_VALUE;
        this.f8107w = false;
        while (true) {
            c0528a = this.f8087c;
            sparseArray = (android.util.SparseArray) c0528a.f1552m;
            if (i4 >= sparseArray.size()) {
                break;
            }
            ((p107b0.C1169d) c0528a.f1553n).accept(sparseArray.valueAt(i4));
            i4++;
        }
        c0528a.f1551l = -1;
        sparseArray.clear();
        if (z4) {
            this.f8078A = null;
            this.f8079B = null;
            this.f8109y = true;
            this.f8081D = true;
        }
    }
}
