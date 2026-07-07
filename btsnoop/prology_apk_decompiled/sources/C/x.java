package C;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.SwitchCompat;
import com.prology.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static Field f330a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f331b = false;

    static {
        new WeakHashMap();
    }

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return v.a(view);
        }
        if (f331b) {
            return null;
        }
        if (f330a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f330a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f331b = true;
                return null;
            }
        }
        try {
            Object obj = f330a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f331b = true;
            return null;
        }
    }

    public static CharSequence b(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = u.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            v.b(view, context, iArr, attributeSet, typedArray, i4, 0);
        }
    }

    public static void d(View view, C0015b c0015b) {
        if (c0015b == null && (a(view) instanceof C0014a)) {
            c0015b = new C0015b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0015b == null ? null : c0015b.f303b);
    }

    public static void e(SwitchCompat switchCompat, CharSequence charSequence) {
        Object tag;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            w.c(switchCompat, charSequence);
            return;
        }
        if (i4 >= 30) {
            tag = w.b(switchCompat);
        } else {
            tag = switchCompat.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        if (TextUtils.equals((CharSequence) tag, charSequence)) {
            return;
        }
        View.AccessibilityDelegate a4 = a(switchCompat);
        C0015b c0015b = a4 != null ? a4 instanceof C0014a ? ((C0014a) a4).f300a : new C0015b(a4) : null;
        if (c0015b == null) {
            c0015b = new C0015b();
        }
        d(switchCompat, c0015b);
        switchCompat.setTag(R.id.tag_state_description, charSequence);
        if (((AccessibilityManager) switchCompat.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z4 = b(switchCompat) != null && switchCompat.isShown() && switchCompat.getWindowVisibility() == 0;
            if (switchCompat.getAccessibilityLiveRegion() == 0 && !z4) {
                if (switchCompat.getParent() != null) {
                    try {
                        switchCompat.getParent().notifySubtreeAccessibilityStateChanged(switchCompat, switchCompat, 64);
                        return;
                    } catch (AbstractMethodError e4) {
                        Log.e("ViewCompat", switchCompat.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(z4 ? 32 : 2048);
            obtain.setContentChangeTypes(64);
            if (z4) {
                obtain.getText().add(b(switchCompat));
                if (switchCompat.getImportantForAccessibility() == 0) {
                    switchCompat.setImportantForAccessibility(1);
                }
            }
            switchCompat.sendAccessibilityEventUnchecked(obtain);
        }
    }
}
