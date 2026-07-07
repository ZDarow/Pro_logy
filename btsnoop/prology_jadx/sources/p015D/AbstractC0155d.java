package p015D;

/* renamed from: D.d */
/* loaded from: classes.dex */
public abstract class AbstractC0155d {
    /* renamed from: a */
    public static android.graphics.drawable.Icon m514a(android.net.Uri uri) {
        return android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    /* renamed from: b */
    public static java.lang.CharSequence m515b(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: c */
    public static void m516c(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    /* renamed from: d */
    public static void m517d(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
