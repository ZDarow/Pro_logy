package p161m0;

/* renamed from: m0.z */
/* loaded from: classes.dex */
public abstract class AbstractC1869z {

    /* renamed from: a */
    public static final java.util.regex.Pattern f7600a = java.util.regex.Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b */
    public static final java.util.regex.Pattern f7601b = java.util.regex.Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c */
    public static final java.util.regex.Pattern f7602c = java.util.regex.Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d */
    public static final java.util.regex.Pattern f7603d = java.util.regex.Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e */
    public static final java.util.regex.Pattern f7604e = java.util.regex.Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f */
    public static final java.util.regex.Pattern f7605f = java.util.regex.Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g */
    public static final java.lang.String f7606g = new java.lang.String(new byte[]{10});

    /* renamed from: h */
    public static final java.lang.String f7607h = new java.lang.String(new byte[]{13, 10});

    /* renamed from: a */
    public static int m3843a(java.lang.String str) {
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
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return 7;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 9;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 11;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
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

    /* renamed from: b */
    public static p129f2.C1415c0 m3844b(java.lang.String str) {
        if (str == null) {
            p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
            return p129f2.C1415c0.f5744p;
        }
        p129f2.AbstractC1444r.m3226e("initialCapacity", 4);
        java.lang.Object[] objArr = new java.lang.Object[4];
        int i4 = p086W.AbstractC0805y.f2801a;
        int i5 = 0;
        for (java.lang.String str2 : str.split(",\\s?", -1)) {
            int m3843a = m3843a(str2);
            if (m3843a != 0) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(m3843a);
                int i6 = i5 + 1;
                if (objArr.length < i6) {
                    objArr = java.util.Arrays.copyOf(objArr, p129f2.AbstractC1387C.m3144e(objArr.length, i6));
                }
                objArr[i5] = valueOf;
                i5 = i6;
            }
        }
        return p129f2.AbstractC1393I.m3160h(i5, objArr);
    }

    /* renamed from: c */
    public static p028G0.C0235c m3845c(java.lang.String str) {
        long parseInt;
        java.util.regex.Matcher matcher = f7603d.matcher(str);
        if (!matcher.matches()) {
            throw p076T.C0666I.m1203b(str, null);
        }
        java.lang.String group = matcher.group(1);
        group.getClass();
        if (matcher.group(2) != null) {
            try {
                parseInt = java.lang.Integer.parseInt(r0) * 1000;
            } catch (java.lang.NumberFormatException e4) {
                throw p076T.C0666I.m1203b(str, e4);
            }
        } else {
            parseInt = 60000;
        }
        return new p028G0.C0235c(group, parseInt, 6);
    }

    /* renamed from: d */
    public static p025F1.C0209a m3846d(android.net.Uri uri) {
        java.lang.String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        int i4 = p086W.AbstractC0805y.f2801a;
        java.lang.String[] split = userInfo.split(":", 2);
        return new p025F1.C0209a(2, split[0], split[1]);
    }

    /* renamed from: e */
    public static p086W.C0796p m3847e(java.lang.String str) {
        java.util.regex.Matcher matcher = f7604e.matcher(str);
        if (matcher.find()) {
            java.lang.String group = matcher.group(1);
            group.getClass();
            java.lang.String group2 = matcher.group(3);
            group2.getClass();
            java.lang.String group3 = matcher.group(4);
            return new p086W.C0796p(2, group, group2, group3 != null ? group3 : "");
        }
        java.util.regex.Matcher matcher2 = f7605f.matcher(str);
        if (matcher2.matches()) {
            java.lang.String group4 = matcher2.group(1);
            group4.getClass();
            return new p086W.C0796p(1, group4, "", "");
        }
        throw p076T.C0666I.m1203b("Invalid WWW-Authenticate header " + str, null);
    }

    /* renamed from: f */
    public static android.net.Uri m3848f(android.net.Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        java.lang.String authority = uri.getAuthority();
        authority.getClass();
        p086W.AbstractC0781a.m1416e(authority.contains("@"));
        int i4 = p086W.AbstractC0805y.f2801a;
        return uri.buildUpon().encodedAuthority(authority.split("@", -1)[1]).build();
    }

    /* renamed from: g */
    public static p129f2.C1415c0 m3849g(p161m0.C1836A c1836a) {
        p086W.AbstractC0781a.m1416e(c1836a.f7404c.m3822c("CSeq") != null);
        p129f2.C1390F c1390f = new p129f2.C1390F();
        c1390f.m3147c(p086W.AbstractC0805y.m1620o("%s %s %s", m3850h(c1836a.f7403b), c1836a.f7402a, "RTSP/1.0"));
        p129f2.C1394J m3821a = c1836a.f7404c.m3821a();
        p129f2.AbstractC1445r0 it = m3821a.m3173e().iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            p129f2.AbstractC1393I m3172d = m3821a.m3172d(str);
            for (int i4 = 0; i4 < m3172d.size(); i4++) {
                c1390f.m3147c(p086W.AbstractC0805y.m1620o("%s: %s", str, m3172d.get(i4)));
            }
        }
        c1390f.m3147c("");
        c1390f.m3147c(c1836a.f7405d);
        return c1390f.m3157g();
    }

    /* renamed from: h */
    public static java.lang.String m3850h(int i4) {
        switch (i4) {
            case 1:
                return "ANNOUNCE";
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return "DESCRIBE";
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return "GET_PARAMETER";
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return "OPTIONS";
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                return "PAUSE";
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "PLAY";
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                return "PLAY_NOTIFY";
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
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
                throw new java.lang.IllegalStateException();
        }
    }
}
