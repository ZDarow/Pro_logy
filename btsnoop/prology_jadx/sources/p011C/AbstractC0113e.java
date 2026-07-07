package p011C;

/* renamed from: C.e */
/* loaded from: classes.dex */
public abstract class AbstractC0113e {
    /* renamed from: a */
    public static java.lang.String[] m404a(android.icu.text.DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: b */
    public static java.util.concurrent.Executor m405b(android.content.Context context) {
        return context.getMainExecutor();
    }

    /* renamed from: c */
    public static int m406c(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getResId();
    }

    /* renamed from: d */
    public static java.lang.String m407d(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getResPackage();
    }

    /* renamed from: e */
    public static int m408e(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: f */
    public static int m409f(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: g */
    public static int m410g(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: h */
    public static int m411h(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* renamed from: i */
    public static android.text.PrecomputedText.Params m412i(p145j.C1687u c1687u) {
        return c1687u.getTextMetricsParams();
    }

    /* renamed from: j */
    public static int m413j(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getType();
    }

    /* renamed from: k */
    public static android.net.Uri m414k(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getUri();
    }

    /* renamed from: l */
    public static void m415l(android.widget.TextView textView, int i4) {
        textView.setFirstBaselineToTopHeight(i4);
    }

    /* renamed from: m */
    public static void m416m(android.app.Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    /* renamed from: n */
    public static boolean m417n(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
