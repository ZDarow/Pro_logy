package i2;

import a.AbstractC0110a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final int[] f6203l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6204m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6205n;

    public b(int i4, int i5, int[] iArr) {
        this.f6203l = iArr;
        this.f6204m = i4;
        this.f6205n = i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (AbstractC0110a.G(((Integer) obj).intValue(), this.f6204m, this.f6205n, this.f6203l) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f6203l[this.f6204m + i4] != bVar.f6203l[bVar.f6204m + i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        AbstractC0462a.l(i4, size());
        return Integer.valueOf(this.f6203l[this.f6204m + i4]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = this.f6204m; i5 < this.f6205n; i5++) {
            i4 = (i4 * 31) + this.f6203l[i5];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int[] iArr = this.f6203l;
        int i4 = this.f6204m;
        int G3 = AbstractC0110a.G(intValue, i4, this.f6205n, iArr);
        if (G3 >= 0) {
            return G3 - i4;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i4;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i5 = this.f6205n;
            while (true) {
                i5--;
                i4 = this.f6204m;
                if (i5 < i4) {
                    i5 = -1;
                    break;
                }
                if (this.f6203l[i5] == intValue) {
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
    public final Object set(int i4, Object obj) {
        Integer num = (Integer) obj;
        AbstractC0462a.l(i4, size());
        int i5 = this.f6204m + i4;
        int[] iArr = this.f6203l;
        int i6 = iArr[i5];
        num.getClass();
        iArr[i5] = num.intValue();
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6205n - this.f6204m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i4, int i5) {
        AbstractC0462a.n(i4, i5, size());
        if (i4 == i5) {
            return Collections.emptyList();
        }
        int i6 = this.f6204m;
        return new b(i4 + i6, i6 + i5, this.f6203l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f6203l;
        int i4 = this.f6204m;
        sb.append(iArr[i4]);
        while (true) {
            i4++;
            if (i4 >= this.f6205n) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i4]);
        }
    }
}
