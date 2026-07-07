package i;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0323d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0330k f6016b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0323d(AbstractC0330k abstractC0330k, int i4) {
        this.f6015a = i4;
        this.f6016b = abstractC0330k;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i4 = this.f6015a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f6015a) {
            case 0:
                ViewOnKeyListenerC0325f viewOnKeyListenerC0325f = (ViewOnKeyListenerC0325f) this.f6016b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0325f.f6028I;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0325f.f6028I = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0325f.f6028I.removeGlobalOnLayoutListener(viewOnKeyListenerC0325f.f6036t);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ViewOnKeyListenerC0337r viewOnKeyListenerC0337r = (ViewOnKeyListenerC0337r) this.f6016b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0337r.f6123z;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0337r.f6123z = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0337r.f6123z.removeGlobalOnLayoutListener(viewOnKeyListenerC0337r.f6118t);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
