package androidx.preference;

/* loaded from: classes.dex */
public class SeekBarPreference extends androidx.preference.Preference {

    /* renamed from: s */
    public final int f4385s;

    /* renamed from: t */
    public final int f4386t;

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.prology.R.attr.seekBarPreferenceStyle);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p137h1.AbstractC1502b.f6214i, com.prology.R.attr.seekBarPreferenceStyle, 0);
        int i4 = obtainStyledAttributes.getInt(3, 0);
        int i5 = obtainStyledAttributes.getInt(1, 100);
        i5 = i5 < i4 ? i4 : i5;
        if (i5 != this.f4385s) {
            this.f4385s = i5;
        }
        int i6 = obtainStyledAttributes.getInt(4, 0);
        if (i6 != this.f4386t) {
            this.f4386t = java.lang.Math.min(this.f4385s - i4, java.lang.Math.abs(i6));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public final java.lang.Object mo2677c(android.content.res.TypedArray typedArray, int i4) {
        return java.lang.Integer.valueOf(typedArray.getInt(i4, 0));
    }
}
