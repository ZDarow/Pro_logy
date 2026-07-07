package p198u1;

/* renamed from: u1.e */
/* loaded from: classes.dex */
public final class C2237e {

    /* renamed from: a */
    public final java.lang.ClassLoader f8920a;

    /* renamed from: b */
    public final p180q1.C2022a f8921b;

    /* renamed from: c */
    public final p180q1.C2022a f8922c;

    public C2237e(java.lang.ClassLoader classLoader, p180q1.C2022a c2022a) {
        this.f8920a = classLoader;
        this.f8921b = c2022a;
        this.f8922c = new p180q1.C2022a(classLoader);
    }

    /* renamed from: a */
    public final androidx.window.extensions.layout.WindowLayoutComponent m4437a() {
        p180q1.C2022a c2022a = this.f8922c;
        c2022a.getClass();
        boolean z4 = false;
        try {
            p154k3.AbstractC1803h.m3778d(c2022a.f8249a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (p196u.AbstractC2212g.m4411o("WindowExtensionsProvider#getWindowExtensions is not valid", new p014C3.C0146c(3, c2022a)) && p196u.AbstractC2212g.m4411o("WindowExtensions#getWindowLayoutComponent is not valid", new p198u1.C2236d(this, 3)) && p196u.AbstractC2212g.m4411o("FoldingFeature class is not valid", new p198u1.C2236d(this, 0))) {
                int m4121a = p185r1.AbstractC2062e.m4121a();
                if (m4121a == 1) {
                    z4 = m4438b();
                } else if (2 <= m4121a && m4121a <= Integer.MAX_VALUE && m4438b()) {
                    if (p196u.AbstractC2212g.m4411o("WindowLayoutComponent#addWindowLayoutInfoListener(" + android.content.Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new p198u1.C2236d(this, 2))) {
                        z4 = true;
                    }
                }
            }
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
        }
        if (!z4) {
            return null;
        }
        try {
            return androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (java.lang.UnsupportedOperationException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean m4438b() {
        return p196u.AbstractC2212g.m4411o("WindowLayoutComponent#addWindowLayoutInfoListener(" + android.app.Activity.class.getName() + ", java.util.function.Consumer) is not valid", new p198u1.C2236d(this, 1));
    }
}
