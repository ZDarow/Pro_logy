package io.flutter.plugin.platform;

import android.app.Activity;
import android.os.IBinder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class y implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6413a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6414b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6415c;

    public y(SurfaceView surfaceView, l lVar) {
        this.f6414b = surfaceView;
        this.f6415c = lVar;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f6413a) {
            case 0:
                x xVar = new x(0, this);
                SurfaceView surfaceView = (SurfaceView) this.f6414b;
                surfaceView.getViewTreeObserver().addOnDrawListener(new z(surfaceView, xVar));
                surfaceView.removeOnAttachStateChangeListener(this);
                return;
            default:
                k3.h.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f6415c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity == null || iBinder == null) {
                    return;
                }
                ((x1.h) this.f6414b).g(iBinder, activity);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f6413a) {
            case 0:
                return;
            default:
                k3.h.e(view, "view");
                return;
        }
    }

    public y(x1.h hVar, Activity activity) {
        k3.h.e(hVar, "sidecarCompat");
        this.f6414b = hVar;
        this.f6415c = new WeakReference(activity);
    }
}
