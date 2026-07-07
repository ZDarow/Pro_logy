package C;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class r {
    public static O a(View view, O o2, Rect rect) {
        WindowInsets b4 = o2.b();
        if (b4 != null) {
            return O.c(view, view.computeSystemWindowInsets(b4, rect));
        }
        rect.setEmpty();
        return o2;
    }

    public static ColorStateList b(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode c(View view) {
        return view.getBackgroundTintMode();
    }

    public static void d(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void e(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void f(View view) {
        view.stopNestedScroll();
    }
}
