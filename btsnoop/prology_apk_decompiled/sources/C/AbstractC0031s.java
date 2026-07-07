package C;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: C.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0031s {
    public static O a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        O c4 = O.c(null, rootWindowInsets);
        K k4 = c4.f296a;
        k4.p(c4);
        k4.d(view.getRootView());
        return c4;
    }
}
