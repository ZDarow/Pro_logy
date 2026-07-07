package p207w1;

/* renamed from: w1.e */
/* loaded from: classes.dex */
public abstract class AbstractC2333e {
    /* renamed from: a */
    public static p198u1.C2235c m4529a(p198u1.C2243k c2243k, androidx.window.extensions.layout.FoldingFeature foldingFeature) {
        p198u1.C2234b c2234b;
        p198u1.C2234b c2234b2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c2234b = p198u1.C2234b.f8911r;
        } else {
            if (type != 2) {
                return null;
            }
            c2234b = p198u1.C2234b.f8912s;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c2234b2 = p198u1.C2234b.f8909p;
        } else {
            if (state != 2) {
                return null;
            }
            c2234b2 = p198u1.C2234b.f8910q;
        }
        android.graphics.Rect bounds = foldingFeature.getBounds();
        p154k3.AbstractC1803h.m3778d(bounds, "oemFeature.bounds");
        p185r1.C2059b c2059b = new p185r1.C2059b(bounds);
        android.graphics.Rect m4120c = c2243k.f8933a.m4120c();
        if (c2059b.m4118a() == 0 && c2059b.m4119b() == 0) {
            return null;
        }
        if (c2059b.m4119b() != m4120c.width() && c2059b.m4118a() != m4120c.height()) {
            return null;
        }
        if (c2059b.m4119b() < m4120c.width() && c2059b.m4118a() < m4120c.height()) {
            return null;
        }
        if (c2059b.m4119b() == m4120c.width() && c2059b.m4118a() == m4120c.height()) {
            return null;
        }
        android.graphics.Rect bounds2 = foldingFeature.getBounds();
        p154k3.AbstractC1803h.m3778d(bounds2, "oemFeature.bounds");
        return new p198u1.C2235c(new p185r1.C2059b(bounds2), c2234b, c2234b2);
    }

    /* renamed from: b */
    public static p198u1.C2242j m4530b(android.content.Context context, androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        p198u1.C2243k c2243k;
        android.view.WindowMetrics currentWindowMetrics;
        android.view.WindowInsets windowInsets;
        android.view.WindowMetrics currentWindowMetrics2;
        android.graphics.Rect bounds;
        p154k3.AbstractC1803h.m3779e(windowLayoutInfo, "info");
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 < 30) {
            if (i4 < 29 || !(context instanceof android.app.Activity)) {
                throw new java.lang.UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i5 = p198u1.C2245m.f8936b;
            return m4531c(p198u1.C2245m.m4440a((android.app.Activity) context), windowLayoutInfo);
        }
        int i6 = p198u1.C2245m.f8936b;
        if (i4 < 30) {
            android.content.Context context2 = context;
            while (context2 instanceof android.content.ContextWrapper) {
                boolean z4 = context2 instanceof android.app.Activity;
                if (!z4 && !(context2 instanceof android.inputmethodservice.InputMethodService)) {
                    android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        p154k3.AbstractC1803h.m3778d(context2, "iterator.baseContext");
                    }
                }
                if (z4) {
                    c2243k = p198u1.C2245m.m4440a((android.app.Activity) context);
                } else {
                    if (!(context2 instanceof android.inputmethodservice.InputMethodService)) {
                        throw new java.lang.IllegalArgumentException(context + " is not a UiContext");
                    }
                    java.lang.Object systemService = context.getSystemService("window");
                    p154k3.AbstractC1803h.m3777c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
                    p154k3.AbstractC1803h.m3778d(defaultDisplay, "wm.defaultDisplay");
                    android.graphics.Point point = new android.graphics.Point();
                    defaultDisplay.getRealSize(point);
                    android.graphics.Rect rect = new android.graphics.Rect(0, 0, point.x, point.y);
                    int i7 = android.os.Build.VERSION.SDK_INT;
                    p011C.C0105O mo354b = (i7 >= 34 ? new p011C.C0093C() : i7 >= 30 ? new p011C.C0092B() : i7 >= 29 ? new p011C.C0091A() : new p011C.C0134z()).mo354b();
                    p154k3.AbstractC1803h.m3778d(mo354b, "Builder().build()");
                    c2243k = new p198u1.C2243k(rect, mo354b);
                }
            }
            throw new java.lang.IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService(android.view.WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        p011C.C0105O m396c = p011C.C0105O.m396c(null, windowInsets);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        p154k3.AbstractC1803h.m3778d(bounds, "wm.currentWindowMetrics.bounds");
        c2243k = new p198u1.C2243k(bounds, m396c);
        return m4531c(c2243k, windowLayoutInfo);
    }

    /* renamed from: c */
    public static p198u1.C2242j m4531c(p198u1.C2243k c2243k, androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        p198u1.C2235c c2235c;
        p154k3.AbstractC1803h.m3779e(windowLayoutInfo, "info");
        java.util.List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        p154k3.AbstractC1803h.m3778d(displayFeatures, "info.displayFeatures");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof androidx.window.extensions.layout.FoldingFeature) {
                p154k3.AbstractC1803h.m3778d(foldingFeature, "feature");
                c2235c = m4529a(c2243k, foldingFeature);
            } else {
                c2235c = null;
            }
            if (c2235c != null) {
                arrayList.add(c2235c);
            }
        }
        return new p198u1.C2242j(arrayList);
    }
}
