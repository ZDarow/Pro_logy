package R2;

import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class z extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1874o;

    /* renamed from: p, reason: collision with root package name */
    public int f1875p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0078n f1876q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0078n c0078n, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f1876q = c0078n;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f1874o = obj;
        this.f1875p |= Integer.MIN_VALUE;
        return this.f1876q.a(null, this);
    }
}
