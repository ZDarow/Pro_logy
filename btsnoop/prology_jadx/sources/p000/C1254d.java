package p000;

/* renamed from: d */
/* loaded from: classes.dex */
public final class C1254d {

    /* renamed from: a */
    public static final /* synthetic */ p000.C1254d f4981a = new java.lang.Object();

    /* renamed from: b */
    public static final p100Z2.C0932e f4982b = new p100Z2.C0932e(new p071R2.C0598d(1));

    /* renamed from: a */
    public static void m2949a(p000.C1254d c1254d, p047L2.InterfaceC0376f interfaceC0376f, final p221z2.C2441a c2441a) {
        c1254d.getClass();
        p154k3.AbstractC1803h.m3779e(interfaceC0376f, "binaryMessenger");
        java.lang.String concat = "".length() > 0 ? ".".concat("") : "";
        java.lang.String m153l = p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle", concat);
        p100Z2.C0932e c0932e = f4982b;
        p025F1.C0215g c0215g = null;
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, m153l, (p047L2.InterfaceC0383m) c0932e.m1762a(), c0215g);
        if (c2441a != null) {
            final int i4 = 0;
            c0291m.m701r(new p047L2.InterfaceC0372b() { // from class: c
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3928c;
                    java.util.List m3928c2;
                    p009B2.AbstractActivityC0047d abstractActivityC0047d;
                    switch (i4) {
                        case 0:
                            p221z2.C2441a c2441a2 = c2441a;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.lang.Object obj2 = ((java.util.List) obj).get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                c2441a2.m4680a((p000.C1162b) obj2);
                                m3928c = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3928c = p176p1.AbstractC1949a.m3928c(th);
                            }
                            c0026d.mo106e(m3928c);
                            return;
                        default:
                            try {
                                p206w0.C2305a c2305a = c2441a.f9599l;
                                p154k3.AbstractC1803h.m3776b(c2305a);
                                abstractActivityC0047d = (p009B2.AbstractActivityC0047d) c2305a.f9102l;
                            } catch (java.lang.Throwable th2) {
                                m3928c2 = p176p1.AbstractC1949a.m3928c(th2);
                            }
                            if (abstractActivityC0047d == null) {
                                throw new p112c0.C1235q();
                            }
                            p154k3.AbstractC1803h.m3776b(abstractActivityC0047d);
                            m3928c2 = p176p1.AbstractC1949a.m3904E(new p000.C0935a(java.lang.Boolean.valueOf((abstractActivityC0047d.getWindow().getAttributes().flags & 128) != 0)));
                            c0026d.mo106e(m3928c2);
                            return;
                    }
                }
            });
        } else {
            c0291m.m701r(null);
        }
        p035I.C0291m c0291m2 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled", concat), (p047L2.InterfaceC0383m) c0932e.m1762a(), c0215g);
        if (c2441a == null) {
            c0291m2.m701r(null);
        } else {
            final int i5 = 1;
            c0291m2.m701r(new p047L2.InterfaceC0372b() { // from class: c
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3928c;
                    java.util.List m3928c2;
                    p009B2.AbstractActivityC0047d abstractActivityC0047d;
                    switch (i5) {
                        case 0:
                            p221z2.C2441a c2441a2 = c2441a;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.lang.Object obj2 = ((java.util.List) obj).get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                c2441a2.m4680a((p000.C1162b) obj2);
                                m3928c = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3928c = p176p1.AbstractC1949a.m3928c(th);
                            }
                            c0026d.mo106e(m3928c);
                            return;
                        default:
                            try {
                                p206w0.C2305a c2305a = c2441a.f9599l;
                                p154k3.AbstractC1803h.m3776b(c2305a);
                                abstractActivityC0047d = (p009B2.AbstractActivityC0047d) c2305a.f9102l;
                            } catch (java.lang.Throwable th2) {
                                m3928c2 = p176p1.AbstractC1949a.m3928c(th2);
                            }
                            if (abstractActivityC0047d == null) {
                                throw new p112c0.C1235q();
                            }
                            p154k3.AbstractC1803h.m3776b(abstractActivityC0047d);
                            m3928c2 = p176p1.AbstractC1949a.m3904E(new p000.C0935a(java.lang.Boolean.valueOf((abstractActivityC0047d.getWindow().getAttributes().flags & 128) != 0)));
                            c0026d.mo106e(m3928c2);
                            return;
                    }
                }
            });
        }
    }
}
