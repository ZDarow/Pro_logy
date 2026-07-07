package androidx.preference;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends androidx.preference.Preference {
    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        new android.os.Handler(android.os.Looper.getMainLooper());
        new java.util.ArrayList();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p137h1.AbstractC1502b.f6212g, i4, 0);
        obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1) && obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE)) != Integer.MAX_VALUE && android.text.TextUtils.isEmpty(this.f4382p)) {
            android.util.Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
        }
        obtainStyledAttributes.recycle();
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
