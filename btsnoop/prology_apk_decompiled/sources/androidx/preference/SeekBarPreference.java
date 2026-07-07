package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.prology.R;
import h1.AbstractC0317b;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4234t;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0317b.f5994i, R.attr.seekBarPreferenceStyle, 0);
        int i4 = obtainStyledAttributes.getInt(3, 0);
        int i5 = obtainStyledAttributes.getInt(1, 100);
        i5 = i5 < i4 ? i4 : i5;
        if (i5 != this.s) {
            this.s = i5;
        }
        int i6 = obtainStyledAttributes.getInt(4, 0);
        if (i6 != this.f4234t) {
            this.f4234t = Math.min(this.s - i4, Math.abs(i6));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i4) {
        return Integer.valueOf(typedArray.getInt(i4, 0));
    }
}
