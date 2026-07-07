package n;

import a.AbstractC0110a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import o.AbstractC0454a;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443f implements Collection, Set {

    /* renamed from: l, reason: collision with root package name */
    public int[] f7350l = AbstractC0454a.f7533a;

    /* renamed from: m, reason: collision with root package name */
    public Object[] f7351m = AbstractC0454a.f7534b;

    /* renamed from: n, reason: collision with root package name */
    public int f7352n;

    public C0443f(int i4) {
        if (i4 > 0) {
            AbstractC0445h.a(this, i4);
        }
    }

    public final void a(int i4) {
        int i5 = this.f7352n;
        Object[] objArr = this.f7351m;
        Object obj = objArr[i4];
        if (i5 <= 1) {
            clear();
            return;
        }
        int i6 = i5 - 1;
        int[] iArr = this.f7350l;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i4 < i6) {
                int i7 = i4 + 1;
                a3.c.h0(i4, i7, i5, iArr, iArr);
                Object[] objArr2 = this.f7351m;
                a3.c.i0(i4, i7, i5, objArr2, objArr2);
            }
            this.f7351m[i6] = null;
        } else {
            AbstractC0445h.a(this, i5 > 8 ? i5 + (i5 >> 1) : 8);
            if (i4 > 0) {
                a3.c.h0(0, 0, i4, iArr, this.f7350l);
                a3.c.j0(0, i4, 6, objArr, this.f7351m);
            }
            if (i4 < i6) {
                int i8 = i4 + 1;
                a3.c.h0(i4, i8, i5, iArr, this.f7350l);
                a3.c.i0(i4, i8, i5, objArr, this.f7351m);
            }
        }
        if (i5 != this.f7352n) {
            throw new ConcurrentModificationException();
        }
        this.f7352n = i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i4;
        int b4;
        int i5 = this.f7352n;
        if (obj == null) {
            b4 = AbstractC0445h.b(this, null, 0);
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            b4 = AbstractC0445h.b(this, obj, hashCode);
        }
        if (b4 >= 0) {
            return false;
        }
        int i6 = ~b4;
        int[] iArr = this.f7350l;
        if (i5 >= iArr.length) {
            int i7 = 8;
            if (i5 >= 8) {
                i7 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f7351m;
            AbstractC0445h.a(this, i7);
            if (i5 != this.f7352n) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f7350l;
            if (iArr2.length != 0) {
                a3.c.h0(0, 0, iArr.length, iArr, iArr2);
                a3.c.j0(0, objArr.length, 6, objArr, this.f7351m);
            }
        }
        if (i6 < i5) {
            int[] iArr3 = this.f7350l;
            int i8 = i6 + 1;
            a3.c.h0(i8, i6, i5, iArr3, iArr3);
            Object[] objArr2 = this.f7351m;
            a3.c.i0(i8, i6, i5, objArr2, objArr2);
        }
        int i9 = this.f7352n;
        if (i5 == i9) {
            int[] iArr4 = this.f7350l;
            if (i6 < iArr4.length) {
                iArr4[i6] = i4;
                this.f7351m[i6] = obj;
                this.f7352n = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        k3.h.e(collection, "elements");
        int size = collection.size() + this.f7352n;
        int i4 = this.f7352n;
        int[] iArr = this.f7350l;
        boolean z4 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f7351m;
            AbstractC0445h.a(this, size);
            int i5 = this.f7352n;
            if (i5 > 0) {
                a3.c.h0(0, 0, i5, iArr, this.f7350l);
                a3.c.j0(0, this.f7352n, 6, objArr, this.f7351m);
            }
        }
        if (this.f7352n != i4) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f7352n != 0) {
            this.f7350l = AbstractC0454a.f7533a;
            this.f7351m = AbstractC0454a.f7534b;
            this.f7352n = 0;
        }
        if (this.f7352n != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC0445h.b(this, null, 0) : AbstractC0445h.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        k3.h.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f7352n == ((Set) obj).size()) {
            try {
                int i4 = this.f7352n;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (((Set) obj).contains(this.f7351m[i5])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f7350l;
        int i4 = this.f7352n;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7352n <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0438a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b4 = obj == null ? AbstractC0445h.b(this, null, 0) : AbstractC0445h.b(this, obj, obj.hashCode());
        if (b4 < 0) {
            return false;
        }
        a(b4);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        k3.h.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        k3.h.e(collection, "elements");
        boolean z4 = false;
        for (int i4 = this.f7352n - 1; -1 < i4; i4--) {
            if (!collection.contains(this.f7351m[i4])) {
                a(i4);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f7352n;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f7351m;
        int i4 = this.f7352n;
        k3.h.e(objArr, "<this>");
        AbstractC0110a.o(i4, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i4);
        k3.h.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7352n * 14);
        sb.append('{');
        int i4 = this.f7352n;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.f7351m[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        k3.h.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        k3.h.e(objArr, "array");
        int i4 = this.f7352n;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        } else if (objArr.length > i4) {
            objArr[i4] = null;
        }
        a3.c.i0(0, 0, this.f7352n, this.f7351m, objArr);
        return objArr;
    }
}
