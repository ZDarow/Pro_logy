package f2;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class m0 extends AbstractCollection implements Set {

    /* renamed from: l, reason: collision with root package name */
    public final Set f5597l;

    /* renamed from: m, reason: collision with root package name */
    public final e2.g f5598m;

    public m0(Set set, e2.g gVar) {
        this.f5597l = set;
        this.f5598m = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f5598m.apply(obj)) {
            return this.f5597l.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f5598m.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f5597l.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f5597l;
        boolean z4 = set instanceof RandomAccess;
        e2.g gVar = this.f5598m;
        if (!z4 || !(set instanceof List)) {
            Iterator it = set.iterator();
            gVar.getClass();
            while (it.hasNext()) {
                if (gVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        gVar.getClass();
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object obj = list.get(i5);
            if (!gVar.apply(obj)) {
                if (i5 > i4) {
                    try {
                        list.set(i4, obj);
                    } catch (IllegalArgumentException unused) {
                        r.r(list, gVar, i4, i5);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        r.r(list, gVar, i4, i5);
                        return;
                    }
                }
                i4++;
            }
        }
        list.subList(i4, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z4;
        Set set = this.f5597l;
        set.getClass();
        try {
            z4 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z4 = false;
        }
        if (z4) {
            return this.f5598m.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return r.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return r.m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f5597l.iterator();
        e2.g gVar = this.f5598m;
        if (gVar == null) {
            throw new NullPointerException("predicate");
        }
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (gVar.apply(it.next())) {
                break;
            }
            i4++;
        }
        return true ^ (i4 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f5597l.iterator();
        it.getClass();
        e2.g gVar = this.f5598m;
        gVar.getClass();
        return new N(it, gVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f5597l.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f5597l.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f5598m.apply(next) && collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f5597l.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f5598m.apply(next) && !collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f5597l.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (this.f5598m.apply(it.next())) {
                i4++;
            }
        }
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            N n4 = (N) it;
            if (n4.hasNext()) {
                arrayList.add(n4.next());
            } else {
                return arrayList.toArray();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            N n4 = (N) it;
            if (n4.hasNext()) {
                arrayList.add(n4.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
