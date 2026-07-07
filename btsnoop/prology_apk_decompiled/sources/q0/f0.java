package q0;

import T.C0095p;

/* loaded from: classes.dex */
public final class f0 implements a0 {

    /* renamed from: l, reason: collision with root package name */
    public final long f7835l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7836m;

    /* renamed from: n, reason: collision with root package name */
    public long f7837n;

    public f0(long j4) {
        C0095p c0095p = g0.f7846u;
        int i4 = W.y.f2709a;
        this.f7835l = 4 * ((j4 * 44100) / 1000000);
        b(0L);
    }

    @Override // q0.a0
    public final void a() {
    }

    public final void b(long j4) {
        C0095p c0095p = g0.f7846u;
        int i4 = W.y.f2709a;
        this.f7837n = W.y.k(4 * ((j4 * 44100) / 1000000), 0L, this.f7835l);
    }

    @Override // q0.a0
    public final boolean d() {
        return true;
    }

    @Override // q0.a0
    public final int n(long j4) {
        long j5 = this.f7837n;
        b(j4);
        return (int) ((this.f7837n - j5) / g0.w.length);
    }

    @Override // q0.a0
    public final int o(Y.x xVar, Z.f fVar, int i4) {
        if (!this.f7836m || (i4 & 2) != 0) {
            xVar.f3066n = g0.f7846u;
            this.f7836m = true;
            return -5;
        }
        long j4 = this.f7837n;
        long j5 = this.f7835l - j4;
        if (j5 == 0) {
            fVar.a(4);
            return -4;
        }
        C0095p c0095p = g0.f7846u;
        int i5 = W.y.f2709a;
        fVar.f3142r = ((j4 / 4) * 1000000) / 44100;
        fVar.a(1);
        byte[] bArr = g0.w;
        int min = (int) Math.min(bArr.length, j5);
        if ((4 & i4) == 0) {
            fVar.h(min);
            fVar.f3140p.put(bArr, 0, min);
        }
        if ((i4 & 1) == 0) {
            this.f7837n += min;
        }
        return -4;
    }
}
