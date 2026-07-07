package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final long f6225l;

    /* renamed from: m, reason: collision with root package name */
    public final FlutterJNI f6226m;

    public h(long j4, FlutterJNI flutterJNI) {
        this.f6225l = j4;
        this.f6226m = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f6226m;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f6225l);
        }
    }
}
