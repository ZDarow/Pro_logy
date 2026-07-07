package androidx.preference;

import a.AbstractC0110a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.prology.R;
import h1.AbstractC0317b;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0317b.f5987b, i4, 0);
        AbstractC0110a.C(obtainStyledAttributes, 9, 0);
        AbstractC0110a.C(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        AbstractC0110a.C(obtainStyledAttributes, 11, 3);
        AbstractC0110a.C(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0110a.A(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
