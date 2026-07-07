package p129f2;

/* renamed from: f2.I */
/* loaded from: classes.dex */
public abstract class AbstractC1393I extends p129f2.AbstractC1388D implements java.util.List, java.util.RandomAccess {

    /* renamed from: m */
    public static final p129f2.C1391G f5704m = new p129f2.C1391G(p129f2.C1415c0.f5744p, 0);

    /* renamed from: h */
    public static p129f2.C1415c0 m3160h(int i4, java.lang.Object[] objArr) {
        return i4 == 0 ? p129f2.C1415c0.f5744p : new p129f2.C1415c0(i4, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.F, f2.C] */
    /* renamed from: i */
    public static p129f2.C1390F m3161i() {
        return new p129f2.AbstractC1387C(4);
    }

    /* renamed from: j */
    public static p129f2.AbstractC1393I m3162j(java.util.Collection collection) {
        if (!(collection instanceof p129f2.AbstractC1388D)) {
            java.lang.Object[] array = collection.toArray();
            p129f2.AbstractC1444r.m3224c(array.length, array);
            return m3160h(array.length, array);
        }
        p129f2.AbstractC1393I mo3150a = ((p129f2.AbstractC1388D) collection).mo3150a();
        if (!mo3150a.mo3155f()) {
            return mo3150a;
        }
        java.lang.Object[] array2 = mo3150a.toArray(p129f2.AbstractC1388D.f5695l);
        return m3160h(array2.length, array2);
    }

    /* renamed from: k */
    public static p129f2.C1415c0 m3163k(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return p129f2.C1415c0.f5744p;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        p129f2.AbstractC1444r.m3224c(objArr2.length, objArr2);
        return m3160h(objArr2.length, objArr2);
    }

    /* renamed from: m */
    public static p129f2.C1415c0 m3164m() {
        return p129f2.C1415c0.f5744p;
    }

    /* renamed from: n */
    public static p129f2.C1415c0 m3165n(java.lang.Long l4, java.lang.Long l5, java.lang.Long l6, java.lang.Long l7, java.lang.Long l8) {
        java.lang.Object[] objArr = {l4, l5, l6, l7, l8};
        p129f2.AbstractC1444r.m3224c(5, objArr);
        return m3160h(5, objArr);
    }

    /* renamed from: o */
    public static p129f2.C1415c0 m3166o(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        p129f2.AbstractC1444r.m3224c(1, objArr);
        return m3160h(1, objArr);
    }

    /* renamed from: p */
    public static p129f2.C1415c0 m3167p(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj, obj2};
        p129f2.AbstractC1444r.m3224c(2, objArr);
        return m3160h(2, objArr);
    }

    /* renamed from: q */
    public static p129f2.C1415c0 m3168q(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object[] objArr = {obj, obj2, obj3};
        p129f2.AbstractC1444r.m3224c(3, objArr);
        return m3160h(3, objArr);
    }

    /* renamed from: r */
    public static p129f2.C1415c0 m3169r(p129f2.AbstractC1413b0 abstractC1413b0, java.util.Collection collection) {
        abstractC1413b0.getClass();
        if (collection == null) {
            java.util.Iterator it = collection.iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection = arrayList;
        }
        java.lang.Object[] array = collection.toArray();
        p129f2.AbstractC1444r.m3224c(array.length, array);
        java.util.Arrays.sort(array, abstractC1413b0);
        return m3160h(array.length, array);
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: a */
    public final p129f2.AbstractC1393I mo3150a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i4, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i4, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: b */
    public int mo3151b(int i4, java.lang.Object[] objArr) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i4 + i5] = get(i5);
        }
        return i4 + size;
    }

    @Override // p129f2.AbstractC1388D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i4 = 0; i4 < size; i4++) {
                        if (p101a.AbstractC0936a.m1814v(get(i4), list.get(i4))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && p101a.AbstractC0936a.m1814v(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // p129f2.AbstractC1388D
    /* renamed from: g */
    public final p129f2.AbstractC1445r0 iterator() {
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

    @Override // p129f2.AbstractC1388D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final p129f2.C1391G listIterator(int i4) {
        p176p1.AbstractC1949a.m3936m(i4, size());
        return isEmpty() ? f5704m : new p129f2.C1391G(this, i4);
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
    public final java.lang.Object remove(int i4) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public p129f2.AbstractC1393I subList(int i4, int i5) {
        p176p1.AbstractC1949a.m3937n(i4, i5, size());
        int i6 = i5 - i4;
        return i6 == size() ? this : i6 == 0 ? p129f2.C1415c0.f5744p : new p129f2.C1392H(this, i4, i6);
    }

    @Override // java.util.List
    public final java.lang.Object set(int i4, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }
}
