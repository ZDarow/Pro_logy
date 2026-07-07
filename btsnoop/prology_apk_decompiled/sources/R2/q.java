package R2;

import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class q extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1839o;

    /* renamed from: p, reason: collision with root package name */
    public int f1840p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r f1841q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f1841q = rVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f1839o = obj;
        this.f1840p |= Integer.MIN_VALUE;
        return this.f1841q.a(null, this);
    }
}
