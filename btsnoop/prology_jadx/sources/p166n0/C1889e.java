package p166n0;

/* renamed from: n0.e */
/* loaded from: classes.dex */
public final class C1889e implements p166n0.InterfaceC1893i {

    /* renamed from: l */
    public final /* synthetic */ int f7688l;

    /* renamed from: m */
    public final java.lang.Object f7689m;

    /* renamed from: n */
    public final java.lang.Object f7690n;

    /* renamed from: o */
    public java.lang.Object f7691o;

    /* renamed from: p */
    public java.lang.Object f7692p;

    /* renamed from: q */
    public int f7693q;

    /* renamed from: r */
    public long f7694r;

    /* renamed from: s */
    public int f7695s;

    /* renamed from: t */
    public int f7696t;

    /* renamed from: u */
    public long f7697u;

    public C1889e(java.lang.String str, java.lang.String str2, long j4, int i4, int i5, int i6, int[] iArr, java.util.TreeMap treeMap) {
        this.f7688l = 2;
        this.f7689m = str;
        this.f7690n = str2;
        this.f7694r = j4;
        this.f7697u = 0L;
        this.f7693q = i4;
        this.f7695s = i5;
        this.f7696t = i6;
        this.f7691o = iArr;
        this.f7692p = treeMap;
    }

    /* renamed from: a */
    private final void m3873a(long j4) {
    }

    /* renamed from: f */
    private final void m3874f(long j4) {
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: b */
    public void mo982b(long j4, long j5) {
        switch (this.f7688l) {
            case 0:
                this.f7694r = j4;
                this.f7696t = 0;
                this.f7697u = j5;
                return;
            default:
                this.f7694r = j4;
                this.f7696t = 0;
                this.f7697u = j5;
                return;
        }
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: c */
    public void mo983c(p086W.C0798r c0798r, long j4, int i4, boolean z4) {
        int i5;
        java.lang.Object obj = this.f7689m;
        int i6 = 1;
        switch (this.f7688l) {
            case 0:
                try {
                    int i7 = c0798r.f2786a[0] & 31;
                    p086W.AbstractC0781a.m1422k((p215y0.InterfaceC2387F) this.f7692p);
                    if (i7 > 0 && i7 < 24) {
                        int m1539a = c0798r.m1539a();
                        this.f7696t = m3875g() + this.f7696t;
                        ((p215y0.InterfaceC2387F) this.f7692p).mo1405a(c0798r, m1539a, 0);
                        this.f7696t += m1539a;
                        this.f7693q = (c0798r.f2786a[0] & 31) == 5 ? 1 : 0;
                    } else if (i7 == 24) {
                        c0798r.m1559u();
                        while (c0798r.m1539a() > 4) {
                            int m1531A = c0798r.m1531A();
                            this.f7696t = m3875g() + this.f7696t;
                            ((p215y0.InterfaceC2387F) this.f7692p).mo1405a(c0798r, m1531A, 0);
                            this.f7696t += m1531A;
                        }
                        this.f7693q = 0;
                    } else {
                        if (i7 != 28) {
                            throw p076T.C0666I.m1203b(java.lang.String.format("RTP H264 packetization mode [%d] not supported.", java.lang.Integer.valueOf(i7)), null);
                        }
                        byte[] bArr = c0798r.f2786a;
                        byte b4 = bArr[0];
                        byte b5 = bArr[1];
                        int i8 = (b4 & 224) | (b5 & 31);
                        boolean z5 = (b5 & 128) > 0;
                        boolean z6 = (b5 & 64) > 0;
                        p086W.C0798r c0798r2 = (p086W.C0798r) obj;
                        if (z5) {
                            this.f7696t = m3875g() + this.f7696t;
                            byte[] bArr2 = c0798r.f2786a;
                            i5 = 1;
                            bArr2[1] = (byte) i8;
                            c0798r2.getClass();
                            c0798r2.m1535E(bArr2, bArr2.length);
                            c0798r2.m1537G(1);
                        } else {
                            i5 = 1;
                            int m3811a = p161m0.C1852i.m3811a(this.f7695s);
                            if (i4 != m3811a) {
                                int i9 = p086W.AbstractC0805y.f2801a;
                                java.util.Locale locale = java.util.Locale.US;
                                p086W.AbstractC0781a.m1410A("RtpH264Reader", "Received RTP packet with unexpected sequence number. Expected: " + m3811a + "; received: " + i4 + ". Dropping packet.");
                            } else {
                                byte[] bArr3 = c0798r.f2786a;
                                c0798r2.getClass();
                                c0798r2.m1535E(bArr3, bArr3.length);
                                c0798r2.m1537G(2);
                            }
                        }
                        int m1539a2 = c0798r2.m1539a();
                        ((p215y0.InterfaceC2387F) this.f7692p).mo1405a(c0798r2, m1539a2, 0);
                        this.f7696t += m1539a2;
                        if (z6) {
                            this.f7693q = (i8 & 31) == 5 ? i5 : 0;
                        }
                    }
                    if (z4) {
                        if (this.f7694r == -9223372036854775807L) {
                            this.f7694r = j4;
                        }
                        ((p215y0.InterfaceC2387F) this.f7692p).mo1406b(p080U1.AbstractC0748a.m1363K(this.f7697u, j4, this.f7694r, 90000), this.f7693q, this.f7696t, 0, null);
                        this.f7696t = 0;
                    }
                    this.f7695s = i4;
                    return;
                } catch (java.lang.IndexOutOfBoundsException e4) {
                    throw p076T.C0666I.m1203b(null, e4);
                }
            default:
                byte[] bArr4 = c0798r.f2786a;
                if (bArr4.length == 0) {
                    throw p076T.C0666I.m1203b("Empty RTP data packet.", null);
                }
                int i10 = (bArr4[0] >> 1) & 63;
                p086W.AbstractC0781a.m1422k((p215y0.InterfaceC2387F) this.f7692p);
                p086W.C0798r c0798r3 = (p086W.C0798r) this.f7690n;
                if (i10 >= 0 && i10 < 48) {
                    int m1539a3 = c0798r.m1539a();
                    int i11 = this.f7696t;
                    c0798r3.m1537G(0);
                    int m1539a4 = c0798r3.m1539a();
                    p215y0.InterfaceC2387F interfaceC2387F = (p215y0.InterfaceC2387F) this.f7692p;
                    interfaceC2387F.getClass();
                    interfaceC2387F.mo1405a(c0798r3, m1539a4, 0);
                    this.f7696t = m1539a4 + i11;
                    ((p215y0.InterfaceC2387F) this.f7692p).mo1405a(c0798r, m1539a3, 0);
                    this.f7696t += m1539a3;
                    int i12 = (c0798r.f2786a[0] >> 1) & 63;
                    if (i12 != 19 && i12 != 20) {
                        i6 = 0;
                    }
                    this.f7693q = i6;
                } else {
                    if (i10 == 48) {
                        throw new java.lang.UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (i10 != 49) {
                        throw p076T.C0666I.m1203b(java.lang.String.format("RTP H265 payload type [%d] not supported.", java.lang.Integer.valueOf(i10)), null);
                    }
                    byte[] bArr5 = c0798r.f2786a;
                    if (bArr5.length < 3) {
                        throw p076T.C0666I.m1203b("Malformed FU header.", null);
                    }
                    int i13 = bArr5[1] & 7;
                    byte b6 = bArr5[2];
                    int i14 = b6 & 63;
                    boolean z7 = (b6 & 128) > 0;
                    boolean z8 = (b6 & 64) > 0;
                    p086W.C0798r c0798r4 = (p086W.C0798r) obj;
                    if (z7) {
                        int i15 = this.f7696t;
                        c0798r3.m1537G(0);
                        int m1539a5 = c0798r3.m1539a();
                        p215y0.InterfaceC2387F interfaceC2387F2 = (p215y0.InterfaceC2387F) this.f7692p;
                        interfaceC2387F2.getClass();
                        interfaceC2387F2.mo1405a(c0798r3, m1539a5, 0);
                        this.f7696t = m1539a5 + i15;
                        byte[] bArr6 = c0798r.f2786a;
                        bArr6[1] = (byte) ((i14 << 1) & 127);
                        bArr6[2] = (byte) i13;
                        c0798r4.getClass();
                        c0798r4.m1535E(bArr6, bArr6.length);
                        c0798r4.m1537G(1);
                    } else {
                        int i16 = (this.f7695s + 1) % 65535;
                        if (i4 != i16) {
                            int i17 = p086W.AbstractC0805y.f2801a;
                            java.util.Locale locale2 = java.util.Locale.US;
                            p086W.AbstractC0781a.m1410A("RtpH265Reader", "Received RTP packet with unexpected sequence number. Expected: " + i16 + "; received: " + i4 + ". Dropping packet.");
                        } else {
                            c0798r4.getClass();
                            c0798r4.m1535E(bArr5, bArr5.length);
                            c0798r4.m1537G(3);
                        }
                    }
                    int m1539a6 = c0798r4.m1539a();
                    ((p215y0.InterfaceC2387F) this.f7692p).mo1405a(c0798r4, m1539a6, 0);
                    this.f7696t += m1539a6;
                    if (z8) {
                        this.f7693q = (i14 == 19 || i14 == 20) ? 1 : 0;
                    }
                }
                if (z4) {
                    if (this.f7694r == -9223372036854775807L) {
                        this.f7694r = j4;
                    }
                    ((p215y0.InterfaceC2387F) this.f7692p).mo1406b(p080U1.AbstractC0748a.m1363K(this.f7697u, j4, this.f7694r, 90000), this.f7693q, this.f7696t, 0, null);
                    this.f7696t = 0;
                }
                this.f7695s = i4;
                return;
        }
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: d */
    public void mo984d(p215y0.InterfaceC2405q interfaceC2405q, int i4) {
        switch (this.f7688l) {
            case 0:
                p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(i4, 2);
                this.f7692p = mo640v;
                int i5 = p086W.AbstractC0805y.f2801a;
                mo640v.mo1407c(((p161m0.C1854k) this.f7691o).f7512c);
                return;
            default:
                p215y0.InterfaceC2387F mo640v2 = interfaceC2405q.mo640v(i4, 2);
                this.f7692p = mo640v2;
                mo640v2.mo1407c(((p161m0.C1854k) this.f7691o).f7512c);
                return;
        }
    }

    @Override // p166n0.InterfaceC1893i
    /* renamed from: e */
    public void mo985e(long j4) {
        int i4 = this.f7688l;
    }

    /* renamed from: g */
    public int m3875g() {
        p086W.C0798r c0798r = (p086W.C0798r) this.f7690n;
        c0798r.m1537G(0);
        int m1539a = c0798r.m1539a();
        p215y0.InterfaceC2387F interfaceC2387F = (p215y0.InterfaceC2387F) this.f7692p;
        interfaceC2387F.getClass();
        interfaceC2387F.mo1405a(c0798r, m1539a, 0);
        return m1539a;
    }

    public C1889e(p161m0.C1854k c1854k, int i4) {
        this.f7688l = i4;
        switch (i4) {
            case 1:
                this.f7689m = new p086W.C0798r();
                this.f7690n = new p086W.C0798r(p090X.AbstractC0830g.f2960a);
                this.f7691o = c1854k;
                this.f7694r = -9223372036854775807L;
                this.f7695s = -1;
                return;
            default:
                this.f7690n = new p086W.C0798r(p090X.AbstractC0830g.f2960a);
                this.f7691o = c1854k;
                this.f7689m = new p086W.C0798r();
                this.f7694r = -9223372036854775807L;
                this.f7695s = -1;
                return;
        }
    }
}
