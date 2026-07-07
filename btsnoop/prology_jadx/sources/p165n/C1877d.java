package p165n;

/* renamed from: n.d */
/* loaded from: classes.dex */
public final class C1877d implements java.util.Collection {

    /* renamed from: l */
    public final /* synthetic */ p165n.C1878e f7625l;

    public C1877d(p165n.C1878e c1878e) {
        this.f7625l = c1878e;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f7625l.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f7625l.m3864a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
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
        return this.f7625l.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new p165n.C1874a(this.f7625l, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        p165n.C1878e c1878e = this.f7625l;
        int m3864a = c1878e.m3864a(obj);
        if (m3864a < 0) {
            return false;
        }
        c1878e.m3869f(m3864a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        p165n.C1878e c1878e = this.f7625l;
        int i4 = c1878e.f7646n;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i4) {
            if (collection.contains(c1878e.m3871h(i5))) {
                c1878e.m3869f(i5);
                i5--;
                i4--;
                z4 = true;
            }
            i5++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        p165n.C1878e c1878e = this.f7625l;
        int i4 = c1878e.f7646n;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i4) {
            if (!collection.contains(c1878e.m3871h(i5))) {
                c1878e.m3869f(i5);
                i5--;
                i4--;
                z4 = true;
            }
            i5++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f7625l.f7646n;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        p165n.C1878e c1878e = this.f7625l;
        int i4 = c1878e.f7646n;
        java.lang.Object[] objArr = new java.lang.Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = c1878e.m3871h(i5);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p165n.C1878e c1878e = this.f7625l;
        int i4 = c1878e.f7646n;
        if (objArr.length < i4) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = c1878e.m3871h(i5);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
