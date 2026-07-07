package p129f2;

/* renamed from: f2.m0 */
/* loaded from: classes.dex */
public class C1435m0 extends java.util.AbstractCollection implements java.util.Set {

    /* renamed from: l */
    public final java.util.Set f5792l;

    /* renamed from: m */
    public final p124e2.InterfaceC1359g f5793m;

    public C1435m0(java.util.Set set, p124e2.InterfaceC1359g interfaceC1359g) {
        this.f5792l = set;
        this.f5793m = interfaceC1359g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        if (this.f5793m.apply(obj)) {
            return this.f5792l.add(obj);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f5793m.apply(it.next())) {
                throw new java.lang.IllegalArgumentException();
            }
        }
        return this.f5792l.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        java.util.Set set = this.f5792l;
        boolean z4 = set instanceof java.util.RandomAccess;
        p124e2.InterfaceC1359g interfaceC1359g = this.f5793m;
        if (!z4 || !(set instanceof java.util.List)) {
            java.util.Iterator it = set.iterator();
            interfaceC1359g.getClass();
            while (it.hasNext()) {
                if (interfaceC1359g.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        java.util.List list = (java.util.List) set;
        interfaceC1359g.getClass();
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            java.lang.Object obj = list.get(i5);
            if (!interfaceC1359g.apply(obj)) {
                if (i5 > i4) {
                    try {
                        list.set(i4, obj);
                    } catch (java.lang.IllegalArgumentException unused) {
                        p129f2.AbstractC1444r.m3238r(list, interfaceC1359g, i4, i5);
                        return;
                    } catch (java.lang.UnsupportedOperationException unused2) {
                        p129f2.AbstractC1444r.m3238r(list, interfaceC1359g, i4, i5);
                        return;
                    }
                }
                i4++;
            }
        }
        list.subList(i4, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        boolean z4;
        java.util.Set set = this.f5792l;
        set.getClass();
        try {
            z4 = set.contains(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            z4 = false;
        }
        if (z4) {
            return this.f5793m.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        return p129f2.AbstractC1444r.m3229i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return p129f2.AbstractC1444r.m3233m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        java.util.Iterator it = this.f5792l.iterator();
        p124e2.InterfaceC1359g interfaceC1359g = this.f5793m;
        if (interfaceC1359g == null) {
            throw new java.lang.NullPointerException("predicate");
        }
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (interfaceC1359g.apply(it.next())) {
                break;
            }
            i4++;
        }
        return true ^ (i4 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.f5792l.iterator();
        it.getClass();
        p124e2.InterfaceC1359g interfaceC1359g = this.f5793m;
        interfaceC1359g.getClass();
        return new p129f2.C1398N(it, interfaceC1359g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        return contains(obj) && this.f5792l.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = this.f5792l.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (this.f5793m.apply(next) && collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        java.util.Iterator it = this.f5792l.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (this.f5793m.apply(next) && !collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Iterator it = this.f5792l.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (this.f5793m.apply(it.next())) {
                i4++;
            }
        }
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        java.util.Iterator it = iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            p129f2.C1398N c1398n = (p129f2.C1398N) it;
            if (c1398n.hasNext()) {
                arrayList.add(c1398n.next());
            } else {
                return arrayList.toArray();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        java.util.Iterator it = iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            p129f2.C1398N c1398n = (p129f2.C1398N) it;
            if (c1398n.hasNext()) {
                arrayList.add(c1398n.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
