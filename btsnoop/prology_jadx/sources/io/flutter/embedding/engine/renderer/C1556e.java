package io.flutter.embedding.engine.renderer;

/* renamed from: io.flutter.embedding.engine.renderer.e */
/* loaded from: classes.dex */
public final class C1556e {

    /* renamed from: a */
    public final android.media.ImageReader f6448a;

    /* renamed from: b */
    public final java.util.ArrayDeque f6449b = new java.util.ArrayDeque();

    /* renamed from: c */
    public boolean f6450c = false;

    /* renamed from: d */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer f6451d;

    public C1556e(io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, android.media.ImageReader imageReader) {
        this.f6451d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f6448a = imageReader;
        imageReader.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.d
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(android.media.ImageReader imageReader2) {
                android.media.Image image;
                boolean z4;
                io.flutter.embedding.engine.renderer.C1556e c1556e = io.flutter.embedding.engine.renderer.C1556e.this;
                c1556e.getClass();
                try {
                    image = imageReader2.acquireLatestImage();
                } catch (java.lang.IllegalStateException e4) {
                    android.util.Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e4);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = c1556e.f6451d;
                z4 = flutterRenderer$ImageReaderSurfaceProducer2.released;
                if (z4 || c1556e.f6450c) {
                    image.close();
                } else {
                    flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, image);
                }
            }
        }, new android.os.Handler(android.os.Looper.getMainLooper()));
    }
}
