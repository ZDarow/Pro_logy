package r3;

import a.AbstractC0110a;
import b3.InterfaceC0193g;
import b3.InterfaceC0194h;
import b3.InterfaceC0195i;

/* loaded from: classes.dex */
public final class k0 implements InterfaceC0193g, InterfaceC0194h {

    /* renamed from: l, reason: collision with root package name */
    public static final k0 f8160l = new Object();

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i c(InterfaceC0195i interfaceC0195i) {
        return AbstractC0110a.J(this, interfaceC0195i);
    }

    @Override // b3.InterfaceC0193g
    public final InterfaceC0194h getKey() {
        return this;
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
