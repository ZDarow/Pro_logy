package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.u */
/* loaded from: classes.dex */
public abstract class AbstractC1062u {
    /* renamed from: a */
    public static void m2249a(android.media.session.PlaybackState.Builder builder, android.media.session.PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* renamed from: b */
    public static android.media.session.PlaybackState.CustomAction m2250b(android.media.session.PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* renamed from: c */
    public static android.media.session.PlaybackState m2251c(android.media.session.PlaybackState.Builder builder) {
        return builder.build();
    }

    /* renamed from: d */
    public static android.media.session.PlaybackState.Builder m2252d() {
        return new android.media.session.PlaybackState.Builder();
    }

    /* renamed from: e */
    public static android.media.session.PlaybackState.CustomAction.Builder m2253e(java.lang.String str, java.lang.CharSequence charSequence, int i4) {
        return new android.media.session.PlaybackState.CustomAction.Builder(str, charSequence, i4);
    }

    /* renamed from: f */
    public static java.lang.String m2254f(android.media.session.PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    /* renamed from: g */
    public static long m2255g(android.media.session.PlaybackState playbackState) {
        return playbackState.getActions();
    }

    /* renamed from: h */
    public static long m2256h(android.media.session.PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    /* renamed from: i */
    public static long m2257i(android.media.session.PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    /* renamed from: j */
    public static java.util.List<android.media.session.PlaybackState.CustomAction> m2258j(android.media.session.PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* renamed from: k */
    public static java.lang.CharSequence m2259k(android.media.session.PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    /* renamed from: l */
    public static android.os.Bundle m2260l(android.media.session.PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    /* renamed from: m */
    public static int m2261m(android.media.session.PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    /* renamed from: n */
    public static long m2262n(android.media.session.PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    /* renamed from: o */
    public static java.lang.CharSequence m2263o(android.media.session.PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    /* renamed from: p */
    public static float m2264p(android.media.session.PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    /* renamed from: q */
    public static long m2265q(android.media.session.PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* renamed from: r */
    public static int m2266r(android.media.session.PlaybackState playbackState) {
        return playbackState.getState();
    }

    /* renamed from: s */
    public static void m2267s(android.media.session.PlaybackState.Builder builder, long j4) {
        builder.setActions(j4);
    }

    /* renamed from: t */
    public static void m2268t(android.media.session.PlaybackState.Builder builder, long j4) {
        builder.setActiveQueueItemId(j4);
    }

    /* renamed from: u */
    public static void m2269u(android.media.session.PlaybackState.Builder builder, long j4) {
        builder.setBufferedPosition(j4);
    }

    /* renamed from: v */
    public static void m2270v(android.media.session.PlaybackState.Builder builder, java.lang.CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* renamed from: w */
    public static void m2271w(android.media.session.PlaybackState.CustomAction.Builder builder, android.os.Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* renamed from: x */
    public static void m2272x(android.media.session.PlaybackState.Builder builder, int i4, long j4, float f4, long j5) {
        builder.setState(i4, j4, f4, j5);
    }
}
