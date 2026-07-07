package androidx.media;

import p1.b;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4197a = bVar.f(audioAttributesImplBase.f4197a, 1);
        audioAttributesImplBase.f4198b = bVar.f(audioAttributesImplBase.f4198b, 2);
        audioAttributesImplBase.f4199c = bVar.f(audioAttributesImplBase.f4199c, 3);
        audioAttributesImplBase.f4200d = bVar.f(audioAttributesImplBase.f4200d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f4197a, 1);
        bVar.j(audioAttributesImplBase.f4198b, 2);
        bVar.j(audioAttributesImplBase.f4199c, 3);
        bVar.j(audioAttributesImplBase.f4200d, 4);
    }
}
