package p105a3;

/* renamed from: a3.a */
/* loaded from: classes.dex */
public final class C1018a implements java.util.Collection {

    /* renamed from: l */
    public final java.lang.Object[] f3748l;

    /* renamed from: m */
    public final boolean f3749m;

    public C1018a(java.lang.Object[] objArr, boolean z4) {
        this.f3748l = objArr;
        this.f3749m = z4;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        int i4;
        java.lang.Object[] objArr = this.f3748l;
        p154k3.AbstractC1803h.m3779e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i4 = 0;
            while (i4 < length) {
                if (objArr[i4] == null) {
                    break;
                }
                i4++;
            }
            i4 = -1;
        } else {
            int length2 = objArr.length;
            for (int i5 = 0; i5 < length2; i5++) {
                if (obj.equals(objArr[i5])) {
                    i4 = i5;
                    break;
                }
            }
            i4 = -1;
        }
        return i4 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        p154k3.AbstractC1803h.m3779e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3748l.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return p154k3.AbstractC1814s.m3791c(this.f3748l);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3748l.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.f3748l;
        p154k3.AbstractC1803h.m3779e(objArr, "<this>");
        if (this.f3749m && objArr.getClass().equals(java.lang.Object[].class)) {
            return objArr;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length, java.lang.Object[].class);
        p154k3.AbstractC1803h.m3778d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p154k3.AbstractC1803h.m3779e(objArr, "array");
        return p154k3.AbstractC1803h.m3785k(this, objArr);
    }
}
