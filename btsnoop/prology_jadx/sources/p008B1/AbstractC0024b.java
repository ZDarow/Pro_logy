package p008B1;

/* renamed from: B1.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0024b {
    /* renamed from: A */
    public static /* bridge */ /* synthetic */ void m68A(android.media.ImageReader.Builder builder) {
        builder.setImageFormat(34);
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ void m70C(android.media.ImageReader.Builder builder) {
        builder.setUsage(256L);
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ android.hardware.SyncFence m78g(android.media.Image image) {
        return image.getFence();
    }

    /* renamed from: h */
    public static /* synthetic */ android.media.ImageReader.Builder m79h(int i4, int i5) {
        return new android.media.ImageReader.Builder(i4, i5);
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ android.media.ImageReader m80i(android.media.ImageReader.Builder builder) {
        return builder.build();
    }

    /* renamed from: p */
    public static /* synthetic */ void m87p() {
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m88q(android.hardware.SyncFence syncFence) {
        syncFence.awaitForever();
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ void m91t(android.media.ImageReader.Builder builder) {
        builder.setMaxImages(7);
    }
}
