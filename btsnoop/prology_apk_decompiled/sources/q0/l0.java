package q0;

/* loaded from: classes.dex */
public abstract class l0 extends AbstractC0478j {

    /* renamed from: v, reason: collision with root package name */
    public final AbstractC0469a f7882v;

    public l0(AbstractC0469a abstractC0469a) {
        this.f7882v = abstractC0469a;
    }

    public F B(F f4) {
        return f4;
    }

    public abstract void C(T.U u4);

    public void D() {
        A(null, this.f7882v);
    }

    @Override // q0.AbstractC0469a
    public final T.U g() {
        return this.f7882v.g();
    }

    @Override // q0.AbstractC0469a
    public final T.B h() {
        return this.f7882v.h();
    }

    @Override // q0.AbstractC0469a
    public final boolean i() {
        return this.f7882v.i();
    }

    @Override // q0.AbstractC0469a
    public final void m(Y.C c4) {
        this.f7870u = c4;
        this.f7869t = W.y.n(null);
        D();
    }

    @Override // q0.AbstractC0469a
    public void u(T.B b4) {
        this.f7882v.u(b4);
    }

    @Override // q0.AbstractC0478j
    public final F v(Object obj, F f4) {
        return B(f4);
    }

    @Override // q0.AbstractC0478j
    public final long w(long j4, Object obj) {
        return j4;
    }

    @Override // q0.AbstractC0478j
    public final int y(int i4, Object obj) {
        return i4;
    }

    @Override // q0.AbstractC0478j
    public final void z(Object obj, AbstractC0469a abstractC0469a, T.U u4) {
        C(u4);
    }
}
