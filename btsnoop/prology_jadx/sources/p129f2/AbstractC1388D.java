package p129f2;

/* renamed from: f2.D */
/* loaded from: classes.dex */
public abstract class AbstractC1388D extends java.util.AbstractCollection implements java.io.Serializable {

    /* renamed from: l */
    public static final java.lang.Object[] f5695l = new java.lang.Object[0];

    /* renamed from: a */
    public abstract p129f2.AbstractC1393I mo3150a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract int mo3151b(int i4, java.lang.Object[] objArr);

    /* renamed from: c */
    public java.lang.Object[] mo3152c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(java.lang.Object obj);

    /* renamed from: d */
    public int mo3153d() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: e */
    public int mo3154e() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: f */
    public abstract boolean mo3155f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract p129f2.AbstractC1445r0 iterator();

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

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(f5695l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            java.lang.Object[] mo3152c = mo3152c();
            if (mo3152c != null) {
                return java.util.Arrays.copyOfRange(mo3152c, mo3154e(), mo3153d(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = java.util.Arrays.copyOf(objArr, 0);
            }
            objArr = java.util.Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo3151b(0, objArr);
        return objArr;
    }
}
