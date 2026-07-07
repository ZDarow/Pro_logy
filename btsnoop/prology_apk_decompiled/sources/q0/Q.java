package q0;

import java.io.IOException;

/* loaded from: classes.dex */
public final class Q implements a0 {

    /* renamed from: l, reason: collision with root package name */
    public final int f7712l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f7713m;

    public Q(T t4, int i4) {
        this.f7713m = t4;
        this.f7712l = i4;
    }

    @Override // q0.a0
    public final void a() {
        T t4 = this.f7713m;
        t4.f7721D[this.f7712l].u();
        int e4 = t4.f7744o.e(t4.f7730N);
        u0.n nVar = t4.f7750v;
        IOException iOException = nVar.f8544n;
        if (iOException != null) {
            throw iOException;
        }
        u0.j jVar = nVar.f8543m;
        if (jVar != null) {
            if (e4 == Integer.MIN_VALUE) {
                e4 = jVar.f8530l;
            }
            IOException iOException2 = jVar.f8534p;
            if (iOException2 != null && jVar.f8535q > e4) {
                throw iOException2;
            }
        }
    }

    @Override // q0.a0
    public final boolean d() {
        T t4 = this.f7713m;
        return !t4.E() && t4.f7721D[this.f7712l].s(t4.f7739W);
    }

    @Override // q0.a0
    public final int n(long j4) {
        T t4 = this.f7713m;
        if (t4.E()) {
            return 0;
        }
        int i4 = this.f7712l;
        t4.A(i4);
        Z z4 = t4.f7721D[i4];
        int p2 = z4.p(j4, t4.f7739W);
        z4.C(p2);
        if (p2 != 0) {
            return p2;
        }
        t4.B(i4);
        return p2;
    }

    @Override // q0.a0
    public final int o(Y.x xVar, Z.f fVar, int i4) {
        T t4 = this.f7713m;
        if (t4.E()) {
            return -3;
        }
        int i5 = this.f7712l;
        t4.A(i5);
        int x3 = t4.f7721D[i5].x(xVar, fVar, i4, t4.f7739W);
        if (x3 == -3) {
            t4.B(i5);
        }
        return x3;
    }
}
