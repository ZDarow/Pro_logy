package p129f2;

/* renamed from: f2.l0 */
/* loaded from: classes.dex */
public final class C1433l0 extends java.util.AbstractSet {

    /* renamed from: l */
    public final /* synthetic */ p129f2.AbstractC1397M f5790l;

    /* renamed from: m */
    public final /* synthetic */ p129f2.AbstractC1397M f5791m;

    public C1433l0(p129f2.AbstractC1397M abstractC1397M, p129f2.AbstractC1397M abstractC1397M2) {
        this.f5790l = abstractC1397M;
        this.f5791m = abstractC1397M2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f5790l.contains(obj) && this.f5791m.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.f5790l.containsAll(collection) && this.f5791m.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return java.util.Collections.disjoint(this.f5791m, this.f5790l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new p129f2.C1398N(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Iterator it = this.f5790l.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (this.f5791m.contains(it.next())) {
                i4++;
            }
        }
        return i4;
    }
}
