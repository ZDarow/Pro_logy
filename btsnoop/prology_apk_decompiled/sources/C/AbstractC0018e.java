package C;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import j.C0365u;
import java.util.concurrent.Executor;

/* renamed from: C.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0018e {
    public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor b(Context context) {
        return context.getMainExecutor();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String d(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params i(C0365u c0365u) {
        return c0365u.getTextMetricsParams();
    }

    public static int j(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri k(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void l(TextView textView, int i4) {
        textView.setFirstBaselineToTopHeight(i4);
    }

    public static void m(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
