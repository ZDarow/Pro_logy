package u3;

import R2.C0078n;
import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class n extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public C0078n f8634o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f8635p;

    /* renamed from: q, reason: collision with root package name */
    public int f8636q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0078n f8637r;
    public Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0078n c0078n, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f8637r = c0078n;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f8635p = obj;
        this.f8636q |= Integer.MIN_VALUE;
        return this.f8637r.a(null, this);
    }
}
