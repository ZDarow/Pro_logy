package p034H2;

/* renamed from: H2.a */
/* loaded from: classes.dex */
public final class C0247a implements p083V0.InterfaceC0766d, p047L2.InterfaceC0385o {

    /* renamed from: l */
    public java.lang.Object f719l;

    /* renamed from: m */
    public java.lang.Object f720m;

    /* renamed from: n */
    public final java.lang.Object f721n;

    /* renamed from: o */
    public java.lang.Object f722o;

    /* renamed from: p */
    public final java.lang.Object f723p;

    public C0247a(p108b1.C1180c c1180c, java.util.HashMap hashMap, java.util.HashMap hashMap2, java.util.HashMap hashMap3) {
        this.f719l = c1180c;
        this.f721n = hashMap2;
        this.f723p = hashMap3;
        this.f720m = java.util.Collections.unmodifiableMap(hashMap);
        java.util.TreeSet treeSet = new java.util.TreeSet();
        int i4 = 0;
        c1180c.m2819d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i4] = ((java.lang.Long) it.next()).longValue();
            i4++;
        }
        this.f722o = jArr;
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: B */
    public long mo654B(int i4) {
        return ((long[]) this.f722o)[i4];
    }

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public void mo42I(p047L2.C0384n c0384n, final p043K2.C0335k c0335k) {
        char c4;
        int[] iArr;
        try {
            final java.util.Map map = (java.util.Map) c0384n.f1134b;
            java.lang.String str = c0384n.f1133a;
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
                    java.util.concurrent.Executors.newSingleThreadExecutor().execute(new java.lang.Runnable(this) { // from class: s2.g

                        /* renamed from: m */
                        public final /* synthetic */ p034H2.C0247a f8558m;

                        {
                            this.f8558m = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    java.util.Map map2 = map;
                                    p043K2.C0335k c0335k2 = c0335k;
                                    android.os.Handler handler = (android.os.Handler) this.f8558m.f721n;
                                    try {
                                        com.ryanheise.audioservice.AudioService.f4959J.m2944k(p190s2.C2151k.m4271m((java.util.Map) map2.get("mediaItem")));
                                        handler.post(new p093X2.RunnableC0855p(c0335k2, 3));
                                        return;
                                    } catch (java.lang.Exception e4) {
                                        handler.post(new p093X2.RunnableC0851l(c0335k2, e4, 4));
                                        return;
                                    }
                                default:
                                    p034H2.C0247a c0247a = this.f8558m;
                                    java.util.Map map3 = map;
                                    p043K2.C0335k c0335k3 = c0335k;
                                    c0247a.getClass();
                                    try {
                                        java.util.ArrayList m4267c = p190s2.C2151k.m4267c((java.util.List) map3.get("queue"));
                                        com.ryanheise.audioservice.AudioService audioService = com.ryanheise.audioservice.AudioService.f4959J;
                                        synchronized (audioService) {
                                            com.ryanheise.audioservice.AudioService.f4962M = m4267c;
                                            audioService.f4975v.m2205A0(m4267c);
                                        }
                                        ((android.os.Handler) c0247a.f721n).post(new p093X2.RunnableC0855p(c0335k3, 2));
                                        return;
                                    } catch (java.lang.Exception e5) {
                                        ((android.os.Handler) c0247a.f721n).post(new p093X2.RunnableC0851l(c0335k3, e5, 3));
                                        return;
                                    }
                            }
                        }
                    });
                    return;
                case 1:
                    final int i5 = 1;
                    java.util.concurrent.Executors.newSingleThreadExecutor().execute(new java.lang.Runnable(this) { // from class: s2.g

                        /* renamed from: m */
                        public final /* synthetic */ p034H2.C0247a f8558m;

                        {
                            this.f8558m = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    java.util.Map map2 = map;
                                    p043K2.C0335k c0335k2 = c0335k;
                                    android.os.Handler handler = (android.os.Handler) this.f8558m.f721n;
                                    try {
                                        com.ryanheise.audioservice.AudioService.f4959J.m2944k(p190s2.C2151k.m4271m((java.util.Map) map2.get("mediaItem")));
                                        handler.post(new p093X2.RunnableC0855p(c0335k2, 3));
                                        return;
                                    } catch (java.lang.Exception e4) {
                                        handler.post(new p093X2.RunnableC0851l(c0335k2, e4, 4));
                                        return;
                                    }
                                default:
                                    p034H2.C0247a c0247a = this.f8558m;
                                    java.util.Map map3 = map;
                                    p043K2.C0335k c0335k3 = c0335k;
                                    c0247a.getClass();
                                    try {
                                        java.util.ArrayList m4267c = p190s2.C2151k.m4267c((java.util.List) map3.get("queue"));
                                        com.ryanheise.audioservice.AudioService audioService = com.ryanheise.audioservice.AudioService.f4959J;
                                        synchronized (audioService) {
                                            com.ryanheise.audioservice.AudioService.f4962M = m4267c;
                                            audioService.f4975v.m2205A0(m4267c);
                                        }
                                        ((android.os.Handler) c0247a.f721n).post(new p093X2.RunnableC0855p(c0335k3, 2));
                                        return;
                                    } catch (java.lang.Exception e5) {
                                        ((android.os.Handler) c0247a.f721n).post(new p093X2.RunnableC0851l(c0335k3, e5, 3));
                                        return;
                                    }
                            }
                        }
                    });
                    return;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    java.util.Map map2 = (java.util.Map) map.get("state");
                    int i6 = p044L.AbstractC0352j.m782c(6)[((java.lang.Integer) map2.get("processingState")).intValue()];
                    boolean booleanValue = ((java.lang.Boolean) map2.get("playing")).booleanValue();
                    java.util.List<java.util.Map> list = (java.util.List) map2.get("controls");
                    java.util.List list2 = (java.util.List) map2.get("androidCompactActionIndices");
                    java.util.List list3 = (java.util.List) map2.get("systemActions");
                    long longValue = p190s2.C2151k.m4274p(map2.get("updatePosition")).longValue();
                    long longValue2 = p190s2.C2151k.m4274p(map2.get("bufferedPosition")).longValue();
                    float doubleValue = (float) ((java.lang.Double) map2.get("speed")).doubleValue();
                    long currentTimeMillis = map2.get("updateTime") == null ? java.lang.System.currentTimeMillis() : p190s2.C2151k.m4274p(map2.get("updateTime")).longValue();
                    java.lang.Integer num = (java.lang.Integer) map2.get("errorCode");
                    java.lang.String str2 = (java.lang.String) map2.get("errorMessage");
                    int intValue = ((java.lang.Integer) map2.get("repeatMode")).intValue();
                    int intValue2 = ((java.lang.Integer) map2.get("shuffleMode")).intValue();
                    java.lang.Long m4274p = p190s2.C2151k.m4274p(map2.get("queueIndex"));
                    boolean booleanValue2 = ((java.lang.Boolean) map2.get("captioningEnabled")).booleanValue();
                    long j4 = currentTimeMillis - p190s2.C2151k.f8574u;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    long j5 = 0;
                    for (java.util.Map map3 : list) {
                        java.lang.String str3 = (java.lang.String) map3.get("androidIcon");
                        java.lang.String str4 = (java.lang.String) map3.get("label");
                        long intValue3 = 1 << ((java.lang.Integer) map3.get("action")).intValue();
                        j5 |= intValue3;
                        java.util.Map map4 = (java.util.Map) map3.get("customAction");
                        arrayList.add(new p190s2.C2153m(str3, str4, intValue3, map4 != null ? new p190s2.C2152l((java.lang.String) map4.get("name"), (java.util.Map) map4.get("extras")) : null));
                    }
                    while (list3.iterator().hasNext()) {
                        j5 |= 1 << ((java.lang.Integer) r0.next()).intValue();
                    }
                    if (list2 != null) {
                        int min = java.lang.Math.min(3, list2.size());
                        iArr = new int[min];
                        for (int i7 = 0; i7 < min; i7++) {
                            iArr[i7] = ((java.lang.Integer) list2.get(i7)).intValue();
                        }
                    } else {
                        iArr = null;
                    }
                    com.ryanheise.audioservice.AudioService.f4959J.m2946m(arrayList, j5, iArr, i6, booleanValue, longValue, longValue2, doubleValue, j4, num, str2, intValue, intValue2, booleanValue2, m4274p);
                    c0335k.mo742b(null);
                    return;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    java.util.Map map5 = (java.util.Map) map.get("playbackInfo");
                    com.ryanheise.audioservice.AudioService.f4959J.m2945l(((java.lang.Integer) map5.get("playbackType")).intValue(), (java.lang.Integer) map5.get("volumeControlType"), (java.lang.Integer) map5.get("maxVolume"), (java.lang.Integer) map5.get("volume"));
                    c0335k.mo742b(null);
                    return;
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    com.ryanheise.audioservice.AudioService.f4959J.m1056a((java.lang.String) map.get("parentMediaId"), p190s2.C2151k.m4276r((java.util.Map) map.get("options")));
                    c0335k.mo742b(null);
                    return;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    if (((android.media.AudioTrack) this.f722o) == null) {
                        android.media.AudioTrack audioTrack = new android.media.AudioTrack(3, 44100, 2, 3, 2048, 0);
                        this.f722o = audioTrack;
                        audioTrack.write(new byte[2048], 0, 2048);
                    }
                    ((android.media.AudioTrack) this.f722o).reloadStaticData();
                    ((android.media.AudioTrack) this.f722o).play();
                    c0335k.mo742b(null);
                    return;
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    com.ryanheise.audioservice.AudioService audioService = com.ryanheise.audioservice.AudioService.f4959J;
                    if (audioService != null) {
                        if (audioService.f4975v.m2236o0()) {
                            audioService.f4975v.m2246x0(false);
                        }
                        ((android.app.NotificationManager) audioService.getSystemService("notification")).cancel(1124);
                        audioService.stopSelf();
                    }
                    c0335k.mo742b(null);
                    return;
                default:
                    return;
            }
        } catch (java.lang.Exception e4) {
            e4.printStackTrace();
            c0335k.mo741a(e4.getMessage(), null, null);
        }
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: Q */
    public int mo655Q() {
        return ((long[]) this.f722o).length;
    }

    /* renamed from: a */
    public void m656a(java.lang.String str, java.util.HashMap hashMap, p047L2.InterfaceC0386p interfaceC0386p) {
        if (p190s2.C2151k.f8576w) {
            ((p035I.C0291m) this.f719l).m694j(str, hashMap, interfaceC0386p);
        } else {
            ((java.util.LinkedList) this.f723p).add(new p190s2.C2150j(str, hashMap, interfaceC0386p));
        }
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: g */
    public int mo657g(long j4) {
        long[] jArr = (long[]) this.f722o;
        int m1607b = p086W.AbstractC0805y.m1607b(jArr, j4, false);
        if (m1607b < jArr.length) {
            return m1607b;
        }
        return -1;
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: w */
    public java.util.List mo658w(long j4) {
        p108b1.C1180c c1180c = (p108b1.C1180c) this.f719l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        c1180c.m2821g(j4, c1180c.f4569h, arrayList);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        c1180c.m2823i(j4, false, c1180c.f4569h, treeMap);
        java.util.HashMap hashMap = (java.util.HashMap) this.f721n;
        c1180c.m2822h(j4, (java.util.Map) this.f720m, hashMap, c1180c.f4569h, treeMap);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            java.lang.String str = (java.lang.String) ((java.util.HashMap) this.f723p).get(pair.second);
            if (str != null) {
                byte[] decode = android.util.Base64.decode(str, 0);
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length);
                p108b1.C1183f c1183f = (p108b1.C1183f) hashMap.get(pair.first);
                c1183f.getClass();
                arrayList2.add(new p082V.C0757b(null, null, null, decodeByteArray, c1183f.f4589c, 0, c1183f.f4591e, c1183f.f4588b, 0, Integer.MIN_VALUE, -3.4028235E38f, c1183f.f4592f, c1183f.f4593g, false, -16777216, c1183f.f4596j, 0.0f));
            }
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            p108b1.C1183f c1183f2 = (p108b1.C1183f) hashMap.get(entry.getKey());
            c1183f2.getClass();
            p082V.C0756a c0756a = (p082V.C0756a) entry.getValue();
            java.lang.CharSequence charSequence = c0756a.f2617a;
            charSequence.getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence;
            for (p108b1.C1178a c1178a : (p108b1.C1178a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p108b1.C1178a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1178a), spannableStringBuilder.getSpanEnd(c1178a), (java.lang.CharSequence) "");
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
            c0756a.f2621e = c1183f2.f4589c;
            c0756a.f2622f = c1183f2.f4590d;
            c0756a.f2623g = c1183f2.f4591e;
            c0756a.f2624h = c1183f2.f4588b;
            c0756a.f2628l = c1183f2.f4592f;
            c0756a.f2627k = c1183f2.f4595i;
            c0756a.f2626j = c1183f2.f4594h;
            c0756a.f2632p = c1183f2.f4596j;
            arrayList2.add(c0756a.m1396a());
        }
        return arrayList2;
    }

    public C0247a(android.content.Context context, p013C2.C0138c c0138c, p047L2.InterfaceC0376f interfaceC0376f, io.flutter.embedding.engine.renderer.C1561j c1561j, io.flutter.plugin.platform.C1590m c1590m) {
        this.f719l = context;
        this.f722o = c0138c;
        this.f720m = interfaceC0376f;
        this.f721n = c1561j;
        this.f723p = c1590m;
    }

    public C0247a(android.content.Context context, p047L2.InterfaceC0376f interfaceC0376f, p078T2.C0738o c0738o, p078T2.C0738o c0738o2, io.flutter.embedding.engine.renderer.C1561j c1561j) {
        this.f719l = context;
        this.f720m = interfaceC0376f;
        this.f722o = c0738o;
        this.f723p = c0738o2;
        this.f721n = c1561j;
    }

    public C0247a(p047L2.InterfaceC0376f interfaceC0376f) {
        this.f721n = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f723p = new java.util.LinkedList();
        this.f720m = interfaceC0376f;
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, "com.ryanheise.audio_service.handler.methods");
        this.f719l = c0291m;
        c0291m.m702s(this);
    }
}
