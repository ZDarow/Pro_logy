package u1;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import q1.C0494a;
import u.AbstractC0579g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f8577a;

    /* renamed from: b, reason: collision with root package name */
    public final C0494a f8578b;

    /* renamed from: c, reason: collision with root package name */
    public final C0494a f8579c;

    public e(ClassLoader classLoader, C0494a c0494a) {
        this.f8577a = classLoader;
        this.f8578b = c0494a;
        this.f8579c = new C0494a(classLoader);
    }

    public final WindowLayoutComponent a() {
        C0494a c0494a = this.f8579c;
        c0494a.getClass();
        boolean z4 = false;
        try {
            k3.h.d(c0494a.f7941a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (AbstractC0579g.o("WindowExtensionsProvider#getWindowExtensions is not valid", new C3.c(3, c0494a)) && AbstractC0579g.o("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && AbstractC0579g.o("FoldingFeature class is not valid", new d(this, 0))) {
                int a4 = r1.e.a();
                if (a4 == 1) {
                    z4 = b();
                } else if (2 <= a4 && a4 <= Integer.MAX_VALUE && b()) {
                    if (AbstractC0579g.o("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        z4 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z4) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return AbstractC0579g.o("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
