package p154k3;

/* renamed from: k3.a */
/* loaded from: classes.dex */
public final class C1796a implements java.util.Iterator {

    /* renamed from: l */
    public final java.lang.Object[] f7354l;

    /* renamed from: m */
    public int f7355m;

    public C1796a(java.lang.Object[] objArr) {
        p154k3.AbstractC1803h.m3779e(objArr, "array");
        this.f7354l = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7355m < this.f7354l.length;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        try {
            java.lang.Object[] objArr = this.f7354l;
            int i4 = this.f7355m;
            this.f7355m = i4 + 1;
            return objArr[i4];
        } catch (java.lang.ArrayIndexOutOfBoundsException e4) {
            this.f7355m--;
            throw new java.util.NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
