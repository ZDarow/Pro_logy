package n3;

import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements Iterable {

    /* renamed from: l, reason: collision with root package name */
    public final int f7526l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7527m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7528n;

    public a(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f7526l = i4;
        if (i6 > 0) {
            if (i4 < i5) {
                int i7 = i5 % i6;
                int i8 = i4 % i6;
                int i9 = ((i7 < 0 ? i7 + i6 : i7) - (i8 < 0 ? i8 + i6 : i8)) % i6;
                i5 -= i9 < 0 ? i9 + i6 : i9;
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i4 > i5) {
                int i10 = -i6;
                int i11 = i4 % i10;
                int i12 = i5 % i10;
                int i13 = ((i11 < 0 ? i11 + i10 : i11) - (i12 < 0 ? i12 + i10 : i12)) % i10;
                i5 += i13 < 0 ? i13 + i10 : i13;
            }
        }
        this.f7527m = i5;
        this.f7528n = i6;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f7526l != aVar.f7526l || this.f7527m != aVar.f7527m || this.f7528n != aVar.f7528n) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f7526l * 31) + this.f7527m) * 31) + this.f7528n;
    }

    public boolean isEmpty() {
        int i4 = this.f7528n;
        int i5 = this.f7527m;
        int i6 = this.f7526l;
        if (i4 > 0) {
            if (i6 <= i5) {
                return false;
            }
        } else if (i6 >= i5) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f7526l, this.f7527m, this.f7528n);
    }

    public String toString() {
        StringBuilder sb;
        int i4 = this.f7527m;
        int i5 = this.f7526l;
        int i6 = this.f7528n;
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append("..");
            sb.append(i4);
            sb.append(" step ");
            sb.append(i6);
        } else {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append(" downTo ");
            sb.append(i4);
            sb.append(" step ");
            sb.append(-i6);
        }
        return sb.toString();
    }
}
