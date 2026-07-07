package B2;

import android.view.ViewTreeObserver;

/* renamed from: B2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0005f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f150l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0006g f151m;

    public ViewTreeObserverOnPreDrawListenerC0005f(C0006g c0006g, u uVar) {
        this.f151m = c0006g;
        this.f150l = uVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0006g c0006g = this.f151m;
        if (c0006g.f159h && c0006g.f157f != null) {
            this.f150l.getViewTreeObserver().removeOnPreDrawListener(this);
            c0006g.f157f = null;
        }
        return c0006g.f159h;
    }
}
