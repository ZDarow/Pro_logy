package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static androidx.media.AudioAttributesImplBase read(p176p1.AbstractC1950b abstractC1950b) {
        androidx.media.AudioAttributesImplBase audioAttributesImplBase = new androidx.media.AudioAttributesImplBase();
        audioAttributesImplBase.f4347a = abstractC1950b.m3954f(audioAttributesImplBase.f4347a, 1);
        audioAttributesImplBase.f4348b = abstractC1950b.m3954f(audioAttributesImplBase.f4348b, 2);
        audioAttributesImplBase.f4349c = abstractC1950b.m3954f(audioAttributesImplBase.f4349c, 3);
        audioAttributesImplBase.f4350d = abstractC1950b.m3954f(audioAttributesImplBase.f4350d, 4);
        return audioAttributesImplBase;
    }

    public static void write(androidx.media.AudioAttributesImplBase audioAttributesImplBase, p176p1.AbstractC1950b abstractC1950b) {
        abstractC1950b.getClass();
        abstractC1950b.m3958j(audioAttributesImplBase.f4347a, 1);
        abstractC1950b.m3958j(audioAttributesImplBase.f4348b, 2);
        abstractC1950b.m3958j(audioAttributesImplBase.f4349c, 3);
        abstractC1950b.m3958j(audioAttributesImplBase.f4350d, 4);
    }
}
