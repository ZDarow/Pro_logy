package p068R;

/* renamed from: R.a */
/* loaded from: classes.dex */
public abstract class AbstractC0568a {
    /* renamed from: a */
    public static android.app.Notification.MediaStyle m1086a() {
        return new android.app.Notification.MediaStyle();
    }

    /* renamed from: b */
    public static android.app.Notification.MediaStyle m1087b(android.app.Notification.MediaStyle mediaStyle, int[] iArr, android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            m1090e(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            m1088c(mediaStyle, (android.media.session.MediaSession.Token) mediaSessionCompat$Token.f3800m);
        }
        return mediaStyle;
    }

    /* renamed from: c */
    public static void m1088c(android.app.Notification.MediaStyle mediaStyle, android.media.session.MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* renamed from: d */
    public static void m1089d(android.app.Notification.Builder builder, android.app.Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* renamed from: e */
    public static void m1090e(android.app.Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
