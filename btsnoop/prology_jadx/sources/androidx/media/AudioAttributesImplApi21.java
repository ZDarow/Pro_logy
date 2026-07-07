package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements androidx.media.AudioAttributesImpl {

    /* renamed from: a */
    public android.media.AudioAttributes f4345a;

    /* renamed from: b */
    public int f4346b = -1;

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    /* renamed from: a */
    public final java.lang.Object mo2670a() {
        return this.f4345a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.media.AudioAttributesImplApi21) {
            return this.f4345a.equals(((androidx.media.AudioAttributesImplApi21) obj).f4345a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4345a.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4345a;
    }

    public AudioAttributesImplApi21(android.media.AudioAttributes audioAttributes) {
        this.f4345a = audioAttributes;
    }
}
