package H2;

import C2.c;
import I.C0044m;
import K2.k;
import L.j;
import L2.f;
import L2.n;
import L2.o;
import V0.d;
import W.y;
import X2.p;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import b1.C0178a;
import b1.C0180c;
import b1.C0183f;
import com.ryanheise.audioservice.AudioService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executors;
import s2.C0553j;
import s2.l;
import s2.m;

/* loaded from: classes.dex */
public final class a implements d, o {

    /* renamed from: l, reason: collision with root package name */
    public Object f708l;

    /* renamed from: m, reason: collision with root package name */
    public Object f709m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f710n;

    /* renamed from: o, reason: collision with root package name */
    public Object f711o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f712p;

    public a(C0180c c0180c, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f708l = c0180c;
        this.f710n = hashMap2;
        this.f712p = hashMap3;
        this.f709m = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i4 = 0;
        c0180c.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i4] = ((Long) it.next()).longValue();
            i4++;
        }
        this.f711o = jArr;
    }

    @Override // V0.d
    public long B(int i4) {
        return ((long[]) this.f711o)[i4];
    }

    @Override // L2.o
    public void I(n nVar, final k kVar) {
        char c4;
        int[] iArr;
        try {
            final Map map = (Map) nVar.f1095b;
            String str = nVar.f1094a;
            switch (str.hashCode()) {
                case -615448875:
                    if (str.equals("setMediaItem")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -3300612:
                    if (str.equals("androidForceEnableMediaButtons")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 534585782:
                    if (str.equals("setAndroidPlaybackInfo")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 699379795:
                    if (str.equals("stopService")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1402657231:
                    if (str.equals("setQueue")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1404470607:
                    if (str.equals("setState")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1742026028:
                    if (str.equals("notifyChildrenChanged")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    final int i4 = 0;
                    Executors.newSingleThreadExecutor().execute(new Runnable(this) { // from class: s2.g

                        /* renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ H2.a f8239m;

                        {
                            this.f8239m = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    Map map2 = map;
                                    K2.k kVar2 = kVar;
                                    Handler handler = (Handler) this.f8239m.f710n;
                                    try {
                                        AudioService.J.k(k.m((Map) map2.get("mediaItem")));
                                        handler.post(new p(kVar2, 3));
                                        return;
                                    } catch (Exception e4) {
                                        handler.post(new X2.l(kVar2, e4, 4));
                                        return;
                                    }
                                default:
                                    H2.a aVar = this.f8239m;
                                    Map map3 = map;
                                    K2.k kVar3 = kVar;
                                    aVar.getClass();
                                    try {
                                        ArrayList c5 = k.c((List) map3.get("queue"));
                                        AudioService audioService = AudioService.J;
                                        synchronized (audioService) {
                                            AudioService.f4784M = c5;
                                            audioService.f4797v.A0(c5);
                                        }
                                        ((Handler) aVar.f710n).post(new p(kVar3, 2));
                                        return;
                                    } catch (Exception e5) {
                                        ((Handler) aVar.f710n).post(new X2.l(kVar3, e5, 3));
                                        return;
                                    }
                            }
                        }
                    });
                    return;
                case 1:
                    final int i5 = 1;
                    Executors.newSingleThreadExecutor().execute(new Runnable(this) { // from class: s2.g

                        /* renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ H2.a f8239m;

                        {
                            this.f8239m = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    Map map2 = map;
                                    K2.k kVar2 = kVar;
                                    Handler handler = (Handler) this.f8239m.f710n;
                                    try {
                                        AudioService.J.k(k.m((Map) map2.get("mediaItem")));
                                        handler.post(new p(kVar2, 3));
                                        return;
                                    } catch (Exception e4) {
                                        handler.post(new X2.l(kVar2, e4, 4));
                                        return;
                                    }
                                default:
                                    H2.a aVar = this.f8239m;
                                    Map map3 = map;
                                    K2.k kVar3 = kVar;
                                    aVar.getClass();
                                    try {
                                        ArrayList c5 = k.c((List) map3.get("queue"));
                                        AudioService audioService = AudioService.J;
                                        synchronized (audioService) {
                                            AudioService.f4784M = c5;
                                            audioService.f4797v.A0(c5);
                                        }
                                        ((Handler) aVar.f710n).post(new p(kVar3, 2));
                                        return;
                                    } catch (Exception e5) {
                                        ((Handler) aVar.f710n).post(new X2.l(kVar3, e5, 3));
                                        return;
                                    }
                            }
                        }
                    });
                    return;
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    Map map2 = (Map) map.get("state");
                    int i6 = j.c(6)[((Integer) map2.get("processingState")).intValue()];
                    boolean booleanValue = ((Boolean) map2.get("playing")).booleanValue();
                    List<Map> list = (List) map2.get("controls");
                    List list2 = (List) map2.get("androidCompactActionIndices");
                    List list3 = (List) map2.get("systemActions");
                    long longValue = s2.k.p(map2.get("updatePosition")).longValue();
                    long longValue2 = s2.k.p(map2.get("bufferedPosition")).longValue();
                    float doubleValue = (float) ((Double) map2.get("speed")).doubleValue();
                    long currentTimeMillis = map2.get("updateTime") == null ? System.currentTimeMillis() : s2.k.p(map2.get("updateTime")).longValue();
                    Integer num = (Integer) map2.get("errorCode");
                    String str2 = (String) map2.get("errorMessage");
                    int intValue = ((Integer) map2.get("repeatMode")).intValue();
                    int intValue2 = ((Integer) map2.get("shuffleMode")).intValue();
                    Long p2 = s2.k.p(map2.get("queueIndex"));
                    boolean booleanValue2 = ((Boolean) map2.get("captioningEnabled")).booleanValue();
                    long j4 = currentTimeMillis - s2.k.f8254u;
                    ArrayList arrayList = new ArrayList();
                    long j5 = 0;
                    for (Map map3 : list) {
                        String str3 = (String) map3.get("androidIcon");
                        String str4 = (String) map3.get("label");
                        long intValue3 = 1 << ((Integer) map3.get("action")).intValue();
                        j5 |= intValue3;
                        Map map4 = (Map) map3.get("customAction");
                        arrayList.add(new m(str3, str4, intValue3, map4 != null ? new l((String) map4.get("name"), (Map) map4.get("extras")) : null));
                    }
                    while (list3.iterator().hasNext()) {
                        j5 |= 1 << ((Integer) r0.next()).intValue();
                    }
                    if (list2 != null) {
                        int min = Math.min(3, list2.size());
                        iArr = new int[min];
                        for (int i7 = 0; i7 < min; i7++) {
                            iArr[i7] = ((Integer) list2.get(i7)).intValue();
                        }
                    } else {
                        iArr = null;
                    }
                    AudioService.J.m(arrayList, j5, iArr, i6, booleanValue, longValue, longValue2, doubleValue, j4, num, str2, intValue, intValue2, booleanValue2, p2);
                    kVar.b(null);
                    return;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    Map map5 = (Map) map.get("playbackInfo");
                    AudioService.J.l(((Integer) map5.get("playbackType")).intValue(), (Integer) map5.get("volumeControlType"), (Integer) map5.get("maxVolume"), (Integer) map5.get("volume"));
                    kVar.b(null);
                    return;
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    AudioService.J.a((String) map.get("parentMediaId"), s2.k.r((Map) map.get("options")));
                    kVar.b(null);
                    return;
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                    if (((AudioTrack) this.f711o) == null) {
                        AudioTrack audioTrack = new AudioTrack(3, 44100, 2, 3, 2048, 0);
                        this.f711o = audioTrack;
                        audioTrack.write(new byte[2048], 0, 2048);
                    }
                    ((AudioTrack) this.f711o).reloadStaticData();
                    ((AudioTrack) this.f711o).play();
                    kVar.b(null);
                    return;
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    AudioService audioService = AudioService.J;
                    if (audioService != null) {
                        if (audioService.f4797v.o0()) {
                            audioService.f4797v.x0(false);
                        }
                        ((NotificationManager) audioService.getSystemService("notification")).cancel(1124);
                        audioService.stopSelf();
                    }
                    kVar.b(null);
                    return;
                default:
                    return;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            kVar.a(e4.getMessage(), null, null);
        }
    }

    @Override // V0.d
    public int Q() {
        return ((long[]) this.f711o).length;
    }

    public void a(String str, HashMap hashMap, L2.p pVar) {
        if (s2.k.w) {
            ((C0044m) this.f708l).j(str, hashMap, pVar);
        } else {
            ((LinkedList) this.f712p).add(new C0553j(str, hashMap, pVar));
        }
    }

    @Override // V0.d
    public int g(long j4) {
        long[] jArr = (long[]) this.f711o;
        int b4 = y.b(jArr, j4, false);
        if (b4 < jArr.length) {
            return b4;
        }
        return -1;
    }

    @Override // V0.d
    public List w(long j4) {
        C0180c c0180c = (C0180c) this.f708l;
        ArrayList arrayList = new ArrayList();
        c0180c.g(j4, c0180c.f4410h, arrayList);
        TreeMap treeMap = new TreeMap();
        c0180c.i(j4, false, c0180c.f4410h, treeMap);
        HashMap hashMap = (HashMap) this.f710n;
        c0180c.h(j4, (Map) this.f709m, hashMap, c0180c.f4410h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((HashMap) this.f712p).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C0183f c0183f = (C0183f) hashMap.get(pair.first);
                c0183f.getClass();
                arrayList2.add(new V.b(null, null, null, decodeByteArray, c0183f.f4429c, 0, c0183f.f4431e, c0183f.f4428b, 0, Integer.MIN_VALUE, -3.4028235E38f, c0183f.f4432f, c0183f.f4433g, false, -16777216, c0183f.f4436j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C0183f c0183f2 = (C0183f) hashMap.get(entry.getKey());
            c0183f2.getClass();
            V.a aVar = (V.a) entry.getValue();
            CharSequence charSequence = aVar.f2529a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C0178a c0178a : (C0178a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C0178a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c0178a), spannableStringBuilder.getSpanEnd(c0178a), (CharSequence) "");
            }
            for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                if (spannableStringBuilder.charAt(i4) == ' ') {
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                        i6++;
                    }
                    int i7 = i6 - i5;
                    if (i7 > 0) {
                        spannableStringBuilder.delete(i4, i7 + i4);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == ' ') {
                        spannableStringBuilder.delete(i9, i8 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length() - 1; i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    if (spannableStringBuilder.charAt(i11) == '\n') {
                        spannableStringBuilder.delete(i10, i11);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.f2533e = c0183f2.f4429c;
            aVar.f2534f = c0183f2.f4430d;
            aVar.f2535g = c0183f2.f4431e;
            aVar.f2536h = c0183f2.f4428b;
            aVar.f2540l = c0183f2.f4432f;
            aVar.f2539k = c0183f2.f4435i;
            aVar.f2538j = c0183f2.f4434h;
            aVar.f2544p = c0183f2.f4436j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public a(Context context, c cVar, f fVar, io.flutter.embedding.engine.renderer.j jVar, io.flutter.plugin.platform.m mVar) {
        this.f708l = context;
        this.f711o = cVar;
        this.f709m = fVar;
        this.f710n = jVar;
        this.f712p = mVar;
    }

    public a(Context context, f fVar, T2.o oVar, T2.o oVar2, io.flutter.embedding.engine.renderer.j jVar) {
        this.f708l = context;
        this.f709m = fVar;
        this.f711o = oVar;
        this.f712p = oVar2;
        this.f710n = jVar;
    }

    public a(f fVar) {
        this.f710n = new Handler(Looper.getMainLooper());
        this.f712p = new LinkedList();
        this.f709m = fVar;
        C0044m c0044m = new C0044m(fVar, "com.ryanheise.audio_service.handler.methods");
        this.f708l = c0044m;
        c0044m.s(this);
    }
}
