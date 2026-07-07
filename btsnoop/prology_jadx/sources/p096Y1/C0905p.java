package p096Y1;

/* renamed from: Y1.p */
/* loaded from: classes.dex */
public final class C0905p implements java.util.ListIterator, java.util.Iterator {

    /* renamed from: l */
    public final int f3226l;

    /* renamed from: m */
    public int f3227m;

    /* renamed from: n */
    public final p096Y1.AbstractC0907r f3228n;

    public C0905p(p096Y1.AbstractC0907r abstractC0907r, int i4) {
        int size = abstractC0907r.size();
        if (i4 < 0 || i4 > size) {
            throw new java.lang.IndexOutOfBoundsException(p176p1.AbstractC1949a.m3929c0(i4, size, "index"));
        }
        this.f3226l = size;
        this.f3227m = i4;
        this.f3228n = abstractC0907r;
    }

    /* renamed from: a */
    public final java.lang.Object m1747a(int i4) {
        return this.f3228n.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3227m < this.f3226l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3227m > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i4 = this.f3227m;
        this.f3227m = i4 + 1;
        return m1747a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3227m;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i4 = this.f3227m - 1;
        this.f3227m = i4;
        return m1747a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3227m - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
