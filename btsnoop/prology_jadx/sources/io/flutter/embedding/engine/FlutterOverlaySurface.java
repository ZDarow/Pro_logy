package io.flutter.embedding.engine;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class FlutterOverlaySurface {

    /* renamed from: id */
    private final int f6437id;
    private final android.view.Surface surface;

    public FlutterOverlaySurface(int i4, android.view.Surface surface) {
        this.f6437id = i4;
        this.surface = surface;
    }

    public int getId() {
        return this.f6437id;
    }

    public android.view.Surface getSurface() {
        return this.surface;
    }
}
