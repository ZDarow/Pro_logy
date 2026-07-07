package a3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import k3.s;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148a implements Collection {

    /* renamed from: l, reason: collision with root package name */
    public final Object[] f3624l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3625m;

    public C0148a(Object[] objArr, boolean z4) {
        this.f3624l = objArr;
        this.f3625m = z4;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i4;
        Object[] objArr = this.f3624l;
        k3.h.e(objArr, "<this>");
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
    public final boolean containsAll(Collection collection) {
        k3.h.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3624l.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return s.c(this.f3624l);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3624l.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f3624l;
        k3.h.e(objArr, "<this>");
        if (this.f3625m && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        k3.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        k3.h.e(objArr, "array");
        return k3.h.k(this, objArr);
    }
}
