package p165n;

/* renamed from: n.h */
/* loaded from: classes.dex */
public abstract class AbstractC1881h {

    /* renamed from: a */
    public static final java.lang.Object f7636a = new java.lang.Object();

    /* renamed from: b */
    public static final java.lang.Object f7637b = new java.lang.Object();

    /* renamed from: a */
    public static final void m3860a(p165n.C1879f c1879f, int i4) {
        p154k3.AbstractC1803h.m3779e(c1879f, "<this>");
        c1879f.f7629l = new int[i4];
        c1879f.f7630m = new java.lang.Object[i4];
    }

    /* renamed from: b */
    public static final int m3861b(p165n.C1879f c1879f, java.lang.Object obj, int i4) {
        p154k3.AbstractC1803h.m3779e(c1879f, "<this>");
        int i5 = c1879f.f7631n;
        if (i5 == 0) {
            return -1;
        }
        try {
            int m3883a = p170o.AbstractC1926a.m3883a(c1879f.f7631n, i4, c1879f.f7629l);
            if (m3883a < 0 || p154k3.AbstractC1803h.m3775a(obj, c1879f.f7630m[m3883a])) {
                return m3883a;
            }
            int i6 = m3883a + 1;
            while (i6 < i5 && c1879f.f7629l[i6] == i4) {
                if (p154k3.AbstractC1803h.m3775a(obj, c1879f.f7630m[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = m3883a - 1; i7 >= 0 && c1879f.f7629l[i7] == i4; i7--) {
                if (p154k3.AbstractC1803h.m3775a(obj, c1879f.f7630m[i7])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }
}
