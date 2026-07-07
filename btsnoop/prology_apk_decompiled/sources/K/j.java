package K;

import B3.n;

/* loaded from: classes.dex */
public final class j extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public B3.h f931o;

    /* renamed from: p, reason: collision with root package name */
    public B3.h f932p;

    /* renamed from: q, reason: collision with root package name */
    public n f933q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f934r;
    public final /* synthetic */ k s;

    /* renamed from: t, reason: collision with root package name */
    public int f935t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, d3.b bVar) {
        super(bVar);
        this.s = kVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f934r = obj;
        this.f935t |= Integer.MIN_VALUE;
        return this.s.b(null, this);
    }
}
