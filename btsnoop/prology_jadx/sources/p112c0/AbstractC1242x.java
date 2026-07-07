package p112c0;

/* renamed from: c0.x */
/* loaded from: classes.dex */
public abstract class AbstractC1242x {
    /* JADX WARN: Type inference failed for: r0v2, types: [c0.k, java.lang.Object] */
    /* renamed from: a */
    public static p112c0.C1230l m2920a(android.media.AudioFormat audioFormat, android.media.AudioAttributes audioAttributes, boolean z4) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = android.media.AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return p112c0.C1230l.f4791d;
        }
        ?? obj = new java.lang.Object();
        obj.f4788a = true;
        obj.f4790c = z4;
        return obj.m2911a();
    }
}
