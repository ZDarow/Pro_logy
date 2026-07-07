package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.r */
/* loaded from: classes.dex */
public abstract class AbstractC1059r {
    /* renamed from: a */
    public static android.media.session.MediaSession.QueueItem m2194a(android.media.MediaDescription mediaDescription, long j4) {
        return new android.media.session.MediaSession.QueueItem(mediaDescription, j4);
    }

    /* renamed from: b */
    public static android.media.MediaDescription m2195b(android.media.session.MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    /* renamed from: c */
    public static long m2196c(android.media.session.MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
