package c0;

import java.nio.ByteBuffer;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f4571d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4572e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f4573a;

    /* renamed from: b, reason: collision with root package name */
    public int f4574b;

    /* renamed from: c, reason: collision with root package name */
    public int f4575c;

    public static void a(ByteBuffer byteBuffer, long j4, int i4, int i5, boolean z4) {
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
        AbstractC0462a.k((j5 >> 8) == 0, "out of range: %s", j5);
        byteBuffer.put((byte) j5);
    }
}
