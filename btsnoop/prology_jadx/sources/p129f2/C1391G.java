package p129f2;

/* renamed from: f2.G */
/* loaded from: classes.dex */
public final class C1391G extends p129f2.AbstractC1445r0 implements java.util.ListIterator {

    /* renamed from: l */
    public final int f5698l;

    /* renamed from: m */
    public int f5699m;

    /* renamed from: n */
    public final p129f2.AbstractC1393I f5700n;

    public C1391G(p129f2.AbstractC1393I abstractC1393I, int i4) {
        int size = abstractC1393I.size();
        p176p1.AbstractC1949a.m3936m(i4, size);
        this.f5698l = size;
        this.f5699m = i4;
        this.f5700n = abstractC1393I;
    }

    /* renamed from: a */
    public final java.lang.Object m3158a(int i4) {
        return this.f5700n.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5699m < this.f5698l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5699m > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i4 = this.f5699m;
        this.f5699m = i4 + 1;
        return m3158a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5699m;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i4 = this.f5699m - 1;
        this.f5699m = i4;
        return m3158a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5699m - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
