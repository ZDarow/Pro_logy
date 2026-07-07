package p165n;

/* renamed from: n.b */
/* loaded from: classes.dex */
public final class C1875b implements java.util.Set {

    /* renamed from: l */
    public final /* synthetic */ p165n.C1878e f7620l;

    public C1875b(p165n.C1878e c1878e) {
        this.f7620l = c1878e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f7620l.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f7620l.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.f7620l.m3856i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        p165n.C1878e c1878e = this.f7620l;
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (c1878e.f7646n == set.size()) {
                    if (c1878e.m3856i(set)) {
                        return true;
                    }
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        p165n.C1878e c1878e = this.f7620l;
        int i4 = 0;
        for (int i5 = c1878e.f7646n - 1; i5 >= 0; i5--) {
            java.lang.Object m3868e = c1878e.m3868e(i5);
            i4 += m3868e == null ? 0 : m3868e.hashCode();
        }
        return i4;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f7620l.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new p165n.C1874a(this.f7620l, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        p165n.C1878e c1878e = this.f7620l;
        int m3866c = c1878e.m3866c(obj);
        if (m3866c < 0) {
            return false;
        }
        c1878e.m3869f(m3866c);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return this.f7620l.m3857j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        p165n.C1878e c1878e = this.f7620l;
        int i4 = c1878e.f7646n;
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (!collection.contains(c1878e.m3868e(i5))) {
                c1878e.m3869f(i5);
            }
        }
        return i4 != c1878e.f7646n;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f7620l.f7646n;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        p165n.C1878e c1878e = this.f7620l;
        int i4 = c1878e.f7646n;
        java.lang.Object[] objArr = new java.lang.Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = c1878e.m3868e(i5);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p165n.C1878e c1878e = this.f7620l;
        int i4 = c1878e.f7646n;
        if (objArr.length < i4) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = c1878e.m3868e(i5);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
