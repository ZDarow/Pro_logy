package f2;

import B2.AbstractC0007h;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: f2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273A extends b0 implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final Comparator[] f5496l;

    public C0273A(C0295q c0295q, C0295q c0295q2) {
        this.f5496l = new Comparator[]{c0295q, c0295q2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i4 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f5496l;
            if (i4 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i4].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i4++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0273A) {
            return Arrays.equals(this.f5496l, ((C0273A) obj).f5496l);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5496l);
    }

    public final String toString() {
        return AbstractC0007h.m(new StringBuilder("Ordering.compound("), Arrays.toString(this.f5496l), ")");
    }
}
