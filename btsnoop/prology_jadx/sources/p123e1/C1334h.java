package p123e1;

/* renamed from: e1.h */
/* loaded from: classes.dex */
public final class C1334h implements p123e1.InterfaceC1335i {

    /* renamed from: a */
    public final /* synthetic */ int f5407a;

    /* renamed from: b */
    public boolean f5408b;

    /* renamed from: c */
    public long f5409c;

    /* renamed from: d */
    public int f5410d;

    /* renamed from: e */
    public int f5411e;

    /* renamed from: f */
    public final java.lang.Object f5412f;

    /* renamed from: g */
    public java.lang.Object f5413g;

    public C1334h(java.util.List list) {
        this.f5407a = 0;
        this.f5412f = list;
        this.f5413g = new p215y0.InterfaceC2387F[list.size()];
        this.f5409c = -9223372036854775807L;
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: b */
    public final void mo3089b() {
        switch (this.f5407a) {
            case 0:
                this.f5408b = false;
                this.f5409c = -9223372036854775807L;
                return;
            default:
                this.f5408b = false;
                this.f5409c = -9223372036854775807L;
                return;
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: d */
    public final void mo3090d(p086W.C0798r c0798r) {
        boolean z4;
        boolean z5;
        switch (this.f5407a) {
            case 0:
                if (this.f5408b) {
                    if (this.f5410d == 2) {
                        if (c0798r.m1539a() == 0) {
                            z5 = false;
                        } else {
                            if (c0798r.m1559u() != 32) {
                                this.f5408b = false;
                            }
                            this.f5410d--;
                            z5 = this.f5408b;
                        }
                        if (!z5) {
                            return;
                        }
                    }
                    if (this.f5410d == 1) {
                        if (c0798r.m1539a() == 0) {
                            z4 = false;
                        } else {
                            if (c0798r.m1559u() != 0) {
                                this.f5408b = false;
                            }
                            this.f5410d--;
                            z4 = this.f5408b;
                        }
                        if (!z4) {
                            return;
                        }
                    }
                    int i4 = c0798r.f2787b;
                    int m1539a = c0798r.m1539a();
                    for (p215y0.InterfaceC2387F interfaceC2387F : (p215y0.InterfaceC2387F[]) this.f5413g) {
                        c0798r.m1537G(i4);
                        interfaceC2387F.mo1405a(c0798r, m1539a, 0);
                    }
                    this.f5411e += m1539a;
                    return;
                }
                return;
            default:
                p086W.AbstractC0781a.m1422k((p215y0.InterfaceC2387F) this.f5413g);
                if (this.f5408b) {
                    int m1539a2 = c0798r.m1539a();
                    int i5 = this.f5411e;
                    if (i5 < 10) {
                        int min = java.lang.Math.min(m1539a2, 10 - i5);
                        byte[] bArr = c0798r.f2786a;
                        int i6 = c0798r.f2787b;
                        p086W.C0798r c0798r2 = (p086W.C0798r) this.f5412f;
                        java.lang.System.arraycopy(bArr, i6, c0798r2.f2786a, this.f5411e, min);
                        if (this.f5411e + min == 10) {
                            c0798r2.m1537G(0);
                            if (73 != c0798r2.m1559u() || 68 != c0798r2.m1559u() || 51 != c0798r2.m1559u()) {
                                p086W.AbstractC0781a.m1410A("Id3Reader", "Discarding invalid ID3 tag");
                                this.f5408b = false;
                                return;
                            } else {
                                c0798r2.m1538H(3);
                                this.f5410d = c0798r2.m1558t() + 10;
                            }
                        }
                    }
                    int min2 = java.lang.Math.min(m1539a2, this.f5410d - this.f5411e);
                    ((p215y0.InterfaceC2387F) this.f5413g).mo1405a(c0798r, min2, 0);
                    this.f5411e += min2;
                    return;
                }
                return;
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: e */
    public final void mo3091e(boolean z4) {
        int i4;
        switch (this.f5407a) {
            case 0:
                if (this.f5408b) {
                    p086W.AbstractC0781a.m1421j(this.f5409c != -9223372036854775807L);
                    for (p215y0.InterfaceC2387F interfaceC2387F : (p215y0.InterfaceC2387F[]) this.f5413g) {
                        interfaceC2387F.mo1406b(this.f5409c, 1, this.f5411e, 0, null);
                    }
                    this.f5408b = false;
                    return;
                }
                return;
            default:
                p086W.AbstractC0781a.m1422k((p215y0.InterfaceC2387F) this.f5413g);
                if (this.f5408b && (i4 = this.f5410d) != 0 && this.f5411e == i4) {
                    p086W.AbstractC0781a.m1421j(this.f5409c != -9223372036854775807L);
                    ((p215y0.InterfaceC2387F) this.f5413g).mo1406b(this.f5409c, 1, this.f5410d, 0, null);
                    this.f5408b = false;
                    return;
                }
                return;
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: f */
    public final void mo3092f(p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        switch (this.f5407a) {
            case 0:
                int i4 = 0;
                while (true) {
                    p215y0.InterfaceC2387F[] interfaceC2387FArr = (p215y0.InterfaceC2387F[]) this.f5413g;
                    if (i4 >= interfaceC2387FArr.length) {
                        return;
                    }
                    p123e1.C1324F c1324f = (p123e1.C1324F) ((java.util.List) this.f5412f).get(i4);
                    c1325g.m3084a();
                    c1325g.m3086c();
                    p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(c1325g.f5331c, 3);
                    p076T.C0701o c0701o = new p076T.C0701o();
                    c1325g.m3086c();
                    c0701o.f2359a = (java.lang.String) c1325g.f5333e;
                    c0701o.f2370l = p076T.AbstractC0665H.m1201l("application/dvbsubs");
                    c0701o.f2373o = java.util.Collections.singletonList(c1324f.f5328b);
                    c0701o.f2362d = c1324f.f5327a;
                    p009B2.AbstractC0051h.m158q(c0701o, mo640v);
                    interfaceC2387FArr[i4] = mo640v;
                    i4++;
                }
            default:
                c1325g.m3084a();
                c1325g.m3086c();
                p215y0.InterfaceC2387F mo640v2 = interfaceC2405q.mo640v(c1325g.f5331c, 5);
                this.f5413g = mo640v2;
                p076T.C0701o c0701o2 = new p076T.C0701o();
                c1325g.m3086c();
                c0701o2.f2359a = (java.lang.String) c1325g.f5333e;
                c0701o2.f2370l = p076T.AbstractC0665H.m1201l("application/id3");
                p009B2.AbstractC0051h.m158q(c0701o2, mo640v2);
                return;
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: g */
    public final void mo3093g(long j4, int i4) {
        switch (this.f5407a) {
            case 0:
                if ((i4 & 4) == 0) {
                    return;
                }
                this.f5408b = true;
                this.f5409c = j4;
                this.f5411e = 0;
                this.f5410d = 2;
                return;
            default:
                if ((i4 & 4) == 0) {
                    return;
                }
                this.f5408b = true;
                this.f5409c = j4;
                this.f5410d = 0;
                this.f5411e = 0;
                return;
        }
    }

    public C1334h() {
        this.f5407a = 1;
        this.f5412f = new p086W.C0798r(10);
        this.f5409c = -9223372036854775807L;
    }
}
