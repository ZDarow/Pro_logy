package p112c0;

/* renamed from: c0.B */
/* loaded from: classes.dex */
public abstract class AbstractC1203B {
    /* renamed from: a */
    public static void m2840a(android.media.AudioTrack audioTrack, p107b0.C1177l c1177l) {
        android.media.metrics.LogSessionId logSessionId;
        boolean equals;
        p107b0.C1176k c1176k = c1177l.f4552b;
        c1176k.getClass();
        android.media.metrics.LogSessionId logSessionId2 = c1176k.f4550a;
        logSessionId = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId2);
    }
}
