package Y1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class p implements ListIterator, Iterator {

    /* renamed from: l, reason: collision with root package name */
    public final int f3115l;

    /* renamed from: m, reason: collision with root package name */
    public int f3116m;

    /* renamed from: n, reason: collision with root package name */
    public final r f3117n;

    public p(r rVar, int i4) {
        int size = rVar.size();
        if (i4 < 0 || i4 > size) {
            throw new IndexOutOfBoundsException(AbstractC0462a.c0(i4, size, "index"));
        }
        this.f3115l = size;
        this.f3116m = i4;
        this.f3117n = rVar;
    }

    public final Object a(int i4) {
        return this.f3117n.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3116m < this.f3115l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3116m > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f3116m;
        this.f3116m = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3116m;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f3116m - 1;
        this.f3116m = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3116m - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
