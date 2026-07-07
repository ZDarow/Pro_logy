package I;

/* loaded from: classes.dex */
public final class O extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public k3.n f761o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f762p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Q f763q;

    /* renamed from: r, reason: collision with root package name */
    public int f764r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q q4, d3.b bVar) {
        super(bVar);
        this.f763q = q4;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f762p = obj;
        this.f764r |= Integer.MIN_VALUE;
        return this.f763q.k(null, false, this);
    }
}
