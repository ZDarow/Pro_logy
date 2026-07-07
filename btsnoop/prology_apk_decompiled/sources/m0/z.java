package m0;

import android.net.Uri;
import f2.AbstractC0275C;
import f2.C0278F;
import f2.I;
import f2.J;
import f2.c0;
import f2.r0;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f7321a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f7322b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f7323c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f7324d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f7325e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f7326f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final String f7327g = new String(new byte[]{10});

    /* renamed from: h, reason: collision with root package name */
    public static final String f7328h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c4 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c4 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c4 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c4 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c4 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c4 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c4 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c4 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c4 = '\b';
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c4 = '\t';
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c4 = '\n';
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c4 = 11;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return 8;
            case 1:
                return 12;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return 7;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 9;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 11;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                return 5;
            case '\t':
                return 10;
            case '\n':
                return 1;
            case 11:
                return 2;
            default:
                return 0;
        }
    }

    public static c0 b(String str) {
        if (str == null) {
            f2.G g4 = I.f5510m;
            return c0.f5550p;
        }
        f2.r.e("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i4 = W.y.f2709a;
        int i5 = 0;
        for (String str2 : str.split(",\\s?", -1)) {
            int a4 = a(str2);
            if (a4 != 0) {
                Integer valueOf = Integer.valueOf(a4);
                int i6 = i5 + 1;
                if (objArr.length < i6) {
                    objArr = Arrays.copyOf(objArr, AbstractC0275C.e(objArr.length, i6));
                }
                objArr[i5] = valueOf;
                i5 = i6;
            }
        }
        return I.h(i5, objArr);
    }

    public static G0.c c(String str) {
        long parseInt;
        Matcher matcher = f7324d.matcher(str);
        if (!matcher.matches()) {
            throw T.I.b(str, null);
        }
        String group = matcher.group(1);
        group.getClass();
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e4) {
                throw T.I.b(str, e4);
            }
        } else {
            parseInt = 60000;
        }
        return new G0.c(group, parseInt, 6);
    }

    public static F1.a d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        int i4 = W.y.f2709a;
        String[] split = userInfo.split(":", 2);
        return new F1.a(2, split[0], split[1]);
    }

    public static W.p e(String str) {
        Matcher matcher = f7325e.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            return new W.p(2, group, group2, group3 != null ? group3 : "");
        }
        Matcher matcher2 = f7326f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new W.p(1, group4, "", "");
        }
        throw T.I.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri f(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String authority = uri.getAuthority();
        authority.getClass();
        W.a.e(authority.contains("@"));
        int i4 = W.y.f2709a;
        return uri.buildUpon().encodedAuthority(authority.split("@", -1)[1]).build();
    }

    public static c0 g(C0412A c0412a) {
        W.a.e(c0412a.f7134c.c("CSeq") != null);
        C0278F c0278f = new C0278F();
        c0278f.c(W.y.o("%s %s %s", h(c0412a.f7133b), c0412a.f7132a, "RTSP/1.0"));
        J a4 = c0412a.f7134c.a();
        r0 it = a4.e().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            I d4 = a4.d(str);
            for (int i4 = 0; i4 < d4.size(); i4++) {
                c0278f.c(W.y.o("%s: %s", str, d4.get(i4)));
            }
        }
        c0278f.c("");
        c0278f.c(c0412a.f7135d);
        return c0278f.g();
    }

    public static String h(int i4) {
        switch (i4) {
            case 1:
                return "ANNOUNCE";
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return "DESCRIBE";
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return "GET_PARAMETER";
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return "OPTIONS";
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                return "PAUSE";
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "PLAY";
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return "PLAY_NOTIFY";
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
