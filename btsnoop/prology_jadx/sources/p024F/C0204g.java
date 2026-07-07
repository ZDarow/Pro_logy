package p024F;

/* renamed from: F.g */
/* loaded from: classes.dex */
public final class C0204g extends p011C.C0110b {
    @Override // p011C.C0110b
    /* renamed from: a */
    public final void mo400a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo400a(view, accessibilityEvent);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        accessibilityEvent.setClassName(android.widget.ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // p011C.C0110b
    /* renamed from: b */
    public final void mo401b(android.view.View view, p015D.C0157f c0157f) {
        int scrollRange;
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f308a;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = c0157f.f425a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        accessibilityNodeInfo.setClassName("android.widget.ScrollView");
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            accessibilityNodeInfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) p015D.C0154c.f420d.f423a);
            accessibilityNodeInfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) p015D.C0154c.f421e.f423a);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            accessibilityNodeInfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) p015D.C0154c.f419c.f423a);
            accessibilityNodeInfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) p015D.C0154c.f422f.f423a);
        }
    }

    @Override // p011C.C0110b
    /* renamed from: c */
    public final boolean mo402c(android.view.View view, int i4, android.os.Bundle bundle) {
        if (super.mo402c(view, i4, bundle)) {
            return true;
        }
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i4 != 4096) {
            if (i4 == 8192 || i4 == 16908344) {
                int max = java.lang.Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m2348t(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            }
            if (i4 != 16908346) {
                return false;
            }
        }
        int min = java.lang.Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.m2348t(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }
}
