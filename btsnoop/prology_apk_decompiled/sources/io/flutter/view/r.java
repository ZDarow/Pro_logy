package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static r f6547e;

    /* renamed from: f, reason: collision with root package name */
    public static p f6548f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f6550b;

    /* renamed from: a, reason: collision with root package name */
    public long f6549a = -1;

    /* renamed from: c, reason: collision with root package name */
    public q f6551c = new q(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final a f6552d = new a(this);

    public r(FlutterJNI flutterJNI) {
        this.f6550b = flutterJNI;
    }

    public static r a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f6547e == null) {
            f6547e = new r(flutterJNI);
        }
        if (f6548f == null) {
            r rVar = f6547e;
            Objects.requireNonNull(rVar);
            p pVar = new p(rVar, displayManager, 0);
            f6548f = pVar;
            displayManager.registerDisplayListener(pVar, null);
        }
        if (f6547e.f6549a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f6547e.f6549a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f6547e;
    }
}
