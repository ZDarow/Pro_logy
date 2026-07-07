package Q;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class a {
    public static AudioFocusRequest a(int i4, AudioAttributes audioAttributes, boolean z4, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return new AudioFocusRequest.Builder(i4).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z4).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }
}
