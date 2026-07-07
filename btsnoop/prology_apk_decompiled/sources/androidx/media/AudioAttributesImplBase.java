package androidx.media;

import B2.AbstractC0007h;
import L.k;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f4197a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f4198b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f4199c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f4200d = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4198b != audioAttributesImplBase.f4198b) {
            return false;
        }
        int i4 = this.f4199c;
        int i5 = audioAttributesImplBase.f4199c;
        int i6 = audioAttributesImplBase.f4200d;
        if (i6 == -1) {
            i6 = AudioAttributesCompat.b(i5, audioAttributesImplBase.f4197a);
        }
        if (i6 == 6) {
            i5 |= 4;
        } else if (i6 == 7) {
            i5 |= 1;
        }
        return i4 == (i5 & 273) && this.f4197a == audioAttributesImplBase.f4197a && this.f4200d == audioAttributesImplBase.f4200d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4198b), Integer.valueOf(this.f4199c), Integer.valueOf(this.f4197a), Integer.valueOf(this.f4200d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4200d != -1) {
            sb.append(" stream=");
            sb.append(this.f4200d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i4 = this.f4197a;
        int i5 = AudioAttributesCompat.f4193b;
        switch (i4) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "USAGE_ALARM";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "USAGE_NOTIFICATION";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
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
                str = AbstractC0007h.k("unknown usage ", i4);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f4198b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4199c).toUpperCase());
        return sb.toString();
    }
}
