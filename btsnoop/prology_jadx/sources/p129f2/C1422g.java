package p129f2;

/* renamed from: f2.g */
/* loaded from: classes.dex */
public final class C1422g extends p129f2.C1428j implements java.util.NavigableSet {

    /* renamed from: o */
    public final /* synthetic */ p129f2.C1409Z f5760o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422g(p129f2.C1409Z c1409z, java.util.NavigableMap navigableMap) {
        super(c1409z, navigableMap);
        this.f5760o = c1409z;
    }

    @Override // p129f2.C1428j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap mo3212a() {
        return (java.util.NavigableMap) ((java.util.SortedMap) this.f5752l);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object ceiling(java.lang.Object obj) {
        return mo3212a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.util.Iterator descendingIterator() {
        return ((p129f2.C1418e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet descendingSet() {
        return new p129f2.C1422g(this.f5760o, mo3212a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object floor(java.lang.Object obj) {
        return mo3212a().floorKey(obj);
    }

    @Override // p129f2.C1428j, java.util.SortedSet, java.util.NavigableSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object higher(java.lang.Object obj) {
        return mo3212a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object lower(java.lang.Object obj) {
        return mo3212a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollFirst() {
        p129f2.C1414c c1414c = (p129f2.C1414c) iterator();
        if (!c1414c.hasNext()) {
            return null;
        }
        java.lang.Object next = c1414c.next();
        c1414c.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollLast() {
        java.util.Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        java.lang.Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // p129f2.C1428j, java.util.SortedSet, java.util.NavigableSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // p129f2.C1428j, java.util.SortedSet, java.util.NavigableSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet headSet(java.lang.Object obj, boolean z4) {
        return new p129f2.C1422g(this.f5760o, mo3212a().headMap(obj, z4));
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet subSet(java.lang.Object obj, boolean z4, java.lang.Object obj2, boolean z5) {
        return new p129f2.C1422g(this.f5760o, mo3212a().subMap(obj, z4, obj2, z5));
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet tailSet(java.lang.Object obj, boolean z4) {
        return new p129f2.C1422g(this.f5760o, mo3212a().tailMap(obj, z4));
    }
}
