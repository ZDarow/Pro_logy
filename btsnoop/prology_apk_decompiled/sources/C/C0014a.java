package C;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.prology.R;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* renamed from: C.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0015b f300a;

    public C0014a(C0015b c0015b) {
        this.f300a = c0015b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f300a.f302a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f300a.f302a.getAccessibilityNodeProvider(view);
        B2.r rVar = accessibilityNodeProvider != null ? new B2.r(4, accessibilityNodeProvider) : null;
        if (rVar != null) {
            return (AccessibilityNodeProvider) rVar.f185m;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f300a.a(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object obj;
        D.f fVar = new D.f(accessibilityNodeInfo);
        Field field = x.f330a;
        int i4 = Build.VERSION.SDK_INT;
        Object obj2 = null;
        if (i4 >= 28) {
            tag = Boolean.valueOf(u.c(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z4 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        if (i4 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z4);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z4 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (i4 >= 28) {
            obj = Boolean.valueOf(u.b(view));
        } else {
            Object tag2 = view.getTag(R.id.tag_accessibility_heading);
            obj = Boolean.class.isInstance(tag2) ? tag2 : null;
        }
        Boolean bool2 = (Boolean) obj;
        boolean z5 = bool2 != null && bool2.booleanValue();
        if (i4 >= 28) {
            accessibilityNodeInfo.setHeading(z5);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z5 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        CharSequence b4 = x.b(view);
        if (i4 >= 28) {
            accessibilityNodeInfo.setPaneTitle(b4);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", b4);
        }
        if (i4 >= 30) {
            obj2 = w.b(view);
        } else {
            Object tag3 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag3)) {
                obj2 = tag3;
            }
        }
        CharSequence charSequence = (CharSequence) obj2;
        if (i4 >= 30) {
            D.d.d(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f300a.b(view, fVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            fVar.f417a.addAction((AccessibilityNodeInfo.AccessibilityAction) ((D.c) list.get(i5)).f415a);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f300a.f302a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f300a.f302a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
        return this.f300a.c(view, i4, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i4) {
        this.f300a.f302a.sendAccessibilityEvent(view, i4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f300a.f302a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
