package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f4195a;

    /* renamed from: b, reason: collision with root package name */
    public int f4196b = -1;

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object a() {
        return this.f4195a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f4195a.equals(((AudioAttributesImplApi21) obj).f4195a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4195a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4195a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f4195a = audioAttributes;
    }
}
