package p152k1;

/* renamed from: k1.m */
/* loaded from: classes.dex */
public final class InterpolatorC1774m implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f4) {
        float f5 = f4 - 1.0f;
        return (f5 * f5 * f5 * f5 * f5) + 1.0f;
    }
}
