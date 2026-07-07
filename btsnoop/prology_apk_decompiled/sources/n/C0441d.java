package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441d implements Collection {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0442e f7346l;

    public C0441d(C0442e c0442e) {
        this.f7346l = c0442e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f7346l.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7346l.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
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
        return this.f7346l.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0438a(this.f7346l, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0442e c0442e = this.f7346l;
        int a4 = c0442e.a(obj);
        if (a4 < 0) {
            return false;
        }
        c0442e.f(a4);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0442e c0442e = this.f7346l;
        int i4 = c0442e.f7367n;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i4) {
            if (collection.contains(c0442e.h(i5))) {
                c0442e.f(i5);
                i5--;
                i4--;
                z4 = true;
            }
            i5++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0442e c0442e = this.f7346l;
        int i4 = c0442e.f7367n;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i4) {
            if (!collection.contains(c0442e.h(i5))) {
                c0442e.f(i5);
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
        return this.f7346l.f7367n;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0442e c0442e = this.f7346l;
        int i4 = c0442e.f7367n;
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = c0442e.h(i5);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0442e c0442e = this.f7346l;
        int i4 = c0442e.f7367n;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = c0442e.h(i5);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
