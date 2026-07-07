package p136h0;

/* renamed from: h0.b */
/* loaded from: classes.dex */
public final class C1485b implements p197u0.InterfaceC2222i {

    /* renamed from: l */
    public final android.net.Uri f6062l;

    /* renamed from: m */
    public final p197u0.C2227n f6063m = new p197u0.C2227n("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: n */
    public final p094Y.InterfaceC0870h f6064n;

    /* renamed from: o */
    public p136h0.C1492i f6065o;

    /* renamed from: p */
    public long f6066p;

    /* renamed from: q */
    public long f6067q;

    /* renamed from: r */
    public long f6068r;

    /* renamed from: s */
    public long f6069s;

    /* renamed from: t */
    public boolean f6070t;

    /* renamed from: u */
    public java.io.IOException f6071u;

    /* renamed from: v */
    public boolean f6072v;

    /* renamed from: w */
    public final /* synthetic */ p136h0.C1486c f6073w;

    public C1485b(p136h0.C1486c c1486c, android.net.Uri uri) {
        this.f6073w = c1486c;
        this.f6062l = uri;
        this.f6064n = ((p094Y.InterfaceC0869g) c1486c.f6075l.f5729m).mo104a();
    }

    /* renamed from: a */
    public static boolean m3311a(p136h0.C1485b c1485b, long j4) {
        c1485b.f6069s = android.os.SystemClock.elapsedRealtime() + j4;
        p136h0.C1486c c1486c = c1485b.f6073w;
        if (!c1485b.f6062l.equals(c1486c.f6085v)) {
            return false;
        }
        java.util.List list = c1486c.f6084u.f6142e;
        int size = list.size();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        for (int i4 = 0; i4 < size; i4++) {
            p136h0.C1485b c1485b2 = (p136h0.C1485b) c1486c.f6078o.get(((p136h0.C1494k) list.get(i4)).f6134a);
            c1485b2.getClass();
            if (elapsedRealtime > c1485b2.f6069s) {
                android.net.Uri uri = c1485b2.f6062l;
                c1486c.f6085v = uri;
                c1485b2.m3315e(c1486c.m3318b(uri));
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final android.net.Uri m3312b() {
        p136h0.C1492i c1492i = this.f6065o;
        android.net.Uri uri = this.f6062l;
        if (c1492i != null) {
            p136h0.C1491h c1491h = c1492i.f6130v;
            if (c1491h.f6107a != -9223372036854775807L || c1491h.f6111e) {
                android.net.Uri.Builder buildUpon = uri.buildUpon();
                p136h0.C1492i c1492i2 = this.f6065o;
                if (c1492i2.f6130v.f6111e) {
                    buildUpon.appendQueryParameter("_HLS_msn", java.lang.String.valueOf(c1492i2.f6119k + c1492i2.f6126r.size()));
                    p136h0.C1492i c1492i3 = this.f6065o;
                    if (c1492i3.f6122n != -9223372036854775807L) {
                        p129f2.AbstractC1393I abstractC1393I = c1492i3.f6127s;
                        int size = abstractC1393I.size();
                        if (!abstractC1393I.isEmpty() && ((p136h0.C1487d) p129f2.AbstractC1444r.m3232l(abstractC1393I)).f6090x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", java.lang.String.valueOf(size));
                    }
                }
                p136h0.C1491h c1491h2 = this.f6065o.f6130v;
                if (c1491h2.f6107a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", c1491h2.f6108b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    /* renamed from: c */
    public final void m3313c(boolean z4) {
        m3315e(z4 ? m3312b() : this.f6062l);
    }

    /* renamed from: d */
    public final void m3314d(android.net.Uri uri) {
        p136h0.C1486c c1486c = this.f6073w;
        p197u0.C2230q c2230q = new p197u0.C2230q(this.f6064n, uri, 4, c1486c.f6076m.mo596j(c1486c.f6084u, this.f6065o));
        p193t0.C2164b c2164b = c1486c.f6077n;
        int i4 = c2230q.f8889n;
        c1486c.f6080q.m3127k(new p179q0.C2019x(c2230q.f8887l, c2230q.f8888m, this.f6063m.m4434f(c2230q, this, c2164b.m4286e(i4))), i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: e */
    public final void m3315e(android.net.Uri uri) {
        this.f6069s = 0L;
        if (this.f6070t) {
            return;
        }
        p197u0.C2227n c2227n = this.f6063m;
        if (c2227n.m4432d() || c2227n.m4431c()) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j4 = this.f6068r;
        if (elapsedRealtime >= j4) {
            m3314d(uri);
        } else {
            this.f6070t = true;
            this.f6073w.f6082s.postDelayed(new p086W.RunnableC0793m(7, this, uri), j4 - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3316f(p136h0.C1492i r65, p179q0.C2019x r66) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p136h0.C1485b.m3316f(h0.i, q0.x):void");
    }

    @Override // p197u0.InterfaceC2222i
    /* renamed from: k */
    public final void mo2969k(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5) {
        p197u0.C2230q c2230q = (p197u0.C2230q) interfaceC2224k;
        p136h0.AbstractC1496m abstractC1496m = (p136h0.AbstractC1496m) c2230q.f8892q;
        android.net.Uri uri = c2230q.f8890o.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        if (abstractC1496m instanceof p136h0.C1492i) {
            m3316f((p136h0.C1492i) abstractC1496m, c2019x);
            this.f6073w.f6080q.m3121e(c2019x, 4);
        } else {
            p076T.C0666I m1203b = p076T.C0666I.m1203b("Loaded playlist has unexpected type.", null);
            this.f6071u = m1203b;
            this.f6073w.f6080q.m3125i(c2019x, 4, m1203b, true);
        }
        this.f6073w.f6077n.getClass();
    }

    @Override // p197u0.InterfaceC2222i
    /* renamed from: q */
    public final p128f1.C1383e mo2970q(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5, java.io.IOException iOException, int i4) {
        p197u0.C2230q c2230q = (p197u0.C2230q) interfaceC2224k;
        long j6 = c2230q.f8887l;
        android.net.Uri uri = c2230q.f8890o.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        boolean z4 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z5 = iOException instanceof p136h0.C1497n;
        p128f1.C1383e c1383e = p197u0.C2227n.f8882p;
        p136h0.C1486c c1486c = this.f6073w;
        int i5 = c2230q.f8889n;
        if (z4 || z5) {
            int i6 = iOException instanceof p094Y.C0885w ? ((p094Y.C0885w) iOException).f3173o : Integer.MAX_VALUE;
            if (z5 || i6 == 400 || i6 == 503) {
                this.f6068r = android.os.SystemClock.elapsedRealtime();
                m3313c(false);
                p127f0.C1372e c1372e = c1486c.f6080q;
                int i7 = p086W.AbstractC0805y.f2801a;
                c1372e.m3125i(c2019x, i5, iOException, true);
                return c1383e;
            }
        }
        p006B.C0020c c0020c = new p006B.C0020c(i4, iOException);
        java.util.Iterator it = c1486c.f6079p.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= !((p136h0.InterfaceC1500q) it.next()).mo3283d(this.f6062l, c0020c, false);
        }
        p193t0.C2164b c2164b = c1486c.f6077n;
        if (z6) {
            c2164b.getClass();
            long m4285f = p193t0.C2164b.m4285f(c0020c);
            c1383e = m4285f != -9223372036854775807L ? new p128f1.C1383e(0, m4285f, false) : p197u0.C2227n.f8883q;
        }
        boolean m3140a = c1383e.m3140a();
        c1486c.f6080q.m3125i(c2019x, i5, iOException, true ^ m3140a);
        if (!m3140a) {
            c2164b.getClass();
        }
        return c1383e;
    }

    @Override // p197u0.InterfaceC2222i
    /* renamed from: x */
    public final void mo2971x(p197u0.InterfaceC2224k interfaceC2224k, long j4, long j5, boolean z4) {
        p197u0.C2230q c2230q = (p197u0.C2230q) interfaceC2224k;
        long j6 = c2230q.f8887l;
        android.net.Uri uri = c2230q.f8890o.f3091n;
        p179q0.C2019x c2019x = new p179q0.C2019x(j5);
        p136h0.C1486c c1486c = this.f6073w;
        c1486c.f6077n.getClass();
        c1486c.f6080q.m3119c(c2019x, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
