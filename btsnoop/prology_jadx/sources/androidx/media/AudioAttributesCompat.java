package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements p176p1.InterfaceC1952d {

    /* renamed from: b */
    public static final /* synthetic */ int f4343b = 0;

    /* renamed from: a */
    public androidx.media.AudioAttributesImpl f4344a;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    /* renamed from: b */
    public static int m2669b(int i4, int i5) {
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
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return 0;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return 8;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                return 5;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
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

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media.AudioAttributesCompat)) {
            return false;
        }
        androidx.media.AudioAttributesCompat audioAttributesCompat = (androidx.media.AudioAttributesCompat) obj;
        androidx.media.AudioAttributesImpl audioAttributesImpl = this.f4344a;
        return audioAttributesImpl == null ? audioAttributesCompat.f4344a == null : audioAttributesImpl.equals(audioAttributesCompat.f4344a);
    }

    public final int hashCode() {
        return this.f4344a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f4344a.toString();
    }

    public AudioAttributesCompat(androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26) {
        this.f4344a = audioAttributesImplApi26;
    }
}
