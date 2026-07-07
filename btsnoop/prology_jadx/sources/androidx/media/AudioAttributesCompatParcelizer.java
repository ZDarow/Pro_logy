package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static androidx.media.AudioAttributesCompat read(p176p1.AbstractC1950b abstractC1950b) {
        androidx.media.AudioAttributesCompat audioAttributesCompat = new androidx.media.AudioAttributesCompat();
        p176p1.InterfaceC1952d interfaceC1952d = audioAttributesCompat.f4344a;
        if (abstractC1950b.mo3953e(1)) {
            interfaceC1952d = abstractC1950b.m3956h();
        }
        audioAttributesCompat.f4344a = (androidx.media.AudioAttributesImpl) interfaceC1952d;
        return audioAttributesCompat;
    }

    public static void write(androidx.media.AudioAttributesCompat audioAttributesCompat, p176p1.AbstractC1950b abstractC1950b) {
        abstractC1950b.getClass();
        androidx.media.AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f4344a;
        abstractC1950b.mo3957i(1);
        abstractC1950b.m3960l(audioAttributesImpl);
    }
}
