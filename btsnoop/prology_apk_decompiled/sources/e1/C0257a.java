package e1;

import T.C0098t;
import y0.AbstractC0619b;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257a implements y0.o {

    /* renamed from: a, reason: collision with root package name */
    public final C0258b f5145a = new C0258b();

    /* renamed from: b, reason: collision with root package name */
    public final W.r f5146b = new W.r(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f5147c;

    @Override // y0.o
    public final void b(long j4, long j5) {
        this.f5147c = false;
        this.f5145a.b();
    }

    @Override // y0.o
    public final void g(y0.q qVar) {
        this.f5145a.f(qVar, new G(0, 1));
        qVar.s();
        qVar.t(new A0.b(-9223372036854775807L));
    }

    @Override // y0.o
    public final boolean k(y0.p pVar) {
        y0.l lVar;
        int h4;
        W.r rVar = new W.r(10);
        int i4 = 0;
        while (true) {
            lVar = (y0.l) pVar;
            lVar.p(rVar.f2694a, 0, 10, false);
            rVar.G(0);
            if (rVar.x() != 4801587) {
                break;
            }
            rVar.H(3);
            int t4 = rVar.t();
            i4 += t4 + 10;
            lVar.a(t4, false);
        }
        lVar.f9091q = 0;
        lVar.a(i4, false);
        int i5 = 0;
        int i6 = i4;
        while (true) {
            lVar.p(rVar.f2694a, 0, 6, false);
            rVar.G(0);
            if (rVar.A() != 2935) {
                lVar.f9091q = 0;
                i6++;
                if (i6 - i4 >= 8192) {
                    return false;
                }
                lVar.a(i6, false);
                i5 = 0;
            } else {
                i5++;
                if (i5 >= 4) {
                    return true;
                }
                byte[] bArr = rVar.f2694a;
                if (bArr.length < 6) {
                    h4 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    h4 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b4 = bArr[4];
                    h4 = AbstractC0619b.h((b4 & 192) >> 6, b4 & 63);
                }
                if (h4 == -1) {
                    return false;
                }
                lVar.a(h4 - 6, false);
            }
        }
    }

    @Override // y0.o
    public final int l(y0.p pVar, C0098t c0098t) {
        W.r rVar = this.f5146b;
        int read = ((y0.l) pVar).read(rVar.f2694a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        rVar.G(0);
        rVar.F(read);
        boolean z4 = this.f5147c;
        C0258b c0258b = this.f5145a;
        if (!z4) {
            c0258b.f5161n = 0L;
            this.f5147c = true;
        }
        c0258b.d(rVar);
        return 0;
    }

    @Override // y0.o
    public final void release() {
    }
}
