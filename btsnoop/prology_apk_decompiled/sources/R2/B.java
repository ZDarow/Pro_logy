package R2;

import b3.InterfaceC0190d;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class B extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1761p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M.d f1762q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f1763r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(M.d dVar, boolean z4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1762q = dVar;
        this.f1763r = z4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        B b4 = new B(this.f1762q, this.f1763r, interfaceC0190d);
        b4.f1761p = obj;
        return b4;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        B b4 = (B) g((InterfaceC0190d) obj2, (M.b) obj);
        Z2.g gVar = Z2.g.f3186a;
        b4.k(gVar);
        return gVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        AbstractC0462a.P(obj);
        ((M.b) this.f1761p).d(this.f1762q, Boolean.valueOf(this.f1763r));
        return Z2.g.f3186a;
    }
}
