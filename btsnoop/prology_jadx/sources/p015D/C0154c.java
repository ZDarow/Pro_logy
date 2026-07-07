package p015D;

/* renamed from: D.c */
/* loaded from: classes.dex */
public final class C0154c {

    /* renamed from: c */
    public static final p015D.C0154c f419c;

    /* renamed from: d */
    public static final p015D.C0154c f420d;

    /* renamed from: e */
    public static final p015D.C0154c f421e;

    /* renamed from: f */
    public static final p015D.C0154c f422f;

    /* renamed from: a */
    public final java.lang.Object f423a;

    /* renamed from: b */
    public final int f424b;

    static {
        new p015D.C0154c(null, 1, null);
        new p015D.C0154c(null, 2, null);
        new p015D.C0154c(null, 4, null);
        new p015D.C0154c(null, 8, null);
        new p015D.C0154c(null, 16, null);
        new p015D.C0154c(null, 32, null);
        new p015D.C0154c(null, 64, null);
        new p015D.C0154c(null, 128, null);
        new p015D.C0154c(null, 256, p015D.AbstractC0158g.class);
        new p015D.C0154c(null, 512, p015D.AbstractC0158g.class);
        new p015D.C0154c(null, 1024, p015D.AbstractC0159h.class);
        new p015D.C0154c(null, 2048, p015D.AbstractC0159h.class);
        f419c = new p015D.C0154c(null, 4096, null);
        f420d = new p015D.C0154c(null, 8192, null);
        new p015D.C0154c(null, 16384, null);
        new p015D.C0154c(null, 32768, null);
        new p015D.C0154c(null, 65536, null);
        new p015D.C0154c(null, 131072, p015D.AbstractC0163l.class);
        new p015D.C0154c(null, 262144, null);
        new p015D.C0154c(null, 524288, null);
        new p015D.C0154c(null, 1048576, null);
        new p015D.C0154c(null, 2097152, p015D.AbstractC0164m.class);
        int i4 = android.os.Build.VERSION.SDK_INT;
        new p015D.C0154c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, android.R.id.accessibilityActionShowOnScreen, null);
        new p015D.C0154c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, android.R.id.accessibilityActionScrollToPosition, p015D.AbstractC0161j.class);
        f421e = new p015D.C0154c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, android.R.id.accessibilityActionScrollUp, null);
        new p015D.C0154c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, android.R.id.accessibilityActionScrollLeft, null);
        f422f = new p015D.C0154c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, android.R.id.accessibilityActionScrollDown, null);
        new p015D.C0154c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, android.R.id.accessibilityActionScrollRight, null);
        new p015D.C0154c(i4 >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, android.R.id.accessibilityActionPageUp, null);
        new p015D.C0154c(i4 >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, android.R.id.accessibilityActionPageDown, null);
        new p015D.C0154c(i4 >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, android.R.id.accessibilityActionPageLeft, null);
        new p015D.C0154c(i4 >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, android.R.id.accessibilityActionPageRight, null);
        new p015D.C0154c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, android.R.id.accessibilityActionContextClick, null);
        new p015D.C0154c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, android.R.id.accessibilityActionSetProgress, p015D.AbstractC0162k.class);
        new p015D.C0154c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, android.R.id.accessibilityActionMoveWindow, p015D.AbstractC0160i.class);
        new p015D.C0154c(i4 >= 28 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, android.R.id.accessibilityActionShowTooltip, null);
        new p015D.C0154c(i4 >= 28 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, android.R.id.accessibilityActionHideTooltip, null);
        new p015D.C0154c(i4 >= 30 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, android.R.id.accessibilityActionPressAndHold, null);
        new p015D.C0154c(i4 >= 30 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, android.R.id.accessibilityActionImeEnter, null);
        new p015D.C0154c(i4 >= 32 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, android.R.id.ALT, null);
        new p015D.C0154c(i4 >= 32 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, android.R.id.CTRL, null);
        new p015D.C0154c(i4 >= 32 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, android.R.id.FUNCTION, null);
        new p015D.C0154c(i4 >= 33 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, android.R.id.KEYCODE_0, null);
        new p015D.C0154c(i4 >= 34 ? p011C.AbstractC0122n.m435a() : null, android.R.id.KEYCODE_3D_MODE, null);
    }

    public C0154c(java.lang.Object obj, int i4, java.lang.Class cls) {
        this.f424b = i4;
        if (obj == null) {
            this.f423a = new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i4, null);
        } else {
            this.f423a = obj;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof p015D.C0154c)) {
            return false;
        }
        java.lang.Object obj2 = ((p015D.C0154c) obj).f423a;
        java.lang.Object obj3 = this.f423a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f423a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccessibilityActionCompat: ");
        java.lang.String m520b = p015D.C0157f.m520b(this.f424b);
        if (m520b.equals("ACTION_UNKNOWN")) {
            java.lang.Object obj = this.f423a;
            if (((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                m520b = ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(m520b);
        return sb.toString();
    }
}
