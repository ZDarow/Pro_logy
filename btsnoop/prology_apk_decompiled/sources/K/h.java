package K;

import B3.l;

/* loaded from: classes.dex */
public final class h extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public i f919o;

    /* renamed from: p, reason: collision with root package name */
    public Object f920p;

    /* renamed from: q, reason: collision with root package name */
    public l f921q;

    /* renamed from: r, reason: collision with root package name */
    public Object f922r;
    public /* synthetic */ Object s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f923t;

    /* renamed from: u, reason: collision with root package name */
    public int f924u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, d3.b bVar) {
        super(bVar);
        this.f923t = iVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.s = obj;
        this.f924u |= Integer.MIN_VALUE;
        return this.f923t.b(null, this);
    }
}
