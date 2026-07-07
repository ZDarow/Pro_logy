package p069R0;

/* renamed from: R0.d */
/* loaded from: classes.dex */
public final class C0574d implements p215y0.InterfaceC2403o {

    /* renamed from: u */
    public static final p011C.C0111c f1783u = new p011C.C0111c(6);

    /* renamed from: a */
    public final int f1784a;

    /* renamed from: b */
    public final long f1785b;

    /* renamed from: c */
    public final p086W.C0798r f1786c;

    /* renamed from: d */
    public final p215y0.C2412x f1787d;

    /* renamed from: e */
    public final p215y0.C2409u f1788e;

    /* renamed from: f */
    public final p118d1.C1272a f1789f;

    /* renamed from: g */
    public final p215y0.C2402n f1790g;

    /* renamed from: h */
    public p215y0.InterfaceC2405q f1791h;

    /* renamed from: i */
    public p215y0.InterfaceC2387F f1792i;

    /* renamed from: j */
    public p215y0.InterfaceC2387F f1793j;

    /* renamed from: k */
    public int f1794k;

    /* renamed from: l */
    public p076T.C0664G f1795l;

    /* renamed from: m */
    public long f1796m;

    /* renamed from: n */
    public long f1797n;

    /* renamed from: o */
    public long f1798o;

    /* renamed from: p */
    public int f1799p;

    /* renamed from: q */
    public p069R0.InterfaceC0576f f1800q;

    /* renamed from: r */
    public boolean f1801r;

    /* renamed from: s */
    public boolean f1802s;

    /* renamed from: t */
    public long f1803t;

    public C0574d(int i4) {
        this(-9223372036854775807L, i4);
    }

    /* renamed from: a */
    public static long m1097a(p076T.C0664G c0664g) {
        if (c0664g == null) {
            return -9223372036854775807L;
        }
        int m1189g = c0664g.m1189g();
        for (int i4 = 0; i4 < m1189g; i4++) {
            p076T.InterfaceC0663F m1188f = c0664g.m1188f(i4);
            if (m1188f instanceof p049M0.C0415n) {
                p049M0.C0415n c0415n = (p049M0.C0415n) m1188f;
                if (c0415n.f1181l.equals("TLEN")) {
                    return p086W.AbstractC0805y.m1592M(java.lang.Long.parseLong((java.lang.String) c0415n.f1194n.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        this.f1794k = 0;
        this.f1796m = -9223372036854775807L;
        this.f1797n = 0L;
        this.f1799p = 0;
        this.f1803t = j5;
        p069R0.InterfaceC0576f interfaceC0576f = this.f1800q;
        if (!(interfaceC0576f instanceof p069R0.C0572b) || ((p069R0.C0572b) interfaceC0576f).m1095b(j5)) {
            return;
        }
        this.f1802s = true;
        this.f1793j = this.f1790g;
    }

    /* renamed from: c */
    public final boolean m1098c(p215y0.C2400l c2400l) {
        p069R0.InterfaceC0576f interfaceC0576f = this.f1800q;
        if (interfaceC0576f != null) {
            long mo1093e = interfaceC0576f.mo1093e();
            if (mo1093e != -1 && c2400l.mo641w() > mo1093e - 4) {
                return true;
            }
        }
        try {
            return !c2400l.mo634p(this.f1786c.f2786a, 0, 4, true);
        } catch (java.io.EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        if (r19 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        r18.mo628e(r4 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        r17.f1794k = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
    
        r18.f9452q = 0;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1099e(p215y0.C2400l r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r3 = 0
            r1.f9452q = r3
            long r4 = r1.f9450o
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L3f
            int r4 = r0.f1784a
            r4 = r4 & 8
            if (r4 != 0) goto L20
            r4 = r5
            goto L22
        L20:
            C.c r4 = p069R0.C0574d.f1783u
        L22:
            d1.a r6 = r0.f1789f
            T.G r4 = r6.m3004a(r1, r4)
            r0.f1795l = r4
            if (r4 == 0) goto L31
            y0.u r6 = r0.f1788e
            r6.m4644b(r4)
        L31:
            long r6 = r18.mo641w()
            int r4 = (int) r6
            if (r19 != 0) goto L3b
            r1.mo628e(r4)
        L3b:
            r6 = r3
        L3c:
            r7 = r6
            r8 = r7
            goto L42
        L3f:
            r4 = r3
            r6 = r4
            goto L3c
        L42:
            boolean r9 = r17.m1098c(r18)
            r10 = 1
            if (r9 == 0) goto L52
            if (r7 <= 0) goto L4c
            goto L9f
        L4c:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L52:
            W.r r9 = r0.f1786c
            r9.m1537G(r3)
            int r9 = r9.m1546h()
            if (r6 == 0) goto L6b
            long r11 = (long) r6
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r9
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L72
        L6b:
            int r11 = p215y0.AbstractC2390b.m4615j(r9)
            r12 = -1
            if (r11 != r12) goto L91
        L72:
            int r6 = r8 + 1
            if (r8 != r2) goto L80
            if (r19 == 0) goto L79
            return r3
        L79:
            java.lang.String r1 = "Searched too many bytes."
            T.I r1 = p076T.C0666I.m1202a(r5, r1)
            throw r1
        L80:
            if (r19 == 0) goto L8a
            r1.f9452q = r3
            int r7 = r4 + r6
            r1.m4631a(r7, r3)
            goto L8d
        L8a:
            r1.mo628e(r10)
        L8d:
            r7 = r3
            r8 = r6
            r6 = r7
            goto L42
        L91:
            int r7 = r7 + 1
            if (r7 != r10) goto L9c
            y0.x r6 = r0.f1787d
            r6.m4646a(r9)
            r6 = r9
            goto Lab
        L9c:
            r9 = 4
            if (r7 != r9) goto Lab
        L9f:
            if (r19 == 0) goto La6
            int r4 = r4 + r8
            r1.mo628e(r4)
            goto La8
        La6:
            r1.f9452q = r3
        La8:
            r0.f1794k = r6
            return r10
        Lab:
            int r11 = r11 + (-4)
            r1.m4631a(r11, r3)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: p069R0.C0574d.m1099e(y0.l, boolean):boolean");
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f1791h = interfaceC2405q;
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(0, 1);
        this.f1792i = mo640v;
        this.f1793j = mo640v;
        this.f1791h.mo637s();
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        return m1099e((p215y0.C2400l) interfaceC2404p, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r6 != 1231971951) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038d  */
    /* JADX WARN: Type inference failed for: r0v41, types: [A0.b] */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo37l(p215y0.InterfaceC2404p r51, p076T.C0706t r52) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p069R0.C0574d.mo37l(y0.p, T.t):int");
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [y0.x, java.lang.Object] */
    public C0574d(long j4, int i4) {
        this.f1784a = (i4 & 2) != 0 ? i4 | 1 : i4;
        this.f1785b = j4;
        this.f1786c = new p086W.C0798r(10);
        this.f1787d = new java.lang.Object();
        this.f1788e = new p215y0.C2409u();
        this.f1796m = -9223372036854775807L;
        this.f1789f = new p118d1.C1272a(1);
        p215y0.C2402n c2402n = new p215y0.C2402n();
        this.f1790g = c2402n;
        this.f1793j = c2402n;
    }
}
