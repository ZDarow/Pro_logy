package p129f2;

/* renamed from: f2.d */
/* loaded from: classes.dex */
public class C1416d extends java.util.AbstractMap {

    /* renamed from: l */
    public transient p129f2.C1412b f5747l;

    /* renamed from: m */
    public transient p129f2.C1436n f5748m;

    /* renamed from: n */
    public final transient java.util.Map f5749n;

    /* renamed from: o */
    public final /* synthetic */ p129f2.C1409Z f5750o;

    public C1416d(p129f2.C1409Z c1409z, java.util.Map map) {
        this.f5750o = c1409z;
        this.f5749n = map;
    }

    /* renamed from: a */
    public final p129f2.C1389E m3206a(java.util.Map.Entry entry) {
        java.lang.Object key = entry.getKey();
        java.util.Collection collection = (java.util.Collection) entry.getValue();
        p129f2.C1409Z c1409z = this.f5750o;
        c1409z.getClass();
        java.util.List list = (java.util.List) collection;
        return new p129f2.C1389E(key, list instanceof java.util.RandomAccess ? new p129f2.C1432l(c1409z, key, list, null) : new p129f2.C1432l(c1409z, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        p129f2.C1409Z c1409z = this.f5750o;
        if (this.f5749n == c1409z.f5730o) {
            c1409z.m3202c();
            return;
        }
        p129f2.C1414c c1414c = new p129f2.C1414c(this);
        while (c1414c.hasNext()) {
            c1414c.next();
            c1414c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map map = this.f5749n;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        p129f2.C1412b c1412b = this.f5747l;
        if (c1412b != null) {
            return c1412b;
        }
        p129f2.C1412b c1412b2 = new p129f2.C1412b(this);
        this.f5747l = c1412b2;
        return c1412b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.f5749n.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.Map map = this.f5749n;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            obj2 = null;
        }
        java.util.Collection collection = (java.util.Collection) obj2;
        if (collection == null) {
            return null;
        }
        p129f2.C1409Z c1409z = this.f5750o;
        c1409z.getClass();
        java.util.List list = (java.util.List) collection;
        return list instanceof java.util.RandomAccess ? new p129f2.C1432l(c1409z, obj, list, null) : new p129f2.C1432l(c1409z, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f5749n.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        p129f2.C1409Z c1409z = this.f5750o;
        java.util.Set set = c1409z.f5796l;
        if (set == null) {
            java.util.Map map = c1409z.f5730o;
            set = map instanceof java.util.NavigableMap ? new p129f2.C1422g(c1409z, (java.util.NavigableMap) map) : map instanceof java.util.SortedMap ? new p129f2.C1428j(c1409z, (java.util.SortedMap) map) : new p129f2.C1418e(c1409z, map);
            c1409z.f5796l = set;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.f5749n.remove(obj);
        if (collection == null) {
            return null;
        }
        p129f2.C1409Z c1409z = this.f5750o;
        java.util.Collection m3203d = c1409z.m3203d();
        m3203d.addAll(collection);
        c1409z.f5731p -= collection.size();
        collection.clear();
        return m3203d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5749n.size();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        return this.f5749n.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        p129f2.C1436n c1436n = this.f5748m;
        if (c1436n != null) {
            return c1436n;
        }
        p129f2.C1436n c1436n2 = new p129f2.C1436n(this);
        this.f5748m = c1436n2;
        return c1436n2;
    }
}
