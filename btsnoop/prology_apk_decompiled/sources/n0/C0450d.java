package n0;

import B2.AbstractC0007h;
import T.C0094o;
import T.C0095p;
import W.r;
import W.y;
import java.util.Locale;
import m0.C0428i;
import m0.C0430k;
import y0.F;
import y0.q;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450d implements i {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7394l;

    /* renamed from: m, reason: collision with root package name */
    public final C0430k f7395m;

    /* renamed from: n, reason: collision with root package name */
    public F f7396n;

    /* renamed from: o, reason: collision with root package name */
    public long f7397o;

    /* renamed from: p, reason: collision with root package name */
    public long f7398p;

    /* renamed from: q, reason: collision with root package name */
    public int f7399q;

    /* renamed from: r, reason: collision with root package name */
    public int f7400r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public int f7401t;

    /* renamed from: u, reason: collision with root package name */
    public int f7402u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7403v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7404x;

    public C0450d(C0430k c0430k, int i4) {
        this.f7394l = i4;
        switch (i4) {
            case 1:
                this.f7395m = c0430k;
                this.f7397o = -9223372036854775807L;
                this.f7400r = -1;
                this.s = -9223372036854775807L;
                this.f7398p = 0L;
                this.f7399q = -1;
                this.f7401t = -1;
                this.f7402u = -1;
                return;
            default:
                this.f7395m = c0430k;
                this.f7397o = -9223372036854775807L;
                this.f7400r = -1;
                return;
        }
    }

    @Override // n0.i
    public final void b(long j4, long j5) {
        switch (this.f7394l) {
            case 0:
                this.f7397o = j4;
                this.f7399q = 0;
                this.f7398p = j5;
                return;
            default:
                this.f7397o = j4;
                this.f7400r = -1;
                this.f7398p = j5;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n0.i
    public final void c(r rVar, long j4, int i4, boolean z4) {
        int i5;
        int i6;
        C0430k c0430k = this.f7395m;
        switch (this.f7394l) {
            case 0:
                W.a.k(this.f7396n);
                int i7 = rVar.f2695b;
                int A4 = rVar.A();
                Object[] objArr = (A4 & 1024) > 0;
                if ((A4 & 512) != 0 || (A4 & 504) != 0 || (A4 & 7) != 0) {
                    W.a.A("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                    return;
                }
                if (objArr == true) {
                    if (this.f7404x && this.f7399q > 0) {
                        F f4 = this.f7396n;
                        f4.getClass();
                        f4.b(this.s, this.f7403v ? 1 : 0, this.f7399q, 0, null);
                        this.f7399q = 0;
                        this.s = -9223372036854775807L;
                        this.f7403v = false;
                        this.f7404x = false;
                    }
                    this.f7404x = true;
                    if ((rVar.e() & 252) < 128) {
                        W.a.A("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                        return;
                    }
                    byte[] bArr = rVar.f2694a;
                    bArr[i7] = 0;
                    bArr[i7 + 1] = 0;
                    rVar.G(i7);
                } else {
                    if (!this.f7404x) {
                        W.a.A("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        return;
                    }
                    int a4 = C0428i.a(this.f7400r);
                    if (i4 < a4) {
                        int i8 = y.f2709a;
                        Locale locale = Locale.US;
                        W.a.A("RtpH263Reader", "Received RTP packet with unexpected sequence number. Expected: " + a4 + "; received: " + i4 + ". Dropping packet.");
                        return;
                    }
                }
                if (this.f7399q == 0) {
                    boolean z5 = this.w;
                    int i9 = rVar.f2695b;
                    if (((rVar.w() >> 10) & 63) == 32) {
                        int e4 = rVar.e();
                        int i10 = (e4 >> 1) & 1;
                        if (!z5 && i10 == 0) {
                            int i11 = (e4 >> 2) & 7;
                            if (i11 == 1) {
                                this.f7401t = 128;
                                this.f7402u = 96;
                            } else {
                                int i12 = i11 - 2;
                                this.f7401t = 176 << i12;
                                this.f7402u = 144 << i12;
                            }
                        }
                        rVar.G(i9);
                        this.f7403v = i10 == 0;
                    } else {
                        rVar.G(i9);
                        this.f7403v = false;
                    }
                    if (!this.w && this.f7403v) {
                        int i13 = this.f7401t;
                        C0095p c0095p = c0430k.f7239c;
                        if (i13 != c0095p.s || this.f7402u != c0095p.f2331t) {
                            F f5 = this.f7396n;
                            C0094o a5 = c0095p.a();
                            a5.f2296r = this.f7401t;
                            a5.s = this.f7402u;
                            AbstractC0007h.q(a5, f5);
                        }
                        this.w = true;
                    }
                }
                int a6 = rVar.a();
                this.f7396n.a(rVar, a6, 0);
                this.f7399q += a6;
                this.s = U1.a.K(this.f7398p, j4, this.f7397o, 90000);
                if (z4) {
                    F f6 = this.f7396n;
                    f6.getClass();
                    f6.b(this.s, this.f7403v ? 1 : 0, this.f7399q, 0, null);
                    this.f7399q = 0;
                    this.s = -9223372036854775807L;
                    this.f7403v = false;
                    this.f7404x = false;
                }
                this.f7400r = i4;
                return;
            default:
                W.a.k(this.f7396n);
                int u4 = rVar.u();
                if ((u4 & 8) == 8) {
                    if (this.f7403v && this.f7400r > 0) {
                        F f7 = this.f7396n;
                        f7.getClass();
                        f7.b(this.s, this.f7404x ? 1 : 0, this.f7400r, 0, null);
                        this.f7400r = -1;
                        this.s = -9223372036854775807L;
                        this.f7403v = false;
                    }
                    this.f7403v = true;
                } else {
                    if (!this.f7403v) {
                        W.a.A("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                        return;
                    }
                    int a7 = C0428i.a(this.f7399q);
                    if (i4 < a7) {
                        int i14 = y.f2709a;
                        Locale locale2 = Locale.US;
                        W.a.A("RtpVp9Reader", "Received RTP packet with unexpected sequence number. Expected: " + a7 + "; received: " + i4 + ". Dropping packet.");
                        return;
                    }
                }
                if ((u4 & 128) == 0 || (rVar.u() & 128) == 0 || rVar.a() >= 1) {
                    int i15 = u4 & 16;
                    W.a.d("VP9 flexible mode is not supported.", i15 == 0);
                    if ((u4 & 32) != 0) {
                        rVar.H(1);
                        if (rVar.a() < 1) {
                            return;
                        }
                        if (i15 == 0) {
                            rVar.H(1);
                        }
                    }
                    if ((u4 & 2) != 0) {
                        int u5 = rVar.u();
                        int i16 = (u5 >> 5) & 7;
                        if ((u5 & 16) != 0) {
                            int i17 = i16 + 1;
                            if (rVar.a() < i17 * 4) {
                                return;
                            }
                            for (int i18 = 0; i18 < i17; i18++) {
                                this.f7401t = rVar.A();
                                this.f7402u = rVar.A();
                            }
                        }
                        if ((u5 & 8) != 0) {
                            int u6 = rVar.u();
                            if (rVar.a() < u6) {
                                return;
                            }
                            for (int i19 = 0; i19 < u6; i19++) {
                                int A5 = (rVar.A() & 12) >> 2;
                                if (rVar.a() < A5) {
                                    return;
                                }
                                rVar.H(A5);
                            }
                        }
                    }
                    if (this.f7400r == -1 && this.f7403v) {
                        this.f7404x = (rVar.e() & 4) == 0;
                    }
                    if (!this.w && (i5 = this.f7401t) != -1 && (i6 = this.f7402u) != -1) {
                        C0095p c0095p2 = c0430k.f7239c;
                        if (i5 != c0095p2.s || i6 != c0095p2.f2331t) {
                            F f8 = this.f7396n;
                            C0094o a8 = c0095p2.a();
                            a8.f2296r = this.f7401t;
                            a8.s = this.f7402u;
                            AbstractC0007h.q(a8, f8);
                        }
                        this.w = true;
                    }
                    int a9 = rVar.a();
                    this.f7396n.a(rVar, a9, 0);
                    int i20 = this.f7400r;
                    if (i20 == -1) {
                        this.f7400r = a9;
                    } else {
                        this.f7400r = i20 + a9;
                    }
                    this.s = U1.a.K(this.f7398p, j4, this.f7397o, 90000);
                    if (z4) {
                        F f9 = this.f7396n;
                        f9.getClass();
                        f9.b(this.s, this.f7404x ? 1 : 0, this.f7400r, 0, null);
                        this.f7400r = -1;
                        this.s = -9223372036854775807L;
                        this.f7403v = false;
                    }
                    this.f7399q = i4;
                    return;
                }
                return;
        }
    }

    @Override // n0.i
    public final void d(q qVar, int i4) {
        switch (this.f7394l) {
            case 0:
                F v4 = qVar.v(i4, 2);
                this.f7396n = v4;
                v4.c(this.f7395m.f7239c);
                return;
            default:
                F v5 = qVar.v(i4, 2);
                this.f7396n = v5;
                v5.c(this.f7395m.f7239c);
                return;
        }
    }

    @Override // n0.i
    public final void e(long j4) {
        switch (this.f7394l) {
            case 0:
                W.a.j(this.f7397o == -9223372036854775807L);
                this.f7397o = j4;
                return;
            default:
                W.a.j(this.f7397o == -9223372036854775807L);
                this.f7397o = j4;
                return;
        }
    }
}
