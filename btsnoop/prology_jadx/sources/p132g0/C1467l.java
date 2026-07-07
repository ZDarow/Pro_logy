package p132g0;

/* renamed from: g0.l */
/* loaded from: classes.dex */
public final class C1467l implements p179q0.InterfaceC1962D, p136h0.InterfaceC1500q {

    /* renamed from: A */
    public final p129f2.C1408Y f5902A = new p129f2.C1408Y(3, this);

    /* renamed from: B */
    public p179q0.InterfaceC1961C f5903B;

    /* renamed from: C */
    public int f5904C;

    /* renamed from: D */
    public p179q0.C2005k0 f5905D;

    /* renamed from: E */
    public p132g0.C1473r[] f5906E;

    /* renamed from: F */
    public p132g0.C1473r[] f5907F;

    /* renamed from: G */
    public int f5908G;

    /* renamed from: H */
    public p179q0.C2006l f5909H;

    /* renamed from: l */
    public final p132g0.C1458c f5910l;

    /* renamed from: m */
    public final p136h0.C1486c f5911m;

    /* renamed from: n */
    public final p129f2.C1408Y f5912n;

    /* renamed from: o */
    public final p094Y.InterfaceC0860C f5913o;

    /* renamed from: p */
    public final p127f0.InterfaceC1376i f5914p;

    /* renamed from: q */
    public final p127f0.C1372e f5915q;

    /* renamed from: r */
    public final p193t0.C2164b f5916r;

    /* renamed from: s */
    public final p127f0.C1372e f5917s;

    /* renamed from: t */
    public final p197u0.C2218e f5918t;

    /* renamed from: u */
    public final java.util.IdentityHashMap f5919u;

    /* renamed from: v */
    public final p129f2.C1408Y f5920v;

    /* renamed from: w */
    public final p046L1.C0363g f5921w;

    /* renamed from: x */
    public final boolean f5922x;

    /* renamed from: y */
    public final int f5923y;

    /* renamed from: z */
    public final p107b0.C1177l f5924z;

    public C1467l(p132g0.C1458c c1458c, p136h0.C1486c c1486c, p129f2.C1408Y c1408y, p094Y.InterfaceC0860C interfaceC0860C, p127f0.InterfaceC1376i interfaceC1376i, p127f0.C1372e c1372e, p193t0.C2164b c2164b, p127f0.C1372e c1372e2, p197u0.C2218e c2218e, p046L1.C0363g c0363g, boolean z4, int i4, p107b0.C1177l c1177l) {
        this.f5910l = c1458c;
        this.f5911m = c1486c;
        this.f5912n = c1408y;
        this.f5913o = interfaceC0860C;
        this.f5914p = interfaceC1376i;
        this.f5915q = c1372e;
        this.f5916r = c2164b;
        this.f5917s = c1372e2;
        this.f5918t = c2218e;
        this.f5921w = c0363g;
        this.f5922x = z4;
        this.f5923y = i4;
        this.f5924z = c1177l;
        c0363g.getClass();
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        this.f5909H = new p179q0.C2006l(c1415c0, c1415c0);
        this.f5919u = new java.util.IdentityHashMap();
        this.f5920v = new p129f2.C1408Y(4);
        this.f5906E = new p132g0.C1473r[0];
        this.f5907F = new p132g0.C1473r[0];
    }

    /* renamed from: k */
    public static p076T.C0702p m3281k(p076T.C0702p c0702p, p076T.C0702p c0702p2, boolean z4) {
        p076T.C0664G c0664g;
        int i4;
        java.lang.String str;
        int i5;
        int i6;
        java.lang.String str2;
        java.lang.String str3;
        p129f2.AbstractC1393I abstractC1393I;
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.AbstractC1393I abstractC1393I2 = p129f2.C1415c0.f5744p;
        if (c0702p2 != null) {
            str3 = c0702p2.f2405j;
            c0664g = c0702p2.f2406k;
            i5 = c0702p2.f2385A;
            i4 = c0702p2.f2400e;
            i6 = c0702p2.f2401f;
            str = c0702p2.f2399d;
            str2 = c0702p2.f2397b;
            abstractC1393I = c0702p2.f2398c;
        } else {
            java.lang.String m1627v = p086W.AbstractC0805y.m1627v(c0702p.f2405j, 1);
            c0664g = c0702p.f2406k;
            if (z4) {
                i5 = c0702p.f2385A;
                i4 = c0702p.f2400e;
                i6 = c0702p.f2401f;
                str = c0702p.f2399d;
                str2 = c0702p.f2397b;
                abstractC1393I2 = c0702p.f2398c;
            } else {
                i4 = 0;
                str = null;
                i5 = -1;
                i6 = 0;
                str2 = null;
            }
            p129f2.AbstractC1393I abstractC1393I3 = abstractC1393I2;
            str3 = m1627v;
            abstractC1393I = abstractC1393I3;
        }
        java.lang.String m1192c = p076T.AbstractC0665H.m1192c(str3);
        int i7 = z4 ? c0702p.f2402g : -1;
        int i8 = z4 ? c0702p.f2403h : -1;
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2359a = c0702p.f2396a;
        c0701o.f2360b = str2;
        c0701o.f2361c = p129f2.AbstractC1393I.m3162j(abstractC1393I);
        c0701o.f2369k = p076T.AbstractC0665H.m1201l(c0702p.f2407l);
        c0701o.f2370l = p076T.AbstractC0665H.m1201l(m1192c);
        c0701o.f2367i = str3;
        c0701o.f2368j = c0664g;
        c0701o.f2365g = i7;
        c0701o.f2366h = i8;
        c0701o.f2384z = i5;
        c0701o.f2363e = i4;
        c0701o.f2364f = i6;
        c0701o.f2362d = str;
        return new p076T.C0702p(c0701o);
    }

    @Override // p136h0.InterfaceC1500q
    /* renamed from: a */
    public final void mo3282a() {
        for (p132g0.C1473r c1473r : this.f5906E) {
            java.util.ArrayList arrayList = c1473r.f6000y;
            if (!arrayList.isEmpty()) {
                p132g0.C1466k c1466k = (p132g0.C1466k) p129f2.AbstractC1444r.m3232l(arrayList);
                int m3273b = c1473r.f5990o.m3273b(c1466k);
                if (m3273b == 1) {
                    c1466k.f5896V = true;
                } else if (m3273b == 0) {
                    c1473r.f5954C.post(new p086W.RunnableC0793m(6, c1473r, c1466k));
                } else if (m3273b == 2 && !c1473r.f5982e0) {
                    p197u0.C2227n c2227n = c1473r.f5996u;
                    if (c2227n.m4432d()) {
                        c2227n.m4430b();
                    }
                }
            }
        }
        this.f5903B.mo1906f(this);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: b */
    public final long mo2953b(long j4, p102a0.C0987m0 c0987m0) {
        p132g0.C1473r[] c1473rArr = this.f5907F;
        int length = c1473rArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            p132g0.C1473r c1473r = c1473rArr[i4];
            if (c1473r.f5963L == 2) {
                p132g0.C1464i c1464i = c1473r.f5990o;
                int mo3269g = c1464i.f5870q.mo3269g();
                android.net.Uri[] uriArr = c1464i.f5858e;
                int length2 = uriArr.length;
                p136h0.C1486c c1486c = c1464i.f5860g;
                p136h0.C1492i m3317a = (mo3269g >= length2 || mo3269g == -1) ? null : c1486c.m3317a(true, uriArr[c1464i.f5870q.mo3969a()]);
                if (m3317a != null) {
                    p129f2.AbstractC1393I abstractC1393I = m3317a.f6126r;
                    if (!abstractC1393I.isEmpty() && m3317a.f6151c) {
                        long j5 = m3317a.f6116h - c1486c.f6088y;
                        long j6 = j4 - j5;
                        int m1609d = p086W.AbstractC0805y.m1609d(abstractC1393I, java.lang.Long.valueOf(j6), true);
                        long j7 = ((p136h0.C1489f) abstractC1393I.get(m1609d)).f6100p;
                        return c0987m0.m2029a(j6, j7, m1609d != abstractC1393I.size() - 1 ? ((p136h0.C1489f) abstractC1393I.get(m1609d + 1)).f6100p : j7) + j5;
                    }
                }
            } else {
                i4++;
            }
        }
        return j4;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        return this.f5909H.mo2954c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053 A[SYNTHETIC] */
    @Override // p136h0.InterfaceC1500q
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo3283d(android.net.Uri r17, p006B.C0020c r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            g0.r[] r2 = r0.f5906E
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La4
            r8 = r2[r6]
            g0.i r9 = r8.f5990o
            android.net.Uri[] r10 = r9.f5858e
            boolean r11 = p086W.AbstractC0805y.m1617l(r10, r1)
            if (r11 != 0) goto L1d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L9f
        L1d:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3f
            t0.s r13 = r9.f5870q
            u0.h r13 = p176p1.AbstractC1949a.m3943t(r13)
            t0.b r8 = r8.f5995t
            r8.getClass()
            r8 = r18
            f1.e r13 = p193t0.C2164b.m4284d(r13, r8)
            if (r13 == 0) goto L41
            int r14 = r13.f5683a
            r15 = 2
            if (r14 != r15) goto L41
            long r13 = r13.f5684b
            goto L42
        L3f:
            r8 = r18
        L41:
            r13 = r11
        L42:
            r15 = 0
        L43:
            int r5 = r10.length
            r4 = -1
            if (r15 >= r5) goto L53
            r5 = r10[r15]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L50
            goto L54
        L50:
            int r15 = r15 + 1
            goto L43
        L53:
            r15 = r4
        L54:
            if (r15 != r4) goto L59
        L56:
            r4 = 1
            r5 = 1
            goto L96
        L59:
            t0.s r5 = r9.f5870q
            int r5 = r5.mo3985u(r15)
            if (r5 != r4) goto L62
            goto L56
        L62:
            boolean r4 = r9.f5872s
            android.net.Uri r10 = r9.f5868o
            boolean r10 = r1.equals(r10)
            r4 = r4 | r10
            r9.f5872s = r4
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L94
            t0.s r4 = r9.f5870q
            boolean r4 = r4.mo3982q(r13, r5)
            if (r4 == 0) goto L91
            h0.c r4 = r9.f5860g
            java.util.HashMap r4 = r4.f6078o
            java.lang.Object r4 = r4.get(r1)
            h0.b r4 = (p136h0.C1485b) r4
            if (r4 == 0) goto L8c
            boolean r4 = p136h0.C1485b.m3311a(r4, r13)
            r5 = 1
            r4 = r4 ^ r5
            goto L8e
        L8c:
            r5 = 1
            r4 = 0
        L8e:
            if (r4 == 0) goto L92
            goto L95
        L91:
            r5 = 1
        L92:
            r4 = 0
            goto L96
        L94:
            r5 = 1
        L95:
            r4 = r5
        L96:
            if (r4 == 0) goto L9e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9e
            r4 = r5
            goto L9f
        L9e:
            r4 = 0
        L9f:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La4:
            q0.C r1 = r0.f5903B
            r1.mo1906f(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p132g0.C1467l.mo3283d(android.net.Uri, B.c, boolean):boolean");
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: e */
    public final p179q0.C2005k0 mo2956e() {
        p179q0.C2005k0 c2005k0 = this.f5905D;
        c2005k0.getClass();
        return c2005k0;
    }

    /* renamed from: f */
    public final p132g0.C1473r m3284f(java.lang.String str, int i4, android.net.Uri[] uriArr, p076T.C0702p[] c0702pArr, p076T.C0702p c0702p, java.util.List list, java.util.Map map, long j4) {
        p132g0.C1464i c1464i = new p132g0.C1464i(this.f5910l, this.f5911m, uriArr, c0702pArr, this.f5912n, this.f5913o, this.f5920v, list, this.f5924z);
        p127f0.C1372e c1372e = this.f5917s;
        return new p132g0.C1473r(str, i4, this.f5902A, c1464i, map, this.f5918t, j4, c0702p, this.f5914p, this.f5915q, this.f5916r, c1372e, this.f5923y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r2[r7] != 1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // p179q0.InterfaceC1962D
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2957g(p179q0.InterfaceC1961C r28, long r29) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p132g0.C1467l.mo2957g(q0.C, long):void");
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        return this.f5909H.mo2958h();
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        if (this.f5905D != null) {
            return this.f5909H.mo2959i(c0953q);
        }
        for (p132g0.C1473r c1473r : this.f5906E) {
            if (!c1473r.f5966O) {
                p102a0.C0952P c0952p = new p102a0.C0952P();
                c0952p.f3447a = c1473r.f5978a0;
                c1473r.mo2959i(new p102a0.C0953Q(c0952p));
            }
        }
        return false;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: j */
    public final void mo2960j() {
        for (p132g0.C1473r c1473r : this.f5906E) {
            c1473r.m3296E();
            if (c1473r.f5982e0 && !c1473r.f5966O) {
                throw p076T.C0666I.m1202a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: l */
    public final long mo2961l(long j4) {
        p132g0.C1473r[] c1473rArr = this.f5907F;
        if (c1473rArr.length > 0) {
            boolean m3299H = c1473rArr[0].m3299H(j4, false);
            int i4 = 1;
            while (true) {
                p132g0.C1473r[] c1473rArr2 = this.f5907F;
                if (i4 >= c1473rArr2.length) {
                    break;
                }
                c1473rArr2[i4].m3299H(j4, m3299H);
                i4++;
            }
            if (m3299H) {
                ((android.util.SparseArray) this.f5920v.f5729m).clear();
            }
        }
        return j4;
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: m */
    public final void mo2962m(long j4) {
        for (p132g0.C1473r c1473r : this.f5907F) {
            if (c1473r.f5965N && !c1473r.m3294C()) {
                int length = c1473r.f5958G.length;
                for (int i4 = 0; i4 < length; i4++) {
                    c1473r.f5958G[i4].m4011f(j4, c1473r.f5976Y[i4]);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x028d  */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // p179q0.InterfaceC1962D
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo2963p(p193t0.InterfaceC2181s[] r37, boolean[] r38, p179q0.InterfaceC1985a0[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p132g0.C1467l.mo2963p(t0.s[], boolean[], q0.a0[], boolean[], long):long");
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        return this.f5909H.mo2964r();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: u */
    public final long mo2965u() {
        return -9223372036854775807L;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
        this.f5909H.mo2966w(j4);
    }
}
