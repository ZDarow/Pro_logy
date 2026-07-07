package p146j0;

/* renamed from: j0.q */
/* loaded from: classes.dex */
public abstract class AbstractC1713q {
    /* renamed from: a */
    public static void m3684a(p146j0.C1704h c1704h, p107b0.C1177l c1177l) {
        android.media.metrics.LogSessionId logSessionId;
        boolean equals;
        java.lang.String stringId;
        p107b0.C1176k c1176k = c1177l.f4552b;
        c1176k.getClass();
        android.media.metrics.LogSessionId logSessionId2 = c1176k.f4550a;
        logSessionId = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        android.media.MediaFormat mediaFormat = c1704h.f7088b;
        stringId = logSessionId2.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
