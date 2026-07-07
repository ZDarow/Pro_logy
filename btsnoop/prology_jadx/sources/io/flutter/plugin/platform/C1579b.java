package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.b */
/* loaded from: classes.dex */
public final class C1579b implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ io.flutter.plugin.platform.C1580c f6563a;

    public C1579b(io.flutter.plugin.platform.C1580c c1580c) {
        this.f6563a = c1580c;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        android.media.Image image;
        try {
            image = imageReader.acquireLatestImage();
        } catch (java.lang.IllegalStateException e4) {
            android.util.Log.e("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e4);
            image = null;
        }
        if (image == null) {
            return;
        }
        ((io.flutter.view.TextureRegistry$ImageTextureEntry) this.f6563a.f6566n).pushImage(image);
    }
}
