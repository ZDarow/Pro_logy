package f2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: f2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296s implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public int f5608l;

    /* renamed from: m, reason: collision with root package name */
    public int f5609m;

    /* renamed from: n, reason: collision with root package name */
    public int f5610n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0299v f5611o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5612p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0299v f5613q;

    public C0296s(C0299v c0299v, int i4) {
        this.f5612p = i4;
        this.f5613q = c0299v;
        this.f5611o = c0299v;
        this.f5608l = c0299v.f5624p;
        this.f5609m = c0299v.isEmpty() ? -1 : 0;
        this.f5610n = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5609m >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        C0299v c0299v = this.f5611o;
        if (c0299v.f5624p != this.f5608l) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f5609m;
        this.f5610n = i4;
        switch (this.f5612p) {
            case 0:
                obj = this.f5613q.j()[i4];
                break;
            case 1:
                obj = new C0298u(this.f5613q, i4);
                break;
            default:
                obj = this.f5613q.k()[i4];
                break;
        }
        int i5 = this.f5609m + 1;
        if (i5 >= c0299v.f5625q) {
            i5 = -1;
        }
        this.f5609m = i5;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0299v c0299v = this.f5611o;
        int i4 = c0299v.f5624p;
        int i5 = this.f5608l;
        if (i4 != i5) {
            throw new ConcurrentModificationException();
        }
        int i6 = this.f5610n;
        if (i6 < 0) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f5608l = i5 + 32;
        c0299v.remove(c0299v.j()[i6]);
        this.f5609m--;
        this.f5610n = -1;
    }
}
