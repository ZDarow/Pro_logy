package p206w0;

/* renamed from: w0.m */
/* loaded from: classes.dex */
public final class C2317m extends p146j0.AbstractC1717u {

    /* renamed from: v1 */
    public static final int[] f9151v1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: w1 */
    public static boolean f9152w1;

    /* renamed from: x1 */
    public static boolean f9153x1;

    /* renamed from: P0 */
    public final android.content.Context f9154P0;

    /* renamed from: Q0 */
    public final boolean f9155Q0;

    /* renamed from: R0 */
    public final p112c0.C1232n f9156R0;

    /* renamed from: S0 */
    public final int f9157S0;

    /* renamed from: T0 */
    public final boolean f9158T0;

    /* renamed from: U0 */
    public final p206w0.C2320p f9159U0;

    /* renamed from: V0 */
    public final p009B2.C0038I f9160V0;

    /* renamed from: W0 */
    public p002A0.C0005c f9161W0;

    /* renamed from: X0 */
    public boolean f9162X0;

    /* renamed from: Y0 */
    public boolean f9163Y0;

    /* renamed from: Z0 */
    public p206w0.C2310f f9164Z0;

    /* renamed from: a1 */
    public boolean f9165a1;

    /* renamed from: b1 */
    public java.util.List f9166b1;

    /* renamed from: c1 */
    public android.view.Surface f9167c1;

    /* renamed from: d1 */
    public p206w0.C2319o f9168d1;

    /* renamed from: e1 */
    public p086W.C0799s f9169e1;

    /* renamed from: f1 */
    public boolean f9170f1;

    /* renamed from: g1 */
    public int f9171g1;

    /* renamed from: h1 */
    public long f9172h1;

    /* renamed from: i1 */
    public int f9173i1;

    /* renamed from: j1 */
    public int f9174j1;

    /* renamed from: k1 */
    public int f9175k1;

    /* renamed from: l1 */
    public long f9176l1;

    /* renamed from: m1 */
    public int f9177m1;

    /* renamed from: n1 */
    public long f9178n1;

    /* renamed from: o1 */
    public p076T.C0690d0 f9179o1;

    /* renamed from: p1 */
    public p076T.C0690d0 f9180p1;

    /* renamed from: q1 */
    public int f9181q1;

    /* renamed from: r1 */
    public boolean f9182r1;

    /* renamed from: s1 */
    public int f9183s1;

    /* renamed from: t1 */
    public p206w0.C2316l f9184t1;

    /* renamed from: u1 */
    public p102a0.C0942F f9185u1;

    public C2317m(android.content.Context context, p146j0.InterfaceC1705i interfaceC1705i, android.os.Handler handler, p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E) {
        super(2, interfaceC1705i, 30.0f);
        android.content.Context applicationContext = context.getApplicationContext();
        this.f9154P0 = applicationContext;
        this.f9157S0 = 50;
        this.f9156R0 = new p112c0.C1232n(handler, surfaceHolderCallbackC0941E);
        this.f9155Q0 = true;
        this.f9159U0 = new p206w0.C2320p(applicationContext, this);
        this.f9160V0 = new p009B2.C0038I();
        this.f9158T0 = "NVIDIA".equals(p086W.AbstractC0805y.f2803c);
        this.f9169e1 = p086W.C0799s.f2789c;
        this.f9171g1 = 1;
        this.f9179o1 = p076T.C0690d0.f2310e;
        this.f9183s1 = 0;
        this.f9180p1 = null;
        this.f9181q1 = -1000;
    }

    /* renamed from: A0 */
    public static java.util.List m4499A0(android.content.Context context, p146j0.C1718v c1718v, p076T.C0702p c0702p, boolean z4, boolean z5) {
        java.util.List m3647e;
        java.lang.String str = c0702p.f2408m;
        if (str == null) {
            return p129f2.C1415c0.f5744p;
        }
        if (p086W.AbstractC0805y.f2801a >= 26 && "video/dolby-vision".equals(str) && !p206w0.AbstractC2315k.m4497a(context)) {
            java.lang.String m3644b = p146j0.AbstractC1696B.m3644b(c0702p);
            if (m3644b == null) {
                m3647e = p129f2.C1415c0.f5744p;
            } else {
                c1718v.getClass();
                m3647e = p146j0.AbstractC1696B.m3647e(m3644b, z4, z5);
            }
            if (!m3647e.isEmpty()) {
                return m3647e;
            }
        }
        return p146j0.AbstractC1696B.m3649g(c1718v, c0702p, z4, z5);
    }

    /* renamed from: B0 */
    public static int m4500B0(p146j0.C1709m c1709m, p076T.C0702p c0702p) {
        if (c0702p.f2409n == -1) {
            return m4502z0(c1709m, c0702p);
        }
        java.util.List list = c0702p.f2411p;
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += ((byte[]) list.get(i5)).length;
        }
        return c0702p.f2409n + i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x074f, code lost:
    
        if (r14.equals("A10-70L") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x08b7, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L662;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[FALL_THROUGH] */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m4501y0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p206w0.C2317m.m4501y0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0070, code lost:
    
        if (r9.equals("video/hevc") == false) goto L19;
     */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m4502z0(p146j0.C1709m r11, p076T.C0702p r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p206w0.C2317m.m4502z0(j0.m, T.p):int");
    }

    @Override // p146j0.AbstractC1717u, p102a0.AbstractC0970e
    /* renamed from: C */
    public final void mo1982C(float f4, float f5) {
        super.mo1982C(f4, f5);
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f == null) {
            p206w0.C2320p c2320p = this.f9159U0;
            if (f4 == c2320p.f9205j) {
                return;
            }
            c2320p.f9205j = f4;
            p206w0.C2323s c2323s = c2320p.f9197b;
            c2323s.f9220i = f4;
            c2323s.f9224m = 0L;
            c2323s.f9227p = -1L;
            c2323s.f9225n = -1L;
            c2323s.m4527d(false);
            return;
        }
        p206w0.C2324t c2324t = c2310f.f9122j.f9126c;
        c2324t.getClass();
        p086W.AbstractC0781a.m1416e(f4 > 0.0f);
        p206w0.C2320p c2320p2 = c2324t.f9230b;
        if (f4 == c2320p2.f9205j) {
            return;
        }
        c2320p2.f9205j = f4;
        p206w0.C2323s c2323s2 = c2320p2.f9197b;
        c2323s2.f9220i = f4;
        c2323s2.f9224m = 0L;
        c2323s2.f9227p = -1L;
        c2323s2.f9225n = -1L;
        c2323s2.m4527d(false);
    }

    /* renamed from: C0 */
    public final void m4503C0() {
        if (this.f9173i1 > 0) {
            this.f3545r.getClass();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j4 = elapsedRealtime - this.f9172h1;
            int i4 = this.f9173i1;
            p112c0.C1232n c1232n = this.f9156R0;
            android.os.Handler handler = c1232n.f4797a;
            if (handler != null) {
                handler.post(new p206w0.RunnableC2325u(c1232n, i4, j4));
            }
            this.f9173i1 = 0;
            this.f9172h1 = elapsedRealtime;
        }
    }

    /* renamed from: D0 */
    public final void m4504D0(p076T.C0690d0 c0690d0) {
        if (c0690d0.equals(p076T.C0690d0.f2310e) || c0690d0.equals(this.f9180p1)) {
            return;
        }
        this.f9180p1 = c0690d0;
        this.f9156R0.m2913b(c0690d0);
    }

    /* renamed from: E0 */
    public final void m4505E0() {
        int i4;
        p146j0.InterfaceC1706j interfaceC1706j;
        if (!this.f9182r1 || (i4 = p086W.AbstractC0805y.f2801a) < 23 || (interfaceC1706j = this.f7145V) == null) {
            return;
        }
        this.f9184t1 = new p206w0.C2316l(this, interfaceC1706j);
        if (i4 >= 33) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC1706j.mo2219c(bundle);
        }
    }

    /* renamed from: F0 */
    public final void m4506F0() {
        android.view.Surface surface = this.f9167c1;
        p206w0.C2319o c2319o = this.f9168d1;
        if (surface == c2319o) {
            this.f9167c1 = null;
        }
        if (c2319o != null) {
            c2319o.release();
            this.f9168d1 = null;
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: G */
    public final p102a0.C0974g mo2873G(p146j0.C1709m c1709m, p076T.C0702p c0702p, p076T.C0702p c0702p2) {
        p102a0.C0974g m3662b = c1709m.m3662b(c0702p, c0702p2);
        p002A0.C0005c c0005c = this.f9161W0;
        c0005c.getClass();
        int i4 = c0702p2.f2414s;
        int i5 = c0005c.f7a;
        int i6 = m3662b.f3603e;
        if (i4 > i5 || c0702p2.f2415t > c0005c.f8b) {
            i6 |= 256;
        }
        if (m4500B0(c1709m, c0702p2) > c0005c.f9c) {
            i6 |= 64;
        }
        int i7 = i6;
        return new p102a0.C0974g(c1709m.f7093a, c0702p, c0702p2, i7 != 0 ? 0 : m3662b.f3602d, i7);
    }

    /* renamed from: G0 */
    public final void m4507G0(p146j0.InterfaceC1706j interfaceC1706j, int i4) {
        android.view.Surface surface;
        android.os.Trace.beginSection("releaseOutputBuffer");
        interfaceC1706j.mo2238r(i4, true);
        android.os.Trace.endSection();
        this.f7131K0.f3570e++;
        this.f9174j1 = 0;
        if (this.f9164Z0 == null) {
            m4504D0(this.f9179o1);
            p206w0.C2320p c2320p = this.f9159U0;
            boolean z4 = c2320p.f9199d != 3;
            c2320p.f9199d = 3;
            c2320p.f9206k.getClass();
            c2320p.f9201f = p086W.AbstractC0805y.m1592M(android.os.SystemClock.elapsedRealtime());
            if (!z4 || (surface = this.f9167c1) == null) {
                return;
            }
            p112c0.C1232n c1232n = this.f9156R0;
            android.os.Handler handler = c1232n.f4797a;
            if (handler != null) {
                handler.post(new p206w0.RunnableC2326v(c1232n, surface, android.os.SystemClock.elapsedRealtime()));
            }
            this.f9170f1 = true;
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: H */
    public final p146j0.C1708l mo3686H(java.lang.IllegalStateException illegalStateException, p146j0.C1709m c1709m) {
        android.view.Surface surface = this.f9167c1;
        p146j0.C1708l c1708l = new p146j0.C1708l(illegalStateException, c1709m);
        java.lang.System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c1708l;
    }

    /* renamed from: H0 */
    public final void m4508H0(p146j0.InterfaceC1706j interfaceC1706j, int i4, long j4) {
        android.view.Surface surface;
        android.os.Trace.beginSection("releaseOutputBuffer");
        interfaceC1706j.mo2228j(j4, i4);
        android.os.Trace.endSection();
        this.f7131K0.f3570e++;
        this.f9174j1 = 0;
        if (this.f9164Z0 == null) {
            m4504D0(this.f9179o1);
            p206w0.C2320p c2320p = this.f9159U0;
            boolean z4 = c2320p.f9199d != 3;
            c2320p.f9199d = 3;
            c2320p.f9206k.getClass();
            c2320p.f9201f = p086W.AbstractC0805y.m1592M(android.os.SystemClock.elapsedRealtime());
            if (!z4 || (surface = this.f9167c1) == null) {
                return;
            }
            p112c0.C1232n c1232n = this.f9156R0;
            android.os.Handler handler = c1232n.f4797a;
            if (handler != null) {
                handler.post(new p206w0.RunnableC2326v(c1232n, surface, android.os.SystemClock.elapsedRealtime()));
            }
            this.f9170f1 = true;
        }
    }

    /* renamed from: I0 */
    public final boolean m4509I0(p146j0.C1709m c1709m) {
        return p086W.AbstractC0805y.f2801a >= 23 && !this.f9182r1 && !m4501y0(c1709m.f7093a) && (!c1709m.f7098f || p206w0.C2319o.m4515d(this.f9154P0));
    }

    /* renamed from: J0 */
    public final void m4510J0(p146j0.InterfaceC1706j interfaceC1706j, int i4) {
        android.os.Trace.beginSection("skipVideoBuffer");
        interfaceC1706j.mo2238r(i4, false);
        android.os.Trace.endSection();
        this.f7131K0.f3571f++;
    }

    /* renamed from: K0 */
    public final void m4511K0(int i4, int i5) {
        p102a0.C0972f c0972f = this.f7131K0;
        c0972f.f3573h += i4;
        int i6 = i4 + i5;
        c0972f.f3572g += i6;
        this.f9173i1 += i6;
        int i7 = this.f9174j1 + i6;
        this.f9174j1 = i7;
        c0972f.f3574i = java.lang.Math.max(i7, c0972f.f3574i);
        int i8 = this.f9157S0;
        if (i8 <= 0 || this.f9173i1 < i8) {
            return;
        }
        m4503C0();
    }

    /* renamed from: L0 */
    public final void m4512L0(long j4) {
        p102a0.C0972f c0972f = this.f7131K0;
        c0972f.f3576k += j4;
        c0972f.f3577l++;
        this.f9176l1 += j4;
        this.f9177m1++;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: P */
    public final int mo3694P(p098Z.C0921f c0921f) {
        return (p086W.AbstractC0805y.f2801a < 34 || !this.f9182r1 || c0921f.f3253r >= this.f3550w) ? 0 : 32;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: Q */
    public final boolean mo3695Q() {
        return this.f9182r1 && p086W.AbstractC0805y.f2801a < 23;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: R */
    public final float mo2874R(float f4, p076T.C0702p[] c0702pArr) {
        float f5 = -1.0f;
        for (p076T.C0702p c0702p : c0702pArr) {
            float f6 = c0702p.f2416u;
            if (f6 != -1.0f) {
                f5 = java.lang.Math.max(f5, f6);
            }
        }
        if (f5 == -1.0f) {
            return -1.0f;
        }
        return f5 * f4;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: S */
    public final java.util.ArrayList mo2875S(p146j0.C1718v c1718v, p076T.C0702p c0702p, boolean z4) {
        java.util.List m4499A0 = m4499A0(this.f9154P0, c1718v, c0702p, z4, this.f9182r1);
        java.util.regex.Pattern pattern = p146j0.AbstractC1696B.f7043a;
        java.util.ArrayList arrayList = new java.util.ArrayList(m4499A0);
        java.util.Collections.sort(arrayList, new p146j0.C1719w(new p009B2.C0067x(26, c0702p)));
        return arrayList;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: T */
    public final p146j0.C1704h mo2876T(p146j0.C1709m c1709m, p076T.C0702p c0702p, android.media.MediaCrypto mediaCrypto, float f4) {
        boolean z4;
        int i4;
        int i5;
        p076T.C0695i c0695i;
        int i6;
        p002A0.C0005c c0005c;
        android.graphics.Point point;
        float f5;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.graphics.Point point2;
        boolean z5;
        int i7;
        char c4;
        boolean z6;
        android.util.Pair m3646d;
        int m4502z0;
        p206w0.C2319o c2319o = this.f9168d1;
        boolean z7 = c1709m.f7098f;
        if (c2319o != null && c2319o.f9193l != z7) {
            m4506F0();
        }
        java.lang.String str = c1709m.f7095c;
        p076T.C0702p[] c0702pArr = this.f3548u;
        c0702pArr.getClass();
        int i8 = c0702p.f2414s;
        int m4500B0 = m4500B0(c1709m, c0702p);
        int length = c0702pArr.length;
        float f6 = c0702p.f2416u;
        int i9 = c0702p.f2414s;
        p076T.C0695i c0695i2 = c0702p.f2421z;
        int i10 = c0702p.f2415t;
        if (length == 1) {
            if (m4500B0 != -1 && (m4502z0 = m4502z0(c1709m, c0702p)) != -1) {
                m4500B0 = java.lang.Math.min((int) (m4500B0 * 1.5f), m4502z0);
            }
            c0005c = new p002A0.C0005c(i8, i10, m4500B0);
            z4 = z7;
            i4 = i10;
            i5 = i9;
            c0695i = c0695i2;
        } else {
            int length2 = c0702pArr.length;
            int i11 = i10;
            int i12 = 0;
            boolean z8 = false;
            while (i12 < length2) {
                p076T.C0702p c0702p2 = c0702pArr[i12];
                p076T.C0702p[] c0702pArr2 = c0702pArr;
                if (c0695i2 != null && c0702p2.f2421z == null) {
                    p076T.C0701o m1295a = c0702p2.m1295a();
                    m1295a.f2383y = c0695i2;
                    c0702p2 = new p076T.C0702p(m1295a);
                }
                if (c1709m.m3662b(c0702p, c0702p2).f3602d != 0) {
                    int i13 = c0702p2.f2415t;
                    i7 = length2;
                    int i14 = c0702p2.f2414s;
                    z5 = z7;
                    c4 = 65535;
                    z8 |= i14 == -1 || i13 == -1;
                    i8 = java.lang.Math.max(i8, i14);
                    i11 = java.lang.Math.max(i11, i13);
                    m4500B0 = java.lang.Math.max(m4500B0, m4500B0(c1709m, c0702p2));
                } else {
                    z5 = z7;
                    i7 = length2;
                    c4 = 65535;
                }
                i12++;
                c0702pArr = c0702pArr2;
                length2 = i7;
                z7 = z5;
            }
            z4 = z7;
            int i15 = i11;
            if (z8) {
                p086W.AbstractC0781a.m1410A("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i8 + "x" + i15);
                boolean z9 = i10 > i9;
                int i16 = z9 ? i10 : i9;
                int i17 = z9 ? i9 : i10;
                c0695i = c0695i2;
                float f7 = i17 / i16;
                int[] iArr = f9151v1;
                i4 = i10;
                i5 = i9;
                int i18 = 0;
                while (i18 < 9) {
                    int i19 = iArr[i18];
                    int[] iArr2 = iArr;
                    int i20 = (int) (i19 * f7);
                    if (i19 <= i16 || i20 <= i17) {
                        break;
                    }
                    int i21 = i17;
                    int i22 = i16;
                    if (p086W.AbstractC0805y.f2801a >= 21) {
                        int i23 = z9 ? i20 : i19;
                        if (!z9) {
                            i19 = i20;
                        }
                        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = c1709m.f7096d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f5 = f7;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f5 = f7;
                            point2 = new android.graphics.Point(p086W.AbstractC0805y.m1612g(i23, widthAlignment) * widthAlignment, p086W.AbstractC0805y.m1612g(i19, heightAlignment) * heightAlignment);
                        }
                        if (point2 != null) {
                            android.graphics.Point point3 = point2;
                            if (c1709m.m3666f(point2.x, point2.y, f6)) {
                                point = point3;
                                break;
                            }
                        } else {
                            continue;
                        }
                        i18++;
                        iArr = iArr2;
                        i17 = i21;
                        i16 = i22;
                        f7 = f5;
                    } else {
                        f5 = f7;
                        try {
                            int m1612g = p086W.AbstractC0805y.m1612g(i19, 16) * 16;
                            int m1612g2 = p086W.AbstractC0805y.m1612g(i20, 16) * 16;
                            if (m1612g * m1612g2 <= p146j0.AbstractC1696B.m3652j()) {
                                int i24 = z9 ? m1612g2 : m1612g;
                                if (!z9) {
                                    m1612g = m1612g2;
                                }
                                point = new android.graphics.Point(i24, m1612g);
                            } else {
                                i18++;
                                iArr = iArr2;
                                i17 = i21;
                                i16 = i22;
                                f7 = f5;
                            }
                        } catch (p146j0.C1721y unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i8 = java.lang.Math.max(i8, point.x);
                    i6 = java.lang.Math.max(i15, point.y);
                    p076T.C0701o m1295a2 = c0702p.m1295a();
                    m1295a2.f2376r = i8;
                    m1295a2.f2377s = i6;
                    m4500B0 = java.lang.Math.max(m4500B0, m4502z0(c1709m, new p076T.C0702p(m1295a2)));
                    p086W.AbstractC0781a.m1410A("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i8 + "x" + i6);
                    c0005c = new p002A0.C0005c(i8, i6, m4500B0);
                }
            } else {
                i4 = i10;
                i5 = i9;
                c0695i = c0695i2;
            }
            i6 = i15;
            c0005c = new p002A0.C0005c(i8, i6, m4500B0);
        }
        this.f9161W0 = c0005c;
        int i25 = this.f9182r1 ? this.f9183s1 : 0;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i5);
        mediaFormat.setInteger("height", i4);
        p086W.AbstractC0781a.m1437z(mediaFormat, c0702p.f2411p);
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        p086W.AbstractC0781a.m1433v(mediaFormat, "rotation-degrees", c0702p.f2417v);
        if (c0695i != null) {
            p076T.C0695i c0695i3 = c0695i;
            p086W.AbstractC0781a.m1433v(mediaFormat, "color-transfer", c0695i3.f2333c);
            p086W.AbstractC0781a.m1433v(mediaFormat, "color-standard", c0695i3.f2331a);
            p086W.AbstractC0781a.m1433v(mediaFormat, "color-range", c0695i3.f2332b);
            byte[] bArr = c0695i3.f2334d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", java.nio.ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c0702p.f2408m) && (m3646d = p146j0.AbstractC1696B.m3646d(c0702p)) != null) {
            p086W.AbstractC0781a.m1433v(mediaFormat, "profile", ((java.lang.Integer) m3646d.first).intValue());
        }
        mediaFormat.setInteger("max-width", c0005c.f7a);
        mediaFormat.setInteger("max-height", c0005c.f8b);
        p086W.AbstractC0781a.m1433v(mediaFormat, "max-input-size", c0005c.f9c);
        int i26 = p086W.AbstractC0805y.f2801a;
        if (i26 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f4 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f4);
            }
        }
        if (this.f9158T0) {
            z6 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z6 = true;
        }
        if (i25 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z6);
            mediaFormat.setInteger("audio-session-id", i25);
        }
        if (i26 >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(0, -this.f9181q1));
        }
        if (this.f9167c1 == null) {
            if (!m4509I0(c1709m)) {
                throw new java.lang.IllegalStateException();
            }
            if (this.f9168d1 == null) {
                this.f9168d1 = p206w0.C2319o.m4516e(this.f9154P0, z4);
            }
            this.f9167c1 = this.f9168d1;
        }
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f != null && !p086W.AbstractC0805y.m1589J(c2310f.f9113a)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (this.f9164Z0 == null) {
            return new p146j0.C1704h(c1709m, mediaFormat, c0702p, this.f9167c1, mediaCrypto);
        }
        p086W.AbstractC0781a.m1421j(false);
        p086W.AbstractC0781a.m1422k(null);
        throw null;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: U */
    public final void mo2877U(p098Z.C0921f c0921f) {
        if (this.f9163Y0) {
            java.nio.ByteBuffer byteBuffer = c0921f.f3254s;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b4 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s4 = byteBuffer.getShort();
                byte b5 = byteBuffer.get();
                byte b6 = byteBuffer.get();
                byteBuffer.position(0);
                if (b4 == -75 && s == 60 && s4 == 1 && b5 == 4) {
                    if (b6 == 0 || b6 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        p146j0.InterfaceC1706j interfaceC1706j = this.f7145V;
                        interfaceC1706j.getClass();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC1706j.mo2219c(bundle);
                    }
                }
            }
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: Z */
    public final void mo2878Z(java.lang.Exception exc) {
        p086W.AbstractC0781a.m1426o("MediaCodecVideoRenderer", "Video codec error", exc);
        p112c0.C1232n c1232n = this.f9156R0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p206w0.RunnableC2325u(c1232n, exc, 3));
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: a0 */
    public final void mo2879a0(long j4, long j5, java.lang.String str) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        p112c0.C1232n c1232n = this.f9156R0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p206w0.RunnableC2325u(c1232n, str, j4, j5));
        }
        this.f9162X0 = m4501y0(str);
        p146j0.C1709m c1709m = this.f7152c0;
        c1709m.getClass();
        boolean z4 = false;
        if (p086W.AbstractC0805y.f2801a >= 29 && "video/x-vnd.on2.vp9".equals(c1709m.f7094b)) {
            android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = c1709m.f7096d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i4].profile == 16384) {
                    z4 = true;
                    break;
                }
                i4++;
            }
        }
        this.f9163Y0 = z4;
        m4505E0();
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: b0 */
    public final void mo2880b0(java.lang.String str) {
        p112c0.C1232n c1232n = this.f9156R0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p206w0.RunnableC2325u(c1232n, str, 5));
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: c0 */
    public final p102a0.C0974g mo2881c0(p094Y.C0886x c0886x) {
        p102a0.C0974g mo2881c0 = super.mo2881c0(c0886x);
        p076T.C0702p c0702p = (p076T.C0702p) c0886x.f3176n;
        c0702p.getClass();
        p112c0.C1232n c1232n = this.f9156R0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p086W.RunnableC0793m(c1232n, c0702p, mo2881c0, 16));
        }
        return mo2881c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [android.view.Surface] */
    @Override // p102a0.AbstractC0970e, p102a0.InterfaceC0977h0
    /* renamed from: d */
    public final void mo1824d(int i4, java.lang.Object obj) {
        android.os.Handler handler;
        p206w0.C2320p c2320p = this.f9159U0;
        if (i4 == 1) {
            p206w0.C2319o c2319o = obj instanceof android.view.Surface ? (android.view.Surface) obj : null;
            if (c2319o == null) {
                p206w0.C2319o c2319o2 = this.f9168d1;
                if (c2319o2 != null) {
                    c2319o = c2319o2;
                } else {
                    p146j0.C1709m c1709m = this.f7152c0;
                    if (c1709m != null && m4509I0(c1709m)) {
                        c2319o = p206w0.C2319o.m4516e(this.f9154P0, c1709m.f7098f);
                        this.f9168d1 = c2319o;
                    }
                }
            }
            android.view.Surface surface = this.f9167c1;
            p112c0.C1232n c1232n = this.f9156R0;
            if (surface == c2319o) {
                if (c2319o == null || c2319o == this.f9168d1) {
                    return;
                }
                p076T.C0690d0 c0690d0 = this.f9180p1;
                if (c0690d0 != null) {
                    c1232n.m2913b(c0690d0);
                }
                android.view.Surface surface2 = this.f9167c1;
                if (surface2 == null || !this.f9170f1 || (handler = c1232n.f4797a) == null) {
                    return;
                }
                handler.post(new p206w0.RunnableC2326v(c1232n, surface2, android.os.SystemClock.elapsedRealtime()));
                return;
            }
            this.f9167c1 = c2319o;
            if (this.f9164Z0 == null) {
                p206w0.C2323s c2323s = c2320p.f9197b;
                c2323s.getClass();
                p206w0.C2319o c2319o3 = c2319o instanceof p206w0.C2319o ? null : c2319o;
                if (c2323s.f9216e != c2319o3) {
                    c2323s.m4525b();
                    c2323s.f9216e = c2319o3;
                    c2323s.m4527d(true);
                }
                c2320p.m4519c(1);
            }
            this.f9170f1 = false;
            int i5 = this.f3546s;
            p146j0.InterfaceC1706j interfaceC1706j = this.f7145V;
            if (interfaceC1706j != null && this.f9164Z0 == null) {
                if (p086W.AbstractC0805y.f2801a < 23 || c2319o == null || this.f9162X0) {
                    m3705m0();
                    m3698X();
                } else {
                    interfaceC1706j.mo2232l(c2319o);
                }
            }
            if (c2319o == null || c2319o == this.f9168d1) {
                this.f9180p1 = null;
                p206w0.C2310f c2310f = this.f9164Z0;
                if (c2310f != null) {
                    p206w0.C2311g c2311g = c2310f.f9122j;
                    c2311g.getClass();
                    int i6 = p086W.C0799s.f2789c.f2790a;
                    c2311g.f9133j = null;
                }
            } else {
                p076T.C0690d0 c0690d02 = this.f9180p1;
                if (c0690d02 != null) {
                    c1232n.m2913b(c0690d02);
                }
                if (i5 == 2) {
                    c2320p.m4518b(true);
                }
            }
            m4505E0();
            return;
        }
        if (i4 == 7) {
            obj.getClass();
            p102a0.C0942F c0942f = (p102a0.C0942F) obj;
            this.f9185u1 = c0942f;
            p206w0.C2310f c2310f2 = this.f9164Z0;
            if (c2310f2 != null) {
                c2310f2.f9122j.f9131h = c0942f;
                return;
            }
            return;
        }
        if (i4 == 10) {
            obj.getClass();
            int intValue = ((java.lang.Integer) obj).intValue();
            if (this.f9183s1 != intValue) {
                this.f9183s1 = intValue;
                if (this.f9182r1) {
                    m3705m0();
                    return;
                }
                return;
            }
            return;
        }
        if (i4 == 16) {
            obj.getClass();
            this.f9181q1 = ((java.lang.Integer) obj).intValue();
            p146j0.InterfaceC1706j interfaceC1706j2 = this.f7145V;
            if (interfaceC1706j2 != null && p086W.AbstractC0805y.f2801a >= 35) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("importance", java.lang.Math.max(0, -this.f9181q1));
                interfaceC1706j2.mo2219c(bundle);
                return;
            }
            return;
        }
        if (i4 == 4) {
            obj.getClass();
            int intValue2 = ((java.lang.Integer) obj).intValue();
            this.f9171g1 = intValue2;
            p146j0.InterfaceC1706j interfaceC1706j3 = this.f7145V;
            if (interfaceC1706j3 != null) {
                interfaceC1706j3.mo2204A(intValue2);
                return;
            }
            return;
        }
        if (i4 == 5) {
            obj.getClass();
            int intValue3 = ((java.lang.Integer) obj).intValue();
            p206w0.C2323s c2323s2 = c2320p.f9197b;
            if (c2323s2.f9221j == intValue3) {
                return;
            }
            c2323s2.f9221j = intValue3;
            c2323s2.m4527d(true);
            return;
        }
        if (i4 == 13) {
            obj.getClass();
            java.util.List list = (java.util.List) obj;
            this.f9166b1 = list;
            p206w0.C2310f c2310f3 = this.f9164Z0;
            if (c2310f3 != null) {
                java.util.ArrayList arrayList = c2310f3.f9115c;
                if (arrayList.equals(list)) {
                    return;
                }
                arrayList.clear();
                arrayList.addAll(list);
                c2310f3.m4490c();
                return;
            }
            return;
        }
        if (i4 != 14) {
            if (i4 == 11) {
                this.f7140Q = (p102a0.C0945I) obj;
                return;
            }
            return;
        }
        obj.getClass();
        p086W.C0799s c0799s = (p086W.C0799s) obj;
        if (c0799s.f2790a == 0 || c0799s.f2791b == 0) {
            return;
        }
        this.f9169e1 = c0799s;
        p206w0.C2310f c2310f4 = this.f9164Z0;
        if (c2310f4 != null) {
            android.view.Surface surface3 = this.f9167c1;
            p086W.AbstractC0781a.m1422k(surface3);
            c2310f4.m4492e(surface3, c0799s);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        if (r9.f9164Z0 == null) goto L36;
     */
    @Override // p146j0.AbstractC1717u
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2882d0(p076T.C0702p r10, android.media.MediaFormat r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p206w0.C2317m.mo2882d0(T.p, android.media.MediaFormat):void");
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: f0 */
    public final void mo3700f0(long j4) {
        super.mo3700f0(j4);
        if (this.f9182r1) {
            return;
        }
        this.f9175k1--;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: g0 */
    public final void mo2884g0() {
        if (this.f9164Z0 != null) {
            long j4 = this.f7133L0.f7109c;
        } else {
            this.f9159U0.m4519c(2);
        }
        m4505E0();
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: h */
    public final void mo1986h() {
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f != null) {
            p206w0.C2320p c2320p = c2310f.f9122j.f9125b;
            if (c2320p.f9199d == 0) {
                c2320p.f9199d = 1;
                return;
            }
            return;
        }
        p206w0.C2320p c2320p2 = this.f9159U0;
        if (c2320p2.f9199d == 0) {
            c2320p2.f9199d = 1;
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: h0 */
    public final void mo3701h0(p098Z.C0921f c0921f) {
        android.view.Surface surface;
        boolean z4 = this.f9182r1;
        if (!z4) {
            this.f9175k1++;
        }
        if (p086W.AbstractC0805y.f2801a >= 23 || !z4) {
            return;
        }
        long j4 = c0921f.f3253r;
        m3713x0(j4);
        m4504D0(this.f9179o1);
        this.f7131K0.f3570e++;
        p206w0.C2320p c2320p = this.f9159U0;
        boolean z5 = c2320p.f9199d != 3;
        c2320p.f9199d = 3;
        c2320p.f9206k.getClass();
        c2320p.f9201f = p086W.AbstractC0805y.m1592M(android.os.SystemClock.elapsedRealtime());
        if (z5 && (surface = this.f9167c1) != null) {
            p112c0.C1232n c1232n = this.f9156R0;
            android.os.Handler handler = c1232n.f4797a;
            if (handler != null) {
                handler.post(new p206w0.RunnableC2326v(c1232n, surface, android.os.SystemClock.elapsedRealtime()));
            }
            this.f9170f1 = true;
        }
        mo3700f0(j4);
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: i0 */
    public final void mo3702i0(p076T.C0702p c0702p) {
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f == null) {
            return;
        }
        try {
            c2310f.m4489b(c0702p);
            throw null;
        } catch (p206w0.C2328x e4) {
            throw m1985g(e4, c0702p, false, 7000);
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: k0 */
    public final boolean mo2885k0(long j4, long j5, p146j0.InterfaceC1706j interfaceC1706j, java.nio.ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z4, boolean z5, p076T.C0702p c0702p) {
        interfaceC1706j.getClass();
        p146j0.C1716t c1716t = this.f7133L0;
        long j7 = j6 - c1716t.f7109c;
        int m4517a = this.f9159U0.m4517a(j6, j4, j5, c1716t.f7108b, z5, this.f9160V0);
        if (m4517a == 4) {
            return false;
        }
        if (z4 && !z5) {
            m4510J0(interfaceC1706j, i4);
            return true;
        }
        android.view.Surface surface = this.f9167c1;
        p206w0.C2319o c2319o = this.f9168d1;
        p009B2.C0038I c0038i = this.f9160V0;
        if (surface == c2319o && this.f9164Z0 == null) {
            if (c0038i.f125a >= 30000) {
                return false;
            }
            m4510J0(interfaceC1706j, i4);
            m4512L0(c0038i.f125a);
            return true;
        }
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f != null) {
            try {
                c2310f.m4491d(j4, j5);
                p206w0.C2310f c2310f2 = this.f9164Z0;
                c2310f2.getClass();
                p086W.AbstractC0781a.m1421j(false);
                p086W.AbstractC0781a.m1421j(c2310f2.f9114b != -1);
                long j8 = c2310f2.f9119g;
                if (j8 != -9223372036854775807L) {
                    p206w0.C2311g c2311g = c2310f2.f9122j;
                    if (c2311g.f9134k == 0) {
                        long j9 = c2311g.f9126c.f9238j;
                        if (j9 != -9223372036854775807L && j9 >= j8) {
                            c2310f2.m4490c();
                            c2310f2.f9119g = -9223372036854775807L;
                        }
                    }
                    return false;
                }
                p086W.AbstractC0781a.m1422k(null);
                throw null;
            } catch (p206w0.C2328x e4) {
                throw m1985g(e4, e4.f9245l, false, 7001);
            }
        }
        if (m4517a == 0) {
            this.f3545r.getClass();
            long nanoTime = java.lang.System.nanoTime();
            p102a0.C0942F c0942f = this.f9185u1;
            if (c0942f != null) {
                c0942f.m1823c(j7, nanoTime);
            }
            if (p086W.AbstractC0805y.f2801a >= 21) {
                m4508H0(interfaceC1706j, i4, nanoTime);
            } else {
                m4507G0(interfaceC1706j, i4);
            }
            m4512L0(c0038i.f125a);
            return true;
        }
        if (m4517a != 1) {
            if (m4517a == 2) {
                android.os.Trace.beginSection("dropVideoBuffer");
                interfaceC1706j.mo2238r(i4, false);
                android.os.Trace.endSection();
                m4511K0(0, 1);
                m4512L0(c0038i.f125a);
                return true;
            }
            if (m4517a != 3) {
                if (m4517a == 5) {
                    return false;
                }
                throw new java.lang.IllegalStateException(java.lang.String.valueOf(m4517a));
            }
            m4510J0(interfaceC1706j, i4);
            m4512L0(c0038i.f125a);
            return true;
        }
        long j10 = c0038i.f126b;
        long j11 = c0038i.f125a;
        if (p086W.AbstractC0805y.f2801a >= 21) {
            if (j10 == this.f9178n1) {
                m4510J0(interfaceC1706j, i4);
            } else {
                p102a0.C0942F c0942f2 = this.f9185u1;
                if (c0942f2 != null) {
                    c0942f2.m1823c(j7, j10);
                }
                m4508H0(interfaceC1706j, i4, j10);
            }
            m4512L0(j11);
            this.f9178n1 = j10;
        } else {
            if (j11 >= 30000) {
                return false;
            }
            if (j11 > 11000) {
                try {
                    java.lang.Thread.sleep((j11 - 10000) / 1000);
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                    return false;
                }
            }
            p102a0.C0942F c0942f3 = this.f9185u1;
            if (c0942f3 != null) {
                c0942f3.m1823c(j7, j10);
            }
            m4507G0(interfaceC1706j, i4);
            m4512L0(j11);
        }
        return true;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: l */
    public final java.lang.String mo1988l() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: n */
    public final boolean mo1990n() {
        return this.f7123G0 && this.f9164Z0 == null;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: o0 */
    public final void mo3706o0() {
        super.mo3706o0();
        this.f9175k1 = 0;
    }

    @Override // p146j0.AbstractC1717u, p102a0.AbstractC0970e
    /* renamed from: p */
    public final boolean mo1991p() {
        p206w0.C2319o c2319o;
        boolean z4 = super.mo1991p() && this.f9164Z0 == null;
        if (z4 && (((c2319o = this.f9168d1) != null && this.f9167c1 == c2319o) || this.f7145V == null || this.f9182r1)) {
            return true;
        }
        p206w0.C2320p c2320p = this.f9159U0;
        if (z4 && c2320p.f9199d == 3) {
            c2320p.f9203h = -9223372036854775807L;
        } else {
            if (c2320p.f9203h == -9223372036854775807L) {
                return false;
            }
            c2320p.f9206k.getClass();
            if (android.os.SystemClock.elapsedRealtime() >= c2320p.f9203h) {
                c2320p.f9203h = -9223372036854775807L;
                return false;
            }
        }
        return true;
    }

    @Override // p146j0.AbstractC1717u, p102a0.AbstractC0970e
    /* renamed from: q */
    public final void mo1992q() {
        p112c0.C1232n c1232n = this.f9156R0;
        this.f9180p1 = null;
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f != null) {
            c2310f.f9122j.f9125b.m4519c(0);
        } else {
            this.f9159U0.m4519c(0);
        }
        m4505E0();
        this.f9170f1 = false;
        this.f9184t1 = null;
        try {
            super.mo1992q();
            p102a0.C0972f c0972f = this.f7131K0;
            c1232n.getClass();
            synchronized (c0972f) {
            }
            android.os.Handler handler = c1232n.f4797a;
            if (handler != null) {
                handler.post(new p086W.RunnableC0793m(17, c1232n, c0972f));
            }
            c1232n.m2913b(p076T.C0690d0.f2310e);
        } catch (java.lang.Throwable th) {
            p102a0.C0972f c0972f2 = this.f7131K0;
            c1232n.getClass();
            synchronized (c0972f2) {
                android.os.Handler handler2 = c1232n.f4797a;
                if (handler2 != null) {
                    handler2.post(new p086W.RunnableC0793m(17, c1232n, c0972f2));
                }
                c1232n.m2913b(p076T.C0690d0.f2310e);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, a0.f] */
    @Override // p102a0.AbstractC0970e
    /* renamed from: r */
    public final void mo1993r(boolean z4, boolean z5) {
        this.f7131K0 = new java.lang.Object();
        p102a0.C0985l0 c0985l0 = this.f3542o;
        c0985l0.getClass();
        boolean z6 = c0985l0.f3663b;
        p086W.AbstractC0781a.m1421j((z6 && this.f9183s1 == 0) ? false : true);
        if (this.f9182r1 != z6) {
            this.f9182r1 = z6;
            m3705m0();
        }
        p102a0.C0972f c0972f = this.f7131K0;
        p112c0.C1232n c1232n = this.f9156R0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p206w0.RunnableC2325u(c1232n, c0972f, 4));
        }
        boolean z7 = this.f9165a1;
        p206w0.C2320p c2320p = this.f9159U0;
        if (!z7) {
            if ((this.f9166b1 != null || !this.f9155Q0) && this.f9164Z0 == null) {
                p054N1.C0463r c0463r = new p054N1.C0463r(this.f9154P0, c2320p);
                p086W.C0800t c0800t = this.f3545r;
                c0800t.getClass();
                c0463r.f1356f = c0800t;
                p086W.AbstractC0781a.m1421j(!c0463r.f1351a);
                if (((p206w0.C2307c) c0463r.f1355e) == null) {
                    if (((p206w0.C2306b) c0463r.f1354d) == null) {
                        c0463r.f1354d = new java.lang.Object();
                    }
                    c0463r.f1355e = new p206w0.C2307c((p206w0.C2306b) c0463r.f1354d);
                }
                p206w0.C2311g c2311g = new p206w0.C2311g(c0463r);
                c0463r.f1351a = true;
                this.f9164Z0 = c2311g.f9124a;
            }
            this.f9165a1 = true;
        }
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f == null) {
            p086W.C0800t c0800t2 = this.f3545r;
            c0800t2.getClass();
            c2320p.f9206k = c0800t2;
            c2320p.f9199d = z5 ? 1 : 0;
            return;
        }
        p206w0.C2305a c2305a = new p206w0.C2305a(this);
        p148j2.EnumC1724a enumC1724a = p148j2.EnumC1724a.f7183l;
        c2310f.f9120h = c2305a;
        c2310f.f9121i = enumC1724a;
        p102a0.C0942F c0942f = this.f9185u1;
        if (c0942f != null) {
            c2310f.f9122j.f9131h = c0942f;
        }
        if (this.f9167c1 != null && !this.f9169e1.equals(p086W.C0799s.f2789c)) {
            this.f9164Z0.m4492e(this.f9167c1, this.f9169e1);
        }
        p206w0.C2310f c2310f2 = this.f9164Z0;
        float f4 = this.f7143T;
        p206w0.C2324t c2324t = c2310f2.f9122j.f9126c;
        c2324t.getClass();
        p086W.AbstractC0781a.m1416e(f4 > 0.0f);
        p206w0.C2320p c2320p2 = c2324t.f9230b;
        if (f4 != c2320p2.f9205j) {
            c2320p2.f9205j = f4;
            p206w0.C2323s c2323s = c2320p2.f9197b;
            c2323s.f9220i = f4;
            c2323s.f9224m = 0L;
            c2323s.f9227p = -1L;
            c2323s.f9225n = -1L;
            c2323s.m4527d(false);
        }
        java.util.List list = this.f9166b1;
        if (list != null) {
            p206w0.C2310f c2310f3 = this.f9164Z0;
            java.util.ArrayList arrayList = c2310f3.f9115c;
            if (!arrayList.equals(list)) {
                arrayList.clear();
                arrayList.addAll(list);
                c2310f3.m4490c();
            }
        }
        this.f9164Z0.f9122j.f9125b.f9199d = z5 ? 1 : 0;
    }

    @Override // p146j0.AbstractC1717u, p102a0.AbstractC0970e
    /* renamed from: s */
    public final void mo1994s(long j4, boolean z4) {
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f != null) {
            c2310f.m4488a(true);
            p206w0.C2310f c2310f2 = this.f9164Z0;
            long j5 = this.f7133L0.f7109c;
            c2310f2.getClass();
        }
        super.mo1994s(j4, z4);
        p206w0.C2310f c2310f3 = this.f9164Z0;
        p206w0.C2320p c2320p = this.f9159U0;
        if (c2310f3 == null) {
            p206w0.C2323s c2323s = c2320p.f9197b;
            c2323s.f9224m = 0L;
            c2323s.f9227p = -1L;
            c2323s.f9225n = -1L;
            c2320p.f9202g = -9223372036854775807L;
            c2320p.f9200e = -9223372036854775807L;
            c2320p.m4519c(1);
            c2320p.f9203h = -9223372036854775807L;
        }
        if (z4) {
            c2320p.m4518b(false);
        }
        m4505E0();
        this.f9174j1 = 0;
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: s0 */
    public final boolean mo3710s0(p146j0.C1709m c1709m) {
        return this.f9167c1 != null || m4509I0(c1709m);
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: t */
    public final void mo1995t() {
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f == null || !this.f9155Q0) {
            return;
        }
        p206w0.C2311g c2311g = c2310f.f9122j;
        if (c2311g.f9135l == 2) {
            return;
        }
        p086W.C0802v c0802v = c2311g.f9132i;
        if (c0802v != null) {
            c0802v.f2795a.removeCallbacksAndMessages(null);
        }
        c2311g.f9133j = null;
        c2311g.f9135l = 2;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: u */
    public final void mo1996u() {
        try {
            try {
                m3687I();
                m3705m0();
                p043K2.C0339o c0339o = this.f7139P;
                if (c0339o != null) {
                    c0339o.m752K(null);
                }
                this.f7139P = null;
            } catch (java.lang.Throwable th) {
                p043K2.C0339o c0339o2 = this.f7139P;
                if (c0339o2 != null) {
                    c0339o2.m752K(null);
                }
                this.f7139P = null;
                throw th;
            }
        } finally {
            this.f9165a1 = false;
            if (this.f9168d1 != null) {
                m4506F0();
            }
        }
    }

    @Override // p146j0.AbstractC1717u
    /* renamed from: u0 */
    public final int mo2888u0(p146j0.C1718v c1718v, p076T.C0702p c0702p) {
        boolean z4;
        int i4 = 26;
        int i5 = 0;
        if (!p076T.AbstractC0665H.m1200k(c0702p.f2408m)) {
            return p102a0.AbstractC0970e.m1976f(0, 0, 0, 0);
        }
        boolean z5 = c0702p.f2412q != null;
        android.content.Context context = this.f9154P0;
        java.util.List m4499A0 = m4499A0(context, c1718v, c0702p, z5, false);
        if (z5 && m4499A0.isEmpty()) {
            m4499A0 = m4499A0(context, c1718v, c0702p, false, false);
        }
        if (m4499A0.isEmpty()) {
            return p102a0.AbstractC0970e.m1976f(1, 0, 0, 0);
        }
        int i6 = c0702p.f2394J;
        if (i6 != 0 && i6 != 2) {
            return p102a0.AbstractC0970e.m1976f(2, 0, 0, 0);
        }
        p146j0.C1709m c1709m = (p146j0.C1709m) m4499A0.get(0);
        boolean m3664d = c1709m.m3664d(c0702p);
        if (!m3664d) {
            for (int i7 = 1; i7 < m4499A0.size(); i7++) {
                p146j0.C1709m c1709m2 = (p146j0.C1709m) m4499A0.get(i7);
                if (c1709m2.m3664d(c0702p)) {
                    m3664d = true;
                    z4 = false;
                    c1709m = c1709m2;
                    break;
                }
            }
        }
        z4 = true;
        int i8 = m3664d ? 4 : 3;
        int i9 = c1709m.m3665e(c0702p) ? 16 : 8;
        int i10 = c1709m.f7099g ? 64 : 0;
        int i11 = z4 ? 128 : 0;
        if (p086W.AbstractC0805y.f2801a >= 26 && "video/dolby-vision".equals(c0702p.f2408m) && !p206w0.AbstractC2315k.m4497a(context)) {
            i11 = 256;
        }
        if (m3664d) {
            java.util.List m4499A02 = m4499A0(context, c1718v, c0702p, z5, true);
            if (!m4499A02.isEmpty()) {
                java.util.regex.Pattern pattern = p146j0.AbstractC1696B.f7043a;
                java.util.ArrayList arrayList = new java.util.ArrayList(m4499A02);
                java.util.Collections.sort(arrayList, new p146j0.C1719w(new p009B2.C0067x(i4, c0702p)));
                p146j0.C1709m c1709m3 = (p146j0.C1709m) arrayList.get(0);
                if (c1709m3.m3664d(c0702p) && c1709m3.m3665e(c0702p)) {
                    i5 = 32;
                }
            }
        }
        return i8 | i9 | i5 | i10 | i11;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: v */
    public final void mo1997v() {
        this.f9173i1 = 0;
        this.f3545r.getClass();
        this.f9172h1 = android.os.SystemClock.elapsedRealtime();
        this.f9176l1 = 0L;
        this.f9177m1 = 0;
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f != null) {
            c2310f.f9122j.f9125b.m4520d();
        } else {
            this.f9159U0.m4520d();
        }
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: w */
    public final void mo1998w() {
        m4503C0();
        int i4 = this.f9177m1;
        if (i4 != 0) {
            long j4 = this.f9176l1;
            p112c0.C1232n c1232n = this.f9156R0;
            android.os.Handler handler = c1232n.f4797a;
            if (handler != null) {
                handler.post(new p206w0.RunnableC2325u(c1232n, j4, i4));
            }
            this.f9176l1 = 0L;
            this.f9177m1 = 0;
        }
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f != null) {
            c2310f.f9122j.f9125b.m4521e();
        } else {
            this.f9159U0.m4521e();
        }
    }

    @Override // p146j0.AbstractC1717u, p102a0.AbstractC0970e
    /* renamed from: z */
    public final void mo2001z(long j4, long j5) {
        super.mo2001z(j4, j5);
        p206w0.C2310f c2310f = this.f9164Z0;
        if (c2310f != null) {
            try {
                c2310f.m4491d(j4, j5);
            } catch (p206w0.C2328x e4) {
                throw m1985g(e4, e4.f9245l, false, 7001);
            }
        }
    }
}
