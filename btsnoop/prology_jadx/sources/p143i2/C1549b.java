package p143i2;

/* renamed from: i2.b */
/* loaded from: classes.dex */
public final class C1549b extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {

    /* renamed from: l */
    public final int[] f6433l;

    /* renamed from: m */
    public final int f6434m;

    /* renamed from: n */
    public final int f6435n;

    public C1549b(int i4, int i5, int[] iArr) {
        this.f6433l = iArr;
        this.f6434m = i4;
        this.f6435n = i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            if (p101a.AbstractC0936a.m1769G(((java.lang.Integer) obj).intValue(), this.f6434m, this.f6435n, this.f6433l) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p143i2.C1549b)) {
            return super.equals(obj);
        }
        p143i2.C1549b c1549b = (p143i2.C1549b) obj;
        int size = size();
        if (c1549b.size() != size) {
            return false;
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f6433l[this.f6434m + i4] != c1549b.f6433l[c1549b.f6434m + i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i4) {
        p176p1.AbstractC1949a.m3935l(i4, size());
        return java.lang.Integer.valueOf(this.f6433l[this.f6434m + i4]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = this.f6434m; i5 < this.f6435n; i5++) {
            i4 = (i4 * 31) + this.f6433l[i5];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        int[] iArr = this.f6433l;
        int i4 = this.f6434m;
        int m1769G = p101a.AbstractC0936a.m1769G(intValue, i4, this.f6435n, iArr);
        if (m1769G >= 0) {
            return m1769G - i4;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int i4;
        if (obj instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) obj).intValue();
            int i5 = this.f6435n;
            while (true) {
                i5--;
                i4 = this.f6434m;
                if (i5 < i4) {
                    i5 = -1;
                    break;
                }
                if (this.f6433l[i5] == intValue) {
                    break;
                }
            }
            if (i5 >= 0) {
                return i5 - i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i4, java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        p176p1.AbstractC1949a.m3935l(i4, size());
        int i5 = this.f6434m + i4;
        int[] iArr = this.f6433l;
        int i6 = iArr[i5];
        num.getClass();
        iArr[i5] = num.intValue();
        return java.lang.Integer.valueOf(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6435n - this.f6434m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i4, int i5) {
        p176p1.AbstractC1949a.m3937n(i4, i5, size());
        if (i4 == i5) {
            return java.util.Collections.emptyList();
        }
        int i6 = this.f6434m;
        return new p143i2.C1549b(i4 + i6, i6 + i5, this.f6433l);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f6433l;
        int i4 = this.f6434m;
        sb.append(iArr[i4]);
        while (true) {
            i4++;
            if (i4 >= this.f6435n) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i4]);
        }
    }
}
