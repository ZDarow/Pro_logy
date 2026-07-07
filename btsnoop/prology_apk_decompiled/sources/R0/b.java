package R0;

import W.y;
import java.math.RoundingMode;
import y0.C0617A;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f1716a;

    /* renamed from: b, reason: collision with root package name */
    public final B.c f1717b;

    /* renamed from: c, reason: collision with root package name */
    public final B.c f1718c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1719d;

    /* renamed from: e, reason: collision with root package name */
    public long f1720e;

    public b(long j4, long j5, long j6) {
        this.f1720e = j4;
        this.f1716a = j6;
        B.c cVar = new B.c(4, false);
        this.f1717b = cVar;
        B.c cVar2 = new B.c(4, false);
        this.f1718c = cVar2;
        cVar.e(0L);
        cVar2.e(j5);
        int i4 = -2147483647;
        if (j4 == -9223372036854775807L) {
            this.f1719d = -2147483647;
            return;
        }
        long U3 = y.U(j5 - j6, 8L, j4, RoundingMode.HALF_UP);
        if (U3 > 0 && U3 <= 2147483647L) {
            i4 = (int) U3;
        }
        this.f1719d = i4;
    }

    @Override // R0.f
    public final long a(long j4) {
        return this.f1717b.g(y.c(this.f1718c, j4));
    }

    public final boolean b(long j4) {
        B.c cVar = this.f1717b;
        return j4 - cVar.g(cVar.f84l - 1) < 100000;
    }

    @Override // y0.z
    public final boolean c() {
        return true;
    }

    @Override // R0.f
    public final long e() {
        return this.f1716a;
    }

    @Override // y0.z
    public final y0.y f(long j4) {
        B.c cVar = this.f1717b;
        int c4 = y.c(cVar, j4);
        long g4 = cVar.g(c4);
        B.c cVar2 = this.f1718c;
        C0617A c0617a = new C0617A(g4, cVar2.g(c4));
        if (g4 == j4 || c4 == cVar.f84l - 1) {
            return new y0.y(c0617a, c0617a);
        }
        int i4 = c4 + 1;
        return new y0.y(c0617a, new C0617A(cVar.g(i4), cVar2.g(i4)));
    }

    @Override // R0.f
    public final int h() {
        return this.f1719d;
    }

    @Override // y0.z
    public final long i() {
        return this.f1720e;
    }
}
