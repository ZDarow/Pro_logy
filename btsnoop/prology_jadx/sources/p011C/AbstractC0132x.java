package p011C;

/* renamed from: C.x */
/* loaded from: classes.dex */
public abstract class AbstractC0132x {

    /* renamed from: a */
    public static java.lang.reflect.Field f336a = null;

    /* renamed from: b */
    public static boolean f337b = false;

    static {
        new java.util.WeakHashMap();
    }

    /* renamed from: a */
    public static android.view.View.AccessibilityDelegate m461a(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return p011C.AbstractC0130v.m456a(view);
        }
        if (f337b) {
            return null;
        }
        if (f336a == null) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                f336a = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.Throwable unused) {
                f337b = true;
                return null;
            }
        }
        try {
            java.lang.Object obj = f336a.get(view);
            if (obj instanceof android.view.View.AccessibilityDelegate) {
                return (android.view.View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (java.lang.Throwable unused2) {
            f337b = true;
            return null;
        }
    }

    /* renamed from: b */
    public static java.lang.CharSequence m462b(android.view.View view) {
        java.lang.Object tag;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            tag = p011C.AbstractC0129u.m453a(view);
        } else {
            tag = view.getTag(com.prology.R.id.tag_accessibility_pane_title);
            if (!java.lang.CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (java.lang.CharSequence) tag;
    }

    /* renamed from: c */
    public static void m463c(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            p011C.AbstractC0130v.m457b(view, context, iArr, attributeSet, typedArray, i4, 0);
        }
    }

    /* renamed from: d */
    public static void m464d(android.view.View view, p011C.C0110b c0110b) {
        if (c0110b == null && (m461a(view) instanceof p011C.C0109a)) {
            c0110b = new p011C.C0110b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0110b == null ? null : c0110b.f309b);
    }

    /* renamed from: e */
    public static void m465e(androidx.appcompat.widget.SwitchCompat switchCompat, java.lang.CharSequence charSequence) {
        java.lang.Object tag;
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            p011C.AbstractC0131w.m460c(switchCompat, charSequence);
            return;
        }
        if (i4 >= 30) {
            tag = p011C.AbstractC0131w.m459b(switchCompat);
        } else {
            tag = switchCompat.getTag(com.prology.R.id.tag_state_description);
            if (!java.lang.CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        if (android.text.TextUtils.equals((java.lang.CharSequence) tag, charSequence)) {
            return;
        }
        android.view.View.AccessibilityDelegate m461a = m461a(switchCompat);
        p011C.C0110b c0110b = m461a != null ? m461a instanceof p011C.C0109a ? ((p011C.C0109a) m461a).f306a : new p011C.C0110b(m461a) : null;
        if (c0110b == null) {
            c0110b = new p011C.C0110b();
        }
        m464d(switchCompat, c0110b);
        switchCompat.setTag(com.prology.R.id.tag_state_description, charSequence);
        if (((android.view.accessibility.AccessibilityManager) switchCompat.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z4 = m462b(switchCompat) != null && switchCompat.isShown() && switchCompat.getWindowVisibility() == 0;
            if (switchCompat.getAccessibilityLiveRegion() == 0 && !z4) {
                if (switchCompat.getParent() != null) {
                    try {
                        switchCompat.getParent().notifySubtreeAccessibilityStateChanged(switchCompat, switchCompat, 64);
                        return;
                    } catch (java.lang.AbstractMethodError e4) {
                        android.util.Log.e("ViewCompat", switchCompat.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
                        return;
                    }
                }
                return;
            }
            android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
            obtain.setEventType(z4 ? 32 : 2048);
            obtain.setContentChangeTypes(64);
            if (z4) {
                obtain.getText().add(m462b(switchCompat));
                if (switchCompat.getImportantForAccessibility() == 0) {
                    switchCompat.setImportantForAccessibility(1);
                }
            }
            switchCompat.sendAccessibilityEventUnchecked(obtain);
        }
    }
}
