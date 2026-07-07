package R2;

import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class x extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1867o;

    /* renamed from: p, reason: collision with root package name */
    public int f1868p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0078n f1869q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0078n c0078n, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f1869q = c0078n;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f1867o = obj;
        this.f1868p |= Integer.MIN_VALUE;
        return this.f1869q.a(null, this);
    }
}
