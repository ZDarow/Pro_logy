package c0;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class B {
    public static void a(AudioTrack audioTrack, b0.l lVar) {
        LogSessionId logSessionId;
        boolean equals;
        b0.k kVar = lVar.f4393b;
        kVar.getClass();
        LogSessionId logSessionId2 = kVar.f4391a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId2);
    }
}
