package u3;

import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class k extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public R2.r f8624o;

    /* renamed from: p, reason: collision with root package name */
    public Object f8625p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f8626q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ R2.r f8627r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(R2.r rVar, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f8627r = rVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f8626q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f8627r.a(null, this);
    }
}
