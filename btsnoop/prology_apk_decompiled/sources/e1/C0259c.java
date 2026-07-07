package e1;

import T.C0098t;

/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259c implements y0.o {

    /* renamed from: a, reason: collision with root package name */
    public final C0258b f5162a = new C0258b(0, 1, null);

    /* renamed from: b, reason: collision with root package name */
    public final W.r f5163b = new W.r(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f5164c;

    @Override // y0.o
    public final void b(long j4, long j5) {
        this.f5164c = false;
        this.f5162a.b();
    }

    @Override // y0.o
    public final void g(y0.q qVar) {
        this.f5162a.f(qVar, new G(0, 1));
        qVar.s();
        qVar.t(new A0.b(-9223372036854775807L));
    }

    @Override // y0.o
    public final boolean k(y0.p pVar) {
        y0.l lVar;
        int i4;
        W.r rVar = new W.r(10);
        int i5 = 0;
        while (true) {
            lVar = (y0.l) pVar;
            lVar.p(rVar.f2694a, 0, 10, false);
            rVar.G(0);
            if (rVar.x() != 4801587) {
                break;
            }
            rVar.H(3);
            int t4 = rVar.t();
            i5 += t4 + 10;
            lVar.a(t4, false);
        }
        lVar.f9091q = 0;
        lVar.a(i5, false);
        int i6 = 0;
        int i7 = i5;
        while (true) {
            int i8 = 7;
            lVar.p(rVar.f2694a, 0, 7, false);
            rVar.G(0);
            int A4 = rVar.A();
            if (A4 == 44096 || A4 == 44097) {
                i6++;
                if (i6 >= 4) {
                    return true;
                }
                byte[] bArr = rVar.f2694a;
                if (bArr.length < 7) {
                    i4 = -1;
                } else {
                    int i9 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i9 == 65535) {
                        i9 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i8 = 4;
                    }
                    if (A4 == 44097) {
                        i8 += 2;
                    }
                    i4 = i9 + i8;
                }
                if (i4 == -1) {
                    return false;
                }
                lVar.a(i4 - 7, false);
            } else {
                lVar.f9091q = 0;
                i7++;
                if (i7 - i5 >= 8192) {
                    return false;
                }
                lVar.a(i7, false);
                i6 = 0;
            }
        }
    }

    @Override // y0.o
    public final int l(y0.p pVar, C0098t c0098t) {
        W.r rVar = this.f5163b;
        int read = ((y0.l) pVar).read(rVar.f2694a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        rVar.G(0);
        rVar.F(read);
        boolean z4 = this.f5164c;
        C0258b c0258b = this.f5162a;
        if (!z4) {
            c0258b.f5161n = 0L;
            this.f5164c = true;
        }
        c0258b.d(rVar);
        return 0;
    }

    @Override // y0.o
    public final void release() {
    }
}
