package r0;

import T.C0095p;
import T.H;
import W.r;
import Y.B;
import Y.x;
import a.AbstractC0110a;
import q0.Z;
import y0.F;

/* loaded from: classes.dex */
public final class j extends AbstractC0499a {

    /* renamed from: A, reason: collision with root package name */
    public final long f8054A;

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC0504f f8055B;

    /* renamed from: C, reason: collision with root package name */
    public long f8056C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f8057D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8058E;

    /* renamed from: z, reason: collision with root package name */
    public final int f8059z;

    public j(Y.h hVar, Y.l lVar, C0095p c0095p, int i4, Object obj, long j4, long j5, long j6, long j7, long j8, int i5, long j9, InterfaceC0504f interfaceC0504f) {
        super(hVar, lVar, c0095p, i4, obj, j4, j5, j6, j7, j8);
        this.f8059z = i5;
        this.f8054A = j9;
        this.f8055B = interfaceC0504f;
    }

    @Override // r0.l
    public final long a() {
        return this.f8063u + this.f8059z;
    }

    @Override // u0.k
    public final void b() {
        int l4;
        x xVar = this.f7999x;
        W.a.k(xVar);
        if (this.f8056C == 0) {
            long j4 = this.f8054A;
            for (Z z4 : (Z[]) xVar.f3066n) {
                if (z4.f7782F != j4) {
                    z4.f7782F = j4;
                    z4.f7807z = true;
                }
            }
            InterfaceC0504f interfaceC0504f = this.f8055B;
            long j5 = this.f7998v;
            long j6 = j5 == -9223372036854775807L ? -9223372036854775807L : j5 - this.f8054A;
            long j7 = this.w;
            ((C0502d) interfaceC0504f).a(xVar, j6, j7 == -9223372036854775807L ? -9223372036854775807L : j7 - this.f8054A);
        }
        try {
            Y.l a4 = this.f8021m.a(this.f8056C);
            B b4 = this.f8027t;
            y0.l lVar = new y0.l(b4, a4.f3033e, b4.b(a4));
            do {
                try {
                    if (this.f8057D) {
                        break;
                    }
                    l4 = ((C0502d) this.f8055B).f8012l.l(lVar, C0502d.f8011v);
                    W.a.j(l4 != 1);
                } finally {
                    this.f8056C = lVar.f9089o - this.f8021m.f3033e;
                }
            } while (l4 == 0);
            C0095p c0095p = this.f8023o;
            if (H.i(c0095p.f2324l)) {
                int i4 = c0095p.f2310H;
                int i5 = c0095p.f2311I;
                if ((i4 > 1 || i5 > 1) && i4 != -1 && i5 != -1) {
                    F a02 = xVar.a0(4);
                    int i6 = i4 * i5;
                    long j8 = (this.s - this.f8026r) / i6;
                    for (int i7 = 1; i7 < i6; i7++) {
                        a02.a(new r(), 0, 0);
                        a02.b(i7 * j8, 0, 0, 0, null);
                    }
                }
            }
            AbstractC0110a.m(this.f8027t);
            this.f8058E = !this.f8057D;
        } catch (Throwable th) {
            AbstractC0110a.m(this.f8027t);
            throw th;
        }
    }

    @Override // u0.k
    public final void c() {
        this.f8057D = true;
    }

    @Override // r0.l
    public final boolean d() {
        return this.f8058E;
    }
}
