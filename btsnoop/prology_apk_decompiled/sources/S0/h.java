package S0;

import T.C0095p;
import W.y;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f1904a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1905b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1906c;

    public h(int i4, int i5, SparseArray sparseArray) {
        this.f1904a = i4;
        this.f1905b = i5;
        this.f1906c = sparseArray;
    }

    @Override // S0.f
    public int a() {
        return this.f1904a;
    }

    @Override // S0.f
    public int b() {
        return this.f1905b;
    }

    @Override // S0.f
    public int c() {
        int i4 = this.f1904a;
        return i4 == -1 ? ((W.r) this.f1906c).y() : i4;
    }

    public h(b bVar, C0095p c0095p) {
        W.r rVar = bVar.f1884n;
        this.f1906c = rVar;
        rVar.G(12);
        int y4 = rVar.y();
        if ("audio/raw".equals(c0095p.f2325m)) {
            int B4 = y.B(c0095p.f2305C, c0095p.f2303A);
            if (y4 == 0 || y4 % B4 != 0) {
                W.a.A("AtomParsers", "Audio sample size mismatch. stsd sample size: " + B4 + ", stsz sample size: " + y4);
                y4 = B4;
            }
        }
        this.f1904a = y4 == 0 ? -1 : y4;
        this.f1905b = rVar.y();
    }
}
