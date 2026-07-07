package androidx.preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends androidx.preference.Preference {
    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public final java.lang.Object mo2677c(android.content.res.TypedArray typedArray, int i4) {
        return java.lang.Boolean.valueOf(typedArray.getBoolean(i4, false));
    }
}
