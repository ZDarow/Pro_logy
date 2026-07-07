package V;

import W.y;
import android.os.Bundle;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2581a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f2582b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f2583c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f2584d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f2585e;

    static {
        int i4 = y.f2709a;
        f2581a = Integer.toString(0, 36);
        f2582b = Integer.toString(1, 36);
        f2583c = Integer.toString(2, 36);
        f2584d = Integer.toString(3, 36);
        f2585e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i4, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f2581a, spanned.getSpanStart(obj));
        bundle2.putInt(f2582b, spanned.getSpanEnd(obj));
        bundle2.putInt(f2583c, spanned.getSpanFlags(obj));
        bundle2.putInt(f2584d, i4);
        if (bundle != null) {
            bundle2.putBundle(f2585e, bundle);
        }
        return bundle2;
    }
}
