package k1;

import android.animation.ValueAnimator;

/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0384f f6977a;

    public C0383e(C0384f c0384f) {
        this.f6977a = c0384f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0384f c0384f = this.f6977a;
        c0384f.f6981b.setAlpha(floatValue);
        c0384f.f6982c.setAlpha(floatValue);
        c0384f.f6993n.invalidate();
    }
}
