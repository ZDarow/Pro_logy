package p076T;

/* renamed from: T.n */
/* loaded from: classes.dex */
public final class C0700n {

    /* renamed from: a */
    public final android.util.SparseBooleanArray f2349a;

    public C0700n(android.util.SparseBooleanArray sparseBooleanArray) {
        this.f2349a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int m1286a(int i4) {
        android.util.SparseBooleanArray sparseBooleanArray = this.f2349a;
        p086W.AbstractC0781a.m1418g(i4, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i4);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p076T.C0700n)) {
            return false;
        }
        p076T.C0700n c0700n = (p076T.C0700n) obj;
        int i4 = p086W.AbstractC0805y.f2801a;
        android.util.SparseBooleanArray sparseBooleanArray = this.f2349a;
        if (i4 >= 24) {
            return sparseBooleanArray.equals(c0700n.f2349a);
        }
        if (sparseBooleanArray.size() != c0700n.f2349a.size()) {
            return false;
        }
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            if (m1286a(i5) != c0700n.m1286a(i5)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i4 = p086W.AbstractC0805y.f2801a;
        android.util.SparseBooleanArray sparseBooleanArray = this.f2349a;
        if (i4 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            size = (size * 31) + m1286a(i5);
        }
        return size;
    }
}
