package p112c0;

/* renamed from: c0.f */
/* loaded from: classes.dex */
public abstract class AbstractC1224f {
    /* renamed from: a */
    public static void m2907a(android.content.Context context, android.media.AudioDeviceCallback audioDeviceCallback, android.os.Handler handler) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    /* renamed from: b */
    public static void m2908b(android.content.Context context, android.media.AudioDeviceCallback audioDeviceCallback) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}
