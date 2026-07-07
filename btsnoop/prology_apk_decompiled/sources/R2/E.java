package R2;

import b3.InterfaceC0190d;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class E extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1770p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M.d f1771q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ double f1772r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(M.d dVar, double d4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1771q = dVar;
        this.f1772r = d4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        E e4 = new E(this.f1771q, this.f1772r, interfaceC0190d);
        e4.f1770p = obj;
        return e4;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        E e4 = (E) g((InterfaceC0190d) obj2, (M.b) obj);
        Z2.g gVar = Z2.g.f3186a;
        e4.k(gVar);
        return gVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        AbstractC0462a.P(obj);
        ((M.b) this.f1770p).d(this.f1771q, new Double(this.f1772r));
        return Z2.g.f3186a;
    }
}
