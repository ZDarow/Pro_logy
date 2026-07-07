package p102a0;

/* renamed from: a0.C */
/* loaded from: classes.dex */
public abstract class AbstractC0939C {
    /* renamed from: a */
    public static p107b0.C1177l m1820a(android.content.Context context, p102a0.C0944H c0944h, boolean z4, java.lang.String str) {
        android.media.metrics.PlaybackSession createPlaybackSession;
        p107b0.C1175j c1175j;
        android.media.metrics.LogSessionId sessionId;
        android.media.metrics.LogSessionId logSessionId;
        android.media.metrics.MediaMetricsManager m2757b = p107b0.AbstractC1173h.m2757b(context.getSystemService("media_metrics"));
        if (m2757b == null) {
            c1175j = null;
        } else {
            createPlaybackSession = m2757b.createPlaybackSession();
            c1175j = new p107b0.C1175j(context, createPlaybackSession);
        }
        if (c1175j == null) {
            p086W.AbstractC0781a.m1410A("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE;
            return new p107b0.C1177l(logSessionId, str);
        }
        if (z4) {
            c0944h.getClass();
            p107b0.C1170e c1170e = c0944h.f3370r;
            c1170e.getClass();
            c1170e.f4502q.m1440a(c1175j);
        }
        sessionId = c1175j.f4525c.getSessionId();
        return new p107b0.C1177l(sessionId, str);
    }
}
