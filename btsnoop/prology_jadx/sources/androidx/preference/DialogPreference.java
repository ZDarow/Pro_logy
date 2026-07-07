package androidx.preference;

/* loaded from: classes.dex */
public abstract class DialogPreference extends androidx.preference.Preference {
    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p137h1.AbstractC1502b.f6207b, i4, 0);
        p101a.AbstractC0936a.m1765C(obtainStyledAttributes, 9, 0);
        p101a.AbstractC0936a.m1765C(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        p101a.AbstractC0936a.m1765C(obtainStyledAttributes, 11, 3);
        p101a.AbstractC0936a.m1765C(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p101a.AbstractC0936a.m1763A(context, com.prology.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
