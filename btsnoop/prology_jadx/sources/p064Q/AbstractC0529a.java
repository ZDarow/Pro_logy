package p064Q;

/* renamed from: Q.a */
/* loaded from: classes.dex */
public abstract class AbstractC0529a {
    /* renamed from: a */
    public static android.media.AudioFocusRequest m1034a(int i4, android.media.AudioAttributes audioAttributes, boolean z4, android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler) {
        return new android.media.AudioFocusRequest.Builder(i4).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z4).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }
}
