package I;

/* renamed from: I.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052v extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public Q f869o;

    /* renamed from: p, reason: collision with root package name */
    public z3.d f870p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f871q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Q f872r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052v(Q q4, d3.b bVar) {
        super(bVar);
        this.f872r = q4;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f871q = obj;
        this.s |= Integer.MIN_VALUE;
        return Q.a(this.f872r, this);
    }
}
