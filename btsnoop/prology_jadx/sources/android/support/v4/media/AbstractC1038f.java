package android.support.v4.media;

/* renamed from: android.support.v4.media.f */
/* loaded from: classes.dex */
public abstract class AbstractC1038f {
    /* renamed from: a */
    public static android.media.MediaDescription m2069a(android.media.MediaDescription.Builder builder) {
        return builder.build();
    }

    /* renamed from: b */
    public static android.media.MediaDescription.Builder m2070b() {
        return new android.media.MediaDescription.Builder();
    }

    /* renamed from: c */
    public static java.lang.CharSequence m2071c(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* renamed from: d */
    public static android.os.Bundle m2072d(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    /* renamed from: e */
    public static android.graphics.Bitmap m2073e(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* renamed from: f */
    public static android.net.Uri m2074f(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* renamed from: g */
    public static java.lang.String m2075g(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* renamed from: h */
    public static java.lang.CharSequence m2076h(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* renamed from: i */
    public static java.lang.CharSequence m2077i(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    /* renamed from: j */
    public static void m2078j(android.media.MediaDescription.Builder builder, java.lang.CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* renamed from: k */
    public static void m2079k(android.media.MediaDescription.Builder builder, android.os.Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* renamed from: l */
    public static void m2080l(android.media.MediaDescription.Builder builder, android.graphics.Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* renamed from: m */
    public static void m2081m(android.media.MediaDescription.Builder builder, android.net.Uri uri) {
        builder.setIconUri(uri);
    }

    /* renamed from: n */
    public static void m2082n(android.media.MediaDescription.Builder builder, java.lang.String str) {
        builder.setMediaId(str);
    }

    /* renamed from: o */
    public static void m2083o(android.media.MediaDescription.Builder builder, java.lang.CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* renamed from: p */
    public static void m2084p(android.media.MediaDescription.Builder builder, java.lang.CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
