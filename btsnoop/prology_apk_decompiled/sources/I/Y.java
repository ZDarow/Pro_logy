package I;

/* loaded from: classes.dex */
public final class Y extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public z3.d f798o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f799p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f800q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f801r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(a0 a0Var, d3.b bVar) {
        super(bVar);
        this.f801r = a0Var;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f800q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f801r.c(null, this);
    }
}
