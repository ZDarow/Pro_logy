package androidx.preference;

/* loaded from: classes.dex */
public class Preference implements java.lang.Comparable<androidx.preference.Preference> {

    /* renamed from: l */
    public final android.content.Context f4378l;

    /* renamed from: m */
    public final int f4379m;

    /* renamed from: n */
    public final java.lang.CharSequence f4380n;

    /* renamed from: o */
    public final java.lang.CharSequence f4381o;

    /* renamed from: p */
    public final java.lang.String f4382p;

    /* renamed from: q */
    public final java.lang.Object f4383q;

    /* renamed from: r */
    public p137h1.InterfaceC1501a f4384r;

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i4) {
        this.f4379m = Integer.MAX_VALUE;
        this.f4378l = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p137h1.AbstractC1502b.f6211f, i4, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        java.lang.String string = obtainStyledAttributes.getString(26);
        this.f4382p = string == null ? obtainStyledAttributes.getString(6) : string;
        java.lang.CharSequence text = obtainStyledAttributes.getText(34);
        this.f4380n = text == null ? obtainStyledAttributes.getText(4) : text;
        java.lang.CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f4381o = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f4379m = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, com.prology.R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z4 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        p101a.AbstractC0936a.m1765C(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z4));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z4));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f4383q = mo2677c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f4383q = mo2677c(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public java.lang.CharSequence mo2678a() {
        p137h1.InterfaceC1501a interfaceC1501a = this.f4384r;
        return interfaceC1501a != null ? interfaceC1501a.mo593g(this) : this.f4381o;
    }

    /* renamed from: b */
    public void mo2676b() {
    }

    /* renamed from: c */
    public java.lang.Object mo2677c(android.content.res.TypedArray typedArray, int i4) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(androidx.preference.Preference preference) {
        androidx.preference.Preference preference2 = preference;
        int i4 = preference2.f4379m;
        int i5 = this.f4379m;
        if (i5 != i4) {
            return i5 - i4;
        }
        java.lang.CharSequence charSequence = preference2.f4380n;
        java.lang.CharSequence charSequence2 = this.f4380n;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.CharSequence charSequence = this.f4380n;
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        java.lang.CharSequence mo2678a = mo2678a();
        if (!android.text.TextUtils.isEmpty(mo2678a)) {
            sb.append(mo2678a);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p101a.AbstractC0936a.m1763A(context, com.prology.R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
