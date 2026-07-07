package w3;

import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import p1.AbstractC0462a;
import r3.AbstractC0514a;
import r3.AbstractC0534v;

/* loaded from: classes.dex */
public class t extends AbstractC0514a implements d3.c {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0190d f8947o;

    public t(InterfaceC0190d interfaceC0190d, InterfaceC0195i interfaceC0195i) {
        super(interfaceC0195i, true);
        this.f8947o = interfaceC0190d;
    }

    @Override // r3.Z
    public final boolean J() {
        return true;
    }

    @Override // d3.c
    public final d3.c d() {
        InterfaceC0190d interfaceC0190d = this.f8947o;
        if (interfaceC0190d instanceof d3.c) {
            return (d3.c) interfaceC0190d;
        }
        return null;
    }

    @Override // r3.Z
    public void q(Object obj) {
        a.i(AbstractC0462a.C(this.f8947o), AbstractC0534v.h(obj), null);
    }

    @Override // r3.Z
    public void r(Object obj) {
        this.f8947o.i(AbstractC0534v.h(obj));
    }
}
