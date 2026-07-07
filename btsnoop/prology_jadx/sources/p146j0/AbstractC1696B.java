package p146j0;

/* renamed from: j0.B */
/* loaded from: classes.dex */
public abstract class AbstractC1696B {

    /* renamed from: a */
    public static final java.util.regex.Pattern f7043a = java.util.regex.Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final java.util.HashMap f7044b = new java.util.HashMap();

    /* renamed from: c */
    public static int f7045c = -1;

    /* renamed from: a */
    public static void m3643a(java.lang.String str, java.util.ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (p086W.AbstractC0805y.f2801a < 26 && p086W.AbstractC0805y.f2802b.equals("R9") && arrayList.size() == 1 && ((p146j0.C1709m) arrayList.get(0)).f7093a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(p146j0.C1709m.m3661h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            java.util.Collections.sort(arrayList, new p146j0.C1719w(new p146j0.C1718v(1)));
        }
        int i4 = p086W.AbstractC0805y.f2801a;
        if (i4 < 21 && arrayList.size() > 1) {
            java.lang.String str2 = ((p146j0.C1709m) arrayList.get(0)).f7093a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                java.util.Collections.sort(arrayList, new p146j0.C1719w(new p146j0.C1718v(2)));
            }
        }
        if (i4 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((p146j0.C1709m) arrayList.get(0)).f7093a)) {
            return;
        }
        arrayList.add((p146j0.C1709m) arrayList.remove(0));
    }

    /* renamed from: b */
    public static java.lang.String m3644b(p076T.C0702p c0702p) {
        android.util.Pair m3646d;
        if ("audio/eac3-joc".equals(c0702p.f2408m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c0702p.f2408m) || (m3646d = m3646d(c0702p)) == null) {
            return null;
        }
        int intValue = ((java.lang.Integer) m3646d.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        if (intValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    /* renamed from: c */
    public static java.lang.String m3645c(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, java.lang.String str2) {
        for (java.lang.String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x037f A[Catch: NumberFormatException -> 0x0390, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x0390, blocks: (B:207:0x0334, B:209:0x0346, B:221:0x0365, B:224:0x037f), top: B:206:0x0334 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0671  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair m3646d(p076T.C0702p r25) {
        /*
            Method dump skipped, instructions count: 2436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p146j0.AbstractC1696B.m3646d(T.p):android.util.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [j0.z] */
    /* JADX WARN: Type inference failed for: r6v2, types: [B.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r8v3, types: [j0.z, java.lang.Object] */
    /* renamed from: e */
    public static synchronized java.util.List m3647e(java.lang.String str, boolean z4, boolean z5) {
        ?? r6;
        int i4;
        synchronized (p146j0.AbstractC1696B.class) {
            try {
                p146j0.C1720x c1720x = new p146j0.C1720x(str, z4, z5);
                java.util.HashMap hashMap = f7044b;
                java.util.List list = (java.util.List) hashMap.get(c1720x);
                if (list != null) {
                    return list;
                }
                int i5 = p086W.AbstractC0805y.f2801a;
                if (i5 >= 21) {
                    ?? obj = new java.lang.Object();
                    if (!z4 && !z5) {
                        i4 = 0;
                        obj.f87l = i4;
                        r6 = obj;
                    }
                    i4 = 1;
                    obj.f87l = i4;
                    r6 = obj;
                } else {
                    r6 = new java.lang.Object();
                }
                java.util.ArrayList m3648f = m3648f(c1720x, r6);
                if (z4 && m3648f.isEmpty() && 21 <= i5 && i5 <= 23) {
                    m3648f = m3648f(c1720x, new java.lang.Object());
                    if (!m3648f.isEmpty()) {
                        p086W.AbstractC0781a.m1410A("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((p146j0.C1709m) m3648f.get(0)).f7093a);
                    }
                }
                m3643a(str, m3648f);
                p129f2.AbstractC1393I m3162j = p129f2.AbstractC1393I.m3162j(m3648f);
                hashMap.put(c1720x, m3162j);
                return m3162j;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r8 != false) goto L9;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m3648f(p146j0.C1720x r23, p146j0.InterfaceC1722z r24) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p146j0.AbstractC1696B.m3648f(j0.x, j0.z):java.util.ArrayList");
    }

    /* renamed from: g */
    public static p129f2.C1415c0 m3649g(p146j0.C1718v c1718v, p076T.C0702p c0702p, boolean z4, boolean z5) {
        java.util.List m3647e;
        java.lang.String str = c0702p.f2408m;
        c1718v.getClass();
        java.util.List m3647e2 = m3647e(str, z4, z5);
        java.lang.String m3644b = m3644b(c0702p);
        if (m3644b == null) {
            m3647e = p129f2.C1415c0.f5744p;
        } else {
            c1718v.getClass();
            m3647e = m3647e(m3644b, z4, z5);
        }
        p129f2.C1390F m3161i = p129f2.AbstractC1393I.m3161i();
        m3161i.m3148d(m3647e2);
        m3161i.m3148d(m3647e);
        return m3161i.m3157g();
    }

    /* renamed from: h */
    public static boolean m3650h(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, boolean z4, java.lang.String str2) {
        if (mediaCodecInfo.isEncoder() || (!z4 && str.endsWith(".secure"))) {
            return false;
        }
        int i4 = p086W.AbstractC0805y.f2801a;
        if (i4 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i4 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(p086W.AbstractC0805y.f2803c))) {
            java.lang.String str3 = p086W.AbstractC0805y.f2802b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i4 == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(p086W.AbstractC0805y.f2803c)) {
            java.lang.String str4 = p086W.AbstractC0805y.f2802b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i4 == 19 && p086W.AbstractC0805y.f2802b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i4 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* renamed from: i */
    public static boolean m3651i(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        boolean isSoftwareOnly;
        if (p086W.AbstractC0805y.f2801a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (p076T.AbstractC0665H.m1197h(str)) {
            return true;
        }
        java.lang.String m1361I = p080U1.AbstractC0748a.m1361I(mediaCodecInfo.getName());
        if (m1361I.startsWith("arc.")) {
            return false;
        }
        if (m1361I.startsWith("omx.google.") || m1361I.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((m1361I.startsWith("omx.sec.") && m1361I.contains(".sw.")) || m1361I.equals("omx.qcom.video.decoder.hevcswvdec") || m1361I.startsWith("c2.android.") || m1361I.startsWith("c2.google.")) {
            return true;
        }
        return (m1361I.startsWith("omx.") || m1361I.startsWith("c2.")) ? false : true;
    }

    /* renamed from: j */
    public static int m3652j() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i4;
        if (f7045c == -1) {
            int i5 = 0;
            java.util.List m3647e = m3647e("video/avc", false, false);
            p146j0.C1709m c1709m = m3647e.isEmpty() ? null : (p146j0.C1709m) m3647e.get(0);
            if (c1709m != null) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = c1709m.f7096d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = codecProfileLevelArr[i5].level;
                    if (i7 != 1 && i7 != 2) {
                        switch (i7) {
                            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            case 16:
                            case 32:
                                i4 = 101376;
                                break;
                            case 64:
                                i4 = 202752;
                                break;
                            case 128:
                            case 256:
                                i4 = 414720;
                                break;
                            case 512:
                                i4 = 921600;
                                break;
                            case 1024:
                                i4 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                break;
                            case 8192:
                                i4 = 2228224;
                                break;
                            case 16384:
                                i4 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i4 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i4 = 35651584;
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                    } else {
                        i4 = 25344;
                    }
                    i6 = java.lang.Math.max(i4, i6);
                    i5++;
                }
                i5 = java.lang.Math.max(i6, p086W.AbstractC0805y.f2801a >= 21 ? 345600 : 172800);
            }
            f7045c = i5;
        }
        return f7045c;
    }
}
