package p169n3;

/* renamed from: n3.a */
/* loaded from: classes.dex */
public class C1923a implements java.lang.Iterable {

    /* renamed from: l */
    public final int f7812l;

    /* renamed from: m */
    public final int f7813m;

    /* renamed from: n */
    public final int f7814n;

    public C1923a(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f7812l = i4;
        if (i6 > 0) {
            if (i4 < i5) {
                int i7 = i5 % i6;
                int i8 = i4 % i6;
                int i9 = ((i7 < 0 ? i7 + i6 : i7) - (i8 < 0 ? i8 + i6 : i8)) % i6;
                i5 -= i9 < 0 ? i9 + i6 : i9;
            }
        } else {
            if (i6 >= 0) {
                throw new java.lang.IllegalArgumentException("Step is zero.");
            }
            if (i4 > i5) {
                int i10 = -i6;
                int i11 = i4 % i10;
                int i12 = i5 % i10;
                int i13 = ((i11 < 0 ? i11 + i10 : i11) - (i12 < 0 ? i12 + i10 : i12)) % i10;
                i5 += i13 < 0 ? i13 + i10 : i13;
            }
        }
        this.f7813m = i5;
        this.f7814n = i6;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p169n3.C1923a) {
            if (!isEmpty() || !((p169n3.C1923a) obj).isEmpty()) {
                p169n3.C1923a c1923a = (p169n3.C1923a) obj;
                if (this.f7812l != c1923a.f7812l || this.f7813m != c1923a.f7813m || this.f7814n != c1923a.f7814n) {
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
        return (((this.f7812l * 31) + this.f7813m) * 31) + this.f7814n;
    }

    public boolean isEmpty() {
        int i4 = this.f7814n;
        int i5 = this.f7813m;
        int i6 = this.f7812l;
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
    public final java.util.Iterator iterator() {
        return new p169n3.C1924b(this.f7812l, this.f7813m, this.f7814n);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i4 = this.f7813m;
        int i5 = this.f7812l;
        int i6 = this.f7814n;
        if (i6 > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(i5);
            sb.append("..");
            sb.append(i4);
            sb.append(" step ");
            sb.append(i6);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(i5);
            sb.append(" downTo ");
            sb.append(i4);
            sb.append(" step ");
            sb.append(-i6);
        }
        return sb.toString();
    }
}
