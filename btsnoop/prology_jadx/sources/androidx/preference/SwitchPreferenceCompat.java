package androidx.preference;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends androidx.preference.TwoStatePreference {
    public SwitchPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.prology.R.attr.switchPreferenceCompatStyle);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p137h1.AbstractC1502b.f6216k, com.prology.R.attr.switchPreferenceCompatStyle, 0);
        p101a.AbstractC0936a.m1765C(obtainStyledAttributes, 7, 0);
        if (obtainStyledAttributes.getString(6) == null) {
            obtainStyledAttributes.getString(1);
        }
        if (obtainStyledAttributes.getString(9) == null) {
            obtainStyledAttributes.getString(3);
        }
        if (obtainStyledAttributes.getString(8) == null) {
            obtainStyledAttributes.getString(4);
        }
        obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
