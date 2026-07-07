package I;

import b3.InterfaceC0190d;

/* renamed from: I.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049s extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f861o;

    /* renamed from: p, reason: collision with root package name */
    public int f862p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0050t f863q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0049s(C0050t c0050t, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f863q = c0050t;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f861o = obj;
        this.f862p |= Integer.MIN_VALUE;
        return this.f863q.a(null, this);
    }
}
