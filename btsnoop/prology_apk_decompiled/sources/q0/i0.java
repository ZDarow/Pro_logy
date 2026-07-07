package q0;

/* loaded from: classes.dex */
public final class i0 implements a0 {

    /* renamed from: l, reason: collision with root package name */
    public final a0 f7867l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7868m;

    public i0(a0 a0Var, long j4) {
        this.f7867l = a0Var;
        this.f7868m = j4;
    }

    @Override // q0.a0
    public final void a() {
        this.f7867l.a();
    }

    @Override // q0.a0
    public final boolean d() {
        return this.f7867l.d();
    }

    @Override // q0.a0
    public final int n(long j4) {
        return this.f7867l.n(j4 - this.f7868m);
    }

    @Override // q0.a0
    public final int o(Y.x xVar, Z.f fVar, int i4) {
        int o2 = this.f7867l.o(xVar, fVar, i4);
        if (o2 == -4) {
            fVar.f3142r += this.f7868m;
        }
        return o2;
    }
}
