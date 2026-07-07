package T;

import C.C0023j;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f2120a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f2121b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] X3 = W.y.X(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : X3) {
            if (str2.equals(c(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int b(String str, String str2) {
        C0023j e4;
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c4 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c4 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c4 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c4 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c4 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c4 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c4 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c4 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c4 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c4 = 11;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return 18;
            case 1:
                return 8;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 7;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (str2 == null || (e4 = e(str2)) == null) {
                    return 0;
                }
                return e4.a();
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return 17;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 30;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 6;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        C0023j e4;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String I3 = U1.a.I(str.trim());
        if (I3.startsWith("avc1") || I3.startsWith("avc3")) {
            return "video/avc";
        }
        if (I3.startsWith("hev1") || I3.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (I3.startsWith("dvav") || I3.startsWith("dva1") || I3.startsWith("dvhe") || I3.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (I3.startsWith("av01")) {
            return "video/av01";
        }
        if (I3.startsWith("vp9") || I3.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (I3.startsWith("vp8") || I3.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (I3.startsWith("mp4a")) {
            if (I3.startsWith("mp4a.") && (e4 = e(I3)) != null) {
                str2 = d(e4.f320b);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (I3.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (I3.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (I3.startsWith("ac-3") || I3.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (I3.startsWith("ec-3") || I3.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (I3.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (I3.startsWith("ac-4") || I3.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (I3.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (I3.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (I3.startsWith("dtsh") || I3.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (I3.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (I3.startsWith("opus")) {
            return "audio/opus";
        }
        if (I3.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (I3.startsWith("flac")) {
            return "audio/flac";
        }
        if (I3.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (I3.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (I3.contains("cea708")) {
            return "application/cea-708";
        }
        if (I3.contains("eia608") || I3.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f2120a;
        if (arrayList.size() <= 0) {
            return null;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String d(int i4) {
        if (i4 == 32) {
            return "video/mp4v-es";
        }
        if (i4 == 33) {
            return "video/avc";
        }
        if (i4 == 35) {
            return "video/hevc";
        }
        if (i4 == 64) {
            return "audio/mp4a-latm";
        }
        if (i4 == 163) {
            return "video/wvc1";
        }
        if (i4 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i4 == 221) {
            return "audio/vorbis";
        }
        if (i4 == 165) {
            return "audio/ac3";
        }
        if (i4 == 166) {
            return "audio/eac3";
        }
        switch (i4) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i4) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static C0023j e(String str) {
        Matcher matcher = f2121b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new C0023j(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (k(str)) {
            return 2;
        }
        if (j(str)) {
            return 3;
        }
        if (i(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f2120a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        return "image".equals(f(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean j(String str) {
        return "text".equals(f(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean k(String str) {
        return "video".equals(f(str));
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        String I3 = U1.a.I(str);
        I3.getClass();
        char c4 = 65535;
        switch (I3.hashCode()) {
            case -1007807498:
                if (I3.equals("audio/x-flac")) {
                    c4 = 0;
                    break;
                }
                break;
            case -979095690:
                if (I3.equals("application/x-mpegurl")) {
                    c4 = 1;
                    break;
                }
                break;
            case -586683234:
                if (I3.equals("audio/x-wav")) {
                    c4 = 2;
                    break;
                }
                break;
            case -432836268:
                if (I3.equals("audio/mpeg-l1")) {
                    c4 = 3;
                    break;
                }
                break;
            case -432836267:
                if (I3.equals("audio/mpeg-l2")) {
                    c4 = 4;
                    break;
                }
                break;
            case 187090231:
                if (I3.equals("audio/mp3")) {
                    c4 = 5;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return "audio/flac";
            case 1:
                return "application/x-mpegURL";
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return "audio/wav";
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return "audio/mpeg-L1";
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return "audio/mpeg-L2";
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return "audio/mpeg";
            default:
                return I3;
        }
    }
}
