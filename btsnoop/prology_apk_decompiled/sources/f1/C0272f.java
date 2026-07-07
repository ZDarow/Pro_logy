package f1;

import S0.i;
import W.y;
import java.math.RoundingMode;
import y0.C0617A;
import y0.z;

/* renamed from: f1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272f implements z {

    /* renamed from: a, reason: collision with root package name */
    public final i f5491a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5492b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5493c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5494d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5495e;

    public C0272f(i iVar, int i4, long j4, long j5) {
        this.f5491a = iVar;
        this.f5492b = i4;
        this.f5493c = j4;
        long j6 = (j5 - j4) / iVar.f1909c;
        this.f5494d = j6;
        this.f5495e = b(j6);
    }

    public final long b(long j4) {
        long j5 = j4 * this.f5492b;
        long j6 = this.f5491a.f1908b;
        int i4 = y.f2709a;
        return y.U(j5, 1000000L, j6, RoundingMode.FLOOR);
    }

    @Override // y0.z
    public final boolean c() {
        return true;
    }

    @Override // y0.z
    public final y0.y f(long j4) {
        i iVar = this.f5491a;
        long j5 = this.f5494d;
        long k4 = y.k((iVar.f1908b * j4) / (this.f5492b * 1000000), 0L, j5 - 1);
        long j6 = this.f5493c;
        long b4 = b(k4);
        C0617A c0617a = new C0617A(b4, (iVar.f1909c * k4) + j6);
        if (b4 >= j4 || k4 == j5 - 1) {
            return new y0.y(c0617a, c0617a);
        }
        long j7 = k4 + 1;
        return new y0.y(c0617a, new C0617A(b(j7), (iVar.f1909c * j7) + j6));
    }

    @Override // y0.z
    public final long i() {
        return this.f5495e;
    }
}
