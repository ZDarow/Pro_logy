package io.flutter.plugin.editing;

import android.view.Surface;
import android.view.SurfaceControl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Surface e(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder f() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction g() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction i(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }

    public static /* synthetic */ void k() {
    }
}
