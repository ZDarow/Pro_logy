package p030G2;

/* renamed from: G2.a */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC0239a implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f695a = 0;

    /* renamed from: b */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f696b;

    /* renamed from: c */
    public final /* synthetic */ android.widget.FrameLayout f697c;

    public ViewTreeObserverOnGlobalFocusChangeListenerC0239a(android.view.View.OnFocusChangeListener onFocusChangeListener, p030G2.C0240b c0240b) {
        this.f696b = onFocusChangeListener;
        this.f697c = c0240b;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
        switch (this.f695a) {
            case 0:
                p030G2.C0240b c0240b = (p030G2.C0240b) this.f697c;
                this.f696b.onFocusChange(c0240b, p101a.AbstractC0936a.m1787Y(c0240b, new p011C.C0111c(13)));
                return;
            default:
                p011C.C0111c c0111c = new p011C.C0111c(13);
                io.flutter.plugin.platform.C1585h c1585h = (io.flutter.plugin.platform.C1585h) this.f697c;
                this.f696b.onFocusChange(c1585h, p101a.AbstractC0936a.m1787Y(c1585h, c0111c));
                return;
        }
    }

    public ViewTreeObserverOnGlobalFocusChangeListenerC0239a(io.flutter.plugin.platform.C1585h c1585h, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f697c = c1585h;
        this.f696b = onFocusChangeListener;
    }
}
