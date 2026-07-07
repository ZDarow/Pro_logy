package A0;

import u3.m;
import y0.C0617A;
import y0.s;
import y0.y;
import y0.z;

/* loaded from: classes.dex */
public class b implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6c;

    public /* synthetic */ b(Object obj, long j4, int i4) {
        this.f4a = i4;
        this.f6c = obj;
        this.f5b = j4;
    }

    @Override // y0.z
    public final boolean c() {
        switch (this.f4a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // y0.z
    public final y f(long j4) {
        switch (this.f4a) {
            case 0:
                d dVar = (d) this.f6c;
                y b4 = dVar.f18i[0].b(j4);
                int i4 = 1;
                while (true) {
                    g[] gVarArr = dVar.f18i;
                    if (i4 >= gVarArr.length) {
                        return b4;
                    }
                    y b5 = gVarArr[i4].b(j4);
                    if (b5.f9141a.f8992b < b4.f9141a.f8992b) {
                        b4 = b5;
                    }
                    i4++;
                }
            case 1:
                s sVar = (s) this.f6c;
                W.a.k(sVar.f9114k);
                m mVar = sVar.f9114k;
                long[] jArr = (long[]) mVar.f8632l;
                int f4 = W.y.f(jArr, W.y.k((sVar.f9108e * j4) / 1000000, 0L, sVar.f9113j - 1), false);
                long j5 = f4 == -1 ? 0L : jArr[f4];
                long[] jArr2 = (long[]) mVar.f8633m;
                long j6 = f4 != -1 ? jArr2[f4] : 0L;
                int i5 = sVar.f9108e;
                long j7 = (j5 * 1000000) / i5;
                long j8 = this.f5b;
                C0617A c0617a = new C0617A(j7, j6 + j8);
                if (j7 == j4 || f4 == jArr.length - 1) {
                    return new y(c0617a, c0617a);
                }
                int i6 = f4 + 1;
                return new y(c0617a, new C0617A((jArr[i6] * 1000000) / i5, j8 + jArr2[i6]));
            default:
                return (y) this.f6c;
        }
    }

    @Override // y0.z
    public final long i() {
        switch (this.f4a) {
            case 0:
                return this.f5b;
            case 1:
                return ((s) this.f6c).b();
            default:
                return this.f5b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(long j4) {
        this(j4, 0L);
        this.f4a = 2;
    }

    public b(long j4, long j5) {
        this.f4a = 2;
        this.f5b = j4;
        C0617A c0617a = j5 == 0 ? C0617A.f8990c : new C0617A(0L, j5);
        this.f6c = new y(c0617a, c0617a);
    }
}
