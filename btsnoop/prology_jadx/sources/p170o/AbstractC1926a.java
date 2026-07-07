package p170o;

/* renamed from: o.a */
/* loaded from: classes.dex */
public abstract class AbstractC1926a {

    /* renamed from: a */
    public static final int[] f7819a = new int[0];

    /* renamed from: b */
    public static final java.lang.Object[] f7820b = new java.lang.Object[0];

    /* renamed from: a */
    public static final int m3883a(int i4, int i5, int[] iArr) {
        p154k3.AbstractC1803h.m3779e(iArr, "array");
        int i6 = i4 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i5) {
                i7 = i8 + 1;
            } else {
                if (i9 <= i5) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    /* renamed from: b */
    public static final int m3884b(long[] jArr, int i4, long j4) {
        p154k3.AbstractC1803h.m3779e(jArr, "array");
        int i5 = i4 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            long j5 = jArr[i7];
            if (j5 < j4) {
                i6 = i7 + 1;
            } else {
                if (j5 <= j4) {
                    return i7;
                }
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }
}
