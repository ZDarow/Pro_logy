package p009B2;

/* renamed from: B2.f */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0049f implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: l */
    public final /* synthetic */ p009B2.C0064u f153l;

    /* renamed from: m */
    public final /* synthetic */ p009B2.C0050g f154m;

    public ViewTreeObserverOnPreDrawListenerC0049f(p009B2.C0050g c0050g, p009B2.C0064u c0064u) {
        this.f154m = c0050g;
        this.f153l = c0064u;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        p009B2.C0050g c0050g = this.f154m;
        if (c0050g.f162h && c0050g.f160f != null) {
            this.f153l.getViewTreeObserver().removeOnPreDrawListener(this);
            c0050g.f160f = null;
        }
        return c0050g.f162h;
    }
}
