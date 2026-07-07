package p117d0;

/* renamed from: d0.d */
/* loaded from: classes.dex */
public final class C1260d implements p197u0.InterfaceC2222i, p197u0.InterfaceC2228o {

    /* renamed from: l */
    public final /* synthetic */ int f5018l;

    /* renamed from: m */
    public final /* synthetic */ p117d0.C1263g f5019m;

    public /* synthetic */ C1260d(p117d0.C1263g c1263g, int i4) {
        this.f5018l = i4;
        this.f5019m = c1263g;
    }

    @Override // p197u0.InterfaceC2228o
    /* renamed from: a */
    public void mo2967a() {
        p117d0.C1263g c1263g = this.f5019m;
        c1263g.f5042L.mo2967a();
        androidx.datastore.preferences.protobuf.C1113k c1113k = c1263g.f5044N;
        if (c1113k != null) {
            throw c1113k;
        }
    }

    /* renamed from: b */
    public void m2968b() {
        long j4;
        p117d0.C1263g c1263g = this.f5019m;
        synchronized (p202v0.AbstractC2269a.f9006b) {
            try {
                j4 = p202v0.AbstractC2269a.f9007c ? p202v0.AbstractC2269a.f9008d : -9223372036854775807L;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        c1263g.f5053W = j4;
        c1263g.m2973A(true);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v10, types: [u0.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [u0.p, java.lang.Object] */
    @Override // p197u0.InterfaceC2222i
    /* renamed from: k */
    public void mo2969k(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5) {
        switch (this.f5018l) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                p197u0.C2230q c2230q = (p197u0.C2230q) interfaceC2224k;
                p117d0.C1263g c1263g = this.f5019m;
                c1263g.getClass();
                long j6 = c2230q.f8887l;
                android.net.Uri uri = c2230q.f8890o.f3091n;
                p179q0.C2019x c2019x = new p179q0.C2019x(j5);
                c1263g.f5063x.getClass();
                c1263g.f5032B.m3121e(c2019x, c2230q.f8889n);
                p122e0.C1302c c1302c = (p122e0.C1302c) c2230q.f8892q;
                p122e0.C1302c c1302c2 = c1263g.f5049S;
                int size = c1302c2 == null ? 0 : c1302c2.f5229m.size();
                long j7 = c1302c.m3041b(0).f5250b;
                int i4 = 0;
                while (i4 < size && c1263g.f5049S.m3041b(i4).f5250b < j7) {
                    i4++;
                }
                if (c1302c.f5220d) {
                    if (size - i4 > c1302c.f5229m.size()) {
                        p086W.AbstractC0781a.m1410A("DashMediaSource", "Loaded out of sync manifest");
                    } else {
                        long j8 = c1263g.f5055Y;
                        if (j8 == -9223372036854775807L || c1302c.f5224h * 1000 > j8) {
                            c1263g.f5054X = 0;
                        } else {
                            p086W.AbstractC0781a.m1410A("DashMediaSource", "Loaded stale dynamic manifest: " + c1302c.f5224h + ", " + c1263g.f5055Y);
                        }
                    }
                    int i5 = c1263g.f5054X;
                    c1263g.f5054X = i5 + 1;
                    if (i5 < c1263g.f5063x.m4286e(c2230q.f8889n)) {
                        c1263g.f5045O.postDelayed(c1263g.f5037G, java.lang.Math.min((c1263g.f5054X - 1) * 1000, 5000));
                        return;
                    } else {
                        c1263g.f5044N = new java.io.IOException();
                        return;
                    }
                }
                c1263g.f5049S = c1302c;
                c1263g.f5050T = c1302c.f5220d & c1263g.f5050T;
                c1263g.f5051U = j4 - j5;
                c1263g.f5052V = j4;
                c1263g.f5056Z += i4;
                synchronized (c1263g.f5035E) {
                    try {
                        if (c2230q.f8888m.f3135a == c1263g.f5047Q) {
                            android.net.Uri uri2 = c1263g.f5049S.f5227k;
                            if (uri2 == null) {
                                uri2 = c2230q.f8890o.f3091n;
                            }
                            c1263g.f5047Q = uri2;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                p122e0.C1302c c1302c3 = c1263g.f5049S;
                if (!c1302c3.f5220d || c1263g.f5053W != -9223372036854775807L) {
                    c1263g.m2973A(true);
                    return;
                }
                p025F1.C0209a c0209a = c1302c3.f5225i;
                if (c0209a == null) {
                    c1263g.m2982w();
                    return;
                }
                java.lang.String str = c0209a.f583b;
                if (p086W.AbstractC0805y.m1606a(str, "urn:mpeg:dash:utc:direct:2014") || p086W.AbstractC0805y.m1606a(str, "urn:mpeg:dash:utc:direct:2012")) {
                    try {
                        c1263g.f5053W = p086W.AbstractC0805y.m1595P(c0209a.f584c) - c1263g.f5052V;
                        c1263g.m2973A(true);
                        return;
                    } catch (p076T.C0666I e4) {
                        c1263g.m2984z(e4);
                        return;
                    }
                }
                if (p086W.AbstractC0805y.m1606a(str, "urn:mpeg:dash:utc:http-iso:2014") || p086W.AbstractC0805y.m1606a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                    p197u0.C2230q c2230q2 = new p197u0.C2230q(c1263g.f5041K, android.net.Uri.parse(c0209a.f584c), 5, new java.lang.Object());
                    c1263g.f5032B.m3127k(new p179q0.C2019x(c2230q2.f8887l, c2230q2.f8888m, c1263g.f5042L.m4434f(c2230q2, new p117d0.C1260d(c1263g, 4), 1)), c2230q2.f8889n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    return;
                } else if (p086W.AbstractC0805y.m1606a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || p086W.AbstractC0805y.m1606a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    p197u0.C2230q c2230q3 = new p197u0.C2230q(c1263g.f5041K, android.net.Uri.parse(c0209a.f584c), 5, new java.lang.Object());
                    c1263g.f5032B.m3127k(new p179q0.C2019x(c2230q3.f8887l, c2230q3.f8888m, c1263g.f5042L.m4434f(c2230q3, new p117d0.C1260d(c1263g, 4), 1)), c2230q3.f8889n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    return;
                } else if (p086W.AbstractC0805y.m1606a(str, "urn:mpeg:dash:utc:ntp:2014") || p086W.AbstractC0805y.m1606a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    c1263g.m2982w();
                    return;
                } else {
                    c1263g.m2984z(new java.io.IOException("Unsupported UTC timing scheme"));
                    return;
                }
            default:
                p197u0.C2230q c2230q4 = (p197u0.C2230q) interfaceC2224k;
                p117d0.C1263g c1263g2 = this.f5019m;
                c1263g2.getClass();
                long j9 = c2230q4.f8887l;
                android.net.Uri uri3 = c2230q4.f8890o.f3091n;
                p179q0.C2019x c2019x2 = new p179q0.C2019x(j5);
                c1263g2.f5063x.getClass();
                c1263g2.f5032B.m3121e(c2019x2, c2230q4.f8889n);
                c1263g2.f5053W = ((java.lang.Long) c2230q4.f8892q).longValue() - j4;
                c1263g2.m2973A(true);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    @Override // p197u0.InterfaceC2222i
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p128f1.C1383e mo2970q(p197u0.InterfaceC2224k r6, long r7, long r9, java.io.IOException r11, int r12) {
        /*
            r5 = this;
            r7 = 0
            r8 = 1
            d0.g r0 = r5.f5019m
            int r1 = r5.f5018l
            switch(r1) {
                case 2: goto L2b;
                default: goto L9;
            }
        L9:
            u0.q r6 = (p197u0.C2230q) r6
            r0.getClass()
            q0.x r7 = new q0.x
            long r1 = r6.f8887l
            Y.B r12 = r6.f8890o
            android.net.Uri r12 = r12.f3091n
            r7.<init>(r9)
            int r6 = r6.f8889n
            f0.e r9 = r0.f5032B
            r9.m3125i(r7, r6, r11, r8)
            t0.b r6 = r0.f5063x
            r6.getClass()
            r0.m2984z(r11)
            f1.e r6 = p197u0.C2227n.f8882p
            return r6
        L2b:
            u0.q r6 = (p197u0.C2230q) r6
            r0.getClass()
            q0.x r1 = new q0.x
            long r2 = r6.f8887l
            Y.B r2 = r6.f8890o
            android.net.Uri r2 = r2.f3091n
            r1.<init>(r9)
            t0.b r9 = r0.f5063x
            r9.getClass()
            boolean r9 = r11 instanceof p076T.C0666I
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L78
            boolean r9 = r11 instanceof java.io.FileNotFoundException
            if (r9 != 0) goto L78
            boolean r9 = r11 instanceof p094Y.C0882t
            if (r9 != 0) goto L78
            boolean r9 = r11 instanceof p197u0.C2226m
            if (r9 != 0) goto L78
            int r9 = p094Y.C0871i.f3120m
            r9 = r11
        L58:
            if (r9 == 0) goto L6d
            boolean r10 = r9 instanceof p094Y.C0871i
            if (r10 == 0) goto L68
            r10 = r9
            Y.i r10 = (p094Y.C0871i) r10
            int r10 = r10.f3121l
            r4 = 2008(0x7d8, float:2.814E-42)
            if (r10 != r4) goto L68
            goto L78
        L68:
            java.lang.Throwable r9 = r9.getCause()
            goto L58
        L6d:
            int r12 = r12 - r8
            int r12 = r12 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r12, r9)
            long r9 = (long) r9
            goto L79
        L78:
            r9 = r2
        L79:
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 != 0) goto L80
            f1.e r7 = p197u0.C2227n.f8883q
            goto L86
        L80:
            f1.e r12 = new f1.e
            r12.<init>(r7, r9, r7)
            r7 = r12
        L86:
            boolean r9 = r7.m3140a()
            r8 = r8 ^ r9
            f0.e r9 = r0.f5032B
            int r6 = r6.f8889n
            r9.m3125i(r1, r6, r11, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p117d0.C1260d.mo2970q(u0.k, long, long, java.io.IOException, int):f1.e");
    }

    @Override // p197u0.InterfaceC2222i
    /* renamed from: x */
    public void mo2971x(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5, boolean z4) {
        switch (this.f5018l) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f5019m.m2983y((p197u0.C2230q) interfaceC2224k, j4, j5);
                return;
            default:
                this.f5019m.m2983y((p197u0.C2230q) interfaceC2224k, j4, j5);
                return;
        }
    }
}
