package p167n1;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1895a {
    /* renamed from: a */
    public static void m3877a(java.lang.String str, int i4) {
        android.os.Trace.beginAsyncSection(str, i4);
    }

    /* renamed from: b */
    public static void m3878b(java.lang.String str, int i4) {
        android.os.Trace.endAsyncSection(str, i4);
    }

    /* renamed from: c */
    public static boolean m3879c() {
        return android.os.Trace.isEnabled();
    }
}
