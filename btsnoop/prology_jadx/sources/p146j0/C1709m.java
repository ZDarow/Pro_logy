package p146j0;

/* renamed from: j0.m */
/* loaded from: classes.dex */
public final class C1709m {

    /* renamed from: a */
    public final java.lang.String f7093a;

    /* renamed from: b */
    public final java.lang.String f7094b;

    /* renamed from: c */
    public final java.lang.String f7095c;

    /* renamed from: d */
    public final android.media.MediaCodecInfo.CodecCapabilities f7096d;

    /* renamed from: e */
    public final boolean f7097e;

    /* renamed from: f */
    public final boolean f7098f;

    /* renamed from: g */
    public final boolean f7099g;

    /* renamed from: h */
    public final boolean f7100h;

    public C1709m(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f7093a = str;
        this.f7094b = str2;
        this.f7095c = str3;
        this.f7096d = codecCapabilities;
        this.f7099g = z4;
        this.f7097e = z5;
        this.f7098f = z6;
        this.f7100h = p076T.AbstractC0665H.m1200k(str2);
    }

    /* renamed from: a */
    public static boolean m3660a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i4, int i5, double d4) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        android.graphics.Point point = new android.graphics.Point(p086W.AbstractC0805y.m1612g(i4, widthAlignment) * widthAlignment, p086W.AbstractC0805y.m1612g(i5, heightAlignment) * heightAlignment);
        int i6 = point.x;
        int i7 = point.y;
        return (d4 == -1.0d || d4 < 1.0d) ? videoCapabilities.isSizeSupported(i6, i7) : videoCapabilities.areSizeAndRateSupported(i6, i7, java.lang.Math.floor(d4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ("Nexus 10".equals(r1) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L17;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p146j0.C1709m m3661h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            j0.m r13 = new j0.m
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L39
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L39
            int r1 = p086W.AbstractC0805y.f2801a
            r2 = 22
            if (r1 > r2) goto L37
            java.lang.String r1 = p086W.AbstractC0805y.f2804d
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
            int r2 = p086W.AbstractC0805y.f2801a
            if (r2 < r1) goto L48
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L48:
            if (r15 != 0) goto L5b
            if (r11 == 0) goto L59
            int r15 = p086W.AbstractC0805y.f2801a
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
        throw new UnsupportedOperationException("Method not decompiled: p146j0.C1709m.m3661h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):j0.m");
    }

    /* renamed from: b */
    public final p102a0.C0974g m3662b(p076T.C0702p c0702p, p076T.C0702p c0702p2) {
        int i4 = !p086W.AbstractC0805y.m1606a(c0702p.f2408m, c0702p2.f2408m) ? 8 : 0;
        if (this.f7100h) {
            if (c0702p.f2417v != c0702p2.f2417v) {
                i4 |= 1024;
            }
            if (!this.f7097e && (c0702p.f2414s != c0702p2.f2414s || c0702p.f2415t != c0702p2.f2415t)) {
                i4 |= 512;
            }
            p076T.C0695i c0695i = c0702p.f2421z;
            boolean m1281e = p076T.C0695i.m1281e(c0695i);
            p076T.C0695i c0695i2 = c0702p2.f2421z;
            if ((!m1281e || !p076T.C0695i.m1281e(c0695i2)) && !p086W.AbstractC0805y.m1606a(c0695i, c0695i2)) {
                i4 |= 2048;
            }
            if (p086W.AbstractC0805y.f2804d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f7093a) && !c0702p.m1297c(c0702p2)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new p102a0.C0974g(this.f7093a, c0702p, c0702p2, c0702p.m1297c(c0702p2) ? 3 : 2, 0);
            }
        } else {
            if (c0702p.f2385A != c0702p2.f2385A) {
                i4 |= 4096;
            }
            if (c0702p.f2386B != c0702p2.f2386B) {
                i4 |= 8192;
            }
            if (c0702p.f2387C != c0702p2.f2387C) {
                i4 |= 16384;
            }
            java.lang.String str = this.f7094b;
            if (i4 == 0 && "audio/mp4a-latm".equals(str)) {
                android.util.Pair m3646d = p146j0.AbstractC1696B.m3646d(c0702p);
                android.util.Pair m3646d2 = p146j0.AbstractC1696B.m3646d(c0702p2);
                if (m3646d != null && m3646d2 != null) {
                    int intValue = ((java.lang.Integer) m3646d.first).intValue();
                    int intValue2 = ((java.lang.Integer) m3646d2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new p102a0.C0974g(this.f7093a, c0702p, c0702p2, 3, 0);
                    }
                }
            }
            if (!c0702p.m1297c(c0702p2)) {
                i4 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new p102a0.C0974g(this.f7093a, c0702p, c0702p2, 1, 0);
            }
        }
        return new p102a0.C0974g(this.f7093a, c0702p, c0702p2, 0, i4);
    }

    /* renamed from: c */
    public final boolean m3663c(p076T.C0702p c0702p, boolean z4) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.util.Pair m3646d = p146j0.AbstractC1696B.m3646d(c0702p);
        if (m3646d == null) {
            return true;
        }
        int intValue = ((java.lang.Integer) m3646d.first).intValue();
        int intValue2 = ((java.lang.Integer) m3646d.second).intValue();
        boolean equals = "video/dolby-vision".equals(c0702p.f2408m);
        int i4 = 8;
        java.lang.String str = this.f7094b;
        if (equals) {
            if ("video/avc".equals(str)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(str)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.f7100h && intValue != 42) {
            return true;
        }
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7096d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[0];
        }
        if (p086W.AbstractC0805y.f2801a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
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
            android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i4;
            codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z4)) {
                if ("video/hevc".equals(str) && 2 == intValue) {
                    java.lang.String str2 = p086W.AbstractC0805y.f2802b;
                    if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        m3667g("codec.profileLevel, " + c0702p.f2405j + ", " + this.f7095c);
        return false;
    }

    /* renamed from: d */
    public final boolean m3664d(p076T.C0702p c0702p) {
        int i4;
        java.lang.String str = c0702p.f2408m;
        java.lang.String str2 = this.f7094b;
        if (!(str2.equals(str) || str2.equals(p146j0.AbstractC1696B.m3644b(c0702p))) || !m3663c(c0702p, true)) {
            return false;
        }
        if (this.f7100h) {
            int i5 = c0702p.f2414s;
            if (i5 > 0 && (i4 = c0702p.f2415t) > 0) {
                if (p086W.AbstractC0805y.f2801a >= 21) {
                    return m3666f(i5, i4, c0702p.f2416u);
                }
                r2 = i5 * i4 <= p146j0.AbstractC1696B.m3652j();
                if (!r2) {
                    m3667g("legacyFrameSize, " + i5 + "x" + i4);
                }
            }
            return r2;
        }
        int i6 = p086W.AbstractC0805y.f2801a;
        if (i6 < 21) {
            return true;
        }
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7096d;
        int i7 = c0702p.f2386B;
        if (i7 != -1) {
            if (codecCapabilities == null) {
                m3667g("sampleRate.caps");
            } else {
                android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m3667g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i7)) {
                    m3667g("sampleRate.support, " + i7);
                }
            }
            return false;
        }
        int i8 = c0702p.f2385A;
        if (i8 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            m3667g("channelCount.caps");
        } else {
            android.media.MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                m3667g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i6 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i9 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    p086W.AbstractC0781a.m1410A("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f7093a + ", [" + maxInputChannelCount + " to " + i9 + "]");
                    maxInputChannelCount = i9;
                }
                if (maxInputChannelCount >= i8) {
                    return true;
                }
                m3667g("channelCount.support, " + i8);
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m3665e(p076T.C0702p c0702p) {
        if (this.f7100h) {
            return this.f7097e;
        }
        android.util.Pair m3646d = p146j0.AbstractC1696B.m3646d(c0702p);
        return m3646d != null && ((java.lang.Integer) m3646d.first).intValue() == 42;
    }

    /* renamed from: f */
    public final boolean m3666f(int i4, int i5, double d4) {
        java.lang.Boolean bool;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7096d;
        if (codecCapabilities == null) {
            m3667g("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m3667g("sizeAndRate.vCaps");
            return false;
        }
        int i6 = p086W.AbstractC0805y.f2801a;
        if (i6 >= 29) {
            int m3682a = (i6 < 29 || ((bool = p101a.AbstractC0936a.f3300a) != null && bool.booleanValue())) ? 0 : p146j0.AbstractC1711o.m3682a(videoCapabilities, i4, i5, d4);
            if (m3682a == 2) {
                return true;
            }
            if (m3682a == 1) {
                m3667g("sizeAndRate.cover, " + i4 + "x" + i5 + "@" + d4);
                return false;
            }
        }
        if (!m3660a(videoCapabilities, i4, i5, d4)) {
            if (i4 < i5) {
                java.lang.String str = this.f7093a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(p086W.AbstractC0805y.f2802b)) && m3660a(videoCapabilities, i5, i4, d4)) {
                    p086W.AbstractC0781a.m1424m("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i4 + "x" + i5 + "@" + d4) + "] [" + str + ", " + this.f7094b + "] [" + p086W.AbstractC0805y.f2805e + "]");
                }
            }
            m3667g("sizeAndRate.support, " + i4 + "x" + i5 + "@" + d4);
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m3667g(java.lang.String str) {
        p086W.AbstractC0781a.m1424m("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f7093a + ", " + this.f7094b + "] [" + p086W.AbstractC0805y.f2805e + "]");
    }

    public final java.lang.String toString() {
        return this.f7093a;
    }
}
