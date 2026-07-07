package I;

/* loaded from: classes.dex */
public final class V extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public C0044m f787o;

    /* renamed from: p, reason: collision with root package name */
    public z3.a f788p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f789q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0044m f790r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C0044m c0044m, d3.b bVar) {
        super(bVar);
        this.f790r = c0044m;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f789q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f790r.o(this);
    }
}
