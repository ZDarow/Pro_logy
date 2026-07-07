package T;

import android.util.SparseBooleanArray;

/* renamed from: T.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093n {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f2269a;

    public C0093n(SparseBooleanArray sparseBooleanArray) {
        this.f2269a = sparseBooleanArray;
    }

    public final int a(int i4) {
        SparseBooleanArray sparseBooleanArray = this.f2269a;
        W.a.g(i4, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0093n)) {
            return false;
        }
        C0093n c0093n = (C0093n) obj;
        int i4 = W.y.f2709a;
        SparseBooleanArray sparseBooleanArray = this.f2269a;
        if (i4 >= 24) {
            return sparseBooleanArray.equals(c0093n.f2269a);
        }
        if (sparseBooleanArray.size() != c0093n.f2269a.size()) {
            return false;
        }
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            if (a(i5) != c0093n.a(i5)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i4 = W.y.f2709a;
        SparseBooleanArray sparseBooleanArray = this.f2269a;
        if (i4 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            size = (size * 31) + a(i5);
        }
        return size;
    }
}
