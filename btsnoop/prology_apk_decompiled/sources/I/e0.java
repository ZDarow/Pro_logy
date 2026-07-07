package I;

import a.AbstractC0110a;
import b3.InterfaceC0193g;
import b3.InterfaceC0194h;
import b3.InterfaceC0195i;

/* loaded from: classes.dex */
public final class e0 implements InterfaceC0193g {

    /* renamed from: l, reason: collision with root package name */
    public final e0 f817l;

    /* renamed from: m, reason: collision with root package name */
    public final Q f818m;

    public e0(e0 e0Var, Q q4) {
        k3.h.e(q4, "instance");
        this.f817l = e0Var;
        this.f818m = q4;
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i c(InterfaceC0195i interfaceC0195i) {
        return AbstractC0110a.J(this, interfaceC0195i);
    }

    public final void d(Q q4) {
        if (this.f818m == q4) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        e0 e0Var = this.f817l;
        if (e0Var != null) {
            e0Var.d(q4);
        }
    }

    @Override // b3.InterfaceC0193g
    public final InterfaceC0194h getKey() {
        return d0.f812l;
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0193g j(InterfaceC0194h interfaceC0194h) {
        return AbstractC0110a.y(this, interfaceC0194h);
    }

    @Override // b3.InterfaceC0195i
    public final Object k(Object obj, j3.p pVar) {
        return pVar.h(obj, this);
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i m(InterfaceC0194h interfaceC0194h) {
        return AbstractC0110a.H(this, interfaceC0194h);
    }
}
