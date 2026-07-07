package L2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class w implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1100a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final w f1101b = new Object();

    public static String c(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i4;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i4 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i4 = 0;
        }
        return new String(bArr, i4, remaining, f1100a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f1100a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // L2.m
    public final /* bridge */ /* synthetic */ Object a(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }

    @Override // L2.m
    public final /* bridge */ /* synthetic */ ByteBuffer b(Object obj) {
        return d((String) obj);
    }
}
