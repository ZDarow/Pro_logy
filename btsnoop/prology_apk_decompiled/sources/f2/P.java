package f2;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class P extends r0 {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f5524m = new Object();

    /* renamed from: l, reason: collision with root package name */
    public Object f5525l;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5525l != f5524m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f5525l;
        Object obj2 = f5524m;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f5525l = obj2;
        return obj;
    }
}
