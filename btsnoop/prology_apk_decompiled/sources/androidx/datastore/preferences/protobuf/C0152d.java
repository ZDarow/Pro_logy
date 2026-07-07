package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152d implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public int f4071l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f4072m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0155g f4073n;

    public C0152d(C0155g c0155g) {
        this.f4073n = c0155g;
        this.f4072m = c0155g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4071l < this.f4072m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.f4071l;
        if (i4 >= this.f4072m) {
            throw new NoSuchElementException();
        }
        this.f4071l = i4 + 1;
        return Byte.valueOf(this.f4073n.f(i4));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
