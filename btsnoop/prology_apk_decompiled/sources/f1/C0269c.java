package f1;

import S0.i;
import T.C0094o;
import T.C0095p;
import T.H;
import T.I;
import W.y;
import java.math.RoundingMode;
import y0.F;
import y0.l;
import y0.q;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269c implements InterfaceC0268b {

    /* renamed from: a, reason: collision with root package name */
    public final q f5474a;

    /* renamed from: b, reason: collision with root package name */
    public final F f5475b;

    /* renamed from: c, reason: collision with root package name */
    public final i f5476c;

    /* renamed from: d, reason: collision with root package name */
    public final C0095p f5477d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5478e;

    /* renamed from: f, reason: collision with root package name */
    public long f5479f;

    /* renamed from: g, reason: collision with root package name */
    public int f5480g;

    /* renamed from: h, reason: collision with root package name */
    public long f5481h;

    public C0269c(q qVar, F f4, i iVar, String str, int i4) {
        this.f5474a = qVar;
        this.f5475b = f4;
        this.f5476c = iVar;
        int i5 = iVar.f1910d;
        int i6 = iVar.f1907a;
        int i7 = (i5 * i6) / 8;
        int i8 = iVar.f1909c;
        if (i8 != i7) {
            throw I.a(null, "Expected block size: " + i7 + "; got: " + i8);
        }
        int i9 = iVar.f1908b;
        int i10 = i9 * i7;
        int i11 = i10 * 8;
        int max = Math.max(i7, i10 / 10);
        this.f5478e = max;
        C0094o c0094o = new C0094o();
        c0094o.f2290l = H.l(str);
        c0094o.f2285g = i11;
        c0094o.f2286h = i11;
        c0094o.f2291m = max;
        c0094o.f2302z = i6;
        c0094o.f2270A = i9;
        c0094o.f2271B = i4;
        this.f5477d = new C0095p(c0094o);
    }

    @Override // f1.InterfaceC0268b
    public final void a(long j4) {
        this.f5479f = j4;
        this.f5480g = 0;
        this.f5481h = 0L;
    }

    @Override // f1.InterfaceC0268b
    public final void b(long j4, int i4) {
        this.f5474a.t(new C0272f(this.f5476c, 1, i4, j4));
        this.f5475b.c(this.f5477d);
    }

    @Override // f1.InterfaceC0268b
    public final boolean c(l lVar, long j4) {
        int i4;
        int i5;
        long j5 = j4;
        while (j5 > 0 && (i4 = this.f5480g) < (i5 = this.f5478e)) {
            int d4 = this.f5475b.d(lVar, (int) Math.min(i5 - i4, j5), true);
            if (d4 == -1) {
                j5 = 0;
            } else {
                this.f5480g += d4;
                j5 -= d4;
            }
        }
        i iVar = this.f5476c;
        int i6 = this.f5480g;
        int i7 = iVar.f1909c;
        int i8 = i6 / i7;
        if (i8 > 0) {
            long j6 = this.f5479f;
            long j7 = this.f5481h;
            long j8 = iVar.f1908b;
            int i9 = y.f2709a;
            long U3 = j6 + y.U(j7, 1000000L, j8, RoundingMode.FLOOR);
            int i10 = i8 * i7;
            int i11 = this.f5480g - i10;
            this.f5475b.b(U3, 1, i10, i11, null);
            this.f5481h += i8;
            this.f5480g = i11;
        }
        return j5 <= 0;
    }
}
