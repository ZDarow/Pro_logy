package p186r2;

/* renamed from: r2.d */
/* loaded from: classes.dex */
public final class C2070d {

    /* renamed from: a */
    public java.util.ArrayList f8410a;

    /* renamed from: b */
    public p064Q.C0530b f8411b;

    /* renamed from: c */
    public p186r2.C2069c f8412c;

    /* renamed from: d */
    public p186r2.C2069c f8413d;

    /* renamed from: e */
    public android.content.Context f8414e;

    /* renamed from: f */
    public android.media.AudioManager f8415f;

    /* renamed from: g */
    public p112c0.C1225g f8416g;

    /* renamed from: h */
    public java.util.List f8417h;

    /* renamed from: a */
    public final boolean m4138a() {
        android.content.Context context;
        android.content.Context context2 = this.f8414e;
        if (context2 == null) {
            return false;
        }
        p186r2.C2069c c2069c = this.f8412c;
        if (c2069c != null) {
            context2.unregisterReceiver(c2069c);
            this.f8412c = null;
        }
        p186r2.C2069c c2069c2 = this.f8413d;
        if (c2069c2 != null && (context = this.f8414e) != null) {
            context.unregisterReceiver(c2069c2);
            this.f8413d = null;
        }
        p064Q.C0530b c0530b = this.f8411b;
        if (c0530b == null) {
            return true;
        }
        android.media.AudioManager audioManager = this.f8415f;
        if (audioManager == null) {
            throw new java.lang.IllegalArgumentException("AudioManager must not be null");
        }
        int m1035a = p064Q.AbstractC0531c.m1035a(audioManager, c0530b.f1560f);
        this.f8411b = null;
        return m1035a == 1;
    }

    /* renamed from: b */
    public final void m4139b(java.util.Map map) {
        java.lang.Object obj = map.get("downTime");
        long longValue = ((obj == null || (obj instanceof java.lang.Long)) ? (java.lang.Long) obj : java.lang.Long.valueOf(((java.lang.Integer) obj).intValue())).longValue();
        java.lang.Object obj2 = map.get("eventTime");
        this.f8415f.dispatchMediaKeyEvent(new android.view.KeyEvent(longValue, ((obj2 == null || (obj2 instanceof java.lang.Long)) ? (java.lang.Long) obj2 : java.lang.Long.valueOf(((java.lang.Integer) obj2).intValue())).longValue(), ((java.lang.Integer) map.get("action")).intValue(), ((java.lang.Integer) map.get("keyCode")).intValue(), ((java.lang.Integer) map.get("repeatCount")).intValue(), ((java.lang.Integer) map.get("metaState")).intValue(), ((java.lang.Integer) map.get("deviceId")).intValue(), ((java.lang.Integer) map.get("scanCode")).intValue(), ((java.lang.Integer) map.get("flags")).intValue(), ((java.lang.Integer) map.get("source")).intValue()));
    }

    /* renamed from: c */
    public final java.util.ArrayList m4140c(int i4) {
        p186r2.C2071e.m4148e(23);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.media.AudioDeviceInfo audioDeviceInfo : this.f8415f.getDevices(i4)) {
            arrayList.add(p186r2.C2071e.m4147d("id", java.lang.Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", android.os.Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", java.lang.Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", java.lang.Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", p186r2.C2071e.m4146c(audioDeviceInfo.getSampleRates()), "channelMasks", p186r2.C2071e.m4146c(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", p186r2.C2071e.m4146c(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", p186r2.C2071e.m4146c(audioDeviceInfo.getChannelCounts()), "encodings", p186r2.C2071e.m4146c(audioDeviceInfo.getEncodings()), "type", java.lang.Integer.valueOf(audioDeviceInfo.getType())));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final java.util.ArrayList m4141d() {
        java.util.List microphones;
        java.util.List<android.util.Pair> frequencyResponse;
        java.util.List<android.util.Pair> channelMapping;
        java.lang.String description;
        int id;
        int type;
        java.lang.String address;
        int location;
        int group;
        int indexInTheGroup;
        android.media.MicrophoneInfo.Coordinate3F position;
        android.media.MicrophoneInfo.Coordinate3F orientation;
        float sensitivity;
        float maxSpl;
        float minSpl;
        int directionality;
        p186r2.C2071e.m4148e(28);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        microphones = this.f8415f.getMicrophones();
        java.util.Iterator it = microphones.iterator();
        while (it.hasNext()) {
            android.media.MicrophoneInfo m4129d = p186r2.AbstractC2067a.m4129d(it.next());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            frequencyResponse = m4129d.getFrequencyResponse();
            for (android.util.Pair pair : frequencyResponse) {
                arrayList2.add(new java.util.ArrayList(java.util.Arrays.asList(java.lang.Double.valueOf(((java.lang.Float) pair.first).floatValue()), java.lang.Double.valueOf(((java.lang.Float) pair.second).floatValue()))));
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            channelMapping = m4129d.getChannelMapping();
            for (android.util.Pair pair2 : channelMapping) {
                arrayList3.add(new java.util.ArrayList(java.util.Arrays.asList((java.lang.Integer) pair2.first, (java.lang.Integer) pair2.second)));
            }
            description = m4129d.getDescription();
            id = m4129d.getId();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(id);
            type = m4129d.getType();
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(type);
            address = m4129d.getAddress();
            location = m4129d.getLocation();
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(location);
            group = m4129d.getGroup();
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(group);
            indexInTheGroup = m4129d.getIndexInTheGroup();
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(indexInTheGroup);
            position = m4129d.getPosition();
            java.util.ArrayList m4144a = p186r2.C2071e.m4144a(position);
            orientation = m4129d.getOrientation();
            java.util.ArrayList m4144a2 = p186r2.C2071e.m4144a(orientation);
            sensitivity = m4129d.getSensitivity();
            java.lang.Float valueOf6 = java.lang.Float.valueOf(sensitivity);
            maxSpl = m4129d.getMaxSpl();
            java.lang.Float valueOf7 = java.lang.Float.valueOf(maxSpl);
            minSpl = m4129d.getMinSpl();
            java.lang.Float valueOf8 = java.lang.Float.valueOf(minSpl);
            directionality = m4129d.getDirectionality();
            arrayList.add(p186r2.C2071e.m4147d("description", description, "id", valueOf, "type", valueOf2, "address", address, "location", valueOf3, "group", valueOf4, "indexInTheGroup", valueOf5, "position", m4144a, "orientation", m4144a2, "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", valueOf6, "maxSpl", valueOf7, "minSpl", valueOf8, "directionality", java.lang.Integer.valueOf(directionality)));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final void m4142e(java.lang.String str, java.lang.Object... objArr) {
        java.util.Iterator it = this.f8410a.iterator();
        while (it.hasNext()) {
            p186r2.C2071e c2071e = (p186r2.C2071e) it.next();
            c2071e.f8419l.m694j(str, new java.util.ArrayList(java.util.Arrays.asList(objArr)), null);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [r2.b] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.media.AudioAttributesImplApi26, androidx.media.AudioAttributesImplApi21] */
    /* renamed from: f */
    public final boolean m4143f(java.util.List list) {
        if (this.f8411b != null) {
            return true;
        }
        java.util.Map map = (java.util.Map) list.get(0);
        int intValue = ((java.lang.Integer) map.get("gainType")).intValue();
        androidx.media.AudioAttributesCompat audioAttributesCompat = p064Q.C0530b.f1554g;
        if (intValue != 1 && intValue != 2 && intValue != 3 && intValue != 4) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Illegal audio focus gain type ", intValue));
        }
        ?? r5 = new android.media.AudioManager.OnAudioFocusChangeListener() { // from class: r2.b
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i4) {
                p186r2.C2070d c2070d = p186r2.C2070d.this;
                if (i4 == -1) {
                    c2070d.m4138a();
                }
                c2070d.m4142e("onAudioFocusChanged", java.lang.Integer.valueOf(i4));
            }
        };
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        if (map.get("audioAttributes") != null) {
            java.util.Map map2 = (java.util.Map) map.get("audioAttributes");
            int i4 = androidx.media.AudioAttributesCompat.f4343b;
            android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
            if (map2.get("contentType") != null) {
                builder.setContentType(((java.lang.Integer) map2.get("contentType")).intValue());
            }
            if (map2.get("flags") != null) {
                builder.setFlags(((java.lang.Integer) map2.get("flags")).intValue());
            }
            if (map2.get("usage") != null) {
                builder.setUsage(((java.lang.Integer) map2.get("usage")).intValue());
            }
            audioAttributesCompat = new androidx.media.AudioAttributesCompat(new androidx.media.AudioAttributesImplApi21(builder.build()));
        }
        p064Q.C0530b c0530b = new p064Q.C0530b(intValue, r5, handler, audioAttributesCompat, map.get("willPauseWhenDucked") != null ? ((java.lang.Boolean) map.get("willPauseWhenDucked")).booleanValue() : false);
        this.f8411b = c0530b;
        android.media.AudioManager audioManager = this.f8415f;
        if (audioManager == null) {
            throw new java.lang.IllegalArgumentException("AudioManager must not be null");
        }
        boolean z4 = p064Q.AbstractC0531c.m1036b(audioManager, c0530b.f1560f) == 1;
        if (z4) {
            if (this.f8412c == null) {
                p186r2.C2069c c2069c = new p186r2.C2069c(this, 0);
                this.f8412c = c2069c;
                p176p1.AbstractC1949a.m3908K(this.f8414e, c2069c, new android.content.IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            }
            if (this.f8413d == null) {
                p186r2.C2069c c2069c2 = new p186r2.C2069c(this, 1);
                this.f8413d = c2069c2;
                p176p1.AbstractC1949a.m3908K(this.f8414e, c2069c2, new android.content.IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            }
        }
        return z4;
    }
}
