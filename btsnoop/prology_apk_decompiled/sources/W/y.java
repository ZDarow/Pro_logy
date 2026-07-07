package W;

import B2.AbstractC0007h;
import T.H;
import T.I;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2709a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f2710b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f2711c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f2712d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f2713e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f2714f;

    /* renamed from: g, reason: collision with root package name */
    public static final long[] f2715g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f2716h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f2717i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2718j;

    /* renamed from: k, reason: collision with root package name */
    public static HashMap f2719k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f2720l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f2721m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f2722n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f2723o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f2724p;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f2709a = i4;
        String str = Build.DEVICE;
        f2710b = str;
        String str2 = Build.MANUFACTURER;
        f2711c = str2;
        String str3 = Build.MODEL;
        f2712d = str3;
        f2713e = str + ", " + str3 + ", " + str2 + ", " + i4;
        f2714f = new byte[0];
        f2715g = new long[0];
        f2716h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f2717i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f2718j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f2720l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f2721m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f2722n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f2723o = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f2724p = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(int i4) {
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

    public static int B(int i4, int i5) {
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
                                    throw new IllegalArgumentException();
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

    public static long C(long j4, float f4) {
        return f4 == 1.0f ? j4 : Math.round(j4 / f4);
    }

    public static String[] D() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i4 = f2709a;
        if (i4 >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArr = new String[]{i4 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i5 = 0; i5 < strArr.length; i5++) {
            strArr[i5] = N(strArr[i5]);
        }
        return strArr;
    }

    public static String E(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            a.o("Util", "Failed to read system property ".concat(str), e4);
            return null;
        }
    }

    public static String F(int i4) {
        switch (i4) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return "video";
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return "text";
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return "image";
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return "metadata";
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "camera motion";
            default:
                return i4 >= 10000 ? AbstractC0007h.j(i4, "custom (", ")") : "?";
        }
    }

    public static int G(String str, Uri uri) {
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
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return 0;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && U1.a.o("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String I3 = U1.a.I(lastPathSegment.substring(lastIndexOf + 1));
                I3.getClass();
                switch (I3.hashCode()) {
                    case 104579:
                        if (I3.equals("ism")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case 108321:
                        if (I3.equals("mpd")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case 3242057:
                        if (I3.equals("isml")) {
                            c4 = 2;
                            break;
                        }
                        break;
                    case 3299913:
                        if (I3.equals("m3u8")) {
                            c4 = 3;
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 0:
                    case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                        i4 = 1;
                        break;
                    case 1:
                        i4 = 0;
                        break;
                    case L.k.INTEGER_FIELD_NUMBER /* 3 */:
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
            String path = uri.getPath();
            path.getClass();
            Matcher matcher = f2718j.matcher(path);
            if (matcher.matches()) {
                String group = matcher.group(2);
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

    public static void H(int i4) {
        Integer.toString(i4, 36);
    }

    public static boolean I(int i4) {
        return i4 == 3 || i4 == 2 || i4 == 268435456 || i4 == 21 || i4 == 1342177280 || i4 == 22 || i4 == 1610612736 || i4 == 4;
    }

    public static boolean J(Context context) {
        int i4 = f2709a;
        if (i4 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i4 == 30) {
                String str = f2712d;
                if (U1.a.o(str, "moto g(20)") || U1.a.o(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean K(int i4) {
        return i4 == 10 || i4 == 13;
    }

    public static boolean L(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long M(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 * 1000;
    }

    public static String N(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String I3 = U1.a.I(str);
        int i4 = 0;
        String str2 = I3.split("-", 2)[0];
        if (f2719k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f2720l;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i5 = 0; i5 < strArr.length; i5 += 2) {
                hashMap.put(strArr[i5], strArr[i5 + 1]);
            }
            f2719k = hashMap;
        }
        String str4 = (String) f2719k.get(str2);
        if (str4 != null) {
            I3 = str4 + I3.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return I3;
        }
        while (true) {
            String[] strArr2 = f2721m;
            if (i4 >= strArr2.length) {
                return I3;
            }
            if (I3.startsWith(strArr2[i4])) {
                return strArr2[i4 + 1] + I3.substring(strArr2[i4].length());
            }
            i4 += 2;
        }
    }

    public static Object[] O(int i4, Object[] objArr) {
        a.e(i4 <= objArr.length);
        return Arrays.copyOf(objArr, i4);
    }

    public static long P(String str) {
        Matcher matcher = f2716h.matcher(str);
        if (!matcher.matches()) {
            throw I.a(null, "Invalid date/time format: " + str);
        }
        int i4 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i4 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i4 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i4 != 0 ? timeInMillis - (i4 * 60000) : timeInMillis;
    }

    public static void Q(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void R(ArrayList arrayList, int i4, int i5) {
        if (i4 < 0 || i5 > arrayList.size() || i4 > i5) {
            throw new IllegalArgumentException();
        }
        if (i4 != i5) {
            arrayList.subList(i4, i5).clear();
        }
    }

    public static long S(long j4, int i4) {
        return U(j4, 1000000L, i4, RoundingMode.FLOOR);
    }

    public static void T(long[] jArr, long j4) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i4 = 0;
        if (j4 >= 1000000 && j4 % 1000000 == 0) {
            long m4 = U1.a.m(j4, 1000000L, RoundingMode.UNNECESSARY);
            while (i4 < jArr.length) {
                jArr[i4] = U1.a.m(jArr[i4], m4, roundingMode);
                i4++;
            }
            return;
        }
        if (j4 < 1000000 && 1000000 % j4 == 0) {
            long m5 = U1.a.m(1000000L, j4, RoundingMode.UNNECESSARY);
            while (i4 < jArr.length) {
                jArr[i4] = U1.a.z(jArr[i4], m5);
                i4++;
            }
            return;
        }
        for (int i5 = 0; i5 < jArr.length; i5++) {
            long j5 = jArr[i5];
            if (j5 != 0) {
                if (j4 >= j5 && j4 % j5 == 0) {
                    jArr[i5] = U1.a.m(1000000L, U1.a.m(j4, j5, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j4 >= j5 || j5 % j4 != 0) {
                    jArr[i5] = V(j5, 1000000L, j4, roundingMode);
                } else {
                    jArr[i5] = U1.a.z(1000000L, U1.a.m(j5, j4, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static long U(long j4, long j5, long j6, RoundingMode roundingMode) {
        if (j4 == 0 || j5 == 0) {
            return 0L;
        }
        return (j6 < j5 || j6 % j5 != 0) ? (j6 >= j5 || j5 % j6 != 0) ? (j6 < j4 || j6 % j4 != 0) ? (j6 >= j4 || j4 % j6 != 0) ? V(j4, j5, j6, roundingMode) : U1.a.z(j5, U1.a.m(j4, j6, RoundingMode.UNNECESSARY)) : U1.a.m(j5, U1.a.m(j6, j4, RoundingMode.UNNECESSARY), roundingMode) : U1.a.z(j4, U1.a.m(j5, j6, RoundingMode.UNNECESSARY)) : U1.a.m(j4, U1.a.m(j6, j5, RoundingMode.UNNECESSARY), roundingMode);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long V(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.y.V(long, long, long, java.math.RoundingMode):long");
    }

    public static String[] W(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] X(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static String Y(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            sb.append(Character.forDigit((bArr[i4] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i4] & 15, 16));
        }
        return sb.toString();
    }

    public static long Z(long j4) {
        return (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? j4 : j4 / 1000;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(long[] jArr, long j4, boolean z4) {
        int i4;
        int binarySearch = Arrays.binarySearch(jArr, j4);
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

    public static int c(B.c cVar, long j4) {
        int i4 = cVar.f84l - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            if (cVar.g(i6) < j4) {
                i5 = i6 + 1;
            } else {
                i4 = i6 - 1;
            }
        }
        int i7 = i4 + 1;
        if (i7 < cVar.f84l && cVar.g(i7) == j4) {
            return i7;
        }
        if (i4 == -1) {
            return 0;
        }
        return i4;
    }

    public static int d(f2.I i4, Long l4, boolean z4) {
        int i5;
        int binarySearch = Collections.binarySearch(i4, l4);
        if (binarySearch < 0) {
            i5 = -(binarySearch + 2);
        } else {
            while (true) {
                int i6 = binarySearch - 1;
                if (i6 < 0 || ((Comparable) i4.get(i6)).compareTo(l4) != 0) {
                    break;
                }
                binarySearch = i6;
            }
            i5 = binarySearch;
        }
        return z4 ? Math.max(0, i5) : i5;
    }

    public static int e(int[] iArr, int i4, boolean z4, boolean z5) {
        int i5;
        int i6;
        int binarySearch = Arrays.binarySearch(iArr, i4);
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
        return z5 ? Math.max(0, i6) : i6;
    }

    public static int f(long[] jArr, long j4, boolean z4) {
        int i4;
        int binarySearch = Arrays.binarySearch(jArr, j4);
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
        return z4 ? Math.max(0, i4) : i4;
    }

    public static int g(int i4, int i5) {
        return ((i4 + i5) - 1) / i5;
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float i(float f4, float f5, float f6) {
        return Math.max(f5, Math.min(f4, f6));
    }

    public static int j(int i4, int i5, int i6) {
        return Math.max(i5, Math.min(i4, i6));
    }

    public static long k(long j4, long j5, long j6) {
        return Math.max(j5, Math.min(j4, j6));
    }

    public static boolean l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int m(int i4, int i5, int i6, byte[] bArr) {
        while (i4 < i5) {
            i6 = f2722n[((i6 >>> 24) ^ (bArr[i4] & 255)) & 255] ^ (i6 << 8);
            i4++;
        }
        return i6;
    }

    public static Handler n(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        a.k(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String o(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String p(byte[] bArr) {
        return new String(bArr, e2.d.f5436c);
    }

    public static int q(int i4) {
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
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
            case L.k.STRING_FIELD_NUMBER /* 5 */:
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 21;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
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

    public static AudioFormat r(int i4, int i5, int i6) {
        return new AudioFormat.Builder().setSampleRate(i4).setChannelMask(i5).setEncoding(i6).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int s(int r2) {
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
            int r2 = W.y.f2709a
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
        throw new UnsupportedOperationException("Method not decompiled: W.y.s(int):int");
    }

    public static byte[] t(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            bArr[i4] = (byte) (Character.digit(str.charAt(i5 + 1), 16) + (Character.digit(str.charAt(i5), 16) << 4));
        }
        return bArr;
    }

    public static int u(String str, int i4) {
        int i5 = 0;
        for (String str2 : X(str)) {
            if (i4 == H.g(H.c(str2))) {
                i5++;
            }
        }
        return i5;
    }

    public static String v(String str, int i4) {
        String[] X3 = X(str);
        if (X3.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : X3) {
            if (i4 == H.g(H.c(str2))) {
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

    public static int w(int i4) {
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

    public static int x(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z4 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            return z4 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long y(long j4, float f4) {
        return f4 == 1.0f ? j4 : Math.round(j4 * f4);
    }

    public static long z(long j4) {
        return j4 == -9223372036854775807L ? System.currentTimeMillis() : j4 + SystemClock.elapsedRealtime();
    }
}
