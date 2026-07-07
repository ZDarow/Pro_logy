package p082V;

/* renamed from: V.d */
/* loaded from: classes.dex */
public abstract class AbstractC0759d {

    /* renamed from: a */
    public static final java.lang.String f2672a;

    /* renamed from: b */
    public static final java.lang.String f2673b;

    /* renamed from: c */
    public static final java.lang.String f2674c;

    /* renamed from: d */
    public static final java.lang.String f2675d;

    /* renamed from: e */
    public static final java.lang.String f2676e;

    static {
        int i4 = p086W.AbstractC0805y.f2801a;
        f2672a = java.lang.Integer.toString(0, 36);
        f2673b = java.lang.Integer.toString(1, 36);
        f2674c = java.lang.Integer.toString(2, 36);
        f2675d = java.lang.Integer.toString(3, 36);
        f2676e = java.lang.Integer.toString(4, 36);
    }

    /* renamed from: a */
    public static android.os.Bundle m1397a(android.text.Spanned spanned, java.lang.Object obj, int i4, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt(f2672a, spanned.getSpanStart(obj));
        bundle2.putInt(f2673b, spanned.getSpanEnd(obj));
        bundle2.putInt(f2674c, spanned.getSpanFlags(obj));
        bundle2.putInt(f2675d, i4);
        if (bundle != null) {
            bundle2.putBundle(f2676e, bundle);
        }
        return bundle2;
    }
}
