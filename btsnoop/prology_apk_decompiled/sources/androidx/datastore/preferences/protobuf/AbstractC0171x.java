package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0171x {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4148a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4149b;

    static {
        Charset.forName("US-ASCII");
        f4148a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4149b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0156h(bArr, 0, 0, false).e(0);
        } catch (C0173z e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }
}
