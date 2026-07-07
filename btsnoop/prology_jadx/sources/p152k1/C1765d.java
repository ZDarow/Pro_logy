package p152k1;

/* renamed from: k1.d */
/* loaded from: classes.dex */
public final class C1765d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f7239a = false;

    /* renamed from: b */
    public final /* synthetic */ p152k1.C1767f f7240b;

    public C1765d(p152k1.C1767f c1767f) {
        this.f7240b = c1767f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.f7239a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.f7239a) {
            this.f7239a = false;
            return;
        }
        p152k1.C1767f c1767f = this.f7240b;
        if (((java.lang.Float) c1767f.f7264u.getAnimatedValue()).floatValue() == 0.0f) {
            c1767f.f7265v = 0;
            c1767f.m3727e(0);
        } else {
            c1767f.f7265v = 2;
            c1767f.f7257n.invalidate();
        }
    }
}
