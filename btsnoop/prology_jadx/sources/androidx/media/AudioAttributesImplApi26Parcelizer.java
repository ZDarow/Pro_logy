package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static androidx.media.AudioAttributesImplApi26 read(p176p1.AbstractC1950b abstractC1950b) {
        androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26 = new androidx.media.AudioAttributesImplApi26();
        audioAttributesImplApi26.f4345a = (android.media.AudioAttributes) abstractC1950b.m3955g(audioAttributesImplApi26.f4345a, 1);
        audioAttributesImplApi26.f4346b = abstractC1950b.m3954f(audioAttributesImplApi26.f4346b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26, p176p1.AbstractC1950b abstractC1950b) {
        abstractC1950b.getClass();
        abstractC1950b.m3959k(audioAttributesImplApi26.f4345a, 1);
        abstractC1950b.m3958j(audioAttributesImplApi26.f4346b, 2);
    }
}
