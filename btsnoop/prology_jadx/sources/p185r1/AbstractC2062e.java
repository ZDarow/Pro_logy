package p185r1;

/* renamed from: r1.e */
/* loaded from: classes.dex */
public abstract class AbstractC2062e {
    static {
        p154k3.AbstractC1812q.m3788a(p185r1.AbstractC2062e.class).m3774b();
    }

    /* renamed from: a */
    public static int m4121a() {
        try {
            return androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (java.lang.NoClassDefFoundError | java.lang.UnsupportedOperationException unused) {
            return 0;
        }
    }
}
