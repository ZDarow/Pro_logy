package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.v */
/* loaded from: classes.dex */
public abstract class AbstractC1063v {
    /* renamed from: a */
    public static android.os.Bundle m2273a(android.media.session.PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    /* renamed from: b */
    public static void m2274b(android.media.session.PlaybackState.Builder builder, android.os.Bundle bundle) {
        builder.setExtras(bundle);
    }
}
