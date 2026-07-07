package t0;

import B2.AbstractC0007h;
import T.Y;
import W.y;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import q0.k0;

/* renamed from: t0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569k extends Y {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f8343A = 0;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8344r;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8345t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8346u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f8347v;
    public final boolean w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f8348x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseArray f8349y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f8350z;

    static {
        new C0569k(new C0568j());
        y.H(1000);
        y.H(1001);
        y.H(1002);
        y.H(1003);
        AbstractC0007h.n(1004, 1005, 1006, 1007, 1008);
        AbstractC0007h.n(1009, 1010, 1011, 1012, 1013);
        AbstractC0007h.n(1014, 1015, 1016, 1017, 1018);
    }

    public C0569k(C0568j c0568j) {
        super(c0568j);
        this.f8344r = c0568j.f8336r;
        this.s = c0568j.s;
        this.f8345t = c0568j.f8337t;
        this.f8346u = c0568j.f8338u;
        this.f8347v = c0568j.f8339v;
        this.w = c0568j.w;
        this.f8348x = c0568j.f8340x;
        this.f8349y = c0568j.f8341y;
        this.f8350z = c0568j.f8342z;
    }

    @Override // T.Y
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0569k.class != obj.getClass()) {
            return false;
        }
        C0569k c0569k = (C0569k) obj;
        if (super.equals(c0569k) && this.f8344r == c0569k.f8344r && this.s == c0569k.s && this.f8345t == c0569k.f8345t && this.f8346u == c0569k.f8346u && this.f8347v == c0569k.f8347v && this.w == c0569k.w && this.f8348x == c0569k.f8348x) {
            SparseBooleanArray sparseBooleanArray = this.f8350z;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = c0569k.f8350z;
            if (sparseBooleanArray2.size() == size) {
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        SparseArray sparseArray = this.f8349y;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = c0569k.f8349y;
                        if (sparseArray2.size() == size2) {
                            for (int i5 = 0; i5 < size2; i5++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i5));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i5);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            k0 k0Var = (k0) entry.getKey();
                                            if (map2.containsKey(k0Var) && y.a(entry.getValue(), map2.get(k0Var))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    } else {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i4)) < 0) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return false;
    }

    @Override // T.Y
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f8344r ? 1 : 0)) * 961) + (this.s ? 1 : 0)) * 961) + (this.f8345t ? 1 : 0)) * 28629151) + (this.f8346u ? 1 : 0)) * 31) + (this.f8347v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 961) + (this.f8348x ? 1 : 0)) * 31;
    }
}
