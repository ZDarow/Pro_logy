package d0;

import T.C0095p;
import W.y;
import Y.x;
import q0.a0;

/* loaded from: classes.dex */
public final class l implements a0 {

    /* renamed from: l, reason: collision with root package name */
    public final C0095p f4903l;

    /* renamed from: n, reason: collision with root package name */
    public long[] f4905n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4906o;

    /* renamed from: p, reason: collision with root package name */
    public e0.g f4907p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4908q;

    /* renamed from: r, reason: collision with root package name */
    public int f4909r;

    /* renamed from: m, reason: collision with root package name */
    public final B1.d f4904m = new B1.d(7);
    public long s = -9223372036854775807L;

    public l(e0.g gVar, C0095p c0095p, boolean z4) {
        this.f4903l = c0095p;
        this.f4907p = gVar;
        this.f4905n = gVar.f5058b;
        b(gVar, z4);
    }

    @Override // q0.a0
    public final void a() {
    }

    public final void b(e0.g gVar, boolean z4) {
        int i4 = this.f4909r;
        long j4 = -9223372036854775807L;
        long j5 = i4 == 0 ? -9223372036854775807L : this.f4905n[i4 - 1];
        this.f4906o = z4;
        this.f4907p = gVar;
        long[] jArr = gVar.f5058b;
        this.f4905n = jArr;
        long j6 = this.s;
        if (j6 == -9223372036854775807L) {
            if (j5 != -9223372036854775807L) {
                this.f4909r = y.b(jArr, j5, false);
            }
        } else {
            int b4 = y.b(jArr, j6, true);
            this.f4909r = b4;
            if (this.f4906o && b4 == this.f4905n.length) {
                j4 = j6;
            }
            this.s = j4;
        }
    }

    @Override // q0.a0
    public final boolean d() {
        return true;
    }

    @Override // q0.a0
    public final int n(long j4) {
        int max = Math.max(this.f4909r, y.b(this.f4905n, j4, true));
        int i4 = max - this.f4909r;
        this.f4909r = max;
        return i4;
    }

    @Override // q0.a0
    public final int o(x xVar, Z.f fVar, int i4) {
        int i5 = this.f4909r;
        boolean z4 = i5 == this.f4905n.length;
        if (z4 && !this.f4906o) {
            fVar.f1886m = 4;
            return -4;
        }
        if ((i4 & 2) != 0 || !this.f4908q) {
            xVar.f3066n = this.f4903l;
            this.f4908q = true;
            return -5;
        }
        if (z4) {
            return -3;
        }
        if ((i4 & 1) == 0) {
            this.f4909r = i5 + 1;
        }
        if ((i4 & 4) == 0) {
            byte[] k4 = this.f4904m.k(this.f4907p.f5057a[i5]);
            fVar.h(k4.length);
            fVar.f3140p.put(k4);
        }
        fVar.f3142r = this.f4905n[i5];
        fVar.f1886m = 1;
        return -4;
    }
}
