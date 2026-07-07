package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: k1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6975a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0384f f6976b;

    public C0382d(C0384f c0384f) {
        this.f6976b = c0384f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f6975a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f6975a) {
            this.f6975a = false;
            return;
        }
        C0384f c0384f = this.f6976b;
        if (((Float) c0384f.f6999u.getAnimatedValue()).floatValue() == 0.0f) {
            c0384f.f7000v = 0;
            c0384f.e(0);
        } else {
            c0384f.f7000v = 2;
            c0384f.f6993n.invalidate();
        }
    }
}
