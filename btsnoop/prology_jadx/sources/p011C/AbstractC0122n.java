package p011C;

/* renamed from: C.n */
/* loaded from: classes.dex */
public abstract class AbstractC0122n {
    /* renamed from: a */
    public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction m435a() {
        return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* renamed from: b */
    public static float m436b(android.view.VelocityTracker velocityTracker, int i4) {
        return velocityTracker.getAxisVelocity(i4);
    }

    /* renamed from: c */
    public static void m437c(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* renamed from: d */
    public static java.lang.CharSequence m438d(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* renamed from: e */
    public static int m439e(android.view.ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i4, i5, i6);
    }

    /* renamed from: f */
    public static int m440f(android.view.ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i4, i5, i6);
    }

    /* renamed from: g */
    public static boolean m441g(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }
}
