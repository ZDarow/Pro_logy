package p140i;

/* renamed from: i.d */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1512d implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f6235a;

    /* renamed from: b */
    public final /* synthetic */ p140i.AbstractC1519k f6236b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1512d(p140i.AbstractC1519k abstractC1519k, int i4) {
        this.f6235a = i4;
        this.f6236b = abstractC1519k;
    }

    /* renamed from: a */
    private final void m3338a(android.view.View view) {
    }

    /* renamed from: b */
    private final void m3339b(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        int i4 = this.f6235a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        switch (this.f6235a) {
            case 0:
                p140i.ViewOnKeyListenerC1514f viewOnKeyListenerC1514f = (p140i.ViewOnKeyListenerC1514f) this.f6236b;
                android.view.ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1514f.f6248I;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1514f.f6248I = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1514f.f6248I.removeGlobalOnLayoutListener(viewOnKeyListenerC1514f.f6258t);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                p140i.ViewOnKeyListenerC1526r viewOnKeyListenerC1526r = (p140i.ViewOnKeyListenerC1526r) this.f6236b;
                android.view.ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1526r.f6351z;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1526r.f6351z = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1526r.f6351z.removeGlobalOnLayoutListener(viewOnKeyListenerC1526r.f6345t);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
