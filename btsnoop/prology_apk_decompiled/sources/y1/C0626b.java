package y1;

import C.O;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import k3.h;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0626b f9143a = new Object();

    public final O a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        h.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        h.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return O.c(null, windowInsets);
    }
}
