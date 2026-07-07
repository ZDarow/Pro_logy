package j0;

import T.C0088i;
import T.C0095p;
import T.H;
import a.AbstractC0110a;
import a0.C0127g;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f6833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6834b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6835c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f6836d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6837e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6838f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6839g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6840h;

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f6833a = str;
        this.f6834b = str2;
        this.f6835c = str3;
        this.f6836d = codecCapabilities;
        this.f6839g = z4;
        this.f6837e = z5;
        this.f6838f = z6;
        this.f6840h = H.k(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i4, int i5, double d4) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(W.y.g(i4, widthAlignment) * widthAlignment, W.y.g(i5, heightAlignment) * heightAlignment);
        int i6 = point.x;
        int i7 = point.y;
        return (d4 == -1.0d || d4 < 1.0d) ? videoCapabilities.isSizeSupported(i6, i7) : videoCapabilities.areSizeAndRateSupported(i6, i7, Math.floor(d4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ("Nexus 10".equals(r1) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j0.m h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            j0.m r13 = new j0.m
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L39
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L39
            int r1 = W.y.f2709a
            r2 = 22
            if (r1 > r2) goto L37
            java.lang.String r1 = W.y.f2712d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L26
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L37
        L26:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L39
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L37
            goto L39
        L37:
            r6 = r0
            goto L3a
        L39:
            r6 = r14
        L3a:
            r1 = 21
            if (r11 == 0) goto L48
            int r2 = W.y.f2709a
            if (r2 < r1) goto L48
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L48:
            if (r15 != 0) goto L5b
            if (r11 == 0) goto L59
            int r15 = W.y.f2709a
            if (r15 < r1) goto L59
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L59
            goto L5b
        L59:
            r7 = r14
            goto L5c
        L5b:
            r7 = r0
        L5c:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.m.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):j0.m");
    }

    public final C0127g b(C0095p c0095p, C0095p c0095p2) {
        int i4 = !W.y.a(c0095p.f2325m, c0095p2.f2325m) ? 8 : 0;
        if (this.f6840h) {
            if (c0095p.f2333v != c0095p2.f2333v) {
                i4 |= 1024;
            }
            if (!this.f6837e && (c0095p.s != c0095p2.s || c0095p.f2331t != c0095p2.f2331t)) {
                i4 |= 512;
            }
            C0088i c0088i = c0095p.f2336z;
            boolean e4 = C0088i.e(c0088i);
            C0088i c0088i2 = c0095p2.f2336z;
            if ((!e4 || !C0088i.e(c0088i2)) && !W.y.a(c0088i, c0088i2)) {
                i4 |= 2048;
            }
            if (W.y.f2712d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f6833a) && !c0095p.c(c0095p2)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new C0127g(this.f6833a, c0095p, c0095p2, c0095p.c(c0095p2) ? 3 : 2, 0);
            }
        } else {
            if (c0095p.f2303A != c0095p2.f2303A) {
                i4 |= 4096;
            }
            if (c0095p.f2304B != c0095p2.f2304B) {
                i4 |= 8192;
            }
            if (c0095p.f2305C != c0095p2.f2305C) {
                i4 |= 16384;
            }
            String str = this.f6834b;
            if (i4 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d4 = B.d(c0095p);
                Pair d5 = B.d(c0095p2);
                if (d4 != null && d5 != null) {
                    int intValue = ((Integer) d4.first).intValue();
                    int intValue2 = ((Integer) d5.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C0127g(this.f6833a, c0095p, c0095p2, 3, 0);
                    }
                }
            }
            if (!c0095p.c(c0095p2)) {
                i4 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new C0127g(this.f6833a, c0095p, c0095p2, 1, 0);
            }
        }
        return new C0127g(this.f6833a, c0095p, c0095p2, 0, i4);
    }

    public final boolean c(C0095p c0095p, boolean z4) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d4 = B.d(c0095p);
        if (d4 == null) {
            return true;
        }
        int intValue = ((Integer) d4.first).intValue();
        int intValue2 = ((Integer) d4.second).intValue();
        boolean equals = "video/dolby-vision".equals(c0095p.f2325m);
        int i4 = 8;
        String str = this.f6834b;
        if (equals) {
            if ("video/avc".equals(str)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(str)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.f6840h && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6836d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (W.y.f2709a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
            if (intValue3 >= 180000000) {
                i4 = 1024;
            } else if (intValue3 >= 120000000) {
                i4 = 512;
            } else if (intValue3 >= 60000000) {
                i4 = 256;
            } else if (intValue3 >= 30000000) {
                i4 = 128;
            } else if (intValue3 >= 18000000) {
                i4 = 64;
            } else if (intValue3 >= 12000000) {
                i4 = 32;
            } else if (intValue3 >= 7200000) {
                i4 = 16;
            } else if (intValue3 < 3600000) {
                i4 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i4;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z4)) {
                if ("video/hevc".equals(str) && 2 == intValue) {
                    String str2 = W.y.f2710b;
                    if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + c0095p.f2322j + ", " + this.f6835c);
        return false;
    }

    public final boolean d(C0095p c0095p) {
        int i4;
        String str = c0095p.f2325m;
        String str2 = this.f6834b;
        if (!(str2.equals(str) || str2.equals(B.b(c0095p))) || !c(c0095p, true)) {
            return false;
        }
        if (this.f6840h) {
            int i5 = c0095p.s;
            if (i5 > 0 && (i4 = c0095p.f2331t) > 0) {
                if (W.y.f2709a >= 21) {
                    return f(i5, i4, c0095p.f2332u);
                }
                r2 = i5 * i4 <= B.j();
                if (!r2) {
                    g("legacyFrameSize, " + i5 + "x" + i4);
                }
            }
            return r2;
        }
        int i6 = W.y.f2709a;
        if (i6 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6836d;
        int i7 = c0095p.f2304B;
        if (i7 != -1) {
            if (codecCapabilities == null) {
                g("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i7)) {
                    g("sampleRate.support, " + i7);
                }
            }
            return false;
        }
        int i8 = c0095p.f2303A;
        if (i8 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            g("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i6 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i9 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    W.a.A("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f6833a + ", [" + maxInputChannelCount + " to " + i9 + "]");
                    maxInputChannelCount = i9;
                }
                if (maxInputChannelCount >= i8) {
                    return true;
                }
                g("channelCount.support, " + i8);
            }
        }
        return false;
    }

    public final boolean e(C0095p c0095p) {
        if (this.f6840h) {
            return this.f6837e;
        }
        Pair d4 = B.d(c0095p);
        return d4 != null && ((Integer) d4.first).intValue() == 42;
    }

    public final boolean f(int i4, int i5, double d4) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6836d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i6 = W.y.f2709a;
        if (i6 >= 29) {
            int a4 = (i6 < 29 || ((bool = AbstractC0110a.f3188a) != null && bool.booleanValue())) ? 0 : o.a(videoCapabilities, i4, i5, d4);
            if (a4 == 2) {
                return true;
            }
            if (a4 == 1) {
                g("sizeAndRate.cover, " + i4 + "x" + i5 + "@" + d4);
                return false;
            }
        }
        if (!a(videoCapabilities, i4, i5, d4)) {
            if (i4 < i5) {
                String str = this.f6833a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(W.y.f2710b)) && a(videoCapabilities, i5, i4, d4)) {
                    W.a.m("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i4 + "x" + i5 + "@" + d4) + "] [" + str + ", " + this.f6834b + "] [" + W.y.f2713e + "]");
                }
            }
            g("sizeAndRate.support, " + i4 + "x" + i5 + "@" + d4);
            return false;
        }
        return true;
    }

    public final void g(String str) {
        W.a.m("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f6833a + ", " + this.f6834b + "] [" + W.y.f2713e + "]");
    }

    public final String toString() {
        return this.f6833a;
    }
}
