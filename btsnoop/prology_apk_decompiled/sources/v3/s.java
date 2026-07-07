package v3;

import b3.InterfaceC0190d;
import b3.InterfaceC0195i;

/* loaded from: classes.dex */
public final class s implements InterfaceC0190d, d3.c {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0190d f8742l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0195i f8743m;

    public s(InterfaceC0190d interfaceC0190d, InterfaceC0195i interfaceC0195i) {
        this.f8742l = interfaceC0190d;
        this.f8743m = interfaceC0195i;
    }

    @Override // d3.c
    public final d3.c d() {
        InterfaceC0190d interfaceC0190d = this.f8742l;
        if (interfaceC0190d instanceof d3.c) {
            return (d3.c) interfaceC0190d;
        }
        return null;
    }

    @Override // b3.InterfaceC0190d
    public final InterfaceC0195i f() {
        return this.f8743m;
    }

    @Override // b3.InterfaceC0190d
    public final void i(Object obj) {
        this.f8742l.i(obj);
    }
}
