package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.e0 */
/* loaded from: classes.dex */
public final class C1102e0 implements java.security.PrivilegedExceptionAction {
    /* renamed from: a */
    public static sun.misc.Unsafe m2495a() {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ java.lang.Object run() {
        return m2495a();
    }
}
