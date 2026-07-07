package I;

import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class C extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public Q f719o;

    /* renamed from: p, reason: collision with root package name */
    public b0 f720p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f721q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f722r;
    public final /* synthetic */ Q s;

    /* renamed from: t, reason: collision with root package name */
    public int f723t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Q q4, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.s = q4;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f722r = obj;
        this.f723t |= Integer.MIN_VALUE;
        return Q.f(this.s, false, this);
    }
}
