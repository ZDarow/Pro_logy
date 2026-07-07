package androidx.preference;

import a.AbstractC0110a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.prology.R;
import h1.AbstractC0317b;
import h1.InterfaceC0316a;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: l, reason: collision with root package name */
    public final Context f4227l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4228m;

    /* renamed from: n, reason: collision with root package name */
    public final CharSequence f4229n;

    /* renamed from: o, reason: collision with root package name */
    public final CharSequence f4230o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4231p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f4232q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0316a f4233r;

    public Preference(Context context, AttributeSet attributeSet, int i4) {
        this.f4228m = Integer.MAX_VALUE;
        this.f4227l = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0317b.f5991f, i4, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f4231p = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f4229n = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f4230o = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f4228m = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z4 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        AbstractC0110a.C(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z4));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z4));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f4232q = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f4232q = c(obtainStyledAttributes, 11);
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

    public CharSequence a() {
        InterfaceC0316a interfaceC0316a = this.f4233r;
        return interfaceC0316a != null ? interfaceC0316a.g(this) : this.f4230o;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i4) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i4 = preference2.f4228m;
        int i5 = this.f4228m;
        if (i5 != i4) {
            return i5 - i4;
        }
        CharSequence charSequence = preference2.f4229n;
        CharSequence charSequence2 = this.f4229n;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f4229n;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a4 = a();
        if (!TextUtils.isEmpty(a4)) {
            sb.append(a4);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0110a.A(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
