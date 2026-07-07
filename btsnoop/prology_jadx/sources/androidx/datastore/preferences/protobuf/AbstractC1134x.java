package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.x */
/* loaded from: classes.dex */
public abstract class AbstractC1134x {

    /* renamed from: a */
    public static final java.nio.charset.Charset f4297a;

    /* renamed from: b */
    public static final byte[] f4298b;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        f4297a = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4298b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        try {
            new androidx.datastore.preferences.protobuf.C1107h(bArr, 0, 0, false).mo2521e(0);
        } catch (androidx.datastore.preferences.protobuf.C1136z e4) {
            throw new java.lang.IllegalArgumentException(e4);
        }
    }

    /* renamed from: a */
    public static void m2643a(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    /* renamed from: b */
    public static int m2644b(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }
}
