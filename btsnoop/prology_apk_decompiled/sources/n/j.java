package n;

import B2.AbstractC0007h;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import o.AbstractC0454a;

/* loaded from: classes.dex */
public class j {

    /* renamed from: l, reason: collision with root package name */
    public int[] f7365l;

    /* renamed from: m, reason: collision with root package name */
    public Object[] f7366m;

    /* renamed from: n, reason: collision with root package name */
    public int f7367n;

    public j(int i4) {
        this.f7365l = i4 == 0 ? AbstractC0454a.f7533a : new int[i4];
        this.f7366m = i4 == 0 ? AbstractC0454a.f7534b : new Object[i4 << 1];
    }

    public final int a(Object obj) {
        int i4 = this.f7367n * 2;
        Object[] objArr = this.f7366m;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i4, Object obj) {
        int i5 = this.f7367n;
        if (i5 == 0) {
            return -1;
        }
        int a4 = AbstractC0454a.a(i5, i4, this.f7365l);
        if (a4 < 0 || k3.h.a(obj, this.f7366m[a4 << 1])) {
            return a4;
        }
        int i6 = a4 + 1;
        while (i6 < i5 && this.f7365l[i6] == i4) {
            if (k3.h.a(obj, this.f7366m[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = a4 - 1; i7 >= 0 && this.f7365l[i7] == i4; i7--) {
            if (k3.h.a(obj, this.f7366m[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f7367n > 0) {
            this.f7365l = AbstractC0454a.f7533a;
            this.f7366m = AbstractC0454a.f7534b;
            this.f7367n = 0;
        }
        if (this.f7367n > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i4 = this.f7367n;
        if (i4 == 0) {
            return -1;
        }
        int a4 = AbstractC0454a.a(i4, 0, this.f7365l);
        if (a4 < 0 || this.f7366m[a4 << 1] == null) {
            return a4;
        }
        int i5 = a4 + 1;
        while (i5 < i4 && this.f7365l[i5] == 0) {
            if (this.f7366m[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a4 - 1; i6 >= 0 && this.f7365l[i6] == 0; i6--) {
            if (this.f7366m[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public final Object e(int i4) {
        if (i4 < 0 || i4 >= this.f7367n) {
            throw new IllegalArgumentException(AbstractC0007h.k("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        return this.f7366m[i4 << 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i4 = this.f7367n;
                if (i4 != ((j) obj).f7367n) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object e4 = e(i5);
                    Object h4 = h(i5);
                    Object obj2 = jVar.get(e4);
                    if (h4 == null) {
                        if (obj2 != null || !jVar.containsKey(e4)) {
                            return false;
                        }
                    } else if (!h4.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f7367n != ((Map) obj).size()) {
                return false;
            }
            int i6 = this.f7367n;
            for (int i7 = 0; i7 < i6; i7++) {
                Object e5 = e(i7);
                Object h5 = h(i7);
                Object obj3 = ((Map) obj).get(e5);
                if (h5 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e5)) {
                        return false;
                    }
                } else if (!h5.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f7367n)) {
            throw new IllegalArgumentException(AbstractC0007h.k("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        Object[] objArr = this.f7366m;
        int i6 = i4 << 1;
        Object obj = objArr[i6 + 1];
        if (i5 <= 1) {
            clear();
        } else {
            int i7 = i5 - 1;
            int[] iArr = this.f7365l;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i4 < i7) {
                    int i8 = i4 + 1;
                    a3.c.h0(i4, i8, i5, iArr, iArr);
                    Object[] objArr2 = this.f7366m;
                    a3.c.i0(i6, i8 << 1, i5 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f7366m;
                int i9 = i7 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                int i10 = i5 > 8 ? i5 + (i5 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i10);
                k3.h.d(copyOf, "copyOf(this, newSize)");
                this.f7365l = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f7366m, i10 << 1);
                k3.h.d(copyOf2, "copyOf(this, newSize)");
                this.f7366m = copyOf2;
                if (i5 != this.f7367n) {
                    throw new ConcurrentModificationException();
                }
                if (i4 > 0) {
                    a3.c.h0(0, 0, i4, iArr, this.f7365l);
                    a3.c.i0(0, 0, i6, objArr, this.f7366m);
                }
                if (i4 < i7) {
                    int i11 = i4 + 1;
                    a3.c.h0(i4, i11, i5, iArr, this.f7365l);
                    a3.c.i0(i6, i11 << 1, i5 << 1, objArr, this.f7366m);
                }
            }
            if (i5 != this.f7367n) {
                throw new ConcurrentModificationException();
            }
            this.f7367n = i7;
        }
        return obj;
    }

    public final Object g(int i4, Object obj) {
        if (i4 < 0 || i4 >= this.f7367n) {
            throw new IllegalArgumentException(AbstractC0007h.k("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        int i5 = (i4 << 1) + 1;
        Object[] objArr = this.f7366m;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c4 = c(obj);
        if (c4 >= 0) {
            return this.f7366m[(c4 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c4 = c(obj);
        return c4 >= 0 ? this.f7366m[(c4 << 1) + 1] : obj2;
    }

    public final Object h(int i4) {
        if (i4 < 0 || i4 >= this.f7367n) {
            throw new IllegalArgumentException(AbstractC0007h.k("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        return this.f7366m[(i4 << 1) + 1];
    }

    public final int hashCode() {
        int[] iArr = this.f7365l;
        Object[] objArr = this.f7366m;
        int i4 = this.f7367n;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            i7 += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return i7;
    }

    public final boolean isEmpty() {
        return this.f7367n <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i4 = this.f7367n;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b4 = obj != null ? b(hashCode, obj) : d();
        if (b4 >= 0) {
            int i5 = (b4 << 1) + 1;
            Object[] objArr = this.f7366m;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~b4;
        int[] iArr = this.f7365l;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i7);
            k3.h.d(copyOf, "copyOf(this, newSize)");
            this.f7365l = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7366m, i7 << 1);
            k3.h.d(copyOf2, "copyOf(this, newSize)");
            this.f7366m = copyOf2;
            if (i4 != this.f7367n) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr2 = this.f7365l;
            int i8 = i6 + 1;
            a3.c.h0(i8, i6, i4, iArr2, iArr2);
            Object[] objArr2 = this.f7366m;
            a3.c.i0(i8 << 1, i6 << 1, this.f7367n << 1, objArr2, objArr2);
        }
        int i9 = this.f7367n;
        if (i4 == i9) {
            int[] iArr3 = this.f7365l;
            if (i6 < iArr3.length) {
                iArr3[i6] = hashCode;
                Object[] objArr3 = this.f7366m;
                int i10 = i6 << 1;
                objArr3[i10] = obj;
                objArr3[i10 + 1] = obj2;
                this.f7367n = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int c4 = c(obj);
        if (c4 >= 0) {
            return f(c4);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c4 = c(obj);
        if (c4 >= 0) {
            return g(c4, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f7367n;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7367n * 28);
        sb.append('{');
        int i4 = this.f7367n;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object e4 = e(i5);
            if (e4 != sb) {
                sb.append(e4);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h4 = h(i5);
            if (h4 != sb) {
                sb.append(h4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        k3.h.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c4 = c(obj);
        if (c4 < 0 || !k3.h.a(obj2, h(c4))) {
            return false;
        }
        f(c4);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c4 = c(obj);
        if (c4 < 0 || !k3.h.a(obj2, h(c4))) {
            return false;
        }
        g(c4, obj3);
        return true;
    }
}
