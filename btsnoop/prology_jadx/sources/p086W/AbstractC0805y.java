package p086W;

/* renamed from: W.y */
/* loaded from: classes.dex */
public abstract class AbstractC0805y {

    /* renamed from: a */
    public static final int f2801a;

    /* renamed from: b */
    public static final java.lang.String f2802b;

    /* renamed from: c */
    public static final java.lang.String f2803c;

    /* renamed from: d */
    public static final java.lang.String f2804d;

    /* renamed from: e */
    public static final java.lang.String f2805e;

    /* renamed from: f */
    public static final byte[] f2806f;

    /* renamed from: g */
    public static final long[] f2807g;

    /* renamed from: h */
    public static final java.util.regex.Pattern f2808h;

    /* renamed from: i */
    public static final java.util.regex.Pattern f2809i;

    /* renamed from: j */
    public static final java.util.regex.Pattern f2810j;

    /* renamed from: k */
    public static java.util.HashMap f2811k;

    /* renamed from: l */
    public static final java.lang.String[] f2812l;

    /* renamed from: m */
    public static final java.lang.String[] f2813m;

    /* renamed from: n */
    public static final int[] f2814n;

    /* renamed from: o */
    public static final int[] f2815o;

    /* renamed from: p */
    public static final int[] f2816p;

    static {
        int i4 = android.os.Build.VERSION.SDK_INT;
        f2801a = i4;
        java.lang.String str = android.os.Build.DEVICE;
        f2802b = str;
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        f2803c = str2;
        java.lang.String str3 = android.os.Build.MODEL;
        f2804d = str3;
        f2805e = str + ", " + str3 + ", " + str2 + ", " + i4;
        f2806f = new byte[0];
        f2807g = new long[0];
        f2808h = java.util.regex.Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f2809i = java.util.regex.Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        java.util.regex.Pattern.compile("%([A-Fa-f0-9]{2})");
        f2810j = java.util.regex.Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f2812l = new java.lang.String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f2813m = new java.lang.String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f2814n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f2815o = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f2816p = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: A */
    public static int m1580A(int i4) {
        if (i4 == 8) {
            return 3;
        }
        if (i4 == 16) {
            return 2;
        }
        if (i4 != 24) {
            return i4 != 32 ? 0 : 22;
        }
        return 21;
    }

    /* renamed from: B */
    public static int m1581B(int i4, int i5) {
        if (i4 != 2) {
            if (i4 == 3) {
                return i5;
            }
            if (i4 != 4) {
                if (i4 != 21) {
                    if (i4 != 22) {
                        if (i4 != 268435456) {
                            if (i4 != 1342177280) {
                                if (i4 != 1610612736) {
                                    throw new java.lang.IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i5 * 3;
            }
            return i5 * 4;
        }
        return i5 * 2;
    }

    /* renamed from: C */
    public static long m1582C(long j4, float f4) {
        return f4 == 1.0f ? j4 : java.lang.Math.round(j4 / f4);
    }

    /* renamed from: D */
    public static java.lang.String[] m1583D() {
        java.lang.String[] strArr;
        android.content.res.Configuration configuration = android.content.res.Resources.getSystem().getConfiguration();
        int i4 = f2801a;
        if (i4 >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            java.util.Locale locale = configuration.locale;
            strArr = new java.lang.String[]{i4 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i5 = 0; i5 < strArr.length; i5++) {
            strArr[i5] = m1593N(strArr[i5]);
        }
        return strArr;
    }

    /* renamed from: E */
    public static java.lang.String m1584E(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e4) {
            p086W.AbstractC0781a.m1426o("Util", "Failed to read system property ".concat(str), e4);
            return null;
        }
    }

    /* renamed from: F */
    public static java.lang.String m1585F(int i4) {
        switch (i4) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return "video";
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return "text";
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return "image";
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return "metadata";
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "camera motion";
            default:
                return i4 >= 10000 ? p009B2.AbstractC0051h.m151j(i4, "custom (", ")") : "?";
        }
    }

    /* renamed from: G */
    public static int m1586G(java.lang.String str, android.net.Uri uri) {
        int i4;
        char c4 = 65535;
        if (str != null) {
            switch (str.hashCode()) {
                case -979127466:
                    if (str.equals("application/x-mpegURL")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -156749520:
                    if (str.equals("application/vnd.ms-sstr+xml")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 64194685:
                    if (str.equals("application/dash+xml")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 1154777587:
                    if (str.equals("application/x-rtsp")) {
                        c4 = 3;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    return 2;
                case 1:
                    return 1;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    return 0;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    return 3;
                default:
                    return 4;
            }
        }
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && p080U1.AbstractC0748a.m1380o("rtsp", scheme)) {
            return 3;
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                java.lang.String m1361I = p080U1.AbstractC0748a.m1361I(lastPathSegment.substring(lastIndexOf + 1));
                m1361I.getClass();
                switch (m1361I.hashCode()) {
                    case 104579:
                        if (m1361I.equals("ism")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case 108321:
                        if (m1361I.equals("mpd")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case 3242057:
                        if (m1361I.equals("isml")) {
                            c4 = 2;
                            break;
                        }
                        break;
                    case 3299913:
                        if (m1361I.equals("m3u8")) {
                            c4 = 3;
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 0:
                    case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                        i4 = 1;
                        break;
                    case 1:
                        i4 = 0;
                        break;
                    case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                        i4 = 2;
                        break;
                    default:
                        i4 = 4;
                        break;
                }
                if (i4 != 4) {
                    return i4;
                }
            }
            java.lang.String path = uri.getPath();
            path.getClass();
            java.util.regex.Matcher matcher = f2810j.matcher(path);
            if (matcher.matches()) {
                java.lang.String group = matcher.group(2);
                if (group == null) {
                    return 1;
                }
                if (group.contains("format=mpd-time-csf")) {
                    return 0;
                }
                return group.contains("format=m3u8-aapl") ? 2 : 1;
            }
        }
        return 4;
    }

    /* renamed from: H */
    public static void m1587H(int i4) {
        java.lang.Integer.toString(i4, 36);
    }

    /* renamed from: I */
    public static boolean m1588I(int i4) {
        return i4 == 3 || i4 == 2 || i4 == 268435456 || i4 == 21 || i4 == 1342177280 || i4 == 22 || i4 == 1610612736 || i4 == 4;
    }

    /* renamed from: J */
    public static boolean m1589J(android.content.Context context) {
        int i4 = f2801a;
        if (i4 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i4 == 30) {
                java.lang.String str = f2804d;
                if (p080U1.AbstractC0748a.m1380o(str, "moto g(20)") || p080U1.AbstractC0748a.m1380o(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public static boolean m1590K(int i4) {
        return i4 == 10 || i4 == 13;
    }

    /* renamed from: L */
    public static boolean m1591L(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: M */
    public static long m1592M(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 * 1000;
    }

    /* renamed from: N */
    public static java.lang.String m1593N(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        java.lang.String m1361I = p080U1.AbstractC0748a.m1361I(str);
        int i4 = 0;
        java.lang.String str2 = m1361I.split("-", 2)[0];
        if (f2811k == null) {
            java.lang.String[] iSOLanguages = java.util.Locale.getISOLanguages();
            int length = iSOLanguages.length;
            java.lang.String[] strArr = f2812l;
            java.util.HashMap hashMap = new java.util.HashMap(length + strArr.length);
            for (java.lang.String str3 : iSOLanguages) {
                try {
                    java.lang.String iSO3Language = new java.util.Locale(str3).getISO3Language();
                    if (!android.text.TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (java.util.MissingResourceException unused) {
                }
            }
            for (int i5 = 0; i5 < strArr.length; i5 += 2) {
                hashMap.put(strArr[i5], strArr[i5 + 1]);
            }
            f2811k = hashMap;
        }
        java.lang.String str4 = (java.lang.String) f2811k.get(str2);
        if (str4 != null) {
            m1361I = str4 + m1361I.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return m1361I;
        }
        while (true) {
            java.lang.String[] strArr2 = f2813m;
            if (i4 >= strArr2.length) {
                return m1361I;
            }
            if (m1361I.startsWith(strArr2[i4])) {
                return strArr2[i4 + 1] + m1361I.substring(strArr2[i4].length());
            }
            i4 += 2;
        }
    }

    /* renamed from: O */
    public static java.lang.Object[] m1594O(int i4, java.lang.Object[] objArr) {
        p086W.AbstractC0781a.m1416e(i4 <= objArr.length);
        return java.util.Arrays.copyOf(objArr, i4);
    }

    /* renamed from: P */
    public static long m1595P(java.lang.String str) {
        java.util.regex.Matcher matcher = f2808h.matcher(str);
        if (!matcher.matches()) {
            throw p076T.C0666I.m1202a(null, "Invalid date/time format: " + str);
        }
        int i4 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i4 = java.lang.Integer.parseInt(matcher.group(13)) + (java.lang.Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i4 *= -1;
            }
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(java.lang.Integer.parseInt(matcher.group(1)), java.lang.Integer.parseInt(matcher.group(2)) - 1, java.lang.Integer.parseInt(matcher.group(3)), java.lang.Integer.parseInt(matcher.group(4)), java.lang.Integer.parseInt(matcher.group(5)), java.lang.Integer.parseInt(matcher.group(6)));
        if (!android.text.TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new java.math.BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i4 != 0 ? timeInMillis - (i4 * 60000) : timeInMillis;
    }

    /* renamed from: Q */
    public static void m1596Q(android.os.Handler handler, java.lang.Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == android.os.Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: R */
    public static void m1597R(java.util.ArrayList arrayList, int i4, int i5) {
        if (i4 < 0 || i5 > arrayList.size() || i4 > i5) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i4 != i5) {
            arrayList.subList(i4, i5).clear();
        }
    }

    /* renamed from: S */
    public static long m1598S(long j4, int i4) {
        return m1600U(j4, 1000000L, i4, java.math.RoundingMode.FLOOR);
    }

    /* renamed from: T */
    public static void m1599T(long[] jArr, long j4) {
        java.math.RoundingMode roundingMode = java.math.RoundingMode.FLOOR;
        int i4 = 0;
        if (j4 >= 1000000 && j4 % 1000000 == 0) {
            long m1379m = p080U1.AbstractC0748a.m1379m(j4, 1000000L, java.math.RoundingMode.UNNECESSARY);
            while (i4 < jArr.length) {
                jArr[i4] = p080U1.AbstractC0748a.m1379m(jArr[i4], m1379m, roundingMode);
                i4++;
            }
            return;
        }
        if (j4 < 1000000 && 1000000 % j4 == 0) {
            long m1379m2 = p080U1.AbstractC0748a.m1379m(1000000L, j4, java.math.RoundingMode.UNNECESSARY);
            while (i4 < jArr.length) {
                jArr[i4] = p080U1.AbstractC0748a.m1391z(jArr[i4], m1379m2);
                i4++;
            }
            return;
        }
        for (int i5 = 0; i5 < jArr.length; i5++) {
            long j5 = jArr[i5];
            if (j5 != 0) {
                if (j4 >= j5 && j4 % j5 == 0) {
                    jArr[i5] = p080U1.AbstractC0748a.m1379m(1000000L, p080U1.AbstractC0748a.m1379m(j4, j5, java.math.RoundingMode.UNNECESSARY), roundingMode);
                } else if (j4 >= j5 || j5 % j4 != 0) {
                    jArr[i5] = m1601V(j5, 1000000L, j4, roundingMode);
                } else {
                    jArr[i5] = p080U1.AbstractC0748a.m1391z(1000000L, p080U1.AbstractC0748a.m1379m(j5, j4, java.math.RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    /* renamed from: U */
    public static long m1600U(long j4, long j5, long j6, java.math.RoundingMode roundingMode) {
        if (j4 == 0 || j5 == 0) {
            return 0L;
        }
        return (j6 < j5 || j6 % j5 != 0) ? (j6 >= j5 || j5 % j6 != 0) ? (j6 < j4 || j6 % j4 != 0) ? (j6 >= j4 || j4 % j6 != 0) ? m1601V(j4, j5, j6, roundingMode) : p080U1.AbstractC0748a.m1391z(j5, p080U1.AbstractC0748a.m1379m(j4, j6, java.math.RoundingMode.UNNECESSARY)) : p080U1.AbstractC0748a.m1379m(j5, p080U1.AbstractC0748a.m1379m(j6, j4, java.math.RoundingMode.UNNECESSARY), roundingMode) : p080U1.AbstractC0748a.m1391z(j4, p080U1.AbstractC0748a.m1379m(j5, j6, java.math.RoundingMode.UNNECESSARY)) : p080U1.AbstractC0748a.m1379m(j4, p080U1.AbstractC0748a.m1379m(j6, j5, java.math.RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x007f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m1601V(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p086W.AbstractC0805y.m1601V(long, long, long, java.math.RoundingMode):long");
    }

    /* renamed from: W */
    public static java.lang.String[] m1602W(java.lang.String str, java.lang.String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: X */
    public static java.lang.String[] m1603X(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? new java.lang.String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    /* renamed from: Y */
    public static java.lang.String m1604Y(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            sb.append(java.lang.Character.forDigit((bArr[i4] >> 4) & 15, 16));
            sb.append(java.lang.Character.forDigit(bArr[i4] & 15, 16));
        }
        return sb.toString();
    }

    /* renamed from: Z */
    public static long m1605Z(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 / 1000;
    }

    /* renamed from: a */
    public static boolean m1606a(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m1607b(long[] jArr, long j4, boolean z4) {
        int i4;
        int binarySearch = java.util.Arrays.binarySearch(jArr, j4);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i4 = binarySearch + 1;
            if (i4 >= jArr.length || jArr[i4] != j4) {
                break;
            }
            binarySearch = i4;
        }
        return z4 ? binarySearch : i4;
    }

    /* renamed from: c */
    public static int m1608c(p006B.C0020c c0020c, long j4) {
        int i4 = c0020c.f87l - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            if (c0020c.m55g(i6) < j4) {
                i5 = i6 + 1;
            } else {
                i4 = i6 - 1;
            }
        }
        int i7 = i4 + 1;
        if (i7 < c0020c.f87l && c0020c.m55g(i7) == j4) {
            return i7;
        }
        if (i4 == -1) {
            return 0;
        }
        return i4;
    }

    /* renamed from: d */
    public static int m1609d(p129f2.AbstractC1393I abstractC1393I, java.lang.Long l4, boolean z4) {
        int i4;
        int binarySearch = java.util.Collections.binarySearch(abstractC1393I, l4);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                int i5 = binarySearch - 1;
                if (i5 < 0 || ((java.lang.Comparable) abstractC1393I.get(i5)).compareTo(l4) != 0) {
                    break;
                }
                binarySearch = i5;
            }
            i4 = binarySearch;
        }
        return z4 ? java.lang.Math.max(0, i4) : i4;
    }

    /* renamed from: e */
    public static int m1610e(int[] iArr, int i4, boolean z4, boolean z5) {
        int i5;
        int i6;
        int binarySearch = java.util.Arrays.binarySearch(iArr, i4);
        if (binarySearch < 0) {
            i6 = -(binarySearch + 2);
        } else {
            while (true) {
                i5 = binarySearch - 1;
                if (i5 < 0 || iArr[i5] != i4) {
                    break;
                }
                binarySearch = i5;
            }
            i6 = z4 ? binarySearch : i5;
        }
        return z5 ? java.lang.Math.max(0, i6) : i6;
    }

    /* renamed from: f */
    public static int m1611f(long[] jArr, long j4, boolean z4) {
        int i4;
        int binarySearch = java.util.Arrays.binarySearch(jArr, j4);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                int i5 = binarySearch - 1;
                if (i5 < 0 || jArr[i5] != j4) {
                    break;
                }
                binarySearch = i5;
            }
            i4 = binarySearch;
        }
        return z4 ? java.lang.Math.max(0, i4) : i4;
    }

    /* renamed from: g */
    public static int m1612g(int i4, int i5) {
        return ((i4 + i5) - 1) / i5;
    }

    /* renamed from: h */
    public static void m1613h(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* renamed from: i */
    public static float m1614i(float f4, float f5, float f6) {
        return java.lang.Math.max(f5, java.lang.Math.min(f4, f6));
    }

    /* renamed from: j */
    public static int m1615j(int i4, int i5, int i6) {
        return java.lang.Math.max(i5, java.lang.Math.min(i4, i6));
    }

    /* renamed from: k */
    public static long m1616k(long j4, long j5, long j6) {
        return java.lang.Math.max(j5, java.lang.Math.min(j4, j6));
    }

    /* renamed from: l */
    public static boolean m1617l(java.lang.Object[] objArr, java.lang.Object obj) {
        for (java.lang.Object obj2 : objArr) {
            if (m1606a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static int m1618m(int i4, int i5, int i6, byte[] bArr) {
        while (i4 < i5) {
            i6 = f2814n[((i6 >>> 24) ^ (bArr[i4] & 255)) & 255] ^ (i6 << 8);
            i4++;
        }
        return i6;
    }

    /* renamed from: n */
    public static android.os.Handler m1619n(android.os.Handler.Callback callback) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        p086W.AbstractC0781a.m1422k(myLooper);
        return new android.os.Handler(myLooper, callback);
    }

    /* renamed from: o */
    public static java.lang.String m1620o(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    /* renamed from: p */
    public static java.lang.String m1621p(byte[] bArr) {
        return new java.lang.String(bArr, p124e2.AbstractC1356d.f5630c);
    }

    /* renamed from: q */
    public static int m1622q(int i4) {
        if (i4 == 20) {
            return 30;
        }
        if (i4 == 22) {
            return 31;
        }
        if (i4 == 30) {
            return 34;
        }
        switch (i4) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 21;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i4) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* renamed from: r */
    public static android.media.AudioFormat m1623r(int i4, int i5, int i6) {
        return new android.media.AudioFormat.Builder().setSampleRate(i4).setChannelMask(i5).setEncoding(i6).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m1624s(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = p086W.AbstractC0805y.f2801a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p086W.AbstractC0805y.m1624s(int):int");
    }

    /* renamed from: t */
    public static byte[] m1625t(java.lang.String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            bArr[i4] = (byte) (java.lang.Character.digit(str.charAt(i5 + 1), 16) + (java.lang.Character.digit(str.charAt(i5), 16) << 4));
        }
        return bArr;
    }

    /* renamed from: u */
    public static int m1626u(java.lang.String str, int i4) {
        int i5 = 0;
        for (java.lang.String str2 : m1603X(str)) {
            if (i4 == p076T.AbstractC0665H.m1196g(p076T.AbstractC0665H.m1192c(str2))) {
                i5++;
            }
        }
        return i5;
    }

    /* renamed from: v */
    public static java.lang.String m1627v(java.lang.String str, int i4) {
        java.lang.String[] m1603X = m1603X(str);
        if (m1603X.length == 0) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : m1603X) {
            if (i4 == p076T.AbstractC0665H.m1196g(p076T.AbstractC0665H.m1192c(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: w */
    public static int m1628w(int i4) {
        if (i4 == 2 || i4 == 4) {
            return 6005;
        }
        if (i4 == 10) {
            return 6004;
        }
        if (i4 == 7) {
            return 6005;
        }
        if (i4 == 8) {
            return 6003;
        }
        switch (i4) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i4) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: x */
    public static int m1629x(java.lang.String str) {
        java.lang.String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        java.lang.String str2 = split[length - 1];
        boolean z4 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            int parseInt = java.lang.Integer.parseInt(str2);
            return z4 ? -parseInt : parseInt;
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: y */
    public static long m1630y(long j4, float f4) {
        return f4 == 1.0f ? j4 : java.lang.Math.round(j4 * f4);
    }

    /* renamed from: z */
    public static long m1631z(long j4) {
        return j4 == -9223372036854775807L ? java.lang.System.currentTimeMillis() : j4 + android.os.SystemClock.elapsedRealtime();
    }
}
