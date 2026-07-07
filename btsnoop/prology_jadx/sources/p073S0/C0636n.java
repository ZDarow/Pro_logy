package p073S0;

/* renamed from: S0.n */
/* loaded from: classes.dex */
public final class C0636n implements p215y0.InterfaceC2403o {

    /* renamed from: K */
    public static final byte[] f2003K = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: L */
    public static final p076T.C0702p f2004L;

    /* renamed from: A */
    public long f2005A;

    /* renamed from: B */
    public p073S0.C0635m f2006B;

    /* renamed from: C */
    public int f2007C;

    /* renamed from: D */
    public int f2008D;

    /* renamed from: E */
    public int f2009E;

    /* renamed from: F */
    public boolean f2010F;

    /* renamed from: G */
    public p215y0.InterfaceC2405q f2011G;

    /* renamed from: H */
    public p215y0.InterfaceC2387F[] f2012H;

    /* renamed from: I */
    public p215y0.InterfaceC2387F[] f2013I;

    /* renamed from: J */
    public boolean f2014J;

    /* renamed from: a */
    public final p083V0.InterfaceC0772j f2015a;

    /* renamed from: b */
    public final int f2016b;

    /* renamed from: c */
    public final p073S0.C0643u f2017c;

    /* renamed from: d */
    public final java.util.List f2018d;

    /* renamed from: i */
    public final byte[] f2023i;

    /* renamed from: j */
    public final p086W.C0798r f2024j;

    /* renamed from: k */
    public final p086W.C0803w f2025k;

    /* renamed from: p */
    public final p117d0.C1270n f2030p;

    /* renamed from: q */
    public p129f2.C1415c0 f2031q;

    /* renamed from: r */
    public int f2032r;

    /* renamed from: s */
    public int f2033s;

    /* renamed from: t */
    public long f2034t;

    /* renamed from: u */
    public int f2035u;

    /* renamed from: v */
    public p086W.C0798r f2036v;

    /* renamed from: w */
    public long f2037w;

    /* renamed from: x */
    public int f2038x;

    /* renamed from: y */
    public long f2039y;

    /* renamed from: z */
    public long f2040z;

    /* renamed from: l */
    public final p008B1.C0026d f2026l = new p008B1.C0026d(7);

    /* renamed from: m */
    public final p086W.C0798r f2027m = new p086W.C0798r(16);

    /* renamed from: f */
    public final p086W.C0798r f2020f = new p086W.C0798r(p090X.AbstractC0830g.f2960a);

    /* renamed from: g */
    public final p086W.C0798r f2021g = new p086W.C0798r(5);

    /* renamed from: h */
    public final p086W.C0798r f2022h = new p086W.C0798r();

    /* renamed from: n */
    public final java.util.ArrayDeque f2028n = new java.util.ArrayDeque();

    /* renamed from: o */
    public final java.util.ArrayDeque f2029o = new java.util.ArrayDeque();

    /* renamed from: e */
    public final android.util.SparseArray f2019e = new android.util.SparseArray();

    static {
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l("application/x-emsg");
        f2004L = new p076T.C0702p(c0701o);
    }

    public C0636n(p083V0.InterfaceC0772j interfaceC0772j, int i4, p086W.C0803w c0803w, p073S0.C0643u c0643u, java.util.List list, p117d0.C1270n c1270n) {
        this.f2015a = interfaceC0772j;
        this.f2016b = i4;
        this.f2025k = c0803w;
        this.f2017c = c0643u;
        this.f2018d = java.util.Collections.unmodifiableList(list);
        this.f2030p = c1270n;
        byte[] bArr = new byte[16];
        this.f2023i = bArr;
        this.f2024j = new p086W.C0798r(bArr);
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        this.f2031q = p129f2.C1415c0.f5744p;
        this.f2040z = -9223372036854775807L;
        this.f2039y = -9223372036854775807L;
        this.f2005A = -9223372036854775807L;
        this.f2011G = p215y0.InterfaceC2405q.f9465k;
        this.f2012H = new p215y0.InterfaceC2387F[0];
        this.f2013I = new p215y0.InterfaceC2387F[0];
    }

    /* renamed from: a */
    public static p076T.C0699m m1162a(java.util.ArrayList arrayList) {
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = null;
        for (int i4 = 0; i4 < size; i4++) {
            p073S0.C0624b c0624b = (p073S0.C0624b) arrayList.get(i4);
            if (c0624b.f1957m == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                byte[] bArr = c0624b.f1955n.f2786a;
                p043K2.C0339o m1174h = p073S0.AbstractC0642t.m1174h(bArr);
                java.util.UUID uuid = m1174h == null ? null : (java.util.UUID) m1174h.f1048m;
                if (uuid == null) {
                    p086W.AbstractC0781a.m1410A("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new p076T.C0698l(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new p076T.C0699m(null, false, (p076T.C0698l[]) arrayList2.toArray(new p076T.C0698l[0]));
    }

    /* renamed from: c */
    public static void m1163c(p086W.C0798r c0798r, int i4, p073S0.C0645w c0645w) {
        c0798r.m1537G(i4 + 8);
        int m1546h = c0798r.m1546h();
        if ((m1546h & 1) != 0) {
            throw p076T.C0666I.m1204c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (m1546h & 2) != 0;
        int m1563y = c0798r.m1563y();
        if (m1563y == 0) {
            java.util.Arrays.fill(c0645w.f2111l, 0, c0645w.f2104e, false);
            return;
        }
        if (m1563y != c0645w.f2104e) {
            throw p076T.C0666I.m1202a(null, "Senc sample count " + m1563y + " is different from fragment sample count" + c0645w.f2104e);
        }
        java.util.Arrays.fill(c0645w.f2111l, 0, m1563y, z4);
        int m1539a = c0798r.m1539a();
        p086W.C0798r c0798r2 = c0645w.f2113n;
        c0798r2.m1534D(m1539a);
        c0645w.f2110k = true;
        c0645w.f2114o = true;
        c0798r.m1544f(c0798r2.f2786a, 0, c0798r2.f2788c);
        c0798r2.m1537G(0);
        c0645w.f2114o = false;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        android.util.SparseArray sparseArray = this.f2019e;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((p073S0.C0635m) sparseArray.valueAt(i4)).m1161d();
        }
        this.f2029o.clear();
        this.f2038x = 0;
        this.f2039y = j5;
        this.f2028n.clear();
        this.f2032r = 0;
        this.f2035u = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:402:0x07f2, code lost:
    
        r5 = r0;
        r5.f2032r = 0;
        r5.f2035u = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x07f8, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03db  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1164e(long r54) {
        /*
            Method dump skipped, instructions count: 2041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073S0.C0636n.m1164e(long):void");
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        int i4;
        int i5 = this.f2016b;
        p215y0.InterfaceC2405q c1061t = (i5 & 32) == 0 ? new android.support.v4.media.session.C1061t(interfaceC2405q, this.f2015a) : interfaceC2405q;
        this.f2011G = c1061t;
        this.f2032r = 0;
        this.f2035u = 0;
        p215y0.InterfaceC2387F[] interfaceC2387FArr = new p215y0.InterfaceC2387F[2];
        this.f2012H = interfaceC2387FArr;
        p117d0.C1270n c1270n = this.f2030p;
        if (c1270n != null) {
            interfaceC2387FArr[0] = c1270n;
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i6 = 100;
        if ((i5 & 4) != 0) {
            interfaceC2387FArr[i4] = c1061t.mo640v(100, 5);
            i6 = 101;
            i4++;
        }
        p215y0.InterfaceC2387F[] interfaceC2387FArr2 = (p215y0.InterfaceC2387F[]) p086W.AbstractC0805y.m1594O(i4, this.f2012H);
        this.f2012H = interfaceC2387FArr2;
        for (p215y0.InterfaceC2387F interfaceC2387F : interfaceC2387FArr2) {
            interfaceC2387F.mo1407c(f2004L);
        }
        java.util.List list = this.f2018d;
        this.f2013I = new p215y0.InterfaceC2387F[list.size()];
        int i7 = 0;
        while (i7 < this.f2013I.length) {
            p215y0.InterfaceC2387F mo640v = this.f2011G.mo640v(i6, 3);
            mo640v.mo1407c((p076T.C0702p) list.get(i7));
            this.f2013I[i7] = mo640v;
            i7++;
            i6++;
        }
        p073S0.C0643u c0643u = this.f2017c;
        if (c0643u != null) {
            this.f2019e.put(0, new p073S0.C0635m(interfaceC2405q.mo640v(0, c0643u.f2085b), new p073S0.C0646x(this.f2017c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new p073S0.C0633k(0, 0, 0, 0)));
            this.f2011G.mo637s();
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: j */
    public final java.util.List mo1165j() {
        return this.f2031q;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        p129f2.C1415c0 c1415c0;
        p215y0.InterfaceC2385D m1176j = p073S0.AbstractC0642t.m1176j(interfaceC2404p, true, false);
        if (m1176j != null) {
            c1415c0 = p129f2.AbstractC1393I.m3166o(m1176j);
        } else {
            p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
            c1415c0 = p129f2.C1415c0.f5744p;
        }
        this.f2031q = c1415c0;
        return m1176j == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x00b9, code lost:
    
        r4 = r30.f2032r;
        r7 = r3.f1992b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x00bf, code lost:
    
        if (r4 != 3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00c3, code lost:
    
        if (r3.f2002l != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00c5, code lost:
    
        r4 = r3.f1994d.f2120d[r3.f1996f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00d4, code lost:
    
        r30.f2007C = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00da, code lost:
    
        if (r3.f1996f >= r3.f1999i) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00dc, code lost:
    
        ((p215y0.C2400l) r31).mo628e(r4);
        r1 = r3.m1158a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00e5, code lost:
    
        if (r1 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00e8, code lost:
    
        r2 = r7.f2113n;
        r1 = r1.f2098d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00ec, code lost:
    
        if (r1 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00ee, code lost:
    
        r2.m1538H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00f1, code lost:
    
        r1 = r3.f1996f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00f5, code lost:
    
        if (r7.f2110k == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00fb, code lost:
    
        if (r7.f2111l[r1] == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00fd, code lost:
    
        r2.m1538H(r2.m1531A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0109, code lost:
    
        if (r3.m1159b() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x010b, code lost:
    
        r30.f2006B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x010e, code lost:
    
        r30.f2032r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x011a, code lost:
    
        if (r3.f1994d.f2117a.f2090g != r2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x011c, code lost:
    
        r30.f2007C = r4 - 8;
        ((p215y0.C2400l) r31).mo628e(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0135, code lost:
    
        if ("audio/ac4".equals(r3.f1994d.f2117a.f2089f.f2408m) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0137, code lost:
    
        r30.f2008D = r3.m1160c(r30.f2007C, 7);
        r4 = r30.f2007C;
        r9 = r30.f2024j;
        p215y0.AbstractC2390b.m4614i(r4, r9);
        r3.f1991a.mo1405a(r9, 7, 0);
        r30.f2008D += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x015a, code lost:
    
        r30.f2007C += r30.f2008D;
        r30.f2032r = 4;
        r30.f2009E = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0152, code lost:
    
        r30.f2008D = r3.m1160c(r30.f2007C, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00ce, code lost:
    
        r4 = r7.f2107h[r3.f1996f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0166, code lost:
    
        r4 = r3.f1994d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x016a, code lost:
    
        if (r3.f2002l != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x016c, code lost:
    
        r9 = r4.f2122f[r3.f1996f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x017a, code lost:
    
        if (r13 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x017c, code lost:
    
        r9 = r13.m1573a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0180, code lost:
    
        r4 = r4.f2117a;
        r8 = r4.f2093j;
        r11 = r3.f1991a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0186, code lost:
    
        if (r8 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0188, code lost:
    
        r14 = r30.f2021g;
        r15 = r14.f2786a;
        r15[0] = 0;
        r15[r2] = 0;
        r15[2] = 0;
        r5 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x019e, code lost:
    
        if (r30.f2008D >= r30.f2007C) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x01a0, code lost:
    
        r2 = r30.f2009E;
        r29 = r13;
        r13 = r4.f2089f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x01a8, code lost:
    
        if (r2 != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x01aa, code lost:
    
        r19 = r4;
        ((p215y0.C2400l) r31).mo631k(r15, r8, r5, false);
        r14.m1537G(0);
        r2 = r14.m1546h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01bb, code lost:
    
        if (r2 < 1) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01bd, code lost:
    
        r30.f2009E = r2 - 1;
        r2 = r30.f2020f;
        r2.m1537G(0);
        r22 = r5;
        r11.mo1405a(r2, 4, 0);
        r11.mo1405a(r14, 1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01d3, code lost:
    
        if (r30.f2013I.length <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01d5, code lost:
    
        r2 = r13.f2408m;
        r4 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01df, code lost:
    
        if ("video/avc".equals(r2) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01e4, code lost:
    
        if ((r4 & 31) == 6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01f6, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01fa, code lost:
    
        r30.f2010F = r2;
        r30.f2008D += 5;
        r30.f2007C += r8;
        r4 = r19;
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x020b, code lost:
    
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01ec, code lost:
    
        if ("video/hevc".equals(r2) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01f4, code lost:
    
        if (((r4 & 126) >> 1) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01f9, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0216, code lost:
    
        throw p076T.C0666I.m1202a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0217, code lost:
    
        r19 = r4;
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x021e, code lost:
    
        if (r30.f2010F == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0220, code lost:
    
        r5 = r30.f2022h;
        r5.m1534D(r2);
        r23 = r8;
        r24 = r14;
        ((p215y0.C2400l) r31).mo631k(r5.f2786a, 0, r30.f2009E, false);
        r11.mo1405a(r5, r30.f2009E, 0);
        r2 = r30.f2009E;
        r4 = p090X.AbstractC0830g.m1670f(r5.f2786a, r5.f2788c);
        r5.m1537G("video/hevc".equals(r13.f2408m) ? 1 : 0);
        r5.m1536F(r4);
        p215y0.AbstractC2390b.m4611f(r9, r5, r30.f2013I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x025e, code lost:
    
        r30.f2008D += r2;
        r30.f2009E -= r2;
        r4 = r19;
        r5 = r22;
        r8 = r23;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0255, code lost:
    
        r23 = r8;
        r24 = r14;
        r2 = r11.mo1408d(r31, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0271, code lost:
    
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x028a, code lost:
    
        if (r3.f2002l != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x028c, code lost:
    
        r1 = r3.f1994d.f2123g[r3.f1996f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x02a4, code lost:
    
        if (r3.m1158a() == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x02a6, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x02a9, code lost:
    
        r25 = r1;
        r1 = r3.m1158a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x02af, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x02b1, code lost:
    
        r28 = r1.f2097c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x02b8, code lost:
    
        r11.mo1406b(r9, r25, r30.f2007C, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02c9, code lost:
    
        if (r12.isEmpty() != false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02cb, code lost:
    
        r1 = (p073S0.C0634l) r12.removeFirst();
        r30.f2038x -= r1.f1990c;
        r2 = r1.f1989b;
        r4 = r1.f1988a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x02dc, code lost:
    
        if (r2 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02de, code lost:
    
        r4 = r4 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x02df, code lost:
    
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x02e1, code lost:
    
        if (r29 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x02e3, code lost:
    
        r4 = r2.m1573a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x02e7, code lost:
    
        r6 = r30.f2012H;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x02eb, code lost:
    
        if (r8 >= r7) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02ed, code lost:
    
        r6[r8].mo1406b(r4, 1, r1.f1990c, r30.f2038x, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0303, code lost:
    
        r29 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x030a, code lost:
    
        if (r3.m1159b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x030c, code lost:
    
        r30.f2006B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x030f, code lost:
    
        r30.f2032r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0313, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x02b6, code lost:
    
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x029b, code lost:
    
        if (r7.f2109j[r3.f1996f] == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x029d, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x029f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0274, code lost:
    
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0276, code lost:
    
        r2 = r30.f2008D;
        r4 = r30.f2007C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x027a, code lost:
    
        if (r2 >= r4) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x027c, code lost:
    
        r30.f2008D += r11.mo1408d(r31, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0173, code lost:
    
        r9 = r7.f2108i[r3.f1996f];
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo37l(p215y0.InterfaceC2404p r31, p076T.C0706t r32) {
        /*
            Method dump skipped, instructions count: 1979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073S0.C0636n.mo37l(y0.p, T.t):int");
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
