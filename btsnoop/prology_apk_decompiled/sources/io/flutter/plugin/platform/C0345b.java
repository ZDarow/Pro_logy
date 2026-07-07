package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

/* renamed from: io.flutter.plugin.platform.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345b implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f6328a;

    public C0345b(c cVar) {
        this.f6328a = cVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        try {
            image = imageReader.acquireLatestImage();
        } catch (IllegalStateException e4) {
            Log.e("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e4);
            image = null;
        }
        if (image == null) {
            return;
        }
        ((TextureRegistry$ImageTextureEntry) this.f6328a.f6331n).pushImage(image);
    }
}
