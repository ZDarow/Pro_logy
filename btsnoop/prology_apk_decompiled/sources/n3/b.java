package n3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public final int f7529l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7530m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7531n;

    /* renamed from: o, reason: collision with root package name */
    public int f7532o;

    public b(int i4, int i5, int i6) {
        this.f7529l = i6;
        this.f7530m = i5;
        boolean z4 = false;
        if (i6 <= 0 ? i4 >= i5 : i4 <= i5) {
            z4 = true;
        }
        this.f7531n = z4;
        this.f7532o = z4 ? i4 : i5;
    }

    public final int a() {
        int i4 = this.f7532o;
        if (i4 != this.f7530m) {
            this.f7532o = this.f7529l + i4;
        } else {
            if (!this.f7531n) {
                throw new NoSuchElementException();
            }
            this.f7531n = false;
        }
        return i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7531n;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
