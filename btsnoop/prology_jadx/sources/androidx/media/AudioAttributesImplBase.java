package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements androidx.media.AudioAttributesImpl {

    /* renamed from: a */
    public int f4347a = 0;

    /* renamed from: b */
    public int f4348b = 0;

    /* renamed from: c */
    public int f4349c = 0;

    /* renamed from: d */
    public int f4350d = -1;

    @Override // androidx.media.AudioAttributesImpl
    /* renamed from: a */
    public final java.lang.Object mo2670a() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media.AudioAttributesImplBase)) {
            return false;
        }
        androidx.media.AudioAttributesImplBase audioAttributesImplBase = (androidx.media.AudioAttributesImplBase) obj;
        if (this.f4348b != audioAttributesImplBase.f4348b) {
            return false;
        }
        int i4 = this.f4349c;
        int i5 = audioAttributesImplBase.f4349c;
        int i6 = audioAttributesImplBase.f4350d;
        if (i6 == -1) {
            i6 = androidx.media.AudioAttributesCompat.m2669b(i5, audioAttributesImplBase.f4347a);
        }
        if (i6 == 6) {
            i5 |= 4;
        } else if (i6 == 7) {
            i5 |= 1;
        }
        return i4 == (i5 & 273) && this.f4347a == audioAttributesImplBase.f4347a && this.f4350d == audioAttributesImplBase.f4350d;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f4348b), java.lang.Integer.valueOf(this.f4349c), java.lang.Integer.valueOf(this.f4347a), java.lang.Integer.valueOf(this.f4350d)});
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioAttributesCompat:");
        if (this.f4350d != -1) {
            sb.append(" stream=");
            sb.append(this.f4350d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i4 = this.f4347a;
        int i5 = androidx.media.AudioAttributesCompat.f4343b;
        switch (i4) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                str = "USAGE_ALARM";
                break;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                str = "USAGE_NOTIFICATION";
                break;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = p009B2.AbstractC0051h.m152k("unknown usage ", i4);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f4348b);
        sb.append(" flags=0x");
        sb.append(java.lang.Integer.toHexString(this.f4349c).toUpperCase());
        return sb.toString();
    }
}
