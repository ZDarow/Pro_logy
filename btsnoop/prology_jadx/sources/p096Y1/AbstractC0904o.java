package p096Y1;

/* renamed from: Y1.o */
/* loaded from: classes.dex */
public abstract class AbstractC0904o extends java.util.AbstractCollection implements java.io.Serializable {

    /* renamed from: l */
    public static final java.lang.Object[] f3225l = new java.lang.Object[0];

    /* renamed from: a */
    public abstract java.lang.Object[] mo1742a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract int mo1743b();

    /* renamed from: c */
    public abstract int mo1744c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: d */
    public abstract boolean mo1745d();

    /* renamed from: e */
    public abstract int mo1746e(java.lang.Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return java.util.Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(f3225l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            java.lang.Object[] mo1742a = mo1742a();
            if (mo1742a == null) {
                if (length != 0) {
                    objArr = java.util.Arrays.copyOf(objArr, 0);
                }
                objArr = java.util.Arrays.copyOf(objArr, size);
            } else {
                return java.util.Arrays.copyOfRange(mo1742a, mo1743b(), mo1744c(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        mo1746e(objArr);
        return objArr;
    }
}
