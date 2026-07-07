package p035I;

/* renamed from: I.g */
/* loaded from: classes.dex */
public final class C0285g extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public java.util.Iterator f845p;

    /* renamed from: q */
    public java.lang.Object f846q;

    /* renamed from: r */
    public int f847r;

    /* renamed from: s */
    public /* synthetic */ java.lang.Object f848s;

    /* renamed from: t */
    public final /* synthetic */ java.util.List f849t;

    /* renamed from: u */
    public final /* synthetic */ java.util.ArrayList f850u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285g(java.util.List list, java.util.ArrayList arrayList, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f849t = list;
        this.f850u = arrayList;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p035I.C0285g c0285g = new p035I.C0285g(this.f849t, this.f850u, interfaceC1190d);
        c0285g.f848s = obj;
        return c0285g;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p035I.C0285g) mo659g((p110b3.InterfaceC1190d) obj2, obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        java.util.Iterator it;
        java.util.List list;
        int i4 = this.f847r;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            obj = this.f848s;
            it = this.f849t.iterator();
            list = this.f850u;
        } else if (i4 == 1) {
            java.lang.Object obj2 = this.f846q;
            java.util.Iterator it2 = this.f845p;
            java.util.List list2 = (java.util.List) this.f848s;
            p176p1.AbstractC1949a.m3913P(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
                list2.add(new p120d3.AbstractC1297g(1, null));
                this.f848s = list2;
                this.f845p = it2;
                this.f846q = null;
                this.f847r = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i4 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f845p;
            list = (java.util.List) this.f848s;
            p176p1.AbstractC1949a.m3913P(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new java.lang.ClassCastException();
        }
        this.f848s = list;
        this.f845p = it;
        this.f846q = obj;
        this.f847r = 1;
        throw null;
    }
}
