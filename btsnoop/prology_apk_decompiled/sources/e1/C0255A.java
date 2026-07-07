package e1;

import T.C0098t;
import android.util.SparseArray;

/* renamed from: e1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255A implements y0.o {

    /* renamed from: e, reason: collision with root package name */
    public boolean f5103e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5104f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5105g;

    /* renamed from: h, reason: collision with root package name */
    public long f5106h;

    /* renamed from: i, reason: collision with root package name */
    public D0.b f5107i;

    /* renamed from: j, reason: collision with root package name */
    public y0.q f5108j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5109k;

    /* renamed from: a, reason: collision with root package name */
    public final W.w f5099a = new W.w(0);

    /* renamed from: c, reason: collision with root package name */
    public final W.r f5101c = new W.r(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f5100b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final y f5102d = new y(0);

    @Override // y0.o
    public final void b(long j4, long j5) {
        long j6;
        W.w wVar = this.f5099a;
        synchronized (wVar) {
            j6 = wVar.f2705b;
        }
        boolean z4 = j6 == -9223372036854775807L;
        if (!z4) {
            long d4 = wVar.d();
            z4 = (d4 == -9223372036854775807L || d4 == 0 || d4 == j5) ? false : true;
        }
        if (z4) {
            wVar.f(j5);
        }
        D0.b bVar = this.f5107i;
        if (bVar != null) {
            bVar.d(j5);
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f5100b;
            if (i4 >= sparseArray.size()) {
                return;
            }
            z zVar = (z) sparseArray.valueAt(i4);
            zVar.f5430f = false;
            zVar.f5425a.b();
            i4++;
        }
    }

    @Override // y0.o
    public final void g(y0.q qVar) {
        this.f5108j = qVar;
    }

    @Override // y0.o
    public final boolean k(y0.p pVar) {
        byte[] bArr = new byte[14];
        y0.l lVar = (y0.l) pVar;
        lVar.p(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.a(bArr[13] & 7, false);
        lVar.p(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX WARN: Type inference failed for: r4v32, types: [y0.g, java.lang.Object] */
    @Override // y0.o
    public final int l(y0.p pVar, C0098t c0098t) {
        int i4;
        long j4;
        i iVar;
        long j5;
        long j6;
        W.a.k(this.f5108j);
        long j7 = ((y0.l) pVar).f9088n;
        int i5 = (j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1));
        int i6 = 1;
        y yVar = this.f5102d;
        if (i5 != 0 && !yVar.f5419d) {
            boolean z4 = yVar.f5421f;
            W.r rVar = yVar.f5418c;
            if (!z4) {
                y0.l lVar = (y0.l) pVar;
                long j8 = lVar.f9088n;
                int min = (int) Math.min(20000L, j8);
                long j9 = j8 - min;
                if (lVar.f9089o != j9) {
                    c0098t.f2352a = j9;
                } else {
                    rVar.D(min);
                    lVar.f9091q = 0;
                    lVar.p(rVar.f2694a, 0, min, false);
                    int i7 = rVar.f2695b;
                    int i8 = rVar.f2696c - 4;
                    while (true) {
                        if (i8 < i7) {
                            j6 = -9223372036854775807L;
                            break;
                        }
                        if (y.b(rVar.f2694a, i8) == 442) {
                            rVar.G(i8 + 4);
                            j6 = y.c(rVar);
                            if (j6 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i8--;
                    }
                    yVar.f5423h = j6;
                    yVar.f5421f = true;
                    i6 = 0;
                }
            } else {
                if (yVar.f5423h == -9223372036854775807L) {
                    yVar.a((y0.l) pVar);
                    return 0;
                }
                if (yVar.f5420e) {
                    long j10 = yVar.f5422g;
                    if (j10 == -9223372036854775807L) {
                        yVar.a((y0.l) pVar);
                        return 0;
                    }
                    W.w wVar = yVar.f5417b;
                    yVar.f5424i = wVar.c(yVar.f5423h) - wVar.b(j10);
                    yVar.a((y0.l) pVar);
                    return 0;
                }
                y0.l lVar2 = (y0.l) pVar;
                int min2 = (int) Math.min(20000L, lVar2.f9088n);
                long j11 = 0;
                if (lVar2.f9089o != j11) {
                    c0098t.f2352a = j11;
                } else {
                    rVar.D(min2);
                    lVar2.f9091q = 0;
                    lVar2.p(rVar.f2694a, 0, min2, false);
                    int i9 = rVar.f2695b;
                    int i10 = rVar.f2696c;
                    while (true) {
                        if (i9 >= i10 - 3) {
                            j5 = -9223372036854775807L;
                            break;
                        }
                        if (y.b(rVar.f2694a, i9) == 442) {
                            rVar.G(i9 + 4);
                            j5 = y.c(rVar);
                            if (j5 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i9++;
                    }
                    yVar.f5422g = j5;
                    yVar.f5420e = true;
                    i6 = 0;
                }
            }
            return i6;
        }
        if (this.f5109k) {
            i4 = i5;
            j4 = j7;
        } else {
            this.f5109k = true;
            long j12 = yVar.f5424i;
            if (j12 != -9223372036854775807L) {
                i4 = i5;
                j4 = j7;
                D0.b bVar = new D0.b(new Object(), new Y.x(yVar.f5417b), j12, j12 + 1, 0L, j7, 188L, 1000);
                this.f5107i = bVar;
                this.f5108j.t(bVar.f421a);
            } else {
                i4 = i5;
                j4 = j7;
                this.f5108j.t(new A0.b(j12));
            }
        }
        D0.b bVar2 = this.f5107i;
        if (bVar2 != null && bVar2.f423c != null) {
            return bVar2.b((y0.l) pVar, c0098t);
        }
        y0.l lVar3 = (y0.l) pVar;
        lVar3.f9091q = 0;
        long w = i4 != 0 ? j4 - lVar3.w() : -1L;
        if (w != -1 && w < 4) {
            return -1;
        }
        W.r rVar2 = this.f5101c;
        if (!lVar3.p(rVar2.f2694a, 0, 4, true)) {
            return -1;
        }
        rVar2.G(0);
        int h4 = rVar2.h();
        if (h4 == 441) {
            return -1;
        }
        if (h4 == 442) {
            lVar3.p(rVar2.f2694a, 0, 10, false);
            rVar2.G(9);
            lVar3.e((rVar2.u() & 7) + 14);
            return 0;
        }
        if (h4 == 443) {
            lVar3.p(rVar2.f2694a, 0, 2, false);
            rVar2.G(0);
            lVar3.e(rVar2.A() + 6);
            return 0;
        }
        if (((h4 & (-256)) >> 8) != 1) {
            lVar3.e(1);
            return 0;
        }
        int i11 = h4 & 255;
        SparseArray sparseArray = this.f5100b;
        z zVar = (z) sparseArray.get(i11);
        if (!this.f5103e) {
            if (zVar == null) {
                if (i11 == 189) {
                    iVar = new C0258b();
                    this.f5104f = true;
                    this.f5106h = lVar3.f9089o;
                } else if ((h4 & 224) == 192) {
                    iVar = new u(null, 0);
                    this.f5104f = true;
                    this.f5106h = lVar3.f9089o;
                } else if ((h4 & 240) == 224) {
                    iVar = new k(null);
                    this.f5105g = true;
                    this.f5106h = lVar3.f9089o;
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    iVar.f(this.f5108j, new G(i11, 256));
                    zVar = new z(iVar, this.f5099a);
                    sparseArray.put(i11, zVar);
                }
            }
            if (lVar3.f9089o > ((this.f5104f && this.f5105g) ? this.f5106h + 8192 : 1048576L)) {
                this.f5103e = true;
                this.f5108j.s();
            }
        }
        lVar3.p(rVar2.f2694a, 0, 2, false);
        rVar2.G(0);
        int A4 = rVar2.A() + 6;
        if (zVar == null) {
            lVar3.e(A4);
        } else {
            rVar2.D(A4);
            lVar3.k(rVar2.f2694a, 0, A4, false);
            rVar2.G(6);
            W.q qVar = zVar.f5427c;
            rVar2.f(qVar.f2689d, 0, 3);
            qVar.q(0);
            qVar.t(8);
            zVar.f5428d = qVar.h();
            zVar.f5429e = qVar.h();
            qVar.t(6);
            rVar2.f(qVar.f2689d, 0, qVar.i(8));
            qVar.q(0);
            zVar.f5431g = 0L;
            if (zVar.f5428d) {
                qVar.t(4);
                qVar.t(1);
                qVar.t(1);
                long i12 = (qVar.i(3) << 30) | (qVar.i(15) << 15) | qVar.i(15);
                qVar.t(1);
                boolean z5 = zVar.f5430f;
                W.w wVar2 = zVar.f5426b;
                if (!z5 && zVar.f5429e) {
                    qVar.t(4);
                    qVar.t(1);
                    qVar.t(1);
                    qVar.t(1);
                    wVar2.b((qVar.i(3) << 30) | (qVar.i(15) << 15) | qVar.i(15));
                    zVar.f5430f = true;
                }
                zVar.f5431g = wVar2.b(i12);
            }
            long j13 = zVar.f5431g;
            i iVar2 = zVar.f5425a;
            iVar2.g(j13, 4);
            iVar2.d(rVar2);
            iVar2.e(false);
            rVar2.F(rVar2.f2694a.length);
        }
        return 0;
    }

    @Override // y0.o
    public final void release() {
    }
}
