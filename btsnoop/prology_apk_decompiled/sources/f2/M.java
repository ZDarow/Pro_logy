package f2;

import B2.AbstractC0007h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class M extends AbstractC0276D implements Set {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f5515n = 0;

    /* renamed from: m, reason: collision with root package name */
    public transient I f5516m;

    public static int h(int i4) {
        int max = Math.max(i4, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static M i(int i4, Object... objArr) {
        if (i4 == 0) {
            return i0.f5580u;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new p0(obj);
        }
        int h4 = h(i4);
        Object[] objArr2 = new Object[h4];
        int i5 = h4 - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0007h.k("at index ", i8));
            }
            int hashCode = obj2.hashCode();
            int s = r.s(hashCode);
            while (true) {
                int i9 = s & i5;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i6 += hashCode;
                    i7++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                s++;
            }
        }
        Arrays.fill(objArr, i7, i4, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new p0(obj4);
        }
        if (h(i7) < h4 / 2) {
            return i(i7, objArr);
        }
        int length = objArr.length;
        if (i7 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new i0(i6, i5, i7, objArr, objArr2);
    }

    public static M j(Collection collection) {
        if ((collection instanceof M) && !(collection instanceof SortedSet)) {
            M m4 = (M) collection;
            if (!m4.f()) {
                return m4;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    @Override // f2.AbstractC0276D
    public I a() {
        I i4 = this.f5516m;
        if (i4 != null) {
            return i4;
        }
        I k4 = k();
        this.f5516m = k4;
        return k4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof M) && (this instanceof i0)) {
            M m4 = (M) obj;
            m4.getClass();
            if ((m4 instanceof i0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return r.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return r.m(this);
    }

    public I k() {
        Object[] array = toArray(AbstractC0276D.f5501l);
        G g4 = I.f5510m;
        return I.h(array.length, array);
    }
}
