package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ImageReader f6215a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f6216b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f6217c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f6218d;

    public e(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.f6218d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f6215a = imageReader;
        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.d
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                Image image;
                boolean z4;
                e eVar = e.this;
                eVar.getClass();
                try {
                    image = imageReader2.acquireLatestImage();
                } catch (IllegalStateException e4) {
                    Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e4);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = eVar.f6218d;
                z4 = flutterRenderer$ImageReaderSurfaceProducer2.released;
                if (z4 || eVar.f6217c) {
                    image.close();
                } else {
                    flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, image);
                }
            }
        }, new Handler(Looper.getMainLooper()));
    }
}
