package p124e2;

/* renamed from: e2.i */
/* loaded from: classes.dex */
public final class C1361i implements java.util.Iterator {

    /* renamed from: m */
    public java.lang.String f5638m;

    /* renamed from: n */
    public final java.lang.CharSequence f5639n;

    /* renamed from: o */
    public final p124e2.C1355c f5640o;

    /* renamed from: q */
    public int f5642q;

    /* renamed from: r */
    public final /* synthetic */ p043K2.C0339o f5643r;

    /* renamed from: l */
    public int f5637l = 2;

    /* renamed from: p */
    public int f5641p = 0;

    public C1361i(p043K2.C0339o c0339o, p063P2.C0528a c0528a, java.lang.CharSequence charSequence) {
        this.f5643r = c0339o;
        this.f5640o = (p124e2.C1355c) c0528a.f1552m;
        this.f5642q = c0528a.f1551l;
        this.f5639n = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.lang.String str;
        int i4 = this.f5637l;
        if (i4 == 4) {
            throw new java.lang.IllegalStateException();
        }
        int m781b = p044L.AbstractC0352j.m781b(i4);
        if (m781b == 0) {
            return true;
        }
        if (m781b == 2) {
            return false;
        }
        this.f5637l = 4;
        int i5 = this.f5641p;
        while (true) {
            int i6 = this.f5641p;
            if (i6 == -1) {
                this.f5637l = 3;
                str = null;
                break;
            }
            p124e2.C1354b c1354b = (p124e2.C1354b) this.f5643r.f1048m;
            java.lang.CharSequence charSequence = this.f5639n;
            int length = charSequence.length();
            p176p1.AbstractC1949a.m3936m(i6, length);
            while (true) {
                if (i6 >= length) {
                    i6 = -1;
                    break;
                }
                if (c1354b.mo3112a(charSequence.charAt(i6))) {
                    break;
                }
                i6++;
            }
            if (i6 == -1) {
                i6 = charSequence.length();
                this.f5641p = -1;
            } else {
                this.f5641p = i6 + 1;
            }
            int i7 = this.f5641p;
            if (i7 == i5) {
                int i8 = i7 + 1;
                this.f5641p = i8;
                if (i8 > charSequence.length()) {
                    this.f5641p = -1;
                }
            } else {
                p124e2.C1355c c1355c = this.f5640o;
                if (i5 < i6) {
                    charSequence.charAt(i5);
                    c1355c.getClass();
                }
                if (i6 > i5) {
                    charSequence.charAt(i6 - 1);
                    c1355c.getClass();
                }
                int i9 = this.f5642q;
                if (i9 == 1) {
                    i6 = charSequence.length();
                    this.f5641p = -1;
                    if (i6 > i5) {
                        charSequence.charAt(i6 - 1);
                        c1355c.getClass();
                    }
                } else {
                    this.f5642q = i9 - 1;
                }
                str = charSequence.subSequence(i5, i6).toString();
            }
        }
        this.f5638m = str;
        if (this.f5637l == 3) {
            return false;
        }
        this.f5637l = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f5637l = 2;
        java.lang.String str = this.f5638m;
        this.f5638m = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
