package androidx.media;

import L.k;
import android.util.SparseIntArray;
import p1.d;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4193b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f4194a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public static int b(int i4, int i5) {
        if ((i4 & 1) == 1) {
            return 7;
        }
        if ((i4 & 4) == 4) {
            return 6;
        }
        switch (i5) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return 0;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return 8;
            case k.LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case k.STRING_FIELD_NUMBER /* 5 */:
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
            case k.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                return 5;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                return 3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f4194a;
        return audioAttributesImpl == null ? audioAttributesCompat.f4194a == null : audioAttributesImpl.equals(audioAttributesCompat.f4194a);
    }

    public final int hashCode() {
        return this.f4194a.hashCode();
    }

    public final String toString() {
        return this.f4194a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImplApi26 audioAttributesImplApi26) {
        this.f4194a = audioAttributesImplApi26;
    }
}
