package p194t2;

/* renamed from: t2.a */
/* loaded from: classes.dex */
public final class C2185a implements p047L2.InterfaceC0385o, p076T.InterfaceC0670M {

    /* renamed from: R */
    public static final java.util.Random f8725R = new java.util.Random();

    /* renamed from: A */
    public int f8726A;

    /* renamed from: B */
    public p076T.C0691e f8727B;

    /* renamed from: C */
    public final p102a0.C0980j f8728C;

    /* renamed from: D */
    public final boolean f8729D;

    /* renamed from: E */
    public final p102a0.C0976h f8730E;

    /* renamed from: F */
    public final java.util.List f8731F;

    /* renamed from: J */
    public java.util.HashMap f8735J;

    /* renamed from: K */
    public p102a0.C0944H f8736K;

    /* renamed from: L */
    public java.lang.Integer f8737L;

    /* renamed from: M */
    public p179q0.AbstractC1984a f8738M;

    /* renamed from: N */
    public java.lang.Integer f8739N;

    /* renamed from: Q */
    public int f8742Q;

    /* renamed from: l */
    public final android.content.Context f8743l;

    /* renamed from: m */
    public final p194t2.C2186b f8744m;

    /* renamed from: n */
    public final p194t2.C2186b f8745n;

    /* renamed from: o */
    public long f8746o;

    /* renamed from: p */
    public long f8747p;

    /* renamed from: q */
    public long f8748q;

    /* renamed from: r */
    public java.lang.Long f8749r;

    /* renamed from: s */
    public long f8750s;

    /* renamed from: t */
    public java.lang.Integer f8751t;

    /* renamed from: u */
    public p043K2.C0335k f8752u;

    /* renamed from: v */
    public p043K2.C0335k f8753v;

    /* renamed from: w */
    public p043K2.C0335k f8754w;

    /* renamed from: y */
    public p045L0.C0356c f8756y;

    /* renamed from: z */
    public p045L0.C0355b f8757z;

    /* renamed from: x */
    public final java.util.HashMap f8755x = new java.util.HashMap();

    /* renamed from: G */
    public final java.util.ArrayList f8732G = new java.util.ArrayList();

    /* renamed from: H */
    public final java.util.HashMap f8733H = new java.util.HashMap();

    /* renamed from: I */
    public int f8734I = 0;

    /* renamed from: O */
    public final android.os.Handler f8740O = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: P */
    public final p024F.RunnableC0199b f8741P = new p024F.RunnableC0199b(12, this);

    public C2185a(android.content.Context context, p047L2.InterfaceC0376f interfaceC0376f, java.lang.String str, java.util.Map map, java.util.List list, java.lang.Boolean bool) {
        boolean z4 = false;
        this.f8743l = context;
        this.f8731F = list;
        this.f8729D = bool != null ? bool.booleanValue() : false;
        new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("com.ryanheise.just_audio.methods.", str)).m702s(this);
        this.f8744m = new p194t2.C2186b(interfaceC0376f, p009B2.AbstractC0051h.m153l("com.ryanheise.just_audio.events.", str));
        this.f8745n = new p194t2.C2186b(interfaceC0376f, p009B2.AbstractC0051h.m153l("com.ryanheise.just_audio.data.", str));
        this.f8742Q = 1;
        if (map != null) {
            java.util.Map map2 = (java.util.Map) map.get("androidLoadControl");
            if (map2 != null) {
                int longValue = (int) (m4308R(map2.get("minBufferDuration")).longValue() / 1000);
                int longValue2 = (int) (m4308R(map2.get("maxBufferDuration")).longValue() / 1000);
                int longValue3 = (int) (m4308R(map2.get("bufferForPlaybackDuration")).longValue() / 1000);
                int longValue4 = (int) (m4308R(map2.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000);
                p102a0.C0980j.m2024a(longValue3, 0, "bufferForPlaybackMs", "0");
                p102a0.C0980j.m2024a(longValue4, 0, "bufferForPlaybackAfterRebufferMs", "0");
                p102a0.C0980j.m2024a(longValue, longValue3, "minBufferMs", "bufferForPlaybackMs");
                p102a0.C0980j.m2024a(longValue, longValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                p102a0.C0980j.m2024a(longValue2, longValue, "maxBufferMs", "minBufferMs");
                boolean booleanValue = ((java.lang.Boolean) map2.get("prioritizeTimeOverSizeThresholds")).booleanValue();
                int longValue5 = (int) (m4308R(map2.get("backBufferDuration")).longValue() / 1000);
                p102a0.C0980j.m2024a(longValue5, 0, "backBufferDurationMs", "0");
                this.f8728C = new p102a0.C0980j(new p197u0.C2218e(), longValue, longValue2, longValue3, longValue4, map2.get("targetBufferBytes") != null ? ((java.lang.Integer) map2.get("targetBufferBytes")).intValue() : -1, booleanValue, longValue5);
            }
            java.util.Map map3 = (java.util.Map) map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                int i4 = p086W.AbstractC0805y.f2801a;
                float doubleValue = (float) ((java.lang.Double) map3.get("fallbackMinPlaybackSpeed")).doubleValue();
                p086W.AbstractC0781a.m1416e(0.0f < doubleValue && doubleValue <= 1.0f);
                float doubleValue2 = (float) ((java.lang.Double) map3.get("fallbackMaxPlaybackSpeed")).doubleValue();
                p086W.AbstractC0781a.m1416e(doubleValue2 >= 1.0f);
                long longValue6 = m4308R(map3.get("minUpdateInterval")).longValue() / 1000;
                p086W.AbstractC0781a.m1416e(longValue6 > 0);
                float doubleValue3 = (float) ((java.lang.Double) map3.get("proportionalControlFactor")).doubleValue();
                p086W.AbstractC0781a.m1416e(doubleValue3 > 0.0f);
                float f4 = doubleValue3 / 1000000.0f;
                long longValue7 = m4308R(map3.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000;
                p086W.AbstractC0781a.m1416e(longValue7 > 0);
                long m1592M = p086W.AbstractC0805y.m1592M(longValue7);
                long longValue8 = m4308R(map3.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000;
                p086W.AbstractC0781a.m1416e(longValue8 >= 0);
                long m1592M2 = p086W.AbstractC0805y.m1592M(longValue8);
                float doubleValue4 = (float) ((java.lang.Double) map3.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue();
                if (doubleValue4 >= 0.0f && doubleValue4 < 1.0f) {
                    z4 = true;
                }
                p086W.AbstractC0781a.m1416e(z4);
                this.f8730E = new p102a0.C0976h(doubleValue, doubleValue2, longValue6, f4, m1592M, m1592M2, doubleValue4);
            }
        }
    }

    /* renamed from: G */
    public static p179q0.C1991d0 m4307G(java.util.List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = ((java.lang.Integer) list.get(i4)).intValue();
        }
        return new p179q0.C1991d0(java.util.Arrays.copyOf(iArr, size), new java.util.Random(f8725R.nextLong()));
    }

    /* renamed from: R */
    public static java.lang.Long m4308R(java.lang.Object obj) {
        return (obj == null || (obj instanceof java.lang.Long)) ? (java.lang.Long) obj : java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
    }

    /* renamed from: U */
    public static java.lang.Object m4309U(java.lang.Object obj, java.lang.String str) {
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).get(str);
        }
        return null;
    }

    /* renamed from: V */
    public static java.util.HashMap m4310V(java.lang.Object... objArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i4 = 0; i4 < objArr.length; i4 += 2) {
            hashMap.put((java.lang.String) objArr[i4], objArr[i4 + 1]);
        }
        return hashMap;
    }

    /* renamed from: D */
    public final void m4311D() {
        java.util.Iterator it = this.f8732G.iterator();
        while (it.hasNext()) {
            ((android.media.audiofx.AudioEffect) it.next()).release();
            it.remove();
        }
        this.f8733H.clear();
    }

    /* renamed from: F */
    public final p179q0.C2013r m4312F(java.lang.Object obj) {
        return (p179q0.C2013r) this.f8755x.get((java.lang.String) obj);
    }

    /* renamed from: H */
    public final void m4313H() {
        int i4 = this.f8742Q;
        p194t2.C2186b c2186b = this.f8744m;
        if (i4 == 2) {
            p043K2.C0335k c0335k = this.f8752u;
            if (c0335k != null) {
                c0335k.mo741a("abort", "Connection aborted", null);
                this.f8752u = null;
            }
            c2186b.m4341b("abort", "Connection aborted", null);
        }
        p043K2.C0335k c0335k2 = this.f8753v;
        if (c0335k2 != null) {
            c0335k2.mo742b(new java.util.HashMap());
            this.f8753v = null;
        }
        this.f8755x.clear();
        this.f8738M = null;
        m4311D();
        p102a0.C0944H c0944h = this.f8736K;
        if (c0944h != null) {
            c0944h.m1832E();
            this.f8736K = null;
            this.f8742Q = 1;
            m4335g();
        }
        c2186b.m4340a();
        this.f8745n.m4340a();
    }

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public final void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        char c4;
        m4315K();
        try {
            try {
                try {
                    java.lang.String str = c0384n.f1133a;
                    switch (str.hashCode()) {
                        case -2058172951:
                            if (str.equals("androidEqualizerBandSetGain")) {
                                c4 = 21;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1987605894:
                            if (str.equals("setShuffleMode")) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1875704736:
                            if (str.equals("setSkipSilence")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1540835818:
                            if (str.equals("concatenatingInsertAll")) {
                                c4 = 14;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1484304041:
                            if (str.equals("setShuffleOrder")) {
                                c4 = '\t';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -704119678:
                            if (str.equals("setCanUseNetworkResourcesForLiveStreamingWhilePaused")) {
                                c4 = 11;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -345307082:
                            if (str.equals("androidLoudnessEnhancerSetTargetGain")) {
                                c4 = 19;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -104999328:
                            if (str.equals("setAndroidAudioAttributes")) {
                                c4 = 17;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -48357143:
                            if (str.equals("setLoopMode")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3327206:
                            if (str.equals("load")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3443508:
                            if (str.equals("play")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3526264:
                            if (str.equals("seek")) {
                                c4 = '\r';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 106440182:
                            if (str.equals("pause")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 670514716:
                            if (str.equals("setVolume")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 845471111:
                            if (str.equals("concatenatingRemoveRange")) {
                                c4 = 15;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 986980643:
                            if (str.equals("concatenatingMove")) {
                                c4 = 16;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1401390078:
                            if (str.equals("setPitch")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1404354821:
                            if (str.equals("setSpeed")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1454606831:
                            if (str.equals("setPreferredPeakBitRate")) {
                                c4 = '\f';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1624925565:
                            if (str.equals("androidEqualizerGetParameters")) {
                                c4 = 20;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1631191096:
                            if (str.equals("setAutomaticallyWaitsToMinimizeStalling")) {
                                c4 = '\n';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2117606630:
                            if (str.equals("audioEffectSetEnabled")) {
                                c4 = 18;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    android.os.Handler handler = this.f8740O;
                    switch (c4) {
                        case 0:
                            java.lang.Long m4308R = m4308R(c0384n.m839a("initialPosition"));
                            m4322S(m4318N(c0384n.m839a("audioSource")), m4308R == null ? -9223372036854775807L : m4308R.longValue() / 1000, (java.lang.Integer) c0384n.m839a("initialIndex"), c0335k);
                            break;
                        case 1:
                            m4325X(c0335k);
                            break;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            m4324W();
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            m4336g0((float) ((java.lang.Double) c0384n.m839a("volume")).doubleValue());
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            m4334f0((float) ((java.lang.Double) c0384n.m839a("speed")).doubleValue());
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            m4330b0((float) ((java.lang.Double) c0384n.m839a("pitch")).doubleValue());
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            m4333e0(((java.lang.Boolean) c0384n.m839a("enabled")).booleanValue());
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            m4329a0(((java.lang.Integer) c0384n.m839a("loopMode")).intValue());
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            m4331c0(((java.lang.Integer) c0384n.m839a("shuffleMode")).intValue() == 1);
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case '\t':
                            m4332d0(c0384n.m839a("audioSource"));
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case '\n':
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case 11:
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case '\f':
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case '\r':
                            java.lang.Long m4308R2 = m4308R(c0384n.m839a("position"));
                            m4326Y(m4308R2 == null ? -9223372036854775807L : m4308R2.longValue() / 1000, (java.lang.Integer) c0384n.m839a("index"), c0335k);
                            break;
                        case 14:
                            m4312F(c0384n.m839a("id")).m4055B(((java.lang.Integer) c0384n.m839a("index")).intValue(), m4319O(c0384n.m839a("children")), handler, new p093X2.RunnableC0855p(c0335k, 4));
                            m4312F(c0384n.m839a("id")).m4066M(m4307G((java.util.List) c0384n.m839a("shuffleOrder")));
                            break;
                        case 15:
                            m4312F(c0384n.m839a("id")).m4063J(((java.lang.Integer) c0384n.m839a("startIndex")).intValue(), ((java.lang.Integer) c0384n.m839a("endIndex")).intValue(), handler, new p093X2.RunnableC0855p(c0335k, 5));
                            m4312F(c0384n.m839a("id")).m4066M(m4307G((java.util.List) c0384n.m839a("shuffleOrder")));
                            break;
                        case 16:
                            m4312F(c0384n.m839a("id")).m4062I(((java.lang.Integer) c0384n.m839a("currentIndex")).intValue(), ((java.lang.Integer) c0384n.m839a("newIndex")).intValue(), handler, new p093X2.RunnableC0855p(c0335k, 6));
                            m4312F(c0384n.m839a("id")).m4066M(m4307G((java.util.List) c0384n.m839a("shuffleOrder")));
                            break;
                        case 17:
                            m4327Z(((java.lang.Integer) c0384n.m839a("contentType")).intValue(), ((java.lang.Integer) c0384n.m839a("flags")).intValue(), ((java.lang.Integer) c0384n.m839a("usage")).intValue());
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case 18:
                            m4328a((java.lang.String) c0384n.m839a("type"), ((java.lang.Boolean) c0384n.m839a("enabled")).booleanValue());
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case 19:
                            m4323T(((java.lang.Double) c0384n.m839a("targetGain")).doubleValue());
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        case 20:
                            c0335k.mo742b(m4316L());
                            break;
                        case 21:
                            m4317M(((java.lang.Integer) c0384n.m839a("bandIndex")).intValue(), ((java.lang.Double) c0384n.m839a("gain")).doubleValue());
                            c0335k.mo742b(new java.util.HashMap());
                            break;
                        default:
                            c0335k.mo743c();
                            break;
                    }
                } catch (java.lang.Exception e4) {
                    e4.printStackTrace();
                    c0335k.mo741a("Error: " + e4, e4.toString(), null);
                }
            } catch (java.lang.IllegalStateException e5) {
                e5.printStackTrace();
                c0335k.mo741a("Illegal state: " + e5.getMessage(), e5.toString(), null);
            }
            m4338x();
        } catch (java.lang.Throwable th) {
            m4338x();
            throw th;
        }
    }

    /* renamed from: J */
    public final void m4314J() {
        new java.util.HashMap();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Long valueOf = m4321Q() == -9223372036854775807L ? null : java.lang.Long.valueOf(m4321Q() * 1000);
        p102a0.C0944H c0944h = this.f8736K;
        this.f8748q = c0944h != null ? c0944h.m1850m() : 0L;
        hashMap.put("processingState", java.lang.Integer.valueOf(p044L.AbstractC0352j.m781b(this.f8742Q)));
        hashMap.put("updatePosition", java.lang.Long.valueOf(this.f8746o * 1000));
        hashMap.put("updateTime", java.lang.Long.valueOf(this.f8747p));
        hashMap.put("bufferedPosition", java.lang.Long.valueOf(java.lang.Math.max(this.f8746o, this.f8748q) * 1000));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (this.f8756y != null) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("title", this.f8756y.f1090m);
            hashMap3.put("url", this.f8756y.f1091n);
            hashMap2.put("info", hashMap3);
        }
        if (this.f8757z != null) {
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("bitrate", java.lang.Integer.valueOf(this.f8757z.f1083l));
            hashMap4.put("genre", this.f8757z.f1084m);
            hashMap4.put("name", this.f8757z.f1085n);
            hashMap4.put("metadataInterval", java.lang.Integer.valueOf(this.f8757z.f1088q));
            hashMap4.put("url", this.f8757z.f1086o);
            hashMap4.put("isPublic", java.lang.Boolean.valueOf(this.f8757z.f1087p));
            hashMap2.put("headers", hashMap4);
        }
        hashMap.put("icyMetadata", hashMap2);
        hashMap.put("duration", valueOf);
        hashMap.put("currentIndex", this.f8739N);
        hashMap.put("androidAudioSessionId", this.f8737L);
        this.f8735J = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public final void m4315K() {
        android.media.audiofx.Equalizer equalizer;
        if (this.f8736K == null) {
            p102a0.C0992q c0992q = new p102a0.C0992q(this.f8743l);
            p102a0.C0980j c0980j = this.f8728C;
            if (c0980j != null) {
                p086W.AbstractC0781a.m1421j(!c0992q.f3701r);
                c0992q.f3689f = new p102a0.C0988n(0, c0980j);
            }
            p102a0.C0976h c0976h = this.f8730E;
            if (c0976h != null) {
                p086W.AbstractC0781a.m1421j(!c0992q.f3701r);
                c0992q.f3697n = c0976h;
            }
            p102a0.C0944H m2032a = c0992q.m2032a();
            this.f8736K = m2032a;
            m2032a.m1848U();
            p193t0.AbstractC2183u abstractC2183u = m2032a.f3360h;
            p193t0.C2173k m4302d = ((p193t0.C2179q) abstractC2183u).m4302d();
            m4302d.getClass();
            p193t0.C2172j c2172j = new p193t0.C2172j(m4302d);
            p043K2.C0341q c0341q = new p043K2.C0341q();
            boolean z4 = !this.f8729D;
            c0341q.f1063b = z4;
            c0341q.f1064c = z4;
            c0341q.f1062a = 1;
            c2172j.f2270m = new p076T.C0679W(c0341q);
            p193t0.C2173k c2173k = new p193t0.C2173k(c2172j);
            m2032a.m1848U();
            abstractC2183u.getClass();
            p193t0.C2179q c2179q = (p193t0.C2179q) abstractC2183u;
            if (!c2173k.equals(c2179q.m4302d())) {
                c2179q.m4304i(c2173k);
                p193t0.C2172j c2172j2 = new p193t0.C2172j(c2179q.m4302d());
                c2172j2.m1260a(c2173k);
                c2179q.m4304i(new p193t0.C2173k(c2172j2));
                m2032a.f3364l.m1444e(19, new p102a0.C0937A(c2173k));
            }
            p102a0.C0944H c0944h = this.f8736K;
            c0944h.m1848U();
            int i4 = c0944h.f3341U;
            if (i4 == 0) {
                this.f8737L = null;
            } else {
                this.f8737L = java.lang.Integer.valueOf(i4);
            }
            m4311D();
            if (this.f8737L != null) {
                for (java.util.Map map : this.f8731F) {
                    int intValue = this.f8737L.intValue();
                    java.lang.String str = (java.lang.String) map.get("type");
                    str.getClass();
                    if (str.equals("AndroidEqualizer")) {
                        equalizer = new android.media.audiofx.Equalizer(0, intValue);
                    } else {
                        if (!str.equals("AndroidLoudnessEnhancer")) {
                            throw new java.lang.IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
                        }
                        int round = (int) java.lang.Math.round(((java.lang.Double) map.get("targetGain")).doubleValue() * 1000.0d);
                        android.media.audiofx.LoudnessEnhancer loudnessEnhancer = new android.media.audiofx.LoudnessEnhancer(intValue);
                        loudnessEnhancer.setTargetGain(round);
                        equalizer = loudnessEnhancer;
                    }
                    if (((java.lang.Boolean) map.get("enabled")).booleanValue()) {
                        equalizer.setEnabled(true);
                    }
                    this.f8732G.add(equalizer);
                    this.f8733H.put((java.lang.String) map.get("type"), equalizer);
                }
            }
            m4314J();
            p102a0.C0944H c0944h2 = this.f8736K;
            c0944h2.getClass();
            c0944h2.f3364l.m1440a(this);
        }
    }

    /* renamed from: L */
    public final java.util.HashMap m4316L() {
        android.media.audiofx.Equalizer equalizer = (android.media.audiofx.Equalizer) this.f8733H.get("AndroidEqualizer");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (short s = 0; s < equalizer.getNumberOfBands(); s = (short) (s + 1)) {
            arrayList.add(m4310V("index", java.lang.Short.valueOf(s), "lowerFrequency", java.lang.Double.valueOf(equalizer.getBandFreqRange(s)[0] / 1000.0d), "upperFrequency", java.lang.Double.valueOf(equalizer.getBandFreqRange(s)[1] / 1000.0d), "centerFrequency", java.lang.Double.valueOf(equalizer.getCenterFreq(s) / 1000.0d), "gain", java.lang.Double.valueOf(equalizer.getBandLevel(s) / 1000.0d)));
        }
        return m4310V("parameters", m4310V("minDecibels", java.lang.Double.valueOf(equalizer.getBandLevelRange()[0] / 1000.0d), "maxDecibels", java.lang.Double.valueOf(equalizer.getBandLevelRange()[1] / 1000.0d), "bands", arrayList));
    }

    /* renamed from: M */
    public final void m4317M(int i4, double d4) {
        ((android.media.audiofx.Equalizer) this.f8733H.get("AndroidEqualizer")).setBandLevel((short) i4, (short) java.lang.Math.round(d4 * 1000.0d));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0089. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r23v1, types: [t0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [T.u, T.v] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T.u, T.v] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T.u, T.v] */
    /* renamed from: N */
    public final p179q0.AbstractC1984a m4318N(java.lang.Object obj) {
        p179q0.AbstractC1984a c2013r;
        p179q0.AbstractC1984a c2013r2;
        int i4;
        java.util.Map map;
        boolean z4 = true;
        java.util.Map map2 = (java.util.Map) obj;
        java.lang.String str = (java.lang.String) map2.get("id");
        java.util.HashMap hashMap = this.f8755x;
        p179q0.AbstractC1984a abstractC1984a = (p179q0.AbstractC1984a) hashMap.get(str);
        if (abstractC1984a == null) {
            java.util.Map map3 = map2;
            java.lang.String str2 = (java.lang.String) map3.get("id");
            java.lang.String str3 = (java.lang.String) map3.get("type");
            str3.getClass();
            char c4 = 65535;
            switch (str3.hashCode()) {
                case -445916622:
                    if (str3.equals("concatenating")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 103407:
                    if (str3.equals("hls")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 3075986:
                    if (str3.equals("dash")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 349937342:
                    if (str3.equals("looping")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 918617282:
                    if (str3.equals("clipping")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 1131547531:
                    if (str3.equals("progressive")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case 2092627105:
                    if (str3.equals("silence")) {
                        c4 = 6;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    java.util.ArrayList m4319O = m4319O(map3.get("children"));
                    p179q0.AbstractC1984a[] abstractC1984aArr = new p179q0.AbstractC1984a[m4319O.size()];
                    m4319O.toArray(abstractC1984aArr);
                    c2013r = new p179q0.C2013r(((java.lang.Boolean) map3.get("useLazyPreparation")).booleanValue(), m4307G((java.util.List) m4309U(map3, "shuffleOrder")), abstractC1984aArr);
                    abstractC1984a = c2013r;
                    hashMap.put(str, abstractC1984a);
                    break;
                case 1:
                    p179q0.InterfaceC1963E interfaceC1963E = new p179q0.InterfaceC1963E(m4339z((java.util.Map) m4309U(map3, "headers"))) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory

                        /* renamed from: a */
                        public final p129f2.C1408Y f4358a;

                        /* renamed from: b */
                        public final p132g0.C1458c f4359b;

                        /* renamed from: e */
                        public final p046L1.C0363g f4362e;

                        /* renamed from: g */
                        public final p193t0.C2164b f4364g;

                        /* renamed from: h */
                        public final boolean f4365h;

                        /* renamed from: i */
                        public final int f4366i;

                        /* renamed from: j */
                        public final long f4367j;

                        /* renamed from: f */
                        public final p043K2.C0339o f4363f = new p043K2.C0339o(27);

                        /* renamed from: c */
                        public final p025F1.C0215g f4360c = new java.lang.Object();

                        /* renamed from: d */
                        public final p107b0.C1169d f4361d = p136h0.C1486c.f6074z;

                        /* JADX WARN: Type inference failed for: r0v2, types: [t0.b, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v2, types: [F1.g, java.lang.Object] */
                        {
                            this.f4358a = new p129f2.C1408Y(1, r4);
                            p132g0.C1458c c1458c = p132g0.InterfaceC1465j.f5873a;
                            this.f4359b = c1458c;
                            this.f4364g = new java.lang.Object();
                            this.f4362e = new p046L1.C0363g(29, false);
                            this.f4366i = 1;
                            this.f4367j = -9223372036854775807L;
                            this.f4365h = true;
                            c1458c.f5843c = true;
                        }

                        @Override // p179q0.InterfaceC1963E
                        /* renamed from: a */
                        public final void mo2671a(p046L1.C0363g c0363g) {
                            this.f4359b.f5842b = c0363g;
                        }

                        @Override // p179q0.InterfaceC1963E
                        /* renamed from: b */
                        public final void mo2672b(boolean z5) {
                            this.f4359b.f5843c = z5;
                        }

                        @Override // p179q0.InterfaceC1963E
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final p132g0.C1468m mo2673c(p076T.C0659B c0659b) {
                            c0659b.f2143b.getClass();
                            p136h0.InterfaceC1499p interfaceC1499p = this.f4360c;
                            java.util.List list = c0659b.f2143b.f2451c;
                            if (!list.isEmpty()) {
                                interfaceC1499p = new p094Y.C0886x(12, interfaceC1499p, list);
                            }
                            p132g0.C1458c c1458c = this.f4359b;
                            p127f0.InterfaceC1376i m761n = this.f4363f.m761n(c0659b);
                            p193t0.C2164b c2164b = this.f4364g;
                            this.f4361d.getClass();
                            p129f2.C1408Y c1408y = this.f4358a;
                            return new p132g0.C1468m(c0659b, c1408y, c1458c, this.f4362e, m761n, c2164b, new p136h0.C1486c(c1408y, c2164b, interfaceC1499p), this.f4367j, this.f4365h, this.f4366i);
                        }
                    };
                    p076T.C0706t c0706t = new p076T.C0706t();
                    p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
                    p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
                    java.util.List emptyList = java.util.Collections.emptyList();
                    p129f2.C1415c0 c1415c02 = p129f2.C1415c0.f5744p;
                    p076T.C0709w c0709w = new p076T.C0709w();
                    p076T.C0712z c0712z = p076T.C0712z.f2455a;
                    android.net.Uri parse = android.net.Uri.parse((java.lang.String) map3.get("uri"));
                    c2013r = interfaceC1963E.mo2673c(new p076T.C0659B("", new p076T.C0707u(c0706t), parse != null ? new p076T.C0711y(parse, "application/x-mpegURL", null, emptyList, c1415c02, null, -9223372036854775807L) : null, new p076T.C0710x(c0709w), p076T.C0662E.f2173y, c0712z));
                    abstractC1984a = c2013r;
                    hashMap.put(str, abstractC1984a);
                    break;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    p179q0.InterfaceC1963E interfaceC1963E2 = new p179q0.InterfaceC1963E(m4339z((java.util.Map) m4309U(map3, "headers"))) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory

                        /* renamed from: a */
                        public final p063P2.C0528a f4351a;

                        /* renamed from: b */
                        public final p094Y.InterfaceC0869g f4352b;

                        /* renamed from: c */
                        public final p043K2.C0339o f4353c;

                        /* renamed from: d */
                        public final p046L1.C0363g f4354d;

                        /* renamed from: e */
                        public final p193t0.C2164b f4355e;

                        /* renamed from: f */
                        public final long f4356f;

                        /* renamed from: g */
                        public final long f4357g;

                        /* JADX WARN: Type inference failed for: r0v0, types: [P2.a, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v2, types: [t0.b, java.lang.Object] */
                        {
                            p009B2.C0033D c0033d = p184r0.C2046d.f8320u;
                            ?? obj2 = new java.lang.Object();
                            obj2.f1553n = c0033d;
                            obj2.f1552m = r4;
                            obj2.f1551l = 1;
                            this.f4351a = obj2;
                            this.f4352b = r4;
                            this.f4353c = new p043K2.C0339o(27);
                            this.f4355e = new java.lang.Object();
                            this.f4356f = 30000L;
                            this.f4357g = 5000000L;
                            this.f4354d = new p046L1.C0363g(29, false);
                            ((p009B2.C0033D) obj2.f1553n).f118a = true;
                        }

                        @Override // p179q0.InterfaceC1963E
                        /* renamed from: a */
                        public final void mo2671a(p046L1.C0363g c0363g) {
                            p009B2.C0033D c0033d = (p009B2.C0033D) this.f4351a.f1553n;
                            c0033d.getClass();
                            c0033d.f119b = c0363g;
                        }

                        @Override // p179q0.InterfaceC1963E
                        /* renamed from: b */
                        public final void mo2672b(boolean z5) {
                            ((p009B2.C0033D) this.f4351a.f1553n).f118a = z5;
                        }

                        @Override // p179q0.InterfaceC1963E
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final p117d0.C1263g mo2673c(p076T.C0659B c0659b) {
                            c0659b.f2143b.getClass();
                            p122e0.C1304e c1304e = new p122e0.C1304e();
                            java.util.List list = c0659b.f2143b.f2451c;
                            return new p117d0.C1263g(c0659b, this.f4352b, !list.isEmpty() ? new p094Y.C0886x(20, c1304e, list) : c1304e, this.f4351a, this.f4354d, this.f4353c.m761n(c0659b), this.f4355e, this.f4356f, this.f4357g);
                        }
                    };
                    p076T.C0706t c0706t2 = new p076T.C0706t();
                    p129f2.C1391G c1391g2 = p129f2.AbstractC1393I.f5704m;
                    p129f2.C1415c0 c1415c03 = p129f2.C1415c0.f5744p;
                    java.util.List emptyList2 = java.util.Collections.emptyList();
                    p129f2.C1415c0 c1415c04 = p129f2.C1415c0.f5744p;
                    p076T.C0709w c0709w2 = new p076T.C0709w();
                    p076T.C0712z c0712z2 = p076T.C0712z.f2455a;
                    android.net.Uri parse2 = android.net.Uri.parse((java.lang.String) map3.get("uri"));
                    c2013r = interfaceC1963E2.mo2673c(new p076T.C0659B("", new p076T.C0707u(c0706t2), parse2 != null ? new p076T.C0711y(parse2, "application/dash+xml", null, emptyList2, c1415c04, str2, -9223372036854775807L) : null, new p076T.C0710x(c0709w2), p076T.C0662E.f2173y, c0712z2));
                    abstractC1984a = c2013r;
                    hashMap.put(str, abstractC1984a);
                    break;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    java.lang.Integer num = (java.lang.Integer) map3.get("count");
                    p179q0.AbstractC1984a m4318N = m4318N(map3.get("child"));
                    int intValue = num.intValue();
                    p179q0.AbstractC1984a[] abstractC1984aArr2 = new p179q0.AbstractC1984a[intValue];
                    for (int i5 = 0; i5 < intValue; i5++) {
                        abstractC1984aArr2[i5] = m4318N;
                    }
                    c2013r2 = new p179q0.C2013r(false, new p179q0.C1991d0(), abstractC1984aArr2);
                    abstractC1984a = c2013r2;
                    hashMap.put(str, abstractC1984a);
                    break;
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    java.lang.Long m4308R = m4308R(map3.get("start"));
                    java.lang.Long m4308R2 = m4308R(map3.get("end"));
                    abstractC1984a = new p179q0.C1996g(m4318N(map3.get("child")), m4308R != null ? m4308R.longValue() : 0L, m4308R2 != null ? m4308R2.longValue() : Long.MIN_VALUE, true);
                    hashMap.put(str, abstractC1984a);
                    break;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    p008B1.C0026d m4339z = m4339z((java.util.Map) m4309U(map3, "headers"));
                    java.util.Map map4 = (java.util.Map) m4309U(map3, "options");
                    p215y0.C2401m c2401m = new p215y0.C2401m();
                    if (map4 == null || (map = (java.util.Map) map4.get("androidExtractorOptions")) == null) {
                        i4 = 0;
                    } else {
                        z4 = ((java.lang.Boolean) map.get("constantBitrateSeekingEnabled")).booleanValue();
                        r0 = ((java.lang.Boolean) map.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
                        i4 = ((java.lang.Integer) map.get("mp3Flags")).intValue();
                    }
                    synchronized (c2401m) {
                        c2401m.f9457l = z4;
                    }
                    synchronized (c2401m) {
                        c2401m.f9458m = r0;
                    }
                    synchronized (c2401m) {
                        c2401m.f9459n = i4;
                    }
                    p009B2.C0067x c0067x = new p009B2.C0067x(28, c2401m);
                    ?? obj2 = new java.lang.Object();
                    p076T.C0706t c0706t3 = new p076T.C0706t();
                    p129f2.C1391G c1391g3 = p129f2.AbstractC1393I.f5704m;
                    p129f2.C1415c0 c1415c05 = p129f2.C1415c0.f5744p;
                    java.util.List emptyList3 = java.util.Collections.emptyList();
                    p129f2.C1415c0 c1415c06 = p129f2.C1415c0.f5744p;
                    p076T.C0709w c0709w3 = new p076T.C0709w();
                    p076T.C0712z c0712z3 = p076T.C0712z.f2455a;
                    android.net.Uri parse3 = android.net.Uri.parse((java.lang.String) map3.get("uri"));
                    p076T.C0711y c0711y = parse3 != null ? new p076T.C0711y(parse3, null, null, emptyList3, c1415c06, str2, -9223372036854775807L) : null;
                    p076T.C0659B c0659b = new p076T.C0659B("", new p076T.C0707u(c0706t3), c0711y, new p076T.C0710x(c0709w3), p076T.C0662E.f2173y, c0712z3);
                    c0711y.getClass();
                    c0659b.f2143b.getClass();
                    c0659b.f2143b.getClass();
                    c2013r2 = new p179q0.C1979V(c0659b, m4339z, c0067x, p127f0.InterfaceC1376i.f5652a, obj2, 1048576);
                    abstractC1984a = c2013r2;
                    hashMap.put(str, abstractC1984a);
                    break;
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    long longValue = m4308R(map3.get("duration")).longValue();
                    p086W.AbstractC0781a.m1421j(longValue > 0);
                    p076T.C0705s m1178a = p179q0.C1997g0.f8151v.m1178a();
                    m1178a.f2432h = str2;
                    c2013r = new p179q0.C1997g0(longValue, m1178a.m1299a());
                    abstractC1984a = c2013r;
                    hashMap.put(str, abstractC1984a);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown AudioSource type: " + map3.get("type"));
            }
        }
        return abstractC1984a;
    }

    /* renamed from: O */
    public final java.util.ArrayList m4319O(java.lang.Object obj) {
        if (!(obj instanceof java.util.List)) {
            throw new java.lang.RuntimeException("List expected: " + obj);
        }
        java.util.List list = (java.util.List) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            arrayList.add(m4318N(list.get(i4)));
        }
        return arrayList;
    }

    /* renamed from: P */
    public final long m4320P() {
        long j4 = this.f8750s;
        if (j4 != -9223372036854775807L) {
            return j4;
        }
        int i4 = this.f8742Q;
        if (i4 != 1 && i4 != 2) {
            java.lang.Long l4 = this.f8749r;
            return (l4 == null || l4.longValue() == -9223372036854775807L) ? this.f8736K.m1855r() : this.f8749r.longValue();
        }
        long m1855r = this.f8736K.m1855r();
        if (m1855r < 0) {
            return 0L;
        }
        return m1855r;
    }

    /* renamed from: Q */
    public final long m4321Q() {
        p102a0.C0944H c0944h;
        int i4 = this.f8742Q;
        if (i4 == 1 || i4 == 2 || (c0944h = this.f8736K) == null) {
            return -9223372036854775807L;
        }
        return c0944h.m1859v();
    }

    /* renamed from: S */
    public final void m4322S(p179q0.AbstractC1984a abstractC1984a, long j4, java.lang.Integer num, p043K2.C0335k c0335k) {
        this.f8750s = j4;
        this.f8751t = num;
        this.f8739N = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
        int m781b = p044L.AbstractC0352j.m781b(this.f8742Q);
        if (m781b != 0) {
            if (m781b != 1) {
                p102a0.C0944H c0944h = this.f8736K;
                c0944h.m1848U();
                c0944h.f3377y.m1975d(1, c0944h.m1860w());
                c0944h.m1843P(null);
                p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
                long j5 = c0944h.f3355e0.f3597s;
                new p082V.C0758c(c1415c0);
            } else {
                p043K2.C0335k c0335k2 = this.f8752u;
                if (c0335k2 != null) {
                    c0335k2.mo741a("abort", "Connection aborted", null);
                    this.f8752u = null;
                }
                this.f8744m.m4341b("abort", "Connection aborted", null);
                p102a0.C0944H c0944h2 = this.f8736K;
                c0944h2.m1848U();
                c0944h2.f3377y.m1975d(1, c0944h2.m1860w());
                c0944h2.m1843P(null);
                p129f2.C1415c0 c1415c02 = p129f2.C1415c0.f5744p;
                long j6 = c0944h2.f3355e0.f3597s;
                new p082V.C0758c(c1415c02);
            }
        }
        this.f8726A = 0;
        this.f8752u = c0335k;
        m4337h0();
        this.f8742Q = 2;
        m4314J();
        this.f8738M = abstractC1984a;
        p102a0.C0944H c0944h3 = this.f8736K;
        c0944h3.m1848U();
        java.util.List singletonList = java.util.Collections.singletonList(abstractC1984a);
        c0944h3.m1848U();
        c0944h3.m1836I(singletonList);
        this.f8736K.m1831D();
    }

    /* renamed from: T */
    public final void m4323T(double d4) {
        ((android.media.audiofx.LoudnessEnhancer) this.f8733H.get("AndroidLoudnessEnhancer")).setTargetGain((int) java.lang.Math.round(d4 * 1000.0d));
    }

    /* renamed from: W */
    public final void m4324W() {
        if (this.f8736K.m1860w()) {
            this.f8736K.m1837J(false);
            m4337h0();
            p043K2.C0335k c0335k = this.f8753v;
            if (c0335k != null) {
                c0335k.mo742b(new java.util.HashMap());
                this.f8753v = null;
            }
        }
    }

    /* renamed from: X */
    public final void m4325X(p043K2.C0335k c0335k) {
        p043K2.C0335k c0335k2;
        if (this.f8736K.m1860w()) {
            c0335k.mo742b(new java.util.HashMap());
            return;
        }
        p043K2.C0335k c0335k3 = this.f8753v;
        if (c0335k3 != null) {
            c0335k3.mo742b(new java.util.HashMap());
        }
        this.f8753v = c0335k;
        this.f8736K.m1837J(true);
        m4337h0();
        if (this.f8742Q != 5 || (c0335k2 = this.f8753v) == null) {
            return;
        }
        c0335k2.mo742b(new java.util.HashMap());
        this.f8753v = null;
    }

    /* renamed from: Y */
    public final void m4326Y(long j4, java.lang.Integer num, p043K2.C0335k c0335k) {
        int i4 = this.f8742Q;
        if (i4 == 1 || i4 == 2) {
            c0335k.mo742b(new java.util.HashMap());
            return;
        }
        p043K2.C0335k c0335k2 = this.f8754w;
        if (c0335k2 != null) {
            try {
                c0335k2.mo742b(new java.util.HashMap());
            } catch (java.lang.RuntimeException unused) {
            }
            this.f8754w = null;
            this.f8749r = null;
        }
        this.f8749r = java.lang.Long.valueOf(j4);
        this.f8754w = c0335k;
        try {
            this.f8736K.mo558k(num != null ? num.intValue() : this.f8736K.m1854q(), j4, false);
        } catch (java.lang.RuntimeException e4) {
            this.f8754w = null;
            this.f8749r = null;
            throw e4;
        }
    }

    /* renamed from: Z */
    public final void m4327Z(int i4, int i5, int i6) {
        p076T.C0691e c0691e = new p076T.C0691e(i4, i5, i6);
        if (this.f8742Q == 2) {
            this.f8727B = c0691e;
        } else {
            this.f8736K.m1835H(c0691e, false);
        }
    }

    /* renamed from: a */
    public final void m4328a(java.lang.String str, boolean z4) {
        ((android.media.audiofx.AudioEffect) this.f8733H.get(str)).setEnabled(z4);
    }

    /* renamed from: a0 */
    public final void m4329a0(int i4) {
        this.f8736K.m1839L(i4);
    }

    /* renamed from: b0 */
    public final void m4330b0(float f4) {
        p102a0.C0944H c0944h = this.f8736K;
        c0944h.m1848U();
        p076T.C0668K c0668k = c0944h.f3355e0.f3593o;
        if (c0668k.f2208b == f4) {
            return;
        }
        this.f8736K.m1838K(new p076T.C0668K(c0668k.f2207a, f4));
        m4314J();
    }

    /* renamed from: c0 */
    public final void m4331c0(boolean z4) {
        p102a0.C0944H c0944h = this.f8736K;
        c0944h.m1848U();
        if (c0944h.f3324D != z4) {
            c0944h.f3324D = z4;
            p086W.C0802v c0802v = c0944h.f3363k.f3436s;
            c0802v.getClass();
            p086W.C0801u m1568b = p086W.C0802v.m1568b();
            m1568b.f2793a = c0802v.f2795a.obtainMessage(12, z4 ? 1 : 0, 0);
            m1568b.m1567b();
            p102a0.C0997v c0997v = new p102a0.C0997v(1, z4);
            p086W.C0791k c0791k = c0944h.f3364l;
            c0791k.m1442c(9, c0997v);
            c0944h.m1844Q();
            c0791k.m1441b();
        }
    }

    /* renamed from: d0 */
    public final void m4332d0(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        p179q0.AbstractC1984a abstractC1984a = (p179q0.AbstractC1984a) this.f8755x.get((java.lang.String) m4309U(map, "id"));
        if (abstractC1984a == null) {
            return;
        }
        java.lang.String str = (java.lang.String) m4309U(map, "type");
        str.getClass();
        if (!str.equals("concatenating")) {
            if (str.equals("looping")) {
                m4332d0(m4309U(map, "child"));
            }
        } else {
            ((p179q0.C2013r) abstractC1984a).m4066M(m4307G((java.util.List) m4309U(map, "shuffleOrder")));
            java.util.Iterator it = ((java.util.List) m4309U(map, "children")).iterator();
            while (it.hasNext()) {
                m4332d0(it.next());
            }
        }
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: e */
    public final void mo1212e(int i4, p076T.C0671N c0671n, p076T.C0671N c0671n2) {
        m4337h0();
        if (i4 == 0 || i4 == 1) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f8736K.m1854q());
            if (!valueOf.equals(this.f8739N)) {
                this.f8739N = valueOf;
            }
        }
        m4335g();
    }

    /* renamed from: e0 */
    public final void m4333e0(boolean z4) {
        p102a0.C0944H c0944h = this.f8736K;
        c0944h.m1848U();
        if (c0944h.f3344X == z4) {
            return;
        }
        c0944h.f3344X = z4;
        c0944h.m1834G(1, 9, java.lang.Boolean.valueOf(z4));
        c0944h.f3364l.m1444e(23, new p102a0.C0997v(0, z4));
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: f */
    public final void mo1213f(int i4) {
        if (i4 == 2) {
            if (m4320P() != this.f8746o) {
                this.f8746o = m4320P();
                this.f8747p = java.lang.System.currentTimeMillis();
            }
            int i5 = this.f8742Q;
            if (i5 != 3 && i5 != 2) {
                this.f8742Q = 3;
                m4335g();
            }
            android.os.Handler handler = this.f8740O;
            p024F.RunnableC0199b runnableC0199b = this.f8741P;
            handler.removeCallbacks(runnableC0199b);
            handler.post(runnableC0199b);
            return;
        }
        if (i4 != 3) {
            if (i4 != 4) {
                return;
            }
            if (this.f8742Q != 5) {
                m4337h0();
                this.f8742Q = 5;
                m4335g();
            }
            if (this.f8752u != null) {
                this.f8752u.mo742b(new java.util.HashMap());
                this.f8752u = null;
                p076T.C0691e c0691e = this.f8727B;
                if (c0691e != null) {
                    this.f8736K.m1835H(c0691e, false);
                    this.f8727B = null;
                }
            }
            p043K2.C0335k c0335k = this.f8753v;
            if (c0335k != null) {
                c0335k.mo742b(new java.util.HashMap());
                this.f8753v = null;
                return;
            }
            return;
        }
        if (this.f8736K.m1860w()) {
            m4337h0();
        }
        this.f8742Q = 4;
        m4335g();
        if (this.f8752u != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("duration", m4321Q() == -9223372036854775807L ? null : java.lang.Long.valueOf(m4321Q() * 1000));
            this.f8752u.mo742b(hashMap);
            this.f8752u = null;
            p076T.C0691e c0691e2 = this.f8727B;
            if (c0691e2 != null) {
                this.f8736K.m1835H(c0691e2, false);
                this.f8727B = null;
            }
        }
        p043K2.C0335k c0335k2 = this.f8754w;
        if (c0335k2 != null) {
            this.f8749r = null;
            c0335k2.mo742b(new java.util.HashMap());
            this.f8754w = null;
        }
    }

    /* renamed from: f0 */
    public final void m4334f0(float f4) {
        p102a0.C0944H c0944h = this.f8736K;
        c0944h.m1848U();
        p076T.C0668K c0668k = c0944h.f3355e0.f3593o;
        if (c0668k.f2207a == f4) {
            return;
        }
        this.f8736K.m1838K(new p076T.C0668K(f4, c0668k.f2208b));
        if (this.f8736K.m1860w()) {
            m4337h0();
        }
        m4314J();
    }

    /* renamed from: g */
    public final void m4335g() {
        m4314J();
        m4338x();
    }

    /* renamed from: g0 */
    public final void m4336g0(float f4) {
        this.f8736K.m1842O(f4);
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: h */
    public final void mo1214h(int i4) {
        int mo1250e;
        int mo1250e2;
        if (this.f8750s != -9223372036854775807L || this.f8751t != null) {
            java.lang.Integer num = this.f8751t;
            this.f8736K.mo558k(num != null ? num.intValue() : 0, this.f8750s, false);
            this.f8751t = null;
            this.f8750s = -9223372036854775807L;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f8736K.m1854q());
        if (!valueOf.equals(this.f8739N)) {
            this.f8739N = valueOf;
            m4335g();
        }
        if (this.f8736K.m1861x() == 4) {
            try {
                if (this.f8736K.m1860w()) {
                    if (this.f8734I == 0) {
                        p102a0.C0944H c0944h = this.f8736K;
                        c0944h.getClass();
                        if (c0944h.m1857t().mo1236o() > 0) {
                            this.f8736K.mo558k(0, 0L, false);
                        }
                    }
                    p102a0.C0944H c0944h2 = this.f8736K;
                    c0944h2.getClass();
                    p076T.AbstractC0677U m1857t = c0944h2.m1857t();
                    if (m1857t.m1256p()) {
                        mo1250e = -1;
                    } else {
                        int m1854q = c0944h2.m1854q();
                        c0944h2.m1848U();
                        int i5 = c0944h2.f3323C;
                        if (i5 == 1) {
                            i5 = 0;
                        }
                        c0944h2.m1848U();
                        mo1250e = m1857t.mo1250e(m1854q, i5, c0944h2.f3324D);
                    }
                    if (mo1250e != -1) {
                        p102a0.C0944H c0944h3 = this.f8736K;
                        c0944h3.getClass();
                        p076T.AbstractC0677U m1857t2 = c0944h3.m1857t();
                        if (m1857t2.m1256p()) {
                            mo1250e2 = -1;
                        } else {
                            int m1854q2 = c0944h3.m1854q();
                            c0944h3.m1848U();
                            int i6 = c0944h3.f3323C;
                            if (i6 == 1) {
                                i6 = 0;
                            }
                            c0944h3.m1848U();
                            mo1250e2 = m1857t2.mo1250e(m1854q2, i6, c0944h3.f3324D);
                        }
                        if (mo1250e2 == -1) {
                            c0944h3.m1848U();
                        } else if (mo1250e2 == c0944h3.m1854q()) {
                            c0944h3.mo558k(c0944h3.m1854q(), -9223372036854775807L, true);
                        } else {
                            c0944h3.mo558k(mo1250e2, -9223372036854775807L, false);
                        }
                    }
                } else {
                    int m1854q3 = this.f8736K.m1854q();
                    p102a0.C0944H c0944h4 = this.f8736K;
                    c0944h4.getClass();
                    if (m1854q3 < c0944h4.m1857t().mo1236o()) {
                        p102a0.C0944H c0944h5 = this.f8736K;
                        c0944h5.mo558k(c0944h5.m1854q(), 0L, false);
                    }
                }
            } catch (java.lang.Exception e4) {
                e4.printStackTrace();
            }
        }
        p102a0.C0944H c0944h6 = this.f8736K;
        c0944h6.getClass();
        this.f8734I = c0944h6.m1857t().mo1236o();
    }

    /* renamed from: h0 */
    public final void m4337h0() {
        this.f8746o = m4320P();
        this.f8747p = java.lang.System.currentTimeMillis();
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: n */
    public final void mo1220n(p076T.C0684a0 c0684a0) {
        for (int i4 = 0; i4 < c0684a0.m1263a().size(); i4++) {
            p076T.C0678V c0678v = ((p076T.C0682Z) c0684a0.m1263a().get(i4)).f2293b;
            for (int i5 = 0; i5 < c0678v.f2249a; i5++) {
                p076T.C0664G c0664g = c0678v.m1258a(i5).f2406k;
                if (c0664g != null) {
                    for (int i6 = 0; i6 < c0664g.m1189g(); i6++) {
                        p076T.InterfaceC0663F m1188f = c0664g.m1188f(i6);
                        if (m1188f instanceof p045L0.C0355b) {
                            this.f8757z = (p045L0.C0355b) m1188f;
                            m4335g();
                        }
                    }
                }
            }
        }
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: t */
    public final void mo1226t(p076T.AbstractC0667J abstractC0667J) {
        int mo1250e;
        java.lang.Integer num;
        int intValue;
        boolean z4 = abstractC0667J instanceof p102a0.C0986m;
        p194t2.C2186b c2186b = this.f8744m;
        if (z4) {
            p102a0.C0986m c0986m = (p102a0.C0986m) abstractC0667J;
            int i4 = c0986m.f3664n;
            if (i4 == 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TYPE_SOURCE: ");
                p086W.AbstractC0781a.m1421j(i4 == 0);
                java.lang.Throwable cause = c0986m.getCause();
                cause.getClass();
                sb.append(((java.io.IOException) cause).getMessage());
                android.util.Log.e("AudioPlayer", sb.toString());
            } else if (i4 != 1) {
                int i5 = c0986m.f3664n;
                if (i4 != 2) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("default ExoPlaybackException: ");
                    p086W.AbstractC0781a.m1421j(i5 == 2);
                    java.lang.Throwable cause2 = c0986m.getCause();
                    cause2.getClass();
                    sb2.append(((java.lang.RuntimeException) cause2).getMessage());
                    android.util.Log.e("AudioPlayer", sb2.toString());
                } else {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("TYPE_UNEXPECTED: ");
                    p086W.AbstractC0781a.m1421j(i5 == 2);
                    java.lang.Throwable cause3 = c0986m.getCause();
                    cause3.getClass();
                    sb3.append(((java.lang.RuntimeException) cause3).getMessage());
                    android.util.Log.e("AudioPlayer", sb3.toString());
                }
            } else {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("TYPE_RENDERER: ");
                p086W.AbstractC0781a.m1421j(i4 == 1);
                java.lang.Throwable cause4 = c0986m.getCause();
                cause4.getClass();
                sb4.append(((java.lang.Exception) cause4).getMessage());
                android.util.Log.e("AudioPlayer", sb4.toString());
            }
            java.lang.String valueOf = java.lang.String.valueOf(i4);
            java.lang.String message = c0986m.getMessage();
            java.util.HashMap m4310V = m4310V("index", this.f8739N);
            p043K2.C0335k c0335k = this.f8752u;
            if (c0335k != null) {
                c0335k.mo741a(valueOf, message, m4310V);
                this.f8752u = null;
            }
            c2186b.m4341b(valueOf, message, m4310V);
        } else {
            android.util.Log.e("AudioPlayer", "default PlaybackException: " + abstractC0667J.getMessage());
            java.lang.String valueOf2 = java.lang.String.valueOf(abstractC0667J.f2204l);
            java.lang.String message2 = abstractC0667J.getMessage();
            java.util.HashMap m4310V2 = m4310V("index", this.f8739N);
            p043K2.C0335k c0335k2 = this.f8752u;
            if (c0335k2 != null) {
                c0335k2.mo741a(valueOf2, message2, m4310V2);
                this.f8752u = null;
            }
            c2186b.m4341b(valueOf2, message2, m4310V2);
        }
        this.f8726A++;
        p102a0.C0944H c0944h = this.f8736K;
        c0944h.getClass();
        p076T.AbstractC0677U m1857t = c0944h.m1857t();
        if (m1857t.m1256p()) {
            mo1250e = -1;
        } else {
            int m1854q = c0944h.m1854q();
            c0944h.m1848U();
            int i6 = c0944h.f3323C;
            if (i6 == 1) {
                i6 = 0;
            }
            c0944h.m1848U();
            mo1250e = m1857t.mo1250e(m1854q, i6, c0944h.f3324D);
        }
        if (!(mo1250e != -1) || (num = this.f8739N) == null || this.f8726A > 5 || (intValue = num.intValue() + 1) >= this.f8736K.m1857t().mo1236o()) {
            return;
        }
        p102a0.C0944H c0944h2 = this.f8736K;
        p179q0.AbstractC1984a abstractC1984a = this.f8738M;
        c0944h2.m1848U();
        java.util.List singletonList = java.util.Collections.singletonList(abstractC1984a);
        c0944h2.m1848U();
        c0944h2.m1836I(singletonList);
        this.f8736K.m1831D();
        this.f8736K.mo558k(intValue, 0L, false);
    }

    @Override // p076T.InterfaceC0670M
    /* renamed from: v */
    public final void mo1228v(p076T.C0664G c0664g) {
        int i4 = 0;
        while (true) {
            p076T.InterfaceC0663F[] interfaceC0663FArr = c0664g.f2198l;
            if (i4 >= interfaceC0663FArr.length) {
                return;
            }
            p076T.InterfaceC0663F interfaceC0663F = interfaceC0663FArr[i4];
            if (interfaceC0663F instanceof p045L0.C0356c) {
                this.f8756y = (p045L0.C0356c) interfaceC0663F;
                m4335g();
            }
            i4++;
        }
    }

    /* renamed from: x */
    public final void m4338x() {
        java.util.HashMap hashMap = this.f8735J;
        if (hashMap != null) {
            p047L2.C0378h c0378h = this.f8744m.f8758a;
            if (c0378h != null) {
                c0378h.m830c(hashMap);
            }
            this.f8735J = null;
        }
    }

    /* renamed from: z */
    public final p008B1.C0026d m4339z(java.util.Map map) {
        java.util.HashMap hashMap;
        java.lang.String str;
        java.lang.String str2 = null;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new java.util.HashMap();
            for (java.lang.Object obj : map.keySet()) {
                hashMap.put((java.lang.String) obj, (java.lang.String) map.get(obj));
            }
        }
        if (hashMap != null && (str2 = (java.lang.String) hashMap.remove("User-Agent")) == null) {
            str2 = (java.lang.String) hashMap.remove("user-agent");
        }
        android.content.Context context = this.f8743l;
        if (str2 == null) {
            int i4 = p086W.AbstractC0805y.f2801a;
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                str = "?";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("just_audio/");
            sb.append(str);
            sb.append(" (Linux;Android ");
            str2 = p009B2.AbstractC0051h.m154m(sb, android.os.Build.VERSION.RELEASE, ") AndroidXMedia3/1.4.1");
        }
        p077T0.C0717e c0717e = new p077T0.C0717e(1);
        c0717e.f2478p = str2;
        c0717e.f2476n = true;
        if (hashMap != null && hashMap.size() > 0) {
            c0717e.m1309d(hashMap);
        }
        return new p008B1.C0026d(context, c0717e);
    }
}
