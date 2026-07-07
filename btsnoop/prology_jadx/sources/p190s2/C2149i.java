package p190s2;

/* renamed from: s2.i */
/* loaded from: classes.dex */
public final class C2149i implements p047L2.InterfaceC0385o {

    /* renamed from: l */
    public android.content.Context f8563l;

    /* renamed from: m */
    public p009B2.AbstractActivityC0047d f8564m;

    /* renamed from: n */
    public final p047L2.InterfaceC0376f f8565n;

    /* renamed from: o */
    public boolean f8566o;

    /* renamed from: p */
    public boolean f8567p;

    public C2149i(p047L2.InterfaceC0376f interfaceC0376f) {
        this.f8565n = interfaceC0376f;
        new p035I.C0291m(interfaceC0376f, "com.ryanheise.audio_service.client.methods").m702s(this);
    }

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public final void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        java.lang.Integer num;
        int intValue;
        try {
            if (this.f8566o) {
                throw new java.lang.IllegalStateException("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
            }
            java.lang.String str = c0384n.f1133a;
            if (str.hashCode() == -804429082 && str.equals("configure")) {
                if (this.f8567p) {
                    throw new java.lang.IllegalStateException("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
                }
                p190s2.C2151k.f8576w = true;
                java.util.Map map = (java.util.Map) ((java.util.Map) c0384n.f1134b).get("config");
                p190s2.C2143c c2143c = new p190s2.C2143c(this.f8563l.getApplicationContext());
                c2143c.f8545i = ((java.lang.Boolean) map.get("androidNotificationClickStartsActivity")).booleanValue();
                c2143c.f8546j = ((java.lang.Boolean) map.get("androidNotificationOngoing")).booleanValue();
                c2143c.f8538b = ((java.lang.Boolean) map.get("androidResumeOnClick")).booleanValue();
                c2143c.f8539c = (java.lang.String) map.get("androidNotificationChannelId");
                c2143c.f8540d = (java.lang.String) map.get("androidNotificationChannelName");
                c2143c.f8541e = (java.lang.String) map.get("androidNotificationChannelDescription");
                if (map.get("notificationColor") == null) {
                    intValue = -1;
                } else {
                    java.lang.Object obj = map.get("notificationColor");
                    if (obj != null && !(obj instanceof java.lang.Integer)) {
                        num = java.lang.Integer.valueOf((int) ((java.lang.Long) obj).longValue());
                        intValue = num.intValue();
                    }
                    num = (java.lang.Integer) obj;
                    intValue = num.intValue();
                }
                c2143c.f8542f = intValue;
                c2143c.f8543g = (java.lang.String) map.get("androidNotificationIcon");
                c2143c.f8544h = ((java.lang.Boolean) map.get("androidShowNotificationBadge")).booleanValue();
                c2143c.f8547k = ((java.lang.Boolean) map.get("androidStopForegroundOnPause")).booleanValue();
                c2143c.f8548l = map.get("artDownscaleWidth") != null ? ((java.lang.Integer) map.get("artDownscaleWidth")).intValue() : -1;
                c2143c.f8549m = map.get("artDownscaleHeight") != null ? ((java.lang.Integer) map.get("artDownscaleHeight")).intValue() : -1;
                java.util.Map map2 = (java.util.Map) map.get("androidBrowsableRootExtras");
                if (map2 != null) {
                    c2143c.f8551o = new org.json.JSONObject(map2).toString();
                } else {
                    c2143c.f8551o = null;
                }
                p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f8564m;
                if (abstractActivityC0047d != null) {
                    c2143c.f8550n = abstractActivityC0047d.getClass().getName();
                }
                c2143c.m4263a();
                com.ryanheise.audioservice.AudioService audioService = com.ryanheise.audioservice.AudioService.f4959J;
                if (audioService != null) {
                    audioService.m2941h(c2143c);
                }
                p190s2.C2151k.f8572s = this;
                p034H2.C0247a c0247a = p190s2.C2151k.f8573t;
                p047L2.InterfaceC0376f interfaceC0376f = this.f8565n;
                if (c0247a == null) {
                    p034H2.C0247a c0247a2 = new p034H2.C0247a(interfaceC0376f);
                    p190s2.C2151k.f8573t = c0247a2;
                    com.ryanheise.audioservice.AudioService.f4961L = c0247a2;
                } else {
                    if (((p047L2.InterfaceC0376f) c0247a.f720m) != interfaceC0376f) {
                        ((p035I.C0291m) c0247a.f719l).m702s(null);
                        c0247a.f720m = interfaceC0376f;
                        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, "com.ryanheise.audio_service.handler.methods");
                        c0247a.f719l = c0291m;
                        c0291m.m702s(c0247a);
                    }
                    p034H2.C0247a c0247a3 = p190s2.C2151k.f8573t;
                    java.util.LinkedList<p190s2.C2150j> linkedList = (java.util.LinkedList) c0247a3.f723p;
                    for (p190s2.C2150j c2150j : linkedList) {
                        ((p035I.C0291m) c0247a3.f719l).m694j(c2150j.f8568a, c2150j.f8569b, c2150j.f8570c);
                    }
                    linkedList.clear();
                }
                if (p190s2.C2151k.f8578y != null) {
                    c0335k.mo742b(p190s2.C2151k.m4275q(new java.lang.Object[0]));
                } else {
                    p190s2.C2151k.f8575v = c0335k;
                }
            }
        } catch (java.lang.Exception e4) {
            e4.printStackTrace();
            c0335k.mo741a(e4.getMessage(), null, null);
        }
    }
}
