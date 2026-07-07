package p165n;

/* renamed from: n.f */
/* loaded from: classes.dex */
public final class C1879f implements java.util.Collection, java.util.Set {

    /* renamed from: l */
    public int[] f7629l = p170o.AbstractC1926a.f7819a;

    /* renamed from: m */
    public java.lang.Object[] f7630m = p170o.AbstractC1926a.f7820b;

    /* renamed from: n */
    public int f7631n;

    public C1879f(int i4) {
        if (i4 > 0) {
            p165n.AbstractC1881h.m3860a(this, i4);
        }
    }

    /* renamed from: a */
    public final void m3858a(int i4) {
        int i5 = this.f7631n;
        java.lang.Object[] objArr = this.f7630m;
        java.lang.Object obj = objArr[i4];
        if (i5 <= 1) {
            clear();
            return;
        }
        int i6 = i5 - 1;
        int[] iArr = this.f7629l;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i4 < i6) {
                int i7 = i4 + 1;
                p105a3.AbstractC1020c.m2046h0(i4, i7, i5, iArr, iArr);
                java.lang.Object[] objArr2 = this.f7630m;
                p105a3.AbstractC1020c.m2047i0(i4, i7, i5, objArr2, objArr2);
            }
            this.f7630m[i6] = null;
        } else {
            p165n.AbstractC1881h.m3860a(this, i5 > 8 ? i5 + (i5 >> 1) : 8);
            if (i4 > 0) {
                p105a3.AbstractC1020c.m2046h0(0, 0, i4, iArr, this.f7629l);
                p105a3.AbstractC1020c.m2048j0(0, i4, 6, objArr, this.f7630m);
            }
            if (i4 < i6) {
                int i8 = i4 + 1;
                p105a3.AbstractC1020c.m2046h0(i4, i8, i5, iArr, this.f7629l);
                p105a3.AbstractC1020c.m2047i0(i4, i8, i5, objArr, this.f7630m);
            }
        }
        if (i5 != this.f7631n) {
            throw new java.util.ConcurrentModificationException();
        }
        this.f7631n = i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        int i4;
        int m3861b;
        int i5 = this.f7631n;
        if (obj == null) {
            m3861b = p165n.AbstractC1881h.m3861b(this, null, 0);
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            m3861b = p165n.AbstractC1881h.m3861b(this, obj, hashCode);
        }
        if (m3861b >= 0) {
            return false;
        }
        int i6 = ~m3861b;
        int[] iArr = this.f7629l;
        if (i5 >= iArr.length) {
            int i7 = 8;
            if (i5 >= 8) {
                i7 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i7 = 4;
            }
            java.lang.Object[] objArr = this.f7630m;
            p165n.AbstractC1881h.m3860a(this, i7);
            if (i5 != this.f7631n) {
                throw new java.util.ConcurrentModificationException();
            }
            int[] iArr2 = this.f7629l;
            if (iArr2.length != 0) {
                p105a3.AbstractC1020c.m2046h0(0, 0, iArr.length, iArr, iArr2);
                p105a3.AbstractC1020c.m2048j0(0, objArr.length, 6, objArr, this.f7630m);
            }
        }
        if (i6 < i5) {
            int[] iArr3 = this.f7629l;
            int i8 = i6 + 1;
            p105a3.AbstractC1020c.m2046h0(i8, i6, i5, iArr3, iArr3);
            java.lang.Object[] objArr2 = this.f7630m;
            p105a3.AbstractC1020c.m2047i0(i8, i6, i5, objArr2, objArr2);
        }
        int i9 = this.f7631n;
        if (i5 == i9) {
            int[] iArr4 = this.f7629l;
            if (i6 < iArr4.length) {
                iArr4[i6] = i4;
                this.f7630m[i6] = obj;
                this.f7631n = i9 + 1;
                return true;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        p154k3.AbstractC1803h.m3779e(collection, "elements");
        int size = collection.size() + this.f7631n;
        int i4 = this.f7631n;
        int[] iArr = this.f7629l;
        boolean z4 = false;
        if (iArr.length < size) {
            java.lang.Object[] objArr = this.f7630m;
            p165n.AbstractC1881h.m3860a(this, size);
            int i5 = this.f7631n;
            if (i5 > 0) {
                p105a3.AbstractC1020c.m2046h0(0, 0, i5, iArr, this.f7629l);
                p105a3.AbstractC1020c.m2048j0(0, this.f7631n, 6, objArr, this.f7630m);
            }
        }
        if (this.f7631n != i4) {
            throw new java.util.ConcurrentModificationException();
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f7631n != 0) {
            this.f7629l = p170o.AbstractC1926a.f7819a;
            this.f7630m = p170o.AbstractC1926a.f7820b;
            this.f7631n = 0;
        }
        if (this.f7631n != 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return (obj == null ? p165n.AbstractC1881h.m3861b(this, null, 0) : p165n.AbstractC1881h.m3861b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        p154k3.AbstractC1803h.m3779e(collection, "elements");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof java.util.Set) && this.f7631n == ((java.util.Set) obj).size()) {
            try {
                int i4 = this.f7631n;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (((java.util.Set) obj).contains(this.f7630m[i5])) {
                    }
                }
                return true;
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f7629l;
        int i4 = this.f7631n;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7631n <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new p165n.C1874a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int m3861b = obj == null ? p165n.AbstractC1881h.m3861b(this, null, 0) : p165n.AbstractC1881h.m3861b(this, obj, obj.hashCode());
        if (m3861b < 0) {
            return false;
        }
        m3858a(m3861b);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        p154k3.AbstractC1803h.m3779e(collection, "elements");
        java.util.Iterator it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        p154k3.AbstractC1803h.m3779e(collection, "elements");
        boolean z4 = false;
        for (int i4 = this.f7631n - 1; -1 < i4; i4--) {
            if (!collection.contains(this.f7630m[i4])) {
                m3858a(i4);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f7631n;
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.f7630m;
        int i4 = this.f7631n;
        p154k3.AbstractC1803h.m3779e(objArr, "<this>");
        p101a.AbstractC0936a.m1807o(i4, objArr.length);
        java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(objArr, 0, i4);
        p154k3.AbstractC1803h.m3778d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f7631n * 14);
        sb.append('{');
        int i4 = this.f7631n;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = this.f7630m[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        java.lang.String sb2 = sb.toString();
        p154k3.AbstractC1803h.m3778d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p154k3.AbstractC1803h.m3779e(objArr, "array");
        int i4 = this.f7631n;
        if (objArr.length < i4) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i4);
        } else if (objArr.length > i4) {
            objArr[i4] = null;
        }
        p105a3.AbstractC1020c.m2047i0(0, 0, this.f7631n, this.f7630m, objArr);
        return objArr;
    }
}
