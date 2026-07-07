package s2;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544a extends LruCache {
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return ((Bitmap) obj2).getByteCount() / 1024;
    }
}
