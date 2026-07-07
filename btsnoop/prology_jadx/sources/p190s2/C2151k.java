package p190s2;

/* renamed from: s2.k */
/* loaded from: classes.dex */
public class C2151k implements p034H2.InterfaceC0248b, p038I2.InterfaceC0309a {

    /* renamed from: s */
    public static p190s2.C2149i f8572s;

    /* renamed from: t */
    public static p034H2.C0247a f8573t;

    /* renamed from: v */
    public static p043K2.C0335k f8575v;

    /* renamed from: w */
    public static boolean f8576w;

    /* renamed from: x */
    public static android.support.v4.media.C1037e f8577x;

    /* renamed from: y */
    public static android.support.v4.media.session.C1061t f8578y;

    /* renamed from: l */
    public android.content.Context f8580l;

    /* renamed from: m */
    public p034H2.C0247a f8581m;

    /* renamed from: n */
    public p013C2.C0139d f8582n;

    /* renamed from: o */
    public p190s2.C2144d f8583o;

    /* renamed from: p */
    public p190s2.C2149i f8584p;

    /* renamed from: q */
    public final p190s2.C2146f f8585q = new p190s2.C2146f(this);

    /* renamed from: r */
    public static final java.util.HashSet f8571r = new java.util.HashSet();

    /* renamed from: u */
    public static final long f8574u = java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime();

    /* renamed from: z */
    public static final p190s2.C2145e f8579z = new p190s2.C2145e();

    /* renamed from: a */
    public static java.util.HashMap m4266a(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        android.support.v4.media.RatingCompat ratingCompat = null;
        if (mediaMetadataCompat == null) {
            return null;
        }
        android.support.v4.media.MediaDescriptionCompat m2062d = mediaMetadataCompat.m2062d();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("id", m2062d.f3760l);
        hashMap.put("title", m4277s(mediaMetadataCompat, "android.media.metadata.TITLE"));
        hashMap.put("album", m4277s(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        android.net.Uri uri = m2062d.f3765q;
        if (uri != null) {
            hashMap.put("artUri", uri.toString());
        }
        hashMap.put("artist", m4277s(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put("genre", m4277s(mediaMetadataCompat, "android.media.metadata.GENRE"));
        android.os.Bundle bundle = mediaMetadataCompat.f3773l;
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            hashMap.put("duration", java.lang.Long.valueOf(bundle.getLong("android.media.metadata.DURATION", 0L)));
        }
        hashMap.put("playable", java.lang.Boolean.valueOf(bundle.getLong("playable_long", 0L) != 0));
        hashMap.put("displayTitle", m4277s(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put("displaySubtitle", m4277s(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put("displayDescription", m4277s(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (bundle.containsKey("android.media.metadata.RATING")) {
            try {
                ratingCompat = android.support.v4.media.RatingCompat.m2064d(bundle.getParcelable("android.media.metadata.RATING"));
            } catch (java.lang.Exception e4) {
                android.util.Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e4);
            }
            hashMap.put("rating", m4278t(ratingCompat));
        }
        java.util.HashMap m4270k = m4270k(new android.os.Bundle(bundle));
        if (m4270k.size() > 0) {
            hashMap.put("extras", m4270k);
        }
        return hashMap;
    }

    /* renamed from: c */
    public static java.util.ArrayList m4267c(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            java.util.Map map = (java.util.Map) it.next();
            arrayList.add(new android.support.v4.media.session.MediaSessionCompat$QueueItem(null, m4269j(m4271m(map).m2062d(), (java.util.Map) map.get("extras")), i4));
            i4++;
        }
        return arrayList;
    }

    /* renamed from: i */
    public static android.support.v4.media.MediaBrowserCompat$MediaItem m4268i(java.util.Map map) {
        return new android.support.v4.media.MediaBrowserCompat$MediaItem(m4269j(m4271m(map).m2062d(), (java.util.Map) map.get("extras")), ((java.lang.Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    /* renamed from: j */
    public static android.support.v4.media.MediaDescriptionCompat m4269j(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return mediaDescriptionCompat;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = mediaDescriptionCompat.f3766r;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        bundle.putAll(m4276r(map));
        return new android.support.v4.media.MediaDescriptionCompat(mediaDescriptionCompat.f3760l, mediaDescriptionCompat.f3761m, mediaDescriptionCompat.f3762n, mediaDescriptionCompat.f3763o, mediaDescriptionCompat.f3764p, mediaDescriptionCompat.f3765q, bundle, mediaDescriptionCompat.f3767s);
    }

    /* renamed from: k */
    public static java.util.HashMap m4270k(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : bundle.keySet()) {
            java.io.Serializable serializable = bundle.getSerializable(str);
            if (serializable != null) {
                hashMap.put(str, serializable);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x0190. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0114  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaMetadataCompat m4271m(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p190s2.C2151k.m4271m(java.util.Map):android.support.v4.media.MediaMetadataCompat");
    }

    /* renamed from: n */
    public static void m4272n() {
        p190s2.C2149i c2149i = f8572s;
        p009B2.AbstractActivityC0047d abstractActivityC0047d = c2149i != null ? c2149i.f8564m : null;
        if (abstractActivityC0047d != null) {
            abstractActivityC0047d.setIntent(new android.content.Intent("android.intent.action.MAIN"));
        }
        android.support.v4.media.session.C1061t c1061t = f8578y;
        if (c1061t != null) {
            p190s2.C2145e c2145e = f8579z;
            if (c2145e == null) {
                throw new java.lang.IllegalArgumentException("callback must not be null");
            }
            if (((java.util.Set) c1061t.f3863o).remove(c2145e)) {
                try {
                    ((android.support.v4.media.session.C1049h) c1061t.f3861m).m2157b(c2145e);
                } finally {
                    c2145e.m4265b(null);
                }
            } else {
                android.util.Log.w("MediaControllerCompat", "the callback has never been registered");
            }
            f8578y = null;
        }
        android.support.v4.media.C1037e c1037e = f8577x;
        if (c1037e != null) {
            c1037e.m2068a();
            f8577x = null;
        }
    }

    /* renamed from: o */
    public static synchronized p013C2.C0138c m4273o(android.content.ContextWrapper contextWrapper) {
        p013C2.C0138c c0138c;
        java.lang.String str;
        boolean z4;
        android.net.Uri data;
        synchronized (p190s2.C2151k.class) {
            try {
                c0138c = (p013C2.C0138c) ((java.util.HashMap) p009B2.C0061r.m262i().f188m).get("audio_service_engine");
                if (c0138c == null) {
                    c0138c = new p013C2.C0138c(contextWrapper.getApplicationContext(), null, new io.flutter.plugin.platform.C1592o());
                    if (contextWrapper instanceof p009B2.AbstractActivityC0047d) {
                        p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) contextWrapper;
                        str = abstractActivityC0047d.m131f();
                        if (str == null) {
                            try {
                                android.os.Bundle m132g = abstractActivityC0047d.m132g();
                                z4 = (m132g == null || !m132g.containsKey("flutter_deeplinking_enabled")) ? true : m132g.getBoolean("flutter_deeplinking_enabled");
                            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                                z4 = false;
                            }
                            if (z4 && (data = abstractActivityC0047d.getIntent().getData()) != null) {
                                str = data.getPath();
                                if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                                    str = str + "?" + data.getQuery();
                                }
                            }
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "/";
                    }
                    c0138c.f359i.f988a.m694j("setInitialRoute", str, null);
                    p018D2.C0176b c0176b = c0138c.f353c;
                    p026F2.C0229f c0229f = (p026F2.C0229f) android.support.v4.media.session.C1061t.m2201n0().f3861m;
                    if (!c0229f.f653a) {
                        throw new java.lang.AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
                    }
                    c0176b.m538e(new p018D2.C0175a(c0229f.f656d.f643b, "main"), null);
                    p009B2.C0061r.m262i().m274m("audio_service_engine", c0138c);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c0138c;
    }

    /* renamed from: p */
    public static java.lang.Long m4274p(java.lang.Object obj) {
        return (obj == null || (obj instanceof java.lang.Long)) ? (java.lang.Long) obj : java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
    }

    /* renamed from: q */
    public static java.util.HashMap m4275q(java.lang.Object... objArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i4 = 0; i4 < objArr.length; i4 += 2) {
            hashMap.put((java.lang.String) objArr[i4], objArr[i4 + 1]);
        }
        return hashMap;
    }

    /* renamed from: r */
    public static android.os.Bundle m4276r(java.util.Map map) {
        if (map == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : map.keySet()) {
            java.lang.Object obj = map.get(str);
            if (obj instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Integer) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Long) obj).longValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
            } else if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.String) {
                bundle.putString(str, (java.lang.String) obj);
            }
        }
        return bundle;
    }

    /* renamed from: s */
    public static java.lang.String m4277s(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat, java.lang.String str) {
        java.lang.CharSequence charSequence = mediaMetadataCompat.f3773l.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: t */
    public static java.util.HashMap m4278t(android.support.v4.media.RatingCompat ratingCompat) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", java.lang.Integer.valueOf(ratingCompat.f3776l));
        if (ratingCompat.m2067e()) {
            boolean z4 = false;
            float f4 = -1.0f;
            float f5 = ratingCompat.f3777m;
            int i4 = ratingCompat.f3776l;
            switch (i4) {
                case 0:
                    hashMap.put("value", null);
                    break;
                case 1:
                    if (i4 == 1) {
                        z4 = f5 == 1.0f;
                    }
                    hashMap.put("value", java.lang.Boolean.valueOf(z4));
                    break;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (i4 == 2) {
                        z4 = f5 == 1.0f;
                    }
                    hashMap.put("value", java.lang.Boolean.valueOf(z4));
                    break;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    if ((i4 == 3 || i4 == 4 || i4 == 5) && ratingCompat.m2067e()) {
                        f4 = f5;
                    }
                    hashMap.put("value", java.lang.Float.valueOf(f4));
                    break;
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (i4 == 6 && ratingCompat.m2067e()) {
                        f4 = f5;
                    }
                    hashMap.put("value", java.lang.Float.valueOf(f4));
                    break;
            }
        } else {
            hashMap.put("value", null);
        }
        return hashMap;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        java.util.HashSet hashSet = f8571r;
        if (hashSet.size() == 1) {
            m4272n();
        }
        hashSet.remove(this.f8584p);
        this.f8584p.f8563l = null;
        this.f8584p = null;
        this.f8580l = null;
        p034H2.C0247a c0247a2 = f8573t;
        if (c0247a2 != null && ((p047L2.InterfaceC0376f) c0247a2.f720m) == ((p047L2.InterfaceC0376f) this.f8581m.f720m)) {
            java.lang.System.out.println("### destroying audio handler interface");
            android.media.AudioTrack audioTrack = (android.media.AudioTrack) f8573t.f722o;
            if (audioTrack != null) {
                audioTrack.release();
            }
            f8573t = null;
        }
        this.f8581m = null;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        this.f8581m = c0247a;
        p190s2.C2149i c2149i = new p190s2.C2149i((p047L2.InterfaceC0376f) c0247a.f720m);
        this.f8584p = c2149i;
        c2149i.f8563l = (android.content.Context) this.f8581m.f719l;
        f8571r.add(c2149i);
        if (this.f8580l == null) {
            this.f8580l = (android.content.Context) this.f8581m.f719l;
        }
        if (f8573t == null) {
            p034H2.C0247a c0247a2 = new p034H2.C0247a((p047L2.InterfaceC0376f) this.f8581m.f720m);
            f8573t = c0247a2;
            com.ryanheise.audioservice.AudioService.f4961L = c0247a2;
        }
        if (f8577x == null) {
            m4279l();
        }
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: e */
    public final void mo531e() {
        p013C2.C0139d c0139d = this.f8582n;
        ((java.util.HashSet) c0139d.f378d).remove(this.f8583o);
        this.f8582n = null;
        this.f8583o = null;
        p190s2.C2149i c2149i = this.f8584p;
        c2149i.f8564m = null;
        c2149i.f8563l = (android.content.Context) this.f8581m.f719l;
        if (f8571r.size() == 1) {
            m4272n();
        }
        if (this.f8584p == f8572s) {
            f8572s = null;
        }
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: f */
    public final void mo532f(p013C2.C0139d c0139d) {
        this.f8582n = c0139d;
        p190s2.C2149i c2149i = this.f8584p;
        p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) c0139d.f375a;
        c2149i.f8564m = abstractActivityC0047d;
        c2149i.f8563l = abstractActivityC0047d;
        p190s2.C2144d c2144d = new p190s2.C2144d(this);
        this.f8583o = c2144d;
        ((java.util.HashSet) c0139d.f378d).add(c2144d);
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: g */
    public final void mo533g() {
        p013C2.C0139d c0139d = this.f8582n;
        ((java.util.HashSet) c0139d.f378d).remove(this.f8583o);
        this.f8582n = null;
        p190s2.C2149i c2149i = this.f8584p;
        c2149i.f8564m = null;
        c2149i.f8563l = (android.content.Context) this.f8581m.f719l;
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: h */
    public final void mo534h(p013C2.C0139d c0139d) {
        this.f8582n = c0139d;
        p190s2.C2149i c2149i = this.f8584p;
        p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) c0139d.f375a;
        c2149i.f8564m = abstractActivityC0047d;
        c2149i.f8563l = abstractActivityC0047d;
        p013C2.C0138c m4273o = m4273o(abstractActivityC0047d);
        p190s2.C2149i c2149i2 = this.f8584p;
        c2149i2.f8566o = ((p047L2.InterfaceC0376f) this.f8581m.f720m) != m4273o.f353c;
        f8572s = c2149i2;
        p013C2.C0139d c0139d2 = this.f8582n;
        p190s2.C2144d c2144d = new p190s2.C2144d(this);
        this.f8583o = c2144d;
        ((java.util.HashSet) c0139d2.f378d).add(c2144d);
        android.support.v4.media.session.C1061t c1061t = f8578y;
        if (c1061t != null) {
            android.support.v4.media.session.C1061t.m2203y0(f8572s.f8564m, c1061t);
        }
        if (f8577x == null) {
            m4279l();
        }
        p009B2.AbstractActivityC0047d abstractActivityC0047d2 = f8572s.f8564m;
        if ((this.f8584p.f8564m.getIntent().getFlags() & 1048576) == 1048576) {
            abstractActivityC0047d2.setIntent(new android.content.Intent("android.intent.action.MAIN"));
        }
        m4280u();
    }

    /* renamed from: l */
    public final void m4279l() {
        if (f8577x == null) {
            android.support.v4.media.C1037e c1037e = new android.support.v4.media.C1037e(this.f8580l, new android.content.ComponentName(this.f8580l, (java.lang.Class<?>) com.ryanheise.audioservice.AudioService.class), this.f8585q);
            f8577x = c1037e;
            android.util.Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            c1037e.f3793a.f3785b.connect();
        }
    }

    /* renamed from: u */
    public final void m4280u() {
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f8584p.f8564m;
        if (f8573t == null || abstractActivityC0047d.getIntent().getAction() == null) {
            return;
        }
        f8573t.m656a("onNotificationClicked", m4275q("clicked", java.lang.Boolean.valueOf(abstractActivityC0047d.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK"))), null);
    }
}
