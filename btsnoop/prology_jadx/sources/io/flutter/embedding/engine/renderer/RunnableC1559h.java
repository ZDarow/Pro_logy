package io.flutter.embedding.engine.renderer;

/* renamed from: io.flutter.embedding.engine.renderer.h */
/* loaded from: classes.dex */
public final class RunnableC1559h implements java.lang.Runnable {

    /* renamed from: l */
    public final long f6458l;

    /* renamed from: m */
    public final io.flutter.embedding.engine.FlutterJNI f6459m;

    public RunnableC1559h(long j4, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.f6458l = j4;
        this.f6459m = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.embedding.engine.FlutterJNI flutterJNI = this.f6459m;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f6458l);
        }
    }
}
