package p123e1;

/* renamed from: e1.u */
/* loaded from: classes.dex */
public final class C1347u implements p123e1.InterfaceC1335i {

    /* renamed from: a */
    public final p086W.C0798r f5561a;

    /* renamed from: b */
    public final p215y0.C2412x f5562b;

    /* renamed from: c */
    public final java.lang.String f5563c;

    /* renamed from: d */
    public final int f5564d;

    /* renamed from: e */
    public p215y0.InterfaceC2387F f5565e;

    /* renamed from: f */
    public java.lang.String f5566f;

    /* renamed from: g */
    public int f5567g = 0;

    /* renamed from: h */
    public int f5568h;

    /* renamed from: i */
    public boolean f5569i;

    /* renamed from: j */
    public boolean f5570j;

    /* renamed from: k */
    public long f5571k;

    /* renamed from: l */
    public int f5572l;

    /* renamed from: m */
    public long f5573m;

    /* JADX WARN: Type inference failed for: r0v1, types: [y0.x, java.lang.Object] */
    public C1347u(java.lang.String str, int i4) {
        p086W.C0798r c0798r = new p086W.C0798r(4);
        this.f5561a = c0798r;
        c0798r.f2786a[0] = -1;
        this.f5562b = new java.lang.Object();
        this.f5573m = -9223372036854775807L;
        this.f5563c = str;
        this.f5564d = i4;
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: b */
    public final void mo3089b() {
        this.f5567g = 0;
        this.f5568h = 0;
        this.f5570j = false;
        this.f5573m = -9223372036854775807L;
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: d */
    public final void mo3090d(p086W.C0798r c0798r) {
        p086W.AbstractC0781a.m1422k(this.f5565e);
        while (c0798r.m1539a() > 0) {
            int i4 = this.f5567g;
            p086W.C0798r c0798r2 = this.f5561a;
            if (i4 == 0) {
                byte[] bArr = c0798r.f2786a;
                int i5 = c0798r.f2787b;
                int i6 = c0798r.f2788c;
                while (true) {
                    if (i5 >= i6) {
                        c0798r.m1537G(i6);
                        break;
                    }
                    byte b4 = bArr[i5];
                    boolean z4 = (b4 & 255) == 255;
                    boolean z5 = this.f5570j && (b4 & 224) == 224;
                    this.f5570j = z4;
                    if (z5) {
                        c0798r.m1537G(i5 + 1);
                        this.f5570j = false;
                        c0798r2.f2786a[1] = bArr[i5];
                        this.f5568h = 2;
                        this.f5567g = 1;
                        break;
                    }
                    i5++;
                }
            } else if (i4 == 1) {
                int min = java.lang.Math.min(c0798r.m1539a(), 4 - this.f5568h);
                c0798r.m1544f(c0798r2.f2786a, this.f5568h, min);
                int i7 = this.f5568h + min;
                this.f5568h = i7;
                if (i7 >= 4) {
                    c0798r2.m1537G(0);
                    int m1546h = c0798r2.m1546h();
                    p215y0.C2412x c2412x = this.f5562b;
                    if (c2412x.m4646a(m1546h)) {
                        this.f5572l = c2412x.f9497b;
                        if (!this.f5569i) {
                            this.f5571k = (c2412x.f9501f * 1000000) / c2412x.f9498c;
                            p076T.C0701o c0701o = new p076T.C0701o();
                            c0701o.f2359a = this.f5566f;
                            c0701o.f2370l = p076T.AbstractC0665H.m1201l((java.lang.String) c2412x.f9502g);
                            c0701o.f2371m = 4096;
                            c0701o.f2384z = c2412x.f9499d;
                            c0701o.f2350A = c2412x.f9498c;
                            c0701o.f2362d = this.f5563c;
                            c0701o.f2364f = this.f5564d;
                            this.f5565e.mo1407c(new p076T.C0702p(c0701o));
                            this.f5569i = true;
                        }
                        c0798r2.m1537G(0);
                        this.f5565e.mo1405a(c0798r2, 4, 0);
                        this.f5567g = 2;
                    } else {
                        this.f5568h = 0;
                        this.f5567g = 1;
                    }
                }
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException();
                }
                int min2 = java.lang.Math.min(c0798r.m1539a(), this.f5572l - this.f5568h);
                this.f5565e.mo1405a(c0798r, min2, 0);
                int i8 = this.f5568h + min2;
                this.f5568h = i8;
                if (i8 >= this.f5572l) {
                    p086W.AbstractC0781a.m1421j(this.f5573m != -9223372036854775807L);
                    this.f5565e.mo1406b(this.f5573m, 1, this.f5572l, 0, null);
                    this.f5573m += this.f5571k;
                    this.f5568h = 0;
                    this.f5567g = 0;
                }
            }
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: e */
    public final void mo3091e(boolean z4) {
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: f */
    public final void mo3092f(p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        c1325g.m3084a();
        c1325g.m3086c();
        this.f5566f = (java.lang.String) c1325g.f5333e;
        c1325g.m3086c();
        this.f5565e = interfaceC2405q.mo640v(c1325g.f5331c, 1);
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: g */
    public final void mo3093g(long j4, int i4) {
        this.f5573m = j4;
    }
}
