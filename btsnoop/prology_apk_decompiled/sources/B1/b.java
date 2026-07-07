package B1;

import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ void A(ImageReader.Builder builder) {
        builder.setImageFormat(34);
    }

    public static /* bridge */ /* synthetic */ void C(ImageReader.Builder builder) {
        builder.setUsage(256L);
    }

    public static /* bridge */ /* synthetic */ SyncFence g(Image image) {
        return image.getFence();
    }

    public static /* synthetic */ ImageReader.Builder h(int i4, int i5) {
        return new ImageReader.Builder(i4, i5);
    }

    public static /* bridge */ /* synthetic */ ImageReader i(ImageReader.Builder builder) {
        return builder.build();
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ void q(SyncFence syncFence) {
        syncFence.awaitForever();
    }

    public static /* bridge */ /* synthetic */ void t(ImageReader.Builder builder) {
        builder.setMaxImages(7);
    }
}
