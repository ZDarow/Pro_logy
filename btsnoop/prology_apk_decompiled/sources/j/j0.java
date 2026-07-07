package j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import e.AbstractC0248a;
import f.AbstractC0266a;
import u.AbstractC0573a;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6694a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6695b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f6696c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f6697d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f6698e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f6699f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f6700g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0248a.f5005h);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i4) {
        ColorStateList d4 = d(context, i4);
        if (d4 != null && d4.isStateful()) {
            return d4.getColorForState(f6695b, d4.getDefaultColor());
        }
        ThreadLocal threadLocal = f6694a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f4 = typedValue.getFloat();
        int c4 = c(context, i4);
        int round = Math.round(Color.alpha(c4) * f4);
        int i5 = AbstractC0573a.f8470a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (c4 & 16777215) | (round << 24);
    }

    public static int c(Context context, int i4) {
        int[] iArr = f6700g;
        iArr[0] = i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i4) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f6700g;
        iArr[0] = i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                Object obj = AbstractC0266a.f5451a;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
