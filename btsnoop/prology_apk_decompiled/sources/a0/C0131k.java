package a0;

/* renamed from: a0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131k implements S {

    /* renamed from: l, reason: collision with root package name */
    public final n0 f3524l;

    /* renamed from: m, reason: collision with root package name */
    public final N f3525m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0125e f3526n;

    /* renamed from: o, reason: collision with root package name */
    public S f3527o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3528p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3529q;

    public C0131k(N n4, W.t tVar) {
        this.f3525m = n4;
        this.f3524l = new n0(tVar);
    }

    @Override // a0.S
    public final void a(T.K k4) {
        S s = this.f3527o;
        if (s != null) {
            s.a(k4);
            k4 = this.f3527o.b();
        }
        this.f3524l.a(k4);
    }

    @Override // a0.S
    public final T.K b() {
        S s = this.f3527o;
        return s != null ? s.b() : this.f3524l.f3557p;
    }

    @Override // a0.S
    public final boolean c() {
        if (this.f3528p) {
            this.f3524l.getClass();
            return false;
        }
        S s = this.f3527o;
        s.getClass();
        return s.c();
    }

    @Override // a0.S
    public final long e() {
        if (this.f3528p) {
            return this.f3524l.e();
        }
        S s = this.f3527o;
        s.getClass();
        return s.e();
    }
}
