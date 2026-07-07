package w3;

import b3.InterfaceC0195i;

/* loaded from: classes.dex */
public final class p extends k3.i implements j3.l {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j3.l f8943m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f8944n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0195i f8945o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j3.l lVar, Object obj, InterfaceC0195i interfaceC0195i) {
        super(1);
        this.f8943m = lVar;
        this.f8944n = obj;
        this.f8945o = interfaceC0195i;
    }

    @Override // j3.l
    public final Object b(Object obj) {
        a.a(this.f8943m, this.f8944n, this.f8945o);
        return Z2.g.f3186a;
    }
}
