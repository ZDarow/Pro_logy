package I;

/* loaded from: classes.dex */
public final class X extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public Object f794o;

    /* renamed from: p, reason: collision with root package name */
    public z3.d f795p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f796q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f797r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(a0 a0Var, d3.b bVar) {
        super(bVar);
        this.f797r = a0Var;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f796q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f797r.b(null, this);
    }
}
