package p123e1;

/* renamed from: e1.E */
/* loaded from: classes.dex */
public final class C1323E implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final int f5307a;

    /* renamed from: b */
    public final int f5308b;

    /* renamed from: c */
    public final java.util.List f5309c;

    /* renamed from: d */
    public final p086W.C0798r f5310d;

    /* renamed from: e */
    public final android.util.SparseIntArray f5311e;

    /* renamed from: f */
    public final p123e1.C1332f f5312f;

    /* renamed from: g */
    public final p083V0.InterfaceC0772j f5313g;

    /* renamed from: h */
    public final android.util.SparseArray f5314h;

    /* renamed from: i */
    public final android.util.SparseBooleanArray f5315i;

    /* renamed from: j */
    public final android.util.SparseBooleanArray f5316j;

    /* renamed from: k */
    public final p123e1.C1351y f5317k;

    /* renamed from: l */
    public p016D0.C0166b f5318l;

    /* renamed from: m */
    public p215y0.InterfaceC2405q f5319m;

    /* renamed from: n */
    public int f5320n;

    /* renamed from: o */
    public boolean f5321o;

    /* renamed from: p */
    public boolean f5322p;

    /* renamed from: q */
    public boolean f5323q;

    /* renamed from: r */
    public p123e1.InterfaceC1326H f5324r;

    /* renamed from: s */
    public int f5325s;

    /* renamed from: t */
    public int f5326t;

    public C1323E(int i4, int i5, p083V0.InterfaceC0772j interfaceC0772j, p086W.C0803w c0803w, p123e1.C1332f c1332f) {
        this.f5312f = c1332f;
        this.f5307a = i4;
        this.f5308b = i5;
        this.f5313g = interfaceC0772j;
        if (i4 == 1 || i4 == 2) {
            this.f5309c = java.util.Collections.singletonList(c0803w);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f5309c = arrayList;
            arrayList.add(c0803w);
        }
        this.f5310d = new p086W.C0798r(new byte[9400], 0);
        android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray();
        this.f5315i = sparseBooleanArray;
        this.f5316j = new android.util.SparseBooleanArray();
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f5314h = sparseArray;
        this.f5311e = new android.util.SparseIntArray();
        this.f5317k = new p123e1.C1351y(1);
        this.f5319m = p215y0.InterfaceC2405q.f9465k;
        this.f5326t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
        int size = sparseArray2.size();
        for (int i6 = 0; i6 < size; i6++) {
            sparseArray.put(sparseArray2.keyAt(i6), (p123e1.InterfaceC1326H) sparseArray2.valueAt(i6));
        }
        sparseArray.put(0, new p123e1.C1321C(new p094Y.C0886x(this)));
        this.f5324r = null;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        p016D0.C0166b c0166b;
        long j6;
        p086W.AbstractC0781a.m1421j(this.f5307a != 2);
        java.util.List list = this.f5309c;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            p086W.C0803w c0803w = (p086W.C0803w) list.get(i4);
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
        }
        if (j5 != 0 && (c0166b = this.f5318l) != null) {
            c0166b.m528d(j5);
        }
        this.f5310d.m1534D(0);
        this.f5311e.clear();
        int i5 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f5314h;
            if (i5 >= sparseArray.size()) {
                this.f5325s = 0;
                return;
            } else {
                ((p123e1.InterfaceC1326H) sparseArray.valueAt(i5)).mo3080b();
                i5++;
            }
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        if ((this.f5308b & 1) == 0) {
            interfaceC2405q = new android.support.v4.media.session.C1061t(interfaceC2405q, this.f5313g);
        }
        this.f5319m = interfaceC2405q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo36k(p215y0.InterfaceC2404p r7) {
        /*
            r6 = this;
            W.r r0 = r6.f5310d
            byte[] r0 = r0.f2786a
            y0.l r7 = (p215y0.C2400l) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.mo634p(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.mo628e(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p123e1.C1323E.mo36k(y0.p):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v22, types: [y0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [P2.a, y0.i, java.lang.Object] */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        ?? r22;
        int i4;
        long j4;
        int i5;
        int i6;
        int i7;
        long j5;
        long j6;
        long j7 = ((p215y0.C2400l) interfaceC2404p).f9449n;
        int i8 = this.f5307a;
        java.lang.Object[] objArr = i8 == 2;
        if (this.f5321o) {
            p123e1.C1351y c1351y = this.f5317k;
            if (j7 != -1 && objArr != true && !c1351y.f5613d) {
                int i9 = this.f5326t;
                if (i9 <= 0) {
                    c1351y.m3111a((p215y0.C2400l) interfaceC2404p);
                    return 0;
                }
                boolean z4 = c1351y.f5615f;
                p086W.C0798r c0798r = c1351y.f5612c;
                if (!z4) {
                    p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
                    long j8 = c2400l.f9449n;
                    int min = (int) java.lang.Math.min(112800, j8);
                    long j9 = j8 - min;
                    if (c2400l.f9450o == j9) {
                        c0798r.m1534D(min);
                        c2400l.f9452q = 0;
                        c2400l.mo634p(c0798r.f2786a, 0, min, false);
                        int i10 = c0798r.f2787b;
                        int i11 = c0798r.f2788c;
                        int i12 = i11 - 188;
                        while (true) {
                            if (i12 < i10) {
                                j6 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = c0798r.f2786a;
                            int i13 = -4;
                            int i14 = 0;
                            while (true) {
                                if (i13 > 4) {
                                    break;
                                }
                                int i15 = (i13 * 188) + i12;
                                if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                                    i14 = 0;
                                } else {
                                    i14++;
                                    if (i14 == 5) {
                                        long m3906I = p176p1.AbstractC1949a.m3906I(c0798r, i12, i9);
                                        if (m3906I != -9223372036854775807L) {
                                            j6 = m3906I;
                                            break;
                                        }
                                    }
                                }
                                i13++;
                            }
                            i12--;
                        }
                        c1351y.f5617h = j6;
                        c1351y.f5615f = true;
                        return 0;
                    }
                    c0706t.f2437a = j9;
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
                    int min2 = (int) java.lang.Math.min(112800, c2400l2.f9449n);
                    long j11 = 0;
                    if (c2400l2.f9450o == j11) {
                        c0798r.m1534D(min2);
                        c2400l2.f9452q = 0;
                        c2400l2.mo634p(c0798r.f2786a, 0, min2, false);
                        int i16 = c0798r.f2787b;
                        int i17 = c0798r.f2788c;
                        while (true) {
                            if (i16 >= i17) {
                                j5 = -9223372036854775807L;
                                break;
                            }
                            if (c0798r.f2786a[i16] == 71) {
                                long m3906I2 = p176p1.AbstractC1949a.m3906I(c0798r, i16, i9);
                                if (m3906I2 != -9223372036854775807L) {
                                    j5 = m3906I2;
                                    break;
                                }
                            }
                            i16++;
                        }
                        c1351y.f5616g = j5;
                        c1351y.f5614e = true;
                        return 0;
                    }
                    c0706t.f2437a = j11;
                }
                return 1;
            }
            if (this.f5322p) {
                i4 = i8;
                j4 = j7;
            } else {
                this.f5322p = true;
                long j12 = c1351y.f5618i;
                if (j12 != -9223372036854775807L) {
                    int i18 = this.f5326t;
                    ?? obj = new java.lang.Object();
                    p086W.C0803w c0803w2 = c1351y.f5611b;
                    ?? obj2 = new java.lang.Object();
                    obj2.f1551l = i18;
                    obj2.f1552m = c0803w2;
                    obj2.f1553n = new p086W.C0798r();
                    i4 = i8;
                    j4 = j7;
                    p016D0.C0166b c0166b = new p016D0.C0166b(obj, obj2, j12, j12 + 1, 0L, j7, 188L, 940);
                    this.f5318l = c0166b;
                    this.f5319m.mo638t(c0166b.f429a);
                } else {
                    i4 = i8;
                    j4 = j7;
                    this.f5319m.mo638t(new p002A0.C0004b(j12));
                }
            }
            if (this.f5323q) {
                this.f5323q = false;
                mo34b(0L, 0L);
                if (((p215y0.C2400l) interfaceC2404p).f9450o != 0) {
                    c0706t.f2437a = 0L;
                    return 1;
                }
            }
            r22 = 1;
            r22 = 1;
            p016D0.C0166b c0166b2 = this.f5318l;
            if (c0166b2 != null && c0166b2.f431c != null) {
                return c0166b2.m527b((p215y0.C2400l) interfaceC2404p, c0706t);
            }
        } else {
            r22 = 1;
            i4 = i8;
            j4 = j7;
        }
        p086W.C0798r c0798r2 = this.f5310d;
        byte[] bArr2 = c0798r2.f2786a;
        if (9400 - c0798r2.f2787b < 188) {
            int m1539a = c0798r2.m1539a();
            if (m1539a > 0) {
                java.lang.System.arraycopy(bArr2, c0798r2.f2787b, bArr2, 0, m1539a);
            }
            c0798r2.m1535E(bArr2, m1539a);
        }
        while (true) {
            int m1539a2 = c0798r2.m1539a();
            android.util.SparseArray sparseArray = this.f5314h;
            if (m1539a2 >= 188) {
                int i19 = c0798r2.f2787b;
                int i20 = c0798r2.f2788c;
                byte[] bArr3 = c0798r2.f2786a;
                int i21 = i19;
                while (i21 < i20 && bArr3[i21] != 71) {
                    i21++;
                }
                c0798r2.m1537G(i21);
                int i22 = i21 + 188;
                if (i22 > i20) {
                    int i23 = (i21 - i19) + this.f5325s;
                    this.f5325s = i23;
                    i5 = i4;
                    i6 = 2;
                    if (i5 == 2 && i23 > 376) {
                        throw p076T.C0666I.m1202a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                    i7 = 0;
                } else {
                    i5 = i4;
                    i6 = 2;
                    i7 = 0;
                    this.f5325s = 0;
                }
                int i24 = c0798r2.f2788c;
                if (i22 > i24) {
                    return i7;
                }
                int m1546h = c0798r2.m1546h();
                if ((8388608 & m1546h) != 0) {
                    c0798r2.m1537G(i22);
                    return i7;
                }
                int i25 = (4194304 & m1546h) != 0 ? r22 : 0;
                int i26 = (2096896 & m1546h) >> 8;
                boolean z5 = (m1546h & 32) != 0 ? r22 : false;
                p123e1.InterfaceC1326H interfaceC1326H = (m1546h & 16) != 0 ? (p123e1.InterfaceC1326H) sparseArray.get(i26) : null;
                if (interfaceC1326H == null) {
                    c0798r2.m1537G(i22);
                    return 0;
                }
                if (i5 != i6) {
                    int i27 = m1546h & 15;
                    android.util.SparseIntArray sparseIntArray = this.f5311e;
                    int i28 = sparseIntArray.get(i26, i27 - 1);
                    sparseIntArray.put(i26, i27);
                    if (i28 == i27) {
                        c0798r2.m1537G(i22);
                        return 0;
                    }
                    if (i27 != ((i28 + r22) & 15)) {
                        interfaceC1326H.mo3080b();
                    }
                }
                if (z5) {
                    int m1559u = c0798r2.m1559u();
                    i25 |= (c0798r2.m1559u() & 64) != 0 ? i6 : 0;
                    c0798r2.m1538H(m1559u - r22);
                }
                boolean z6 = this.f5321o;
                if (i5 == i6 || z6 || !this.f5316j.get(i26, false)) {
                    c0798r2.m1536F(i22);
                    interfaceC1326H.mo3081c(i25, c0798r2);
                    c0798r2.m1536F(i24);
                }
                if (i5 != i6 && !z6 && this.f5321o && j4 != -1) {
                    this.f5323q = r22;
                }
                c0798r2.m1537G(i22);
                return 0;
            }
            int i29 = c0798r2.f2788c;
            int read = ((p215y0.C2400l) interfaceC2404p).read(bArr2, i29, 9400 - i29);
            if (read == -1) {
                for (int i30 = 0; i30 < sparseArray.size(); i30++) {
                    p123e1.InterfaceC1326H interfaceC1326H2 = (p123e1.InterfaceC1326H) sparseArray.valueAt(i30);
                    if (interfaceC1326H2 instanceof p123e1.C1350x) {
                        p123e1.C1350x c1350x = (p123e1.C1350x) interfaceC1326H2;
                        if (c1350x.f5600c == 3 && c1350x.f5607j == -1 && (objArr == false || !(c1350x.f5598a instanceof p123e1.C1337k))) {
                            c1350x.mo3081c(r22, new p086W.C0798r());
                        }
                    }
                }
                return -1;
            }
            c0798r2.m1536F(i29 + read);
        }
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
