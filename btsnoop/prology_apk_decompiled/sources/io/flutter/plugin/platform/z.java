package io.flutter.plugin.platform;

import android.view.SurfaceView;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class z implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceView f6416a;

    /* renamed from: b, reason: collision with root package name */
    public x f6417b;

    public z(SurfaceView surfaceView, x xVar) {
        this.f6416a = surfaceView;
        this.f6417b = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        x xVar = this.f6417b;
        if (xVar == null) {
            return;
        }
        xVar.run();
        this.f6417b = null;
        this.f6416a.post(new x(1, this));
    }
}
