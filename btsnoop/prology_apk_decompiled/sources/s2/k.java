package s2;

import B2.AbstractActivityC0003d;
import B2.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.t;
import android.util.Log;
import com.ryanheise.audioservice.AudioService;
import io.flutter.plugin.platform.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class k implements H2.b, I2.a {
    public static C0552i s;

    /* renamed from: t, reason: collision with root package name */
    public static H2.a f8253t;

    /* renamed from: v, reason: collision with root package name */
    public static K2.k f8255v;
    public static boolean w;

    /* renamed from: x, reason: collision with root package name */
    public static android.support.v4.media.e f8256x;

    /* renamed from: y, reason: collision with root package name */
    public static t f8257y;

    /* renamed from: l, reason: collision with root package name */
    public Context f8259l;

    /* renamed from: m, reason: collision with root package name */
    public H2.a f8260m;

    /* renamed from: n, reason: collision with root package name */
    public C2.d f8261n;

    /* renamed from: o, reason: collision with root package name */
    public C0547d f8262o;

    /* renamed from: p, reason: collision with root package name */
    public C0552i f8263p;

    /* renamed from: q, reason: collision with root package name */
    public final C0549f f8264q = new C0549f(this);

    /* renamed from: r, reason: collision with root package name */
    public static final HashSet f8252r = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public static final long f8254u = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    /* renamed from: z, reason: collision with root package name */
    public static final C0548e f8258z = new C0548e();

    public static HashMap a(MediaMetadataCompat mediaMetadataCompat) {
        RatingCompat ratingCompat = null;
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat d4 = mediaMetadataCompat.d();
        HashMap hashMap = new HashMap();
        hashMap.put("id", d4.f3636l);
        hashMap.put("title", s(mediaMetadataCompat, "android.media.metadata.TITLE"));
        hashMap.put("album", s(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        Uri uri = d4.f3641q;
        if (uri != null) {
            hashMap.put("artUri", uri.toString());
        }
        hashMap.put("artist", s(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put("genre", s(mediaMetadataCompat, "android.media.metadata.GENRE"));
        Bundle bundle = mediaMetadataCompat.f3648l;
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            hashMap.put("duration", Long.valueOf(bundle.getLong("android.media.metadata.DURATION", 0L)));
        }
        hashMap.put("playable", Boolean.valueOf(bundle.getLong("playable_long", 0L) != 0));
        hashMap.put("displayTitle", s(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put("displaySubtitle", s(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put("displayDescription", s(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (bundle.containsKey("android.media.metadata.RATING")) {
            try {
                ratingCompat = RatingCompat.d(bundle.getParcelable("android.media.metadata.RATING"));
            } catch (Exception e4) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e4);
            }
            hashMap.put("rating", t(ratingCompat));
        }
        HashMap k4 = k(new Bundle(bundle));
        if (k4.size() > 0) {
            hashMap.put("extras", k4);
        }
        return hashMap;
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Map map = (Map) it.next();
            arrayList.add(new MediaSessionCompat$QueueItem(null, j(m(map).d(), (Map) map.get("extras")), i4));
            i4++;
        }
        return arrayList;
    }

    public static MediaBrowserCompat$MediaItem i(Map map) {
        return new MediaBrowserCompat$MediaItem(j(m(map).d(), (Map) map.get("extras")), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    public static MediaDescriptionCompat j(MediaDescriptionCompat mediaDescriptionCompat, Map map) {
        if (map == null || map.isEmpty()) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = mediaDescriptionCompat.f3642r;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        bundle.putAll(r(map));
        return new MediaDescriptionCompat(mediaDescriptionCompat.f3636l, mediaDescriptionCompat.f3637m, mediaDescriptionCompat.f3638n, mediaDescriptionCompat.f3639o, mediaDescriptionCompat.f3640p, mediaDescriptionCompat.f3641q, bundle, mediaDescriptionCompat.s);
    }

    public static HashMap k(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(str);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaMetadataCompat m(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.k.m(java.util.Map):android.support.v4.media.MediaMetadataCompat");
    }

    public static void n() {
        C0552i c0552i = s;
        AbstractActivityC0003d abstractActivityC0003d = c0552i != null ? c0552i.f8245m : null;
        if (abstractActivityC0003d != null) {
            abstractActivityC0003d.setIntent(new Intent("android.intent.action.MAIN"));
        }
        t tVar = f8257y;
        if (tVar != null) {
            C0548e c0548e = f8258z;
            if (c0548e == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (((Set) tVar.f3736o).remove(c0548e)) {
                try {
                    ((android.support.v4.media.session.h) tVar.f3734m).b(c0548e);
                } finally {
                    c0548e.b(null);
                }
            } else {
                Log.w("MediaControllerCompat", "the callback has never been registered");
            }
            f8257y = null;
        }
        android.support.v4.media.e eVar = f8256x;
        if (eVar != null) {
            eVar.a();
            f8256x = null;
        }
    }

    public static synchronized C2.c o(ContextWrapper contextWrapper) {
        C2.c cVar;
        String str;
        boolean z4;
        Uri data;
        synchronized (k.class) {
            try {
                cVar = (C2.c) ((HashMap) r.i().f185m).get("audio_service_engine");
                if (cVar == null) {
                    cVar = new C2.c(contextWrapper.getApplicationContext(), null, new o());
                    if (contextWrapper instanceof AbstractActivityC0003d) {
                        AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) contextWrapper;
                        str = abstractActivityC0003d.f();
                        if (str == null) {
                            try {
                                Bundle g4 = abstractActivityC0003d.g();
                                z4 = (g4 == null || !g4.containsKey("flutter_deeplinking_enabled")) ? true : g4.getBoolean("flutter_deeplinking_enabled");
                            } catch (PackageManager.NameNotFoundException unused) {
                                z4 = false;
                            }
                            if (z4 && (data = abstractActivityC0003d.getIntent().getData()) != null) {
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
                    cVar.f353i.f949a.j("setInitialRoute", str, null);
                    D2.b bVar = cVar.f347c;
                    F2.f fVar = (F2.f) t.n0().f3734m;
                    if (!fVar.f643a) {
                        throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
                    }
                    bVar.e(new D2.a(fVar.f646d.f633b, "main"), null);
                    r.i().m("audio_service_engine", cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static Long p(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static HashMap q(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < objArr.length; i4 += 2) {
            hashMap.put((String) objArr[i4], objArr[i4 + 1]);
        }
        return hashMap;
    }

    public static Bundle r(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            }
        }
        return bundle;
    }

    public static String s(MediaMetadataCompat mediaMetadataCompat, String str) {
        CharSequence charSequence = mediaMetadataCompat.f3648l.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static HashMap t(RatingCompat ratingCompat) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(ratingCompat.f3651l));
        if (ratingCompat.e()) {
            boolean z4 = false;
            float f4 = -1.0f;
            float f5 = ratingCompat.f3652m;
            int i4 = ratingCompat.f3651l;
            switch (i4) {
                case 0:
                    hashMap.put("value", null);
                    break;
                case 1:
                    if (i4 == 1) {
                        z4 = f5 == 1.0f;
                    }
                    hashMap.put("value", Boolean.valueOf(z4));
                    break;
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (i4 == 2) {
                        z4 = f5 == 1.0f;
                    }
                    hashMap.put("value", Boolean.valueOf(z4));
                    break;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                    if ((i4 == 3 || i4 == 4 || i4 == 5) && ratingCompat.e()) {
                        f4 = f5;
                    }
                    hashMap.put("value", Float.valueOf(f4));
                    break;
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (i4 == 6 && ratingCompat.e()) {
                        f4 = f5;
                    }
                    hashMap.put("value", Float.valueOf(f4));
                    break;
            }
        } else {
            hashMap.put("value", null);
        }
        return hashMap;
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        HashSet hashSet = f8252r;
        if (hashSet.size() == 1) {
            n();
        }
        hashSet.remove(this.f8263p);
        this.f8263p.f8244l = null;
        this.f8263p = null;
        this.f8259l = null;
        H2.a aVar2 = f8253t;
        if (aVar2 != null && ((L2.f) aVar2.f709m) == ((L2.f) this.f8260m.f709m)) {
            System.out.println("### destroying audio handler interface");
            AudioTrack audioTrack = (AudioTrack) f8253t.f711o;
            if (audioTrack != null) {
                audioTrack.release();
            }
            f8253t = null;
        }
        this.f8260m = null;
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        this.f8260m = aVar;
        C0552i c0552i = new C0552i((L2.f) aVar.f709m);
        this.f8263p = c0552i;
        c0552i.f8244l = (Context) this.f8260m.f708l;
        f8252r.add(c0552i);
        if (this.f8259l == null) {
            this.f8259l = (Context) this.f8260m.f708l;
        }
        if (f8253t == null) {
            H2.a aVar2 = new H2.a((L2.f) this.f8260m.f709m);
            f8253t = aVar2;
            AudioService.f4783L = aVar2;
        }
        if (f8256x == null) {
            l();
        }
    }

    @Override // I2.a
    public final void e() {
        C2.d dVar = this.f8261n;
        ((HashSet) dVar.f370d).remove(this.f8262o);
        this.f8261n = null;
        this.f8262o = null;
        C0552i c0552i = this.f8263p;
        c0552i.f8245m = null;
        c0552i.f8244l = (Context) this.f8260m.f708l;
        if (f8252r.size() == 1) {
            n();
        }
        if (this.f8263p == s) {
            s = null;
        }
    }

    @Override // I2.a
    public final void f(C2.d dVar) {
        this.f8261n = dVar;
        C0552i c0552i = this.f8263p;
        AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) dVar.f367a;
        c0552i.f8245m = abstractActivityC0003d;
        c0552i.f8244l = abstractActivityC0003d;
        C0547d c0547d = new C0547d(this);
        this.f8262o = c0547d;
        ((HashSet) dVar.f370d).add(c0547d);
    }

    @Override // I2.a
    public final void g() {
        C2.d dVar = this.f8261n;
        ((HashSet) dVar.f370d).remove(this.f8262o);
        this.f8261n = null;
        C0552i c0552i = this.f8263p;
        c0552i.f8245m = null;
        c0552i.f8244l = (Context) this.f8260m.f708l;
    }

    @Override // I2.a
    public final void h(C2.d dVar) {
        this.f8261n = dVar;
        C0552i c0552i = this.f8263p;
        AbstractActivityC0003d abstractActivityC0003d = (AbstractActivityC0003d) dVar.f367a;
        c0552i.f8245m = abstractActivityC0003d;
        c0552i.f8244l = abstractActivityC0003d;
        C2.c o2 = o(abstractActivityC0003d);
        C0552i c0552i2 = this.f8263p;
        c0552i2.f8247o = ((L2.f) this.f8260m.f709m) != o2.f347c;
        s = c0552i2;
        C2.d dVar2 = this.f8261n;
        C0547d c0547d = new C0547d(this);
        this.f8262o = c0547d;
        ((HashSet) dVar2.f370d).add(c0547d);
        t tVar = f8257y;
        if (tVar != null) {
            t.y0(s.f8245m, tVar);
        }
        if (f8256x == null) {
            l();
        }
        AbstractActivityC0003d abstractActivityC0003d2 = s.f8245m;
        if ((this.f8263p.f8245m.getIntent().getFlags() & 1048576) == 1048576) {
            abstractActivityC0003d2.setIntent(new Intent("android.intent.action.MAIN"));
        }
        u();
    }

    public final void l() {
        if (f8256x == null) {
            android.support.v4.media.e eVar = new android.support.v4.media.e(this.f8259l, new ComponentName(this.f8259l, (Class<?>) AudioService.class), this.f8264q);
            f8256x = eVar;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            eVar.f3668a.f3660b.connect();
        }
    }

    public final void u() {
        AbstractActivityC0003d abstractActivityC0003d = this.f8263p.f8245m;
        if (f8253t == null || abstractActivityC0003d.getIntent().getAction() == null) {
            return;
        }
        f8253t.a("onNotificationClicked", q("clicked", Boolean.valueOf(abstractActivityC0003d.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK"))), null);
    }
}
