package j0;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class q {
    public static void a(h hVar, b0.l lVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        b0.k kVar = lVar.f4393b;
        kVar.getClass();
        LogSessionId logSessionId2 = kVar.f4391a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = hVar.f6828b;
        stringId = logSessionId2.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
