package p011C;

/* renamed from: C.a */
/* loaded from: classes.dex */
public final class C0109a extends android.view.View.AccessibilityDelegate {

    /* renamed from: a */
    public final p011C.C0110b f306a;

    public C0109a(p011C.C0110b c0110b) {
        this.f306a = c0110b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f306a.f308a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = this.f306a.f308a.getAccessibilityNodeProvider(view);
        p009B2.C0061r c0061r = accessibilityNodeProvider != null ? new p009B2.C0061r(4, accessibilityNodeProvider) : null;
        if (c0061r != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) c0061r.f188m;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f306a.mo400a(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.Object tag;
        java.lang.Object obj;
        p015D.C0157f c0157f = new p015D.C0157f(accessibilityNodeInfo);
        java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
        int i4 = android.os.Build.VERSION.SDK_INT;
        java.lang.Object obj2 = null;
        if (i4 >= 28) {
            tag = java.lang.Boolean.valueOf(p011C.AbstractC0129u.m455c(view));
        } else {
            tag = view.getTag(com.prology.R.id.tag_screen_reader_focusable);
            if (!java.lang.Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) tag;
        boolean z4 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        if (i4 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z4);
        } else {
            android.os.Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z4 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (i4 >= 28) {
            obj = java.lang.Boolean.valueOf(p011C.AbstractC0129u.m454b(view));
        } else {
            java.lang.Object tag2 = view.getTag(com.prology.R.id.tag_accessibility_heading);
            obj = java.lang.Boolean.class.isInstance(tag2) ? tag2 : null;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj;
        boolean z5 = bool2 != null && bool2.booleanValue();
        if (i4 >= 28) {
            accessibilityNodeInfo.setHeading(z5);
        } else {
            android.os.Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z5 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        java.lang.CharSequence m462b = p011C.AbstractC0132x.m462b(view);
        if (i4 >= 28) {
            accessibilityNodeInfo.setPaneTitle(m462b);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", m462b);
        }
        if (i4 >= 30) {
            obj2 = p011C.AbstractC0131w.m459b(view);
        } else {
            java.lang.Object tag3 = view.getTag(com.prology.R.id.tag_state_description);
            if (java.lang.CharSequence.class.isInstance(tag3)) {
                obj2 = tag3;
            }
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) obj2;
        if (i4 >= 30) {
            p015D.AbstractC0155d.m517d(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f306a.mo401b(view, c0157f);
        accessibilityNodeInfo.getText();
        java.util.List list = (java.util.List) view.getTag(com.prology.R.id.tag_accessibility_actions);
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            c0157f.f425a.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) ((p015D.C0154c) list.get(i5)).f423a);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f306a.f308a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f306a.f308a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i4, android.os.Bundle bundle) {
        return this.f306a.mo402c(view, i4, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View view, int i4) {
        this.f306a.f308a.sendAccessibilityEvent(view, i4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f306a.f308a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
