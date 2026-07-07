package p129f2;

/* renamed from: f2.n0 */
/* loaded from: classes.dex */
public final class C1437n0 extends p129f2.C1435m0 implements java.util.SortedSet {
    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return ((java.util.SortedSet) this.f5792l).comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        java.util.Iterator it = this.f5792l.iterator();
        it.getClass();
        p124e2.InterfaceC1359g interfaceC1359g = this.f5793m;
        interfaceC1359g.getClass();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (interfaceC1359g.apply(next)) {
                return next;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.m0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        return new p129f2.C1435m0(((java.util.SortedSet) this.f5792l).headSet(obj), this.f5793m);
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        java.util.SortedSet sortedSet = (java.util.SortedSet) this.f5792l;
        while (true) {
            java.lang.Object last = sortedSet.last();
            if (this.f5793m.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.m0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new p129f2.C1435m0(((java.util.SortedSet) this.f5792l).subSet(obj, obj2), this.f5793m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.m0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        return new p129f2.C1435m0(((java.util.SortedSet) this.f5792l).tailSet(obj), this.f5793m);
    }
}
