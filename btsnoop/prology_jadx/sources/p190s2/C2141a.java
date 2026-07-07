package p190s2;

/* renamed from: s2.a */
/* loaded from: classes.dex */
public final class C2141a extends android.util.LruCache {
    @Override // android.util.LruCache
    public final int sizeOf(java.lang.Object obj, java.lang.Object obj2) {
        return ((android.graphics.Bitmap) obj2).getByteCount() / 1024;
    }
}
