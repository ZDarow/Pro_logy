package R2;

import b3.InterfaceC0190d;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class H extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1779p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M.d f1780q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f1781r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(M.d dVar, long j4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1780q = dVar;
        this.f1781r = j4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        H h4 = new H(this.f1780q, this.f1781r, interfaceC0190d);
        h4.f1779p = obj;
        return h4;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        H h4 = (H) g((InterfaceC0190d) obj2, (M.b) obj);
        Z2.g gVar = Z2.g.f3186a;
        h4.k(gVar);
        return gVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        AbstractC0462a.P(obj);
        ((M.b) this.f1779p).d(this.f1780q, new Long(this.f1781r));
        return Z2.g.f3186a;
    }
}
