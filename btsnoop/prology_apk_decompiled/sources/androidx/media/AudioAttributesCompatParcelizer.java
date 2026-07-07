package androidx.media;

import p1.b;
import p1.d;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        d dVar = audioAttributesCompat.f4194a;
        if (bVar.e(1)) {
            dVar = bVar.h();
        }
        audioAttributesCompat.f4194a = (AudioAttributesImpl) dVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f4194a;
        bVar.i(1);
        bVar.l(audioAttributesImpl);
    }
}
