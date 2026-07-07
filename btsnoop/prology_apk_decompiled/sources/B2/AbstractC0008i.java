package B2;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Insets;
import android.hardware.HardwareBuffer;
import android.media.ImageReader;
import android.media.session.MediaSession;
import android.os.Environment;
import android.view.WindowInsets;
import com.ryanheise.audioservice.AudioService;

/* renamed from: B2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0008i {
    public static /* bridge */ /* synthetic */ Insets B(WindowInsets windowInsets) {
        return windowInsets.getSystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ Bitmap a(HardwareBuffer hardwareBuffer, ColorSpace colorSpace) {
        return Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
    }

    public static /* bridge */ /* synthetic */ ImageReader e(int i4, int i5) {
        return ImageReader.newInstance(i4, i5, 1, 3, 768L);
    }

    public static /* synthetic */ MediaSession f(AudioService audioService) {
        return new MediaSession(audioService, "media-session", null);
    }

    public static /* synthetic */ WindowInsets.Builder g() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ boolean s() {
        return Environment.isExternalStorageLegacy();
    }

    public static /* bridge */ /* synthetic */ ImageReader x(int i4, int i5) {
        return ImageReader.newInstance(i4, i5, 34, 7, 256L);
    }
}
