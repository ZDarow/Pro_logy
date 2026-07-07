package u3;

/* loaded from: classes.dex */
public final class b extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public t3.o f8599o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f8600p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f8601q;

    /* renamed from: r, reason: collision with root package name */
    public int f8602r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d3.b bVar) {
        super(bVar);
        this.f8601q = cVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f8600p = obj;
        this.f8602r |= Integer.MIN_VALUE;
        return this.f8601q.a(null, this);
    }
}
