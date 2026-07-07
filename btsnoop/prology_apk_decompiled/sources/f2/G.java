package f2;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class G extends r0 implements ListIterator {

    /* renamed from: l, reason: collision with root package name */
    public final int f5504l;

    /* renamed from: m, reason: collision with root package name */
    public int f5505m;

    /* renamed from: n, reason: collision with root package name */
    public final I f5506n;

    public G(I i4, int i5) {
        int size = i4.size();
        AbstractC0462a.m(i5, size);
        this.f5504l = size;
        this.f5505m = i5;
        this.f5506n = i4;
    }

    public final Object a(int i4) {
        return this.f5506n.get(i4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5505m < this.f5504l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5505m > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f5505m;
        this.f5505m = i4 + 1;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5505m;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f5505m - 1;
        this.f5505m = i4;
        return a(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5505m - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
