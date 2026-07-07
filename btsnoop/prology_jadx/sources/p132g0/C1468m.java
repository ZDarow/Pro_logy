package p132g0;

/* renamed from: g0.m */
/* loaded from: classes.dex */
public final class C1468m extends p179q0.AbstractC1984a {

    /* renamed from: A */
    public final long f5925A;

    /* renamed from: B */
    public p076T.C0710x f5926B;

    /* renamed from: C */
    public p094Y.InterfaceC0860C f5927C;

    /* renamed from: D */
    public p076T.C0659B f5928D;

    /* renamed from: s */
    public final p132g0.C1458c f5929s;

    /* renamed from: t */
    public final p129f2.C1408Y f5930t;

    /* renamed from: u */
    public final p046L1.C0363g f5931u;

    /* renamed from: v */
    public final p127f0.InterfaceC1376i f5932v;

    /* renamed from: w */
    public final p193t0.C2164b f5933w;

    /* renamed from: x */
    public final boolean f5934x;

    /* renamed from: y */
    public final int f5935y;

    /* renamed from: z */
    public final p136h0.C1486c f5936z;

    static {
        p076T.AbstractC0660C.m1179a("media3.exoplayer.hls");
    }

    public C1468m(p076T.C0659B c0659b, p129f2.C1408Y c1408y, p132g0.C1458c c1458c, p046L1.C0363g c0363g, p127f0.InterfaceC1376i interfaceC1376i, p193t0.C2164b c2164b, p136h0.C1486c c1486c, long j4, boolean z4, int i4) {
        this.f5928D = c0659b;
        this.f5926B = c0659b.f2144c;
        this.f5930t = c1408y;
        this.f5929s = c1458c;
        this.f5931u = c0363g;
        this.f5932v = interfaceC1376i;
        this.f5933w = c2164b;
        this.f5936z = c1486c;
        this.f5925A = j4;
        this.f5934x = z4;
        this.f5935y = i4;
    }

    /* renamed from: v */
    public static p136h0.C1487d m3285v(p129f2.AbstractC1393I abstractC1393I, long j4) {
        p136h0.C1487d c1487d = null;
        for (int i4 = 0; i4 < abstractC1393I.size(); i4++) {
            p136h0.C1487d c1487d2 = (p136h0.C1487d) abstractC1393I.get(i4);
            long j5 = c1487d2.f6100p;
            if (j5 > j4 || !c1487d2.f6089w) {
                if (j5 > j4) {
                    break;
                }
            } else {
                c1487d = c1487d2;
            }
        }
        return c1487d;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: b */
    public final p179q0.InterfaceC1962D mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        p127f0.C1372e m4031a = m4031a(c1964f);
        p127f0.C1372e c1372e = new p127f0.C1372e(this.f8114o.f5650c, 0, c1964f);
        p094Y.InterfaceC0860C interfaceC0860C = this.f5927C;
        p107b0.C1177l c1177l = this.f8117r;
        p086W.AbstractC0781a.m1422k(c1177l);
        return new p132g0.C1467l(this.f5929s, this.f5936z, this.f5930t, interfaceC0860C, this.f5932v, c1372e, this.f5933w, m4031a, c2218e, this.f5931u, this.f5934x, this.f5935y, c1177l);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: h */
    public final synchronized p076T.C0659B mo2976h() {
        return this.f5928D;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: j */
    public final void mo2977j() {
        p136h0.C1486c c1486c = this.f5936z;
        p197u0.C2227n c2227n = c1486c.f6081r;
        if (c2227n != null) {
            c2227n.mo2967a();
        }
        android.net.Uri uri = c1486c.f6085v;
        if (uri != null) {
            p136h0.C1485b c1485b = (p136h0.C1485b) c1486c.f6078o.get(uri);
            c1485b.f6063m.mo2967a();
            java.io.IOException iOException = c1485b.f6071u;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: m */
    public final void mo2978m(p094Y.InterfaceC0860C interfaceC0860C) {
        this.f5927C = interfaceC0860C;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        myLooper.getClass();
        p107b0.C1177l c1177l = this.f8117r;
        p086W.AbstractC0781a.m1422k(c1177l);
        p127f0.InterfaceC1376i interfaceC1376i = this.f5932v;
        interfaceC1376i.mo3131b(myLooper, c1177l);
        interfaceC1376i.m3134c();
        p127f0.C1372e m4031a = m4031a(null);
        p076T.C0711y c0711y = mo2976h().f2143b;
        c0711y.getClass();
        p136h0.C1486c c1486c = this.f5936z;
        c1486c.getClass();
        c1486c.f6082s = p086W.AbstractC0805y.m1619n(null);
        c1486c.f6080q = m4031a;
        c1486c.f6083t = this;
        p197u0.C2230q c2230q = new p197u0.C2230q(((p094Y.InterfaceC0869g) c1486c.f6075l.f5729m).mo104a(), c0711y.f2449a, 4, c1486c.f6076m.mo602q());
        p086W.AbstractC0781a.m1421j(c1486c.f6081r == null);
        p197u0.C2227n c2227n = new p197u0.C2227n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        c1486c.f6081r = c2227n;
        p193t0.C2164b c2164b = c1486c.f6077n;
        int i4 = c2230q.f8889n;
        m4031a.m3127k(new p179q0.C2019x(c2230q.f8887l, c2230q.f8888m, c2227n.m4434f(c2230q, c1486c, c2164b.m4286e(i4))), i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: o */
    public final void mo2979o(p179q0.InterfaceC1962D interfaceC1962D) {
        p132g0.C1467l c1467l = (p132g0.C1467l) interfaceC1962D;
        c1467l.f5911m.f6079p.remove(c1467l);
        for (p132g0.C1473r c1473r : c1467l.f5906E) {
            if (c1473r.f5966O) {
                for (p132g0.C1472q c1472q : c1473r.f5958G) {
                    c1472q.m4012g();
                    p043K2.C0339o c0339o = c1472q.f8092h;
                    if (c0339o != null) {
                        c0339o.m752K(c1472q.f8089e);
                        c1472q.f8092h = null;
                        c1472q.f8091g = null;
                    }
                }
            }
            p132g0.C1464i c1464i = c1473r.f5990o;
            p136h0.C1485b c1485b = (p136h0.C1485b) c1464i.f5860g.f6078o.get(c1464i.f5858e[c1464i.f5870q.mo3969a()]);
            if (c1485b != null) {
                c1485b.f6072v = false;
            }
            c1464i.f5867n = null;
            c1473r.f5996u.m4433e(c1473r);
            c1473r.f5954C.removeCallbacksAndMessages(null);
            c1473r.f5970S = true;
            c1473r.f5955D.clear();
        }
        c1467l.f5903B = null;
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: r */
    public final void mo2980r() {
        p136h0.C1486c c1486c = this.f5936z;
        c1486c.f6085v = null;
        c1486c.f6086w = null;
        c1486c.f6084u = null;
        c1486c.f6088y = -9223372036854775807L;
        c1486c.f6081r.m4433e(null);
        c1486c.f6081r = null;
        java.util.HashMap hashMap = c1486c.f6078o;
        java.util.Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((p136h0.C1485b) it.next()).f6063m.m4433e(null);
        }
        c1486c.f6082s.removeCallbacksAndMessages(null);
        c1486c.f6082s = null;
        hashMap.clear();
        this.f5932v.release();
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: u */
    public final synchronized void mo2981u(p076T.C0659B c0659b) {
        this.f5928D = c0659b;
    }

    /* renamed from: w */
    public final void m3286w(p136h0.C1492i c1492i) {
        p179q0.C1999h0 c1999h0;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z4 = c1492i.f6124p;
        long j8 = c1492i.f6116h;
        long m1605Z = z4 ? p086W.AbstractC0805y.m1605Z(j8) : -9223372036854775807L;
        int i4 = c1492i.f6112d;
        long j9 = (i4 == 2 || i4 == 1) ? m1605Z : -9223372036854775807L;
        p136h0.C1486c c1486c = this.f5936z;
        c1486c.f6084u.getClass();
        p046L1.C0363g c0363g = new p046L1.C0363g(18, false);
        boolean z5 = c1486c.f6087x;
        long j10 = c1492i.f6129u;
        p129f2.AbstractC1393I abstractC1393I = c1492i.f6126r;
        boolean z6 = c1492i.f6115g;
        long j11 = m1605Z;
        long j12 = c1492i.f6113e;
        if (z5) {
            long j13 = j9;
            long j14 = j8 - c1486c.f6088y;
            boolean z7 = c1492i.f6123o;
            long j15 = z7 ? j14 + j10 : -9223372036854775807L;
            long m1592M = c1492i.f6124p ? p086W.AbstractC0805y.m1592M(p086W.AbstractC0805y.m1631z(this.f5925A)) - (j8 + j10) : 0L;
            long j16 = this.f5926B.f2444a;
            p136h0.C1491h c1491h = c1492i.f6130v;
            if (j16 != -9223372036854775807L) {
                j5 = p086W.AbstractC0805y.m1592M(j16);
            } else {
                if (j12 != -9223372036854775807L) {
                    j4 = j10 - j12;
                } else {
                    long j17 = c1491h.f6110d;
                    if (j17 == -9223372036854775807L || c1492i.f6122n == -9223372036854775807L) {
                        j4 = c1491h.f6109c;
                        if (j4 == -9223372036854775807L) {
                            j4 = c1492i.f6121m * 3;
                        }
                    } else {
                        j4 = j17;
                    }
                }
                j5 = j4 + m1592M;
            }
            long j18 = j10 + m1592M;
            long m1616k = p086W.AbstractC0805y.m1616k(j5, m1592M, j18);
            p076T.C0710x c0710x = mo2976h().f2144c;
            boolean z8 = c0710x.f2447d == -3.4028235E38f && c0710x.f2448e == -3.4028235E38f && c1491h.f6109c == -9223372036854775807L && c1491h.f6110d == -9223372036854775807L;
            p076T.C0709w c0709w = new p076T.C0709w();
            c0709w.f2439a = p086W.AbstractC0805y.m1605Z(m1616k);
            c0709w.f2442d = z8 ? 1.0f : this.f5926B.f2447d;
            c0709w.f2443e = z8 ? 1.0f : this.f5926B.f2448e;
            p076T.C0710x c0710x2 = new p076T.C0710x(c0709w);
            this.f5926B = c0710x2;
            if (j12 == -9223372036854775807L) {
                j12 = j18 - p086W.AbstractC0805y.m1592M(c0710x2.f2444a);
            }
            if (z6) {
                j7 = j12;
            } else {
                p136h0.C1487d m3285v = m3285v(c1492i.f6127s, j12);
                if (m3285v != null) {
                    j6 = m3285v.f6100p;
                } else if (abstractC1393I.isEmpty()) {
                    j7 = 0;
                } else {
                    p136h0.C1489f c1489f = (p136h0.C1489f) abstractC1393I.get(p086W.AbstractC0805y.m1609d(abstractC1393I, java.lang.Long.valueOf(j12), true));
                    p136h0.C1487d m3285v2 = m3285v(c1489f.f6095x, j12);
                    j6 = m3285v2 != null ? m3285v2.f6100p : c1489f.f6100p;
                }
                j7 = j6;
            }
            c1999h0 = new p179q0.C1999h0(j13, j11, j15, c1492i.f6129u, j14, j7, true, !z7, i4 == 2 && c1492i.f6114f, c0363g, mo2976h(), this.f5926B);
        } else {
            long j19 = j9;
            long j20 = (j12 == -9223372036854775807L || abstractC1393I.isEmpty()) ? 0L : (z6 || j12 == j10) ? j12 : ((p136h0.C1489f) abstractC1393I.get(p086W.AbstractC0805y.m1609d(abstractC1393I, java.lang.Long.valueOf(j12), true))).f6100p;
            p076T.C0659B mo2976h = mo2976h();
            long j21 = c1492i.f6129u;
            c1999h0 = new p179q0.C1999h0(j19, j11, j21, j21, 0L, j20, true, false, true, c0363g, mo2976h, null);
        }
        m4039n(c1999h0);
    }
}
