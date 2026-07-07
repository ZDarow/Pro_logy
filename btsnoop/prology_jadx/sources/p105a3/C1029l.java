package p105a3;

/* renamed from: a3.l */
/* loaded from: classes.dex */
public final class C1029l implements java.util.List, java.io.Serializable, java.util.RandomAccess {

    /* renamed from: l */
    public static final p105a3.C1029l f3755l = new java.lang.Object();

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i4, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i4, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return false;
        }
        p154k3.AbstractC1803h.m3779e((java.lang.Void) obj, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        p154k3.AbstractC1803h.m3779e(collection, "elements");
        return collection.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.List) && ((java.util.List) obj).isEmpty();
    }

    @Override // java.util.List
    public final java.lang.Object get(int i4) {
        throw new java.lang.IndexOutOfBoundsException("Empty list doesn't contain element at index " + i4 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return -1;
        }
        p154k3.AbstractC1803h.m3779e((java.lang.Void) obj, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return p105a3.C1028k.f3754l;
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return -1;
        }
        p154k3.AbstractC1803h.m3779e((java.lang.Void) obj, "element");
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return p105a3.C1028k.f3754l;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i4) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i4, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final java.util.List subList(int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            return this;
        }
        throw new java.lang.IndexOutOfBoundsException(p009B2.AbstractC0051h.m150i(i4, i5, "fromIndex: ", ", toIndex: "));
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return p154k3.AbstractC1803h.m3784j(this);
    }

    public final java.lang.String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i4) {
        if (i4 == 0) {
            return p105a3.C1028k.f3754l;
        }
        throw new java.lang.IndexOutOfBoundsException(p009B2.AbstractC0051h.m152k("Index: ", i4));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p154k3.AbstractC1803h.m3779e(objArr, "array");
        return p154k3.AbstractC1803h.m3785k(this, objArr);
    }
}
