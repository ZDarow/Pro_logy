package C;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.prology.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0015b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f301c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f302a;

    /* renamed from: b, reason: collision with root package name */
    public final C0014a f303b;

    public C0015b() {
        this(f301c);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f302a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, D.f fVar) {
        this.f302a.onInitializeAccessibilityNodeInfo(view, fVar.f417a);
    }

    public boolean c(View view, int i4, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z4 = false;
        for (int i5 = 0; i5 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((D.c) list.get(i5)).f415a).getId() != i4; i5++) {
        }
        boolean performAccessibilityAction = this.f302a.performAccessibilityAction(view, i4, bundle);
        if (performAccessibilityAction || i4 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
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

    public C0015b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f302a = accessibilityDelegate;
        this.f303b = new C0014a(this);
    }
}
