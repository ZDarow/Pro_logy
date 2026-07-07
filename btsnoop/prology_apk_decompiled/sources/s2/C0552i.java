package s2;

import B2.AbstractActivityC0003d;
import I.C0044m;
import L2.n;
import L2.o;
import android.content.Context;
import com.ryanheise.audioservice.AudioService;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: s2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552i implements o {

    /* renamed from: l, reason: collision with root package name */
    public Context f8244l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractActivityC0003d f8245m;

    /* renamed from: n, reason: collision with root package name */
    public final L2.f f8246n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8247o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8248p;

    public C0552i(L2.f fVar) {
        this.f8246n = fVar;
        new C0044m(fVar, "com.ryanheise.audio_service.client.methods").s(this);
    }

    @Override // L2.o
    public final void I(n nVar, K2.k kVar) {
        Integer num;
        int intValue;
        try {
            if (this.f8247o) {
                throw new IllegalStateException("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
            }
            String str = nVar.f1094a;
            if (str.hashCode() == -804429082 && str.equals("configure")) {
                if (this.f8248p) {
                    throw new IllegalStateException("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
                }
                k.w = true;
                Map map = (Map) ((Map) nVar.f1095b).get("config");
                C0546c c0546c = new C0546c(this.f8244l.getApplicationContext());
                c0546c.f8226i = ((Boolean) map.get("androidNotificationClickStartsActivity")).booleanValue();
                c0546c.f8227j = ((Boolean) map.get("androidNotificationOngoing")).booleanValue();
                c0546c.f8219b = ((Boolean) map.get("androidResumeOnClick")).booleanValue();
                c0546c.f8220c = (String) map.get("androidNotificationChannelId");
                c0546c.f8221d = (String) map.get("androidNotificationChannelName");
                c0546c.f8222e = (String) map.get("androidNotificationChannelDescription");
                if (map.get("notificationColor") == null) {
                    intValue = -1;
                } else {
                    Object obj = map.get("notificationColor");
                    if (obj != null && !(obj instanceof Integer)) {
                        num = Integer.valueOf((int) ((Long) obj).longValue());
                        intValue = num.intValue();
                    }
                    num = (Integer) obj;
                    intValue = num.intValue();
                }
                c0546c.f8223f = intValue;
                c0546c.f8224g = (String) map.get("androidNotificationIcon");
                c0546c.f8225h = ((Boolean) map.get("androidShowNotificationBadge")).booleanValue();
                c0546c.f8228k = ((Boolean) map.get("androidStopForegroundOnPause")).booleanValue();
                c0546c.f8229l = map.get("artDownscaleWidth") != null ? ((Integer) map.get("artDownscaleWidth")).intValue() : -1;
                c0546c.f8230m = map.get("artDownscaleHeight") != null ? ((Integer) map.get("artDownscaleHeight")).intValue() : -1;
                Map map2 = (Map) map.get("androidBrowsableRootExtras");
                if (map2 != null) {
                    c0546c.f8232o = new JSONObject(map2).toString();
                } else {
                    c0546c.f8232o = null;
                }
                AbstractActivityC0003d abstractActivityC0003d = this.f8245m;
                if (abstractActivityC0003d != null) {
                    c0546c.f8231n = abstractActivityC0003d.getClass().getName();
                }
                c0546c.a();
                AudioService audioService = AudioService.J;
                if (audioService != null) {
                    audioService.h(c0546c);
                }
                k.s = this;
                H2.a aVar = k.f8253t;
                L2.f fVar = this.f8246n;
                if (aVar == null) {
                    H2.a aVar2 = new H2.a(fVar);
                    k.f8253t = aVar2;
                    AudioService.f4783L = aVar2;
                } else {
                    if (((L2.f) aVar.f709m) != fVar) {
                        ((C0044m) aVar.f708l).s(null);
                        aVar.f709m = fVar;
                        C0044m c0044m = new C0044m(fVar, "com.ryanheise.audio_service.handler.methods");
                        aVar.f708l = c0044m;
                        c0044m.s(aVar);
                    }
                    H2.a aVar3 = k.f8253t;
                    LinkedList<C0553j> linkedList = (LinkedList) aVar3.f712p;
                    for (C0553j c0553j : linkedList) {
                        ((C0044m) aVar3.f708l).j(c0553j.f8249a, c0553j.f8250b, c0553j.f8251c);
                    }
                    linkedList.clear();
                }
                if (k.f8257y != null) {
                    kVar.b(k.q(new Object[0]));
                } else {
                    k.f8255v = kVar;
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            kVar.a(e4.getMessage(), null, null);
        }
    }
}
