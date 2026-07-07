package r1;

import androidx.window.extensions.WindowExtensionsProvider;
import k3.q;

/* loaded from: classes.dex */
public abstract class e {
    static {
        q.a(e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
