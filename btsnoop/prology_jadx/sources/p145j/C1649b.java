package p145j;

/* renamed from: j.b */
/* loaded from: classes.dex */
public final class C1649b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f6894a;

    public C1649b(androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f6894a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f6894a;
        actionBarOverlayLayout.f3919E = null;
        actionBarOverlayLayout.f3933u = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f6894a;
        actionBarOverlayLayout.f3919E = null;
        actionBarOverlayLayout.f3933u = false;
    }
}
