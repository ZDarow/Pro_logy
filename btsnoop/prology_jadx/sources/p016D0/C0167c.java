package p016D0;

/* renamed from: D0.c */
/* loaded from: classes.dex */
public final class C0167c implements p215y0.InterfaceC2403o {

    /* renamed from: e */
    public p215y0.InterfaceC2405q f437e;

    /* renamed from: f */
    public p215y0.InterfaceC2387F f438f;

    /* renamed from: h */
    public p076T.C0664G f440h;

    /* renamed from: i */
    public p215y0.C2407s f441i;

    /* renamed from: j */
    public int f442j;

    /* renamed from: k */
    public int f443k;

    /* renamed from: l */
    public p016D0.C0166b f444l;

    /* renamed from: m */
    public int f445m;

    /* renamed from: n */
    public long f446n;

    /* renamed from: a */
    public final byte[] f433a = new byte[42];

    /* renamed from: b */
    public final p086W.C0798r f434b = new p086W.C0798r(new byte[32768], 0);

    /* renamed from: c */
    public final boolean f435c = false;

    /* renamed from: d */
    public final p076T.C0706t f436d = new java.lang.Object();

    /* renamed from: g */
    public int f439g = 0;

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        if (j4 == 0) {
            this.f439g = 0;
        } else {
            p016D0.C0166b c0166b = this.f444l;
            if (c0166b != null) {
                c0166b.m528d(j5);
            }
        }
        this.f446n = j5 != 0 ? -1L : 0L;
        this.f445m = 0;
        this.f434b.m1534D(0);
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f437e = interfaceC2405q;
        this.f438f = interfaceC2405q.mo640v(0, 1);
        interfaceC2405q.mo637s();
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
        p076T.C0664G m3004a = new p118d1.C1272a(1).m3004a(c2400l, p049M0.C0409h.f1179b);
        if (m3004a != null) {
            int length = m3004a.f2198l.length;
        }
        p086W.C0798r c0798r = new p086W.C0798r(4);
        c2400l.mo634p(c0798r.f2786a, 0, 4, false);
        return c0798r.m1561w() == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        p215y0.C2407s c2407s;
        p215y0.InterfaceC2414z c0004b;
        long j4;
        boolean z4;
        long j5;
        boolean z5;
        boolean z6 = true;
        int i4 = this.f439g;
        p076T.C0664G c0664g = null;
        if (i4 == 0) {
            ((p215y0.C2400l) interfaceC2404p).f9452q = 0;
            p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
            long mo641w = c2400l.mo641w();
            p076T.C0664G m3004a = new p118d1.C1272a(1).m3004a(c2400l, !this.f435c ? null : p049M0.C0409h.f1179b);
            if (m3004a != null && m3004a.f2198l.length != 0) {
                c0664g = m3004a;
            }
            c2400l.mo628e((int) (c2400l.mo641w() - mo641w));
            this.f440h = c0664g;
            this.f439g = 1;
            return 0;
        }
        byte[] bArr = this.f433a;
        if (i4 == 1) {
            ((p215y0.C2400l) interfaceC2404p).mo634p(bArr, 0, bArr.length, false);
            ((p215y0.C2400l) interfaceC2404p).f9452q = 0;
            this.f439g = 2;
            return 0;
        }
        int i5 = 3;
        if (i4 == 2) {
            p086W.C0798r c0798r = new p086W.C0798r(4);
            ((p215y0.C2400l) interfaceC2404p).mo631k(c0798r.f2786a, 0, 4, false);
            if (c0798r.m1561w() != 1716281667) {
                throw p076T.C0666I.m1202a(null, "Failed to read FLAC stream marker.");
            }
            this.f439g = 3;
            return 0;
        }
        if (i4 == 3) {
            ?? r12 = 0;
            p215y0.C2407s c2407s2 = this.f441i;
            boolean z7 = false;
            while (!z7) {
                ((p215y0.C2400l) interfaceC2404p).f9452q = r12;
                byte[] bArr2 = new byte[4];
                p086W.C0797q c0797q = new p086W.C0797q(bArr2, 4);
                p215y0.C2400l c2400l2 = (p215y0.C2400l) interfaceC2404p;
                c2400l2.mo634p(bArr2, r12, 4, r12);
                boolean m1517h = c0797q.m1517h();
                int m1518i = c0797q.m1518i(r9);
                int m1518i2 = c0797q.m1518i(24) + 4;
                if (m1518i == 0) {
                    byte[] bArr3 = new byte[38];
                    c2400l2.mo631k(bArr3, r12, 38, r12);
                    c2407s = new p215y0.C2407s(bArr3, 4);
                } else {
                    if (c2407s2 == null) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    if (m1518i == i5) {
                        p086W.C0798r c0798r2 = new p086W.C0798r(m1518i2);
                        c2400l2.mo631k(c0798r2.f2786a, 0, m1518i2, false);
                        c2407s = new p215y0.C2407s(c2407s2.f9466a, c2407s2.f9467b, c2407s2.f9468c, c2407s2.f9469d, c2407s2.f9470e, c2407s2.f9472g, c2407s2.f9473h, c2407s2.f9475j, p215y0.AbstractC2390b.m4626u(c0798r2), c2407s2.f9477l);
                    } else {
                        p076T.C0664G c0664g2 = c2407s2.f9477l;
                        if (m1518i == 4) {
                            p086W.C0798r c0798r3 = new p086W.C0798r(m1518i2);
                            c2400l2.mo631k(c0798r3.f2786a, 0, m1518i2, false);
                            c0798r3.m1538H(4);
                            p076T.C0664G m4624s = p215y0.AbstractC2390b.m4624s(java.util.Arrays.asList((java.lang.String[]) p215y0.AbstractC2390b.m4627v(c0798r3, false, false).f9102l));
                            if (c0664g2 != null) {
                                m4624s = c0664g2.m1187e(m4624s);
                            }
                            c2407s = new p215y0.C2407s(c2407s2.f9466a, c2407s2.f9467b, c2407s2.f9468c, c2407s2.f9469d, c2407s2.f9470e, c2407s2.f9472g, c2407s2.f9473h, c2407s2.f9475j, c2407s2.f9476k, m4624s);
                        } else if (m1518i == 6) {
                            p086W.C0798r c0798r4 = new p086W.C0798r(m1518i2);
                            c2400l2.mo631k(c0798r4.f2786a, 0, m1518i2, false);
                            c0798r4.m1538H(4);
                            p076T.C0664G c0664g3 = new p076T.C0664G(p129f2.AbstractC1393I.m3166o(p041K0.C0322a.m716d(c0798r4)));
                            if (c0664g2 != null) {
                                c0664g3 = c0664g2.m1187e(c0664g3);
                            }
                            c2407s = new p215y0.C2407s(c2407s2.f9466a, c2407s2.f9467b, c2407s2.f9468c, c2407s2.f9469d, c2407s2.f9470e, c2407s2.f9472g, c2407s2.f9473h, c2407s2.f9475j, c2407s2.f9476k, c0664g3);
                        } else {
                            c2400l2.mo628e(m1518i2);
                            int i6 = p086W.AbstractC0805y.f2801a;
                            this.f441i = c2407s2;
                            z7 = m1517h;
                            r12 = 0;
                            i5 = 3;
                            r9 = 7;
                        }
                    }
                }
                c2407s2 = c2407s;
                int i62 = p086W.AbstractC0805y.f2801a;
                this.f441i = c2407s2;
                z7 = m1517h;
                r12 = 0;
                i5 = 3;
                r9 = 7;
            }
            this.f441i.getClass();
            this.f442j = java.lang.Math.max(this.f441i.f9468c, 6);
            p215y0.InterfaceC2387F interfaceC2387F = this.f438f;
            int i7 = p086W.AbstractC0805y.f2801a;
            interfaceC2387F.mo1407c(this.f441i.m4642c(bArr, this.f440h));
            this.f439g = 4;
            return 0;
        }
        long j6 = 0;
        if (i4 == 4) {
            ((p215y0.C2400l) interfaceC2404p).f9452q = 0;
            p086W.C0798r c0798r5 = new p086W.C0798r(2);
            p215y0.C2400l c2400l3 = (p215y0.C2400l) interfaceC2404p;
            c2400l3.mo634p(c0798r5.f2786a, 0, 2, false);
            int m1531A = c0798r5.m1531A();
            if ((m1531A >> 2) != 16382) {
                c2400l3.f9452q = 0;
                throw p076T.C0666I.m1202a(null, "First frame does not start with sync code.");
            }
            c2400l3.f9452q = 0;
            this.f443k = m1531A;
            p215y0.InterfaceC2405q interfaceC2405q = this.f437e;
            int i8 = p086W.AbstractC0805y.f2801a;
            long j7 = c2400l3.f9450o;
            this.f441i.getClass();
            p215y0.C2407s c2407s3 = this.f441i;
            if (c2407s3.f9476k != null) {
                c0004b = new p002A0.C0004b(c2407s3, j7, 1);
            } else {
                long j8 = c2400l3.f9449n;
                if (j8 == -1 || c2407s3.f9475j <= 0) {
                    c0004b = new p002A0.C0004b(c2407s3.m4641b());
                } else {
                    int i9 = this.f443k;
                    p009B2.C0067x c0067x = new p009B2.C0067x(1, c2407s3);
                    p016D0.C0165a c0165a = new p016D0.C0165a(c2407s3, i9);
                    long m4641b = c2407s3.m4641b();
                    int i10 = c2407s3.f9468c;
                    int i11 = c2407s3.f9469d;
                    if (i11 > 0) {
                        j4 = ((i11 + i10) / 2) + 1;
                    } else {
                        int i12 = c2407s3.f9467b;
                        int i13 = c2407s3.f9466a;
                        j4 = (((((i13 != i12 || i13 <= 0) ? 4096L : i13) * c2407s3.f9472g) * c2407s3.f9473h) / 8) + 64;
                    }
                    p016D0.C0166b c0166b = new p016D0.C0166b(c0067x, c0165a, m4641b, c2407s3.f9475j, j7, j8, j4, java.lang.Math.max(6, i10));
                    this.f444l = c0166b;
                    c0004b = c0166b.f429a;
                }
            }
            interfaceC2405q.mo638t(c0004b);
            this.f439g = 5;
            return 0;
        }
        if (i4 != 5) {
            throw new java.lang.IllegalStateException();
        }
        this.f438f.getClass();
        this.f441i.getClass();
        p016D0.C0166b c0166b2 = this.f444l;
        if (c0166b2 != null && c0166b2.f431c != null) {
            return c0166b2.m527b((p215y0.C2400l) interfaceC2404p, c0706t);
        }
        if (this.f446n == -1) {
            p215y0.C2407s c2407s4 = this.f441i;
            ((p215y0.C2400l) interfaceC2404p).f9452q = 0;
            p215y0.C2400l c2400l4 = (p215y0.C2400l) interfaceC2404p;
            c2400l4.m4631a(1, false);
            byte[] bArr4 = new byte[1];
            c2400l4.mo634p(bArr4, 0, 1, false);
            boolean z8 = (bArr4[0] & 1) == 1;
            c2400l4.m4631a(2, false);
            r9 = z8 ? 7 : 6;
            p086W.C0798r c0798r6 = new p086W.C0798r(r9);
            byte[] bArr5 = c0798r6.f2786a;
            int i14 = 0;
            while (i14 < r9) {
                int m4633f = c2400l4.m4633f(bArr5, i14, r9 - i14);
                if (m4633f == -1) {
                    break;
                }
                i14 += m4633f;
            }
            c0798r6.m1536F(i14);
            c2400l4.f9452q = 0;
            try {
                long m1532B = c0798r6.m1532B();
                if (!z8) {
                    m1532B *= c2407s4.f9467b;
                }
                j6 = m1532B;
            } catch (java.lang.NumberFormatException unused) {
                z6 = false;
            }
            if (!z6) {
                throw p076T.C0666I.m1202a(null, null);
            }
            this.f446n = j6;
            return 0;
        }
        p086W.C0798r c0798r7 = this.f434b;
        int i15 = c0798r7.f2788c;
        if (i15 < 32768) {
            int read = ((p215y0.C2400l) interfaceC2404p).read(c0798r7.f2786a, i15, 32768 - i15);
            z4 = read == -1;
            if (!z4) {
                c0798r7.m1536F(i15 + read);
            } else if (c0798r7.m1539a() == 0) {
                long j9 = this.f446n * 1000000;
                p215y0.C2407s c2407s5 = this.f441i;
                int i16 = p086W.AbstractC0805y.f2801a;
                this.f438f.mo1406b(j9 / c2407s5.f9470e, 1, this.f445m, 0, null);
                return -1;
            }
        } else {
            z4 = false;
        }
        int i17 = c0798r7.f2787b;
        int i18 = this.f445m;
        int i19 = this.f442j;
        if (i18 < i19) {
            c0798r7.m1538H(java.lang.Math.min(i19 - i18, c0798r7.m1539a()));
        }
        this.f441i.getClass();
        int i20 = c0798r7.f2787b;
        while (true) {
            int i21 = c0798r7.f2788c - 16;
            p076T.C0706t c0706t2 = this.f436d;
            if (i20 <= i21) {
                c0798r7.m1537G(i20);
                if (p215y0.AbstractC2390b.m4609d(c0798r7, this.f441i, this.f443k, c0706t2)) {
                    c0798r7.m1537G(i20);
                    j5 = c0706t2.f2437a;
                    break;
                }
                i20++;
            } else {
                if (z4) {
                    while (true) {
                        int i22 = c0798r7.f2788c;
                        if (i20 > i22 - this.f442j) {
                            c0798r7.m1537G(i22);
                            break;
                        }
                        c0798r7.m1537G(i20);
                        try {
                            z5 = p215y0.AbstractC2390b.m4609d(c0798r7, this.f441i, this.f443k, c0706t2);
                        } catch (java.lang.IndexOutOfBoundsException unused2) {
                            z5 = false;
                        }
                        if (c0798r7.f2787b > c0798r7.f2788c) {
                            z5 = false;
                        }
                        if (z5) {
                            c0798r7.m1537G(i20);
                            j5 = c0706t2.f2437a;
                            break;
                        }
                        i20++;
                    }
                } else {
                    c0798r7.m1537G(i20);
                }
                j5 = -1;
            }
        }
        int i23 = c0798r7.f2787b - i17;
        c0798r7.m1537G(i17);
        this.f438f.mo1405a(c0798r7, i23, 0);
        int i24 = i23 + this.f445m;
        this.f445m = i24;
        if (j5 != -1) {
            long j10 = this.f446n * 1000000;
            p215y0.C2407s c2407s6 = this.f441i;
            int i25 = p086W.AbstractC0805y.f2801a;
            this.f438f.mo1406b(j10 / c2407s6.f9470e, 1, i24, 0, null);
            this.f445m = 0;
            this.f446n = j5;
        }
        if (c0798r7.m1539a() >= 16) {
            return 0;
        }
        int m1539a = c0798r7.m1539a();
        byte[] bArr6 = c0798r7.f2786a;
        java.lang.System.arraycopy(bArr6, c0798r7.f2787b, bArr6, 0, m1539a);
        c0798r7.m1537G(0);
        c0798r7.m1536F(m1539a);
        return 0;
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
