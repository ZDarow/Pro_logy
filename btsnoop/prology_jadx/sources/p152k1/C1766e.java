package p152k1;

/* renamed from: k1.e */
/* loaded from: classes.dex */
public final class C1766e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ p152k1.C1767f f7241a;

    public C1766e(p152k1.C1767f c1767f) {
        this.f7241a = c1767f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int floatValue = (int) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        p152k1.C1767f c1767f = this.f7241a;
        c1767f.f7245b.setAlpha(floatValue);
        c1767f.f7246c.setAlpha(floatValue);
        c1767f.f7257n.invalidate();
    }
}
