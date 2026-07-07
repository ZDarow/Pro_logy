package I;

import b3.InterfaceC0190d;
import p1.AbstractC0462a;

/* renamed from: I.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047p extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f855p;

    /* JADX WARN: Type inference failed for: r0v0, types: [d3.g, I.p, b3.d] */
    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        ?? gVar = new d3.g(2, interfaceC0190d);
        gVar.f855p = obj;
        return gVar;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((C0047p) g((InterfaceC0190d) obj2, (b0) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        AbstractC0462a.P(obj);
        return Boolean.valueOf(!(((b0) this.f855p) instanceof S));
    }
}
