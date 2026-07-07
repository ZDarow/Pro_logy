package p011C;

/* renamed from: C.b */
/* loaded from: classes.dex */
public class C0110b {

    /* renamed from: c */
    public static final android.view.View.AccessibilityDelegate f307c = new android.view.View.AccessibilityDelegate();

    /* renamed from: a */
    public final android.view.View.AccessibilityDelegate f308a;

    /* renamed from: b */
    public final p011C.C0109a f309b;

    public C0110b() {
        this(f307c);
    }

    /* renamed from: a */
    public void mo400a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f308a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo401b(android.view.View view, p015D.C0157f c0157f) {
        this.f308a.onInitializeAccessibilityNodeInfo(view, c0157f.f425a);
    }

    /* renamed from: c */
    public boolean mo402c(android.view.View view, int i4, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference;
        android.text.style.ClickableSpan clickableSpan;
        java.util.List list = (java.util.List) view.getTag(com.prology.R.id.tag_accessibility_actions);
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        boolean z4 = false;
        for (int i5 = 0; i5 < list.size() && ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) ((p015D.C0154c) list.get(i5)).f423a).getId() != i4; i5++) {
        }
        boolean performAccessibilityAction = this.f308a.performAccessibilityAction(view, i4, bundle);
        if (performAccessibilityAction || i4 != com.prology.R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.prology.R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (android.text.style.ClickableSpan) weakReference.get()) != null) {
            java.lang.CharSequence text = view.createAccessibilityNodeInfo().getText();
            android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
            int i7 = 0;
            while (true) {
                if (clickableSpanArr == null || i7 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
                i7++;
            }
        }
        return z4;
    }

    public C0110b(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.f308a = accessibilityDelegate;
        this.f309b = new p011C.C0109a(this);
    }
}
