package R2;

import b3.InterfaceC0190d;

/* renamed from: R2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077m extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1826o;

    /* renamed from: p, reason: collision with root package name */
    public int f1827p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0078n f1828q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077m(C0078n c0078n, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f1828q = c0078n;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f1826o = obj;
        this.f1827p |= Integer.MIN_VALUE;
        return this.f1828q.a(null, this);
    }
}
