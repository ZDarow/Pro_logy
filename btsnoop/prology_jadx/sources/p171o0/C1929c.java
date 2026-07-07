package p171o0;

/* renamed from: o0.c */
/* loaded from: classes.dex */
public final class C1929c extends p179q0.AbstractC1984a implements p197u0.InterfaceC2222i {

    /* renamed from: A */
    public final p127f0.C1372e f7843A;

    /* renamed from: B */
    public final p197u0.InterfaceC2229p f7844B;

    /* renamed from: C */
    public final java.util.ArrayList f7845C;

    /* renamed from: D */
    public p094Y.InterfaceC0870h f7846D;

    /* renamed from: E */
    public p197u0.C2227n f7847E;

    /* renamed from: F */
    public p197u0.InterfaceC2228o f7848F;

    /* renamed from: G */
    public p094Y.InterfaceC0860C f7849G;

    /* renamed from: H */
    public long f7850H;

    /* renamed from: I */
    public p175p0.C1944c f7851I;

    /* renamed from: J */
    public android.os.Handler f7852J;

    /* renamed from: K */
    public p076T.C0659B f7853K;

    /* renamed from: s */
    public final boolean f7854s;

    /* renamed from: t */
    public final android.net.Uri f7855t;

    /* renamed from: u */
    public final p094Y.InterfaceC0869g f7856u;

    /* renamed from: v */
    public final p096Y1.C0890a f7857v;

    /* renamed from: w */
    public final p046L1.C0363g f7858w;

    /* renamed from: x */
    public final p127f0.InterfaceC1376i f7859x;

    /* renamed from: y */
    public final p193t0.C2164b f7860y;

    /* renamed from: z */
    public final long f7861z;

    static {
        p076T.AbstractC0660C.m1179a("media3.exoplayer.smoothstreaming");
    }

    public C1929c(p076T.C0659B c0659b, p094Y.InterfaceC0869g interfaceC0869g, p197u0.InterfaceC2229p interfaceC2229p, p096Y1.C0890a c0890a, p046L1.C0363g c0363g, p127f0.InterfaceC1376i interfaceC1376i, p193t0.C2164b c2164b, long j4) {
        this.f7853K = c0659b;
        p076T.C0711y c0711y = c0659b.f2143b;
        c0711y.getClass();
        this.f7851I = null;
        android.net.Uri uri = android.net.Uri.EMPTY;
        android.net.Uri uri2 = c0711y.f2449a;
        if (uri2.equals(uri)) {
            uri2 = null;
        } else {
            java.lang.String path = uri2.getPath();
            if (path != null) {
                java.util.regex.Matcher matcher = p086W.AbstractC0805y.f2810j.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri2 = android.net.Uri.withAppendedPath(uri2, "Manifest");
                }
            }
        }
        this.f7855t = uri2;
        this.f7856u = interfaceC0869g;
        this.f7844B = interfaceC2229p;
        this.f7857v = c0890a;
        this.f7858w = c0363g;
        this.f7859x = interfaceC1376i;
        this.f7860y = c2164b;
        this.f7861z = j4;
        this.f7843A = m4031a(null);
        this.f7854s = false;
        this.f7845C = new java.util.ArrayList();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: b */
    public final p179q0.InterfaceC1962D mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        p127f0.C1372e m4031a = m4031a(c1964f);
        p127f0.C1372e c1372e = new p127f0.C1372e(this.f8114o.f5650c, 0, c1964f);
        p175p0.C1944c c1944c = this.f7851I;
        p094Y.InterfaceC0860C interfaceC0860C = this.f7849G;
        p197u0.InterfaceC2228o interfaceC2228o = this.f7848F;
        p171o0.C1928b c1928b = new p171o0.C1928b(c1944c, this.f7857v, interfaceC0860C, this.f7858w, this.f7859x, c1372e, this.f7860y, m4031a, interfaceC2228o, c2218e);
        this.f7845C.add(c1928b);
        return c1928b;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: h */
    public final synchronized p076T.C0659B mo2976h() {
        return this.f7853K;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: j */
    public final void mo2977j() {
        this.f7848F.mo2967a();
    }

    @Override // p197u0.InterfaceC2222i
    /* renamed from: k */
    public final void mo2969k(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5) {
        p197u0.C2230q c2230q = (p197u0.C2230q) interfaceC2224k;
        long j6 = c2230q.f8887l;
        android.net.Uri uri = c2230q.f8890o.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        this.f7860y.getClass();
        this.f7843A.m3121e(c2019x, c2230q.f8889n);
        this.f7851I = (p175p0.C1944c) c2230q.f8892q;
        this.f7850H = j4 - j5;
        m3885v();
        if (this.f7851I.f7904d) {
            this.f7852J.postDelayed(new p026F2.RunnableC0226c(9, this), java.lang.Math.max(0L, (this.f7850H + 5000) - android.os.SystemClock.elapsedRealtime()));
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [u0.o, java.lang.Object] */
    @Override // p179q0.AbstractC1984a
    /* renamed from: m */
    public final void mo2978m(p094Y.InterfaceC0860C interfaceC0860C) {
        this.f7849G = interfaceC0860C;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        p107b0.C1177l c1177l = this.f8117r;
        p086W.AbstractC0781a.m1422k(c1177l);
        p127f0.InterfaceC1376i interfaceC1376i = this.f7859x;
        interfaceC1376i.mo3131b(myLooper, c1177l);
        interfaceC1376i.m3134c();
        if (this.f7854s) {
            this.f7848F = new java.lang.Object();
            m3885v();
            return;
        }
        this.f7846D = this.f7856u.mo104a();
        p197u0.C2227n c2227n = new p197u0.C2227n("SsMediaSource");
        this.f7847E = c2227n;
        this.f7848F = c2227n;
        this.f7852J = p086W.AbstractC0805y.m1619n(null);
        m3886w();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: o */
    public final void mo2979o(p179q0.InterfaceC1962D interfaceC1962D) {
        p171o0.C1928b c1928b = (p171o0.C1928b) interfaceC1962D;
        for (p184r0.C2050h c2050h : c1928b.f7841x) {
            c2050h.m4106B(null);
        }
        c1928b.f7839v = null;
        this.f7845C.remove(interfaceC1962D);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    @Override // p197u0.InterfaceC2222i
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p128f1.C1383e mo2970q(p197u0.InterfaceC2224k r4, long r5, long r7, java.io.IOException r9, int r10) {
        /*
            r3 = this;
            r5 = 0
            u0.q r4 = (p197u0.C2230q) r4
            q0.x r6 = new q0.x
            long r0 = r4.f8887l
            Y.B r0 = r4.f8890o
            android.net.Uri r0 = r0.f3091n
            r6.<init>(r7)
            t0.b r7 = r3.f7860y
            r7.getClass()
            boolean r7 = r9 instanceof p076T.C0666I
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof p094Y.C0882t
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof p197u0.C2226m
            if (r7 != 0) goto L4c
            int r7 = p094Y.C0871i.f3120m
            r7 = r9
        L2b:
            if (r7 == 0) goto L40
            boolean r8 = r7 instanceof p094Y.C0871i
            if (r8 == 0) goto L3b
            r8 = r7
            Y.i r8 = (p094Y.C0871i) r8
            int r8 = r8.f3121l
            r2 = 2008(0x7d8, float:2.814E-42)
            if (r8 != r2) goto L3b
            goto L4c
        L3b:
            java.lang.Throwable r7 = r7.getCause()
            goto L2b
        L40:
            int r10 = r10 + (-1)
            int r10 = r10 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r10, r7)
            long r7 = (long) r7
            goto L4d
        L4c:
            r7 = r0
        L4d:
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 != 0) goto L54
            f1.e r5 = p197u0.C2227n.f8883q
            goto L5a
        L54:
            f1.e r10 = new f1.e
            r10.<init>(r5, r7, r5)
            r5 = r10
        L5a:
            boolean r7 = r5.m3140a()
            r7 = r7 ^ 1
            f0.e r8 = r3.f7843A
            int r4 = r4.f8889n
            r8.m3125i(r6, r4, r9, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p171o0.C1929c.mo2970q(u0.k, long, long, java.io.IOException, int):f1.e");
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: r */
    public final void mo2980r() {
        this.f7851I = this.f7854s ? this.f7851I : null;
        this.f7846D = null;
        this.f7850H = 0L;
        p197u0.C2227n c2227n = this.f7847E;
        if (c2227n != null) {
            c2227n.m4433e(null);
            this.f7847E = null;
        }
        android.os.Handler handler = this.f7852J;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f7852J = null;
        }
        this.f7859x.release();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: u */
    public final synchronized void mo2981u(p076T.C0659B c0659b) {
        this.f7853K = c0659b;
    }

    /* renamed from: v */
    public final void m3885v() {
        p179q0.C1999h0 c1999h0;
        p184r0.C2050h[] c2050hArr;
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f7845C;
            if (i4 >= arrayList.size()) {
                break;
            }
            p171o0.C1928b c1928b = (p171o0.C1928b) arrayList.get(i4);
            p175p0.C1944c c1944c = this.f7851I;
            c1928b.f7840w = c1944c;
            p184r0.C2050h[] c2050hArr2 = c1928b.f7841x;
            int length = c2050hArr2.length;
            int i5 = 0;
            while (i5 < length) {
                p171o0.C1927a c1927a = (p171o0.C1927a) c2050hArr2[i5].f8357p;
                p175p0.C1943b[] c1943bArr = c1927a.f7826f.f7906f;
                int i6 = c1927a.f7822b;
                p175p0.C1943b c1943b = c1943bArr[i6];
                int i7 = c1943b.f7895k;
                p175p0.C1943b c1943b2 = c1944c.f7906f[i6];
                if (i7 == 0 || c1943b2.f7895k == 0) {
                    c2050hArr = c2050hArr2;
                    c1927a.f7827g += i7;
                } else {
                    int i8 = i7 - 1;
                    long[] jArr = c1943b.f7899o;
                    long m3898b = c1943b.m3898b(i8) + jArr[i8];
                    c2050hArr = c2050hArr2;
                    long j4 = c1943b2.f7899o[0];
                    if (m3898b <= j4) {
                        c1927a.f7827g += i7;
                    } else {
                        c1927a.f7827g = p086W.AbstractC0805y.m1611f(jArr, j4, true) + c1927a.f7827g;
                    }
                }
                c1927a.f7826f = c1944c;
                i5++;
                c2050hArr2 = c2050hArr;
            }
            p179q0.InterfaceC1961C interfaceC1961C = c1928b.f7839v;
            interfaceC1961C.getClass();
            interfaceC1961C.mo1906f(c1928b);
            i4++;
        }
        long j5 = Long.MIN_VALUE;
        long j6 = Long.MAX_VALUE;
        for (p175p0.C1943b c1943b3 : this.f7851I.f7906f) {
            if (c1943b3.f7895k > 0) {
                long[] jArr2 = c1943b3.f7899o;
                j6 = java.lang.Math.min(j6, jArr2[0]);
                int i9 = c1943b3.f7895k - 1;
                j5 = java.lang.Math.max(j5, c1943b3.m3898b(i9) + jArr2[i9]);
            }
        }
        if (j6 == Long.MAX_VALUE) {
            long j7 = this.f7851I.f7904d ? -9223372036854775807L : 0L;
            p175p0.C1944c c1944c2 = this.f7851I;
            boolean z4 = c1944c2.f7904d;
            c1999h0 = new p179q0.C1999h0(j7, 0L, 0L, 0L, true, z4, z4, c1944c2, mo2976h());
        } else {
            p175p0.C1944c c1944c3 = this.f7851I;
            if (c1944c3.f7904d) {
                long j8 = c1944c3.f7908h;
                if (j8 != -9223372036854775807L && j8 > 0) {
                    j6 = java.lang.Math.max(j6, j5 - j8);
                }
                long j9 = j6;
                long j10 = j5 - j9;
                long m1592M = j10 - p086W.AbstractC0805y.m1592M(this.f7861z);
                if (m1592M < 5000000) {
                    m1592M = java.lang.Math.min(5000000L, j10 / 2);
                }
                c1999h0 = new p179q0.C1999h0(-9223372036854775807L, j10, j9, m1592M, true, true, true, this.f7851I, mo2976h());
            } else {
                long j11 = c1944c3.f7907g;
                long j12 = j11 != -9223372036854775807L ? j11 : j5 - j6;
                c1999h0 = new p179q0.C1999h0(-9223372036854775807L, -9223372036854775807L, j6 + j12, j12, j6, 0L, true, false, false, this.f7851I, mo2976h(), null);
            }
        }
        m4039n(c1999h0);
    }

    /* renamed from: w */
    public final void m3886w() {
        if (this.f7847E.m4431c()) {
            return;
        }
        p197u0.C2230q c2230q = new p197u0.C2230q(this.f7846D, this.f7855t, 4, this.f7844B);
        p197u0.C2227n c2227n = this.f7847E;
        p193t0.C2164b c2164b = this.f7860y;
        int i4 = c2230q.f8889n;
        this.f7843A.m3127k(new p179q0.C2019x(c2230q.f8887l, c2230q.f8888m, c2227n.m4434f(c2230q, this, c2164b.m4286e(i4))), i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p197u0.InterfaceC2222i
    /* renamed from: x */
    public final void mo2971x(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5, boolean z4) {
        p197u0.C2230q c2230q = (p197u0.C2230q) interfaceC2224k;
        long j6 = c2230q.f8887l;
        android.net.Uri uri = c2230q.f8890o.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        this.f7860y.getClass();
        this.f7843A.m3119c(c2019x, c2230q.f8889n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
