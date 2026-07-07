package p009B2;

/* renamed from: B2.i */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0052i {
    /* renamed from: B */
    public static /* bridge */ /* synthetic */ android.graphics.Insets m163B(android.view.WindowInsets windowInsets) {
        return windowInsets.getSystemGestureInsets();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ android.graphics.Bitmap m166a(android.hardware.HardwareBuffer hardwareBuffer, android.graphics.ColorSpace colorSpace) {
        return android.graphics.Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ android.media.ImageReader m170e(int i4, int i5) {
        return android.media.ImageReader.newInstance(i4, i5, 1, 3, 768L);
    }

    /* renamed from: f */
    public static /* synthetic */ android.media.session.MediaSession m171f(com.ryanheise.audioservice.AudioService audioService) {
        return new android.media.session.MediaSession(audioService, "media-session", null);
    }

    /* renamed from: g */
    public static /* synthetic */ android.view.WindowInsets.Builder m172g() {
        return new android.view.WindowInsets.Builder();
    }

    /* renamed from: h */
    public static /* synthetic */ android.view.WindowInsets.Builder m173h(android.view.WindowInsets windowInsets) {
        return new android.view.WindowInsets.Builder(windowInsets);
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m184s() {
        return android.os.Environment.isExternalStorageLegacy();
    }

    /* renamed from: x */
    public static /* bridge */ /* synthetic */ android.media.ImageReader m189x(int i4, int i5) {
        return android.media.ImageReader.newInstance(i4, i5, 34, 7, 256L);
    }
}
