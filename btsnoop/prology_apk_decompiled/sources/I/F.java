package I;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class F extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public Object f731o;

    /* renamed from: p, reason: collision with root package name */
    public Object f732p;

    /* renamed from: q, reason: collision with root package name */
    public Serializable f733q;

    /* renamed from: r, reason: collision with root package name */
    public k3.p f734r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public int f735t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f736u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Q f737v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Q q4, d3.b bVar) {
        super(bVar);
        this.f737v = q4;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f736u = obj;
        this.w |= Integer.MIN_VALUE;
        return Q.g(this.f737v, false, this);
    }
}
