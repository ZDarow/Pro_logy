package p136h0;

/* renamed from: h0.c */
/* loaded from: classes.dex */
public final class C1486c implements p197u0.InterfaceC2222i {

    /* renamed from: z */
    public static final p107b0.C1169d f6074z = new p107b0.C1169d(13);

    /* renamed from: l */
    public final p129f2.C1408Y f6075l;

    /* renamed from: m */
    public final p136h0.InterfaceC1499p f6076m;

    /* renamed from: n */
    public final p193t0.C2164b f6077n;

    /* renamed from: q */
    public p127f0.C1372e f6080q;

    /* renamed from: r */
    public p197u0.C2227n f6081r;

    /* renamed from: s */
    public android.os.Handler f6082s;

    /* renamed from: t */
    public p132g0.C1468m f6083t;

    /* renamed from: u */
    public p136h0.C1495l f6084u;

    /* renamed from: v */
    public android.net.Uri f6085v;

    /* renamed from: w */
    public p136h0.C1492i f6086w;

    /* renamed from: x */
    public boolean f6087x;

    /* renamed from: p */
    public final java.util.concurrent.CopyOnWriteArrayList f6079p = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: o */
    public final java.util.HashMap f6078o = new java.util.HashMap();

    /* renamed from: y */
    public long f6088y = -9223372036854775807L;

    public C1486c(p129f2.C1408Y c1408y, p193t0.C2164b c2164b, p136h0.InterfaceC1499p interfaceC1499p) {
        this.f6075l = c1408y;
        this.f6076m = interfaceC1499p;
        this.f6077n = c2164b;
    }

    /* renamed from: a */
    public final p136h0.C1492i m3317a(boolean z4, android.net.Uri uri) {
        java.util.HashMap hashMap = this.f6078o;
        p136h0.C1492i c1492i = ((p136h0.C1485b) hashMap.get(uri)).f6065o;
        if (c1492i != null && z4) {
            if (!uri.equals(this.f6085v)) {
                java.util.List list = this.f6084u.f6142e;
                int i4 = 0;
                while (true) {
                    if (i4 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((p136h0.C1494k) list.get(i4)).f6134a)) {
                        p136h0.C1492i c1492i2 = this.f6086w;
                        if (c1492i2 == null || !c1492i2.f6123o) {
                            this.f6085v = uri;
                            p136h0.C1485b c1485b = (p136h0.C1485b) hashMap.get(uri);
                            p136h0.C1492i c1492i3 = c1485b.f6065o;
                            if (c1492i3 == null || !c1492i3.f6123o) {
                                c1485b.m3315e(m3318b(uri));
                            } else {
                                this.f6086w = c1492i3;
                                this.f6083t.m3286w(c1492i3);
                            }
                        }
                    } else {
                        i4++;
                    }
                }
            }
            p136h0.C1485b c1485b2 = (p136h0.C1485b) hashMap.get(uri);
            p136h0.C1492i c1492i4 = c1485b2.f6065o;
            if (!c1485b2.f6072v) {
                c1485b2.f6072v = true;
                if (c1492i4 != null && !c1492i4.f6123o) {
                    c1485b2.m3313c(true);
                }
            }
        }
        return c1492i;
    }

    /* renamed from: b */
    public final android.net.Uri m3318b(android.net.Uri uri) {
        p136h0.C1488e c1488e;
        p136h0.C1492i c1492i = this.f6086w;
        if (c1492i == null || !c1492i.f6130v.f6111e || (c1488e = (p136h0.C1488e) c1492i.f6128t.get(uri)) == null) {
            return uri;
        }
        android.net.Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", java.lang.String.valueOf(c1488e.f6092b));
        int i4 = c1488e.f6093c;
        if (i4 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", java.lang.String.valueOf(i4));
        }
        return buildUpon.build();
    }

    /* renamed from: c */
    public final boolean m3319c(android.net.Uri uri) {
        int i4;
        p136h0.C1485b c1485b = (p136h0.C1485b) this.f6078o.get(uri);
        if (c1485b.f6065o == null) {
            return false;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long max = java.lang.Math.max(30000L, p086W.AbstractC0805y.m1605Z(c1485b.f6065o.f6129u));
        p136h0.C1492i c1492i = c1485b.f6065o;
        return c1492i.f6123o || (i4 = c1492i.f6112d) == 2 || i4 == 1 || c1485b.f6066p + max > elapsedRealtime;
    }

    @Override // p197u0.InterfaceC2222i
    /* renamed from: k */
    public final void mo2969k(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5) {
        p136h0.C1495l c1495l;
        p197u0.C2230q c2230q = (p197u0.C2230q) interfaceC2224k;
        p136h0.AbstractC1496m abstractC1496m = (p136h0.AbstractC1496m) c2230q.f8892q;
        boolean z4 = abstractC1496m instanceof p136h0.C1492i;
        if (z4) {
            java.lang.String str = abstractC1496m.f6149a;
            p136h0.C1495l c1495l2 = p136h0.C1495l.f6140l;
            android.net.Uri parse = android.net.Uri.parse(str);
            p076T.C0701o c0701o = new p076T.C0701o();
            c0701o.f2359a = "0";
            c0701o.f2369k = p076T.AbstractC0665H.m1201l("application/x-mpegURL");
            c1495l = new p136h0.C1495l("", java.util.Collections.emptyList(), java.util.Collections.singletonList(new p136h0.C1494k(parse, new p076T.C0702p(c0701o), null, null, null, null)), java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), null, null, false, java.util.Collections.emptyMap(), java.util.Collections.emptyList());
        } else {
            c1495l = (p136h0.C1495l) abstractC1496m;
        }
        this.f6084u = c1495l;
        this.f6085v = ((p136h0.C1494k) c1495l.f6142e.get(0)).f6134a;
        this.f6079p.add(new p136h0.C1484a(this));
        java.util.List list = c1495l.f6141d;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            android.net.Uri uri = (android.net.Uri) list.get(i4);
            this.f6078o.put(uri, new p136h0.C1485b(this, uri));
        }
        android.net.Uri uri2 = c2230q.f8890o.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        p136h0.C1485b c1485b = (p136h0.C1485b) this.f6078o.get(this.f6085v);
        if (z4) {
            c1485b.m3316f((p136h0.C1492i) abstractC1496m, c2019x);
        } else {
            c1485b.m3313c(false);
        }
        this.f6077n.getClass();
        this.f6080q.m3121e(c2019x, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // p197u0.InterfaceC2222i
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p128f1.C1383e mo2970q(p197u0.InterfaceC2224k r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            r6 = 0
            u0.q r5 = (p197u0.C2230q) r5
            q0.x r7 = new q0.x
            long r0 = r5.f8887l
            Y.B r0 = r5.f8890o
            android.net.Uri r0 = r0.f3091n
            r7.<init>(r8)
            t0.b r8 = r4.f6077n
            r8.getClass()
            boolean r8 = r10 instanceof p076T.C0666I
            r9 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof java.io.FileNotFoundException
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof p094Y.C0882t
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof p197u0.C2226m
            if (r8 != 0) goto L4c
            int r8 = p094Y.C0871i.f3120m
            r8 = r10
        L2c:
            if (r8 == 0) goto L41
            boolean r2 = r8 instanceof p094Y.C0871i
            if (r2 == 0) goto L3c
            r2 = r8
            Y.i r2 = (p094Y.C0871i) r2
            int r2 = r2.f3121l
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r2 != r3) goto L3c
            goto L4c
        L3c:
            java.lang.Throwable r8 = r8.getCause()
            goto L2c
        L41:
            int r11 = r11 - r9
            int r11 = r11 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r8 = java.lang.Math.min(r11, r8)
            long r2 = (long) r8
            goto L4d
        L4c:
            r2 = r0
        L4d:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L53
        L52:
            r9 = r6
        L53:
            f0.e r8 = r4.f6080q
            int r5 = r5.f8889n
            r8.m3125i(r7, r5, r10, r9)
            if (r9 == 0) goto L5f
            f1.e r5 = p197u0.C2227n.f8883q
            goto L64
        L5f:
            f1.e r5 = new f1.e
            r5.<init>(r6, r2, r6)
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p136h0.C1486c.mo2970q(u0.k, long, long, java.io.IOException, int):f1.e");
    }

    @Override // p197u0.InterfaceC2222i
    /* renamed from: x */
    public final void mo2971x(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5, boolean z4) {
        p197u0.C2230q c2230q = (p197u0.C2230q) interfaceC2224k;
        long j6 = c2230q.f8887l;
        android.net.Uri uri = c2230q.f8890o.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        this.f6077n.getClass();
        this.f6080q.m3119c(c2019x, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
