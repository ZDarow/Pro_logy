package p076T;

/* renamed from: T.H */
/* loaded from: classes.dex */
public abstract class AbstractC0665H {

    /* renamed from: a */
    public static final java.util.ArrayList f2200a = new java.util.ArrayList();

    /* renamed from: b */
    public static final java.util.regex.Pattern f2201b = java.util.regex.Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: a */
    public static java.lang.String m1190a(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        java.lang.String[] m1603X = p086W.AbstractC0805y.m1603X(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str3 : m1603X) {
            if (str2.equals(m1192c(str3))) {
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

    /* renamed from: b */
    public static int m1191b(java.lang.String str, java.lang.String str2) {
        p011C.C0118j m1194e;
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
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return 7;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                if (str2 == null || (m1194e = m1194e(str2)) == null) {
                    return 0;
                }
                return m1194e.m432a();
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return 17;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 30;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 6;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
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

    /* renamed from: c */
    public static java.lang.String m1192c(java.lang.String str) {
        p011C.C0118j m1194e;
        java.lang.String str2 = null;
        if (str == null) {
            return null;
        }
        java.lang.String m1361I = p080U1.AbstractC0748a.m1361I(str.trim());
        if (m1361I.startsWith("avc1") || m1361I.startsWith("avc3")) {
            return "video/avc";
        }
        if (m1361I.startsWith("hev1") || m1361I.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (m1361I.startsWith("dvav") || m1361I.startsWith("dva1") || m1361I.startsWith("dvhe") || m1361I.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (m1361I.startsWith("av01")) {
            return "video/av01";
        }
        if (m1361I.startsWith("vp9") || m1361I.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (m1361I.startsWith("vp8") || m1361I.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (m1361I.startsWith("mp4a")) {
            if (m1361I.startsWith("mp4a.") && (m1194e = m1194e(m1361I)) != null) {
                str2 = m1193d(m1194e.f326b);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (m1361I.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (m1361I.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (m1361I.startsWith("ac-3") || m1361I.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (m1361I.startsWith("ec-3") || m1361I.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (m1361I.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (m1361I.startsWith("ac-4") || m1361I.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (m1361I.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (m1361I.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (m1361I.startsWith("dtsh") || m1361I.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (m1361I.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (m1361I.startsWith("opus")) {
            return "audio/opus";
        }
        if (m1361I.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (m1361I.startsWith("flac")) {
            return "audio/flac";
        }
        if (m1361I.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (m1361I.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (m1361I.contains("cea708")) {
            return "application/cea-708";
        }
        if (m1361I.contains("eia608") || m1361I.contains("cea608")) {
            return "application/cea-608";
        }
        java.util.ArrayList arrayList = f2200a;
        if (arrayList.size() <= 0) {
            return null;
        }
        arrayList.get(0).getClass();
        throw new java.lang.ClassCastException();
    }

    /* renamed from: d */
    public static java.lang.String m1193d(int i4) {
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

    /* renamed from: e */
    public static p011C.C0118j m1194e(java.lang.String str) {
        java.util.regex.Matcher matcher = f2201b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        java.lang.String group = matcher.group(1);
        group.getClass();
        java.lang.String group2 = matcher.group(2);
        try {
            return new p011C.C0118j(java.lang.Integer.parseInt(group, 16), group2 != null ? java.lang.Integer.parseInt(group2) : 0, 2);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static java.lang.String m1195f(java.lang.String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: g */
    public static int m1196g(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m1197h(str)) {
            return 1;
        }
        if (m1200k(str)) {
            return 2;
        }
        if (m1199j(str)) {
            return 3;
        }
        if (m1198i(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        java.util.ArrayList arrayList = f2200a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new java.lang.ClassCastException();
    }

    /* renamed from: h */
    public static boolean m1197h(java.lang.String str) {
        return "audio".equals(m1195f(str));
    }

    /* renamed from: i */
    public static boolean m1198i(java.lang.String str) {
        return "image".equals(m1195f(str)) || "application/x-image-uri".equals(str);
    }

    /* renamed from: j */
    public static boolean m1199j(java.lang.String str) {
        return "text".equals(m1195f(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: k */
    public static boolean m1200k(java.lang.String str) {
        return "video".equals(m1195f(str));
    }

    /* renamed from: l */
    public static java.lang.String m1201l(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String m1361I = p080U1.AbstractC0748a.m1361I(str);
        m1361I.getClass();
        char c4 = 65535;
        switch (m1361I.hashCode()) {
            case -1007807498:
                if (m1361I.equals("audio/x-flac")) {
                    c4 = 0;
                    break;
                }
                break;
            case -979095690:
                if (m1361I.equals("application/x-mpegurl")) {
                    c4 = 1;
                    break;
                }
                break;
            case -586683234:
                if (m1361I.equals("audio/x-wav")) {
                    c4 = 2;
                    break;
                }
                break;
            case -432836268:
                if (m1361I.equals("audio/mpeg-l1")) {
                    c4 = 3;
                    break;
                }
                break;
            case -432836267:
                if (m1361I.equals("audio/mpeg-l2")) {
                    c4 = 4;
                    break;
                }
                break;
            case 187090231:
                if (m1361I.equals("audio/mp3")) {
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
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return "audio/wav";
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return "audio/mpeg-L1";
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return "audio/mpeg-L2";
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return "audio/mpeg";
            default:
                return m1361I;
        }
    }
}
