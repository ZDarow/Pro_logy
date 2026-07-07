package a0;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;

/* renamed from: a0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0113C {
    public static b0.l a(Context context, C0118H c0118h, boolean z4, String str) {
        PlaybackSession createPlaybackSession;
        b0.j jVar;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager b4 = b0.h.b(context.getSystemService("media_metrics"));
        if (b4 == null) {
            jVar = null;
        } else {
            createPlaybackSession = b4.createPlaybackSession();
            jVar = new b0.j(context, createPlaybackSession);
        }
        if (jVar == null) {
            W.a.A("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new b0.l(logSessionId, str);
        }
        if (z4) {
            c0118h.getClass();
            b0.e eVar = c0118h.f3257r;
            eVar.getClass();
            eVar.f4346q.a(jVar);
        }
        sessionId = jVar.f4368c.getSessionId();
        return new b0.l(sessionId, str);
    }
}
