package p133g2;

/* renamed from: g2.b */
/* loaded from: classes.dex */
public abstract class AbstractC1478b {
    static {
        new java.io.OutputStream();
    }

    /* renamed from: a */
    public static byte[] m3305a(java.util.ArrayDeque arrayDeque, int i4) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i4) {
            return bArr;
        }
        int length = i4 - bArr.length;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, i4);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = java.lang.Math.min(length, bArr2.length);
            java.lang.System.arraycopy(bArr2, 0, copyOf, i4 - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static byte[] m3306b(java.io.InputStream inputStream) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(20);
        int min = java.lang.Math.min(8192, java.lang.Math.max(128, java.lang.Integer.highestOneBit(0) * 2));
        int i4 = 0;
        while (i4 < 2147483639) {
            int min2 = java.lang.Math.min(min, 2147483639 - i4);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i5 = 0;
            while (i5 < min2) {
                int read = inputStream.read(bArr, i5, min2 - i5);
                if (read == -1) {
                    return m3305a(arrayDeque, i4);
                }
                i5 += read;
                i4 += read;
            }
            min = p101a.AbstractC0936a.m1780R(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return m3305a(arrayDeque, 2147483639);
        }
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
    }
}
