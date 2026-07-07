package p136h0;

/* renamed from: h0.o */
/* loaded from: classes.dex */
public final class C1498o implements p197u0.InterfaceC2229p {

    /* renamed from: l */
    public final p136h0.C1495l f6204l;

    /* renamed from: m */
    public final p136h0.C1492i f6205m;

    /* renamed from: n */
    public static final java.util.regex.Pattern f6191n = java.util.regex.Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: o */
    public static final java.util.regex.Pattern f6192o = java.util.regex.Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: p */
    public static final java.util.regex.Pattern f6193p = java.util.regex.Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: q */
    public static final java.util.regex.Pattern f6194q = java.util.regex.Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: r */
    public static final java.util.regex.Pattern f6195r = java.util.regex.Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: s */
    public static final java.util.regex.Pattern f6196s = java.util.regex.Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: t */
    public static final java.util.regex.Pattern f6197t = java.util.regex.Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: u */
    public static final java.util.regex.Pattern f6198u = java.util.regex.Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: v */
    public static final java.util.regex.Pattern f6199v = java.util.regex.Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: w */
    public static final java.util.regex.Pattern f6200w = java.util.regex.Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: x */
    public static final java.util.regex.Pattern f6201x = java.util.regex.Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: y */
    public static final java.util.regex.Pattern f6202y = java.util.regex.Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: z */
    public static final java.util.regex.Pattern f6203z = java.util.regex.Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: A */
    public static final java.util.regex.Pattern f6152A = java.util.regex.Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: B */
    public static final java.util.regex.Pattern f6153B = java.util.regex.Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: C */
    public static final java.util.regex.Pattern f6154C = java.util.regex.Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: D */
    public static final java.util.regex.Pattern f6155D = m3322a("CAN-SKIP-DATERANGES");

    /* renamed from: E */
    public static final java.util.regex.Pattern f6156E = java.util.regex.Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: F */
    public static final java.util.regex.Pattern f6157F = java.util.regex.Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: G */
    public static final java.util.regex.Pattern f6158G = java.util.regex.Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: H */
    public static final java.util.regex.Pattern f6159H = m3322a("CAN-BLOCK-RELOAD");

    /* renamed from: I */
    public static final java.util.regex.Pattern f6160I = java.util.regex.Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: J */
    public static final java.util.regex.Pattern f6161J = java.util.regex.Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: K */
    public static final java.util.regex.Pattern f6162K = java.util.regex.Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: L */
    public static final java.util.regex.Pattern f6163L = java.util.regex.Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: M */
    public static final java.util.regex.Pattern f6164M = java.util.regex.Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: N */
    public static final java.util.regex.Pattern f6165N = java.util.regex.Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: O */
    public static final java.util.regex.Pattern f6166O = java.util.regex.Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: P */
    public static final java.util.regex.Pattern f6167P = java.util.regex.Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: Q */
    public static final java.util.regex.Pattern f6168Q = java.util.regex.Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: R */
    public static final java.util.regex.Pattern f6169R = java.util.regex.Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: S */
    public static final java.util.regex.Pattern f6170S = java.util.regex.Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: T */
    public static final java.util.regex.Pattern f6171T = java.util.regex.Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: U */
    public static final java.util.regex.Pattern f6172U = java.util.regex.Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: V */
    public static final java.util.regex.Pattern f6173V = java.util.regex.Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: W */
    public static final java.util.regex.Pattern f6174W = java.util.regex.Pattern.compile("IV=([^,.*]+)");

    /* renamed from: X */
    public static final java.util.regex.Pattern f6175X = java.util.regex.Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: Y */
    public static final java.util.regex.Pattern f6176Y = java.util.regex.Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: Z */
    public static final java.util.regex.Pattern f6177Z = java.util.regex.Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: a0 */
    public static final java.util.regex.Pattern f6178a0 = java.util.regex.Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: b0 */
    public static final java.util.regex.Pattern f6179b0 = java.util.regex.Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: c0 */
    public static final java.util.regex.Pattern f6180c0 = java.util.regex.Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: d0 */
    public static final java.util.regex.Pattern f6181d0 = java.util.regex.Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: e0 */
    public static final java.util.regex.Pattern f6182e0 = m3322a("AUTOSELECT");

    /* renamed from: f0 */
    public static final java.util.regex.Pattern f6183f0 = m3322a("DEFAULT");

    /* renamed from: g0 */
    public static final java.util.regex.Pattern f6184g0 = m3322a("FORCED");

    /* renamed from: h0 */
    public static final java.util.regex.Pattern f6185h0 = m3322a("INDEPENDENT");

    /* renamed from: i0 */
    public static final java.util.regex.Pattern f6186i0 = m3322a("GAP");

    /* renamed from: j0 */
    public static final java.util.regex.Pattern f6187j0 = m3322a("PRECISE");

    /* renamed from: k0 */
    public static final java.util.regex.Pattern f6188k0 = java.util.regex.Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: l0 */
    public static final java.util.regex.Pattern f6189l0 = java.util.regex.Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: m0 */
    public static final java.util.regex.Pattern f6190m0 = java.util.regex.Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public C1498o(p136h0.C1495l c1495l, p136h0.C1492i c1492i) {
        this.f6204l = c1495l;
        this.f6205m = c1492i;
    }

    /* renamed from: a */
    public static java.util.regex.Pattern m3322a(java.lang.String str) {
        return java.util.regex.Pattern.compile(str.concat("=(NO|YES)"));
    }

    /* renamed from: b */
    public static p076T.C0699m m3323b(java.lang.String str, p076T.C0698l[] c0698lArr) {
        p076T.C0698l[] c0698lArr2 = new p076T.C0698l[c0698lArr.length];
        for (int i4 = 0; i4 < c0698lArr.length; i4++) {
            p076T.C0698l c0698l = c0698lArr[i4];
            c0698lArr2[i4] = new p076T.C0698l(c0698l.f2341m, c0698l.f2342n, c0698l.f2343o, null);
        }
        return new p076T.C0699m(str, true, c0698lArr2);
    }

    /* renamed from: c */
    public static p076T.C0698l m3324c(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap) {
        java.lang.String m3330i = m3330i(str, f6172U, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        java.util.regex.Pattern pattern = f6173V;
        if (equals) {
            java.lang.String m3331j = m3331j(str, pattern, hashMap);
            return new p076T.C0698l(p076T.AbstractC0693g.f2323d, null, "video/mp4", android.util.Base64.decode(m3331j.substring(m3331j.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            java.util.UUID uuid = p076T.AbstractC0693g.f2323d;
            int i4 = p086W.AbstractC0805y.f2801a;
            return new p076T.C0698l(uuid, null, "hls", str.getBytes(p124e2.AbstractC1356d.f5630c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(m3330i)) {
            return null;
        }
        java.lang.String m3331j2 = m3331j(str, pattern, hashMap);
        byte[] decode = android.util.Base64.decode(m3331j2.substring(m3331j2.indexOf(44)), 0);
        java.util.UUID uuid2 = p076T.AbstractC0693g.f2324e;
        return new p076T.C0698l(uuid2, null, "video/mp4", p073S0.AbstractC0642t.m1167a(uuid2, null, decode));
    }

    /* renamed from: d */
    public static p136h0.C1492i m3325d(p136h0.C1495l c1495l, p136h0.C1492i c1492i, android.support.v4.media.session.C1061t c1061t, java.lang.String str) {
        int i4;
        java.lang.String str2;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        p136h0.C1487d c1487d;
        java.util.ArrayList arrayList;
        java.lang.String str3;
        p136h0.C1487d c1487d2;
        int i5;
        java.lang.String str4;
        java.util.HashMap hashMap3;
        int i6;
        long j4;
        long j5;
        java.util.HashMap hashMap4;
        p136h0.C1489f c1489f;
        p076T.C0699m c0699m;
        p136h0.C1495l c1495l2 = c1495l;
        p136h0.C1492i c1492i2 = c1492i;
        boolean z4 = c1495l2.f6151c;
        java.util.HashMap hashMap5 = new java.util.HashMap();
        java.util.HashMap hashMap6 = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        p136h0.C1491h c1491h = new p136h0.C1491h(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.String str5 = "";
        boolean z5 = z4;
        p136h0.C1491h c1491h2 = c1491h;
        java.lang.String str6 = "";
        long j6 = -1;
        int i7 = 0;
        boolean z6 = false;
        long j7 = -9223372036854775807L;
        long j8 = 0;
        boolean z7 = false;
        int i8 = 0;
        long j9 = 0;
        int i9 = 1;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        boolean z8 = false;
        p076T.C0699m c0699m2 = null;
        long j12 = 0;
        p076T.C0699m c0699m3 = null;
        long j13 = 0;
        long j14 = 0;
        boolean z9 = false;
        java.lang.String str7 = null;
        java.lang.String str8 = null;
        java.lang.String str9 = null;
        int i10 = 0;
        long j15 = 0;
        boolean z10 = false;
        p136h0.C1489f c1489f2 = null;
        long j16 = 0;
        long j17 = 0;
        java.util.ArrayList arrayList6 = arrayList3;
        p136h0.C1487d c1487d3 = null;
        while (c1061t.m2233l0()) {
            java.lang.String m2237p0 = c1061t.m2237p0();
            if (m2237p0.startsWith("#EXT")) {
                arrayList5.add(m2237p0);
            }
            if (m2237p0.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                java.lang.String m3331j = m3331j(m2237p0, f6153B, hashMap5);
                if ("VOD".equals(m3331j)) {
                    i7 = 1;
                } else if ("EVENT".equals(m3331j)) {
                    i7 = 2;
                }
            } else if (m2237p0.equals("#EXT-X-I-FRAMES-ONLY")) {
                z10 = true;
            } else {
                if (m2237p0.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long parseDouble = (long) (java.lang.Double.parseDouble(m3331j(m2237p0, f6165N, java.util.Collections.emptyMap())) * 1000000.0d);
                    z6 = m3327f(m2237p0, f6187j0);
                    j7 = parseDouble;
                } else {
                    str2 = str5;
                    if (m2237p0.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double m3328g = m3328g(m2237p0, f6154C);
                        long j18 = m3328g == -9.223372036854776E18d ? -9223372036854775807L : (long) (m3328g * 1000000.0d);
                        boolean m3327f = m3327f(m2237p0, f6155D);
                        double m3328g2 = m3328g(m2237p0, f6157F);
                        long j19 = m3328g2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (m3328g2 * 1000000.0d);
                        double m3328g3 = m3328g(m2237p0, f6158G);
                        c1491h2 = new p136h0.C1491h(j18, m3327f, j19, m3328g3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (m3328g3 * 1000000.0d), m3327f(m2237p0, f6159H));
                    } else if (m2237p0.startsWith("#EXT-X-PART-INF")) {
                        j11 = (long) (java.lang.Double.parseDouble(m3331j(m2237p0, f6203z, java.util.Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean startsWith = m2237p0.startsWith("#EXT-X-MAP");
                        java.util.regex.Pattern pattern = f6167P;
                        boolean z11 = z6;
                        java.util.regex.Pattern pattern2 = f6173V;
                        if (startsWith) {
                            java.lang.String m3331j2 = m3331j(m2237p0, pattern2, hashMap5);
                            java.lang.String m3330i = m3330i(m2237p0, pattern, null, hashMap5);
                            if (m3330i != null) {
                                int i11 = p086W.AbstractC0805y.f2801a;
                                java.lang.String[] split = m3330i.split("@", -1);
                                j6 = java.lang.Long.parseLong(split[0]);
                                if (split.length > 1) {
                                    j12 = java.lang.Long.parseLong(split[1]);
                                }
                            }
                            if (j6 == -1) {
                                j12 = 0;
                            }
                            if (str7 != null && str8 == null) {
                                throw p076T.C0666I.m1203b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            c1489f2 = new p136h0.C1489f(m3331j2, j12, j6, str7, str8);
                            if (j6 != -1) {
                                j12 += j6;
                            }
                            j6 = -1;
                            str5 = str2;
                            z6 = z11;
                        } else {
                            java.util.ArrayList arrayList7 = arrayList6;
                            java.util.ArrayList arrayList8 = arrayList5;
                            if (m2237p0.startsWith("#EXT-X-TARGETDURATION")) {
                                j10 = java.lang.Integer.parseInt(m3331j(m2237p0, f6201x, java.util.Collections.emptyMap())) * 1000000;
                            } else if (m2237p0.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j13 = java.lang.Long.parseLong(m3331j(m2237p0, f6160I, java.util.Collections.emptyMap()));
                                j9 = j13;
                            } else if (m2237p0.startsWith("#EXT-X-VERSION")) {
                                i9 = java.lang.Integer.parseInt(m3331j(m2237p0, f6152A, java.util.Collections.emptyMap()));
                            } else {
                                if (m2237p0.startsWith("#EXT-X-DEFINE")) {
                                    java.lang.String m3330i2 = m3330i(m2237p0, f6189l0, null, hashMap5);
                                    if (m3330i2 != null) {
                                        java.lang.String str10 = (java.lang.String) c1495l2.f6147j.get(m3330i2);
                                        if (str10 != null) {
                                            hashMap5.put(m3330i2, str10);
                                        }
                                    } else {
                                        hashMap5.put(m3331j(m2237p0, f6178a0, hashMap5), m3331j(m2237p0, f6188k0, hashMap5));
                                    }
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    c1487d = c1487d3;
                                    arrayList = arrayList7;
                                    str3 = str9;
                                } else if (m2237p0.startsWith("#EXTINF")) {
                                    j16 = new java.math.BigDecimal(m3331j(m2237p0, f6161J, java.util.Collections.emptyMap())).multiply(new java.math.BigDecimal(1000000L)).longValue();
                                    str6 = m3330i(m2237p0, f6162K, str2, hashMap5);
                                    str5 = str2;
                                    arrayList6 = arrayList7;
                                    z6 = z11;
                                    arrayList5 = arrayList8;
                                } else {
                                    java.lang.String str11 = str2;
                                    if (m2237p0.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = java.lang.Integer.parseInt(m3331j(m2237p0, f6156E, java.util.Collections.emptyMap()));
                                        p086W.AbstractC0781a.m1421j(c1492i2 != null && arrayList2.isEmpty());
                                        int i12 = p086W.AbstractC0805y.f2801a;
                                        int i13 = (int) (j9 - c1492i2.f6119k);
                                        int i14 = parseInt + i13;
                                        if (i13 >= 0) {
                                            p129f2.AbstractC1393I abstractC1393I = c1492i2.f6126r;
                                            if (i14 <= abstractC1393I.size()) {
                                                while (i13 < i14) {
                                                    p136h0.C1489f c1489f3 = (p136h0.C1489f) abstractC1393I.get(i13);
                                                    if (j9 != c1492i2.f6119k) {
                                                        int i15 = (c1492i2.f6118j - i8) + c1489f3.f6099o;
                                                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                                                        long j20 = j15;
                                                        int i16 = 0;
                                                        while (true) {
                                                            p129f2.AbstractC1393I abstractC1393I2 = c1489f3.f6095x;
                                                            i5 = i14;
                                                            if (i16 >= abstractC1393I2.size()) {
                                                                break;
                                                            }
                                                            p136h0.C1487d c1487d4 = (p136h0.C1487d) abstractC1393I2.get(i16);
                                                            arrayList9.add(new p136h0.C1487d(c1487d4.f6096l, c1487d4.f6097m, c1487d4.f6098n, i15, j20, c1487d4.f6101q, c1487d4.f6102r, c1487d4.f6103s, c1487d4.f6104t, c1487d4.f6105u, c1487d4.f6106v, c1487d4.f6089w, c1487d4.f6090x));
                                                            j20 += c1487d4.f6098n;
                                                            i16++;
                                                            hashMap6 = hashMap6;
                                                            i14 = i5;
                                                            str11 = str11;
                                                            c1487d3 = c1487d3;
                                                        }
                                                        c1487d2 = c1487d3;
                                                        str4 = str11;
                                                        hashMap3 = hashMap6;
                                                        c1489f3 = new p136h0.C1489f(c1489f3.f6096l, c1489f3.f6097m, c1489f3.f6094w, c1489f3.f6098n, i15, j15, c1489f3.f6101q, c1489f3.f6102r, c1489f3.f6103s, c1489f3.f6104t, c1489f3.f6105u, c1489f3.f6106v, arrayList9);
                                                    } else {
                                                        c1487d2 = c1487d3;
                                                        i5 = i14;
                                                        str4 = str11;
                                                        hashMap3 = hashMap6;
                                                    }
                                                    arrayList2.add(c1489f3);
                                                    j15 += c1489f3.f6098n;
                                                    long j21 = c1489f3.f6105u;
                                                    if (j21 != -1) {
                                                        j12 = c1489f3.f6104t + j21;
                                                    }
                                                    java.lang.String str12 = c1489f3.f6103s;
                                                    if (str12 == null || !str12.equals(java.lang.Long.toHexString(j13))) {
                                                        str8 = str12;
                                                    }
                                                    j13++;
                                                    i13++;
                                                    i10 = c1489f3.f6099o;
                                                    c1489f2 = c1489f3.f6097m;
                                                    c0699m3 = c1489f3.f6101q;
                                                    str7 = c1489f3.f6102r;
                                                    hashMap6 = hashMap3;
                                                    i14 = i5;
                                                    j14 = j15;
                                                    str11 = str4;
                                                    c1487d3 = c1487d2;
                                                    c1492i2 = c1492i;
                                                }
                                                str2 = str11;
                                                c1495l2 = c1495l;
                                                c1492i2 = c1492i;
                                            }
                                        }
                                        throw new java.io.IOException();
                                    }
                                    c1487d = c1487d3;
                                    str2 = str11;
                                    java.util.HashMap hashMap7 = hashMap6;
                                    if (m2237p0.startsWith("#EXT-X-KEY")) {
                                        java.lang.String m3331j3 = m3331j(m2237p0, f6170S, hashMap5);
                                        java.lang.String m3330i3 = m3330i(m2237p0, f6171T, "identity", hashMap5);
                                        if ("NONE".equals(m3331j3)) {
                                            treeMap.clear();
                                            c0699m3 = null;
                                            str7 = null;
                                            str8 = null;
                                        } else {
                                            java.lang.String m3330i4 = m3330i(m2237p0, f6174W, null, hashMap5);
                                            if (!"identity".equals(m3330i3)) {
                                                java.lang.String str13 = str9;
                                                if (str13 == null) {
                                                    str9 = ("SAMPLE-AES-CENC".equals(m3331j3) || "SAMPLE-AES-CTR".equals(m3331j3)) ? "cenc" : "cbcs";
                                                } else {
                                                    str9 = str13;
                                                }
                                                p076T.C0698l m3324c = m3324c(m2237p0, m3330i3, hashMap5);
                                                if (m3324c != null) {
                                                    treeMap.put(m3330i3, m3324c);
                                                    str8 = m3330i4;
                                                    c0699m3 = null;
                                                    str7 = null;
                                                }
                                            } else if ("AES-128".equals(m3331j3)) {
                                                str7 = m3331j(m2237p0, pattern2, hashMap5);
                                                str8 = m3330i4;
                                            }
                                            str8 = m3330i4;
                                            str7 = null;
                                        }
                                        c1495l2 = c1495l;
                                        c1492i2 = c1492i;
                                        hashMap6 = hashMap7;
                                    } else {
                                        str3 = str9;
                                        if (m2237p0.startsWith("#EXT-X-BYTERANGE")) {
                                            java.lang.String m3331j4 = m3331j(m2237p0, f6166O, hashMap5);
                                            int i17 = p086W.AbstractC0805y.f2801a;
                                            java.lang.String[] split2 = m3331j4.split("@", -1);
                                            j6 = java.lang.Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j12 = java.lang.Long.parseLong(split2[1]);
                                            }
                                        } else if (m2237p0.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i8 = java.lang.Integer.parseInt(m2237p0.substring(m2237p0.indexOf(58) + 1));
                                            c1495l2 = c1495l;
                                            c1492i2 = c1492i;
                                            z7 = true;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                        } else if (m2237p0.equals("#EXT-X-DISCONTINUITY")) {
                                            i10++;
                                        } else if (m2237p0.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j8 == 0) {
                                                j8 = p086W.AbstractC0805y.m1592M(p086W.AbstractC0805y.m1595P(m2237p0.substring(m2237p0.indexOf(58) + 1))) - j15;
                                            } else {
                                                hashMap = hashMap5;
                                                arrayList = arrayList7;
                                                hashMap2 = hashMap7;
                                            }
                                        } else if (m2237p0.equals("#EXT-X-GAP")) {
                                            c1495l2 = c1495l;
                                            c1492i2 = c1492i;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z6 = z11;
                                            arrayList5 = arrayList8;
                                            c1487d3 = c1487d;
                                            z9 = true;
                                        } else if (m2237p0.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            c1495l2 = c1495l;
                                            c1492i2 = c1492i;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z6 = z11;
                                            arrayList5 = arrayList8;
                                            c1487d3 = c1487d;
                                            z5 = true;
                                        } else if (m2237p0.equals("#EXT-X-ENDLIST")) {
                                            c1495l2 = c1495l;
                                            c1492i2 = c1492i;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z6 = z11;
                                            arrayList5 = arrayList8;
                                            c1487d3 = c1487d;
                                            z8 = true;
                                        } else {
                                            if (m2237p0.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long m3329h = m3329h(m2237p0, f6163L);
                                                java.util.regex.Matcher matcher = f6164M.matcher(m2237p0);
                                                if (matcher.find()) {
                                                    java.lang.String group = matcher.group(1);
                                                    group.getClass();
                                                    i6 = java.lang.Integer.parseInt(group);
                                                } else {
                                                    i6 = -1;
                                                }
                                                arrayList4.add(new p136h0.C1488e(i6, m3329h, android.net.Uri.parse(p086W.AbstractC0781a.m1435x(str, m3331j(m2237p0, pattern2, hashMap5)))));
                                            } else if (m2237p0.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (c1487d == null && "PART".equals(m3331j(m2237p0, f6176Y, hashMap5))) {
                                                    java.lang.String m3331j5 = m3331j(m2237p0, pattern2, hashMap5);
                                                    long m3329h2 = m3329h(m2237p0, f6168Q);
                                                    long m3329h3 = m3329h(m2237p0, f6169R);
                                                    java.lang.String hexString = str7 == null ? null : str8 != null ? str8 : java.lang.Long.toHexString(j13);
                                                    if (c0699m3 == null && !treeMap.isEmpty()) {
                                                        p076T.C0698l[] c0698lArr = (p076T.C0698l[]) treeMap.values().toArray(new p076T.C0698l[0]);
                                                        p076T.C0699m c0699m4 = new p076T.C0699m(str3, true, c0698lArr);
                                                        if (c0699m2 == null) {
                                                            c0699m2 = m3323b(str3, c0698lArr);
                                                        }
                                                        c0699m3 = c0699m4;
                                                    }
                                                    if (m3329h2 == -1 || m3329h3 != -1) {
                                                        c1487d = new p136h0.C1487d(m3331j5, c1489f2, 0L, i10, j14, c0699m3, str7, hexString, m3329h2 != -1 ? m3329h2 : 0L, m3329h3, false, false, true);
                                                    }
                                                }
                                            } else if (m2237p0.startsWith("#EXT-X-PART")) {
                                                java.lang.String hexString2 = str7 == null ? null : str8 != null ? str8 : java.lang.Long.toHexString(j13);
                                                java.lang.String m3331j6 = m3331j(m2237p0, pattern2, hashMap5);
                                                long parseDouble2 = (long) (java.lang.Double.parseDouble(m3331j(m2237p0, f6202y, java.util.Collections.emptyMap())) * 1000000.0d);
                                                boolean m3327f2 = m3327f(m2237p0, f6185h0) | (z5 && arrayList7.isEmpty());
                                                boolean m3327f3 = m3327f(m2237p0, f6186i0);
                                                java.lang.String m3330i5 = m3330i(m2237p0, pattern, null, hashMap5);
                                                if (m3330i5 != null) {
                                                    int i18 = p086W.AbstractC0805y.f2801a;
                                                    java.lang.String[] split3 = m3330i5.split("@", -1);
                                                    j4 = java.lang.Long.parseLong(split3[0]);
                                                    if (split3.length > 1) {
                                                        j17 = java.lang.Long.parseLong(split3[1]);
                                                    }
                                                } else {
                                                    j4 = -1;
                                                }
                                                if (j4 == -1) {
                                                    j17 = 0;
                                                }
                                                if (c0699m3 == null && !treeMap.isEmpty()) {
                                                    p076T.C0698l[] c0698lArr2 = (p076T.C0698l[]) treeMap.values().toArray(new p076T.C0698l[0]);
                                                    p076T.C0699m c0699m5 = new p076T.C0699m(str3, true, c0698lArr2);
                                                    if (c0699m2 == null) {
                                                        c0699m2 = m3323b(str3, c0698lArr2);
                                                    }
                                                    c0699m3 = c0699m5;
                                                }
                                                arrayList7.add(new p136h0.C1487d(m3331j6, c1489f2, parseDouble2, i10, j14, c0699m3, str7, hexString2, j17, j4, m3327f3, m3327f2, false));
                                                j14 += parseDouble2;
                                                if (j4 != -1) {
                                                    j17 += j4;
                                                }
                                                c1495l2 = c1495l;
                                                c1492i2 = c1492i;
                                                hashMap6 = hashMap7;
                                                str9 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                z6 = z11;
                                                arrayList5 = arrayList8;
                                                c1487d3 = c1487d;
                                            } else {
                                                arrayList = arrayList7;
                                                if (m2237p0.startsWith("#")) {
                                                    hashMap = hashMap5;
                                                    hashMap2 = hashMap7;
                                                } else {
                                                    java.lang.String hexString3 = str7 == null ? null : str8 != null ? str8 : java.lang.Long.toHexString(j13);
                                                    long j22 = j13 + 1;
                                                    java.lang.String m3332k = m3332k(m2237p0, hashMap5);
                                                    p136h0.C1489f c1489f4 = (p136h0.C1489f) hashMap7.get(m3332k);
                                                    if (j6 == -1) {
                                                        j5 = 0;
                                                    } else {
                                                        if (z10 && c1489f2 == null && c1489f4 == null) {
                                                            c1489f4 = new p136h0.C1489f(m3332k, 0L, j12, null, null);
                                                            hashMap7.put(m3332k, c1489f4);
                                                        }
                                                        j5 = j12;
                                                    }
                                                    if (c0699m3 != null || treeMap.isEmpty()) {
                                                        hashMap4 = hashMap5;
                                                        c1489f = c1489f4;
                                                        c0699m = c0699m3;
                                                    } else {
                                                        hashMap4 = hashMap5;
                                                        c1489f = c1489f4;
                                                        p076T.C0698l[] c0698lArr3 = (p076T.C0698l[]) treeMap.values().toArray(new p076T.C0698l[0]);
                                                        c0699m = new p076T.C0699m(str3, true, c0698lArr3);
                                                        if (c0699m2 == null) {
                                                            c0699m2 = m3323b(str3, c0698lArr3);
                                                        }
                                                    }
                                                    arrayList2.add(new p136h0.C1489f(m3332k, c1489f2 != null ? c1489f2 : c1489f, str6, j16, i10, j15, c0699m, str7, hexString3, j5, j6, z9, arrayList));
                                                    j14 = j15 + j16;
                                                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                                                    if (j6 != -1) {
                                                        j5 += j6;
                                                    }
                                                    j12 = j5;
                                                    c1492i2 = c1492i;
                                                    arrayList6 = arrayList10;
                                                    hashMap6 = hashMap7;
                                                    str9 = str3;
                                                    c0699m3 = c0699m;
                                                    j6 = -1;
                                                    j15 = j14;
                                                    j13 = j22;
                                                    hashMap5 = hashMap4;
                                                    str5 = str2;
                                                    str6 = str5;
                                                    z6 = z11;
                                                    arrayList5 = arrayList8;
                                                    c1487d3 = c1487d;
                                                    z9 = false;
                                                    j16 = 0;
                                                    c1495l2 = c1495l;
                                                }
                                            }
                                            hashMap = hashMap5;
                                            arrayList = arrayList7;
                                            hashMap2 = hashMap7;
                                        }
                                        c1495l2 = c1495l;
                                        c1492i2 = c1492i;
                                        hashMap6 = hashMap7;
                                        str9 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str5 = str2;
                                    z6 = z11;
                                    arrayList5 = arrayList8;
                                    c1487d3 = c1487d;
                                }
                                c1495l2 = c1495l;
                                c1492i2 = c1492i;
                                hashMap6 = hashMap2;
                                str9 = str3;
                                arrayList6 = arrayList;
                                hashMap5 = hashMap;
                                str5 = str2;
                                z6 = z11;
                                arrayList5 = arrayList8;
                                c1487d3 = c1487d;
                            }
                            arrayList6 = arrayList7;
                            str5 = str2;
                            z6 = z11;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                str5 = str2;
            }
        }
        p136h0.C1487d c1487d5 = c1487d3;
        java.util.ArrayList arrayList11 = arrayList6;
        java.util.ArrayList arrayList12 = arrayList5;
        boolean z12 = z6;
        java.util.HashMap hashMap8 = new java.util.HashMap();
        int i19 = 0;
        while (i19 < arrayList4.size()) {
            p136h0.C1488e c1488e = (p136h0.C1488e) arrayList4.get(i19);
            long j23 = c1488e.f6092b;
            if (j23 == -1) {
                j23 = (j9 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int i20 = c1488e.f6093c;
            if (i20 != -1 || j11 == -9223372036854775807L) {
                i4 = 1;
            } else {
                i4 = 1;
                i20 = (arrayList11.isEmpty() ? ((p136h0.C1489f) p129f2.AbstractC1444r.m3232l(arrayList2)).f6095x : arrayList11).size() - 1;
            }
            android.net.Uri uri = c1488e.f6091a;
            hashMap8.put(uri, new p136h0.C1488e(i20, j23, uri));
            i19 += i4;
        }
        if (c1487d5 != null) {
            arrayList11.add(c1487d5);
        }
        return new p136h0.C1492i(i7, str, arrayList12, j7, z12, j8, z7, i8, j9, i9, j10, j11, z5, z8, j8 != 0, c0699m2, arrayList2, arrayList11, c1491h2, hashMap8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x015d, code lost:
    
        if (r9 > 0) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x03bf. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p136h0.C1495l m3326e(android.support.v4.media.session.C1061t r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p136h0.C1498o.m3326e(android.support.v4.media.session.t, java.lang.String):h0.l");
    }

    /* renamed from: f */
    public static boolean m3327f(java.lang.String str, java.util.regex.Pattern pattern) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* renamed from: g */
    public static double m3328g(java.lang.String str, java.util.regex.Pattern pattern) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        java.lang.String group = matcher.group(1);
        group.getClass();
        return java.lang.Double.parseDouble(group);
    }

    /* renamed from: h */
    public static long m3329h(java.lang.String str, java.util.regex.Pattern pattern) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        java.lang.String group = matcher.group(1);
        group.getClass();
        return java.lang.Long.parseLong(group);
    }

    /* renamed from: i */
    public static java.lang.String m3330i(java.lang.String str, java.util.regex.Pattern pattern, java.lang.String str2, java.util.Map map) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m3332k(str2, map);
    }

    /* renamed from: j */
    public static java.lang.String m3331j(java.lang.String str, java.util.regex.Pattern pattern, java.util.Map map) {
        java.lang.String m3330i = m3330i(str, pattern, null, map);
        if (m3330i != null) {
            return m3330i;
        }
        throw p076T.C0666I.m1203b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    /* renamed from: k */
    public static java.lang.String m3332k(java.lang.String str, java.util.Map map) {
        java.util.regex.Matcher matcher = f6190m0.matcher(str);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (matcher.find()) {
            java.lang.String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, java.util.regex.Matcher.quoteReplacement((java.lang.String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0096, LOOP:0: B:13:0x0069->B:38:0x0069, LOOP_START, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:60:0x00fd, B:61:0x0103, B:65:0x0030, B:67:0x0036, B:72:0x003f, B:74:0x0048, B:79:0x0051, B:81:0x0057, B:83:0x005d, B:85:0x0062), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:60:0x00fd, B:61:0x0103, B:65:0x0030, B:67:0x0036, B:72:0x003f, B:74:0x0048, B:79:0x0051, B:81:0x0057, B:83:0x005d, B:85:0x0062), top: B:2:0x000f }] */
    @Override // p197u0.InterfaceC2229p
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo601p(android.net.Uri r7, p094Y.C0872j r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p136h0.C1498o.mo601p(android.net.Uri, Y.j):java.lang.Object");
    }
}
