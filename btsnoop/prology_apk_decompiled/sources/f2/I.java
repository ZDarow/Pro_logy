package f2;

import a.AbstractC0110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public abstract class I extends AbstractC0276D implements List, RandomAccess {

    /* renamed from: m, reason: collision with root package name */
    public static final G f5510m = new G(c0.f5550p, 0);

    public static c0 h(int i4, Object[] objArr) {
        return i4 == 0 ? c0.f5550p : new c0(i4, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.F, f2.C] */
    public static C0278F i() {
        return new AbstractC0275C(4);
    }

    public static I j(Collection collection) {
        if (!(collection instanceof AbstractC0276D)) {
            Object[] array = collection.toArray();
            r.c(array.length, array);
            return h(array.length, array);
        }
        I a4 = ((AbstractC0276D) collection).a();
        if (!a4.f()) {
            return a4;
        }
        Object[] array2 = a4.toArray(AbstractC0276D.f5501l);
        return h(array2.length, array2);
    }

    public static c0 k(Object[] objArr) {
        if (objArr.length == 0) {
            return c0.f5550p;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        r.c(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static c0 m() {
        return c0.f5550p;
    }

    public static c0 n(Long l4, Long l5, Long l6, Long l7, Long l8) {
        Object[] objArr = {l4, l5, l6, l7, l8};
        r.c(5, objArr);
        return h(5, objArr);
    }

    public static c0 o(Object obj) {
        Object[] objArr = {obj};
        r.c(1, objArr);
        return h(1, objArr);
    }

    public static c0 p(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        r.c(2, objArr);
        return h(2, objArr);
    }

    public static c0 q(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        r.c(3, objArr);
        return h(3, objArr);
    }

    public static c0 r(b0 b0Var, Collection collection) {
        b0Var.getClass();
        if (collection == null) {
            Iterator it = collection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        r.c(array.length, array);
        Arrays.sort(array, b0Var);
        return h(array.length, array);
    }

    @Override // f2.AbstractC0276D
    public final I a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // f2.AbstractC0276D
    public int b(int i4, Object[] objArr) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i4 + i5] = get(i5);
        }
        return i4 + size;
    }

    @Override // f2.AbstractC0276D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i4 = 0; i4 < size; i4++) {
                        if (AbstractC0110a.v(get(i4), list.get(i4))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && AbstractC0110a.v(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // f2.AbstractC0276D
    /* renamed from: g */
    public final r0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = ~(~(get(i5).hashCode() + (i4 * 31)));
        }
        return i4;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (obj.equals(get(i4))) {
                return i4;
            }
        }
        return -1;
    }

    @Override // f2.AbstractC0276D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final G listIterator(int i4) {
        AbstractC0462a.m(i4, size());
        return isEmpty() ? f5510m : new G(this, i4);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public I subList(int i4, int i5) {
        AbstractC0462a.n(i4, i5, size());
        int i6 = i5 - i4;
        return i6 == size() ? this : i6 == 0 ? c0.f5550p : new H(this, i4, i6);
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
