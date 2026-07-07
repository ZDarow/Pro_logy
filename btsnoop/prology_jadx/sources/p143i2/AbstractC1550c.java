package p143i2;

/* renamed from: i2.c */
/* loaded from: classes.dex */
public abstract class AbstractC1550c {

    /* renamed from: a */
    public static final byte[] f6436a;

    static {
        byte[] bArr = new byte[128];
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i4 = 0; i4 < 10; i4++) {
            bArr[i4 + 48] = (byte) i4;
        }
        for (int i5 = 0; i5 < 26; i5++) {
            byte b4 = (byte) (i5 + 10);
            bArr[i5 + 65] = b4;
            bArr[i5 + 97] = b4;
        }
        f6436a = bArr;
    }
}
