package u3;

import Y.x;
import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class j extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f8619o;

    /* renamed from: p, reason: collision with root package name */
    public int f8620p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f8621q;

    /* renamed from: r, reason: collision with root package name */
    public x f8622r;
    public e s;

    /* renamed from: t, reason: collision with root package name */
    public v3.n f8623t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x xVar, InterfaceC0190d interfaceC0190d) {
        super(interfaceC0190d);
        this.f8621q = xVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f8619o = obj;
        this.f8620p |= Integer.MIN_VALUE;
        return this.f8621q.C(null, this);
    }
}
