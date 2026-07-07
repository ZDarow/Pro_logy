package D0;

import B2.x;
import M0.h;
import T.C0098t;
import T.G;
import T.I;
import W.r;
import W.y;
import d1.C0231a;
import java.util.Arrays;
import y0.AbstractC0619b;
import y0.F;
import y0.l;
import y0.o;
import y0.p;
import y0.q;
import y0.s;
import y0.z;

/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: e, reason: collision with root package name */
    public q f429e;

    /* renamed from: f, reason: collision with root package name */
    public F f430f;

    /* renamed from: h, reason: collision with root package name */
    public G f432h;

    /* renamed from: i, reason: collision with root package name */
    public s f433i;

    /* renamed from: j, reason: collision with root package name */
    public int f434j;

    /* renamed from: k, reason: collision with root package name */
    public int f435k;

    /* renamed from: l, reason: collision with root package name */
    public b f436l;

    /* renamed from: m, reason: collision with root package name */
    public int f437m;

    /* renamed from: n, reason: collision with root package name */
    public long f438n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f425a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final r f426b = new r(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f427c = false;

    /* renamed from: d, reason: collision with root package name */
    public final C0098t f428d = new Object();

    /* renamed from: g, reason: collision with root package name */
    public int f431g = 0;

    @Override // y0.o
    public final void b(long j4, long j5) {
        if (j4 == 0) {
            this.f431g = 0;
        } else {
            b bVar = this.f436l;
            if (bVar != null) {
                bVar.d(j5);
            }
        }
        this.f438n = j5 != 0 ? -1L : 0L;
        this.f437m = 0;
        this.f426b.D(0);
    }

    @Override // y0.o
    public final void g(q qVar) {
        this.f429e = qVar;
        this.f430f = qVar.v(0, 1);
        qVar.s();
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        l lVar = (l) pVar;
        G a4 = new C0231a(1).a(lVar, h.f1140b);
        if (a4 != null) {
            int length = a4.f2118l.length;
        }
        r rVar = new r(4);
        lVar.p(rVar.f2694a, 0, 4, false);
        return rVar.w() == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // y0.o
    public final int l(p pVar, C0098t c0098t) {
        s sVar;
        z bVar;
        long j4;
        boolean z4;
        long j5;
        boolean z5;
        boolean z6 = true;
        int i4 = this.f431g;
        G g4 = null;
        if (i4 == 0) {
            ((l) pVar).f9091q = 0;
            l lVar = (l) pVar;
            long w = lVar.w();
            G a4 = new C0231a(1).a(lVar, !this.f427c ? null : h.f1140b);
            if (a4 != null && a4.f2118l.length != 0) {
                g4 = a4;
            }
            lVar.e((int) (lVar.w() - w));
            this.f432h = g4;
            this.f431g = 1;
            return 0;
        }
        byte[] bArr = this.f425a;
        if (i4 == 1) {
            ((l) pVar).p(bArr, 0, bArr.length, false);
            ((l) pVar).f9091q = 0;
            this.f431g = 2;
            return 0;
        }
        int i5 = 3;
        if (i4 == 2) {
            r rVar = new r(4);
            ((l) pVar).k(rVar.f2694a, 0, 4, false);
            if (rVar.w() != 1716281667) {
                throw I.a(null, "Failed to read FLAC stream marker.");
            }
            this.f431g = 3;
            return 0;
        }
        if (i4 == 3) {
            ?? r12 = 0;
            s sVar2 = this.f433i;
            boolean z7 = false;
            while (!z7) {
                ((l) pVar).f9091q = r12;
                byte[] bArr2 = new byte[4];
                W.q qVar = new W.q(bArr2, 4);
                l lVar2 = (l) pVar;
                lVar2.p(bArr2, r12, 4, r12);
                boolean h4 = qVar.h();
                int i6 = qVar.i(r9);
                int i7 = qVar.i(24) + 4;
                if (i6 == 0) {
                    byte[] bArr3 = new byte[38];
                    lVar2.k(bArr3, r12, 38, r12);
                    sVar = new s(bArr3, 4);
                } else {
                    if (sVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i6 == i5) {
                        r rVar2 = new r(i7);
                        lVar2.k(rVar2.f2694a, 0, i7, false);
                        sVar = new s(sVar2.f9104a, sVar2.f9105b, sVar2.f9106c, sVar2.f9107d, sVar2.f9108e, sVar2.f9110g, sVar2.f9111h, sVar2.f9113j, AbstractC0619b.u(rVar2), sVar2.f9115l);
                    } else {
                        G g5 = sVar2.f9115l;
                        if (i6 == 4) {
                            r rVar3 = new r(i7);
                            lVar2.k(rVar3.f2694a, 0, i7, false);
                            rVar3.H(4);
                            G s = AbstractC0619b.s(Arrays.asList((String[]) AbstractC0619b.v(rVar3, false, false).f8747l));
                            if (g5 != null) {
                                s = g5.e(s);
                            }
                            sVar = new s(sVar2.f9104a, sVar2.f9105b, sVar2.f9106c, sVar2.f9107d, sVar2.f9108e, sVar2.f9110g, sVar2.f9111h, sVar2.f9113j, sVar2.f9114k, s);
                        } else if (i6 == 6) {
                            r rVar4 = new r(i7);
                            lVar2.k(rVar4.f2694a, 0, i7, false);
                            rVar4.H(4);
                            G g6 = new G(f2.I.o(K0.a.d(rVar4)));
                            if (g5 != null) {
                                g6 = g5.e(g6);
                            }
                            sVar = new s(sVar2.f9104a, sVar2.f9105b, sVar2.f9106c, sVar2.f9107d, sVar2.f9108e, sVar2.f9110g, sVar2.f9111h, sVar2.f9113j, sVar2.f9114k, g6);
                        } else {
                            lVar2.e(i7);
                            int i8 = y.f2709a;
                            this.f433i = sVar2;
                            z7 = h4;
                            r12 = 0;
                            i5 = 3;
                            r9 = 7;
                        }
                    }
                }
                sVar2 = sVar;
                int i82 = y.f2709a;
                this.f433i = sVar2;
                z7 = h4;
                r12 = 0;
                i5 = 3;
                r9 = 7;
            }
            this.f433i.getClass();
            this.f434j = Math.max(this.f433i.f9106c, 6);
            F f4 = this.f430f;
            int i9 = y.f2709a;
            f4.c(this.f433i.c(bArr, this.f432h));
            this.f431g = 4;
            return 0;
        }
        long j6 = 0;
        if (i4 == 4) {
            ((l) pVar).f9091q = 0;
            r rVar5 = new r(2);
            l lVar3 = (l) pVar;
            lVar3.p(rVar5.f2694a, 0, 2, false);
            int A4 = rVar5.A();
            if ((A4 >> 2) != 16382) {
                lVar3.f9091q = 0;
                throw I.a(null, "First frame does not start with sync code.");
            }
            lVar3.f9091q = 0;
            this.f435k = A4;
            q qVar2 = this.f429e;
            int i10 = y.f2709a;
            long j7 = lVar3.f9089o;
            this.f433i.getClass();
            s sVar3 = this.f433i;
            if (sVar3.f9114k != null) {
                bVar = new A0.b(sVar3, j7, 1);
            } else {
                long j8 = lVar3.f9088n;
                if (j8 == -1 || sVar3.f9113j <= 0) {
                    bVar = new A0.b(sVar3.b());
                } else {
                    int i11 = this.f435k;
                    x xVar = new x(1, sVar3);
                    a aVar = new a(sVar3, i11);
                    long b4 = sVar3.b();
                    int i12 = sVar3.f9106c;
                    int i13 = sVar3.f9107d;
                    if (i13 > 0) {
                        j4 = ((i13 + i12) / 2) + 1;
                    } else {
                        int i14 = sVar3.f9105b;
                        int i15 = sVar3.f9104a;
                        j4 = (((((i15 != i14 || i15 <= 0) ? 4096L : i15) * sVar3.f9110g) * sVar3.f9111h) / 8) + 64;
                    }
                    b bVar2 = new b(xVar, aVar, b4, sVar3.f9113j, j7, j8, j4, Math.max(6, i12));
                    this.f436l = bVar2;
                    bVar = bVar2.f421a;
                }
            }
            qVar2.t(bVar);
            this.f431g = 5;
            return 0;
        }
        if (i4 != 5) {
            throw new IllegalStateException();
        }
        this.f430f.getClass();
        this.f433i.getClass();
        b bVar3 = this.f436l;
        if (bVar3 != null && bVar3.f423c != null) {
            return bVar3.b((l) pVar, c0098t);
        }
        if (this.f438n == -1) {
            s sVar4 = this.f433i;
            ((l) pVar).f9091q = 0;
            l lVar4 = (l) pVar;
            lVar4.a(1, false);
            byte[] bArr4 = new byte[1];
            lVar4.p(bArr4, 0, 1, false);
            boolean z8 = (bArr4[0] & 1) == 1;
            lVar4.a(2, false);
            r9 = z8 ? 7 : 6;
            r rVar6 = new r(r9);
            byte[] bArr5 = rVar6.f2694a;
            int i16 = 0;
            while (i16 < r9) {
                int f5 = lVar4.f(bArr5, i16, r9 - i16);
                if (f5 == -1) {
                    break;
                }
                i16 += f5;
            }
            rVar6.F(i16);
            lVar4.f9091q = 0;
            try {
                long B4 = rVar6.B();
                if (!z8) {
                    B4 *= sVar4.f9105b;
                }
                j6 = B4;
            } catch (NumberFormatException unused) {
                z6 = false;
            }
            if (!z6) {
                throw I.a(null, null);
            }
            this.f438n = j6;
            return 0;
        }
        r rVar7 = this.f426b;
        int i17 = rVar7.f2696c;
        if (i17 < 32768) {
            int read = ((l) pVar).read(rVar7.f2694a, i17, 32768 - i17);
            z4 = read == -1;
            if (!z4) {
                rVar7.F(i17 + read);
            } else if (rVar7.a() == 0) {
                long j9 = this.f438n * 1000000;
                s sVar5 = this.f433i;
                int i18 = y.f2709a;
                this.f430f.b(j9 / sVar5.f9108e, 1, this.f437m, 0, null);
                return -1;
            }
        } else {
            z4 = false;
        }
        int i19 = rVar7.f2695b;
        int i20 = this.f437m;
        int i21 = this.f434j;
        if (i20 < i21) {
            rVar7.H(Math.min(i21 - i20, rVar7.a()));
        }
        this.f433i.getClass();
        int i22 = rVar7.f2695b;
        while (true) {
            int i23 = rVar7.f2696c - 16;
            C0098t c0098t2 = this.f428d;
            if (i22 <= i23) {
                rVar7.G(i22);
                if (AbstractC0619b.d(rVar7, this.f433i, this.f435k, c0098t2)) {
                    rVar7.G(i22);
                    j5 = c0098t2.f2352a;
                    break;
                }
                i22++;
            } else {
                if (z4) {
                    while (true) {
                        int i24 = rVar7.f2696c;
                        if (i22 > i24 - this.f434j) {
                            rVar7.G(i24);
                            break;
                        }
                        rVar7.G(i22);
                        try {
                            z5 = AbstractC0619b.d(rVar7, this.f433i, this.f435k, c0098t2);
                        } catch (IndexOutOfBoundsException unused2) {
                            z5 = false;
                        }
                        if (rVar7.f2695b > rVar7.f2696c) {
                            z5 = false;
                        }
                        if (z5) {
                            rVar7.G(i22);
                            j5 = c0098t2.f2352a;
                            break;
                        }
                        i22++;
                    }
                } else {
                    rVar7.G(i22);
                }
                j5 = -1;
            }
        }
        int i25 = rVar7.f2695b - i19;
        rVar7.G(i19);
        this.f430f.a(rVar7, i25, 0);
        int i26 = i25 + this.f437m;
        this.f437m = i26;
        if (j5 != -1) {
            long j10 = this.f438n * 1000000;
            s sVar6 = this.f433i;
            int i27 = y.f2709a;
            this.f430f.b(j10 / sVar6.f9108e, 1, i26, 0, null);
            this.f437m = 0;
            this.f438n = j5;
        }
        if (rVar7.a() >= 16) {
            return 0;
        }
        int a5 = rVar7.a();
        byte[] bArr6 = rVar7.f2694a;
        System.arraycopy(bArr6, rVar7.f2695b, bArr6, 0, a5);
        rVar7.G(0);
        rVar7.F(a5);
        return 0;
    }

    @Override // y0.o
    public final void release() {
    }
}
