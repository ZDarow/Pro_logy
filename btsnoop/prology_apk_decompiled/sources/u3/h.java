package u3;

import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class h extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f8613o;

    /* renamed from: p, reason: collision with root package name */
    public int f8614p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i f8615q;

    /* renamed from: r, reason: collision with root package name */
    public Object f8616r;
    public e s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f8615q = iVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f8613o = obj;
        this.f8614p |= Integer.MIN_VALUE;
        return this.f8615q.C(null, this);
    }
}
