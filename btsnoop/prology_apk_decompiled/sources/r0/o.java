package r0;

import T.C0095p;
import Y.B;
import Y.x;
import a.AbstractC0110a;
import q0.Z;
import y0.F;

/* loaded from: classes.dex */
public final class o extends AbstractC0499a {

    /* renamed from: A, reason: collision with root package name */
    public final C0095p f8065A;

    /* renamed from: B, reason: collision with root package name */
    public long f8066B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8067C;

    /* renamed from: z, reason: collision with root package name */
    public final int f8068z;

    public o(Y.h hVar, Y.l lVar, C0095p c0095p, int i4, Object obj, long j4, long j5, long j6, int i5, C0095p c0095p2) {
        super(hVar, lVar, c0095p, i4, obj, j4, j5, -9223372036854775807L, -9223372036854775807L, j6);
        this.f8068z = i5;
        this.f8065A = c0095p2;
    }

    @Override // u0.k
    public final void b() {
        B b4 = this.f8027t;
        x xVar = this.f7999x;
        W.a.k(xVar);
        for (Z z4 : (Z[]) xVar.f3066n) {
            if (z4.f7782F != 0) {
                z4.f7782F = 0L;
                z4.f7807z = true;
            }
        }
        F a02 = xVar.a0(this.f8068z);
        a02.c(this.f8065A);
        try {
            long b5 = b4.b(this.f8021m.a(this.f8066B));
            if (b5 != -1) {
                b5 += this.f8066B;
            }
            y0.l lVar = new y0.l(this.f8027t, this.f8066B, b5);
            for (int i4 = 0; i4 != -1; i4 = a02.d(lVar, Integer.MAX_VALUE, true)) {
                this.f8066B += i4;
            }
            a02.b(this.f8026r, 1, (int) this.f8066B, 0, null);
            AbstractC0110a.m(b4);
            this.f8067C = true;
        } catch (Throwable th) {
            AbstractC0110a.m(b4);
            throw th;
        }
    }

    @Override // u0.k
    public final void c() {
    }

    @Override // r0.l
    public final boolean d() {
        return this.f8067C;
    }
}
