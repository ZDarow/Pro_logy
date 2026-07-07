package p073S0;

/* renamed from: S0.q */
/* loaded from: classes.dex */
public final class C0639q implements p215y0.InterfaceC2403o, p215y0.InterfaceC2414z {

    /* renamed from: A */
    public p053N0.C0438a f2049A;

    /* renamed from: a */
    public final p083V0.InterfaceC0772j f2050a;

    /* renamed from: b */
    public final int f2051b;

    /* renamed from: c */
    public final p086W.C0798r f2052c;

    /* renamed from: d */
    public final p086W.C0798r f2053d;

    /* renamed from: e */
    public final p086W.C0798r f2054e;

    /* renamed from: f */
    public final p086W.C0798r f2055f;

    /* renamed from: g */
    public final java.util.ArrayDeque f2056g;

    /* renamed from: h */
    public final p073S0.C0641s f2057h;

    /* renamed from: i */
    public final java.util.ArrayList f2058i;

    /* renamed from: j */
    public p129f2.C1415c0 f2059j;

    /* renamed from: k */
    public int f2060k;

    /* renamed from: l */
    public int f2061l;

    /* renamed from: m */
    public long f2062m;

    /* renamed from: n */
    public int f2063n;

    /* renamed from: o */
    public p086W.C0798r f2064o;

    /* renamed from: p */
    public int f2065p;

    /* renamed from: q */
    public int f2066q;

    /* renamed from: r */
    public int f2067r;

    /* renamed from: s */
    public int f2068s;

    /* renamed from: t */
    public boolean f2069t;

    /* renamed from: u */
    public p215y0.InterfaceC2405q f2070u;

    /* renamed from: v */
    public p073S0.C0638p[] f2071v;

    /* renamed from: w */
    public long[][] f2072w;

    /* renamed from: x */
    public int f2073x;

    /* renamed from: y */
    public long f2074y;

    /* renamed from: z */
    public int f2075z;

    public C0639q(p083V0.InterfaceC0772j interfaceC0772j, int i4) {
        this.f2050a = interfaceC0772j;
        this.f2051b = i4;
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        this.f2059j = p129f2.C1415c0.f5744p;
        this.f2060k = (i4 & 4) != 0 ? 3 : 0;
        this.f2057h = new p073S0.C0641s();
        this.f2058i = new java.util.ArrayList();
        this.f2055f = new p086W.C0798r(16);
        this.f2056g = new java.util.ArrayDeque();
        this.f2052c = new p086W.C0798r(p090X.AbstractC0830g.f2960a);
        this.f2053d = new p086W.C0798r(4);
        this.f2054e = new p086W.C0798r();
        this.f2065p = -1;
        this.f2070u = p215y0.InterfaceC2405q.f9465k;
        this.f2071v = new p073S0.C0638p[0];
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        this.f2056g.clear();
        this.f2063n = 0;
        this.f2065p = -1;
        this.f2066q = 0;
        this.f2067r = 0;
        this.f2068s = 0;
        if (j4 == 0) {
            if (this.f2060k != 3) {
                this.f2060k = 0;
                this.f2063n = 0;
                return;
            } else {
                p073S0.C0641s c0641s = this.f2057h;
                c0641s.f2080a.clear();
                c0641s.f2081b = 0;
                this.f2058i.clear();
                return;
            }
        }
        for (p073S0.C0638p c0638p : this.f2071v) {
            p073S0.C0646x c0646x = c0638p.f2045b;
            int m1611f = p086W.AbstractC0805y.m1611f(c0646x.f2122f, j5, false);
            while (true) {
                if (m1611f < 0) {
                    m1611f = -1;
                    break;
                } else if ((c0646x.f2123g[m1611f] & 1) != 0) {
                    break;
                } else {
                    m1611f--;
                }
            }
            if (m1611f == -1) {
                m1611f = c0646x.m1177a(j5);
            }
            c0638p.f2048e = m1611f;
            p215y0.C2388G c2388g = c0638p.f2047d;
            if (c2388g != null) {
                c2388g.f9364b = false;
                c2388g.f9365c = 0;
            }
        }
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00df A[EDGE_INSN: B:70:0x00df->B:71:0x00df BREAK  A[LOOP:1: B:28:0x006c->B:59:0x00d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p215y0.C2413y mo32f(long r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073S0.C0639q.mo32f(long):y0.y");
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        if ((this.f2051b & 16) == 0) {
            interfaceC2405q = new android.support.v4.media.session.C1061t(interfaceC2405q, this.f2050a);
        }
        this.f2070u = interfaceC2405q;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        return this.f2074y;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: j */
    public final java.util.List mo1165j() {
        return this.f2059j;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        p129f2.C1415c0 c1415c0;
        p215y0.InterfaceC2385D m1176j = p073S0.AbstractC0642t.m1176j(interfaceC2404p, false, (this.f2051b & 2) != 0);
        if (m1176j != null) {
            c1415c0 = p129f2.AbstractC1393I.m3166o(m1176j);
        } else {
            p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
            c1415c0 = p129f2.C1415c0.f5744p;
        }
        this.f2059j = c1415c0;
        return m1176j == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0497, code lost:
    
        r3 = r10;
        r5 = r36.f2063n;
        r6 = r36.f2055f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x049f, code lost:
    
        if (r5 != 0) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04a8, code lost:
    
        if (r37.mo631k(r6.f2786a, 0, 8, r3) != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04eb, code lost:
    
        r36.f2063n = 8;
        r6.m1537G(0);
        r36.f2062m = r6.m1561w();
        r36.f2061l = r6.m1546h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0502, code lost:
    
        r10 = r36.f2062m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0508, code lost:
    
        if (r10 != 1) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x050a, code lost:
    
        r37.readFully(r6.f2786a, 8, 8);
        r36.f2063n += 8;
        r36.f2062m = r6.m1564z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0542, code lost:
    
        r10 = r36.f2062m;
        r13 = r36.f2063n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0549, code lost:
    
        if (r10 < r13) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x054b, code lost:
    
        r10 = r36.f2061l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0556, code lost:
    
        if (r10 == 1836019574) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x055b, code lost:
    
        if (r10 == 1953653099) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0560, code lost:
    
        if (r10 == 1835297121) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0565, code lost:
    
        if (r10 == 1835626086) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x056a, code lost:
    
        if (r10 == 1937007212) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x056f, code lost:
    
        if (r10 == 1701082227) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0571, code lost:
    
        if (r10 != 1835365473) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0579, code lost:
    
        if (r10 == 1835296868) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x057e, code lost:
    
        if (r10 == 1836476516) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0580, code lost:
    
        if (r10 == 1751411826) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0585, code lost:
    
        if (r10 == 1937011556) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x058a, code lost:
    
        if (r10 == 1937011827) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x058f, code lost:
    
        if (r10 == 1937011571) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0594, code lost:
    
        if (r10 == 1668576371) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0599, code lost:
    
        if (r10 == 1701606260) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x059e, code lost:
    
        if (r10 == 1937011555) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x05a3, code lost:
    
        if (r10 == 1937011578) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x05a8, code lost:
    
        if (r10 == 1937013298) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x05ad, code lost:
    
        if (r10 == 1937007471) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05b2, code lost:
    
        if (r10 == 1668232756) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05b7, code lost:
    
        if (r10 == 1953196132) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05bc, code lost:
    
        if (r10 == 1718909296) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05c1, code lost:
    
        if (r10 == 1969517665) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05c6, code lost:
    
        if (r10 == 1801812339) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05cb, code lost:
    
        if (r10 != 1768715124) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05ce, code lost:
    
        r6 = r37.mo618B();
        r10 = r36.f2063n;
        r28 = r6 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05dc, code lost:
    
        if (r36.f2061l != 1836086884) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x05de, code lost:
    
        r36.f2049A = new p053N0.C0438a(0, r28, -9223372036854775807L, r28 + r10, r36.f2062m - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05f4, code lost:
    
        r36.f2064o = null;
        r36.f2060k = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x05fa, code lost:
    
        r3 = 0;
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05fe, code lost:
    
        if (r13 != 8) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0600, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0603, code lost:
    
        p086W.AbstractC0781a.m1421j(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x060d, code lost:
    
        if (r36.f2062m > 2147483647L) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x060f, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0612, code lost:
    
        p086W.AbstractC0781a.m1421j(r7);
        r7 = new p086W.C0798r((int) r36.f2062m);
        java.lang.System.arraycopy(r6.f2786a, 0, r7.f2786a, 0, 8);
        r36.f2064o = r7;
        r36.f2060k = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0611, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0602, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x062b, code lost:
    
        r13 = r37.mo618B();
        r3 = r36.f2062m;
        r5 = r36.f2063n;
        r13 = (r13 + r3) - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0638, code lost:
    
        if (r3 == r5) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x063c, code lost:
    
        if (r36.f2061l != 1835365473) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x063e, code lost:
    
        r14.m1534D(8);
        r37.mo642z(r14.f2786a, 0, 8);
        r3 = p073S0.AbstractC0632j.f1983a;
        r3 = r14.f2787b;
        r4 = 4;
        r14.m1538H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0653, code lost:
    
        if (r14.m1546h() == 1751411826) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0655, code lost:
    
        r3 = r3 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0656, code lost:
    
        r14.m1537G(r3);
        r37.mo628e(r14.f2787b);
        r37.mo627d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0663, code lost:
    
        r12.push(new p073S0.C0623a(r13, r36.f2061l));
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0674, code lost:
    
        if (r36.f2062m != r36.f2063n) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0676, code lost:
    
        m1166m(r13);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x067b, code lost:
    
        r3 = 0;
        r36.f2060k = 0;
        r36.f2063n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0662, code lost:
    
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x068c, code lost:
    
        throw p076T.C0666I.m1204c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x051f, code lost:
    
        if (r10 != 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0521, code lost:
    
        r10 = r37.mo633n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0527, code lost:
    
        if (r10 != (-1)) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0529, code lost:
    
        r13 = (p073S0.C0623a) r12.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x052f, code lost:
    
        if (r13 == null) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0531, code lost:
    
        r10 = r13.f1952n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0535, code lost:
    
        if (r10 == (-1)) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0537, code lost:
    
        r36.f2062m = (r10 - r37.mo618B()) + r36.f2063n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x04ad, code lost:
    
        if (r36.f2075z != 2) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x04b2, code lost:
    
        if ((r36.f2051b & 2) == 0) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x04b4, code lost:
    
        r0 = r36.f2070u.mo640v(0, 4);
        r2 = r36.f2049A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04bd, code lost:
    
        if (r2 != null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x04bf, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x04cb, code lost:
    
        r2 = new p076T.C0701o();
        r2.f2368j = r13;
        p009B2.AbstractC0051h.m158q(r2, r0);
        r36.f2070u.mo637s();
        r36.f2070u.mo638t(new p002A0.C0004b(-9223372036854775807L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x04e9, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x04c1, code lost:
    
        r13 = new p076T.C0664G(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:?, code lost:
    
        return -1;
     */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo37l(p215y0.InterfaceC2404p r37, p076T.C0706t r38) {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073S0.C0639q.mo37l(y0.p, T.t):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e8, code lost:
    
        if (r0 != 1851878757) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ea, code lost:
    
        r2 = r11.m1555q(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f5, code lost:
    
        if (r0 != 1684108385) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f7, code lost:
    
        r6 = r24;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fb, code lost:
    
        r11.m1538H(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0204, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0206, code lost:
    
        if (r9 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0208, code lost:
    
        if (r2 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020b, code lost:
    
        if (r3 != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0223, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0224, code lost:
    
        r11.m1537G(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x020e, code lost:
    
        r11.m1537G(r3);
        r11.m1538H(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0220, code lost:
    
        r9 = new p049M0.C0412k(r9, r2, r11.m1555q(r6 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0229, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a7, code lost:
    
        p086W.AbstractC0781a.m1424m("MetadataUtil", "Skipped unknown metadata entry: " + p073S0.AbstractC0625c.m1135b(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ba, code lost:
    
        r11.m1537G(r12);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00cb, code lost:
    
        r0 = p049M0.AbstractC0411j.m882a(p073S0.AbstractC0642t.m1172f(r11) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00d5, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00d7, code lost:
    
        r2 = new p049M0.C0415n("TCON", null, p129f2.AbstractC1393I.m3166o(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00e9, code lost:
    
        r11.m1537G(r12);
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00e2, code lost:
    
        p086W.AbstractC0781a.m1410A("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00e8, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0102, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02e1, code lost:
    
        r11.m1537G(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02e4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00c1, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x022e, code lost:
    
        r2 = 16777215 & r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0235, code lost:
    
        if (r2 != 6516084) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0237, code lost:
    
        r9 = p073S0.AbstractC0642t.m1169c(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x023f, code lost:
    
        if (r2 == 7233901) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0244, code lost:
    
        if (r2 != 7631467) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x024b, code lost:
    
        if (r2 == 6516589) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0250, code lost:
    
        if (r2 != 7828084) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0257, code lost:
    
        if (r2 != 6578553) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0259, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0263, code lost:
    
        if (r2 != 4280916) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0265, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x026f, code lost:
    
        if (r2 != 7630703) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0271, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x027b, code lost:
    
        if (r2 != 6384738) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x027d, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0287, code lost:
    
        if (r2 != 7108978) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0289, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0293, code lost:
    
        if (r2 != 6776174) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0295, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x029d, code lost:
    
        if (r2 != 6779504) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x029f, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02bf, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02c7, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e5, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02ec, code lost:
    
        if (r5.isEmpty() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02ef, code lost:
    
        r9 = new p076T.C0664G(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        r11.m1537G(r3);
        r3 = r3 + r14;
        r11.m1538H(r2);
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r12 = r11.f2787b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r12 >= r3) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r12 = r11.m1546h() + r12;
        r9 = r11.m1546h();
        r2 = (r9 >> 24) & 255;
        r29 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r2 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r2 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r9 != 1735291493) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f6, code lost:
    
        if (r9 != 1684632427) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        r9 = p073S0.AbstractC0642t.m1171e(r9, r11, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        r11.m1537G(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02cf, code lost:
    
        if (r9 == null) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02d1, code lost:
    
        r5.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02d4, code lost:
    
        r3 = r29;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (r9 != 1953655662) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
    
        r9 = p073S0.AbstractC0642t.m1171e(r9, r11, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        if (r9 != 1953329263) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        r9 = p073S0.AbstractC0642t.m1173g(r9, "TBPM", r11, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0122, code lost:
    
        if (r9 != 1668311404) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0124, code lost:
    
        r9 = p073S0.AbstractC0642t.m1173g(r9, "TCMP", r11, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
    
        if (r9 != 1668249202) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
    
        r9 = p073S0.AbstractC0642t.m1170d(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
    
        if (r9 != 1631670868) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013b, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (r9 != 1936682605) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0147, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0151, code lost:
    
        if (r9 != 1936679276) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015d, code lost:
    
        if (r9 != 1936679282) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015f, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
    
        if (r9 != 1936679265) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0175, code lost:
    
        if (r9 != 1936679791) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0181, code lost:
    
        if (r9 != 1920233063) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
    
        r9 = p073S0.AbstractC0642t.m1173g(r9, "ITUNESADVISORY", r11, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018f, code lost:
    
        if (r9 != 1885823344) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0191, code lost:
    
        r9 = p073S0.AbstractC0642t.m1173g(r9, "ITUNESGAPLESS", r11, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019e, code lost:
    
        if (r9 != 1936683886) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a0, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
    
        if (r9 != 1953919848) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ad, code lost:
    
        r9 = p073S0.AbstractC0642t.m1175i(r9, r11, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b8, code lost:
    
        if (r9 != 757935405) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ba, code lost:
    
        r2 = null;
        r9 = null;
        r3 = -1;
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01be, code lost:
    
        r14 = r11.f2787b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c0, code lost:
    
        if (r14 >= r12) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c2, code lost:
    
        r24 = r11.m1546h();
        r0 = r11.m1546h();
        r11.m1538H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d3, code lost:
    
        if (r0 != 1835360622) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d5, code lost:
    
        r9 = r11.m1555q(r24 - 12);
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0200, code lost:
    
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e1, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0698 A[EDGE_INSN: B:362:0x0698->B:363:0x0698 BREAK  A[LOOP:10: B:285:0x0558->B:291:0x068e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06ba A[LOOP:13: B:364:0x06b7->B:366:0x06ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0535  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1166m(long r36) {
        /*
            Method dump skipped, instructions count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073S0.C0639q.m1166m(long):void");
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
