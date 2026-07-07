package q0;

import T.C0094o;
import T.C0095p;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471c implements a0 {

    /* renamed from: l, reason: collision with root package name */
    public final a0 f7815l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7816m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0472d f7817n;

    public C0471c(C0472d c0472d, a0 a0Var) {
        this.f7817n = c0472d;
        this.f7815l = a0Var;
    }

    @Override // q0.a0
    public final void a() {
        this.f7815l.a();
    }

    @Override // q0.a0
    public final boolean d() {
        return !this.f7817n.a() && this.f7815l.d();
    }

    @Override // q0.a0
    public final int n(long j4) {
        if (this.f7817n.a()) {
            return -3;
        }
        return this.f7815l.n(j4);
    }

    @Override // q0.a0
    public final int o(Y.x xVar, Z.f fVar, int i4) {
        C0472d c0472d = this.f7817n;
        if (c0472d.a()) {
            return -3;
        }
        if (this.f7816m) {
            fVar.f1886m = 4;
            return -4;
        }
        long h4 = c0472d.h();
        int o2 = this.f7815l.o(xVar, fVar, i4);
        if (o2 != -5) {
            long j4 = c0472d.f7823q;
            if (j4 == Long.MIN_VALUE || ((o2 != -4 || fVar.f3142r < j4) && !(o2 == -3 && h4 == Long.MIN_VALUE && !fVar.f3141q))) {
                return o2;
            }
            fVar.e();
            fVar.f1886m = 4;
            this.f7816m = true;
            return -4;
        }
        C0095p c0095p = (C0095p) xVar.f3066n;
        c0095p.getClass();
        int i5 = c0095p.f2307E;
        int i6 = c0095p.f2306D;
        if (i6 != 0 || i5 != 0) {
            if (c0472d.f7822p != 0) {
                i6 = 0;
            }
            if (c0472d.f7823q != Long.MIN_VALUE) {
                i5 = 0;
            }
            C0094o a4 = c0095p.a();
            a4.f2272C = i6;
            a4.f2273D = i5;
            xVar.f3066n = new C0095p(a4);
        }
        return -5;
    }
}
