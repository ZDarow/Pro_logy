package p021E0;

/* renamed from: E0.c */
/* loaded from: classes.dex */
public final class C0191c extends p021E0.AbstractC0193e {

    /* renamed from: b */
    public long f534b;

    /* renamed from: c */
    public long[] f535c;

    /* renamed from: d */
    public long[] f536d;

    /* renamed from: l */
    public static java.io.Serializable m545l(int i4, p086W.C0798r c0798r) {
        if (i4 == 0) {
            return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(c0798r.m1553o()));
        }
        if (i4 == 1) {
            return java.lang.Boolean.valueOf(c0798r.m1559u() == 1);
        }
        if (i4 == 2) {
            return m547n(c0798r);
        }
        if (i4 != 3) {
            if (i4 == 8) {
                return m546m(c0798r);
            }
            if (i4 != 10) {
                if (i4 != 11) {
                    return null;
                }
                java.util.Date date = new java.util.Date((long) java.lang.Double.longBitsToDouble(c0798r.m1553o()));
                c0798r.m1538H(2);
                return date;
            }
            int m1563y = c0798r.m1563y();
            java.util.ArrayList arrayList = new java.util.ArrayList(m1563y);
            for (int i5 = 0; i5 < m1563y; i5++) {
                java.io.Serializable m545l = m545l(c0798r.m1559u(), c0798r);
                if (m545l != null) {
                    arrayList.add(m545l);
                }
            }
            return arrayList;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        while (true) {
            java.lang.String m547n = m547n(c0798r);
            int m1559u = c0798r.m1559u();
            if (m1559u == 9) {
                return hashMap;
            }
            java.io.Serializable m545l2 = m545l(m1559u, c0798r);
            if (m545l2 != null) {
                hashMap.put(m547n, m545l2);
            }
        }
    }

    /* renamed from: m */
    public static java.util.HashMap m546m(p086W.C0798r c0798r) {
        int m1563y = c0798r.m1563y();
        java.util.HashMap hashMap = new java.util.HashMap(m1563y);
        for (int i4 = 0; i4 < m1563y; i4++) {
            java.lang.String m547n = m547n(c0798r);
            java.io.Serializable m545l = m545l(c0798r.m1559u(), c0798r);
            if (m545l != null) {
                hashMap.put(m547n, m545l);
            }
        }
        return hashMap;
    }

    /* renamed from: n */
    public static java.lang.String m547n(p086W.C0798r c0798r) {
        int m1531A = c0798r.m1531A();
        int i4 = c0798r.f2787b;
        c0798r.m1538H(m1531A);
        return new java.lang.String(c0798r.f2786a, i4, m1531A);
    }
}
