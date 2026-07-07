package p129f2;

/* renamed from: f2.Z */
/* loaded from: classes.dex */
public final class C1409Z extends p129f2.AbstractC1438o implements java.io.Serializable {

    /* renamed from: o */
    public final transient java.util.Map f5730o;

    /* renamed from: p */
    public transient int f5731p;

    /* renamed from: q */
    public transient p129f2.C1407X f5732q;

    public C1409Z(java.util.Map map) {
        if (!map.isEmpty()) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f5730o = map;
    }

    @Override // p129f2.AbstractC1438o
    /* renamed from: a */
    public final java.util.Map mo3142a() {
        java.util.Map map = this.f5798n;
        if (map == null) {
            java.util.Map map2 = this.f5730o;
            map = map2 instanceof java.util.NavigableMap ? new p129f2.C1420f(this, (java.util.NavigableMap) map2) : map2 instanceof java.util.SortedMap ? new p129f2.C1426i(this, (java.util.SortedMap) map2) : new p129f2.C1416d(this, map2);
            this.f5798n = map;
        }
        return map;
    }

    /* renamed from: c */
    public final void m3202c() {
        java.util.Map map = this.f5730o;
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((java.util.Collection) it.next()).clear();
        }
        map.clear();
        this.f5731p = 0;
    }

    /* renamed from: d */
    public final java.util.Collection m3203d() {
        return (java.util.List) this.f5732q.get();
    }
}
