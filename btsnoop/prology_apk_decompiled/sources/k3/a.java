package k3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public final Object[] f7085l;

    /* renamed from: m, reason: collision with root package name */
    public int f7086m;

    public a(Object[] objArr) {
        h.e(objArr, "array");
        this.f7085l = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7086m < this.f7085l.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f7085l;
            int i4 = this.f7086m;
            this.f7086m = i4 + 1;
            return objArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f7086m--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
