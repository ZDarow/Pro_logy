package p112c0;

/* renamed from: c0.N */
/* loaded from: classes.dex */
public final class C1215N {

    /* renamed from: d */
    public static final byte[] f4736d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e */
    public static final byte[] f4737e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    public java.nio.ByteBuffer f4738a;

    /* renamed from: b */
    public int f4739b;

    /* renamed from: c */
    public int f4740c;

    /* renamed from: a */
    public static void m2891a(java.nio.ByteBuffer byteBuffer, long j4, int i4, int i5, boolean z4) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z4 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j4);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i4);
        byteBuffer.putInt(0);
        long j5 = i5;
        p176p1.AbstractC1949a.m3934k((j5 >> 8) == 0, "out of range: %s", j5);
        byteBuffer.put((byte) j5);
    }
}
