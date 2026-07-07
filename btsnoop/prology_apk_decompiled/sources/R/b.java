package R;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public abstract class b {
    @SuppressLint({"MissingPermission"})
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i4, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i4, pendingIntent);
        }
        return mediaStyle;
    }
}
