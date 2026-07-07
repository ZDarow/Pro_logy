package R2;

import b3.InterfaceC0190d;
import p1.AbstractC0462a;

/* renamed from: R2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075k extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1820p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M.d f1821q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f1822r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075k(M.d dVar, String str, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1821q = dVar;
        this.f1822r = str;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        C0075k c0075k = new C0075k(this.f1821q, this.f1822r, interfaceC0190d);
        c0075k.f1820p = obj;
        return c0075k;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        C0075k c0075k = (C0075k) g((InterfaceC0190d) obj2, (M.b) obj);
        Z2.g gVar = Z2.g.f3186a;
        c0075k.k(gVar);
        return gVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        AbstractC0462a.P(obj);
        ((M.b) this.f1820p).d(this.f1821q, this.f1822r);
        return Z2.g.f3186a;
    }
}
