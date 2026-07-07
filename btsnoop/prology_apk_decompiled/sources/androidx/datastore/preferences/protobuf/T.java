package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class T extends AbstractC0150b implements RandomAccess {

    /* renamed from: o, reason: collision with root package name */
    public static final T f4037o = new T(new Object[0], 0, false);

    /* renamed from: m, reason: collision with root package name */
    public Object[] f4038m;

    /* renamed from: n, reason: collision with root package name */
    public int f4039n;

    public T(Object[] objArr, int i4, boolean z4) {
        this.f4062l = z4;
        this.f4038m = objArr;
        this.f4039n = i4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i4 = this.f4039n;
        Object[] objArr = this.f4038m;
        if (i4 == objArr.length) {
            this.f4038m = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4038m;
        int i5 = this.f4039n;
        this.f4039n = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i4) {
        if (i4 < 0 || i4 >= this.f4039n) {
            throw new IndexOutOfBoundsException("Index:" + i4 + ", Size:" + this.f4039n);
        }
    }

    public final T c(int i4) {
        if (i4 >= this.f4039n) {
            return new T(Arrays.copyOf(this.f4038m, i4), this.f4039n, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        b(i4);
        return this.f4038m[i4];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0150b, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        a();
        b(i4);
        Object[] objArr = this.f4038m;
        Object obj = objArr[i4];
        if (i4 < this.f4039n - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f4039n--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        a();
        b(i4);
        Object[] objArr = this.f4038m;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4039n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        a();
        if (i4 >= 0 && i4 <= (i5 = this.f4039n)) {
            Object[] objArr = this.f4038m;
            if (i5 < objArr.length) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i5 - i4);
            } else {
                Object[] objArr2 = new Object[((i5 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i4);
                System.arraycopy(this.f4038m, i4, objArr2, i4 + 1, this.f4039n - i4);
                this.f4038m = objArr2;
            }
            this.f4038m[i4] = obj;
            this.f4039n++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i4 + ", Size:" + this.f4039n);
    }
}
