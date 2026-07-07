package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static androidx.media.AudioAttributesImplApi21 read(p176p1.AbstractC1950b abstractC1950b) {
        androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21 = new androidx.media.AudioAttributesImplApi21();
        audioAttributesImplApi21.f4345a = (android.media.AudioAttributes) abstractC1950b.m3955g(audioAttributesImplApi21.f4345a, 1);
        audioAttributesImplApi21.f4346b = abstractC1950b.m3954f(audioAttributesImplApi21.f4346b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21, p176p1.AbstractC1950b abstractC1950b) {
        abstractC1950b.getClass();
        abstractC1950b.m3959k(audioAttributesImplApi21.f4345a, 1);
        abstractC1950b.m3958j(audioAttributesImplApi21.f4346b, 2);
    }
}
