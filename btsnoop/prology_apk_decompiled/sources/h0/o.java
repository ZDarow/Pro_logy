package h0;

import S0.t;
import T.AbstractC0086g;
import T.C0091l;
import T.C0092m;
import T.I;
import W.y;
import android.net.Uri;
import android.util.Base64;
import f2.r;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class o implements u0.p {

    /* renamed from: l, reason: collision with root package name */
    public final l f5984l;

    /* renamed from: m, reason: collision with root package name */
    public final i f5985m;

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f5973n = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f5974o = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f5975p = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f5976q = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f5977r = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern s = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f5978t = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f5979u = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f5980v = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern w = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f5981x = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f5982y = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f5983z = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f5935A = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f5936B = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f5937C = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f5938D = a("CAN-SKIP-DATERANGES");

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f5939E = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f5940F = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f5941G = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f5942H = a("CAN-BLOCK-RELOAD");

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f5943I = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern J = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f5944K = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: L, reason: collision with root package name */
    public static final Pattern f5945L = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f5946M = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: N, reason: collision with root package name */
    public static final Pattern f5947N = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f5948O = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f5949P = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: Q, reason: collision with root package name */
    public static final Pattern f5950Q = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: R, reason: collision with root package name */
    public static final Pattern f5951R = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: S, reason: collision with root package name */
    public static final Pattern f5952S = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f5953T = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: U, reason: collision with root package name */
    public static final Pattern f5954U = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: V, reason: collision with root package name */
    public static final Pattern f5955V = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: W, reason: collision with root package name */
    public static final Pattern f5956W = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f5957X = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: Y, reason: collision with root package name */
    public static final Pattern f5958Y = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f5959Z = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f5960a0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f5961b0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: c0, reason: collision with root package name */
    public static final Pattern f5962c0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f5963d0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f5964e0 = a("AUTOSELECT");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f5965f0 = a("DEFAULT");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f5966g0 = a("FORCED");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f5967h0 = a("INDEPENDENT");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f5968i0 = a("GAP");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f5969j0 = a("PRECISE");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f5970k0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f5971l0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f5972m0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.f5984l = lVar;
        this.f5985m = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static C0092m b(String str, C0091l[] c0091lArr) {
        C0091l[] c0091lArr2 = new C0091l[c0091lArr.length];
        for (int i4 = 0; i4 < c0091lArr.length; i4++) {
            C0091l c0091l = c0091lArr[i4];
            c0091lArr2[i4] = new C0091l(c0091l.f2261m, c0091l.f2262n, c0091l.f2263o, null);
        }
        return new C0092m(str, true, c0091lArr2);
    }

    public static C0091l c(String str, String str2, HashMap hashMap) {
        String i4 = i(str, f5954U, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f5955V;
        if (equals) {
            String j4 = j(str, pattern, hashMap);
            return new C0091l(AbstractC0086g.f2243d, null, "video/mp4", Base64.decode(j4.substring(j4.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC0086g.f2243d;
            int i5 = y.f2709a;
            return new C0091l(uuid, null, "hls", str.getBytes(e2.d.f5436c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i4)) {
            return null;
        }
        String j5 = j(str, pattern, hashMap);
        byte[] decode = Base64.decode(j5.substring(j5.indexOf(44)), 0);
        UUID uuid2 = AbstractC0086g.f2244e;
        return new C0091l(uuid2, null, "video/mp4", t.a(uuid2, null, decode));
    }

    public static i d(l lVar, i iVar, android.support.v4.media.session.t tVar, String str) {
        int i4;
        String str2;
        HashMap hashMap;
        HashMap hashMap2;
        d dVar;
        ArrayList arrayList;
        String str3;
        d dVar2;
        int i5;
        String str4;
        HashMap hashMap3;
        int i6;
        long j4;
        long j5;
        HashMap hashMap4;
        f fVar;
        C0092m c0092m;
        l lVar2 = lVar;
        i iVar2 = iVar;
        boolean z4 = lVar2.f5934c;
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        h hVar = new h(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z5 = z4;
        h hVar2 = hVar;
        String str6 = "";
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
        C0092m c0092m2 = null;
        long j12 = 0;
        C0092m c0092m3 = null;
        long j13 = 0;
        long j14 = 0;
        boolean z9 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i10 = 0;
        long j15 = 0;
        boolean z10 = false;
        f fVar2 = null;
        long j16 = 0;
        long j17 = 0;
        ArrayList arrayList6 = arrayList3;
        d dVar3 = null;
        while (tVar.l0()) {
            String p02 = tVar.p0();
            if (p02.startsWith("#EXT")) {
                arrayList5.add(p02);
            }
            if (p02.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j18 = j(p02, f5936B, hashMap5);
                if ("VOD".equals(j18)) {
                    i7 = 1;
                } else if ("EVENT".equals(j18)) {
                    i7 = 2;
                }
            } else if (p02.equals("#EXT-X-I-FRAMES-ONLY")) {
                z10 = true;
            } else {
                if (p02.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long parseDouble = (long) (Double.parseDouble(j(p02, f5947N, Collections.emptyMap())) * 1000000.0d);
                    z6 = f(p02, f5969j0);
                    j7 = parseDouble;
                } else {
                    str2 = str5;
                    if (p02.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g4 = g(p02, f5937C);
                        long j19 = g4 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g4 * 1000000.0d);
                        boolean f4 = f(p02, f5938D);
                        double g5 = g(p02, f5940F);
                        long j20 = g5 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g5 * 1000000.0d);
                        double g6 = g(p02, f5941G);
                        hVar2 = new h(j19, f4, j20, g6 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g6 * 1000000.0d), f(p02, f5942H));
                    } else if (p02.startsWith("#EXT-X-PART-INF")) {
                        j11 = (long) (Double.parseDouble(j(p02, f5983z, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean startsWith = p02.startsWith("#EXT-X-MAP");
                        Pattern pattern = f5949P;
                        boolean z11 = z6;
                        Pattern pattern2 = f5955V;
                        if (startsWith) {
                            String j21 = j(p02, pattern2, hashMap5);
                            String i11 = i(p02, pattern, null, hashMap5);
                            if (i11 != null) {
                                int i12 = y.f2709a;
                                String[] split = i11.split("@", -1);
                                j6 = Long.parseLong(split[0]);
                                if (split.length > 1) {
                                    j12 = Long.parseLong(split[1]);
                                }
                            }
                            if (j6 == -1) {
                                j12 = 0;
                            }
                            if (str7 != null && str8 == null) {
                                throw I.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            fVar2 = new f(j21, j12, j6, str7, str8);
                            if (j6 != -1) {
                                j12 += j6;
                            }
                            j6 = -1;
                            str5 = str2;
                            z6 = z11;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (p02.startsWith("#EXT-X-TARGETDURATION")) {
                                j10 = Integer.parseInt(j(p02, f5981x, Collections.emptyMap())) * 1000000;
                            } else if (p02.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j13 = Long.parseLong(j(p02, f5943I, Collections.emptyMap()));
                                j9 = j13;
                            } else if (p02.startsWith("#EXT-X-VERSION")) {
                                i9 = Integer.parseInt(j(p02, f5935A, Collections.emptyMap()));
                            } else {
                                if (p02.startsWith("#EXT-X-DEFINE")) {
                                    String i13 = i(p02, f5971l0, null, hashMap5);
                                    if (i13 != null) {
                                        String str10 = (String) lVar2.f5930j.get(i13);
                                        if (str10 != null) {
                                            hashMap5.put(i13, str10);
                                        }
                                    } else {
                                        hashMap5.put(j(p02, f5960a0, hashMap5), j(p02, f5970k0, hashMap5));
                                    }
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    dVar = dVar3;
                                    arrayList = arrayList7;
                                    str3 = str9;
                                } else if (p02.startsWith("#EXTINF")) {
                                    j16 = new BigDecimal(j(p02, J, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    str6 = i(p02, f5944K, str2, hashMap5);
                                    str5 = str2;
                                    arrayList6 = arrayList7;
                                    z6 = z11;
                                    arrayList5 = arrayList8;
                                } else {
                                    String str11 = str2;
                                    if (p02.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(j(p02, f5939E, Collections.emptyMap()));
                                        W.a.j(iVar2 != null && arrayList2.isEmpty());
                                        int i14 = y.f2709a;
                                        int i15 = (int) (j9 - iVar2.f5903k);
                                        int i16 = parseInt + i15;
                                        if (i15 >= 0) {
                                            f2.I i17 = iVar2.f5910r;
                                            if (i16 <= i17.size()) {
                                                while (i15 < i16) {
                                                    f fVar3 = (f) i17.get(i15);
                                                    if (j9 != iVar2.f5903k) {
                                                        int i18 = (iVar2.f5902j - i8) + fVar3.f5884o;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j22 = j15;
                                                        int i19 = 0;
                                                        while (true) {
                                                            f2.I i20 = fVar3.f5880x;
                                                            i5 = i16;
                                                            if (i19 >= i20.size()) {
                                                                break;
                                                            }
                                                            d dVar4 = (d) i20.get(i19);
                                                            arrayList9.add(new d(dVar4.f5881l, dVar4.f5882m, dVar4.f5883n, i18, j22, dVar4.f5886q, dVar4.f5887r, dVar4.s, dVar4.f5888t, dVar4.f5889u, dVar4.f5890v, dVar4.w, dVar4.f5876x));
                                                            j22 += dVar4.f5883n;
                                                            i19++;
                                                            hashMap6 = hashMap6;
                                                            i16 = i5;
                                                            str11 = str11;
                                                            dVar3 = dVar3;
                                                        }
                                                        dVar2 = dVar3;
                                                        str4 = str11;
                                                        hashMap3 = hashMap6;
                                                        fVar3 = new f(fVar3.f5881l, fVar3.f5882m, fVar3.w, fVar3.f5883n, i18, j15, fVar3.f5886q, fVar3.f5887r, fVar3.s, fVar3.f5888t, fVar3.f5889u, fVar3.f5890v, arrayList9);
                                                    } else {
                                                        dVar2 = dVar3;
                                                        i5 = i16;
                                                        str4 = str11;
                                                        hashMap3 = hashMap6;
                                                    }
                                                    arrayList2.add(fVar3);
                                                    j15 += fVar3.f5883n;
                                                    long j23 = fVar3.f5889u;
                                                    if (j23 != -1) {
                                                        j12 = fVar3.f5888t + j23;
                                                    }
                                                    String str12 = fVar3.s;
                                                    if (str12 == null || !str12.equals(Long.toHexString(j13))) {
                                                        str8 = str12;
                                                    }
                                                    j13++;
                                                    i15++;
                                                    i10 = fVar3.f5884o;
                                                    fVar2 = fVar3.f5882m;
                                                    c0092m3 = fVar3.f5886q;
                                                    str7 = fVar3.f5887r;
                                                    hashMap6 = hashMap3;
                                                    i16 = i5;
                                                    j14 = j15;
                                                    str11 = str4;
                                                    dVar3 = dVar2;
                                                    iVar2 = iVar;
                                                }
                                                str2 = str11;
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                            }
                                        }
                                        throw new IOException();
                                    }
                                    dVar = dVar3;
                                    str2 = str11;
                                    HashMap hashMap7 = hashMap6;
                                    if (p02.startsWith("#EXT-X-KEY")) {
                                        String j24 = j(p02, f5952S, hashMap5);
                                        String i21 = i(p02, f5953T, "identity", hashMap5);
                                        if ("NONE".equals(j24)) {
                                            treeMap.clear();
                                            c0092m3 = null;
                                            str7 = null;
                                            str8 = null;
                                        } else {
                                            String i22 = i(p02, f5956W, null, hashMap5);
                                            if (!"identity".equals(i21)) {
                                                String str13 = str9;
                                                if (str13 == null) {
                                                    str9 = ("SAMPLE-AES-CENC".equals(j24) || "SAMPLE-AES-CTR".equals(j24)) ? "cenc" : "cbcs";
                                                } else {
                                                    str9 = str13;
                                                }
                                                C0091l c4 = c(p02, i21, hashMap5);
                                                if (c4 != null) {
                                                    treeMap.put(i21, c4);
                                                    str8 = i22;
                                                    c0092m3 = null;
                                                    str7 = null;
                                                }
                                            } else if ("AES-128".equals(j24)) {
                                                str7 = j(p02, pattern2, hashMap5);
                                                str8 = i22;
                                            }
                                            str8 = i22;
                                            str7 = null;
                                        }
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        hashMap6 = hashMap7;
                                    } else {
                                        str3 = str9;
                                        if (p02.startsWith("#EXT-X-BYTERANGE")) {
                                            String j25 = j(p02, f5948O, hashMap5);
                                            int i23 = y.f2709a;
                                            String[] split2 = j25.split("@", -1);
                                            j6 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j12 = Long.parseLong(split2[1]);
                                            }
                                        } else if (p02.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i8 = Integer.parseInt(p02.substring(p02.indexOf(58) + 1));
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            z7 = true;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                        } else if (p02.equals("#EXT-X-DISCONTINUITY")) {
                                            i10++;
                                        } else if (p02.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j8 == 0) {
                                                j8 = y.M(y.P(p02.substring(p02.indexOf(58) + 1))) - j15;
                                            } else {
                                                hashMap = hashMap5;
                                                arrayList = arrayList7;
                                                hashMap2 = hashMap7;
                                            }
                                        } else if (p02.equals("#EXT-X-GAP")) {
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z6 = z11;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                            z9 = true;
                                        } else if (p02.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z6 = z11;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                            z5 = true;
                                        } else if (p02.equals("#EXT-X-ENDLIST")) {
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z6 = z11;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                            z8 = true;
                                        } else {
                                            if (p02.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long h4 = h(p02, f5945L);
                                                Matcher matcher = f5946M.matcher(p02);
                                                if (matcher.find()) {
                                                    String group = matcher.group(1);
                                                    group.getClass();
                                                    i6 = Integer.parseInt(group);
                                                } else {
                                                    i6 = -1;
                                                }
                                                arrayList4.add(new e(i6, h4, Uri.parse(W.a.x(str, j(p02, pattern2, hashMap5)))));
                                            } else if (p02.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (dVar == null && "PART".equals(j(p02, f5958Y, hashMap5))) {
                                                    String j26 = j(p02, pattern2, hashMap5);
                                                    long h5 = h(p02, f5950Q);
                                                    long h6 = h(p02, f5951R);
                                                    String hexString = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j13);
                                                    if (c0092m3 == null && !treeMap.isEmpty()) {
                                                        C0091l[] c0091lArr = (C0091l[]) treeMap.values().toArray(new C0091l[0]);
                                                        C0092m c0092m4 = new C0092m(str3, true, c0091lArr);
                                                        if (c0092m2 == null) {
                                                            c0092m2 = b(str3, c0091lArr);
                                                        }
                                                        c0092m3 = c0092m4;
                                                    }
                                                    if (h5 == -1 || h6 != -1) {
                                                        dVar = new d(j26, fVar2, 0L, i10, j14, c0092m3, str7, hexString, h5 != -1 ? h5 : 0L, h6, false, false, true);
                                                    }
                                                }
                                            } else if (p02.startsWith("#EXT-X-PART")) {
                                                String hexString2 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j13);
                                                String j27 = j(p02, pattern2, hashMap5);
                                                long parseDouble2 = (long) (Double.parseDouble(j(p02, f5982y, Collections.emptyMap())) * 1000000.0d);
                                                boolean f5 = f(p02, f5967h0) | (z5 && arrayList7.isEmpty());
                                                boolean f6 = f(p02, f5968i0);
                                                String i24 = i(p02, pattern, null, hashMap5);
                                                if (i24 != null) {
                                                    int i25 = y.f2709a;
                                                    String[] split3 = i24.split("@", -1);
                                                    j4 = Long.parseLong(split3[0]);
                                                    if (split3.length > 1) {
                                                        j17 = Long.parseLong(split3[1]);
                                                    }
                                                } else {
                                                    j4 = -1;
                                                }
                                                if (j4 == -1) {
                                                    j17 = 0;
                                                }
                                                if (c0092m3 == null && !treeMap.isEmpty()) {
                                                    C0091l[] c0091lArr2 = (C0091l[]) treeMap.values().toArray(new C0091l[0]);
                                                    C0092m c0092m5 = new C0092m(str3, true, c0091lArr2);
                                                    if (c0092m2 == null) {
                                                        c0092m2 = b(str3, c0091lArr2);
                                                    }
                                                    c0092m3 = c0092m5;
                                                }
                                                arrayList7.add(new d(j27, fVar2, parseDouble2, i10, j14, c0092m3, str7, hexString2, j17, j4, f6, f5, false));
                                                j14 += parseDouble2;
                                                if (j4 != -1) {
                                                    j17 += j4;
                                                }
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                                hashMap6 = hashMap7;
                                                str9 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                z6 = z11;
                                                arrayList5 = arrayList8;
                                                dVar3 = dVar;
                                            } else {
                                                arrayList = arrayList7;
                                                if (p02.startsWith("#")) {
                                                    hashMap = hashMap5;
                                                    hashMap2 = hashMap7;
                                                } else {
                                                    String hexString3 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j13);
                                                    long j28 = j13 + 1;
                                                    String k4 = k(p02, hashMap5);
                                                    f fVar4 = (f) hashMap7.get(k4);
                                                    if (j6 == -1) {
                                                        j5 = 0;
                                                    } else {
                                                        if (z10 && fVar2 == null && fVar4 == null) {
                                                            fVar4 = new f(k4, 0L, j12, null, null);
                                                            hashMap7.put(k4, fVar4);
                                                        }
                                                        j5 = j12;
                                                    }
                                                    if (c0092m3 != null || treeMap.isEmpty()) {
                                                        hashMap4 = hashMap5;
                                                        fVar = fVar4;
                                                        c0092m = c0092m3;
                                                    } else {
                                                        hashMap4 = hashMap5;
                                                        fVar = fVar4;
                                                        C0091l[] c0091lArr3 = (C0091l[]) treeMap.values().toArray(new C0091l[0]);
                                                        c0092m = new C0092m(str3, true, c0091lArr3);
                                                        if (c0092m2 == null) {
                                                            c0092m2 = b(str3, c0091lArr3);
                                                        }
                                                    }
                                                    arrayList2.add(new f(k4, fVar2 != null ? fVar2 : fVar, str6, j16, i10, j15, c0092m, str7, hexString3, j5, j6, z9, arrayList));
                                                    j14 = j15 + j16;
                                                    ArrayList arrayList10 = new ArrayList();
                                                    if (j6 != -1) {
                                                        j5 += j6;
                                                    }
                                                    j12 = j5;
                                                    iVar2 = iVar;
                                                    arrayList6 = arrayList10;
                                                    hashMap6 = hashMap7;
                                                    str9 = str3;
                                                    c0092m3 = c0092m;
                                                    j6 = -1;
                                                    j15 = j14;
                                                    j13 = j28;
                                                    hashMap5 = hashMap4;
                                                    str5 = str2;
                                                    str6 = str5;
                                                    z6 = z11;
                                                    arrayList5 = arrayList8;
                                                    dVar3 = dVar;
                                                    z9 = false;
                                                    j16 = 0;
                                                    lVar2 = lVar;
                                                }
                                            }
                                            hashMap = hashMap5;
                                            arrayList = arrayList7;
                                            hashMap2 = hashMap7;
                                        }
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        hashMap6 = hashMap7;
                                        str9 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str5 = str2;
                                    z6 = z11;
                                    arrayList5 = arrayList8;
                                    dVar3 = dVar;
                                }
                                lVar2 = lVar;
                                iVar2 = iVar;
                                hashMap6 = hashMap2;
                                str9 = str3;
                                arrayList6 = arrayList;
                                hashMap5 = hashMap;
                                str5 = str2;
                                z6 = z11;
                                arrayList5 = arrayList8;
                                dVar3 = dVar;
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
        d dVar5 = dVar3;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        boolean z12 = z6;
        HashMap hashMap8 = new HashMap();
        int i26 = 0;
        while (i26 < arrayList4.size()) {
            e eVar = (e) arrayList4.get(i26);
            long j29 = eVar.f5878b;
            if (j29 == -1) {
                j29 = (j9 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int i27 = eVar.f5879c;
            if (i27 != -1 || j11 == -9223372036854775807L) {
                i4 = 1;
            } else {
                i4 = 1;
                i27 = (arrayList11.isEmpty() ? ((f) r.l(arrayList2)).f5880x : arrayList11).size() - 1;
            }
            Uri uri = eVar.f5877a;
            hashMap8.put(uri, new e(i27, j29, uri));
            i26 += i4;
        }
        if (dVar5 != null) {
            arrayList11.add(dVar5);
        }
        return new i(i7, str, arrayList12, j7, z12, j8, z7, i8, j9, i9, j10, j11, z5, z8, j8 != 0, c0092m2, arrayList2, arrayList11, hVar2, hashMap8);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h0.l e(android.support.v4.media.session.t r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.o.e(android.support.v4.media.session.t, java.lang.String):h0.l");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i4 = i(str, pattern, null, map);
        if (i4 != null) {
            return i4;
        }
        throw I.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = f5972m0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0096, LOOP:0: B:13:0x0069->B:38:0x0069, LOOP_START, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:60:0x00fd, B:61:0x0103, B:65:0x0030, B:67:0x0036, B:72:0x003f, B:74:0x0048, B:79:0x0051, B:81:0x0057, B:83:0x005d, B:85:0x0062), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:60:0x00fd, B:61:0x0103, B:65:0x0030, B:67:0x0036, B:72:0x003f, B:74:0x0048, B:79:0x0051, B:81:0x0057, B:83:0x005d, B:85:0x0062), top: B:2:0x000f }] */
    @Override // u0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(android.net.Uri r7, Y.j r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.o.p(android.net.Uri, Y.j):java.lang.Object");
    }
}
