package p123e1;

/* renamed from: e1.x */
/* loaded from: classes.dex */
public final class C1350x implements p123e1.InterfaceC1326H {

    /* renamed from: a */
    public final p123e1.InterfaceC1335i f5598a;

    /* renamed from: b */
    public final p086W.C0797q f5599b = new p086W.C0797q(new byte[10], 10);

    /* renamed from: c */
    public int f5600c = 0;

    /* renamed from: d */
    public int f5601d;

    /* renamed from: e */
    public p086W.C0803w f5602e;

    /* renamed from: f */
    public boolean f5603f;

    /* renamed from: g */
    public boolean f5604g;

    /* renamed from: h */
    public boolean f5605h;

    /* renamed from: i */
    public int f5606i;

    /* renamed from: j */
    public int f5607j;

    /* renamed from: k */
    public boolean f5608k;

    /* renamed from: l */
    public long f5609l;

    public C1350x(p123e1.InterfaceC1335i interfaceC1335i) {
        this.f5598a = interfaceC1335i;
    }

    @Override // p123e1.InterfaceC1326H
    /* renamed from: a */
    public final void mo3079a(p086W.C0803w c0803w, p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        this.f5602e = c0803w;
        this.f5598a.mo3092f(interfaceC2405q, c1325g);
    }

    @Override // p123e1.InterfaceC1326H
    /* renamed from: b */
    public final void mo3080b() {
        this.f5600c = 0;
        this.f5601d = 0;
        this.f5605h = false;
        this.f5598a.mo3089b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [W.q] */
    /* JADX WARN: Type inference failed for: r3v0, types: [e1.i] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // p123e1.InterfaceC1326H
    /* renamed from: c */
    public final void mo3081c(int i4, p086W.C0798r c0798r) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        p086W.AbstractC0781a.m1422k(this.f5602e);
        int i10 = i4 & 1;
        ?? r32 = this.f5598a;
        int i11 = -1;
        int i12 = 3;
        int i13 = 2;
        ?? r9 = 0;
        if (i10 != 0) {
            int i14 = this.f5600c;
            if (i14 != 0 && i14 != 1) {
                if (i14 == 2) {
                    p086W.AbstractC0781a.m1410A("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i14 != 3) {
                        throw new java.lang.IllegalStateException();
                    }
                    if (this.f5607j != -1) {
                        p086W.AbstractC0781a.m1410A("PesReader", "Unexpected start indicator: expected " + this.f5607j + " more bytes");
                    }
                    r32.mo3091e(c0798r.f2788c == 0);
                }
            }
            this.f5600c = 1;
            this.f5601d = 0;
        }
        int i15 = i4;
        while (c0798r.m1539a() > 0) {
            int i16 = this.f5600c;
            if (i16 != 0) {
                ?? r11 = this.f5599b;
                if (i16 == 1) {
                    i6 = i12;
                    int i17 = r9;
                    if (m3108d(c0798r, r11.f2781d, 9)) {
                        r11.m1526q(i17);
                        int m1518i = r11.m1518i(24);
                        if (m1518i != 1) {
                            p009B2.AbstractC0051h.m156o(m1518i, "Unexpected start code prefix: ", "PesReader");
                            this.f5607j = -1;
                            i5 = -1;
                            i9 = 0;
                            i7 = 2;
                        } else {
                            r11.m1529t(8);
                            int m1518i2 = r11.m1518i(16);
                            r11.m1529t(5);
                            this.f5608k = r11.m1517h();
                            i7 = 2;
                            r11.m1529t(2);
                            this.f5603f = r11.m1517h();
                            this.f5604g = r11.m1517h();
                            r11.m1529t(6);
                            int m1518i3 = r11.m1518i(8);
                            this.f5606i = m1518i3;
                            if (m1518i2 == 0) {
                                this.f5607j = -1;
                                i5 = -1;
                            } else {
                                int i18 = (m1518i2 - 3) - m1518i3;
                                this.f5607j = i18;
                                if (i18 < 0) {
                                    p086W.AbstractC0781a.m1410A("PesReader", "Found negative packet payload size: " + this.f5607j);
                                    i5 = -1;
                                    this.f5607j = -1;
                                } else {
                                    i5 = -1;
                                }
                            }
                            i9 = 2;
                        }
                        this.f5600c = i9;
                        i8 = 0;
                        this.f5601d = 0;
                    } else {
                        i8 = i17;
                        i5 = -1;
                        i7 = 2;
                    }
                } else if (i16 == i13) {
                    if (m3108d(c0798r, r11.f2781d, java.lang.Math.min(10, this.f5606i)) && m3108d(c0798r, null, this.f5606i)) {
                        r11.m1526q(r9);
                        this.f5609l = -9223372036854775807L;
                        if (this.f5603f) {
                            r11.m1529t(4);
                            r11.m1529t(1);
                            r11.m1529t(1);
                            long m1518i4 = (r11.m1518i(i12) << 30) | (r11.m1518i(15) << 15) | r11.m1518i(15);
                            r11.m1529t(1);
                            if (!this.f5605h && this.f5604g) {
                                r11.m1529t(4);
                                r11.m1529t(1);
                                r11.m1529t(1);
                                r11.m1529t(1);
                                this.f5602e.m1574b((r11.m1518i(15) << 15) | (r11.m1518i(i12) << 30) | r11.m1518i(15));
                                this.f5605h = true;
                            }
                            this.f5609l = this.f5602e.m1574b(m1518i4);
                        }
                        i15 |= this.f5608k ? 4 : 0;
                        r32.mo3093g(this.f5609l, i15);
                        this.f5600c = 3;
                        this.f5601d = 0;
                        r9 = 0;
                        i13 = 2;
                        i12 = 3;
                        i11 = -1;
                    } else {
                        i6 = i12;
                        i5 = -1;
                        int i19 = r9;
                        i7 = i13;
                        i8 = i19;
                    }
                } else {
                    if (i16 != i12) {
                        throw new java.lang.IllegalStateException();
                    }
                    int m1539a = c0798r.m1539a();
                    int i20 = this.f5607j;
                    int i21 = i20 == i11 ? r9 : m1539a - i20;
                    if (i21 > 0) {
                        m1539a -= i21;
                        c0798r.m1536F(c0798r.f2787b + m1539a);
                    }
                    r32.mo3090d(c0798r);
                    int i22 = this.f5607j;
                    if (i22 != i11) {
                        int i23 = i22 - m1539a;
                        this.f5607j = i23;
                        if (i23 == 0) {
                            r32.mo3091e(r9);
                            this.f5600c = 1;
                            this.f5601d = r9;
                        }
                    }
                    int i24 = i12;
                    i5 = i11;
                    i6 = i24;
                    int i25 = r9;
                    i7 = i13;
                    i8 = i25;
                }
            } else {
                int i26 = i12;
                i5 = i11;
                i6 = i26;
                int i27 = r9;
                i7 = i13;
                i8 = i27;
                c0798r.m1538H(c0798r.m1539a());
            }
            int i28 = i5;
            i12 = i6;
            i11 = i28;
            int i29 = i7;
            r9 = i8;
            i13 = i29;
        }
    }

    /* renamed from: d */
    public final boolean m3108d(p086W.C0798r c0798r, byte[] bArr, int i4) {
        int min = java.lang.Math.min(c0798r.m1539a(), i4 - this.f5601d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c0798r.m1538H(min);
        } else {
            c0798r.m1544f(bArr, this.f5601d, min);
        }
        int i5 = this.f5601d + min;
        this.f5601d = i5;
        return i5 == i4;
    }
}
