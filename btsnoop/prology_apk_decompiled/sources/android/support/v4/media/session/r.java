package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* loaded from: classes.dex */
public abstract class r {
    public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j4) {
        return new MediaSession.QueueItem(mediaDescription, j4);
    }

    public static MediaDescription b(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    public static long c(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
