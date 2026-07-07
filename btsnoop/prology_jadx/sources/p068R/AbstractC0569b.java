package p068R;

/* renamed from: R.b */
/* loaded from: classes.dex */
public abstract class AbstractC0569b {
    @android.annotation.SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static android.app.Notification.MediaStyle m1091a(android.app.Notification.MediaStyle mediaStyle, java.lang.CharSequence charSequence, int i4, android.app.PendingIntent pendingIntent, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i4, pendingIntent);
        }
        return mediaStyle;
    }
}
