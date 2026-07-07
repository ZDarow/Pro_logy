package I;

import b3.InterfaceC0190d;
import p1.AbstractC0462a;

/* renamed from: I.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048q extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f856p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b0 f857q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0048q(b0 b0Var, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f857q = b0Var;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        C0048q c0048q = new C0048q(this.f857q, interfaceC0190d);
        c0048q.f856p = obj;
        return c0048q;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((C0048q) g((InterfaceC0190d) obj2, (b0) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        AbstractC0462a.P(obj);
        b0 b0Var = (b0) this.f856p;
        return Boolean.valueOf((b0Var instanceof C0034c) && b0Var.f805a <= this.f857q.f805a);
    }
}
