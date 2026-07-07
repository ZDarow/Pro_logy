package android.support.v4.media;

/* renamed from: android.support.v4.media.g */
/* loaded from: classes.dex */
public abstract class AbstractC1039g {
    /* renamed from: a */
    public static android.net.Uri m2085a(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* renamed from: b */
    public static void m2086b(android.media.MediaDescription.Builder builder, android.net.Uri uri) {
        builder.setMediaUri(uri);
    }
}
