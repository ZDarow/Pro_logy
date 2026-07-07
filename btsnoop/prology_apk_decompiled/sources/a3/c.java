package a3;

import a.AbstractC0110a;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0110a {
    public static void g0(int i4, int i5, int i6, byte[] bArr, byte[] bArr2) {
        k3.h.e(bArr, "<this>");
        k3.h.e(bArr2, "destination");
        System.arraycopy(bArr, i5, bArr2, i4, i6 - i5);
    }

    public static void h0(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        k3.h.e(iArr, "<this>");
        k3.h.e(iArr2, "destination");
        System.arraycopy(iArr, i5, iArr2, i4, i6 - i5);
    }

    public static void i0(int i4, int i5, int i6, Object[] objArr, Object[] objArr2) {
        k3.h.e(objArr, "<this>");
        k3.h.e(objArr2, "destination");
        System.arraycopy(objArr, i5, objArr2, i4, i6 - i5);
    }

    public static /* synthetic */ void j0(int i4, int i5, int i6, Object[] objArr, Object[] objArr2) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        i0(0, i4, i5, objArr, objArr2);
    }

    public static Object k0(Object[] objArr) {
        k3.h.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }
}
