package p086W;

/* renamed from: W.m */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0793m implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f2769l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f2770m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f2771n;

    public /* synthetic */ RunnableC0793m(int i4, java.lang.Object obj, java.lang.Object obj2) {
        this.f2769l = i4;
        this.f2770m = obj;
        this.f2771n = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v51, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.io.IOException] */
    @Override // java.lang.Runnable
    public final void run() {
        long j4;
        boolean z4;
        boolean z5;
        java.lang.String str;
        p129f2.C1415c0 m3164m;
        p129f2.C1408Y c1408y;
        long j5 = -9223372036854775807L;
        boolean z6 = false;
        boolean z7 = true;
        z7 = true;
        switch (this.f2769l) {
            case 0:
                ((p197u0.C2219f) this.f2771n).m4424a(((p086W.C0796p) this.f2770m).m1508d());
                return;
            case 1:
                p047L2.C0378h c0378h = ((p093X2.C0849j) this.f2770m).f3042d;
                if (c0378h != null) {
                    c0378h.m830c((byte[]) this.f2771n);
                    return;
                }
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                p102a0.C0944H c0944h = (p102a0.C0944H) this.f2770m;
                p102a0.C0947K c0947k = (p102a0.C0947K) this.f2771n;
                int i4 = c0944h.f3325E - c0947k.f3384a;
                c0944h.f3325E = i4;
                if (c0947k.f3386c) {
                    c0944h.f3326F = c0947k.f3387d;
                    c0944h.f3327G = true;
                }
                if (i4 == 0) {
                    p076T.AbstractC0677U abstractC0677U = ((p102a0.C0973f0) c0947k.f3388e).f3579a;
                    if (!c0944h.f3355e0.f3579a.m1256p() && abstractC0677U.m1256p()) {
                        c0944h.f3357f0 = -1;
                        c0944h.f3359g0 = 0L;
                    }
                    if (!abstractC0677U.m1256p()) {
                        java.util.List asList = java.util.Arrays.asList(((p102a0.C0983k0) abstractC0677U).f3656i);
                        p086W.AbstractC0781a.m1421j(asList.size() == c0944h.f3367o.size());
                        for (int i5 = 0; i5 < asList.size(); i5++) {
                            ((p102a0.C0943G) c0944h.f3367o.get(i5)).f3320b = (p076T.AbstractC0677U) asList.get(i5);
                        }
                    }
                    if (c0944h.f3327G) {
                        if (((p102a0.C0973f0) c0947k.f3388e).f3580b.equals(c0944h.f3355e0.f3580b) && ((p102a0.C0973f0) c0947k.f3388e).f3582d == c0944h.f3355e0.f3597s) {
                            z7 = false;
                        }
                        if (z7) {
                            if (abstractC0677U.m1256p() || ((p102a0.C0973f0) c0947k.f3388e).f3580b.m3968b()) {
                                j5 = ((p102a0.C0973f0) c0947k.f3388e).f3582d;
                            } else {
                                p102a0.C0973f0 c0973f0 = (p102a0.C0973f0) c0947k.f3388e;
                                p179q0.C1964F c1964f = c0973f0.f3580b;
                                long j6 = c0973f0.f3582d;
                                java.lang.Object obj = c1964f.f7960a;
                                p076T.C0675S c0675s = c0944h.f3366n;
                                abstractC0677U.mo1251g(obj, c0675s);
                                j5 = j6 + c0675s.f2227e;
                            }
                        }
                        j4 = j5;
                        z5 = z7;
                        z4 = false;
                    } else {
                        j4 = -9223372036854775807L;
                        z4 = false;
                        z5 = false;
                    }
                    c0944h.f3327G = z4;
                    c0944h.m1846S((p102a0.C0973f0) c0947k.f3388e, 1, z5, c0944h.f3326F, j4, -1, false);
                    return;
                }
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                p102a0.C0979i0 c0979i0 = (p102a0.C0979i0) this.f2771n;
                ((p102a0.C0950N) this.f2770m).getClass();
                try {
                    synchronized (c0979i0) {
                    }
                    try {
                        c0979i0.f3625a.mo1824d(c0979i0.f3628d, c0979i0.f3629e);
                        return;
                    } finally {
                        c0979i0.m2022b(true);
                    }
                } catch (p102a0.C0986m e4) {
                    p086W.AbstractC0781a.m1426o("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
                    throw new java.lang.RuntimeException(e4);
                }
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                p112c0.C1232n c1232n = (p112c0.C1232n) this.f2770m;
                p102a0.C0972f c0972f = (p102a0.C0972f) this.f2771n;
                c1232n.getClass();
                synchronized (c0972f) {
                }
                p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E = c1232n.f4798b;
                int i6 = p086W.AbstractC0805y.f2801a;
                p107b0.C1170e c1170e = surfaceHolderCallbackC0941E.f3316a.f3370r;
                c1170e.m2742K(c1170e.m2739G((p179q0.C1964F) c1170e.f4500o.f379e), 1013, new p107b0.C1168c(9));
                return;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                p112c0.C1212K c1212k = (p112c0.C1212K) this.f2771n;
                p112c0.C1232n c1232n2 = ((p112c0.C1214M) ((p043K2.C0339o) this.f2770m).f1048m).f4724Q0;
                android.os.Handler handler = c1232n2.f4797a;
                if (handler != null) {
                    handler.post(new p112c0.RunnableC1231m(c1232n2, c1212k, 2));
                    return;
                }
                return;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((p136h0.C1485b) ((p132g0.C1467l) ((p132g0.C1473r) this.f2770m).f5989n.f5729m).f5911m.f6078o.get(((p132g0.C1466k) this.f2771n).f5899x)).m3313c(true);
                return;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                p136h0.C1485b c1485b = (p136h0.C1485b) this.f2770m;
                c1485b.f6070t = false;
                c1485b.m3314d((android.net.Uri) this.f2771n);
                return;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                ((androidx.profileinstaller.ProfileInstallerInitializer) this.f2770m).getClass();
                (android.os.Build.VERSION.SDK_INT >= 28 ? p142i1.AbstractC1543h.m3431a(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper())).postDelayed(new p142i1.RunnableC1540e((android.content.Context) this.f2771n, 0), new java.util.Random().nextInt(java.lang.Math.max(1000, 1)) + 5000);
                return;
            case 9:
                p094Y.C0886x c0886x = (p094Y.C0886x) this.f2770m;
                p129f2.AbstractC1393I abstractC1393I = (p129f2.AbstractC1393I) this.f2771n;
                p161m0.C1856m c1856m = (p161m0.C1856m) c0886x.f3176n;
                c1856m.getClass();
                java.util.regex.Pattern pattern = p161m0.AbstractC1869z.f7600a;
                if (!p161m0.AbstractC1869z.f7601b.matcher((java.lang.CharSequence) abstractC1393I.get(0)).matches()) {
                    java.util.regex.Matcher matcher = p161m0.AbstractC1869z.f7600a.matcher((java.lang.CharSequence) abstractC1393I.get(0));
                    p086W.AbstractC0781a.m1416e(matcher.matches());
                    java.lang.String group = matcher.group(1);
                    group.getClass();
                    p161m0.AbstractC1869z.m3843a(group);
                    java.lang.String group2 = matcher.group(2);
                    group2.getClass();
                    android.net.Uri.parse(group2);
                    int indexOf = abstractC1393I.indexOf("");
                    p086W.AbstractC0781a.m1416e(indexOf > 0);
                    java.util.List subList = abstractC1393I.subList(1, indexOf);
                    p129f2.C1408Y c1408y2 = new p129f2.C1408Y(15);
                    c1408y2.m3199t(subList);
                    p161m0.C1857n m3201v = c1408y2.m3201v();
                    new p124e2.C1358f(p161m0.AbstractC1869z.f7607h).m3115b(abstractC1393I.subList(indexOf + 1, abstractC1393I.size()));
                    java.lang.String m3822c = m3201v.m3822c("CSeq");
                    m3822c.getClass();
                    int parseInt = java.lang.Integer.parseInt(m3822c);
                    p063P2.C0528a c0528a = c1856m.f7529r;
                    p161m0.C1856m c1856m2 = (p161m0.C1856m) c0528a.f1553n;
                    p063P2.C0528a c0528a2 = new p063P2.C0528a(405, new p129f2.C1408Y(parseInt, c1856m2.f7525n, c1856m2.f7533v).m3201v(), "");
                    p161m0.C1857n c1857n = (p161m0.C1857n) c0528a2.f1552m;
                    p086W.AbstractC0781a.m1416e(c1857n.m3822c("CSeq") != null);
                    p129f2.C1390F c1390f = new p129f2.C1390F();
                    int i7 = c0528a2.f1551l;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i7);
                    if (i7 == 200) {
                        str = "OK";
                    } else if (i7 == 461) {
                        str = "Unsupported Transport";
                    } else if (i7 == 500) {
                        str = "Internal Server Error";
                    } else if (i7 == 505) {
                        str = "RTSP Version Not Supported";
                    } else if (i7 == 301) {
                        str = "Move Permanently";
                    } else if (i7 == 302) {
                        str = "Move Temporarily";
                    } else if (i7 == 400) {
                        str = "Bad Request";
                    } else if (i7 == 401) {
                        str = "Unauthorized";
                    } else if (i7 == 404) {
                        str = "Not Found";
                    } else if (i7 != 405) {
                        switch (i7) {
                            case 454:
                                str = "Session Not Found";
                                break;
                            case 455:
                                str = "Method Not Valid In This State";
                                break;
                            case 456:
                                str = "Header Field Not Valid";
                                break;
                            case 457:
                                str = "Invalid Range";
                                break;
                            default:
                                throw new java.lang.IllegalArgumentException();
                        }
                    } else {
                        str = "Method Not Allowed";
                    }
                    c1390f.m3147c(p086W.AbstractC0805y.m1620o("%s %s %s", "RTSP/1.0", valueOf, str));
                    p129f2.C1394J m3821a = c1857n.m3821a();
                    p129f2.AbstractC1445r0 it = m3821a.m3173e().iterator();
                    while (it.hasNext()) {
                        java.lang.String str2 = (java.lang.String) it.next();
                        p129f2.AbstractC1393I m3172d = m3821a.m3172d(str2);
                        for (int i8 = 0; i8 < m3172d.size(); i8++) {
                            c1390f.m3147c(p086W.AbstractC0805y.m1620o("%s: %s", str2, m3172d.get(i8)));
                        }
                    }
                    c1390f.m3147c("");
                    c1390f.m3147c((java.lang.String) c0528a2.f1553n);
                    c1856m2.f7531t.m3842b(c1390f.m3157g());
                    c0528a.f1551l = java.lang.Math.max(c0528a.f1551l, parseInt + 1);
                    return;
                }
                java.util.regex.Matcher matcher2 = p161m0.AbstractC1869z.f7601b.matcher((java.lang.CharSequence) abstractC1393I.get(0));
                p086W.AbstractC0781a.m1416e(matcher2.matches());
                java.lang.String group3 = matcher2.group(1);
                group3.getClass();
                int parseInt2 = java.lang.Integer.parseInt(group3);
                int indexOf2 = abstractC1393I.indexOf("");
                p086W.AbstractC0781a.m1416e(indexOf2 > 0);
                java.util.List subList2 = abstractC1393I.subList(1, indexOf2);
                p129f2.C1408Y c1408y3 = new p129f2.C1408Y(15);
                c1408y3.m3199t(subList2);
                p063P2.C0528a c0528a3 = new p063P2.C0528a(parseInt2, new p161m0.C1857n(c1408y3), new p124e2.C1358f(p161m0.AbstractC1869z.f7607h).m3115b(abstractC1393I.subList(indexOf2 + 1, abstractC1393I.size())));
                p161m0.C1857n c1857n2 = (p161m0.C1857n) c0528a3.f1552m;
                java.lang.String m3822c2 = c1857n2.m3822c("CSeq");
                p086W.AbstractC0781a.m1419h(m3822c2);
                int parseInt3 = java.lang.Integer.parseInt(m3822c2);
                p161m0.C1836A c1836a = (p161m0.C1836A) p161m0.C1856m.m3815e(c1856m).get(parseInt3);
                if (c1836a == null) {
                    return;
                }
                p161m0.C1856m.m3815e(c1856m).remove(parseInt3);
                int i9 = c0528a3.f1551l;
                int i10 = c1836a.f7403b;
                try {
                    try {
                        if (i9 == 200) {
                            switch (i10) {
                                case 1:
                                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                                case 9:
                                case 11:
                                case 12:
                                    return;
                                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                                    c0886x.m1717U(new p094Y.C0886x(22, c1857n2, p161m0.AbstractC1841F.m3803a((java.lang.String) c0528a3.f1553n)));
                                    return;
                                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                                    c0886x.m1718V(new p129f2.C1408Y(p161m0.AbstractC1869z.m3844b(c1857n2.m3822c("Public"))));
                                    return;
                                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                                    c0886x.m1719W();
                                    return;
                                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                                    java.lang.String m3822c3 = c1857n2.m3822c("Range");
                                    p161m0.C1837B m3800a = m3822c3 == null ? p161m0.C1837B.f7406c : p161m0.C1837B.m3800a(m3822c3);
                                    try {
                                        java.lang.String m3822c4 = c1857n2.m3822c("RTP-Info");
                                        m3164m = m3822c4 == null ? p129f2.AbstractC1393I.m3164m() : p161m0.C1838C.m3801a(m3822c4, p161m0.C1856m.m3813b(c1856m));
                                    } catch (p076T.C0666I unused) {
                                        m3164m = p129f2.AbstractC1393I.m3164m();
                                    }
                                    c0886x.m1720X(new p094Y.C0886x(m3800a, m3164m));
                                    return;
                                case 10:
                                    java.lang.String m3822c5 = c1857n2.m3822c("Session");
                                    java.lang.String m3822c6 = c1857n2.m3822c("Transport");
                                    if (m3822c5 == null || m3822c6 == null) {
                                        throw p076T.C0666I.m1203b("Missing mandatory session or transport header", null);
                                    }
                                    c0886x.m1721Y(new p129f2.C1408Y(20, p161m0.AbstractC1869z.m3845c(m3822c5)));
                                    return;
                                default:
                                    throw new java.lang.IllegalStateException();
                            }
                        }
                        if (i9 == 401) {
                            if (c1856m.f7532u == null || c1856m.f7520B) {
                                p161m0.C1856m.m3814c(c1856m, new androidx.datastore.preferences.protobuf.C1113k(p161m0.AbstractC1869z.m3850h(i10) + " " + i9));
                                return;
                            }
                            c1857n2.getClass();
                            p129f2.AbstractC1393I m3172d2 = c1857n2.f7538a.m3172d(p161m0.C1857n.m3820b("WWW-Authenticate"));
                            if (m3172d2.isEmpty()) {
                                throw p076T.C0666I.m1203b("Missing WWW-Authenticate header in a 401 response.", null);
                            }
                            for (int i11 = 0; i11 < m3172d2.size(); i11++) {
                                c1856m.f7536y = p161m0.AbstractC1869z.m3847e((java.lang.String) m3172d2.get(i11));
                                if (c1856m.f7536y.f2774a == 2) {
                                    p161m0.C1856m.m3812a(c1856m).m1029j();
                                    c1856m.f7520B = true;
                                    return;
                                }
                            }
                            p161m0.C1856m.m3812a(c1856m).m1029j();
                            c1856m.f7520B = true;
                            return;
                        }
                        if (i9 == 461) {
                            java.lang.String str3 = p161m0.AbstractC1869z.m3850h(i10) + " " + i9;
                            java.lang.String m3822c7 = c1836a.f7404c.m3822c("Transport");
                            p086W.AbstractC0781a.m1419h(m3822c7);
                            p161m0.C1856m.m3814c(c1856m, (i10 != 10 || m3822c7.contains("TCP")) ? new androidx.datastore.preferences.protobuf.C1113k(str3) : new java.io.IOException(str3));
                            return;
                        }
                        if (i9 != 301 && i9 != 302) {
                            p161m0.C1856m.m3814c(c1856m, new androidx.datastore.preferences.protobuf.C1113k(p161m0.AbstractC1869z.m3850h(i10) + " " + i9));
                            return;
                        }
                        if (c1856m.f7537z != -1) {
                            c1856m.f7537z = 0;
                        }
                        java.lang.String m3822c8 = c1857n2.m3822c("Location");
                        if (m3822c8 == null) {
                            c1856m.f7523l.m3187F("Redirection without new location.", null);
                            return;
                        }
                        android.net.Uri parse = android.net.Uri.parse(m3822c8);
                        c1856m.f7530s = p161m0.AbstractC1869z.m3848f(parse);
                        c1856m.f7532u = p161m0.AbstractC1869z.m3846d(parse);
                        p161m0.C1856m.m3812a(c1856m).m1030k(c1856m.f7533v, p161m0.C1856m.m3813b(c1856m));
                        return;
                    } catch (java.lang.IllegalArgumentException e5) {
                        e = e5;
                        p161m0.C1856m.m3814c(c1856m, new java.io.IOException(e));
                        return;
                    }
                } catch (p076T.C0666I e6) {
                    e = e6;
                    p161m0.C1856m.m3814c(c1856m, new java.io.IOException(e));
                    return;
                }
            case 10:
                p161m0.C1867x c1867x = (p161m0.C1867x) this.f2770m;
                byte[] bArr = (byte[]) this.f2771n;
                c1867x.getClass();
                try {
                    c1867x.f7589l.write(bArr);
                    return;
                } catch (java.lang.Exception unused2) {
                    if (c1867x.f7592o.f7599q) {
                        return;
                    }
                    p094Y.C0886x c0886x2 = c1867x.f7592o.f7594l;
                    return;
                }
            case 11:
                p179q0.C1977T c1977t = (p179q0.C1977T) this.f2770m;
                p045L0.C0355b c0355b = c1977t.f8016C;
                p215y0.InterfaceC2414z interfaceC2414z = (p215y0.InterfaceC2414z) this.f2771n;
                c1977t.f8024K = c0355b == null ? interfaceC2414z : new p002A0.C0004b(-9223372036854775807L);
                c1977t.f8025L = interfaceC2414z.mo33i();
                if (!c1977t.f8031R && interfaceC2414z.mo33i() == -9223372036854775807L) {
                    z6 = true;
                }
                c1977t.f8026M = z6;
                c1977t.f8027N = z6 ? 7 : 1;
                if (c1977t.f8020G) {
                    c1977t.f8044r.m4000w(c1977t.f8025L, interfaceC2414z.mo31c(), c1977t.f8026M);
                    return;
                } else {
                    c1977t.m3998z();
                    return;
                }
            case 12:
                ((p073S0.C0629g) this.f2770m).m1147e((android.graphics.Typeface) this.f2771n);
                return;
            case 13:
                p204v2.C2278h c2278h = (p204v2.C2278h) this.f2770m;
                c2278h.getClass();
                p204v2.C2277g c2277g = (p204v2.C2277g) this.f2771n;
                c2277g.f9029b.run();
                c2278h.f9035f = c2277g;
                c2278h.f9034e.run();
                return;
            case 14:
                p043K2.C0329e c0329e = (p043K2.C0329e) this.f2770m;
                p204v2.C2278h c2278h2 = (p204v2.C2278h) this.f2771n;
                synchronized (c0329e) {
                    java.util.HashSet hashSet = new java.util.HashSet((java.util.HashSet) c0329e.f1000p);
                    ((java.util.HashSet) c0329e.f1001q).remove(c2278h2);
                    ((java.util.HashSet) c0329e.f1000p).add(c2278h2);
                    p204v2.C2277g c2277g2 = c2278h2.f9035f;
                    if (c2277g2 == null || (c1408y = c2277g2.f9028a) == null || !((p204v2.C2276f) c1408y.f5729m).m4473j()) {
                        p204v2.C2277g c2277g3 = c2278h2.f9035f;
                        if ((c2277g3 != null ? c2277g3.m4476a() : null) != null) {
                            java.util.HashMap hashMap = (java.util.HashMap) c0329e.f1002r;
                            p204v2.C2277g c2277g4 = c2278h2.f9035f;
                            hashMap.remove(c2277g4 != null ? c2277g4.m4476a() : null);
                        }
                    }
                    c0329e.m730f(c2278h2);
                    java.util.Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        c0329e.m730f((p204v2.C2278h) it2.next());
                    }
                }
                return;
            case 15:
                p112c0.C1232n c1232n3 = (p112c0.C1232n) this.f2770m;
                c1232n3.getClass();
                int i12 = p086W.AbstractC0805y.f2801a;
                p102a0.C0944H c0944h2 = c1232n3.f4798b.f3316a;
                p076T.C0690d0 c0690d0 = (p076T.C0690d0) this.f2771n;
                c0944h2.f3351c0 = c0690d0;
                c0944h2.f3364l.m1444e(25, new p102a0.C0940D(c0690d0));
                return;
            case 16:
                p112c0.C1232n c1232n4 = (p112c0.C1232n) this.f2770m;
                c1232n4.getClass();
                int i13 = p086W.AbstractC0805y.f2801a;
                p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E2 = c1232n4.f4798b;
                p076T.C0702p c0702p = (p076T.C0702p) this.f2771n;
                p102a0.C0944H c0944h3 = surfaceHolderCallbackC0941E2.f3316a;
                c0944h3.f3333M = c0702p;
                p107b0.C1170e c1170e2 = c0944h3.f3370r;
                c1170e2.m2742K(c1170e2.m2741J(), 1017, new p107b0.C1168c(11));
                return;
            default:
                p112c0.C1232n c1232n5 = (p112c0.C1232n) this.f2770m;
                p102a0.C0972f c0972f2 = (p102a0.C0972f) this.f2771n;
                c1232n5.getClass();
                synchronized (c0972f2) {
                }
                p102a0.SurfaceHolderCallbackC0941E surfaceHolderCallbackC0941E3 = c1232n5.f4798b;
                int i14 = p086W.AbstractC0805y.f2801a;
                p102a0.C0944H c0944h4 = surfaceHolderCallbackC0941E3.f3316a;
                p107b0.C1170e c1170e3 = c0944h4.f3370r;
                p107b0.C1166a m2739G = c1170e3.m2739G((p179q0.C1964F) c1170e3.f4500o.f379e);
                c1170e3.m2742K(m2739G, 1020, new p009B2.C0067x(m2739G, (java.lang.Object) c0972f2, 21));
                c0944h4.f3333M = null;
                return;
        }
    }

    public /* synthetic */ RunnableC0793m(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i4) {
        this.f2769l = i4;
        this.f2770m = obj;
        this.f2771n = obj2;
    }
}
