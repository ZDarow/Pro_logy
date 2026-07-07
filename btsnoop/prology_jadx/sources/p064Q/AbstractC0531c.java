package p064Q;

/* renamed from: Q.c */
/* loaded from: classes.dex */
public abstract class AbstractC0531c {
    /* renamed from: a */
    public static int m1035a(android.media.AudioManager audioManager, android.media.AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    /* renamed from: b */
    public static int m1036b(android.media.AudioManager audioManager, android.media.AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }
}
