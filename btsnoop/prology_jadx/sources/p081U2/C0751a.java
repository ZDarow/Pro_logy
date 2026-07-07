package p081U2;

/* renamed from: U2.a */
/* loaded from: classes.dex */
public final class C0751a implements io.flutter.plugin.platform.InterfaceC1583f {

    /* renamed from: a */
    public final android.view.SurfaceView f2611a;

    public C0751a(android.content.Context context, p102a0.InterfaceC0994s interfaceC0994s) {
        android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
        this.f2611a = surfaceView;
        if (android.os.Build.VERSION.SDK_INT == 28) {
            surfaceView.getHolder().addCallback(new p009B2.SurfaceHolderCallbackC0054k(1, interfaceC0994s));
            return;
        }
        p102a0.C0944H c0944h = (p102a0.C0944H) interfaceC0994s;
        c0944h.m1848U();
        android.view.SurfaceHolder holder = surfaceView.getHolder();
        c0944h.m1848U();
        if (holder == null) {
            c0944h.m1848U();
            c0944h.m1833F();
            c0944h.m1840M(null);
            c0944h.m1830C(0, 0);
            return;
        }
        c0944h.m1833F();
        c0944h.f3338R = true;
        c0944h.f3337Q = holder;
        holder.addCallback(c0944h.f3374v);
        android.view.Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            c0944h.m1840M(null);
            c0944h.m1830C(0, 0);
        } else {
            c0944h.m1840M(surface);
            android.graphics.Rect surfaceFrame = holder.getSurfaceFrame();
            c0944h.m1830C(surfaceFrame.width(), surfaceFrame.height());
        }
    }
}
