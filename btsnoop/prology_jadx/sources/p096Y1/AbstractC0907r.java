package p096Y1;

/* renamed from: Y1.r */
/* loaded from: classes.dex */
public abstract class AbstractC0907r extends p096Y1.AbstractC0904o implements java.util.List, java.util.RandomAccess {

    /* renamed from: m */
    public static final p096Y1.C0905p f3232m = new p096Y1.C0905p(p096Y1.C0908s.f3233p, 0);

    @Override // java.util.List
    public final void add(int i4, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i4, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p096Y1.AbstractC0904o
    /* renamed from: e */
    public int mo1746e(java.lang.Object[] objArr) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i4] = get(i4);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        java.lang.Object next;
        java.lang.Object next2;
        int i4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (0; i4 < size; i4 + 1) {
                        java.lang.Object obj2 = get(i4);
                        java.lang.Object obj3 = list.get(i4);
                        i4 = (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) ? i4 + 1 : 0;
                    }
                    return true;
                }
                p096Y1.C0905p listIterator = listIterator(0);
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || ((next = listIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    /* renamed from: f */
    public p096Y1.AbstractC0907r subList(int i4, int i5) {
        p176p1.AbstractC1949a.m3927b0(i4, i5, size());
        int i6 = i5 - i4;
        return i6 == size() ? this : i6 == 0 ? p096Y1.C0908s.f3233p : new p096Y1.C0906q(this, i4, i6);
    }

    @Override // java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final p096Y1.C0905p listIterator(int i4) {
        int size = size();
        if (i4 < 0 || i4 > size) {
            throw new java.lang.IndexOutOfBoundsException(p176p1.AbstractC1949a.m3929c0(i4, size, "index"));
        }
        return isEmpty() ? f3232m : new p096Y1.C0905p(this, i4);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = (i4 * 31) + get(i5).hashCode();
        }
        return i4;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
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
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i4) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final java.lang.Object set(int i4, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
