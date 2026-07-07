package p166n0;

/* renamed from: n0.d */
/* loaded from: classes.dex */
public final class C1888d implements p166n0.InterfaceC1893i {

    /* renamed from: l */
    public final /* synthetic */ int f7675l;

    /* renamed from: m */
    public final p161m0.C1854k f7676m;

    /* renamed from: n */
    public p215y0.InterfaceC2387F f7677n;

    /* renamed from: o */
    public long f7678o;

    /* renamed from: p */
    public long f7679p;

    /* renamed from: q */
    public int f7680q;

    /* renamed from: r */
    public int f7681r;

    /* renamed from: s */
    public long f7682s;

    /* renamed from: t */
    public int f7683t;

    /* renamed from: u */
    public int f7684u;

    /* renamed from: v */
    public boolean f7685v;

    /* renamed from: w */
    public boolean f7686w;

    /* renamed from: x */
    public boolean f7687x;

    public C1888d(p161m0.C1854k c1854k, int i4) {
        this.f7675l = i4;
        switch (i4) {
            case 1:
                this.f7676m = c1854k;
                this.f7678o = -9223372036854775807L;
                this.f7681r = -1;
                this.f7682s = -9223372036854775807L;
                this.f7679p = 0L;
                this.f7680q = -1;
                this.f7683t = -1;
                this.f7684u = -1;
                return;
            default:
                this.f7676m = c1854k;
                this.f7678o = -9223372036854775807L;
                this.f7681r = -1;
                return;
        }
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: b */
    public final void mo982b(long j4, long j5) {
        switch (this.f7675l) {
            case 0:
                this.f7678o = j4;
                this.f7680q = 0;
                this.f7679p = j5;
                return;
            default:
                this.f7678o = j4;
                this.f7681r = -1;
                this.f7679p = j5;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p166n0.InterfaceC1893i
    /* renamed from: c */
    public final void mo983c(p086W.C0798r c0798r, long j4, int i4, boolean z4) {
        int i5;
        int i6;
        p161m0.C1854k c1854k = this.f7676m;
        switch (this.f7675l) {
            case 0:
                p086W.AbstractC0781a.m1422k(this.f7677n);
                int i7 = c0798r.f2787b;
                int m1531A = c0798r.m1531A();
                java.lang.Object[] objArr = (m1531A & 1024) > 0;
                if ((m1531A & 512) != 0 || (m1531A & 504) != 0 || (m1531A & 7) != 0) {
                    p086W.AbstractC0781a.m1410A("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                    return;
                }
                if (objArr == true) {
                    if (this.f7687x && this.f7680q > 0) {
                        p215y0.InterfaceC2387F interfaceC2387F = this.f7677n;
                        interfaceC2387F.getClass();
                        interfaceC2387F.mo1406b(this.f7682s, this.f7685v ? 1 : 0, this.f7680q, 0, null);
                        this.f7680q = 0;
                        this.f7682s = -9223372036854775807L;
                        this.f7685v = false;
                        this.f7687x = false;
                    }
                    this.f7687x = true;
                    if ((c0798r.m1543e() & 252) < 128) {
                        p086W.AbstractC0781a.m1410A("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                        return;
                    }
                    byte[] bArr = c0798r.f2786a;
                    bArr[i7] = 0;
                    bArr[i7 + 1] = 0;
                    c0798r.m1537G(i7);
                } else {
                    if (!this.f7687x) {
                        p086W.AbstractC0781a.m1410A("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        return;
                    }
                    int m3811a = p161m0.C1852i.m3811a(this.f7681r);
                    if (i4 < m3811a) {
                        int i8 = p086W.AbstractC0805y.f2801a;
                        java.util.Locale locale = java.util.Locale.US;
                        p086W.AbstractC0781a.m1410A("RtpH263Reader", "Received RTP packet with unexpected sequence number. Expected: " + m3811a + "; received: " + i4 + ". Dropping packet.");
                        return;
                    }
                }
                if (this.f7680q == 0) {
                    boolean z5 = this.f7686w;
                    int i9 = c0798r.f2787b;
                    if (((c0798r.m1561w() >> 10) & 63) == 32) {
                        int m1543e = c0798r.m1543e();
                        int i10 = (m1543e >> 1) & 1;
                        if (!z5 && i10 == 0) {
                            int i11 = (m1543e >> 2) & 7;
                            if (i11 == 1) {
                                this.f7683t = 128;
                                this.f7684u = 96;
                            } else {
                                int i12 = i11 - 2;
                                this.f7683t = 176 << i12;
                                this.f7684u = 144 << i12;
                            }
                        }
                        c0798r.m1537G(i9);
                        this.f7685v = i10 == 0;
                    } else {
                        c0798r.m1537G(i9);
                        this.f7685v = false;
                    }
                    if (!this.f7686w && this.f7685v) {
                        int i13 = this.f7683t;
                        p076T.C0702p c0702p = c1854k.f7512c;
                        if (i13 != c0702p.f2414s || this.f7684u != c0702p.f2415t) {
                            p215y0.InterfaceC2387F interfaceC2387F2 = this.f7677n;
                            p076T.C0701o m1295a = c0702p.m1295a();
                            m1295a.f2376r = this.f7683t;
                            m1295a.f2377s = this.f7684u;
                            p009B2.AbstractC0051h.m158q(m1295a, interfaceC2387F2);
                        }
                        this.f7686w = true;
                    }
                }
                int m1539a = c0798r.m1539a();
                this.f7677n.mo1405a(c0798r, m1539a, 0);
                this.f7680q += m1539a;
                this.f7682s = p080U1.AbstractC0748a.m1363K(this.f7679p, j4, this.f7678o, 90000);
                if (z4) {
                    p215y0.InterfaceC2387F interfaceC2387F3 = this.f7677n;
                    interfaceC2387F3.getClass();
                    interfaceC2387F3.mo1406b(this.f7682s, this.f7685v ? 1 : 0, this.f7680q, 0, null);
                    this.f7680q = 0;
                    this.f7682s = -9223372036854775807L;
                    this.f7685v = false;
                    this.f7687x = false;
                }
                this.f7681r = i4;
                return;
            default:
                p086W.AbstractC0781a.m1422k(this.f7677n);
                int m1559u = c0798r.m1559u();
                if ((m1559u & 8) == 8) {
                    if (this.f7685v && this.f7681r > 0) {
                        p215y0.InterfaceC2387F interfaceC2387F4 = this.f7677n;
                        interfaceC2387F4.getClass();
                        interfaceC2387F4.mo1406b(this.f7682s, this.f7687x ? 1 : 0, this.f7681r, 0, null);
                        this.f7681r = -1;
                        this.f7682s = -9223372036854775807L;
                        this.f7685v = false;
                    }
                    this.f7685v = true;
                } else {
                    if (!this.f7685v) {
                        p086W.AbstractC0781a.m1410A("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                        return;
                    }
                    int m3811a2 = p161m0.C1852i.m3811a(this.f7680q);
                    if (i4 < m3811a2) {
                        int i14 = p086W.AbstractC0805y.f2801a;
                        java.util.Locale locale2 = java.util.Locale.US;
                        p086W.AbstractC0781a.m1410A("RtpVp9Reader", "Received RTP packet with unexpected sequence number. Expected: " + m3811a2 + "; received: " + i4 + ". Dropping packet.");
                        return;
                    }
                }
                if ((m1559u & 128) == 0 || (c0798r.m1559u() & 128) == 0 || c0798r.m1539a() >= 1) {
                    int i15 = m1559u & 16;
                    p086W.AbstractC0781a.m1415d("VP9 flexible mode is not supported.", i15 == 0);
                    if ((m1559u & 32) != 0) {
                        c0798r.m1538H(1);
                        if (c0798r.m1539a() < 1) {
                            return;
                        }
                        if (i15 == 0) {
                            c0798r.m1538H(1);
                        }
                    }
                    if ((m1559u & 2) != 0) {
                        int m1559u2 = c0798r.m1559u();
                        int i16 = (m1559u2 >> 5) & 7;
                        if ((m1559u2 & 16) != 0) {
                            int i17 = i16 + 1;
                            if (c0798r.m1539a() < i17 * 4) {
                                return;
                            }
                            for (int i18 = 0; i18 < i17; i18++) {
                                this.f7683t = c0798r.m1531A();
                                this.f7684u = c0798r.m1531A();
                            }
                        }
                        if ((m1559u2 & 8) != 0) {
                            int m1559u3 = c0798r.m1559u();
                            if (c0798r.m1539a() < m1559u3) {
                                return;
                            }
                            for (int i19 = 0; i19 < m1559u3; i19++) {
                                int m1531A2 = (c0798r.m1531A() & 12) >> 2;
                                if (c0798r.m1539a() < m1531A2) {
                                    return;
                                }
                                c0798r.m1538H(m1531A2);
                            }
                        }
                    }
                    if (this.f7681r == -1 && this.f7685v) {
                        this.f7687x = (c0798r.m1543e() & 4) == 0;
                    }
                    if (!this.f7686w && (i5 = this.f7683t) != -1 && (i6 = this.f7684u) != -1) {
                        p076T.C0702p c0702p2 = c1854k.f7512c;
                        if (i5 != c0702p2.f2414s || i6 != c0702p2.f2415t) {
                            p215y0.InterfaceC2387F interfaceC2387F5 = this.f7677n;
                            p076T.C0701o m1295a2 = c0702p2.m1295a();
                            m1295a2.f2376r = this.f7683t;
                            m1295a2.f2377s = this.f7684u;
                            p009B2.AbstractC0051h.m158q(m1295a2, interfaceC2387F5);
                        }
                        this.f7686w = true;
                    }
                    int m1539a2 = c0798r.m1539a();
                    this.f7677n.mo1405a(c0798r, m1539a2, 0);
                    int i20 = this.f7681r;
                    if (i20 == -1) {
                        this.f7681r = m1539a2;
                    } else {
                        this.f7681r = i20 + m1539a2;
                    }
                    this.f7682s = p080U1.AbstractC0748a.m1363K(this.f7679p, j4, this.f7678o, 90000);
                    if (z4) {
                        p215y0.InterfaceC2387F interfaceC2387F6 = this.f7677n;
                        interfaceC2387F6.getClass();
                        interfaceC2387F6.mo1406b(this.f7682s, this.f7687x ? 1 : 0, this.f7681r, 0, null);
                        this.f7681r = -1;
                        this.f7682s = -9223372036854775807L;
                        this.f7685v = false;
                    }
                    this.f7680q = i4;
                    return;
                }
                return;
        }
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: d */
    public final void mo984d(p215y0.InterfaceC2405q interfaceC2405q, int i4) {
        switch (this.f7675l) {
            case 0:
                p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(i4, 2);
                this.f7677n = mo640v;
                mo640v.mo1407c(this.f7676m.f7512c);
                return;
            default:
                p215y0.InterfaceC2387F mo640v2 = interfaceC2405q.mo640v(i4, 2);
                this.f7677n = mo640v2;
                mo640v2.mo1407c(this.f7676m.f7512c);
                return;
        }
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: e */
    public final void mo985e(long j4) {
        switch (this.f7675l) {
            case 0:
                p086W.AbstractC0781a.m1421j(this.f7678o == -9223372036854775807L);
                this.f7678o = j4;
                return;
            default:
                p086W.AbstractC0781a.m1421j(this.f7678o == -9223372036854775807L);
                this.f7678o = j4;
                return;
        }
    }
}
