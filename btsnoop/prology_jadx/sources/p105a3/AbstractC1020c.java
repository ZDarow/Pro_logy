package p105a3;

/* renamed from: a3.c */
/* loaded from: classes.dex */
public abstract class AbstractC1020c extends p101a.AbstractC0936a {
    /* renamed from: g0 */
    public static void m2045g0(int i4, int i5, int i6, byte[] bArr, byte[] bArr2) {
        p154k3.AbstractC1803h.m3779e(bArr, "<this>");
        p154k3.AbstractC1803h.m3779e(bArr2, "destination");
        java.lang.System.arraycopy(bArr, i5, bArr2, i4, i6 - i5);
    }

    /* renamed from: h0 */
    public static void m2046h0(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        p154k3.AbstractC1803h.m3779e(iArr, "<this>");
        p154k3.AbstractC1803h.m3779e(iArr2, "destination");
        java.lang.System.arraycopy(iArr, i5, iArr2, i4, i6 - i5);
    }

    /* renamed from: i0 */
    public static void m2047i0(int i4, int i5, int i6, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        p154k3.AbstractC1803h.m3779e(objArr, "<this>");
        p154k3.AbstractC1803h.m3779e(objArr2, "destination");
        java.lang.System.arraycopy(objArr, i5, objArr2, i4, i6 - i5);
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m2048j0(int i4, int i5, int i6, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        m2047i0(0, i4, i5, objArr, objArr2);
    }

    /* renamed from: k0 */
    public static java.lang.Object m2049k0(java.lang.Object[] objArr) {
        p154k3.AbstractC1803h.m3779e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }
}
