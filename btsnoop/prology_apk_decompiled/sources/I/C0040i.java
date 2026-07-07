package I;

/* renamed from: I.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040i extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public C0044m f825o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f826p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0044m f827q;

    /* renamed from: r, reason: collision with root package name */
    public int f828r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040i(C0044m c0044m, d3.b bVar) {
        super(bVar);
        this.f827q = c0044m;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f826p = obj;
        this.f828r |= Integer.MIN_VALUE;
        return this.f827q.f(this);
    }
}
