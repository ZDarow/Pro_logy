package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c */
/* loaded from: classes.dex */
public abstract class AbstractC1097c {

    /* renamed from: a */
    public static final java.lang.Class f4211a;

    /* renamed from: b */
    public static final boolean f4212b;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName("libcore.io.Memory");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f4211a = cls;
        try {
            cls2 = java.lang.Class.forName("org.robolectric.Robolectric");
        } catch (java.lang.Throwable unused2) {
        }
        f4212b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m2487a() {
        return (f4211a == null || f4212b) ? false : true;
    }
}
