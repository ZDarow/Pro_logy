package androidx.preference;

/* loaded from: classes.dex */
public class ListPreference extends androidx.preference.DialogPreference {

    /* renamed from: s */
    public final java.lang.CharSequence[] f4376s;

    /* renamed from: t */
    public final java.lang.String f4377t;

    /* JADX WARN: Type inference failed for: r2v9, types: [F1.g, java.lang.Object] */
    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p137h1.AbstractC1502b.f6209d, i4, 0);
        java.lang.CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f4376s = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (p025F1.C0215g.f610m == null) {
                p025F1.C0215g.f610m = new java.lang.Object();
            }
            this.f4384r = p025F1.C0215g.f610m;
            mo2676b();
        }
        obtainStyledAttributes.recycle();
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p137h1.AbstractC1502b.f6211f, i4, 0);
        this.f4377t = p101a.AbstractC0936a.m1765C(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: a */
    public final java.lang.CharSequence mo2678a() {
        p137h1.InterfaceC1501a interfaceC1501a = this.f4384r;
        if (interfaceC1501a != null) {
            return interfaceC1501a.mo593g(this);
        }
        java.lang.CharSequence mo2678a = super.mo2678a();
        java.lang.String str = this.f4377t;
        if (str == null) {
            return mo2678a;
        }
        java.lang.String format = java.lang.String.format(str, "");
        if (android.text.TextUtils.equals(format, mo2678a)) {
            return mo2678a;
        }
        android.util.Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public final java.lang.Object mo2677c(android.content.res.TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p101a.AbstractC0936a.m1763A(context, com.prology.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
