package p083V0;

/* renamed from: V0.o */
/* loaded from: classes.dex */
public final class C0777o implements p215y0.InterfaceC2387F {

    /* renamed from: a */
    public final p215y0.InterfaceC2387F f2721a;

    /* renamed from: b */
    public final p083V0.InterfaceC0772j f2722b;

    /* renamed from: g */
    public p083V0.InterfaceC0774l f2727g;

    /* renamed from: h */
    public p076T.C0702p f2728h;

    /* renamed from: d */
    public int f2724d = 0;

    /* renamed from: e */
    public int f2725e = 0;

    /* renamed from: f */
    public byte[] f2726f = p086W.AbstractC0805y.f2806f;

    /* renamed from: c */
    public final p086W.C0798r f2723c = new p086W.C0798r();

    public C0777o(p215y0.InterfaceC2387F interfaceC2387F, p083V0.InterfaceC0772j interfaceC0772j) {
        this.f2721a = interfaceC2387F;
        this.f2722b = interfaceC0772j;
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: a */
    public final void mo1405a(p086W.C0798r c0798r, int i4, int i5) {
        if (this.f2727g == null) {
            this.f2721a.mo1405a(c0798r, i4, i5);
            return;
        }
        m1409e(i4);
        c0798r.m1544f(this.f2726f, this.f2725e, i4);
        this.f2725e += i4;
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: b */
    public final void mo1406b(long j4, int i4, int i5, int i6, p215y0.C2386E c2386e) {
        if (this.f2727g == null) {
            this.f2721a.mo1406b(j4, i4, i5, i6, c2386e);
            return;
        }
        p086W.AbstractC0781a.m1415d("DRM on subtitles is not supported", c2386e == null);
        int i7 = (this.f2725e - i6) - i5;
        this.f2727g.mo692h(this.f2726f, i7, i5, p083V0.C0773k.f2712c, new p083V0.C0776n(this, j4, i4));
        int i8 = i7 + i5;
        this.f2724d = i8;
        if (i8 == this.f2725e) {
            this.f2724d = 0;
            this.f2725e = 0;
        }
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: c */
    public final void mo1407c(p076T.C0702p c0702p) {
        c0702p.f2408m.getClass();
        java.lang.String str = c0702p.f2408m;
        p086W.AbstractC0781a.m1416e(p076T.AbstractC0665H.m1196g(str) == 3);
        boolean equals = c0702p.equals(this.f2728h);
        p083V0.InterfaceC0772j interfaceC0772j = this.f2722b;
        if (!equals) {
            this.f2728h = c0702p;
            this.f2727g = interfaceC0772j.mo600o(c0702p) ? interfaceC0772j.mo591d(c0702p) : null;
        }
        p083V0.InterfaceC0774l interfaceC0774l = this.f2727g;
        p215y0.InterfaceC2387F interfaceC2387F = this.f2721a;
        if (interfaceC0774l == null) {
            interfaceC2387F.mo1407c(c0702p);
            return;
        }
        p076T.C0701o m1295a = c0702p.m1295a();
        m1295a.f2370l = p076T.AbstractC0665H.m1201l("application/x-media3-cues");
        m1295a.f2367i = str;
        m1295a.f2375q = Long.MAX_VALUE;
        m1295a.f2355F = interfaceC0772j.mo592e(c0702p);
        p009B2.AbstractC0051h.m158q(m1295a, interfaceC2387F);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: d */
    public final int mo1408d(p076T.InterfaceC0696j interfaceC0696j, int i4, boolean z4) {
        if (this.f2727g == null) {
            return this.f2721a.mo1408d(interfaceC0696j, i4, z4);
        }
        m1409e(i4);
        int read = interfaceC0696j.read(this.f2726f, this.f2725e, i4);
        if (read != -1) {
            this.f2725e += read;
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    /* renamed from: e */
    public final void m1409e(int i4) {
        int length = this.f2726f.length;
        int i5 = this.f2725e;
        if (length - i5 >= i4) {
            return;
        }
        int i6 = i5 - this.f2724d;
        int max = java.lang.Math.max(i6 * 2, i4 + i6);
        byte[] bArr = this.f2726f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        java.lang.System.arraycopy(bArr, this.f2724d, bArr2, 0, i6);
        this.f2724d = 0;
        this.f2725e = i6;
        this.f2726f = bArr2;
    }
}
