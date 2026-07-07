package p198u1;

/* renamed from: u1.d */
/* loaded from: classes.dex */
public final class C2236d extends p154k3.AbstractC1804i implements p149j3.InterfaceC1726a {

    /* renamed from: m */
    public final /* synthetic */ int f8918m;

    /* renamed from: n */
    public final /* synthetic */ p198u1.C2237e f8919n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2236d(p198u1.C2237e c2237e, int i4) {
        super(0);
        this.f8918m = i4;
        this.f8919n = c2237e;
    }

    @Override // p149j3.InterfaceC1726a
    /* renamed from: c */
    public final java.lang.Object mo501c() {
        boolean z4;
        java.lang.Class cls;
        boolean z5;
        boolean z6;
        switch (this.f8918m) {
            case 0:
                java.lang.Class<?> loadClass = this.f8919n.f8920a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                p154k3.AbstractC1803h.m3778d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                java.lang.reflect.Method method = loadClass.getMethod("getBounds", null);
                java.lang.reflect.Method method2 = loadClass.getMethod("getType", null);
                java.lang.reflect.Method method3 = loadClass.getMethod("getState", null);
                p154k3.AbstractC1803h.m3778d(method, "getBoundsMethod");
                if (p196u.AbstractC2212g.m4409g(method, p154k3.AbstractC1812q.m3788a(android.graphics.Rect.class)) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                    p154k3.AbstractC1803h.m3778d(method2, "getTypeMethod");
                    java.lang.Class cls2 = java.lang.Integer.TYPE;
                    if (p196u.AbstractC2212g.m4409g(method2, p154k3.AbstractC1812q.m3788a(cls2)) && java.lang.reflect.Modifier.isPublic(method2.getModifiers())) {
                        p154k3.AbstractC1803h.m3778d(method3, "getStateMethod");
                        if (p196u.AbstractC2212g.m4409g(method3, p154k3.AbstractC1812q.m3788a(cls2)) && java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                            z4 = true;
                            return java.lang.Boolean.valueOf(z4);
                        }
                    }
                }
                z4 = false;
                return java.lang.Boolean.valueOf(z4);
            case 1:
                p198u1.C2237e c2237e = this.f8919n;
                try {
                    cls = c2237e.f8921b.m4071b();
                } catch (java.lang.ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return java.lang.Boolean.FALSE;
                }
                java.lang.Class<?> loadClass2 = c2237e.f8920a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                p154k3.AbstractC1803h.m3778d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                java.lang.reflect.Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", android.app.Activity.class, cls);
                java.lang.reflect.Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                p154k3.AbstractC1803h.m3778d(method4, "addListenerMethod");
                if (java.lang.reflect.Modifier.isPublic(method4.getModifiers())) {
                    p154k3.AbstractC1803h.m3778d(method5, "removeListenerMethod");
                    if (java.lang.reflect.Modifier.isPublic(method5.getModifiers())) {
                        z5 = true;
                        return java.lang.Boolean.valueOf(z5);
                    }
                }
                z5 = false;
                return java.lang.Boolean.valueOf(z5);
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Class<?> loadClass3 = this.f8919n.f8920a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                p154k3.AbstractC1803h.m3778d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                java.lang.reflect.Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", android.content.Context.class, androidx.window.extensions.core.util.function.Consumer.class);
                java.lang.reflect.Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", androidx.window.extensions.core.util.function.Consumer.class);
                p154k3.AbstractC1803h.m3778d(method6, "addListenerMethod");
                if (java.lang.reflect.Modifier.isPublic(method6.getModifiers())) {
                    p154k3.AbstractC1803h.m3778d(method7, "removeListenerMethod");
                    if (java.lang.reflect.Modifier.isPublic(method7.getModifiers())) {
                        z6 = true;
                        return java.lang.Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return java.lang.Boolean.valueOf(z6);
            default:
                p198u1.C2237e c2237e2 = this.f8919n;
                java.lang.Class<?> loadClass4 = c2237e2.f8922c.f8249a.loadClass("androidx.window.extensions.WindowExtensions");
                p154k3.AbstractC1803h.m3778d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                java.lang.reflect.Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                java.lang.Class<?> loadClass5 = c2237e2.f8920a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                p154k3.AbstractC1803h.m3778d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                p154k3.AbstractC1803h.m3778d(method8, "getWindowLayoutComponentMethod");
                return java.lang.Boolean.valueOf(java.lang.reflect.Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
