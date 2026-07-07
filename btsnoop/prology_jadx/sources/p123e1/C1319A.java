package p123e1;

/* renamed from: e1.A */
/* loaded from: classes.dex */
public final class C1319A implements p215y0.InterfaceC2403o {

    /* renamed from: e */
    public boolean f5291e;

    /* renamed from: f */
    public boolean f5292f;

    /* renamed from: g */
    public boolean f5293g;

    /* renamed from: h */
    public long f5294h;

    /* renamed from: i */
    public p016D0.C0166b f5295i;

    /* renamed from: j */
    public p215y0.InterfaceC2405q f5296j;

    /* renamed from: k */
    public boolean f5297k;

    /* renamed from: a */
    public final p086W.C0803w f5287a = new p086W.C0803w(0);

    /* renamed from: c */
    public final p086W.C0798r f5289c = new p086W.C0798r(4096);

    /* renamed from: b */
    public final android.util.SparseArray f5288b = new android.util.SparseArray();

    /* renamed from: d */
    public final p123e1.C1351y f5290d = new p123e1.C1351y(0);

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        long j6;
        p086W.C0803w c0803w = this.f5287a;
        synchronized (c0803w) {
            j6 = c0803w.f2797b;
        }
        boolean z4 = j6 == -9223372036854775807L;
        if (!z4) {
            long m1576d = c0803w.m1576d();
            z4 = (m1576d == -9223372036854775807L || m1576d == 0 || m1576d == j5) ? false : true;
        }
        if (z4) {
            c0803w.m1578f(j5);
        }
        p016D0.C0166b c0166b = this.f5295i;
        if (c0166b != null) {
            c0166b.m528d(j5);
        }
        int i4 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f5288b;
            if (i4 >= sparseArray.size()) {
                return;
            }
            p123e1.C1352z c1352z = (p123e1.C1352z) sparseArray.valueAt(i4);
            c1352z.f5624f = false;
            c1352z.f5619a.mo3089b();
            i4++;
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f5296j = interfaceC2405q;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        byte[] bArr = new byte[14];
        p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
        c2400l.mo634p(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c2400l.m4631a(bArr[13] & 7, false);
        c2400l.mo634p(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX WARN: Type inference failed for: r4v32, types: [y0.g, java.lang.Object] */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        int i4;
        long j4;
        p123e1.InterfaceC1335i interfaceC1335i;
        long j5;
        long j6;
        p086W.AbstractC0781a.m1422k(this.f5296j);
        long j7 = ((p215y0.C2400l) interfaceC2404p).f9449n;
        int i5 = (j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1));
        int i6 = 1;
        p123e1.C1351y c1351y = this.f5290d;
        if (i5 != 0 && !c1351y.f5613d) {
            boolean z4 = c1351y.f5615f;
            p086W.C0798r c0798r = c1351y.f5612c;
            if (!z4) {
                p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
                long j8 = c2400l.f9449n;
                int min = (int) java.lang.Math.min(20000L, j8);
                long j9 = j8 - min;
                if (c2400l.f9450o != j9) {
                    c0706t.f2437a = j9;
                } else {
                    c0798r.m1534D(min);
                    c2400l.f9452q = 0;
                    c2400l.mo634p(c0798r.f2786a, 0, min, false);
                    int i7 = c0798r.f2787b;
                    int i8 = c0798r.f2788c - 4;
                    while (true) {
                        if (i8 < i7) {
                            j6 = -9223372036854775807L;
                            break;
                        }
                        if (p123e1.C1351y.m3109b(c0798r.f2786a, i8) == 442) {
                            c0798r.m1537G(i8 + 4);
                            j6 = p123e1.C1351y.m3110c(c0798r);
                            if (j6 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i8--;
                    }
                    c1351y.f5617h = j6;
                    c1351y.f5615f = true;
                    i6 = 0;
                }
            } else {
                if (c1351y.f5617h == -9223372036854775807L) {
                    c1351y.m3111a((p215y0.C2400l) interfaceC2404p);
                    return 0;
                }
                if (c1351y.f5614e) {
                    long j10 = c1351y.f5616g;
                    if (j10 == -9223372036854775807L) {
                        c1351y.m3111a((p215y0.C2400l) interfaceC2404p);
                        return 0;
                    }
                    p086W.C0803w c0803w = c1351y.f5611b;
                    c1351y.f5618i = c0803w.m1575c(c1351y.f5617h) - c0803w.m1574b(j10);
                    c1351y.m3111a((p215y0.C2400l) interfaceC2404p);
                    return 0;
                }
                p215y0.C2400l c2400l2 = (p215y0.C2400l) interfaceC2404p;
                int min2 = (int) java.lang.Math.min(20000L, c2400l2.f9449n);
                long j11 = 0;
                if (c2400l2.f9450o != j11) {
                    c0706t.f2437a = j11;
                } else {
                    c0798r.m1534D(min2);
                    c2400l2.f9452q = 0;
                    c2400l2.mo634p(c0798r.f2786a, 0, min2, false);
                    int i9 = c0798r.f2787b;
                    int i10 = c0798r.f2788c;
                    while (true) {
                        if (i9 >= i10 - 3) {
                            j5 = -9223372036854775807L;
                            break;
                        }
                        if (p123e1.C1351y.m3109b(c0798r.f2786a, i9) == 442) {
                            c0798r.m1537G(i9 + 4);
                            j5 = p123e1.C1351y.m3110c(c0798r);
                            if (j5 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i9++;
                    }
                    c1351y.f5616g = j5;
                    c1351y.f5614e = true;
                    i6 = 0;
                }
            }
            return i6;
        }
        if (this.f5297k) {
            i4 = i5;
            j4 = j7;
        } else {
            this.f5297k = true;
            long j12 = c1351y.f5618i;
            if (j12 != -9223372036854775807L) {
                i4 = i5;
                j4 = j7;
                p016D0.C0166b c0166b = new p016D0.C0166b(new java.lang.Object(), new p094Y.C0886x(c1351y.f5611b), j12, j12 + 1, 0L, j7, 188L, 1000);
                this.f5295i = c0166b;
                this.f5296j.mo638t(c0166b.f429a);
            } else {
                i4 = i5;
                j4 = j7;
                this.f5296j.mo638t(new p002A0.C0004b(j12));
            }
        }
        p016D0.C0166b c0166b2 = this.f5295i;
        if (c0166b2 != null && c0166b2.f431c != null) {
            return c0166b2.m527b((p215y0.C2400l) interfaceC2404p, c0706t);
        }
        p215y0.C2400l c2400l3 = (p215y0.C2400l) interfaceC2404p;
        c2400l3.f9452q = 0;
        long mo641w = i4 != 0 ? j4 - c2400l3.mo641w() : -1L;
        if (mo641w != -1 && mo641w < 4) {
            return -1;
        }
        p086W.C0798r c0798r2 = this.f5289c;
        if (!c2400l3.mo634p(c0798r2.f2786a, 0, 4, true)) {
            return -1;
        }
        c0798r2.m1537G(0);
        int m1546h = c0798r2.m1546h();
        if (m1546h == 441) {
            return -1;
        }
        if (m1546h == 442) {
            c2400l3.mo634p(c0798r2.f2786a, 0, 10, false);
            c0798r2.m1537G(9);
            c2400l3.mo628e((c0798r2.m1559u() & 7) + 14);
            return 0;
        }
        if (m1546h == 443) {
            c2400l3.mo634p(c0798r2.f2786a, 0, 2, false);
            c0798r2.m1537G(0);
            c2400l3.mo628e(c0798r2.m1531A() + 6);
            return 0;
        }
        if (((m1546h & (-256)) >> 8) != 1) {
            c2400l3.mo628e(1);
            return 0;
        }
        int i11 = m1546h & 255;
        android.util.SparseArray sparseArray = this.f5288b;
        p123e1.C1352z c1352z = (p123e1.C1352z) sparseArray.get(i11);
        if (!this.f5291e) {
            if (c1352z == null) {
                if (i11 == 189) {
                    interfaceC1335i = new p123e1.C1328b();
                    this.f5292f = true;
                    this.f5294h = c2400l3.f9450o;
                } else if ((m1546h & 224) == 192) {
                    interfaceC1335i = new p123e1.C1347u(null, 0);
                    this.f5292f = true;
                    this.f5294h = c2400l3.f9450o;
                } else if ((m1546h & 240) == 224) {
                    interfaceC1335i = new p123e1.C1337k(null);
                    this.f5293g = true;
                    this.f5294h = c2400l3.f9450o;
                } else {
                    interfaceC1335i = null;
                }
                if (interfaceC1335i != null) {
                    interfaceC1335i.mo3092f(this.f5296j, new p123e1.C1325G(i11, 256));
                    c1352z = new p123e1.C1352z(interfaceC1335i, this.f5287a);
                    sparseArray.put(i11, c1352z);
                }
            }
            if (c2400l3.f9450o > ((this.f5292f && this.f5293g) ? this.f5294h + 8192 : 1048576L)) {
                this.f5291e = true;
                this.f5296j.mo637s();
            }
        }
        c2400l3.mo634p(c0798r2.f2786a, 0, 2, false);
        c0798r2.m1537G(0);
        int m1531A = c0798r2.m1531A() + 6;
        if (c1352z == null) {
            c2400l3.mo628e(m1531A);
        } else {
            c0798r2.m1534D(m1531A);
            c2400l3.mo631k(c0798r2.f2786a, 0, m1531A, false);
            c0798r2.m1537G(6);
            p086W.C0797q c0797q = c1352z.f5621c;
            c0798r2.m1544f(c0797q.f2781d, 0, 3);
            c0797q.m1526q(0);
            c0797q.m1529t(8);
            c1352z.f5622d = c0797q.m1517h();
            c1352z.f5623e = c0797q.m1517h();
            c0797q.m1529t(6);
            c0798r2.m1544f(c0797q.f2781d, 0, c0797q.m1518i(8));
            c0797q.m1526q(0);
            c1352z.f5625g = 0L;
            if (c1352z.f5622d) {
                c0797q.m1529t(4);
                c0797q.m1529t(1);
                c0797q.m1529t(1);
                long m1518i = (c0797q.m1518i(3) << 30) | (c0797q.m1518i(15) << 15) | c0797q.m1518i(15);
                c0797q.m1529t(1);
                boolean z5 = c1352z.f5624f;
                p086W.C0803w c0803w2 = c1352z.f5620b;
                if (!z5 && c1352z.f5623e) {
                    c0797q.m1529t(4);
                    c0797q.m1529t(1);
                    c0797q.m1529t(1);
                    c0797q.m1529t(1);
                    c0803w2.m1574b((c0797q.m1518i(3) << 30) | (c0797q.m1518i(15) << 15) | c0797q.m1518i(15));
                    c1352z.f5624f = true;
                }
                c1352z.f5625g = c0803w2.m1574b(m1518i);
            }
            long j13 = c1352z.f5625g;
            p123e1.InterfaceC1335i interfaceC1335i2 = c1352z.f5619a;
            interfaceC1335i2.mo3093g(j13, 4);
            interfaceC1335i2.mo3090d(c0798r2);
            interfaceC1335i2.mo3091e(false);
            c0798r2.m1536F(c0798r2.f2786a.length);
        }
        return 0;
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
