package p024F;

/* renamed from: F.e */
/* loaded from: classes.dex */
public abstract class AbstractC0202e {
    /* renamed from: a */
    public static android.widget.EdgeEffect m562a(android.content.Context context, android.util.AttributeSet attributeSet) {
        try {
            return new android.widget.EdgeEffect(context, attributeSet);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    /* renamed from: b */
    public static float m563b(android.widget.EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: c */
    public static float m564c(android.widget.EdgeEffect edgeEffect, float f4, float f5) {
        try {
            return edgeEffect.onPullDistance(f4, f5);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f4, f5);
            return 0.0f;
        }
    }
}
