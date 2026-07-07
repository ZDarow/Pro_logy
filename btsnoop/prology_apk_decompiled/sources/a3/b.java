package a3;

import B2.AbstractC0007h;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends AbstractList implements List {

    /* renamed from: o, reason: collision with root package name */
    public static final Object[] f3626o = new Object[0];

    /* renamed from: l, reason: collision with root package name */
    public int f3627l;

    /* renamed from: m, reason: collision with root package name */
    public Object[] f3628m = f3626o;

    /* renamed from: n, reason: collision with root package name */
    public int f3629n;

    public final void a(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f3628m.length;
        while (i4 < length && it.hasNext()) {
            this.f3628m[i4] = it.next();
            i4++;
        }
        int i5 = this.f3627l;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f3628m[i6] = it.next();
        }
        this.f3629n = collection.size() + this.f3629n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int i6 = this.f3629n;
        if (i4 < 0 || i4 > i6) {
            throw new IndexOutOfBoundsException(AbstractC0007h.i(i4, i6, "index: ", ", size: "));
        }
        if (i4 == i6) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        g();
        b(this.f3629n + 1);
        int f4 = f(this.f3627l + i4);
        int i7 = this.f3629n;
        if (i4 < ((i7 + 1) >> 1)) {
            if (f4 == 0) {
                Object[] objArr = this.f3628m;
                k3.h.e(objArr, "<this>");
                f4 = objArr.length;
            }
            int i8 = f4 - 1;
            int i9 = this.f3627l;
            if (i9 == 0) {
                Object[] objArr2 = this.f3628m;
                k3.h.e(objArr2, "<this>");
                i5 = objArr2.length - 1;
            } else {
                i5 = i9 - 1;
            }
            int i10 = this.f3627l;
            if (i8 >= i10) {
                Object[] objArr3 = this.f3628m;
                objArr3[i5] = objArr3[i10];
                c.i0(i10, i10 + 1, i8 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f3628m;
                c.i0(i10 - 1, i10, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f3628m;
                objArr5[objArr5.length - 1] = objArr5[0];
                c.i0(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.f3628m[i8] = obj;
            this.f3627l = i5;
        } else {
            int f5 = f(this.f3627l + i7);
            if (f4 < f5) {
                Object[] objArr6 = this.f3628m;
                c.i0(f4 + 1, f4, f5, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f3628m;
                c.i0(1, 0, f5, objArr7, objArr7);
                Object[] objArr8 = this.f3628m;
                objArr8[0] = objArr8[objArr8.length - 1];
                c.i0(f4 + 1, f4, objArr8.length - 1, objArr8, objArr8);
            }
            this.f3628m[f4] = obj;
        }
        this.f3629n++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        k3.h.e(collection, "elements");
        int i5 = this.f3629n;
        if (i4 >= 0 && i4 <= i5) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i4 == this.f3629n) {
                return addAll(collection);
            }
            g();
            b(collection.size() + this.f3629n);
            int f4 = f(this.f3627l + this.f3629n);
            int f5 = f(this.f3627l + i4);
            int size = collection.size();
            if (i4 < ((this.f3629n + 1) >> 1)) {
                int i6 = this.f3627l;
                int i7 = i6 - size;
                if (f5 < i6) {
                    Object[] objArr = this.f3628m;
                    c.i0(i7, i6, objArr.length, objArr, objArr);
                    if (size >= f5) {
                        Object[] objArr2 = this.f3628m;
                        c.i0(objArr2.length - size, 0, f5, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f3628m;
                        c.i0(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f3628m;
                        c.i0(0, size, f5, objArr4, objArr4);
                    }
                } else if (i7 >= 0) {
                    Object[] objArr5 = this.f3628m;
                    c.i0(i7, i6, f5, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f3628m;
                    i7 += objArr6.length;
                    int i8 = f5 - i6;
                    int length = objArr6.length - i7;
                    if (length >= i8) {
                        c.i0(i7, i6, f5, objArr6, objArr6);
                    } else {
                        c.i0(i7, i6, i6 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f3628m;
                        c.i0(0, this.f3627l + length, f5, objArr7, objArr7);
                    }
                }
                this.f3627l = i7;
                a(d(f5 - size), collection);
            } else {
                int i9 = f5 + size;
                if (f5 < f4) {
                    int i10 = size + f4;
                    Object[] objArr8 = this.f3628m;
                    if (i10 <= objArr8.length) {
                        c.i0(i9, f5, f4, objArr8, objArr8);
                    } else if (i9 >= objArr8.length) {
                        c.i0(i9 - objArr8.length, f5, f4, objArr8, objArr8);
                    } else {
                        int length2 = f4 - (i10 - objArr8.length);
                        c.i0(0, length2, f4, objArr8, objArr8);
                        Object[] objArr9 = this.f3628m;
                        c.i0(i9, f5, length2, objArr9, objArr9);
                    }
                } else {
                    Object[] objArr10 = this.f3628m;
                    c.i0(size, 0, f4, objArr10, objArr10);
                    Object[] objArr11 = this.f3628m;
                    if (i9 >= objArr11.length) {
                        c.i0(i9 - objArr11.length, f5, objArr11.length, objArr11, objArr11);
                    } else {
                        c.i0(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        Object[] objArr12 = this.f3628m;
                        c.i0(i9, f5, objArr12.length - size, objArr12, objArr12);
                    }
                }
                a(f5, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(AbstractC0007h.i(i4, i5, "index: ", ", size: "));
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f3629n + 1);
        int i4 = this.f3627l;
        if (i4 == 0) {
            Object[] objArr = this.f3628m;
            k3.h.e(objArr, "<this>");
            i4 = objArr.length;
        }
        int i5 = i4 - 1;
        this.f3627l = i5;
        this.f3628m[i5] = obj;
        this.f3629n++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f3629n + 1);
        this.f3628m[f(this.f3627l + this.f3629n)] = obj;
        this.f3629n++;
    }

    public final void b(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f3628m;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == f3626o) {
            if (i4 < 10) {
                i4 = 10;
            }
            this.f3628m = new Object[i4];
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
        Object[] objArr2 = new Object[i5];
        c.i0(0, this.f3627l, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f3628m;
        int length2 = objArr3.length;
        int i6 = this.f3627l;
        c.i0(length2 - i6, 0, i6, objArr3, objArr2);
        this.f3627l = 0;
        this.f3628m = objArr2;
    }

    public final int c(int i4) {
        k3.h.e(this.f3628m, "<this>");
        if (i4 == r0.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f3627l, f(this.f3627l + this.f3629n));
        }
        this.f3627l = 0;
        this.f3629n = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i4) {
        return i4 < 0 ? i4 + this.f3628m.length : i4;
    }

    public final void e(int i4, int i5) {
        if (i4 < i5) {
            Object[] objArr = this.f3628m;
            k3.h.e(objArr, "<this>");
            Arrays.fill(objArr, i4, i5, (Object) null);
        } else {
            Object[] objArr2 = this.f3628m;
            Arrays.fill(objArr2, i4, objArr2.length, (Object) null);
            Object[] objArr3 = this.f3628m;
            k3.h.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i5, (Object) null);
        }
    }

    public final int f(int i4) {
        Object[] objArr = this.f3628m;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int i5 = this.f3629n;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0007h.i(i4, i5, "index: ", ", size: "));
        }
        return this.f3628m[f(this.f3627l + i4)];
    }

    public final Object h(int i4) {
        int i5 = this.f3629n;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0007h.i(i4, i5, "index: ", ", size: "));
        }
        if (i4 == size() - 1) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        g();
        int f4 = f(this.f3627l + i4);
        Object[] objArr = this.f3628m;
        Object obj = objArr[f4];
        if (i4 < (this.f3629n >> 1)) {
            int i6 = this.f3627l;
            if (f4 >= i6) {
                c.i0(i6 + 1, i6, f4, objArr, objArr);
            } else {
                c.i0(1, 0, f4, objArr, objArr);
                Object[] objArr2 = this.f3628m;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f3627l;
                c.i0(i7 + 1, i7, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f3628m;
            int i8 = this.f3627l;
            objArr3[i8] = null;
            this.f3627l = c(i8);
        } else {
            int f5 = f((size() - 1) + this.f3627l);
            if (f4 <= f5) {
                Object[] objArr4 = this.f3628m;
                c.i0(f4, f4 + 1, f5 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f3628m;
                c.i0(f4, f4 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f3628m;
                objArr6[objArr6.length - 1] = objArr6[0];
                c.i0(0, 1, f5 + 1, objArr6, objArr6);
            }
            this.f3628m[f5] = null;
        }
        this.f3629n--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int f4 = f(this.f3627l + this.f3629n);
        int i5 = this.f3627l;
        if (i5 < f4) {
            while (i5 < f4) {
                if (k3.h.a(obj, this.f3628m[i5])) {
                    i4 = this.f3627l;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < f4) {
            return -1;
        }
        int length = this.f3628m.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < f4; i6++) {
                    if (k3.h.a(obj, this.f3628m[i6])) {
                        i5 = i6 + this.f3628m.length;
                        i4 = this.f3627l;
                    }
                }
                return -1;
            }
            if (k3.h.a(obj, this.f3628m[i5])) {
                i4 = this.f3627l;
                break;
            }
            i5++;
        }
        return i5 - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3629n == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i4;
        int f4 = f(this.f3627l + this.f3629n);
        int i5 = this.f3627l;
        if (i5 < f4) {
            length = f4 - 1;
            if (i5 <= length) {
                while (!k3.h.a(obj, this.f3628m[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i4 = this.f3627l;
                return length - i4;
            }
            return -1;
        }
        if (i5 > f4) {
            int i6 = f4 - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f3628m;
                    k3.h.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f3627l;
                    if (i7 <= length) {
                        while (!k3.h.a(obj, this.f3628m[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i4 = this.f3627l;
                    }
                } else {
                    if (k3.h.a(obj, this.f3628m[i6])) {
                        length = i6 + this.f3628m.length;
                        i4 = this.f3627l;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i4) {
        return h(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int f4;
        k3.h.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f3628m.length != 0) {
            int f5 = f(this.f3627l + this.f3629n);
            int i4 = this.f3627l;
            if (i4 < f5) {
                f4 = i4;
                while (i4 < f5) {
                    Object obj = this.f3628m[i4];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f3628m[f4] = obj;
                        f4++;
                    }
                    i4++;
                }
                Object[] objArr = this.f3628m;
                k3.h.e(objArr, "<this>");
                Arrays.fill(objArr, f4, f5, (Object) null);
            } else {
                int length = this.f3628m.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr2 = this.f3628m;
                    Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f3628m[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                f4 = f(i5);
                for (int i6 = 0; i6 < f5; i6++) {
                    Object[] objArr3 = this.f3628m;
                    Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f3628m[f4] = obj3;
                        f4 = c(f4);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                g();
                this.f3629n = d(f4 - this.f3627l);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.f3628m;
        int i4 = this.f3627l;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f3627l = c(i4);
        this.f3629n--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int f4 = f((size() - 1) + this.f3627l);
        Object[] objArr = this.f3628m;
        Object obj = objArr[f4];
        objArr[f4] = null;
        this.f3629n--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        int i6 = this.f3629n;
        if (i4 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
        }
        if (i4 > i5) {
            throw new IllegalArgumentException(AbstractC0007h.i(i4, i5, "fromIndex: ", " > toIndex: "));
        }
        int i7 = i5 - i4;
        if (i7 == 0) {
            return;
        }
        if (i7 == this.f3629n) {
            clear();
            return;
        }
        if (i7 == 1) {
            h(i4);
            return;
        }
        g();
        if (i4 < this.f3629n - i5) {
            int f4 = f(this.f3627l + (i4 - 1));
            int f5 = f(this.f3627l + (i5 - 1));
            while (i4 > 0) {
                int i8 = f4 + 1;
                int min = Math.min(i4, Math.min(i8, f5 + 1));
                Object[] objArr = this.f3628m;
                int i9 = f5 - min;
                int i10 = f4 - min;
                c.i0(i9 + 1, i10 + 1, i8, objArr, objArr);
                f4 = d(i10);
                f5 = d(i9);
                i4 -= min;
            }
            int f6 = f(this.f3627l + i7);
            e(this.f3627l, f6);
            this.f3627l = f6;
        } else {
            int f7 = f(this.f3627l + i5);
            int f8 = f(this.f3627l + i4);
            int i11 = this.f3629n;
            while (true) {
                i11 -= i5;
                if (i11 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f3628m;
                i5 = Math.min(i11, Math.min(objArr2.length - f7, objArr2.length - f8));
                Object[] objArr3 = this.f3628m;
                int i12 = f7 + i5;
                c.i0(f8, f7, i12, objArr3, objArr3);
                f7 = f(i12);
                f8 = f(f8 + i5);
            }
            int f9 = f(this.f3627l + this.f3629n);
            e(d(f9 - i7), f9);
        }
        this.f3629n -= i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int f4;
        k3.h.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f3628m.length != 0) {
            int f5 = f(this.f3627l + this.f3629n);
            int i4 = this.f3627l;
            if (i4 < f5) {
                f4 = i4;
                while (i4 < f5) {
                    Object obj = this.f3628m[i4];
                    if (collection.contains(obj)) {
                        this.f3628m[f4] = obj;
                        f4++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                Object[] objArr = this.f3628m;
                k3.h.e(objArr, "<this>");
                Arrays.fill(objArr, f4, f5, (Object) null);
            } else {
                int length = this.f3628m.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr2 = this.f3628m;
                    Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        this.f3628m[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i4++;
                }
                f4 = f(i5);
                for (int i6 = 0; i6 < f5; i6++) {
                    Object[] objArr3 = this.f3628m;
                    Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        this.f3628m[f4] = obj3;
                        f4 = c(f4);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                g();
                this.f3629n = d(f4 - this.f3627l);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int i5 = this.f3629n;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0007h.i(i4, i5, "index: ", ", size: "));
        }
        int f4 = f(this.f3627l + i4);
        Object[] objArr = this.f3628m;
        Object obj2 = objArr[f4];
        objArr[f4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3629n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f3629n]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        h(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k3.h.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.f3629n;
        if (length < i4) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
            k3.h.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int f4 = f(this.f3627l + this.f3629n);
        int i5 = this.f3627l;
        if (i5 < f4) {
            c.j0(i5, f4, 2, this.f3628m, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f3628m;
            c.i0(0, this.f3627l, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f3628m;
            c.i0(objArr3.length - this.f3627l, 0, f4, objArr3, objArr);
        }
        int i6 = this.f3629n;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k3.h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.f3629n);
        a(f(this.f3627l + this.f3629n), collection);
        return true;
    }
}
