package p117d0;

/* renamed from: d0.k */
/* loaded from: classes.dex */
public final class C1267k implements p184r0.InterfaceC2051i {

    /* renamed from: a */
    public final p197u0.InterfaceC2228o f5074a;

    /* renamed from: b */
    public final p035I.C0291m f5075b;

    /* renamed from: c */
    public final int[] f5076c;

    /* renamed from: d */
    public final int f5077d;

    /* renamed from: e */
    public final p094Y.InterfaceC0870h f5078e;

    /* renamed from: f */
    public final long f5079f;

    /* renamed from: g */
    public final int f5080g;

    /* renamed from: h */
    public final p117d0.C1270n f5081h;

    /* renamed from: i */
    public final p117d0.C1265i[] f5082i;

    /* renamed from: j */
    public p193t0.InterfaceC2181s f5083j;

    /* renamed from: k */
    public p122e0.C1302c f5084k;

    /* renamed from: l */
    public int f5085l;

    /* renamed from: m */
    public p179q0.C1986b f5086m;

    /* renamed from: n */
    public boolean f5087n;

    public C1267k(p009B2.C0033D c0033d, p197u0.InterfaceC2228o interfaceC2228o, p122e0.C1302c c1302c, p035I.C0291m c0291m, int i4, int[] iArr, p193t0.InterfaceC2181s interfaceC2181s, int i5, p094Y.InterfaceC0870h interfaceC0870h, long j4, int i6, boolean z4, java.util.ArrayList arrayList, p117d0.C1270n c1270n) {
        p215y0.InterfaceC2403o c0636n;
        java.lang.String str;
        p076T.C0702p c0702p;
        p117d0.C1265i[] c1265iArr;
        p122e0.AbstractC1312m abstractC1312m;
        p184r0.C2046d c2046d;
        this.f5074a = interfaceC2228o;
        this.f5084k = c1302c;
        this.f5075b = c0291m;
        this.f5076c = iArr;
        this.f5083j = interfaceC2181s;
        this.f5077d = i5;
        this.f5078e = interfaceC0870h;
        this.f5085l = i4;
        this.f5079f = j4;
        this.f5080g = i6;
        this.f5081h = c1270n;
        long m3043d = c1302c.m3043d(i4);
        java.util.ArrayList m3001h = m3001h();
        this.f5082i = new p117d0.C1265i[interfaceC2181s.length()];
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f5082i.length) {
            p122e0.AbstractC1312m abstractC1312m2 = (p122e0.AbstractC1312m) m3001h.get(interfaceC2181s.mo3977k(i8));
            p122e0.C1301b m699p = c0291m.m699p(abstractC1312m2.f5266m);
            p117d0.C1265i[] c1265iArr2 = this.f5082i;
            p122e0.C1301b c1301b = m699p == null ? (p122e0.C1301b) abstractC1312m2.f5266m.get(i7) : m699p;
            p076T.C0702p c0702p2 = abstractC1312m2.f5265l;
            c0033d.getClass();
            java.lang.String str2 = c0702p2.f2407l;
            if (!p076T.AbstractC0665H.m1199j(str2)) {
                if (str2 != null && (str2.startsWith("video/webm") || str2.startsWith("audio/webm") || str2.startsWith("application/webm") || str2.startsWith("video/x-matroska") || str2.startsWith("audio/x-matroska") || str2.startsWith("application/x-matroska"))) {
                    str = str2;
                    c0702p = c0702p2;
                    c1265iArr = c1265iArr2;
                    abstractC1312m = abstractC1312m2;
                    c0636n = new p065Q0.C0558d((p046L1.C0363g) c0033d.f119b, c0033d.f118a ? 1 : 3);
                } else if (java.util.Objects.equals(str2, "image/jpeg")) {
                    c0636n = new p012C0.C0135a(1);
                } else if (java.util.Objects.equals(str2, "image/png")) {
                    c0636n = new p012C0.C0135a(1, (byte) 0);
                } else {
                    int i9 = z4 ? 4 : 0;
                    str = str2;
                    c0702p = c0702p2;
                    c1265iArr = c1265iArr2;
                    abstractC1312m = abstractC1312m2;
                    c0636n = new p073S0.C0636n((p046L1.C0363g) c0033d.f119b, c0033d.f118a ? i9 : i9 | 32, null, null, arrayList, c1270n);
                }
                if (c0033d.f118a && !p076T.AbstractC0665H.m1199j(str) && !(c0636n.mo1404d() instanceof p073S0.C0636n) && !(c0636n.mo1404d() instanceof p065Q0.C0558d)) {
                    c0636n = new p083V0.C0775m(c0636n, (p046L1.C0363g) c0033d.f119b);
                }
                c2046d = new p184r0.C2046d(c0636n, i5, c0702p);
                int i10 = i8;
                c1265iArr[i10] = new p117d0.C1265i(m3043d, abstractC1312m, c1301b, c2046d, 0L, abstractC1312m.mo3068d());
                i8 = i10 + 1;
                i7 = 0;
            } else if (c0033d.f118a) {
                c0636n = new p083V0.C0770h(((p046L1.C0363g) c0033d.f119b).mo591d(c0702p2), c0702p2);
            } else {
                c2046d = null;
                c1265iArr = c1265iArr2;
                abstractC1312m = abstractC1312m2;
                int i102 = i8;
                c1265iArr[i102] = new p117d0.C1265i(m3043d, abstractC1312m, c1301b, c2046d, 0L, abstractC1312m.mo3068d());
                i8 = i102 + 1;
                i7 = 0;
            }
            str = str2;
            c0702p = c0702p2;
            c1265iArr = c1265iArr2;
            abstractC1312m = abstractC1312m2;
            if (c0033d.f118a) {
                c0636n = new p083V0.C0775m(c0636n, (p046L1.C0363g) c0033d.f119b);
            }
            c2046d = new p184r0.C2046d(c0636n, i5, c0702p);
            int i1022 = i8;
            c1265iArr[i1022] = new p117d0.C1265i(m3043d, abstractC1312m, c1301b, c2046d, 0L, abstractC1312m.mo3068d());
            i8 = i1022 + 1;
            i7 = 0;
        }
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: a */
    public final void mo2994a() {
        p179q0.C1986b c1986b = this.f5086m;
        if (c1986b != null) {
            throw c1986b;
        }
        this.f5074a.mo2967a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r3 < (((r0.mo632l() + r10) + r8) - 1)) goto L15;
     */
    @Override // p184r0.InterfaceC2051i
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo2995b(long r19, p102a0.C0987m0 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            d0.i[] r0 = r7.f5082i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L5f
            r5 = r0[r4]
            d0.h r6 = r5.f5069d
            if (r6 == 0) goto L5c
            long r8 = r5.m2988d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1b
            goto L5c
        L1b:
            d0.h r0 = r5.f5069d
            p086W.AbstractC0781a.m1422k(r0)
            long r3 = r5.f5070e
            long r3 = r0.mo626c(r1, r3)
            long r10 = r5.f5071f
            long r3 = r3 + r10
            long r12 = r5.m2990f(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L51
            r14 = -1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r14 = 1
            if (r6 == 0) goto L4a
            p086W.AbstractC0781a.m1422k(r0)
            long r16 = r0.mo632l()
            long r16 = r16 + r10
            long r16 = r16 + r8
            long r16 = r16 - r14
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 >= 0) goto L51
        L4a:
            long r3 = r3 + r14
            long r3 = r5.m2990f(r3)
            r5 = r3
            goto L52
        L51:
            r5 = r12
        L52:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.m2029a(r1, r3, r5)
            return r0
        L5c:
            int r4 = r4 + 1
            goto L8
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p117d0.C1267k.mo2995b(long, a0.m0):long");
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: c */
    public final boolean mo2996c(long j4, p184r0.AbstractC2047e abstractC2047e, java.util.List list) {
        if (this.f5086m != null) {
            return false;
        }
        return this.f5083j.mo3973f(j4, abstractC2047e, list);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [q0.b, java.io.IOException] */
    @Override // p184r0.InterfaceC2051i
    /* renamed from: d */
    public final void mo2997d(p102a0.C0953Q c0953q, long j4, java.util.List list, p009B2.C0033D c0033d) {
        long j5;
        p117d0.C1265i[] c1265iArr;
        p184r0.InterfaceC2056n[] interfaceC2056nArr;
        long j6;
        p122e0.AbstractC1312m abstractC1312m;
        long j7;
        long m1616k;
        p076T.C0702p c0702p;
        long j8;
        long j9;
        java.lang.Object c2052j;
        long m1592M;
        long j10;
        long m1616k2;
        boolean z4;
        if (this.f5086m != null) {
            return;
        }
        long j11 = c0953q.f3450a;
        long j12 = j4 - j11;
        long m1592M2 = p086W.AbstractC0805y.m1592M(this.f5084k.m3041b(this.f5085l).f5250b) + p086W.AbstractC0805y.m1592M(this.f5084k.f5217a) + j4;
        p117d0.C1270n c1270n = this.f5081h;
        if (c1270n != null) {
            p117d0.C1271o c1271o = c1270n.f5102e;
            p122e0.C1302c c1302c = c1271o.f5108q;
            if (!c1302c.f5220d) {
                j5 = j12;
                z4 = false;
            } else if (c1271o.f5110s) {
                j5 = j12;
                z4 = true;
            } else {
                java.util.Map.Entry ceilingEntry = c1271o.f5107p.ceilingEntry(java.lang.Long.valueOf(c1302c.f5224h));
                p117d0.C1260d c1260d = c1271o.f5104m;
                if (ceilingEntry == null || ((java.lang.Long) ceilingEntry.getValue()).longValue() >= m1592M2) {
                    j5 = j12;
                    z4 = false;
                } else {
                    long longValue = ((java.lang.Long) ceilingEntry.getKey()).longValue();
                    p117d0.C1263g c1263g = c1260d.f5019m;
                    j5 = j12;
                    long j13 = c1263g.f5055Y;
                    if (j13 == -9223372036854775807L || j13 < longValue) {
                        c1263g.f5055Y = longValue;
                    }
                    z4 = true;
                }
                if (z4 && c1271o.f5109r) {
                    c1271o.f5110s = true;
                    c1271o.f5109r = false;
                    p117d0.C1263g c1263g2 = c1260d.f5019m;
                    c1263g2.f5045O.removeCallbacks(c1263g2.f5038H);
                    c1263g2.m2974B();
                }
            }
            if (z4) {
                return;
            }
        } else {
            j5 = j12;
        }
        long m1592M3 = p086W.AbstractC0805y.m1592M(p086W.AbstractC0805y.m1631z(this.f5079f));
        p122e0.C1302c c1302c2 = this.f5084k;
        long j14 = c1302c2.f5217a;
        long m1592M4 = j14 == -9223372036854775807L ? -9223372036854775807L : m1592M3 - p086W.AbstractC0805y.m1592M(j14 + c1302c2.m3041b(this.f5085l).f5250b);
        p184r0.AbstractC2054l abstractC2054l = list.isEmpty() ? null : (p184r0.AbstractC2054l) list.get(list.size() - 1);
        int length = this.f5083j.length();
        p184r0.InterfaceC2056n[] interfaceC2056nArr2 = new p184r0.InterfaceC2056n[length];
        int i4 = 0;
        while (true) {
            c1265iArr = this.f5082i;
            if (i4 >= length) {
                break;
            }
            p117d0.C1265i c1265i = c1265iArr[i4];
            p117d0.InterfaceC1264h interfaceC1264h = c1265i.f5069d;
            p184r0.C2055m c2055m = p184r0.InterfaceC2056n.f8379f;
            if (interfaceC1264h == null) {
                interfaceC2056nArr2[i4] = c2055m;
                j10 = m1592M4;
            } else {
                long m2986b = c1265i.m2986b(m1592M3);
                long m2987c = c1265i.m2987c(m1592M3);
                if (abstractC2054l != null) {
                    j10 = m1592M4;
                    m1616k2 = abstractC2054l.mo4114a();
                } else {
                    p117d0.InterfaceC1264h interfaceC1264h2 = c1265i.f5069d;
                    p086W.AbstractC0781a.m1422k(interfaceC1264h2);
                    j10 = m1592M4;
                    m1616k2 = p086W.AbstractC0805y.m1616k(interfaceC1264h2.mo626c(j4, c1265i.f5070e) + c1265i.f5071f, m2986b, m2987c);
                }
                if (m1616k2 < m2986b) {
                    interfaceC2056nArr2[i4] = c2055m;
                } else {
                    interfaceC2056nArr2[i4] = new p117d0.C1266j(m3002i(i4), m1616k2, m2987c);
                }
            }
            i4++;
            m1592M4 = j10;
        }
        long j15 = m1592M4;
        long j16 = 0;
        if (!this.f5084k.f5220d || c1265iArr[0].m2988d() == 0) {
            interfaceC2056nArr = interfaceC2056nArr2;
            j6 = -9223372036854775807L;
        } else {
            long m2989e = c1265iArr[0].m2989e(c1265iArr[0].m2987c(m1592M3));
            p122e0.C1302c c1302c3 = this.f5084k;
            long j17 = c1302c3.f5217a;
            if (j17 == -9223372036854775807L) {
                interfaceC2056nArr = interfaceC2056nArr2;
                m1592M = -9223372036854775807L;
            } else {
                interfaceC2056nArr = interfaceC2056nArr2;
                m1592M = m1592M3 - p086W.AbstractC0805y.m1592M(j17 + c1302c3.m3041b(this.f5085l).f5250b);
            }
            long min = java.lang.Math.min(m1592M, m2989e) - j11;
            j16 = 0;
            j6 = java.lang.Math.max(0L, min);
        }
        long j18 = j5;
        long j19 = j16;
        this.f5083j.mo3271s(j11, j18, j6, list, interfaceC2056nArr);
        int mo3269g = this.f5083j.mo3269g();
        android.os.SystemClock.elapsedRealtime();
        p117d0.C1265i m3002i = m3002i(mo3269g);
        p117d0.InterfaceC1264h interfaceC1264h3 = m3002i.f5069d;
        p122e0.C1301b c1301b = m3002i.f5068c;
        p184r0.C2046d c2046d = m3002i.f5066a;
        p122e0.AbstractC1312m abstractC1312m2 = m3002i.f5067b;
        if (c2046d != null) {
            p122e0.C1309j c1309j = c2046d.f8330t == null ? abstractC1312m2.f5269p : null;
            p122e0.C1309j mo3069e = interfaceC1264h3 == null ? abstractC1312m2.mo3069e() : null;
            if (c1309j != null || mo3069e != null) {
                p076T.C0702p mo3972d = this.f5083j.mo3972d();
                int mo3268e = this.f5083j.mo3268e();
                java.lang.Object mo3270l = this.f5083j.mo3270l();
                if (c1309j != null) {
                    p122e0.C1309j m3066a = c1309j.m3066a(mo3069e, c1301b.f5213a);
                    if (m3066a != null) {
                        c1309j = m3066a;
                    }
                } else {
                    mo3069e.getClass();
                    c1309j = mo3069e;
                }
                c0033d.f119b = new p184r0.C2053k(this.f5078e, p080U1.AbstractC0748a.m1369b(abstractC1312m2, c1301b.f5213a, c1309j, 0), mo3972d, mo3268e, mo3270l, m3002i.f5066a);
                return;
            }
        }
        p122e0.C1302c c1302c4 = this.f5084k;
        boolean z5 = c1302c4.f5220d && this.f5085l == c1302c4.f5229m.size() - 1;
        long j20 = m3002i.f5070e;
        boolean z6 = (z5 && j20 == -9223372036854775807L) ? false : true;
        if (m3002i.m2988d() == j19) {
            c0033d.f118a = z6;
            return;
        }
        long m2986b2 = m3002i.m2986b(m1592M3);
        long m2987c2 = m3002i.m2987c(m1592M3);
        if (z5) {
            long m2989e2 = m3002i.m2989e(m2987c2);
            z6 &= (m2989e2 - m3002i.m2990f(m2987c2)) + m2989e2 >= j20;
        }
        long j21 = m3002i.f5071f;
        if (abstractC2054l != null) {
            abstractC1312m = abstractC1312m2;
            m1616k = abstractC2054l.mo4114a();
            j7 = j20;
        } else {
            p086W.AbstractC0781a.m1422k(interfaceC1264h3);
            abstractC1312m = abstractC1312m2;
            j7 = j20;
            m1616k = p086W.AbstractC0805y.m1616k(interfaceC1264h3.mo626c(j4, j7) + j21, m2986b2, m2987c2);
        }
        if (m1616k < m2986b2) {
            this.f5086m = new java.io.IOException();
            return;
        }
        if (m1616k <= m2987c2) {
            p122e0.AbstractC1312m abstractC1312m3 = abstractC1312m;
            if (!this.f5087n || m1616k < m2987c2) {
                if (z6 && m3002i.m2990f(m1616k) >= j7) {
                    c0033d.f118a = true;
                    return;
                }
                int min2 = (int) java.lang.Math.min(this.f5080g, (m2987c2 - m1616k) + 1);
                if (j7 != -9223372036854775807L) {
                    while (min2 > 1 && m3002i.m2990f((min2 + m1616k) - 1) >= j7) {
                        min2--;
                    }
                }
                long j22 = list.isEmpty() ? j4 : -9223372036854775807L;
                p076T.C0702p mo3972d2 = this.f5083j.mo3972d();
                int mo3268e2 = this.f5083j.mo3268e();
                java.lang.Object mo3270l2 = this.f5083j.mo3270l();
                long m2990f = m3002i.m2990f(m1616k);
                p086W.AbstractC0781a.m1422k(interfaceC1264h3);
                long j23 = j7;
                p122e0.C1309j mo621E = interfaceC1264h3.mo621E(m1616k - j21);
                p094Y.InterfaceC0870h interfaceC0870h = this.f5078e;
                if (c2046d == null) {
                    c2052j = new p184r0.C2057o(interfaceC0870h, p080U1.AbstractC0748a.m1369b(abstractC1312m3, c1301b.f5213a, mo621E, m3002i.m2991g(m1616k, j15) ? 0 : 8), mo3972d2, mo3268e2, mo3270l2, m2990f, m3002i.m2989e(m1616k), m1616k, this.f5077d, mo3972d2);
                } else {
                    int i5 = 1;
                    int i6 = 1;
                    while (true) {
                        if (i6 >= min2) {
                            c0702p = mo3972d2;
                            break;
                        }
                        int i7 = min2;
                        c0702p = mo3972d2;
                        p086W.AbstractC0781a.m1422k(interfaceC1264h3);
                        p122e0.C1309j m3066a2 = mo621E.m3066a(interfaceC1264h3.mo621E((i6 + m1616k) - j21), c1301b.f5213a);
                        if (m3066a2 == null) {
                            break;
                        }
                        i5++;
                        i6++;
                        mo3972d2 = c0702p;
                        mo621E = m3066a2;
                        min2 = i7;
                    }
                    long j24 = (i5 + m1616k) - 1;
                    long m2989e3 = m3002i.m2989e(j24);
                    if (j7 == -9223372036854775807L || j23 > m2989e3) {
                        j8 = j15;
                        j9 = -9223372036854775807L;
                    } else {
                        j9 = j23;
                        j8 = j15;
                    }
                    p094Y.C0874l m1369b = p080U1.AbstractC0748a.m1369b(abstractC1312m3, c1301b.f5213a, mo621E, m3002i.m2991g(j24, j8) ? 0 : 8);
                    long j25 = -abstractC1312m3.f5267n;
                    p076T.C0702p c0702p2 = c0702p;
                    if (p076T.AbstractC0665H.m1198i(c0702p2.f2408m)) {
                        j25 += m2990f;
                    }
                    c2052j = new p184r0.C2052j(interfaceC0870h, m1369b, c0702p2, mo3268e2, mo3270l2, m2990f, m2989e3, j22, j9, m1616k, i5, j25, m3002i.f5066a);
                }
                c0033d.f119b = c2052j;
                return;
            }
        }
        c0033d.f118a = z6;
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: e */
    public final boolean mo2998e(p184r0.AbstractC2047e abstractC2047e, boolean z4, p006B.C0020c c0020c, p193t0.C2164b c2164b) {
        long j4;
        if (!z4) {
            return false;
        }
        p117d0.C1270n c1270n = this.f5081h;
        if (c1270n != null) {
            long j5 = c1270n.f5101d;
            boolean z5 = j5 != -9223372036854775807L && j5 < abstractC2047e.f8337r;
            p117d0.C1271o c1271o = c1270n.f5102e;
            if (c1271o.f5108q.f5220d) {
                if (!c1271o.f5110s) {
                    if (z5) {
                        if (c1271o.f5109r) {
                            c1271o.f5110s = true;
                            c1271o.f5109r = false;
                            p117d0.C1263g c1263g = c1271o.f5104m.f5019m;
                            c1263g.f5045O.removeCallbacks(c1263g.f5038H);
                            c1263g.m2974B();
                        }
                    }
                }
                return true;
            }
        }
        boolean z6 = this.f5084k.f5220d;
        p117d0.C1265i[] c1265iArr = this.f5082i;
        if (!z6 && (abstractC2047e instanceof p184r0.AbstractC2054l)) {
            java.io.IOException iOException = (java.io.IOException) c0020c.f88m;
            if ((iOException instanceof p094Y.C0885w) && ((p094Y.C0885w) iOException).f3173o == 404) {
                p117d0.C1265i c1265i = c1265iArr[this.f5083j.mo3981p(abstractC2047e.f8334o)];
                long m2988d = c1265i.m2988d();
                if (m2988d != -1 && m2988d != 0) {
                    p117d0.InterfaceC1264h interfaceC1264h = c1265i.f5069d;
                    p086W.AbstractC0781a.m1422k(interfaceC1264h);
                    if (((p184r0.AbstractC2054l) abstractC2047e).mo4114a() > ((interfaceC1264h.mo632l() + c1265i.f5071f) + m2988d) - 1) {
                        this.f5087n = true;
                        return true;
                    }
                }
            }
        }
        p117d0.C1265i c1265i2 = c1265iArr[this.f5083j.mo3981p(abstractC2047e.f8334o)];
        p129f2.AbstractC1393I abstractC1393I = c1265i2.f5067b.f5266m;
        p035I.C0291m c0291m = this.f5075b;
        p122e0.C1301b m699p = c0291m.m699p(abstractC1393I);
        p122e0.C1301b c1301b = c1265i2.f5068c;
        if (m699p != null && !c1301b.equals(m699p)) {
            return true;
        }
        p193t0.InterfaceC2181s interfaceC2181s = this.f5083j;
        p129f2.AbstractC1393I abstractC1393I2 = c1265i2.f5067b.f5266m;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int length = interfaceC2181s.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (interfaceC2181s.mo3980o(elapsedRealtime, i5)) {
                i4++;
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i6 = 0; i6 < abstractC1393I2.size(); i6++) {
            hashSet.add(java.lang.Integer.valueOf(((p122e0.C1301b) abstractC1393I2.get(i6)).f5215c));
        }
        int size = hashSet.size();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.ArrayList m688d = c0291m.m688d(abstractC1393I2);
        for (int i7 = 0; i7 < m688d.size(); i7++) {
            hashSet2.add(java.lang.Integer.valueOf(((p122e0.C1301b) m688d.get(i7)).f5215c));
        }
        p197u0.C2221h c2221h = new p197u0.C2221h(size, size - hashSet2.size(), length, i4);
        if (!c2221h.m4428a(2) && !c2221h.m4428a(1)) {
            return false;
        }
        c2164b.getClass();
        p128f1.C1383e m4284d = p193t0.C2164b.m4284d(c2221h, c0020c);
        if (m4284d != null) {
            int i8 = m4284d.f5683a;
            if (c2221h.m4428a(i8)) {
                long j6 = m4284d.f5684b;
                if (i8 == 2) {
                    p193t0.InterfaceC2181s interfaceC2181s2 = this.f5083j;
                    return interfaceC2181s2.mo3982q(j6, interfaceC2181s2.mo3981p(abstractC2047e.f8334o));
                }
                if (i8 != 1) {
                    return false;
                }
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() + j6;
                java.lang.String str = c1301b.f5214b;
                java.util.HashMap hashMap = (java.util.HashMap) c0291m.f876l;
                if (hashMap.containsKey(str)) {
                    java.lang.Long l4 = (java.lang.Long) hashMap.get(str);
                    int i9 = p086W.AbstractC0805y.f2801a;
                    j4 = java.lang.Math.max(elapsedRealtime2, l4.longValue());
                } else {
                    j4 = elapsedRealtime2;
                }
                hashMap.put(str, java.lang.Long.valueOf(j4));
                int i10 = c1301b.f5215c;
                if (i10 == Integer.MIN_VALUE) {
                    return true;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i10);
                java.util.HashMap hashMap2 = (java.util.HashMap) c0291m.f877m;
                if (hashMap2.containsKey(valueOf)) {
                    java.lang.Long l5 = (java.lang.Long) hashMap2.get(valueOf);
                    int i11 = p086W.AbstractC0805y.f2801a;
                    elapsedRealtime2 = java.lang.Math.max(elapsedRealtime2, l5.longValue());
                }
                hashMap2.put(valueOf, java.lang.Long.valueOf(elapsedRealtime2));
                return true;
            }
        }
        return false;
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: f */
    public final void mo2999f(p184r0.AbstractC2047e abstractC2047e) {
        if (abstractC2047e instanceof p184r0.C2053k) {
            int mo3981p = this.f5083j.mo3981p(((p184r0.C2053k) abstractC2047e).f8334o);
            p117d0.C1265i[] c1265iArr = this.f5082i;
            p117d0.C1265i c1265i = c1265iArr[mo3981p];
            if (c1265i.f5069d == null) {
                p184r0.C2046d c2046d = c1265i.f5066a;
                p086W.AbstractC0781a.m1422k(c2046d);
                p215y0.InterfaceC2414z interfaceC2414z = c2046d.f8329s;
                p215y0.C2398j c2398j = interfaceC2414z instanceof p215y0.C2398j ? (p215y0.C2398j) interfaceC2414z : null;
                if (c2398j != null) {
                    p122e0.AbstractC1312m abstractC1312m = c1265i.f5067b;
                    c1265iArr[mo3981p] = new p117d0.C1265i(c1265i.f5070e, abstractC1312m, c1265i.f5068c, c1265i.f5066a, c1265i.f5071f, new p028G0.C0235c(c2398j, abstractC1312m.f5267n, 4));
                }
            }
        }
        p117d0.C1270n c1270n = this.f5081h;
        if (c1270n != null) {
            long j4 = c1270n.f5101d;
            if (j4 == -9223372036854775807L || abstractC2047e.f8338s > j4) {
                c1270n.f5101d = abstractC2047e.f8338s;
            }
            c1270n.f5102e.f5109r = true;
        }
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: g */
    public final int mo3000g(long j4, java.util.List list) {
        return (this.f5086m != null || this.f5083j.length() < 2) ? list.size() : this.f5083j.mo3979n(j4, list);
    }

    /* renamed from: h */
    public final java.util.ArrayList m3001h() {
        java.util.List list = this.f5084k.m3041b(this.f5085l).f5251c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 : this.f5076c) {
            arrayList.addAll(((p122e0.C1300a) list.get(i4)).f5209c);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final p117d0.C1265i m3002i(int i4) {
        p117d0.C1265i[] c1265iArr = this.f5082i;
        p117d0.C1265i c1265i = c1265iArr[i4];
        p122e0.C1301b m699p = this.f5075b.m699p(c1265i.f5067b.f5266m);
        if (m699p == null || m699p.equals(c1265i.f5068c)) {
            return c1265i;
        }
        p117d0.C1265i c1265i2 = new p117d0.C1265i(c1265i.f5070e, c1265i.f5067b, m699p, c1265i.f5066a, c1265i.f5071f, c1265i.f5069d);
        c1265iArr[i4] = c1265i2;
        return c1265i2;
    }

    @Override // p184r0.InterfaceC2051i
    public final void release() {
        for (p117d0.C1265i c1265i : this.f5082i) {
            p184r0.C2046d c2046d = c1265i.f5066a;
            if (c2046d != null) {
                c2046d.f8322l.release();
            }
        }
    }
}
