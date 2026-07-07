package j0;

import T.C0095p;
import T.H;
import android.media.MediaCodecInfo;
import android.util.Pair;
import f2.C0278F;
import f2.I;
import f2.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f6785a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f6786b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f6787c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (W.y.f2709a < 26 && W.y.f2710b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f6833a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new w(new v(1)));
        }
        int i4 = W.y.f2709a;
        if (i4 < 21 && arrayList.size() > 1) {
            String str2 = ((m) arrayList.get(0)).f6833a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new w(new v(2)));
            }
        }
        if (i4 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f6833a)) {
            return;
        }
        arrayList.add((m) arrayList.remove(0));
    }

    public static String b(C0095p c0095p) {
        Pair d4;
        if ("audio/eac3-joc".equals(c0095p.f2325m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c0095p.f2325m) || (d4 = d(c0095p)) == null) {
            return null;
        }
        int intValue = ((Integer) d4.first).intValue();
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

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(T.C0095p r25) {
        /*
            Method dump skipped, instructions count: 2436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.B.d(T.p):android.util.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [j0.z] */
    /* JADX WARN: Type inference failed for: r6v2, types: [B.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r8v3, types: [j0.z, java.lang.Object] */
    public static synchronized List e(String str, boolean z4, boolean z5) {
        ?? r6;
        int i4;
        synchronized (B.class) {
            try {
                x xVar = new x(str, z4, z5);
                HashMap hashMap = f6786b;
                List list = (List) hashMap.get(xVar);
                if (list != null) {
                    return list;
                }
                int i5 = W.y.f2709a;
                if (i5 >= 21) {
                    ?? obj = new Object();
                    if (!z4 && !z5) {
                        i4 = 0;
                        obj.f84l = i4;
                        r6 = obj;
                    }
                    i4 = 1;
                    obj.f84l = i4;
                    r6 = obj;
                } else {
                    r6 = new Object();
                }
                ArrayList f4 = f(xVar, r6);
                if (z4 && f4.isEmpty() && 21 <= i5 && i5 <= 23) {
                    f4 = f(xVar, new Object());
                    if (!f4.isEmpty()) {
                        W.a.A("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) f4.get(0)).f6833a);
                    }
                }
                a(str, f4);
                I j4 = I.j(f4);
                hashMap.put(xVar, j4);
                return j4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r8 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(j0.x r23, j0.z r24) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.B.f(j0.x, j0.z):java.util.ArrayList");
    }

    public static c0 g(v vVar, C0095p c0095p, boolean z4, boolean z5) {
        List e4;
        String str = c0095p.f2325m;
        vVar.getClass();
        List e5 = e(str, z4, z5);
        String b4 = b(c0095p);
        if (b4 == null) {
            e4 = c0.f5550p;
        } else {
            vVar.getClass();
            e4 = e(b4, z4, z5);
        }
        C0278F i4 = I.i();
        i4.d(e5);
        i4.d(e4);
        return i4.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z4, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z4 && str.endsWith(".secure"))) {
            return false;
        }
        int i4 = W.y.f2709a;
        if (i4 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i4 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(W.y.f2711c))) {
            String str3 = W.y.f2710b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i4 == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(W.y.f2711c)) {
            String str4 = W.y.f2710b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i4 == 19 && W.y.f2710b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i4 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (W.y.f2709a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (H.h(str)) {
            return true;
        }
        String I3 = U1.a.I(mediaCodecInfo.getName());
        if (I3.startsWith("arc.")) {
            return false;
        }
        if (I3.startsWith("omx.google.") || I3.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((I3.startsWith("omx.sec.") && I3.contains(".sw.")) || I3.equals("omx.qcom.video.decoder.hevcswvdec") || I3.startsWith("c2.android.") || I3.startsWith("c2.google.")) {
            return true;
        }
        return (I3.startsWith("omx.") || I3.startsWith("c2.")) ? false : true;
    }

    public static int j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i4;
        if (f6787c == -1) {
            int i5 = 0;
            List e4 = e("video/avc", false, false);
            m mVar = e4.isEmpty() ? null : (m) e4.get(0);
            if (mVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f6836d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = codecProfileLevelArr[i5].level;
                    if (i7 != 1 && i7 != 2) {
                        switch (i7) {
                            case L.k.BYTES_FIELD_NUMBER /* 8 */:
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
                    i6 = Math.max(i4, i6);
                    i5++;
                }
                i5 = Math.max(i6, W.y.f2709a >= 21 ? 345600 : 172800);
            }
            f6787c = i5;
        }
        return f6787c;
    }
}
