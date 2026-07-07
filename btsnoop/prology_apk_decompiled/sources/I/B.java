package I;

/* loaded from: classes.dex */
public final class B extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public Q f715o;

    /* renamed from: p, reason: collision with root package name */
    public int f716p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f717q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Q f718r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Q q4, d3.b bVar) {
        super(bVar);
        this.f718r = q4;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f717q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f718r.i(this);
    }
}
