package p145j;

/* renamed from: j.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC1666j0 {

    /* renamed from: a */
    public static final java.lang.ThreadLocal f6952a = new java.lang.ThreadLocal();

    /* renamed from: b */
    public static final int[] f6953b = {-16842910};

    /* renamed from: c */
    public static final int[] f6954c = {android.R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f6955d = {android.R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f6956e = {android.R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f6957f = new int[0];

    /* renamed from: g */
    public static final int[] f6958g = new int[1];

    /* renamed from: a */
    public static void m3606a(android.view.View view, android.content.Context context) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(p121e.AbstractC1299a.f5192h);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                android.util.Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m3607b(android.content.Context context, int i4) {
        android.content.res.ColorStateList m3609d = m3609d(context, i4);
        if (m3609d != null && m3609d.isStateful()) {
            return m3609d.getColorForState(f6953b, m3609d.getDefaultColor());
        }
        java.lang.ThreadLocal threadLocal = f6952a;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        float f4 = typedValue.getFloat();
        int m3608c = m3608c(context, i4);
        int round = java.lang.Math.round(android.graphics.Color.alpha(m3608c) * f4);
        int i5 = p196u.AbstractC2206a.f8808a;
        if (round < 0 || round > 255) {
            throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (m3608c & 16777215) | (round << 24);
    }

    /* renamed from: c */
    public static int m3608c(android.content.Context context, int i4) {
        int[] iArr = f6958g;
        iArr[0] = i4;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static android.content.res.ColorStateList m3609d(android.content.Context context, int i4) {
        android.content.res.ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f6958g;
        iArr[0] = i4;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                java.lang.Object obj = p126f.AbstractC1367a.f5645a;
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
