package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d */
/* loaded from: classes.dex */
public final class C1099d implements java.util.Iterator {

    /* renamed from: l */
    public int f4219l = 0;

    /* renamed from: m */
    public final int f4220m;

    /* renamed from: n */
    public final /* synthetic */ androidx.datastore.preferences.protobuf.C1105g f4221n;

    public C1099d(androidx.datastore.preferences.protobuf.C1105g c1105g) {
        this.f4221n = c1105g;
        this.f4220m = c1105g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4219l < this.f4220m;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i4 = this.f4219l;
        if (i4 >= this.f4220m) {
            throw new java.util.NoSuchElementException();
        }
        this.f4219l = i4 + 1;
        return java.lang.Byte.valueOf(this.f4221n.mo2499f(i4));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
