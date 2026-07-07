package U2;

import B2.SurfaceHolderCallbackC0010k;
import a0.C0118H;
import a0.InterfaceC0138s;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.plugin.platform.f;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceView f2523a;

    public a(Context context, InterfaceC0138s interfaceC0138s) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.f2523a = surfaceView;
        if (Build.VERSION.SDK_INT == 28) {
            surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC0010k(1, interfaceC0138s));
            return;
        }
        C0118H c0118h = (C0118H) interfaceC0138s;
        c0118h.U();
        SurfaceHolder holder = surfaceView.getHolder();
        c0118h.U();
        if (holder == null) {
            c0118h.U();
            c0118h.F();
            c0118h.M(null);
            c0118h.C(0, 0);
            return;
        }
        c0118h.F();
        c0118h.f3225R = true;
        c0118h.f3224Q = holder;
        holder.addCallback(c0118h.f3260v);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            c0118h.M(null);
            c0118h.C(0, 0);
        } else {
            c0118h.M(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            c0118h.C(surfaceFrame.width(), surfaceFrame.height());
        }
    }
}
