package C;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: C.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0030q {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i4 = y.f332a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static void b(View view) {
        view.requestApplyInsets();
    }
}
