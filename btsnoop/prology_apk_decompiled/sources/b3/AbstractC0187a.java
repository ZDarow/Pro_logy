package b3;

import a.AbstractC0110a;
import j3.p;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0187a implements InterfaceC0193g {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0194h f4457l;

    public AbstractC0187a(InterfaceC0194h interfaceC0194h) {
        this.f4457l = interfaceC0194h;
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i c(InterfaceC0195i interfaceC0195i) {
        return AbstractC0110a.J(this, interfaceC0195i);
    }

    @Override // b3.InterfaceC0193g
    public final InterfaceC0194h getKey() {
        return this.f4457l;
    }

    @Override // b3.InterfaceC0195i
    public InterfaceC0193g j(InterfaceC0194h interfaceC0194h) {
        return AbstractC0110a.y(this, interfaceC0194h);
    }

    @Override // b3.InterfaceC0195i
    public final Object k(Object obj, p pVar) {
        return pVar.h(obj, this);
    }

    @Override // b3.InterfaceC0195i
    public InterfaceC0195i m(InterfaceC0194h interfaceC0194h) {
        return AbstractC0110a.H(this, interfaceC0194h);
    }
}
