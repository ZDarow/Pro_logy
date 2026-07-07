package r3;

import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class V extends C0519f {

    /* renamed from: t, reason: collision with root package name */
    public final C0525l f8130t;

    public V(InterfaceC0190d interfaceC0190d, C0525l c0525l) {
        super(1, interfaceC0190d);
        this.f8130t = c0525l;
    }

    @Override // r3.C0519f
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // r3.C0519f
    public final Throwable t(Z z4) {
        Throwable c4;
        Object E3 = this.f8130t.E();
        return (!(E3 instanceof X) || (c4 = ((X) E3).c()) == null) ? E3 instanceof C0527n ? ((C0527n) E3).f8167a : z4.A() : c4;
    }
}
