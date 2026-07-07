package p129f2;

/* renamed from: f2.A */
/* loaded from: classes.dex */
public final class C1385A extends p129f2.AbstractC1413b0 implements java.io.Serializable {

    /* renamed from: l */
    public final java.util.Comparator[] f5690l;

    public C1385A(p129f2.C1442q c1442q, p129f2.C1442q c1442q2) {
        this.f5690l = new java.util.Comparator[]{c1442q, c1442q2};
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i4 = 0;
        while (true) {
            java.util.Comparator[] comparatorArr = this.f5690l;
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
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p129f2.C1385A) {
            return java.util.Arrays.equals(this.f5690l, ((p129f2.C1385A) obj).f5690l);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f5690l);
    }

    public final java.lang.String toString() {
        return p009B2.AbstractC0051h.m154m(new java.lang.StringBuilder("Ordering.compound("), java.util.Arrays.toString(this.f5690l), ")");
    }
}
