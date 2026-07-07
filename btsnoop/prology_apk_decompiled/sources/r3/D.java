package r3;

/* loaded from: classes.dex */
public final class D implements c0, j3.l {

    /* renamed from: l, reason: collision with root package name */
    public final C f8112l;

    public D(C c4) {
        this.f8112l = c4;
    }

    public final void a(Throwable th) {
        this.f8112l.d();
    }

    @Override // j3.l
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        a((Throwable) obj);
        return Z2.g.f3186a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f8112l + ']';
    }
}
