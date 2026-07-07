package I;

import b3.InterfaceC0190d;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class Z extends d3.g implements j3.p {
    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new d3.g(2, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        Z z4 = (Z) g((InterfaceC0190d) obj2, (u3.e) obj);
        Z2.g gVar = Z2.g.f3186a;
        z4.k(gVar);
        return gVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        AbstractC0462a.P(obj);
        return Z2.g.f3186a;
    }
}
