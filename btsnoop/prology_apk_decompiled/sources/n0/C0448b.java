package n0;

import W.q;
import W.r;
import W.y;
import m0.C0430k;
import y0.AbstractC0619b;
import y0.C0620c;
import y0.F;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448b implements i {

    /* renamed from: l, reason: collision with root package name */
    public final C0430k f7379l;

    /* renamed from: n, reason: collision with root package name */
    public F f7381n;

    /* renamed from: o, reason: collision with root package name */
    public int f7382o;

    /* renamed from: q, reason: collision with root package name */
    public long f7384q;

    /* renamed from: r, reason: collision with root package name */
    public long f7385r;

    /* renamed from: m, reason: collision with root package name */
    public final q f7380m = new q();

    /* renamed from: p, reason: collision with root package name */
    public long f7383p = -9223372036854775807L;

    public C0448b(C0430k c0430k) {
        this.f7379l = c0430k;
    }

    @Override // n0.i
    public final void b(long j4, long j5) {
        this.f7383p = j4;
        this.f7385r = j5;
    }

    @Override // n0.i
    public final void c(r rVar, long j4, int i4, boolean z4) {
        int u4 = rVar.u() & 3;
        int u5 = rVar.u() & 255;
        long K3 = U1.a.K(this.f7385r, j4, this.f7383p, this.f7379l.f7238b);
        if (u4 != 0) {
            if (u4 == 1 || u4 == 2) {
                int i5 = this.f7382o;
                if (i5 > 0) {
                    F f4 = this.f7381n;
                    int i6 = y.f2709a;
                    f4.b(this.f7384q, 1, i5, 0, null);
                    this.f7382o = 0;
                }
            } else if (u4 != 3) {
                throw new IllegalArgumentException(String.valueOf(u4));
            }
            int a4 = rVar.a();
            F f5 = this.f7381n;
            f5.getClass();
            f5.a(rVar, a4, 0);
            int i7 = this.f7382o + a4;
            this.f7382o = i7;
            this.f7384q = K3;
            if (z4 && u4 == 3) {
                F f6 = this.f7381n;
                int i8 = y.f2709a;
                f6.b(K3, 1, i7, 0, null);
                this.f7382o = 0;
                return;
            }
            return;
        }
        int i9 = this.f7382o;
        if (i9 > 0) {
            F f7 = this.f7381n;
            int i10 = y.f2709a;
            f7.b(this.f7384q, 1, i9, 0, null);
            this.f7382o = 0;
        }
        if (u5 == 1) {
            int a5 = rVar.a();
            F f8 = this.f7381n;
            f8.getClass();
            f8.a(rVar, a5, 0);
            F f9 = this.f7381n;
            int i11 = y.f2709a;
            f9.b(K3, 1, a5, 0, null);
            return;
        }
        byte[] bArr = rVar.f2694a;
        q qVar = this.f7380m;
        qVar.getClass();
        qVar.p(bArr, bArr.length);
        qVar.u(2);
        for (int i12 = 0; i12 < u5; i12++) {
            C0620c o2 = AbstractC0619b.o(qVar);
            F f10 = this.f7381n;
            f10.getClass();
            int i13 = o2.f9040d;
            f10.a(rVar, i13, 0);
            F f11 = this.f7381n;
            int i14 = y.f2709a;
            f11.b(K3, 1, o2.f9040d, 0, null);
            K3 += (o2.f9041e / o2.f9038b) * 1000000;
            qVar.u(i13);
        }
    }

    @Override // n0.i
    public final void d(y0.q qVar, int i4) {
        F v4 = qVar.v(i4, 1);
        this.f7381n = v4;
        v4.c(this.f7379l.f7239c);
    }

    @Override // n0.i
    public final void e(long j4) {
        W.a.j(this.f7383p == -9223372036854775807L);
        this.f7383p = j4;
    }
}
