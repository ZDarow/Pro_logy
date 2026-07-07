package p123e1;

/* renamed from: e1.b */
/* loaded from: classes.dex */
public final class C1328b implements p123e1.InterfaceC1335i {

    /* renamed from: a */
    public final /* synthetic */ int f5337a;

    /* renamed from: b */
    public final p086W.C0797q f5338b;

    /* renamed from: c */
    public final p086W.C0798r f5339c;

    /* renamed from: d */
    public final java.lang.String f5340d;

    /* renamed from: e */
    public final int f5341e;

    /* renamed from: f */
    public java.lang.String f5342f;

    /* renamed from: g */
    public p215y0.InterfaceC2387F f5343g;

    /* renamed from: h */
    public int f5344h;

    /* renamed from: i */
    public int f5345i;

    /* renamed from: j */
    public boolean f5346j;

    /* renamed from: k */
    public long f5347k;

    /* renamed from: l */
    public p076T.C0702p f5348l;

    /* renamed from: m */
    public int f5349m;

    /* renamed from: n */
    public long f5350n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1328b() {
        this(0, 0, null);
        this.f5337a = 0;
    }

    /* renamed from: a */
    private final void m3087a(boolean z4) {
    }

    /* renamed from: c */
    private final void m3088c(boolean z4) {
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: b */
    public final void mo3089b() {
        switch (this.f5337a) {
            case 0:
                this.f5344h = 0;
                this.f5345i = 0;
                this.f5346j = false;
                this.f5350n = -9223372036854775807L;
                return;
            default:
                this.f5344h = 0;
                this.f5345i = 0;
                this.f5346j = false;
                this.f5350n = -9223372036854775807L;
                return;
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: d */
    public final void mo3090d(p086W.C0798r c0798r) {
        switch (this.f5337a) {
            case 0:
                p086W.AbstractC0781a.m1422k(this.f5343g);
                while (c0798r.m1539a() > 0) {
                    int i4 = this.f5344h;
                    p086W.C0798r c0798r2 = this.f5339c;
                    if (i4 == 0) {
                        while (true) {
                            if (c0798r.m1539a() <= 0) {
                                break;
                            }
                            if (this.f5346j) {
                                int m1559u = c0798r.m1559u();
                                if (m1559u == 119) {
                                    this.f5346j = false;
                                    this.f5344h = 1;
                                    byte[] bArr = c0798r2.f2786a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f5345i = 2;
                                } else {
                                    this.f5346j = m1559u == 11;
                                }
                            } else {
                                this.f5346j = c0798r.m1559u() == 11;
                            }
                        }
                    } else if (i4 == 1) {
                        byte[] bArr2 = c0798r2.f2786a;
                        int min = java.lang.Math.min(c0798r.m1539a(), 128 - this.f5345i);
                        c0798r.m1544f(bArr2, this.f5345i, min);
                        int i5 = this.f5345i + min;
                        this.f5345i = i5;
                        if (i5 == 128) {
                            p086W.C0797q c0797q = this.f5338b;
                            c0797q.m1526q(0);
                            p215y0.C2391c m4620o = p215y0.AbstractC2390b.m4620o(c0797q);
                            p076T.C0702p c0702p = this.f5348l;
                            int i6 = m4620o.f9399b;
                            int i7 = m4620o.f9400c;
                            java.lang.String str = m4620o.f9398a;
                            if (c0702p == null || i7 != c0702p.f2385A || i6 != c0702p.f2386B || !p086W.AbstractC0805y.m1606a(str, c0702p.f2408m)) {
                                p076T.C0701o c0701o = new p076T.C0701o();
                                c0701o.f2359a = this.f5342f;
                                c0701o.f2370l = p076T.AbstractC0665H.m1201l(str);
                                c0701o.f2384z = i7;
                                c0701o.f2350A = i6;
                                c0701o.f2362d = this.f5340d;
                                c0701o.f2364f = this.f5341e;
                                int i8 = m4620o.f9403f;
                                c0701o.f2366h = i8;
                                if ("audio/ac3".equals(str)) {
                                    c0701o.f2365g = i8;
                                }
                                p076T.C0702p c0702p2 = new p076T.C0702p(c0701o);
                                this.f5348l = c0702p2;
                                this.f5343g.mo1407c(c0702p2);
                            }
                            this.f5349m = m4620o.f9401d;
                            this.f5347k = (m4620o.f9402e * 1000000) / this.f5348l.f2386B;
                            c0798r2.m1537G(0);
                            this.f5343g.mo1405a(c0798r2, 128, 0);
                            this.f5344h = 2;
                        }
                    } else if (i4 == 2) {
                        int min2 = java.lang.Math.min(c0798r.m1539a(), this.f5349m - this.f5345i);
                        this.f5343g.mo1405a(c0798r, min2, 0);
                        int i9 = this.f5345i + min2;
                        this.f5345i = i9;
                        if (i9 == this.f5349m) {
                            p086W.AbstractC0781a.m1421j(this.f5350n != -9223372036854775807L);
                            this.f5343g.mo1406b(this.f5350n, 1, this.f5349m, 0, null);
                            this.f5350n += this.f5347k;
                            this.f5344h = 0;
                        }
                    }
                }
                return;
            default:
                p086W.AbstractC0781a.m1422k(this.f5343g);
                while (c0798r.m1539a() > 0) {
                    int i10 = this.f5344h;
                    p086W.C0798r c0798r3 = this.f5339c;
                    if (i10 == 0) {
                        while (c0798r.m1539a() > 0) {
                            if (this.f5346j) {
                                int m1559u2 = c0798r.m1559u();
                                this.f5346j = m1559u2 == 172;
                                if (m1559u2 == 64 || m1559u2 == 65) {
                                    boolean z4 = m1559u2 == 65;
                                    this.f5344h = 1;
                                    byte[] bArr3 = c0798r3.f2786a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z4 ? 65 : 64);
                                    this.f5345i = 2;
                                }
                            } else {
                                this.f5346j = c0798r.m1559u() == 172;
                            }
                        }
                    } else if (i10 == 1) {
                        byte[] bArr4 = c0798r3.f2786a;
                        int min3 = java.lang.Math.min(c0798r.m1539a(), 16 - this.f5345i);
                        c0798r.m1544f(bArr4, this.f5345i, min3);
                        int i11 = this.f5345i + min3;
                        this.f5345i = i11;
                        if (i11 == 16) {
                            p086W.C0797q c0797q2 = this.f5338b;
                            c0797q2.m1526q(0);
                            p002A0.C0005c m4621p = p215y0.AbstractC2390b.m4621p(c0797q2);
                            p076T.C0702p c0702p3 = this.f5348l;
                            int i12 = m4621p.f7a;
                            if (c0702p3 == null || 2 != c0702p3.f2385A || i12 != c0702p3.f2386B || !"audio/ac4".equals(c0702p3.f2408m)) {
                                p076T.C0701o c0701o2 = new p076T.C0701o();
                                c0701o2.f2359a = this.f5342f;
                                c0701o2.f2370l = p076T.AbstractC0665H.m1201l("audio/ac4");
                                c0701o2.f2384z = 2;
                                c0701o2.f2350A = i12;
                                c0701o2.f2362d = this.f5340d;
                                c0701o2.f2364f = this.f5341e;
                                p076T.C0702p c0702p4 = new p076T.C0702p(c0701o2);
                                this.f5348l = c0702p4;
                                this.f5343g.mo1407c(c0702p4);
                            }
                            this.f5349m = m4621p.f8b;
                            this.f5347k = (m4621p.f9c * 1000000) / this.f5348l.f2386B;
                            c0798r3.m1537G(0);
                            this.f5343g.mo1405a(c0798r3, 16, 0);
                            this.f5344h = 2;
                        }
                    } else if (i10 == 2) {
                        int min4 = java.lang.Math.min(c0798r.m1539a(), this.f5349m - this.f5345i);
                        this.f5343g.mo1405a(c0798r, min4, 0);
                        int i13 = this.f5345i + min4;
                        this.f5345i = i13;
                        if (i13 == this.f5349m) {
                            p086W.AbstractC0781a.m1421j(this.f5350n != -9223372036854775807L);
                            this.f5343g.mo1406b(this.f5350n, 1, this.f5349m, 0, null);
                            this.f5350n += this.f5347k;
                            this.f5344h = 0;
                        }
                    }
                }
                return;
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: e */
    public final void mo3091e(boolean z4) {
        int i4 = this.f5337a;
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: f */
    public final void mo3092f(p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        switch (this.f5337a) {
            case 0:
                c1325g.m3084a();
                c1325g.m3086c();
                this.f5342f = (java.lang.String) c1325g.f5333e;
                c1325g.m3086c();
                this.f5343g = interfaceC2405q.mo640v(c1325g.f5331c, 1);
                return;
            default:
                c1325g.m3084a();
                c1325g.m3086c();
                this.f5342f = (java.lang.String) c1325g.f5333e;
                c1325g.m3086c();
                this.f5343g = interfaceC2405q.mo640v(c1325g.f5331c, 1);
                return;
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: g */
    public final void mo3093g(long j4, int i4) {
        switch (this.f5337a) {
            case 0:
                this.f5350n = j4;
                return;
            default:
                this.f5350n = j4;
                return;
        }
    }

    public C1328b(int i4, int i5, java.lang.String str) {
        this.f5337a = i5;
        switch (i5) {
            case 1:
                p086W.C0797q c0797q = new p086W.C0797q(new byte[16], 16);
                this.f5338b = c0797q;
                this.f5339c = new p086W.C0798r(c0797q.f2781d);
                this.f5344h = 0;
                this.f5345i = 0;
                this.f5346j = false;
                this.f5350n = -9223372036854775807L;
                this.f5340d = str;
                this.f5341e = i4;
                return;
            default:
                p086W.C0797q c0797q2 = new p086W.C0797q(new byte[128], 128);
                this.f5338b = c0797q2;
                this.f5339c = new p086W.C0798r(c0797q2.f2781d);
                this.f5344h = 0;
                this.f5350n = -9223372036854775807L;
                this.f5340d = str;
                this.f5341e = i4;
                return;
        }
    }
}
