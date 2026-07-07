package K;

/* loaded from: classes.dex */
public final class g extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public i f914o;

    /* renamed from: p, reason: collision with root package name */
    public c f915p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f916q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f917r;
    public final /* synthetic */ i s;

    /* renamed from: t, reason: collision with root package name */
    public int f918t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, d3.b bVar) {
        super(bVar);
        this.s = iVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f917r = obj;
        this.f918t |= Integer.MIN_VALUE;
        return this.s.a(null, this);
    }
}
