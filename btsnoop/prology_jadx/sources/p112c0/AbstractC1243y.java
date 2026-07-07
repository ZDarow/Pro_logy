package p112c0;

/* renamed from: c0.y */
/* loaded from: classes.dex */
public abstract class AbstractC1243y {
    /* JADX WARN: Type inference failed for: r4v1, types: [c0.k, java.lang.Object] */
    /* renamed from: a */
    public static p112c0.C1230l m2921a(android.media.AudioFormat audioFormat, android.media.AudioAttributes audioAttributes, boolean z4) {
        int playbackOffloadSupport;
        playbackOffloadSupport = android.media.AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return p112c0.C1230l.f4791d;
        }
        ?? obj = new java.lang.Object();
        boolean z5 = p086W.AbstractC0805y.f2801a > 32 && playbackOffloadSupport == 2;
        obj.f4788a = true;
        obj.f4789b = z5;
        obj.f4790c = z4;
        return obj.m2911a();
    }
}
