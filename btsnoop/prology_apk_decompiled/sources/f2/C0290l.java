package f2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: f2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0290l extends AbstractCollection implements List {

    /* renamed from: l, reason: collision with root package name */
    public final Object f5589l;

    /* renamed from: m, reason: collision with root package name */
    public Collection f5590m;

    /* renamed from: n, reason: collision with root package name */
    public final C0290l f5591n;

    /* renamed from: o, reason: collision with root package name */
    public final Collection f5592o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f5593p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z f5594q;

    public C0290l(Z z4, Object obj, List list, C0290l c0290l) {
        this.f5594q = z4;
        this.f5593p = z4;
        this.f5589l = obj;
        this.f5590m = list;
        this.f5591n = c0290l;
        this.f5592o = c0290l == null ? null : c0290l.f5590m;
    }

    public final void a() {
        C0290l c0290l = this.f5591n;
        if (c0290l != null) {
            c0290l.a();
        } else {
            this.f5593p.f5536o.put(this.f5589l, this.f5590m);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.f5590m.isEmpty();
        boolean add = this.f5590m.add(obj);
        if (add) {
            this.f5593p.f5537p++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f5590m.addAll(collection);
        if (addAll) {
            this.f5593p.f5537p += this.f5590m.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final void b() {
        Collection collection;
        C0290l c0290l = this.f5591n;
        if (c0290l != null) {
            c0290l.b();
            if (c0290l.f5590m != this.f5592o) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f5590m.isEmpty() || (collection = (Collection) this.f5593p.f5536o.get(this.f5589l)) == null) {
                return;
            }
            this.f5590m = collection;
        }
    }

    public final void c() {
        C0290l c0290l = this.f5591n;
        if (c0290l != null) {
            c0290l.c();
        } else if (this.f5590m.isEmpty()) {
            this.f5593p.f5536o.remove(this.f5589l);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f5590m.clear();
        this.f5593p.f5537p -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.f5590m.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.f5590m.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f5590m.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        b();
        return ((List) this.f5590m).get(i4);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.f5590m.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f5590m).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new C0281c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f5590m).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new C0289k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.f5590m.remove(obj);
        if (remove) {
            Z z4 = this.f5593p;
            z4.f5537p--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f5590m.removeAll(collection);
        if (removeAll) {
            this.f5593p.f5537p += this.f5590m.size() - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f5590m.retainAll(collection);
        if (retainAll) {
            this.f5593p.f5537p += this.f5590m.size() - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        b();
        return ((List) this.f5590m).set(i4, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.f5590m.size();
    }

    @Override // java.util.List
    public final List subList(int i4, int i5) {
        b();
        List subList = ((List) this.f5590m).subList(i4, i5);
        C0290l c0290l = this.f5591n;
        if (c0290l == null) {
            c0290l = this;
        }
        Z z4 = this.f5594q;
        z4.getClass();
        boolean z5 = subList instanceof RandomAccess;
        Object obj = this.f5589l;
        return z5 ? new C0290l(z4, obj, subList, c0290l) : new C0290l(z4, obj, subList, c0290l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f5590m.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        b();
        return new C0289k(this, i4);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        b();
        Object remove = ((List) this.f5590m).remove(i4);
        Z z4 = this.f5594q;
        z4.f5537p--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        b();
        boolean isEmpty = this.f5590m.isEmpty();
        ((List) this.f5590m).add(i4, obj);
        this.f5594q.f5537p++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f5590m).addAll(i4, collection);
        if (addAll) {
            this.f5594q.f5537p += this.f5590m.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }
}
