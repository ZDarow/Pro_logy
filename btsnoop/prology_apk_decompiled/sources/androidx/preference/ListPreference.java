package androidx.preference;

import F1.g;
import a.AbstractC0110a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.prology.R;
import h1.AbstractC0317b;
import h1.InterfaceC0316a;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4226t;

    /* JADX WARN: Type inference failed for: r2v9, types: [F1.g, java.lang.Object] */
    public ListPreference(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0317b.f5989d, i4, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.s = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (g.f600m == null) {
                g.f600m = new Object();
            }
            this.f4233r = g.f600m;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0317b.f5991f, i4, 0);
        this.f4226t = AbstractC0110a.C(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        InterfaceC0316a interfaceC0316a = this.f4233r;
        if (interfaceC0316a != null) {
            return interfaceC0316a.g(this);
        }
        CharSequence a4 = super.a();
        String str = this.f4226t;
        if (str == null) {
            return a4;
        }
        String format = String.format(str, "");
        if (TextUtils.equals(format, a4)) {
            return a4;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0110a.A(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
