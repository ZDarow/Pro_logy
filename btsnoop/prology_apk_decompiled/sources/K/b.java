package K;

import B3.p;

/* loaded from: classes.dex */
public final class b extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public Object f898o;

    /* renamed from: p, reason: collision with root package name */
    public p f899p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f900q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f901r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d3.b bVar) {
        super(bVar);
        this.f901r = cVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f900q = obj;
        this.s |= Integer.MIN_VALUE;
        return c.a(this.f901r, this);
    }
}
