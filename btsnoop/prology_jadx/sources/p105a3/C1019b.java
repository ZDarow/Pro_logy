package p105a3;

/* renamed from: a3.b */
/* loaded from: classes.dex */
public final class C1019b extends java.util.AbstractList implements java.util.List {

    /* renamed from: o */
    public static final java.lang.Object[] f3750o = new java.lang.Object[0];

    /* renamed from: l */
    public int f3751l;

    /* renamed from: m */
    public java.lang.Object[] f3752m = f3750o;

    /* renamed from: n */
    public int f3753n;

    /* renamed from: a */
    public final void m2037a(int i4, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        int length = this.f3752m.length;
        while (i4 < length && it.hasNext()) {
            this.f3752m[i4] = it.next();
            i4++;
        }
        int i5 = this.f3751l;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f3752m[i6] = it.next();
        }
        this.f3753n = collection.size() + this.f3753n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, java.lang.Object obj) {
        int i5;
        int i6 = this.f3753n;
        if (i4 < 0 || i4 > i6) {
            throw new java.lang.IndexOutOfBoundsException(p009B2.AbstractC0051h.m150i(i4, i6, "index: ", ", size: "));
        }
        if (i4 == i6) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        m2043g();
        m2038b(this.f3753n + 1);
        int m2042f = m2042f(this.f3751l + i4);
        int i7 = this.f3753n;
        if (i4 < ((i7 + 1) >> 1)) {
            if (m2042f == 0) {
                java.lang.Object[] objArr = this.f3752m;
                p154k3.AbstractC1803h.m3779e(objArr, "<this>");
                m2042f = objArr.length;
            }
            int i8 = m2042f - 1;
            int i9 = this.f3751l;
            if (i9 == 0) {
                java.lang.Object[] objArr2 = this.f3752m;
                p154k3.AbstractC1803h.m3779e(objArr2, "<this>");
                i5 = objArr2.length - 1;
            } else {
                i5 = i9 - 1;
            }
            int i10 = this.f3751l;
            if (i8 >= i10) {
                java.lang.Object[] objArr3 = this.f3752m;
                objArr3[i5] = objArr3[i10];
                p105a3.AbstractC1020c.m2047i0(i10, i10 + 1, i8 + 1, objArr3, objArr3);
            } else {
                java.lang.Object[] objArr4 = this.f3752m;
                p105a3.AbstractC1020c.m2047i0(i10 - 1, i10, objArr4.length, objArr4, objArr4);
                java.lang.Object[] objArr5 = this.f3752m;
                objArr5[objArr5.length - 1] = objArr5[0];
                p105a3.AbstractC1020c.m2047i0(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.f3752m[i8] = obj;
            this.f3751l = i5;
        } else {
            int m2042f2 = m2042f(this.f3751l + i7);
            if (m2042f < m2042f2) {
                java.lang.Object[] objArr6 = this.f3752m;
                p105a3.AbstractC1020c.m2047i0(m2042f + 1, m2042f, m2042f2, objArr6, objArr6);
            } else {
                java.lang.Object[] objArr7 = this.f3752m;
                p105a3.AbstractC1020c.m2047i0(1, 0, m2042f2, objArr7, objArr7);
                java.lang.Object[] objArr8 = this.f3752m;
                objArr8[0] = objArr8[objArr8.length - 1];
                p105a3.AbstractC1020c.m2047i0(m2042f + 1, m2042f, objArr8.length - 1, objArr8, objArr8);
            }
            this.f3752m[m2042f] = obj;
        }
        this.f3753n++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, java.util.Collection collection) {
        p154k3.AbstractC1803h.m3779e(collection, "elements");
        int i5 = this.f3753n;
        if (i4 >= 0 && i4 <= i5) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i4 == this.f3753n) {
                return addAll(collection);
            }
            m2043g();
            m2038b(collection.size() + this.f3753n);
            int m2042f = m2042f(this.f3751l + this.f3753n);
            int m2042f2 = m2042f(this.f3751l + i4);
            int size = collection.size();
            if (i4 < ((this.f3753n + 1) >> 1)) {
                int i6 = this.f3751l;
                int i7 = i6 - size;
                if (m2042f2 < i6) {
                    java.lang.Object[] objArr = this.f3752m;
                    p105a3.AbstractC1020c.m2047i0(i7, i6, objArr.length, objArr, objArr);
                    if (size >= m2042f2) {
                        java.lang.Object[] objArr2 = this.f3752m;
                        p105a3.AbstractC1020c.m2047i0(objArr2.length - size, 0, m2042f2, objArr2, objArr2);
                    } else {
                        java.lang.Object[] objArr3 = this.f3752m;
                        p105a3.AbstractC1020c.m2047i0(objArr3.length - size, 0, size, objArr3, objArr3);
                        java.lang.Object[] objArr4 = this.f3752m;
                        p105a3.AbstractC1020c.m2047i0(0, size, m2042f2, objArr4, objArr4);
                    }
                } else if (i7 >= 0) {
                    java.lang.Object[] objArr5 = this.f3752m;
                    p105a3.AbstractC1020c.m2047i0(i7, i6, m2042f2, objArr5, objArr5);
                } else {
                    java.lang.Object[] objArr6 = this.f3752m;
                    i7 += objArr6.length;
                    int i8 = m2042f2 - i6;
                    int length = objArr6.length - i7;
                    if (length >= i8) {
                        p105a3.AbstractC1020c.m2047i0(i7, i6, m2042f2, objArr6, objArr6);
                    } else {
                        p105a3.AbstractC1020c.m2047i0(i7, i6, i6 + length, objArr6, objArr6);
                        java.lang.Object[] objArr7 = this.f3752m;
                        p105a3.AbstractC1020c.m2047i0(0, this.f3751l + length, m2042f2, objArr7, objArr7);
                    }
                }
                this.f3751l = i7;
                m2037a(m2040d(m2042f2 - size), collection);
            } else {
                int i9 = m2042f2 + size;
                if (m2042f2 < m2042f) {
                    int i10 = size + m2042f;
                    java.lang.Object[] objArr8 = this.f3752m;
                    if (i10 <= objArr8.length) {
                        p105a3.AbstractC1020c.m2047i0(i9, m2042f2, m2042f, objArr8, objArr8);
                    } else if (i9 >= objArr8.length) {
                        p105a3.AbstractC1020c.m2047i0(i9 - objArr8.length, m2042f2, m2042f, objArr8, objArr8);
                    } else {
                        int length2 = m2042f - (i10 - objArr8.length);
                        p105a3.AbstractC1020c.m2047i0(0, length2, m2042f, objArr8, objArr8);
                        java.lang.Object[] objArr9 = this.f3752m;
                        p105a3.AbstractC1020c.m2047i0(i9, m2042f2, length2, objArr9, objArr9);
                    }
                } else {
                    java.lang.Object[] objArr10 = this.f3752m;
                    p105a3.AbstractC1020c.m2047i0(size, 0, m2042f, objArr10, objArr10);
                    java.lang.Object[] objArr11 = this.f3752m;
                    if (i9 >= objArr11.length) {
                        p105a3.AbstractC1020c.m2047i0(i9 - objArr11.length, m2042f2, objArr11.length, objArr11, objArr11);
                    } else {
                        p105a3.AbstractC1020c.m2047i0(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        java.lang.Object[] objArr12 = this.f3752m;
                        p105a3.AbstractC1020c.m2047i0(i9, m2042f2, objArr12.length - size, objArr12, objArr12);
                    }
                }
                m2037a(m2042f2, collection);
            }
            return true;
        }
        throw new java.lang.IndexOutOfBoundsException(p009B2.AbstractC0051h.m150i(i4, i5, "index: ", ", size: "));
    }

    public final void addFirst(java.lang.Object obj) {
        m2043g();
        m2038b(this.f3753n + 1);
        int i4 = this.f3751l;
        if (i4 == 0) {
            java.lang.Object[] objArr = this.f3752m;
            p154k3.AbstractC1803h.m3779e(objArr, "<this>");
            i4 = objArr.length;
        }
        int i5 = i4 - 1;
        this.f3751l = i5;
        this.f3752m[i5] = obj;
        this.f3753n++;
    }

    public final void addLast(java.lang.Object obj) {
        m2043g();
        m2038b(this.f3753n + 1);
        this.f3752m[m2042f(this.f3751l + this.f3753n)] = obj;
        this.f3753n++;
    }

    /* renamed from: b */
    public final void m2038b(int i4) {
        if (i4 < 0) {
            throw new java.lang.IllegalStateException("Deque is too big.");
        }
        java.lang.Object[] objArr = this.f3752m;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == f3750o) {
            if (i4 < 10) {
                i4 = 10;
            }
            this.f3752m = new java.lang.Object[i4];
            return;
        }
        int length = objArr.length;
        int i5 = length + (length >> 1);
        if (i5 - i4 < 0) {
            i5 = i4;
        }
        if (i5 - 2147483639 > 0) {
            i5 = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i5];
        p105a3.AbstractC1020c.m2047i0(0, this.f3751l, objArr.length, objArr, objArr2);
        java.lang.Object[] objArr3 = this.f3752m;
        int length2 = objArr3.length;
        int i6 = this.f3751l;
        p105a3.AbstractC1020c.m2047i0(length2 - i6, 0, i6, objArr3, objArr2);
        this.f3751l = 0;
        this.f3752m = objArr2;
    }

    /* renamed from: c */
    public final int m2039c(int i4) {
        p154k3.AbstractC1803h.m3779e(this.f3752m, "<this>");
        if (i4 == r0.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m2043g();
            m2041e(this.f3751l, m2042f(this.f3751l + this.f3753n));
        }
        this.f3751l = 0;
        this.f3753n = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int m2040d(int i4) {
        return i4 < 0 ? i4 + this.f3752m.length : i4;
    }

    /* renamed from: e */
    public final void m2041e(int i4, int i5) {
        if (i4 < i5) {
            java.lang.Object[] objArr = this.f3752m;
            p154k3.AbstractC1803h.m3779e(objArr, "<this>");
            java.util.Arrays.fill(objArr, i4, i5, (java.lang.Object) null);
        } else {
            java.lang.Object[] objArr2 = this.f3752m;
            java.util.Arrays.fill(objArr2, i4, objArr2.length, (java.lang.Object) null);
            java.lang.Object[] objArr3 = this.f3752m;
            p154k3.AbstractC1803h.m3779e(objArr3, "<this>");
            java.util.Arrays.fill(objArr3, 0, i5, (java.lang.Object) null);
        }
    }

    /* renamed from: f */
    public final int m2042f(int i4) {
        java.lang.Object[] objArr = this.f3752m;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    /* renamed from: g */
    public final void m2043g() {
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i4) {
        int i5 = this.f3753n;
        if (i4 < 0 || i4 >= i5) {
            throw new java.lang.IndexOutOfBoundsException(p009B2.AbstractC0051h.m150i(i4, i5, "index: ", ", size: "));
        }
        return this.f3752m[m2042f(this.f3751l + i4)];
    }

    /* renamed from: h */
    public final java.lang.Object m2044h(int i4) {
        int i5 = this.f3753n;
        if (i4 < 0 || i4 >= i5) {
            throw new java.lang.IndexOutOfBoundsException(p009B2.AbstractC0051h.m150i(i4, i5, "index: ", ", size: "));
        }
        if (i4 == size() - 1) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        m2043g();
        int m2042f = m2042f(this.f3751l + i4);
        java.lang.Object[] objArr = this.f3752m;
        java.lang.Object obj = objArr[m2042f];
        if (i4 < (this.f3753n >> 1)) {
            int i6 = this.f3751l;
            if (m2042f >= i6) {
                p105a3.AbstractC1020c.m2047i0(i6 + 1, i6, m2042f, objArr, objArr);
            } else {
                p105a3.AbstractC1020c.m2047i0(1, 0, m2042f, objArr, objArr);
                java.lang.Object[] objArr2 = this.f3752m;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f3751l;
                p105a3.AbstractC1020c.m2047i0(i7 + 1, i7, objArr2.length - 1, objArr2, objArr2);
            }
            java.lang.Object[] objArr3 = this.f3752m;
            int i8 = this.f3751l;
            objArr3[i8] = null;
            this.f3751l = m2039c(i8);
        } else {
            int m2042f2 = m2042f((size() - 1) + this.f3751l);
            if (m2042f <= m2042f2) {
                java.lang.Object[] objArr4 = this.f3752m;
                p105a3.AbstractC1020c.m2047i0(m2042f, m2042f + 1, m2042f2 + 1, objArr4, objArr4);
            } else {
                java.lang.Object[] objArr5 = this.f3752m;
                p105a3.AbstractC1020c.m2047i0(m2042f, m2042f + 1, objArr5.length, objArr5, objArr5);
                java.lang.Object[] objArr6 = this.f3752m;
                objArr6[objArr6.length - 1] = objArr6[0];
                p105a3.AbstractC1020c.m2047i0(0, 1, m2042f2 + 1, objArr6, objArr6);
            }
            this.f3752m[m2042f2] = null;
        }
        this.f3753n--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i4;
        int m2042f = m2042f(this.f3751l + this.f3753n);
        int i5 = this.f3751l;
        if (i5 < m2042f) {
            while (i5 < m2042f) {
                if (p154k3.AbstractC1803h.m3775a(obj, this.f3752m[i5])) {
                    i4 = this.f3751l;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < m2042f) {
            return -1;
        }
        int length = this.f3752m.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < m2042f; i6++) {
                    if (p154k3.AbstractC1803h.m3775a(obj, this.f3752m[i6])) {
                        i5 = i6 + this.f3752m.length;
                        i4 = this.f3751l;
                    }
                }
                return -1;
            }
            if (p154k3.AbstractC1803h.m3775a(obj, this.f3752m[i5])) {
                i4 = this.f3751l;
                break;
            }
            i5++;
        }
        return i5 - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3753n == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int length;
        int i4;
        int m2042f = m2042f(this.f3751l + this.f3753n);
        int i5 = this.f3751l;
        if (i5 < m2042f) {
            length = m2042f - 1;
            if (i5 <= length) {
                while (!p154k3.AbstractC1803h.m3775a(obj, this.f3752m[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i4 = this.f3751l;
                return length - i4;
            }
            return -1;
        }
        if (i5 > m2042f) {
            int i6 = m2042f - 1;
            while (true) {
                if (-1 >= i6) {
                    java.lang.Object[] objArr = this.f3752m;
                    p154k3.AbstractC1803h.m3779e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f3751l;
                    if (i7 <= length) {
                        while (!p154k3.AbstractC1803h.m3775a(obj, this.f3752m[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i4 = this.f3751l;
                    }
                } else {
                    if (p154k3.AbstractC1803h.m3775a(obj, this.f3752m[i6])) {
                        length = i6 + this.f3752m.length;
                        i4 = this.f3751l;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int i4) {
        return m2044h(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        int m2042f;
        p154k3.AbstractC1803h.m3779e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f3752m.length != 0) {
            int m2042f2 = m2042f(this.f3751l + this.f3753n);
            int i4 = this.f3751l;
            if (i4 < m2042f2) {
                m2042f = i4;
                while (i4 < m2042f2) {
                    java.lang.Object obj = this.f3752m[i4];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f3752m[m2042f] = obj;
                        m2042f++;
                    }
                    i4++;
                }
                java.lang.Object[] objArr = this.f3752m;
                p154k3.AbstractC1803h.m3779e(objArr, "<this>");
                java.util.Arrays.fill(objArr, m2042f, m2042f2, (java.lang.Object) null);
            } else {
                int length = this.f3752m.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    java.lang.Object[] objArr2 = this.f3752m;
                    java.lang.Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f3752m[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                m2042f = m2042f(i5);
                for (int i6 = 0; i6 < m2042f2; i6++) {
                    java.lang.Object[] objArr3 = this.f3752m;
                    java.lang.Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f3752m[m2042f] = obj3;
                        m2042f = m2039c(m2042f);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                m2043g();
                this.f3753n = m2040d(m2042f - this.f3751l);
            }
        }
        return z4;
    }

    public final java.lang.Object removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        m2043g();
        java.lang.Object[] objArr = this.f3752m;
        int i4 = this.f3751l;
        java.lang.Object obj = objArr[i4];
        objArr[i4] = null;
        this.f3751l = m2039c(i4);
        this.f3753n--;
        return obj;
    }

    public final java.lang.Object removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        m2043g();
        int m2042f = m2042f((size() - 1) + this.f3751l);
        java.lang.Object[] objArr = this.f3752m;
        java.lang.Object obj = objArr[m2042f];
        objArr[m2042f] = null;
        this.f3753n--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        int i6 = this.f3753n;
        if (i4 < 0 || i5 > i6) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
        }
        if (i4 > i5) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m150i(i4, i5, "fromIndex: ", " > toIndex: "));
        }
        int i7 = i5 - i4;
        if (i7 == 0) {
            return;
        }
        if (i7 == this.f3753n) {
            clear();
            return;
        }
        if (i7 == 1) {
            m2044h(i4);
            return;
        }
        m2043g();
        if (i4 < this.f3753n - i5) {
            int m2042f = m2042f(this.f3751l + (i4 - 1));
            int m2042f2 = m2042f(this.f3751l + (i5 - 1));
            while (i4 > 0) {
                int i8 = m2042f + 1;
                int min = java.lang.Math.min(i4, java.lang.Math.min(i8, m2042f2 + 1));
                java.lang.Object[] objArr = this.f3752m;
                int i9 = m2042f2 - min;
                int i10 = m2042f - min;
                p105a3.AbstractC1020c.m2047i0(i9 + 1, i10 + 1, i8, objArr, objArr);
                m2042f = m2040d(i10);
                m2042f2 = m2040d(i9);
                i4 -= min;
            }
            int m2042f3 = m2042f(this.f3751l + i7);
            m2041e(this.f3751l, m2042f3);
            this.f3751l = m2042f3;
        } else {
            int m2042f4 = m2042f(this.f3751l + i5);
            int m2042f5 = m2042f(this.f3751l + i4);
            int i11 = this.f3753n;
            while (true) {
                i11 -= i5;
                if (i11 <= 0) {
                    break;
                }
                java.lang.Object[] objArr2 = this.f3752m;
                i5 = java.lang.Math.min(i11, java.lang.Math.min(objArr2.length - m2042f4, objArr2.length - m2042f5));
                java.lang.Object[] objArr3 = this.f3752m;
                int i12 = m2042f4 + i5;
                p105a3.AbstractC1020c.m2047i0(m2042f5, m2042f4, i12, objArr3, objArr3);
                m2042f4 = m2042f(i12);
                m2042f5 = m2042f(m2042f5 + i5);
            }
            int m2042f6 = m2042f(this.f3751l + this.f3753n);
            m2041e(m2040d(m2042f6 - i7), m2042f6);
        }
        this.f3753n -= i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        int m2042f;
        p154k3.AbstractC1803h.m3779e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f3752m.length != 0) {
            int m2042f2 = m2042f(this.f3751l + this.f3753n);
            int i4 = this.f3751l;
            if (i4 < m2042f2) {
                m2042f = i4;
                while (i4 < m2042f2) {
                    java.lang.Object obj = this.f3752m[i4];
                    if (collection.contains(obj)) {
                        this.f3752m[m2042f] = obj;
                        m2042f++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                java.lang.Object[] objArr = this.f3752m;
                p154k3.AbstractC1803h.m3779e(objArr, "<this>");
                java.util.Arrays.fill(objArr, m2042f, m2042f2, (java.lang.Object) null);
            } else {
                int length = this.f3752m.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    java.lang.Object[] objArr2 = this.f3752m;
                    java.lang.Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        this.f3752m[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i4++;
                }
                m2042f = m2042f(i5);
                for (int i6 = 0; i6 < m2042f2; i6++) {
                    java.lang.Object[] objArr3 = this.f3752m;
                    java.lang.Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        this.f3752m[m2042f] = obj3;
                        m2042f = m2039c(m2042f);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                m2043g();
                this.f3753n = m2040d(m2042f - this.f3751l);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i4, java.lang.Object obj) {
        int i5 = this.f3753n;
        if (i4 < 0 || i4 >= i5) {
            throw new java.lang.IndexOutOfBoundsException(p009B2.AbstractC0051h.m150i(i4, i5, "index: ", ", size: "));
        }
        int m2042f = m2042f(this.f3751l + i4);
        java.lang.Object[] objArr = this.f3752m;
        java.lang.Object obj2 = objArr[m2042f];
        objArr[m2042f] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3753n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[this.f3753n]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        m2044h(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p154k3.AbstractC1803h.m3779e(objArr, "array");
        int length = objArr.length;
        int i4 = this.f3753n;
        if (length < i4) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i4);
            p154k3.AbstractC1803h.m3777c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (java.lang.Object[]) newInstance;
        }
        int m2042f = m2042f(this.f3751l + this.f3753n);
        int i5 = this.f3751l;
        if (i5 < m2042f) {
            p105a3.AbstractC1020c.m2048j0(i5, m2042f, 2, this.f3752m, objArr);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr2 = this.f3752m;
            p105a3.AbstractC1020c.m2047i0(0, this.f3751l, objArr2.length, objArr2, objArr);
            java.lang.Object[] objArr3 = this.f3752m;
            p105a3.AbstractC1020c.m2047i0(objArr3.length - this.f3751l, 0, m2042f, objArr3, objArr);
        }
        int i6 = this.f3753n;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        p154k3.AbstractC1803h.m3779e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m2043g();
        m2038b(collection.size() + this.f3753n);
        m2037a(m2042f(this.f3751l + this.f3753n), collection);
        return true;
    }
}
