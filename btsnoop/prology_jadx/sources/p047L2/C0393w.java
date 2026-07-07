package p047L2;

/* renamed from: L2.w */
/* loaded from: classes.dex */
public final class C0393w implements p047L2.InterfaceC0383m {

    /* renamed from: a */
    public static final java.nio.charset.Charset f1139a = java.nio.charset.Charset.forName("UTF8");

    /* renamed from: b */
    public static final p047L2.C0393w f1140b = new java.lang.Object();

    /* renamed from: c */
    public static java.lang.String m852c(java.nio.ByteBuffer byteBuffer) {
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
        return new java.lang.String(bArr, i4, remaining, f1139a);
    }

    /* renamed from: d */
    public static java.nio.ByteBuffer m853d(java.lang.String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f1139a);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // p047L2.InterfaceC0383m
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ java.lang.Object mo831a(java.nio.ByteBuffer byteBuffer) {
        return m852c(byteBuffer);
    }

    @Override // p047L2.InterfaceC0383m
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ java.nio.ByteBuffer mo832b(java.lang.Object obj) {
        return m853d((java.lang.String) obj);
    }
}
