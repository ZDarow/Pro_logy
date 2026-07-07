package p129f2;

/* renamed from: f2.l */
/* loaded from: classes.dex */
public class C1432l extends java.util.AbstractCollection implements java.util.List {

    /* renamed from: l */
    public final java.lang.Object f5784l;

    /* renamed from: m */
    public java.util.Collection f5785m;

    /* renamed from: n */
    public final p129f2.C1432l f5786n;

    /* renamed from: o */
    public final java.util.Collection f5787o;

    /* renamed from: p */
    public final /* synthetic */ p129f2.C1409Z f5788p;

    /* renamed from: q */
    public final /* synthetic */ p129f2.C1409Z f5789q;

    public C1432l(p129f2.C1409Z c1409z, java.lang.Object obj, java.util.List list, p129f2.C1432l c1432l) {
        this.f5789q = c1409z;
        this.f5788p = c1409z;
        this.f5784l = obj;
        this.f5785m = list;
        this.f5786n = c1432l;
        this.f5787o = c1432l == null ? null : c1432l.f5785m;
    }

    /* renamed from: a */
    public final void m3220a() {
        p129f2.C1432l c1432l = this.f5786n;
        if (c1432l != null) {
            c1432l.m3220a();
        } else {
            this.f5788p.f5730o.put(this.f5784l, this.f5785m);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        m3221b();
        boolean isEmpty = this.f5785m.isEmpty();
        boolean add = this.f5785m.add(obj);
        if (add) {
            this.f5788p.f5731p++;
            if (isEmpty) {
                m3220a();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f5785m.addAll(collection);
        if (addAll) {
            this.f5788p.f5731p += this.f5785m.size() - size;
            if (size == 0) {
                m3220a();
            }
        }
        return addAll;
    }

    /* renamed from: b */
    public final void m3221b() {
        java.util.Collection collection;
        p129f2.C1432l c1432l = this.f5786n;
        if (c1432l != null) {
            c1432l.m3221b();
            if (c1432l.f5785m != this.f5787o) {
                throw new java.util.ConcurrentModificationException();
            }
        } else {
            if (!this.f5785m.isEmpty() || (collection = (java.util.Collection) this.f5788p.f5730o.get(this.f5784l)) == null) {
                return;
            }
            this.f5785m = collection;
        }
    }

    /* renamed from: c */
    public final void m3222c() {
        p129f2.C1432l c1432l = this.f5786n;
        if (c1432l != null) {
            c1432l.m3222c();
        } else if (this.f5785m.isEmpty()) {
            this.f5788p.f5730o.remove(this.f5784l);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f5785m.clear();
        this.f5788p.f5731p -= size;
        m3222c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        m3221b();
        return this.f5785m.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(java.util.Collection collection) {
        m3221b();
        return this.f5785m.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        m3221b();
        return this.f5785m.equals(obj);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i4) {
        m3221b();
        return ((java.util.List) this.f5785m).get(i4);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        m3221b();
        return this.f5785m.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        m3221b();
        return ((java.util.List) this.f5785m).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        m3221b();
        return new p129f2.C1414c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        m3221b();
        return ((java.util.List) this.f5785m).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        m3221b();
        return new p129f2.C1430k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        m3221b();
        boolean remove = this.f5785m.remove(obj);
        if (remove) {
            p129f2.C1409Z c1409z = this.f5788p;
            c1409z.f5731p--;
            m3222c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f5785m.removeAll(collection);
        if (removeAll) {
            this.f5788p.f5731p += this.f5785m.size() - size;
            m3222c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f5785m.retainAll(collection);
        if (retainAll) {
            this.f5788p.f5731p += this.f5785m.size() - size;
            m3222c();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i4, java.lang.Object obj) {
        m3221b();
        return ((java.util.List) this.f5785m).set(i4, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        m3221b();
        return this.f5785m.size();
    }

    @Override // java.util.List
    public final java.util.List subList(int i4, int i5) {
        m3221b();
        java.util.List subList = ((java.util.List) this.f5785m).subList(i4, i5);
        p129f2.C1432l c1432l = this.f5786n;
        if (c1432l == null) {
            c1432l = this;
        }
        p129f2.C1409Z c1409z = this.f5789q;
        c1409z.getClass();
        boolean z4 = subList instanceof java.util.RandomAccess;
        java.lang.Object obj = this.f5784l;
        return z4 ? new p129f2.C1432l(c1409z, obj, subList, c1432l) : new p129f2.C1432l(c1409z, obj, subList, c1432l);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        m3221b();
        return this.f5785m.toString();
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i4) {
        m3221b();
        return new p129f2.C1430k(this, i4);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i4) {
        m3221b();
        java.lang.Object remove = ((java.util.List) this.f5785m).remove(i4);
        p129f2.C1409Z c1409z = this.f5789q;
        c1409z.f5731p--;
        m3222c();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i4, java.lang.Object obj) {
        m3221b();
        boolean isEmpty = this.f5785m.isEmpty();
        ((java.util.List) this.f5785m).add(i4, obj);
        this.f5789q.f5731p++;
        if (isEmpty) {
            m3220a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i4, java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((java.util.List) this.f5785m).addAll(i4, collection);
        if (addAll) {
            this.f5789q.f5731p += this.f5785m.size() - size;
            if (size == 0) {
                m3220a();
            }
        }
        return addAll;
    }
}
