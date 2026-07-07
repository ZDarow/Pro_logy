package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.T */
/* loaded from: classes.dex */
public final class C1086T extends androidx.datastore.preferences.protobuf.AbstractC1095b implements java.util.RandomAccess {

    /* renamed from: o */
    public static final androidx.datastore.preferences.protobuf.C1086T f4185o = new androidx.datastore.preferences.protobuf.C1086T(new java.lang.Object[0], 0, false);

    /* renamed from: m */
    public java.lang.Object[] f4186m;

    /* renamed from: n */
    public int f4187n;

    public C1086T(java.lang.Object[] objArr, int i4, boolean z4) {
        this.f4210l = z4;
        this.f4186m = objArr;
        this.f4187n = i4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        m2486a();
        int i4 = this.f4187n;
        java.lang.Object[] objArr = this.f4186m;
        if (i4 == objArr.length) {
            this.f4186m = java.util.Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        java.lang.Object[] objArr2 = this.f4186m;
        int i5 = this.f4187n;
        this.f4187n = i5 + 1;
        objArr2[i5] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m2423b(int i4) {
        if (i4 < 0 || i4 >= this.f4187n) {
            throw new java.lang.IndexOutOfBoundsException("Index:" + i4 + ", Size:" + this.f4187n);
        }
    }

    /* renamed from: c */
    public final androidx.datastore.preferences.protobuf.C1086T m2424c(int i4) {
        if (i4 >= this.f4187n) {
            return new androidx.datastore.preferences.protobuf.C1086T(java.util.Arrays.copyOf(this.f4186m, i4), this.f4187n, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i4) {
        m2423b(i4);
        return this.f4186m[i4];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1095b, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i4) {
        m2486a();
        m2423b(i4);
        java.lang.Object[] objArr = this.f4186m;
        java.lang.Object obj = objArr[i4];
        if (i4 < this.f4187n - 1) {
            java.lang.System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f4187n--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i4, java.lang.Object obj) {
        m2486a();
        m2423b(i4);
        java.lang.Object[] objArr = this.f4186m;
        java.lang.Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4187n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, java.lang.Object obj) {
        int i5;
        m2486a();
        if (i4 >= 0 && i4 <= (i5 = this.f4187n)) {
            java.lang.Object[] objArr = this.f4186m;
            if (i5 < objArr.length) {
                java.lang.System.arraycopy(objArr, i4, objArr, i4 + 1, i5 - i4);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[((i5 * 3) / 2) + 1];
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i4);
                java.lang.System.arraycopy(this.f4186m, i4, objArr2, i4 + 1, this.f4187n - i4);
                this.f4186m = objArr2;
            }
            this.f4186m[i4] = obj;
            this.f4187n++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("Index:" + i4 + ", Size:" + this.f4187n);
    }
}
