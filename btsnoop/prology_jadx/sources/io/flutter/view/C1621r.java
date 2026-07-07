package io.flutter.view;

/* renamed from: io.flutter.view.r */
/* loaded from: classes.dex */
public final class C1621r {

    /* renamed from: e */
    public static io.flutter.view.C1621r f6794e;

    /* renamed from: f */
    public static io.flutter.view.C1619p f6795f;

    /* renamed from: b */
    public final io.flutter.embedding.engine.FlutterJNI f6797b;

    /* renamed from: a */
    public long f6796a = -1;

    /* renamed from: c */
    public io.flutter.view.ChoreographerFrameCallbackC1620q f6798c = new io.flutter.view.ChoreographerFrameCallbackC1620q(this, 0);

    /* renamed from: d */
    public final io.flutter.view.C1604a f6799d = new io.flutter.view.C1604a(this);

    public C1621r(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.f6797b = flutterJNI;
    }

    /* renamed from: a */
    public static io.flutter.view.C1621r m3575a(android.hardware.display.DisplayManager displayManager, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        if (f6794e == null) {
            f6794e = new io.flutter.view.C1621r(flutterJNI);
        }
        if (f6795f == null) {
            io.flutter.view.C1621r c1621r = f6794e;
            java.util.Objects.requireNonNull(c1621r);
            io.flutter.view.C1619p c1619p = new io.flutter.view.C1619p(c1621r, displayManager, 0);
            f6795f = c1619p;
            displayManager.registerDisplayListener(c1619p, null);
        }
        if (f6794e.f6796a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f6794e.f6796a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f6794e;
    }
}
