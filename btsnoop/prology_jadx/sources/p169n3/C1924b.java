package p169n3;

/* renamed from: n3.b */
/* loaded from: classes.dex */
public final class C1924b implements java.util.Iterator {

    /* renamed from: l */
    public final int f7815l;

    /* renamed from: m */
    public final int f7816m;

    /* renamed from: n */
    public boolean f7817n;

    /* renamed from: o */
    public int f7818o;

    public C1924b(int i4, int i5, int i6) {
        this.f7815l = i6;
        this.f7816m = i5;
        boolean z4 = false;
        if (i6 <= 0 ? i4 >= i5 : i4 <= i5) {
            z4 = true;
        }
        this.f7817n = z4;
        this.f7818o = z4 ? i4 : i5;
    }

    /* renamed from: a */
    public final int m3882a() {
        int i4 = this.f7818o;
        if (i4 != this.f7816m) {
            this.f7818o = this.f7815l + i4;
        } else {
            if (!this.f7817n) {
                throw new java.util.NoSuchElementException();
            }
            this.f7817n = false;
        }
        return i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7817n;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Integer.valueOf(m3882a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
