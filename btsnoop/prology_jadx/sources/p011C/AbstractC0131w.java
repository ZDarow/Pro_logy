package p011C;

/* renamed from: C.w */
/* loaded from: classes.dex */
public abstract class AbstractC0131w {
    /* renamed from: a */
    public static android.view.WindowInsets m458a(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    public static java.lang.CharSequence m459b(android.view.View view) {
        return view.getStateDescription();
    }

    /* renamed from: c */
    public static void m460c(android.view.View view, java.lang.CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
