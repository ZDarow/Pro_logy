package p182q3;

/* renamed from: q3.b */
/* loaded from: classes.dex */
public final class C2025b implements java.util.Iterator {

    /* renamed from: l */
    public final java.lang.String f8254l;

    /* renamed from: m */
    public int f8255m;

    /* renamed from: n */
    public int f8256n;

    /* renamed from: o */
    public int f8257o;

    /* renamed from: p */
    public int f8258p;

    public C2025b(java.lang.String str) {
        this.f8254l = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        int i5;
        int i6 = this.f8255m;
        if (i6 != 0) {
            return i6 == 1;
        }
        if (this.f8258p < 0) {
            this.f8255m = 2;
            return false;
        }
        java.lang.String str = this.f8254l;
        int length = str.length();
        int length2 = str.length();
        for (int i7 = this.f8256n; i7 < length2; i7++) {
            char charAt = str.charAt(i7);
            if (charAt == '\n' || charAt == '\r') {
                i4 = (charAt == '\r' && (i5 = i7 + 1) < str.length() && str.charAt(i5) == '\n') ? 2 : 1;
                length = i7;
                this.f8255m = 1;
                this.f8258p = i4;
                this.f8257o = length;
                return true;
            }
        }
        i4 = -1;
        this.f8255m = 1;
        this.f8258p = i4;
        this.f8257o = length;
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f8255m = 0;
        int i4 = this.f8257o;
        int i5 = this.f8256n;
        this.f8256n = this.f8258p + i4;
        return this.f8254l.subSequence(i5, i4).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
