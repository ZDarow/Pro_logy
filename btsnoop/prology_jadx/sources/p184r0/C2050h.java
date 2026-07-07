package p184r0;

/* renamed from: r0.h */
/* loaded from: classes.dex */
public final class C2050h implements p179q0.InterfaceC1985a0, p179q0.InterfaceC1989c0, p197u0.InterfaceC2222i, p197u0.InterfaceC2225l {

    /* renamed from: A */
    public p184r0.AbstractC2047e f8345A;

    /* renamed from: B */
    public p076T.C0702p f8346B;

    /* renamed from: C */
    public p117d0.C1258b f8347C;

    /* renamed from: D */
    public long f8348D;

    /* renamed from: E */
    public long f8349E;

    /* renamed from: F */
    public int f8350F;

    /* renamed from: G */
    public p184r0.AbstractC2043a f8351G;

    /* renamed from: H */
    public boolean f8352H;

    /* renamed from: l */
    public final int f8353l;

    /* renamed from: m */
    public final int[] f8354m;

    /* renamed from: n */
    public final p076T.C0702p[] f8355n;

    /* renamed from: o */
    public final boolean[] f8356o;

    /* renamed from: p */
    public final p184r0.InterfaceC2051i f8357p;

    /* renamed from: q */
    public final java.lang.Object f8358q;

    /* renamed from: r */
    public final p127f0.C1372e f8359r;

    /* renamed from: s */
    public final p193t0.C2164b f8360s;

    /* renamed from: t */
    public final p197u0.C2227n f8361t;

    /* renamed from: u */
    public final p009B2.C0033D f8362u;

    /* renamed from: v */
    public final java.util.ArrayList f8363v;

    /* renamed from: w */
    public final java.util.List f8364w;

    /* renamed from: x */
    public final p179q0.C1983Z f8365x;

    /* renamed from: y */
    public final p179q0.C1983Z[] f8366y;

    /* renamed from: z */
    public final p094Y.C0886x f8367z;

    /* JADX WARN: Type inference failed for: r4v3, types: [B2.D, java.lang.Object] */
    public C2050h(int i4, int[] iArr, p076T.C0702p[] c0702pArr, p184r0.InterfaceC2051i interfaceC2051i, p179q0.InterfaceC1987b0 interfaceC1987b0, p197u0.C2218e c2218e, long j4, p127f0.InterfaceC1376i interfaceC1376i, p127f0.C1372e c1372e, p193t0.C2164b c2164b, p127f0.C1372e c1372e2) {
        this.f8353l = i4;
        int i5 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f8354m = iArr;
        this.f8355n = c0702pArr == null ? new p076T.C0702p[0] : c0702pArr;
        this.f8357p = interfaceC2051i;
        this.f8358q = interfaceC1987b0;
        this.f8359r = c1372e2;
        this.f8360s = c2164b;
        this.f8361t = new p197u0.C2227n("ChunkSampleStream");
        this.f8362u = new java.lang.Object();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f8363v = arrayList;
        this.f8364w = java.util.Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f8366y = new p179q0.C1983Z[length];
        this.f8356o = new boolean[length];
        int i6 = length + 1;
        int[] iArr2 = new int[i6];
        p179q0.C1983Z[] c1983zArr = new p179q0.C1983Z[i6];
        interfaceC1376i.getClass();
        p179q0.C1983Z c1983z = new p179q0.C1983Z(c2218e, interfaceC1376i, c1372e);
        this.f8365x = c1983z;
        iArr2[0] = i4;
        c1983zArr[0] = c1983z;
        while (i5 < length) {
            p179q0.C1983Z c1983z2 = new p179q0.C1983Z(c2218e, null, null);
            this.f8366y[i5] = c1983z2;
            int i7 = i5 + 1;
            c1983zArr[i7] = c1983z2;
            iArr2[i7] = this.f8354m[i5];
            i5 = i7;
        }
        this.f8367z = new p094Y.C0886x(25, iArr2, c1983zArr);
        this.f8348D = j4;
        this.f8349E = j4;
    }

    /* renamed from: A */
    public final int m4105A(int i4, int i5) {
        java.util.ArrayList arrayList;
        do {
            i5++;
            arrayList = this.f8363v;
            if (i5 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((p184r0.AbstractC2043a) arrayList.get(i5)).m4100e(0) <= i4);
        return i5 - 1;
    }

    /* renamed from: B */
    public final void m4106B(p117d0.C1258b c1258b) {
        this.f8347C = c1258b;
        p179q0.C1983Z c1983z = this.f8365x;
        c1983z.m4012g();
        p043K2.C0339o c0339o = c1983z.f8092h;
        if (c0339o != null) {
            c0339o.m752K(c1983z.f8089e);
            c1983z.f8092h = null;
            c1983z.f8091g = null;
        }
        for (p179q0.C1983Z c1983z2 : this.f8366y) {
            c1983z2.m4012g();
            p043K2.C0339o c0339o2 = c1983z2.f8092h;
            if (c0339o2 != null) {
                c0339o2.m752K(c1983z2.f8089e);
                c1983z2.f8092h = null;
                c1983z2.f8091g = null;
            }
        }
        this.f8361t.m4433e(this);
    }

    /* renamed from: C */
    public final void m4107C(long j4) {
        java.util.ArrayList arrayList;
        p184r0.AbstractC2043a abstractC2043a;
        this.f8349E = j4;
        if (m4112y()) {
            this.f8348D = j4;
            return;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            arrayList = this.f8363v;
            if (i5 >= arrayList.size()) {
                break;
            }
            abstractC2043a = (p184r0.AbstractC2043a) arrayList.get(i5);
            long j5 = abstractC2043a.f8337r;
            if (j5 == j4 && abstractC2043a.f8307v == -9223372036854775807L) {
                break;
            } else if (j5 > j4) {
                break;
            } else {
                i5++;
            }
        }
        abstractC2043a = null;
        p179q0.C1983Z c1983z = this.f8365x;
        boolean m4007A = abstractC2043a != null ? c1983z.m4007A(abstractC2043a.m4100e(0)) : c1983z.m4008B(j4, j4 < mo2964r());
        p179q0.C1983Z[] c1983zArr = this.f8366y;
        if (m4007A) {
            this.f8350F = m4105A(c1983z.m4018n(), 0);
            int length = c1983zArr.length;
            while (i4 < length) {
                c1983zArr[i4].m4008B(j4, true);
                i4++;
            }
            return;
        }
        this.f8348D = j4;
        this.f8352H = false;
        arrayList.clear();
        this.f8350F = 0;
        p197u0.C2227n c2227n = this.f8361t;
        if (c2227n.m4432d()) {
            c1983z.m4012g();
            int length2 = c1983zArr.length;
            while (i4 < length2) {
                c1983zArr[i4].m4012g();
                i4++;
            }
            c2227n.m4430b();
            return;
        }
        c2227n.f8886n = null;
        c1983z.m4030z(false);
        for (p179q0.C1983Z c1983z2 : c1983zArr) {
            c1983z2.m4030z(false);
        }
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: a */
    public final void mo49a() {
        p197u0.C2227n c2227n = this.f8361t;
        c2227n.mo2967a();
        this.f8365x.m4025u();
        if (c2227n.m4432d()) {
            return;
        }
        this.f8357p.mo2994a();
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        return this.f8361t.m4432d();
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: d */
    public final boolean mo52d() {
        return !m4112y() && this.f8365x.m4023s(this.f8352H);
    }

    @Override // p197u0.InterfaceC2225l
    /* renamed from: f */
    public final void mo3301f() {
        this.f8365x.m4029y();
        for (p179q0.C1983Z c1983z : this.f8366y) {
            c1983z.m4029y();
        }
        this.f8357p.release();
        p117d0.C1258b c1258b = this.f8347C;
        if (c1258b != null) {
            synchronized (c1258b) {
                p117d0.C1270n c1270n = (p117d0.C1270n) c1258b.f5014y.remove(this);
                if (c1270n != null) {
                    c1270n.f5098a.m4029y();
                }
            }
        }
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        if (this.f8352H) {
            return Long.MIN_VALUE;
        }
        if (m4112y()) {
            return this.f8348D;
        }
        long j4 = this.f8349E;
        p184r0.AbstractC2043a m4110t = m4110t();
        if (!m4110t.mo3277d()) {
            java.util.ArrayList arrayList = this.f8363v;
            m4110t = arrayList.size() > 1 ? (p184r0.AbstractC2043a) arrayList.get(arrayList.size() - 2) : null;
        }
        if (m4110t != null) {
            j4 = java.lang.Math.max(j4, m4110t.f8338s);
        }
        return java.lang.Math.max(j4, this.f8365x.m4016l());
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        long j4;
        java.util.List list;
        if (!this.f8352H) {
            p197u0.C2227n c2227n = this.f8361t;
            if (!c2227n.m4432d() && !c2227n.m4431c()) {
                boolean m4112y = m4112y();
                if (m4112y) {
                    list = java.util.Collections.emptyList();
                    j4 = this.f8348D;
                } else {
                    j4 = m4110t().f8338s;
                    list = this.f8364w;
                }
                this.f8357p.mo2997d(c0953q, j4, list, this.f8362u);
                p009B2.C0033D c0033d = this.f8362u;
                boolean z4 = c0033d.f118a;
                p184r0.AbstractC2047e abstractC2047e = (p184r0.AbstractC2047e) c0033d.f119b;
                c0033d.f119b = null;
                c0033d.f118a = false;
                if (z4) {
                    this.f8348D = -9223372036854775807L;
                    this.f8352H = true;
                    return true;
                }
                if (abstractC2047e == null) {
                    return false;
                }
                this.f8345A = abstractC2047e;
                boolean z5 = abstractC2047e instanceof p184r0.AbstractC2043a;
                p094Y.C0886x c0886x = this.f8367z;
                if (z5) {
                    p184r0.AbstractC2043a abstractC2043a = (p184r0.AbstractC2043a) abstractC2047e;
                    if (m4112y) {
                        long j5 = this.f8348D;
                        if (abstractC2043a.f8337r != j5) {
                            this.f8365x.f8104t = j5;
                            for (p179q0.C1983Z c1983z : this.f8366y) {
                                c1983z.f8104t = this.f8348D;
                            }
                        }
                        this.f8348D = -9223372036854775807L;
                    }
                    abstractC2043a.f8309x = c0886x;
                    p179q0.C1983Z[] c1983zArr = (p179q0.C1983Z[]) c0886x.f3176n;
                    int[] iArr = new int[c1983zArr.length];
                    for (int i4 = 0; i4 < c1983zArr.length; i4++) {
                        p179q0.C1983Z c1983z2 = c1983zArr[i4];
                        iArr[i4] = c1983z2.f8101q + c1983z2.f8100p;
                    }
                    abstractC2043a.f8310y = iArr;
                    this.f8363v.add(abstractC2043a);
                } else if (abstractC2047e instanceof p184r0.C2053k) {
                    ((p184r0.C2053k) abstractC2047e).f8375v = c0886x;
                }
                this.f8359r.m3127k(new p179q0.C2019x(abstractC2047e.f8331l, abstractC2047e.f8332m, c2227n.m4434f(abstractC2047e, this, this.f8360s.m4286e(abstractC2047e.f8333n))), abstractC2047e.f8333n, this.f8353l, abstractC2047e.f8334o, abstractC2047e.f8335p, abstractC2047e.f8336q, abstractC2047e.f8337r, abstractC2047e.f8338s);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [q0.b0, java.lang.Object] */
    @Override // p197u0.InterfaceC2222i
    /* renamed from: k */
    public final void mo2969k(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5) {
        p184r0.AbstractC2047e abstractC2047e = (p184r0.AbstractC2047e) interfaceC2224k;
        this.f8345A = null;
        this.f8357p.mo2999f(abstractC2047e);
        long j6 = abstractC2047e.f8331l;
        android.net.Uri uri = abstractC2047e.f8339t.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        this.f8360s.getClass();
        this.f8359r.m3122f(c2019x, abstractC2047e.f8333n, this.f8353l, abstractC2047e.f8334o, abstractC2047e.f8335p, abstractC2047e.f8336q, abstractC2047e.f8337r, abstractC2047e.f8338s);
        this.f8358q.mo1906f(this);
    }

    /* renamed from: m */
    public final void m4108m(long j4) {
        long j5;
        if (m4112y()) {
            return;
        }
        p179q0.C1983Z c1983z = this.f8365x;
        int i4 = c1983z.f8101q;
        c1983z.m4011f(j4, true);
        p179q0.C1983Z c1983z2 = this.f8365x;
        int i5 = c1983z2.f8101q;
        if (i5 > i4) {
            synchronized (c1983z2) {
                j5 = c1983z2.f8100p == 0 ? Long.MIN_VALUE : c1983z2.f8098n[c1983z2.f8102r];
            }
            int i6 = 0;
            while (true) {
                p179q0.C1983Z[] c1983zArr = this.f8366y;
                if (i6 >= c1983zArr.length) {
                    break;
                }
                c1983zArr[i6].m4011f(j5, this.f8356o[i6]);
                i6++;
            }
        }
        int min = java.lang.Math.min(m4105A(i5, 0), this.f8350F);
        if (min > 0) {
            p086W.AbstractC0805y.m1597R(this.f8363v, 0, min);
            this.f8350F -= min;
        }
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: n */
    public final int mo58n(long j4) {
        if (m4112y()) {
            return 0;
        }
        p179q0.C1983Z c1983z = this.f8365x;
        int m4020p = c1983z.m4020p(j4, this.f8352H);
        p184r0.AbstractC2043a abstractC2043a = this.f8351G;
        if (abstractC2043a != null) {
            m4020p = java.lang.Math.min(m4020p, abstractC2043a.m4100e(0) - c1983z.m4018n());
        }
        c1983z.m4009C(m4020p);
        m4113z();
        return m4020p;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: o */
    public final int mo59o(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4) {
        if (m4112y()) {
            return -3;
        }
        p184r0.AbstractC2043a abstractC2043a = this.f8351G;
        p179q0.C1983Z c1983z = this.f8365x;
        if (abstractC2043a != null && abstractC2043a.m4100e(0) <= c1983z.m4018n()) {
            return -3;
        }
        m4113z();
        return c1983z.m4028x(c0886x, c0921f, i4, this.f8352H);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Type inference failed for: r1v3, types: [q0.b0, java.lang.Object] */
    @Override // p197u0.InterfaceC2222i
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p128f1.C1383e mo2970q(p197u0.InterfaceC2224k r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r0.e r1 = (p184r0.AbstractC2047e) r1
            Y.B r2 = r1.f8339t
            long r2 = r2.f3090m
            boolean r4 = r1 instanceof p184r0.AbstractC2043a
            java.util.ArrayList r5 = r0.f8363v
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L26
            if (r4 == 0) goto L26
            boolean r2 = r0.m4111v(r6)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = r3
            goto L27
        L26:
            r2 = r7
        L27:
            q0.x r9 = new q0.x
            Y.B r8 = r1.f8339t
            android.net.Uri r8 = r8.f3091n
            r10 = r26
            r9.<init>(r10)
            long r10 = r1.f8337r
            p086W.AbstractC0805y.m1605Z(r10)
            long r10 = r1.f8338s
            p086W.AbstractC0805y.m1605Z(r10)
            B.c r8 = new B.c
            r15 = r28
            r10 = r29
            r8.<init>(r10, r15)
            r0.i r10 = r0.f8357p
            t0.b r14 = r0.f8360s
            boolean r10 = r10.mo2998e(r1, r2, r8, r14)
            if (r10 == 0) goto L72
            if (r2 == 0) goto L6b
            if (r4 == 0) goto L68
            r0.a r2 = r0.m4109s(r6)
            if (r2 != r1) goto L5a
            goto L5b
        L5a:
            r7 = r3
        L5b:
            p086W.AbstractC0781a.m1421j(r7)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L68
            long r4 = r0.f8349E
            r0.f8348D = r4
        L68:
            f1.e r2 = p197u0.C2227n.f8882p
            goto L73
        L6b:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r4 = "Ignoring attempt to cancel non-cancelable load."
            p086W.AbstractC0781a.m1410A(r2, r4)
        L72:
            r2 = 0
        L73:
            if (r2 != 0) goto L8e
            r14.getClass()
            long r4 = p193t0.C2164b.m4285f(r8)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L8c
            f1.e r2 = new f1.e
            r6 = 0
            r2.<init>(r3, r4, r6)
            goto L8e
        L8c:
            f1.e r2 = p197u0.C2227n.f8883q
        L8e:
            boolean r3 = r2.m3140a()
            r20 = r3 ^ 1
            f0.e r8 = r0.f8359r
            long r4 = r1.f8337r
            long r6 = r1.f8338s
            int r10 = r1.f8333n
            int r11 = r0.f8353l
            T.p r12 = r1.f8334o
            int r13 = r1.f8335p
            java.lang.Object r1 = r1.f8336q
            r24 = r2
            r2 = 0
            r21 = r14
            r14 = r1
            r15 = r4
            r17 = r6
            r19 = r28
            r8.m3124h(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            if (r3 != 0) goto Lbe
            r0.f8345A = r2
            r21.getClass()
            java.lang.Object r1 = r0.f8358q
            r1.mo1906f(r0)
        Lbe:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: p184r0.C2050h.mo2970q(u0.k, long, long, java.io.IOException, int):f1.e");
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        if (m4112y()) {
            return this.f8348D;
        }
        if (this.f8352H) {
            return Long.MIN_VALUE;
        }
        return m4110t().f8338s;
    }

    /* renamed from: s */
    public final p184r0.AbstractC2043a m4109s(int i4) {
        java.util.ArrayList arrayList = this.f8363v;
        p184r0.AbstractC2043a abstractC2043a = (p184r0.AbstractC2043a) arrayList.get(i4);
        p086W.AbstractC0805y.m1597R(arrayList, i4, arrayList.size());
        this.f8350F = java.lang.Math.max(this.f8350F, arrayList.size());
        int i5 = 0;
        this.f8365x.m4014i(abstractC2043a.m4100e(0));
        while (true) {
            p179q0.C1983Z[] c1983zArr = this.f8366y;
            if (i5 >= c1983zArr.length) {
                return abstractC2043a;
            }
            p179q0.C1983Z c1983z = c1983zArr[i5];
            i5++;
            c1983z.m4014i(abstractC2043a.m4100e(i5));
        }
    }

    /* renamed from: t */
    public final p184r0.AbstractC2043a m4110t() {
        return (p184r0.AbstractC2043a) this.f8363v.get(r0.size() - 1);
    }

    /* renamed from: v */
    public final boolean m4111v(int i4) {
        int m4018n;
        p184r0.AbstractC2043a abstractC2043a = (p184r0.AbstractC2043a) this.f8363v.get(i4);
        if (this.f8365x.m4018n() > abstractC2043a.m4100e(0)) {
            return true;
        }
        int i5 = 0;
        do {
            p179q0.C1983Z[] c1983zArr = this.f8366y;
            if (i5 >= c1983zArr.length) {
                return false;
            }
            m4018n = c1983zArr[i5].m4018n();
            i5++;
        } while (m4018n <= abstractC2043a.m4100e(i5));
        return true;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
        p197u0.C2227n c2227n = this.f8361t;
        if (c2227n.m4431c() || m4112y()) {
            return;
        }
        boolean m4432d = c2227n.m4432d();
        p184r0.InterfaceC2051i interfaceC2051i = this.f8357p;
        java.util.ArrayList arrayList = this.f8363v;
        java.util.List list = this.f8364w;
        if (m4432d) {
            p184r0.AbstractC2047e abstractC2047e = this.f8345A;
            abstractC2047e.getClass();
            boolean z4 = abstractC2047e instanceof p184r0.AbstractC2043a;
            if (!(z4 && m4111v(arrayList.size() - 1)) && interfaceC2051i.mo2996c(j4, abstractC2047e, list)) {
                c2227n.m4430b();
                if (z4) {
                    this.f8351G = (p184r0.AbstractC2043a) abstractC2047e;
                    return;
                }
                return;
            }
            return;
        }
        int mo3000g = interfaceC2051i.mo3000g(j4, list);
        if (mo3000g < arrayList.size()) {
            p086W.AbstractC0781a.m1421j(!c2227n.m4432d());
            int size = arrayList.size();
            while (true) {
                if (mo3000g >= size) {
                    mo3000g = -1;
                    break;
                } else if (!m4111v(mo3000g)) {
                    break;
                } else {
                    mo3000g++;
                }
            }
            if (mo3000g == -1) {
                return;
            }
            long j5 = m4110t().f8338s;
            p184r0.AbstractC2043a m4109s = m4109s(mo3000g);
            if (arrayList.isEmpty()) {
                this.f8348D = this.f8349E;
            }
            this.f8352H = false;
            this.f8359r.m3129m(new p166n0.C1891g(1, this.f8353l, null, 3, null, p086W.AbstractC0805y.m1605Z(m4109s.f8337r), p086W.AbstractC0805y.m1605Z(j5)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [q0.b0, java.lang.Object] */
    @Override // p197u0.InterfaceC2222i
    /* renamed from: x */
    public final void mo2971x(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5, boolean z4) {
        p184r0.AbstractC2047e abstractC2047e = (p184r0.AbstractC2047e) interfaceC2224k;
        this.f8345A = null;
        this.f8351G = null;
        long j6 = abstractC2047e.f8331l;
        android.net.Uri uri = abstractC2047e.f8339t.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        this.f8360s.getClass();
        this.f8359r.m3119c(c2019x, abstractC2047e.f8333n, this.f8353l, abstractC2047e.f8334o, abstractC2047e.f8335p, abstractC2047e.f8336q, abstractC2047e.f8337r, abstractC2047e.f8338s);
        if (z4) {
            return;
        }
        if (m4112y()) {
            this.f8365x.m4030z(false);
            for (p179q0.C1983Z c1983z : this.f8366y) {
                c1983z.m4030z(false);
            }
        } else if (abstractC2047e instanceof p184r0.AbstractC2043a) {
            java.util.ArrayList arrayList = this.f8363v;
            m4109s(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f8348D = this.f8349E;
            }
        }
        this.f8358q.mo1906f(this);
    }

    /* renamed from: y */
    public final boolean m4112y() {
        return this.f8348D != -9223372036854775807L;
    }

    /* renamed from: z */
    public final void m4113z() {
        int m4105A = m4105A(this.f8365x.m4018n(), this.f8350F - 1);
        while (true) {
            int i4 = this.f8350F;
            if (i4 > m4105A) {
                return;
            }
            this.f8350F = i4 + 1;
            p184r0.AbstractC2043a abstractC2043a = (p184r0.AbstractC2043a) this.f8363v.get(i4);
            p076T.C0702p c0702p = abstractC2043a.f8334o;
            if (!c0702p.equals(this.f8346B)) {
                this.f8359r.m3117a(this.f8353l, c0702p, abstractC2043a.f8335p, abstractC2043a.f8336q, abstractC2043a.f8337r);
            }
            this.f8346B = c0702p;
        }
    }
}
