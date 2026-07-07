package p193t0;

/* renamed from: t0.k */
/* loaded from: classes.dex */
public final class C2173k extends p076T.C0681Y {

    /* renamed from: A */
    public static final /* synthetic */ int f8669A = 0;

    /* renamed from: r */
    public final boolean f8670r;

    /* renamed from: s */
    public final boolean f8671s;

    /* renamed from: t */
    public final boolean f8672t;

    /* renamed from: u */
    public final boolean f8673u;

    /* renamed from: v */
    public final boolean f8674v;

    /* renamed from: w */
    public final boolean f8675w;

    /* renamed from: x */
    public final boolean f8676x;

    /* renamed from: y */
    public final android.util.SparseArray f8677y;

    /* renamed from: z */
    public final android.util.SparseBooleanArray f8678z;

    static {
        new p193t0.C2173k(new p193t0.C2172j());
        p086W.AbstractC0805y.m1587H(1000);
        p086W.AbstractC0805y.m1587H(1001);
        p086W.AbstractC0805y.m1587H(1002);
        p086W.AbstractC0805y.m1587H(1003);
        p009B2.AbstractC0051h.m155n(1004, 1005, 1006, 1007, 1008);
        p009B2.AbstractC0051h.m155n(1009, 1010, 1011, 1012, 1013);
        p009B2.AbstractC0051h.m155n(1014, 1015, 1016, 1017, 1018);
    }

    public C2173k(p193t0.C2172j c2172j) {
        super(c2172j);
        this.f8670r = c2172j.f8660r;
        this.f8671s = c2172j.f8661s;
        this.f8672t = c2172j.f8662t;
        this.f8673u = c2172j.f8663u;
        this.f8674v = c2172j.f8664v;
        this.f8675w = c2172j.f8665w;
        this.f8676x = c2172j.f8666x;
        this.f8677y = c2172j.f8667y;
        this.f8678z = c2172j.f8668z;
    }

    @Override // p076T.C0681Y
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p193t0.C2173k.class != obj.getClass()) {
            return false;
        }
        p193t0.C2173k c2173k = (p193t0.C2173k) obj;
        if (super.equals(c2173k) && this.f8670r == c2173k.f8670r && this.f8671s == c2173k.f8671s && this.f8672t == c2173k.f8672t && this.f8673u == c2173k.f8673u && this.f8674v == c2173k.f8674v && this.f8675w == c2173k.f8675w && this.f8676x == c2173k.f8676x) {
            android.util.SparseBooleanArray sparseBooleanArray = this.f8678z;
            int size = sparseBooleanArray.size();
            android.util.SparseBooleanArray sparseBooleanArray2 = c2173k.f8678z;
            if (sparseBooleanArray2.size() == size) {
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        android.util.SparseArray sparseArray = this.f8677y;
                        int size2 = sparseArray.size();
                        android.util.SparseArray sparseArray2 = c2173k.f8677y;
                        if (sparseArray2.size() == size2) {
                            for (int i5 = 0; i5 < size2; i5++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i5));
                                if (indexOfKey >= 0) {
                                    java.util.Map map = (java.util.Map) sparseArray.valueAt(i5);
                                    java.util.Map map2 = (java.util.Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (java.util.Map.Entry entry : map.entrySet()) {
                                            p179q0.C2005k0 c2005k0 = (p179q0.C2005k0) entry.getKey();
                                            if (map2.containsKey(c2005k0) && p086W.AbstractC0805y.m1606a(entry.getValue(), map2.get(c2005k0))) {
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

    @Override // p076T.C0681Y
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f8670r ? 1 : 0)) * 961) + (this.f8671s ? 1 : 0)) * 961) + (this.f8672t ? 1 : 0)) * 28629151) + (this.f8673u ? 1 : 0)) * 31) + (this.f8674v ? 1 : 0)) * 31) + (this.f8675w ? 1 : 0)) * 961) + (this.f8676x ? 1 : 0)) * 31;
    }
}
