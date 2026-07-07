package c0;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class y {
    /* JADX WARN: Type inference failed for: r4v1, types: [c0.k, java.lang.Object] */
    public static C0213l a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z4) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C0213l.f4625d;
        }
        ?? obj = new Object();
        boolean z5 = W.y.f2709a > 32 && playbackOffloadSupport == 2;
        obj.f4622a = true;
        obj.f4623b = z5;
        obj.f4624c = z4;
        return obj.a();
    }
}
