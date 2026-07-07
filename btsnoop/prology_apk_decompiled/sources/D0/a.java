package D0;

import T.C0098t;
import W.r;
import y0.AbstractC0619b;
import y0.h;
import y0.i;
import y0.l;
import y0.s;

/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: l, reason: collision with root package name */
    public final s f418l;

    /* renamed from: m, reason: collision with root package name */
    public final int f419m;

    /* renamed from: n, reason: collision with root package name */
    public final C0098t f420n = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, T.t] */
    public a(s sVar, int i4) {
        this.f418l = sVar;
        this.f419m = i4;
    }

    @Override // y0.i
    public final h B(l lVar, long j4) {
        long j5 = lVar.f9089o;
        long a4 = a(lVar);
        long w = lVar.w();
        lVar.a(Math.max(6, this.f418l.f9106c), false);
        long a5 = a(lVar);
        return (a4 > j4 || a5 <= j4) ? a5 <= j4 ? new h(-2, a5, lVar.w()) : new h(-1, a4, j5) : new h(0, -9223372036854775807L, w);
    }

    public final long a(l lVar) {
        long j4;
        C0098t c0098t;
        s sVar;
        boolean d4;
        int f4;
        while (true) {
            long w = lVar.w();
            j4 = lVar.f9088n;
            long j5 = j4 - 6;
            c0098t = this.f420n;
            sVar = this.f418l;
            if (w >= j5) {
                break;
            }
            long w4 = lVar.w();
            byte[] bArr = new byte[2];
            lVar.p(bArr, 0, 2, false);
            int i4 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i5 = this.f419m;
            if (i4 != i5) {
                lVar.f9091q = 0;
                lVar.a((int) (w4 - lVar.f9089o), false);
                d4 = false;
            } else {
                r rVar = new r(16);
                System.arraycopy(bArr, 0, rVar.f2694a, 0, 2);
                byte[] bArr2 = rVar.f2694a;
                int i6 = 0;
                for (int i7 = 2; i6 < 14 && (f4 = lVar.f(bArr2, i7 + i6, 14 - i6)) != -1; i7 = 2) {
                    i6 += f4;
                }
                rVar.F(i6);
                lVar.f9091q = 0;
                lVar.a((int) (w4 - lVar.f9089o), false);
                d4 = AbstractC0619b.d(rVar, sVar, i5, c0098t);
            }
            if (d4) {
                break;
            }
            lVar.a(1, false);
        }
        if (lVar.w() < j4 - 6) {
            return c0098t.f2352a;
        }
        lVar.a((int) (j4 - lVar.w()), false);
        return sVar.f9113j;
    }
}
