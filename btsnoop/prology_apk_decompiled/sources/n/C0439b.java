package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439b implements Set {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0442e f7341l;

    public C0439b(C0442e c0442e) {
        this.f7341l = c0442e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f7341l.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7341l.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f7341l.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0442e c0442e = this.f7341l;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (c0442e.f7367n == set.size()) {
                    if (c0442e.i(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0442e c0442e = this.f7341l;
        int i4 = 0;
        for (int i5 = c0442e.f7367n - 1; i5 >= 0; i5--) {
            Object e4 = c0442e.e(i5);
            i4 += e4 == null ? 0 : e4.hashCode();
        }
        return i4;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f7341l.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0438a(this.f7341l, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0442e c0442e = this.f7341l;
        int c4 = c0442e.c(obj);
        if (c4 < 0) {
            return false;
        }
        c0442e.f(c4);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f7341l.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0442e c0442e = this.f7341l;
        int i4 = c0442e.f7367n;
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (!collection.contains(c0442e.e(i5))) {
                c0442e.f(i5);
            }
        }
        return i4 != c0442e.f7367n;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f7341l.f7367n;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0442e c0442e = this.f7341l;
        int i4 = c0442e.f7367n;
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = c0442e.e(i5);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0442e c0442e = this.f7341l;
        int i4 = c0442e.f7367n;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = c0442e.e(i5);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
