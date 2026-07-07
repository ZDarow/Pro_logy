package p011C;

/* renamed from: C.r */
/* loaded from: classes.dex */
public abstract class AbstractC0126r {
    /* renamed from: a */
    public static p011C.C0105O m444a(android.view.View view, p011C.C0105O c0105o, android.graphics.Rect rect) {
        android.view.WindowInsets m397b = c0105o.m397b();
        if (m397b != null) {
            return p011C.C0105O.m396c(view, view.computeSystemWindowInsets(m397b, rect));
        }
        rect.setEmpty();
        return c0105o;
    }

    /* renamed from: b */
    public static android.content.res.ColorStateList m445b(android.view.View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: c */
    public static android.graphics.PorterDuff.Mode m446c(android.view.View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: d */
    public static void m447d(android.view.View view, android.content.res.ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: e */
    public static void m448e(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: f */
    public static void m449f(android.view.View view) {
        view.stopNestedScroll();
    }
}
