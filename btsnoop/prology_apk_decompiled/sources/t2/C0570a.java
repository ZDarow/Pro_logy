package t2;

import B2.AbstractC0007h;
import B2.D;
import I.C0044m;
import K2.k;
import L.j;
import L1.g;
import L2.f;
import L2.h;
import L2.n;
import L2.o;
import P2.a;
import T.B;
import T.C0084e;
import T.C0097s;
import T.C0098t;
import T.C0099u;
import T.C0101w;
import T.C0102x;
import T.C0103y;
import T.C0104z;
import T.E;
import T.F;
import T.J;
import T.K;
import T.M;
import T.N;
import T.U;
import T.W;
import T.Z;
import T.a0;
import W.v;
import W.y;
import X2.p;
import Y.x;
import a0.C0111A;
import a0.C0118H;
import a0.C0128h;
import a0.C0130j;
import a0.C0133m;
import a0.C0134n;
import a0.C0137q;
import a0.C0141v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b0.d;
import e0.C0253e;
import f0.i;
import f2.G;
import f2.I;
import f2.Y;
import f2.c0;
import g0.C0307c;
import g0.m;
import h0.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import q0.AbstractC0469a;
import q0.C0475g;
import q0.InterfaceC0468E;
import q0.V;
import q0.d0;
import q0.g0;
import q0.r;
import r0.C0502d;
import t0.C0560b;
import t0.C0568j;
import t0.C0569k;
import t0.q;
import t0.u;
import u0.e;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570a implements o, M {

    /* renamed from: R, reason: collision with root package name */
    public static final Random f8393R = new Random();

    /* renamed from: A, reason: collision with root package name */
    public int f8394A;

    /* renamed from: B, reason: collision with root package name */
    public C0084e f8395B;

    /* renamed from: C, reason: collision with root package name */
    public final C0130j f8396C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f8397D;

    /* renamed from: E, reason: collision with root package name */
    public final C0128h f8398E;

    /* renamed from: F, reason: collision with root package name */
    public final List f8399F;
    public HashMap J;

    /* renamed from: K, reason: collision with root package name */
    public C0118H f8403K;

    /* renamed from: L, reason: collision with root package name */
    public Integer f8404L;

    /* renamed from: M, reason: collision with root package name */
    public AbstractC0469a f8405M;

    /* renamed from: N, reason: collision with root package name */
    public Integer f8406N;

    /* renamed from: Q, reason: collision with root package name */
    public int f8409Q;

    /* renamed from: l, reason: collision with root package name */
    public final Context f8410l;

    /* renamed from: m, reason: collision with root package name */
    public final C0571b f8411m;

    /* renamed from: n, reason: collision with root package name */
    public final C0571b f8412n;

    /* renamed from: o, reason: collision with root package name */
    public long f8413o;

    /* renamed from: p, reason: collision with root package name */
    public long f8414p;

    /* renamed from: q, reason: collision with root package name */
    public long f8415q;

    /* renamed from: r, reason: collision with root package name */
    public Long f8416r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f8417t;

    /* renamed from: u, reason: collision with root package name */
    public k f8418u;

    /* renamed from: v, reason: collision with root package name */
    public k f8419v;
    public k w;

    /* renamed from: y, reason: collision with root package name */
    public L0.c f8421y;

    /* renamed from: z, reason: collision with root package name */
    public L0.b f8422z;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f8420x = new HashMap();

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f8400G = new ArrayList();

    /* renamed from: H, reason: collision with root package name */
    public final HashMap f8401H = new HashMap();

    /* renamed from: I, reason: collision with root package name */
    public int f8402I = 0;

    /* renamed from: O, reason: collision with root package name */
    public final Handler f8407O = new Handler(Looper.getMainLooper());

    /* renamed from: P, reason: collision with root package name */
    public final F.b f8408P = new F.b(12, this);

    public C0570a(Context context, f fVar, String str, Map map, List list, Boolean bool) {
        boolean z4 = false;
        this.f8410l = context;
        this.f8399F = list;
        this.f8397D = bool != null ? bool.booleanValue() : false;
        new C0044m(fVar, AbstractC0007h.l("com.ryanheise.just_audio.methods.", str)).s(this);
        this.f8411m = new C0571b(fVar, AbstractC0007h.l("com.ryanheise.just_audio.events.", str));
        this.f8412n = new C0571b(fVar, AbstractC0007h.l("com.ryanheise.just_audio.data.", str));
        this.f8409Q = 1;
        if (map != null) {
            Map map2 = (Map) map.get("androidLoadControl");
            if (map2 != null) {
                int longValue = (int) (R(map2.get("minBufferDuration")).longValue() / 1000);
                int longValue2 = (int) (R(map2.get("maxBufferDuration")).longValue() / 1000);
                int longValue3 = (int) (R(map2.get("bufferForPlaybackDuration")).longValue() / 1000);
                int longValue4 = (int) (R(map2.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000);
                C0130j.a(longValue3, 0, "bufferForPlaybackMs", "0");
                C0130j.a(longValue4, 0, "bufferForPlaybackAfterRebufferMs", "0");
                C0130j.a(longValue, longValue3, "minBufferMs", "bufferForPlaybackMs");
                C0130j.a(longValue, longValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                C0130j.a(longValue2, longValue, "maxBufferMs", "minBufferMs");
                boolean booleanValue = ((Boolean) map2.get("prioritizeTimeOverSizeThresholds")).booleanValue();
                int longValue5 = (int) (R(map2.get("backBufferDuration")).longValue() / 1000);
                C0130j.a(longValue5, 0, "backBufferDurationMs", "0");
                this.f8396C = new C0130j(new e(), longValue, longValue2, longValue3, longValue4, map2.get("targetBufferBytes") != null ? ((Integer) map2.get("targetBufferBytes")).intValue() : -1, booleanValue, longValue5);
            }
            Map map3 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                int i4 = y.f2709a;
                float doubleValue = (float) ((Double) map3.get("fallbackMinPlaybackSpeed")).doubleValue();
                W.a.e(0.0f < doubleValue && doubleValue <= 1.0f);
                float doubleValue2 = (float) ((Double) map3.get("fallbackMaxPlaybackSpeed")).doubleValue();
                W.a.e(doubleValue2 >= 1.0f);
                long longValue6 = R(map3.get("minUpdateInterval")).longValue() / 1000;
                W.a.e(longValue6 > 0);
                float doubleValue3 = (float) ((Double) map3.get("proportionalControlFactor")).doubleValue();
                W.a.e(doubleValue3 > 0.0f);
                float f4 = doubleValue3 / 1000000.0f;
                long longValue7 = R(map3.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000;
                W.a.e(longValue7 > 0);
                long M3 = y.M(longValue7);
                long longValue8 = R(map3.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000;
                W.a.e(longValue8 >= 0);
                long M4 = y.M(longValue8);
                float doubleValue4 = (float) ((Double) map3.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue();
                if (doubleValue4 >= 0.0f && doubleValue4 < 1.0f) {
                    z4 = true;
                }
                W.a.e(z4);
                this.f8398E = new C0128h(doubleValue, doubleValue2, longValue6, f4, M3, M4, doubleValue4);
            }
        }
    }

    public static d0 G(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = ((Integer) list.get(i4)).intValue();
        }
        return new d0(Arrays.copyOf(iArr, size), new Random(f8393R.nextLong()));
    }

    public static Long R(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static Object U(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        return null;
    }

    public static HashMap V(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < objArr.length; i4 += 2) {
            hashMap.put((String) objArr[i4], objArr[i4 + 1]);
        }
        return hashMap;
    }

    public final void D() {
        Iterator it = this.f8400G.iterator();
        while (it.hasNext()) {
            ((AudioEffect) it.next()).release();
            it.remove();
        }
        this.f8401H.clear();
    }

    public final r F(Object obj) {
        return (r) this.f8420x.get((String) obj);
    }

    public final void H() {
        int i4 = this.f8409Q;
        C0571b c0571b = this.f8411m;
        if (i4 == 2) {
            k kVar = this.f8418u;
            if (kVar != null) {
                kVar.a("abort", "Connection aborted", null);
                this.f8418u = null;
            }
            c0571b.b("abort", "Connection aborted", null);
        }
        k kVar2 = this.f8419v;
        if (kVar2 != null) {
            kVar2.b(new HashMap());
            this.f8419v = null;
        }
        this.f8420x.clear();
        this.f8405M = null;
        D();
        C0118H c0118h = this.f8403K;
        if (c0118h != null) {
            c0118h.E();
            this.f8403K = null;
            this.f8409Q = 1;
            g();
        }
        c0571b.a();
        this.f8412n.a();
    }

    @Override // L2.o
    public final void I(n nVar, k kVar) {
        char c4;
        K();
        try {
            try {
                try {
                    String str = nVar.f1094a;
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
                    Handler handler = this.f8407O;
                    switch (c4) {
                        case 0:
                            Long R3 = R(nVar.a("initialPosition"));
                            S(N(nVar.a("audioSource")), R3 == null ? -9223372036854775807L : R3.longValue() / 1000, (Integer) nVar.a("initialIndex"), kVar);
                            break;
                        case 1:
                            X(kVar);
                            break;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            W();
                            kVar.b(new HashMap());
                            break;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            g0((float) ((Double) nVar.a("volume")).doubleValue());
                            kVar.b(new HashMap());
                            break;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            f0((float) ((Double) nVar.a("speed")).doubleValue());
                            kVar.b(new HashMap());
                            break;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            b0((float) ((Double) nVar.a("pitch")).doubleValue());
                            kVar.b(new HashMap());
                            break;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            e0(((Boolean) nVar.a("enabled")).booleanValue());
                            kVar.b(new HashMap());
                            break;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            a0(((Integer) nVar.a("loopMode")).intValue());
                            kVar.b(new HashMap());
                            break;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            c0(((Integer) nVar.a("shuffleMode")).intValue() == 1);
                            kVar.b(new HashMap());
                            break;
                        case '\t':
                            d0(nVar.a("audioSource"));
                            kVar.b(new HashMap());
                            break;
                        case '\n':
                            kVar.b(new HashMap());
                            break;
                        case 11:
                            kVar.b(new HashMap());
                            break;
                        case '\f':
                            kVar.b(new HashMap());
                            break;
                        case '\r':
                            Long R4 = R(nVar.a("position"));
                            Y(R4 == null ? -9223372036854775807L : R4.longValue() / 1000, (Integer) nVar.a("index"), kVar);
                            break;
                        case 14:
                            F(nVar.a("id")).B(((Integer) nVar.a("index")).intValue(), O(nVar.a("children")), handler, new p(kVar, 4));
                            F(nVar.a("id")).M(G((List) nVar.a("shuffleOrder")));
                            break;
                        case 15:
                            F(nVar.a("id")).J(((Integer) nVar.a("startIndex")).intValue(), ((Integer) nVar.a("endIndex")).intValue(), handler, new p(kVar, 5));
                            F(nVar.a("id")).M(G((List) nVar.a("shuffleOrder")));
                            break;
                        case 16:
                            F(nVar.a("id")).I(((Integer) nVar.a("currentIndex")).intValue(), ((Integer) nVar.a("newIndex")).intValue(), handler, new p(kVar, 6));
                            F(nVar.a("id")).M(G((List) nVar.a("shuffleOrder")));
                            break;
                        case 17:
                            Z(((Integer) nVar.a("contentType")).intValue(), ((Integer) nVar.a("flags")).intValue(), ((Integer) nVar.a("usage")).intValue());
                            kVar.b(new HashMap());
                            break;
                        case 18:
                            a((String) nVar.a("type"), ((Boolean) nVar.a("enabled")).booleanValue());
                            kVar.b(new HashMap());
                            break;
                        case 19:
                            T(((Double) nVar.a("targetGain")).doubleValue());
                            kVar.b(new HashMap());
                            break;
                        case 20:
                            kVar.b(L());
                            break;
                        case 21:
                            M(((Integer) nVar.a("bandIndex")).intValue(), ((Double) nVar.a("gain")).doubleValue());
                            kVar.b(new HashMap());
                            break;
                        default:
                            kVar.c();
                            break;
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    kVar.a("Error: " + e4, e4.toString(), null);
                }
            } catch (IllegalStateException e5) {
                e5.printStackTrace();
                kVar.a("Illegal state: " + e5.getMessage(), e5.toString(), null);
            }
            x();
        } catch (Throwable th) {
            x();
            throw th;
        }
    }

    public final void J() {
        new HashMap();
        HashMap hashMap = new HashMap();
        Long valueOf = Q() == -9223372036854775807L ? null : Long.valueOf(Q() * 1000);
        C0118H c0118h = this.f8403K;
        this.f8415q = c0118h != null ? c0118h.m() : 0L;
        hashMap.put("processingState", Integer.valueOf(j.b(this.f8409Q)));
        hashMap.put("updatePosition", Long.valueOf(this.f8413o * 1000));
        hashMap.put("updateTime", Long.valueOf(this.f8414p));
        hashMap.put("bufferedPosition", Long.valueOf(Math.max(this.f8413o, this.f8415q) * 1000));
        HashMap hashMap2 = new HashMap();
        if (this.f8421y != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("title", this.f8421y.f1051m);
            hashMap3.put("url", this.f8421y.f1052n);
            hashMap2.put("info", hashMap3);
        }
        if (this.f8422z != null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("bitrate", Integer.valueOf(this.f8422z.f1044l));
            hashMap4.put("genre", this.f8422z.f1045m);
            hashMap4.put("name", this.f8422z.f1046n);
            hashMap4.put("metadataInterval", Integer.valueOf(this.f8422z.f1049q));
            hashMap4.put("url", this.f8422z.f1047o);
            hashMap4.put("isPublic", Boolean.valueOf(this.f8422z.f1048p));
            hashMap2.put("headers", hashMap4);
        }
        hashMap.put("icyMetadata", hashMap2);
        hashMap.put("duration", valueOf);
        hashMap.put("currentIndex", this.f8406N);
        hashMap.put("androidAudioSessionId", this.f8404L);
        this.J = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K() {
        Equalizer equalizer;
        if (this.f8403K == null) {
            C0137q c0137q = new C0137q(this.f8410l);
            C0130j c0130j = this.f8396C;
            if (c0130j != null) {
                W.a.j(!c0137q.f3578r);
                c0137q.f3566f = new C0134n(0, c0130j);
            }
            C0128h c0128h = this.f8398E;
            if (c0128h != null) {
                W.a.j(!c0137q.f3578r);
                c0137q.f3574n = c0128h;
            }
            C0118H a4 = c0137q.a();
            this.f8403K = a4;
            a4.U();
            u uVar = a4.f3247h;
            C0569k d4 = ((q) uVar).d();
            d4.getClass();
            C0568j c0568j = new C0568j(d4);
            K2.q qVar = new K2.q();
            boolean z4 = !this.f8397D;
            qVar.f1024b = z4;
            qVar.f1025c = z4;
            qVar.f1023a = 1;
            c0568j.f2190m = new W(qVar);
            C0569k c0569k = new C0569k(c0568j);
            a4.U();
            uVar.getClass();
            q qVar2 = (q) uVar;
            if (!c0569k.equals(qVar2.d())) {
                qVar2.i(c0569k);
                C0568j c0568j2 = new C0568j(qVar2.d());
                c0568j2.a(c0569k);
                qVar2.i(new C0569k(c0568j2));
                a4.f3251l.e(19, new C0111A(c0569k));
            }
            C0118H c0118h = this.f8403K;
            c0118h.U();
            int i4 = c0118h.f3228U;
            if (i4 == 0) {
                this.f8404L = null;
            } else {
                this.f8404L = Integer.valueOf(i4);
            }
            D();
            if (this.f8404L != null) {
                for (Map map : this.f8399F) {
                    int intValue = this.f8404L.intValue();
                    String str = (String) map.get("type");
                    str.getClass();
                    if (str.equals("AndroidEqualizer")) {
                        equalizer = new Equalizer(0, intValue);
                    } else {
                        if (!str.equals("AndroidLoudnessEnhancer")) {
                            throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
                        }
                        int round = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 1000.0d);
                        LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(intValue);
                        loudnessEnhancer.setTargetGain(round);
                        equalizer = loudnessEnhancer;
                    }
                    if (((Boolean) map.get("enabled")).booleanValue()) {
                        equalizer.setEnabled(true);
                    }
                    this.f8400G.add(equalizer);
                    this.f8401H.put((String) map.get("type"), equalizer);
                }
            }
            J();
            C0118H c0118h2 = this.f8403K;
            c0118h2.getClass();
            c0118h2.f3251l.a(this);
        }
    }

    public final HashMap L() {
        Equalizer equalizer = (Equalizer) this.f8401H.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s = 0; s < equalizer.getNumberOfBands(); s = (short) (s + 1)) {
            arrayList.add(V("index", Short.valueOf(s), "lowerFrequency", Double.valueOf(equalizer.getBandFreqRange(s)[0] / 1000.0d), "upperFrequency", Double.valueOf(equalizer.getBandFreqRange(s)[1] / 1000.0d), "centerFrequency", Double.valueOf(equalizer.getCenterFreq(s) / 1000.0d), "gain", Double.valueOf(equalizer.getBandLevel(s) / 1000.0d)));
        }
        return V("parameters", V("minDecibels", Double.valueOf(equalizer.getBandLevelRange()[0] / 1000.0d), "maxDecibels", Double.valueOf(equalizer.getBandLevelRange()[1] / 1000.0d), "bands", arrayList));
    }

    public final void M(int i4, double d4) {
        ((Equalizer) this.f8401H.get("AndroidEqualizer")).setBandLevel((short) i4, (short) Math.round(d4 * 1000.0d));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0089. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r23v1, types: [t0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [T.u, T.v] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T.u, T.v] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T.u, T.v] */
    public final AbstractC0469a N(Object obj) {
        AbstractC0469a rVar;
        AbstractC0469a rVar2;
        int i4;
        Map map;
        boolean z4 = true;
        Map map2 = (Map) obj;
        String str = (String) map2.get("id");
        HashMap hashMap = this.f8420x;
        AbstractC0469a abstractC0469a = (AbstractC0469a) hashMap.get(str);
        if (abstractC0469a == null) {
            Map map3 = map2;
            String str2 = (String) map3.get("id");
            String str3 = (String) map3.get("type");
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
                    ArrayList O3 = O(map3.get("children"));
                    AbstractC0469a[] abstractC0469aArr = new AbstractC0469a[O3.size()];
                    O3.toArray(abstractC0469aArr);
                    rVar = new r(((Boolean) map3.get("useLazyPreparation")).booleanValue(), G((List) U(map3, "shuffleOrder")), abstractC0469aArr);
                    abstractC0469a = rVar;
                    hashMap.put(str, abstractC0469a);
                    break;
                case 1:
                    InterfaceC0468E interfaceC0468E = new InterfaceC0468E(z((Map) U(map3, "headers"))) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory

                        /* renamed from: a, reason: collision with root package name */
                        public final Y f4208a;

                        /* renamed from: b, reason: collision with root package name */
                        public final C0307c f4209b;

                        /* renamed from: e, reason: collision with root package name */
                        public final g f4212e;

                        /* renamed from: g, reason: collision with root package name */
                        public final C0560b f4214g;

                        /* renamed from: h, reason: collision with root package name */
                        public final boolean f4215h;

                        /* renamed from: i, reason: collision with root package name */
                        public final int f4216i;

                        /* renamed from: j, reason: collision with root package name */
                        public final long f4217j;

                        /* renamed from: f, reason: collision with root package name */
                        public final K2.o f4213f = new K2.o(27);

                        /* renamed from: c, reason: collision with root package name */
                        public final F1.g f4210c = new Object();

                        /* renamed from: d, reason: collision with root package name */
                        public final d f4211d = c.f5863z;

                        /* JADX WARN: Type inference failed for: r0v2, types: [t0.b, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v2, types: [F1.g, java.lang.Object] */
                        {
                            this.f4208a = new Y(1, r4);
                            C0307c c0307c = g0.j.f5675a;
                            this.f4209b = c0307c;
                            this.f4214g = new Object();
                            this.f4212e = new g(29, false);
                            this.f4216i = 1;
                            this.f4217j = -9223372036854775807L;
                            this.f4215h = true;
                            c0307c.f5647c = true;
                        }

                        @Override // q0.InterfaceC0468E
                        public final void a(g gVar) {
                            this.f4209b.f5646b = gVar;
                        }

                        @Override // q0.InterfaceC0468E
                        public final void b(boolean z5) {
                            this.f4209b.f5647c = z5;
                        }

                        @Override // q0.InterfaceC0468E
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final m c(B b4) {
                            b4.f2067b.getClass();
                            h0.p pVar = this.f4210c;
                            List list = b4.f2067b.f2366c;
                            if (!list.isEmpty()) {
                                pVar = new x(12, pVar, list);
                            }
                            C0307c c0307c = this.f4209b;
                            i n4 = this.f4213f.n(b4);
                            C0560b c0560b = this.f4214g;
                            this.f4211d.getClass();
                            Y y4 = this.f4208a;
                            return new m(b4, y4, c0307c, this.f4212e, n4, c0560b, new c(y4, c0560b, pVar), this.f4217j, this.f4215h, this.f4216i);
                        }
                    };
                    C0098t c0098t = new C0098t();
                    G g4 = I.f5510m;
                    c0 c0Var = c0.f5550p;
                    List emptyList = Collections.emptyList();
                    c0 c0Var2 = c0.f5550p;
                    C0101w c0101w = new C0101w();
                    C0104z c0104z = C0104z.f2370a;
                    Uri parse = Uri.parse((String) map3.get("uri"));
                    rVar = interfaceC0468E.c(new B("", new C0099u(c0098t), parse != null ? new C0103y(parse, "application/x-mpegURL", null, emptyList, c0Var2, null, -9223372036854775807L) : null, new C0102x(c0101w), E.f2095y, c0104z));
                    abstractC0469a = rVar;
                    hashMap.put(str, abstractC0469a);
                    break;
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    InterfaceC0468E interfaceC0468E2 = new InterfaceC0468E(z((Map) U(map3, "headers"))) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory

                        /* renamed from: a, reason: collision with root package name */
                        public final a f4201a;

                        /* renamed from: b, reason: collision with root package name */
                        public final Y.g f4202b;

                        /* renamed from: c, reason: collision with root package name */
                        public final K2.o f4203c;

                        /* renamed from: d, reason: collision with root package name */
                        public final g f4204d;

                        /* renamed from: e, reason: collision with root package name */
                        public final C0560b f4205e;

                        /* renamed from: f, reason: collision with root package name */
                        public final long f4206f;

                        /* renamed from: g, reason: collision with root package name */
                        public final long f4207g;

                        /* JADX WARN: Type inference failed for: r0v0, types: [P2.a, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v2, types: [t0.b, java.lang.Object] */
                        {
                            D d4 = C0502d.f8010u;
                            ?? obj2 = new Object();
                            obj2.f1502n = d4;
                            obj2.f1501m = r4;
                            obj2.f1500l = 1;
                            this.f4201a = obj2;
                            this.f4202b = r4;
                            this.f4203c = new K2.o(27);
                            this.f4205e = new Object();
                            this.f4206f = 30000L;
                            this.f4207g = 5000000L;
                            this.f4204d = new g(29, false);
                            ((D) obj2.f1502n).f115a = true;
                        }

                        @Override // q0.InterfaceC0468E
                        public final void a(g gVar) {
                            D d4 = (D) this.f4201a.f1502n;
                            d4.getClass();
                            d4.f116b = gVar;
                        }

                        @Override // q0.InterfaceC0468E
                        public final void b(boolean z5) {
                            ((D) this.f4201a.f1502n).f115a = z5;
                        }

                        @Override // q0.InterfaceC0468E
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final d0.g c(B b4) {
                            b4.f2067b.getClass();
                            C0253e c0253e = new C0253e();
                            List list = b4.f2067b.f2366c;
                            return new d0.g(b4, this.f4202b, !list.isEmpty() ? new x(20, c0253e, list) : c0253e, this.f4201a, this.f4204d, this.f4203c.n(b4), this.f4205e, this.f4206f, this.f4207g);
                        }
                    };
                    C0098t c0098t2 = new C0098t();
                    G g5 = I.f5510m;
                    c0 c0Var3 = c0.f5550p;
                    List emptyList2 = Collections.emptyList();
                    c0 c0Var4 = c0.f5550p;
                    C0101w c0101w2 = new C0101w();
                    C0104z c0104z2 = C0104z.f2370a;
                    Uri parse2 = Uri.parse((String) map3.get("uri"));
                    rVar = interfaceC0468E2.c(new B("", new C0099u(c0098t2), parse2 != null ? new C0103y(parse2, "application/dash+xml", null, emptyList2, c0Var4, str2, -9223372036854775807L) : null, new C0102x(c0101w2), E.f2095y, c0104z2));
                    abstractC0469a = rVar;
                    hashMap.put(str, abstractC0469a);
                    break;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    Integer num = (Integer) map3.get("count");
                    AbstractC0469a N3 = N(map3.get("child"));
                    int intValue = num.intValue();
                    AbstractC0469a[] abstractC0469aArr2 = new AbstractC0469a[intValue];
                    for (int i5 = 0; i5 < intValue; i5++) {
                        abstractC0469aArr2[i5] = N3;
                    }
                    rVar2 = new r(false, new d0(), abstractC0469aArr2);
                    abstractC0469a = rVar2;
                    hashMap.put(str, abstractC0469a);
                    break;
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    Long R3 = R(map3.get("start"));
                    Long R4 = R(map3.get("end"));
                    abstractC0469a = new C0475g(N(map3.get("child")), R3 != null ? R3.longValue() : 0L, R4 != null ? R4.longValue() : Long.MIN_VALUE, true);
                    hashMap.put(str, abstractC0469a);
                    break;
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                    B1.d z5 = z((Map) U(map3, "headers"));
                    Map map4 = (Map) U(map3, "options");
                    y0.m mVar = new y0.m();
                    if (map4 == null || (map = (Map) map4.get("androidExtractorOptions")) == null) {
                        i4 = 0;
                    } else {
                        z4 = ((Boolean) map.get("constantBitrateSeekingEnabled")).booleanValue();
                        r0 = ((Boolean) map.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
                        i4 = ((Integer) map.get("mp3Flags")).intValue();
                    }
                    synchronized (mVar) {
                        mVar.f9095l = z4;
                    }
                    synchronized (mVar) {
                        mVar.f9096m = r0;
                    }
                    synchronized (mVar) {
                        mVar.f9097n = i4;
                    }
                    B2.x xVar = new B2.x(28, mVar);
                    ?? obj2 = new Object();
                    C0098t c0098t3 = new C0098t();
                    G g6 = I.f5510m;
                    c0 c0Var5 = c0.f5550p;
                    List emptyList3 = Collections.emptyList();
                    c0 c0Var6 = c0.f5550p;
                    C0101w c0101w3 = new C0101w();
                    C0104z c0104z3 = C0104z.f2370a;
                    Uri parse3 = Uri.parse((String) map3.get("uri"));
                    C0103y c0103y = parse3 != null ? new C0103y(parse3, null, null, emptyList3, c0Var6, str2, -9223372036854775807L) : null;
                    B b4 = new B("", new C0099u(c0098t3), c0103y, new C0102x(c0101w3), E.f2095y, c0104z3);
                    c0103y.getClass();
                    b4.f2067b.getClass();
                    b4.f2067b.getClass();
                    rVar2 = new V(b4, z5, xVar, i.f5458a, obj2, 1048576);
                    abstractC0469a = rVar2;
                    hashMap.put(str, abstractC0469a);
                    break;
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    long longValue = R(map3.get("duration")).longValue();
                    W.a.j(longValue > 0);
                    C0097s a4 = g0.f7847v.a();
                    a4.f2347h = str2;
                    rVar = new g0(longValue, a4.a());
                    abstractC0469a = rVar;
                    hashMap.put(str, abstractC0469a);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown AudioSource type: " + map3.get("type"));
            }
        }
        return abstractC0469a;
    }

    public final ArrayList O(Object obj) {
        if (!(obj instanceof List)) {
            throw new RuntimeException("List expected: " + obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            arrayList.add(N(list.get(i4)));
        }
        return arrayList;
    }

    public final long P() {
        long j4 = this.s;
        if (j4 != -9223372036854775807L) {
            return j4;
        }
        int i4 = this.f8409Q;
        if (i4 != 1 && i4 != 2) {
            Long l4 = this.f8416r;
            return (l4 == null || l4.longValue() == -9223372036854775807L) ? this.f8403K.r() : this.f8416r.longValue();
        }
        long r4 = this.f8403K.r();
        if (r4 < 0) {
            return 0L;
        }
        return r4;
    }

    public final long Q() {
        C0118H c0118h;
        int i4 = this.f8409Q;
        if (i4 == 1 || i4 == 2 || (c0118h = this.f8403K) == null) {
            return -9223372036854775807L;
        }
        return c0118h.v();
    }

    public final void S(AbstractC0469a abstractC0469a, long j4, Integer num, k kVar) {
        this.s = j4;
        this.f8417t = num;
        this.f8406N = Integer.valueOf(num != null ? num.intValue() : 0);
        int b4 = j.b(this.f8409Q);
        if (b4 != 0) {
            if (b4 != 1) {
                C0118H c0118h = this.f8403K;
                c0118h.U();
                c0118h.f3262y.d(1, c0118h.w());
                c0118h.P(null);
                c0 c0Var = c0.f5550p;
                long j5 = c0118h.f3242e0.s;
                new V.c(c0Var);
            } else {
                k kVar2 = this.f8418u;
                if (kVar2 != null) {
                    kVar2.a("abort", "Connection aborted", null);
                    this.f8418u = null;
                }
                this.f8411m.b("abort", "Connection aborted", null);
                C0118H c0118h2 = this.f8403K;
                c0118h2.U();
                c0118h2.f3262y.d(1, c0118h2.w());
                c0118h2.P(null);
                c0 c0Var2 = c0.f5550p;
                long j6 = c0118h2.f3242e0.s;
                new V.c(c0Var2);
            }
        }
        this.f8394A = 0;
        this.f8418u = kVar;
        h0();
        this.f8409Q = 2;
        J();
        this.f8405M = abstractC0469a;
        C0118H c0118h3 = this.f8403K;
        c0118h3.U();
        List singletonList = Collections.singletonList(abstractC0469a);
        c0118h3.U();
        c0118h3.I(singletonList);
        this.f8403K.D();
    }

    public final void T(double d4) {
        ((LoudnessEnhancer) this.f8401H.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d4 * 1000.0d));
    }

    public final void W() {
        if (this.f8403K.w()) {
            this.f8403K.J(false);
            h0();
            k kVar = this.f8419v;
            if (kVar != null) {
                kVar.b(new HashMap());
                this.f8419v = null;
            }
        }
    }

    public final void X(k kVar) {
        k kVar2;
        if (this.f8403K.w()) {
            kVar.b(new HashMap());
            return;
        }
        k kVar3 = this.f8419v;
        if (kVar3 != null) {
            kVar3.b(new HashMap());
        }
        this.f8419v = kVar;
        this.f8403K.J(true);
        h0();
        if (this.f8409Q != 5 || (kVar2 = this.f8419v) == null) {
            return;
        }
        kVar2.b(new HashMap());
        this.f8419v = null;
    }

    public final void Y(long j4, Integer num, k kVar) {
        int i4 = this.f8409Q;
        if (i4 == 1 || i4 == 2) {
            kVar.b(new HashMap());
            return;
        }
        k kVar2 = this.w;
        if (kVar2 != null) {
            try {
                kVar2.b(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.w = null;
            this.f8416r = null;
        }
        this.f8416r = Long.valueOf(j4);
        this.w = kVar;
        try {
            this.f8403K.k(num != null ? num.intValue() : this.f8403K.q(), j4, false);
        } catch (RuntimeException e4) {
            this.w = null;
            this.f8416r = null;
            throw e4;
        }
    }

    public final void Z(int i4, int i5, int i6) {
        C0084e c0084e = new C0084e(i4, i5, i6);
        if (this.f8409Q == 2) {
            this.f8395B = c0084e;
        } else {
            this.f8403K.H(c0084e, false);
        }
    }

    public final void a(String str, boolean z4) {
        ((AudioEffect) this.f8401H.get(str)).setEnabled(z4);
    }

    public final void a0(int i4) {
        this.f8403K.L(i4);
    }

    public final void b0(float f4) {
        C0118H c0118h = this.f8403K;
        c0118h.U();
        K k4 = c0118h.f3242e0.f3473o;
        if (k4.f2128b == f4) {
            return;
        }
        this.f8403K.K(new K(k4.f2127a, f4));
        J();
    }

    public final void c0(boolean z4) {
        C0118H c0118h = this.f8403K;
        c0118h.U();
        if (c0118h.f3212D != z4) {
            c0118h.f3212D = z4;
            v vVar = c0118h.f3250k.s;
            vVar.getClass();
            W.u b4 = v.b();
            b4.f2701a = vVar.f2703a.obtainMessage(12, z4 ? 1 : 0, 0);
            b4.b();
            C0141v c0141v = new C0141v(1, z4);
            W.k kVar = c0118h.f3251l;
            kVar.c(9, c0141v);
            c0118h.Q();
            kVar.b();
        }
    }

    public final void d0(Object obj) {
        Map map = (Map) obj;
        AbstractC0469a abstractC0469a = (AbstractC0469a) this.f8420x.get((String) U(map, "id"));
        if (abstractC0469a == null) {
            return;
        }
        String str = (String) U(map, "type");
        str.getClass();
        if (!str.equals("concatenating")) {
            if (str.equals("looping")) {
                d0(U(map, "child"));
            }
        } else {
            ((r) abstractC0469a).M(G((List) U(map, "shuffleOrder")));
            Iterator it = ((List) U(map, "children")).iterator();
            while (it.hasNext()) {
                d0(it.next());
            }
        }
    }

    @Override // T.M
    public final void e(int i4, N n4, N n5) {
        h0();
        if (i4 == 0 || i4 == 1) {
            Integer valueOf = Integer.valueOf(this.f8403K.q());
            if (!valueOf.equals(this.f8406N)) {
                this.f8406N = valueOf;
            }
        }
        g();
    }

    public final void e0(boolean z4) {
        C0118H c0118h = this.f8403K;
        c0118h.U();
        if (c0118h.f3231X == z4) {
            return;
        }
        c0118h.f3231X = z4;
        c0118h.G(1, 9, Boolean.valueOf(z4));
        c0118h.f3251l.e(23, new C0141v(0, z4));
    }

    @Override // T.M
    public final void f(int i4) {
        if (i4 == 2) {
            if (P() != this.f8413o) {
                this.f8413o = P();
                this.f8414p = System.currentTimeMillis();
            }
            int i5 = this.f8409Q;
            if (i5 != 3 && i5 != 2) {
                this.f8409Q = 3;
                g();
            }
            Handler handler = this.f8407O;
            F.b bVar = this.f8408P;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
            return;
        }
        if (i4 != 3) {
            if (i4 != 4) {
                return;
            }
            if (this.f8409Q != 5) {
                h0();
                this.f8409Q = 5;
                g();
            }
            if (this.f8418u != null) {
                this.f8418u.b(new HashMap());
                this.f8418u = null;
                C0084e c0084e = this.f8395B;
                if (c0084e != null) {
                    this.f8403K.H(c0084e, false);
                    this.f8395B = null;
                }
            }
            k kVar = this.f8419v;
            if (kVar != null) {
                kVar.b(new HashMap());
                this.f8419v = null;
                return;
            }
            return;
        }
        if (this.f8403K.w()) {
            h0();
        }
        this.f8409Q = 4;
        g();
        if (this.f8418u != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Q() == -9223372036854775807L ? null : Long.valueOf(Q() * 1000));
            this.f8418u.b(hashMap);
            this.f8418u = null;
            C0084e c0084e2 = this.f8395B;
            if (c0084e2 != null) {
                this.f8403K.H(c0084e2, false);
                this.f8395B = null;
            }
        }
        k kVar2 = this.w;
        if (kVar2 != null) {
            this.f8416r = null;
            kVar2.b(new HashMap());
            this.w = null;
        }
    }

    public final void f0(float f4) {
        C0118H c0118h = this.f8403K;
        c0118h.U();
        K k4 = c0118h.f3242e0.f3473o;
        if (k4.f2127a == f4) {
            return;
        }
        this.f8403K.K(new K(f4, k4.f2128b));
        if (this.f8403K.w()) {
            h0();
        }
        J();
    }

    public final void g() {
        J();
        x();
    }

    public final void g0(float f4) {
        this.f8403K.O(f4);
    }

    @Override // T.M
    public final void h(int i4) {
        int e4;
        int e5;
        if (this.s != -9223372036854775807L || this.f8417t != null) {
            Integer num = this.f8417t;
            this.f8403K.k(num != null ? num.intValue() : 0, this.s, false);
            this.f8417t = null;
            this.s = -9223372036854775807L;
        }
        Integer valueOf = Integer.valueOf(this.f8403K.q());
        if (!valueOf.equals(this.f8406N)) {
            this.f8406N = valueOf;
            g();
        }
        if (this.f8403K.x() == 4) {
            try {
                if (this.f8403K.w()) {
                    if (this.f8402I == 0) {
                        C0118H c0118h = this.f8403K;
                        c0118h.getClass();
                        if (c0118h.t().o() > 0) {
                            this.f8403K.k(0, 0L, false);
                        }
                    }
                    C0118H c0118h2 = this.f8403K;
                    c0118h2.getClass();
                    U t4 = c0118h2.t();
                    if (t4.p()) {
                        e4 = -1;
                    } else {
                        int q4 = c0118h2.q();
                        c0118h2.U();
                        int i5 = c0118h2.f3211C;
                        if (i5 == 1) {
                            i5 = 0;
                        }
                        c0118h2.U();
                        e4 = t4.e(q4, i5, c0118h2.f3212D);
                    }
                    if (e4 != -1) {
                        C0118H c0118h3 = this.f8403K;
                        c0118h3.getClass();
                        U t5 = c0118h3.t();
                        if (t5.p()) {
                            e5 = -1;
                        } else {
                            int q5 = c0118h3.q();
                            c0118h3.U();
                            int i6 = c0118h3.f3211C;
                            if (i6 == 1) {
                                i6 = 0;
                            }
                            c0118h3.U();
                            e5 = t5.e(q5, i6, c0118h3.f3212D);
                        }
                        if (e5 == -1) {
                            c0118h3.U();
                        } else if (e5 == c0118h3.q()) {
                            c0118h3.k(c0118h3.q(), -9223372036854775807L, true);
                        } else {
                            c0118h3.k(e5, -9223372036854775807L, false);
                        }
                    }
                } else {
                    int q6 = this.f8403K.q();
                    C0118H c0118h4 = this.f8403K;
                    c0118h4.getClass();
                    if (q6 < c0118h4.t().o()) {
                        C0118H c0118h5 = this.f8403K;
                        c0118h5.k(c0118h5.q(), 0L, false);
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        C0118H c0118h6 = this.f8403K;
        c0118h6.getClass();
        this.f8402I = c0118h6.t().o();
    }

    public final void h0() {
        this.f8413o = P();
        this.f8414p = System.currentTimeMillis();
    }

    @Override // T.M
    public final void n(a0 a0Var) {
        for (int i4 = 0; i4 < a0Var.a().size(); i4++) {
            T.V v4 = ((Z) a0Var.a().get(i4)).f2213b;
            for (int i5 = 0; i5 < v4.f2169a; i5++) {
                T.G g4 = v4.a(i5).f2323k;
                if (g4 != null) {
                    for (int i6 = 0; i6 < g4.g(); i6++) {
                        F f4 = g4.f(i6);
                        if (f4 instanceof L0.b) {
                            this.f8422z = (L0.b) f4;
                            g();
                        }
                    }
                }
            }
        }
    }

    @Override // T.M
    public final void t(J j4) {
        int e4;
        Integer num;
        int intValue;
        boolean z4 = j4 instanceof C0133m;
        C0571b c0571b = this.f8411m;
        if (z4) {
            C0133m c0133m = (C0133m) j4;
            int i4 = c0133m.f3542n;
            if (i4 == 0) {
                StringBuilder sb = new StringBuilder("TYPE_SOURCE: ");
                W.a.j(i4 == 0);
                Throwable cause = c0133m.getCause();
                cause.getClass();
                sb.append(((IOException) cause).getMessage());
                Log.e("AudioPlayer", sb.toString());
            } else if (i4 != 1) {
                int i5 = c0133m.f3542n;
                if (i4 != 2) {
                    StringBuilder sb2 = new StringBuilder("default ExoPlaybackException: ");
                    W.a.j(i5 == 2);
                    Throwable cause2 = c0133m.getCause();
                    cause2.getClass();
                    sb2.append(((RuntimeException) cause2).getMessage());
                    Log.e("AudioPlayer", sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("TYPE_UNEXPECTED: ");
                    W.a.j(i5 == 2);
                    Throwable cause3 = c0133m.getCause();
                    cause3.getClass();
                    sb3.append(((RuntimeException) cause3).getMessage());
                    Log.e("AudioPlayer", sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder("TYPE_RENDERER: ");
                W.a.j(i4 == 1);
                Throwable cause4 = c0133m.getCause();
                cause4.getClass();
                sb4.append(((Exception) cause4).getMessage());
                Log.e("AudioPlayer", sb4.toString());
            }
            String valueOf = String.valueOf(i4);
            String message = c0133m.getMessage();
            HashMap V3 = V("index", this.f8406N);
            k kVar = this.f8418u;
            if (kVar != null) {
                kVar.a(valueOf, message, V3);
                this.f8418u = null;
            }
            c0571b.b(valueOf, message, V3);
        } else {
            Log.e("AudioPlayer", "default PlaybackException: " + j4.getMessage());
            String valueOf2 = String.valueOf(j4.f2124l);
            String message2 = j4.getMessage();
            HashMap V4 = V("index", this.f8406N);
            k kVar2 = this.f8418u;
            if (kVar2 != null) {
                kVar2.a(valueOf2, message2, V4);
                this.f8418u = null;
            }
            c0571b.b(valueOf2, message2, V4);
        }
        this.f8394A++;
        C0118H c0118h = this.f8403K;
        c0118h.getClass();
        U t4 = c0118h.t();
        if (t4.p()) {
            e4 = -1;
        } else {
            int q4 = c0118h.q();
            c0118h.U();
            int i6 = c0118h.f3211C;
            if (i6 == 1) {
                i6 = 0;
            }
            c0118h.U();
            e4 = t4.e(q4, i6, c0118h.f3212D);
        }
        if (!(e4 != -1) || (num = this.f8406N) == null || this.f8394A > 5 || (intValue = num.intValue() + 1) >= this.f8403K.t().o()) {
            return;
        }
        C0118H c0118h2 = this.f8403K;
        AbstractC0469a abstractC0469a = this.f8405M;
        c0118h2.U();
        List singletonList = Collections.singletonList(abstractC0469a);
        c0118h2.U();
        c0118h2.I(singletonList);
        this.f8403K.D();
        this.f8403K.k(intValue, 0L, false);
    }

    @Override // T.M
    public final void v(T.G g4) {
        int i4 = 0;
        while (true) {
            F[] fArr = g4.f2118l;
            if (i4 >= fArr.length) {
                return;
            }
            F f4 = fArr[i4];
            if (f4 instanceof L0.c) {
                this.f8421y = (L0.c) f4;
                g();
            }
            i4++;
        }
    }

    public final void x() {
        HashMap hashMap = this.J;
        if (hashMap != null) {
            h hVar = this.f8411m.f8423a;
            if (hVar != null) {
                hVar.c(hashMap);
            }
            this.J = null;
        }
    }

    public final B1.d z(Map map) {
        HashMap hashMap;
        String str;
        String str2 = null;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (Object obj : map.keySet()) {
                hashMap.put((String) obj, (String) map.get(obj));
            }
        }
        if (hashMap != null && (str2 = (String) hashMap.remove("User-Agent")) == null) {
            str2 = (String) hashMap.remove("user-agent");
        }
        Context context = this.f8410l;
        if (str2 == null) {
            int i4 = y.f2709a;
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "?";
            }
            StringBuilder sb = new StringBuilder("just_audio/");
            sb.append(str);
            sb.append(" (Linux;Android ");
            str2 = AbstractC0007h.m(sb, Build.VERSION.RELEASE, ") AndroidXMedia3/1.4.1");
        }
        T0.e eVar = new T0.e(1);
        eVar.f2391p = str2;
        eVar.f2389n = true;
        if (hashMap != null && hashMap.size() > 0) {
            eVar.d(hashMap);
        }
        return new B1.d(context, eVar);
    }
}
