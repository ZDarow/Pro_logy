package c0;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class x {
    /* JADX WARN: Type inference failed for: r0v2, types: [c0.k, java.lang.Object] */
    public static C0213l a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z4) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return C0213l.f4625d;
        }
        ?? obj = new Object();
        obj.f4622a = true;
        obj.f4624c = z4;
        return obj.a();
    }
}
