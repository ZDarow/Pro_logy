package W0;

import android.text.Layout;
import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final d f2761c = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public final V.b f2762a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2763b;

    public e(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f4, int i4, float f5, int i5, boolean z4, int i6, int i7) {
        boolean z5;
        int i8;
        if (z4) {
            i8 = i6;
            z5 = true;
        } else {
            z5 = false;
            i8 = -16777216;
        }
        this.f2762a = new V.b(spannableStringBuilder, alignment, null, null, f4, 0, i4, f5, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z5, i8, Integer.MIN_VALUE, 0.0f);
        this.f2763b = i7;
    }
}
