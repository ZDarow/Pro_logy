package p129f2;

/* renamed from: f2.f */
/* loaded from: classes.dex */
public final class C1420f extends p129f2.C1426i implements java.util.NavigableMap {

    /* renamed from: r */
    public final /* synthetic */ p129f2.C1409Z f5757r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420f(p129f2.C1409Z c1409z, java.util.NavigableMap navigableMap) {
        super(c1409z, navigableMap);
        this.f5757r = c1409z;
    }

    @Override // p129f2.C1426i
    /* renamed from: b */
    public final java.util.SortedSet mo3207b() {
        return new p129f2.C1422g(this.f5757r, mo3209d());
    }

    @Override // p129f2.C1426i
    /* renamed from: c */
    public final java.util.SortedSet keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry ceilingEntry(java.lang.Object obj) {
        java.util.Map.Entry ceilingEntry = mo3209d().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return m3206a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object ceilingKey(java.lang.Object obj) {
        return mo3209d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet descendingKeySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap descendingMap() {
        return new p129f2.C1420f(this.f5757r, mo3209d().descendingMap());
    }

    /* renamed from: e */
    public final p129f2.C1389E m3210e(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        java.util.Collection m3203d = this.f5757r.m3203d();
        m3203d.addAll((java.util.Collection) entry.getValue());
        it.remove();
        return new p129f2.C1389E(entry.getKey(), java.util.Collections.unmodifiableList((java.util.List) m3203d));
    }

    @Override // p129f2.C1426i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap mo3209d() {
        return (java.util.NavigableMap) ((java.util.SortedMap) this.f5749n);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry firstEntry() {
        java.util.Map.Entry firstEntry = mo3209d().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return m3206a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry floorEntry(java.lang.Object obj) {
        java.util.Map.Entry floorEntry = mo3209d().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return m3206a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object floorKey(java.lang.Object obj) {
        return mo3209d().floorKey(obj);
    }

    @Override // p129f2.C1426i, java.util.SortedMap, java.util.NavigableMap
    public final java.util.SortedMap headMap(java.lang.Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry higherEntry(java.lang.Object obj) {
        java.util.Map.Entry higherEntry = mo3209d().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return m3206a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object higherKey(java.lang.Object obj) {
        return mo3209d().higherKey(obj);
    }

    @Override // p129f2.C1426i, p129f2.C1416d, java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lastEntry() {
        java.util.Map.Entry lastEntry = mo3209d().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return m3206a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lowerEntry(java.lang.Object obj) {
        java.util.Map.Entry lowerEntry = mo3209d().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return m3206a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object lowerKey(java.lang.Object obj) {
        return mo3209d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet navigableKeySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollFirstEntry() {
        return m3210e(((p129f2.C1412b) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollLastEntry() {
        return m3210e(((p129f2.C1412b) ((p129f2.C1416d) descendingMap()).entrySet()).iterator());
    }

    @Override // p129f2.C1426i, java.util.SortedMap, java.util.NavigableMap
    public final java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // p129f2.C1426i, java.util.SortedMap, java.util.NavigableMap
    public final java.util.SortedMap tailMap(java.lang.Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap headMap(java.lang.Object obj, boolean z4) {
        return new p129f2.C1420f(this.f5757r, mo3209d().headMap(obj, z4));
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap subMap(java.lang.Object obj, boolean z4, java.lang.Object obj2, boolean z5) {
        return new p129f2.C1420f(this.f5757r, mo3209d().subMap(obj, z4, obj2, z5));
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap tailMap(java.lang.Object obj, boolean z4) {
        return new p129f2.C1420f(this.f5757r, mo3209d().tailMap(obj, z4));
    }
}
