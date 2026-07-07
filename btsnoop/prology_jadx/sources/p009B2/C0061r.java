package p009B2;

/* renamed from: B2.r */
/* loaded from: classes.dex */
public final class C0061r implements p047L2.InterfaceC0374d, p047L2.InterfaceC0376f, p200u3.InterfaceC2250d, p047L2.InterfaceC0372b, p047L2.InterfaceC0385o {

    /* renamed from: n */
    public static p009B2.C0061r f186n;

    /* renamed from: l */
    public final /* synthetic */ int f187l;

    /* renamed from: m */
    public java.lang.Object f188m;

    public /* synthetic */ C0061r(int i4, java.lang.Object obj) {
        this.f187l = i4;
        this.f188m = obj;
    }

    /* renamed from: i */
    public static p009B2.C0061r m262i() {
        if (f186n == null) {
            f186n = new p009B2.C0061r(3);
        }
        return f186n;
    }

    /* renamed from: j */
    private final void m263j(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        p008B1.C0026d c0026d = (p008B1.C0026d) this.f188m;
        if (((p043K2.InterfaceC0334j) c0026d.f100n) == null) {
            return;
        }
        java.lang.String str = c0384n.f1133a;
        str.getClass();
        java.lang.Object obj = c0384n.f1134b;
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1352294148:
                if (str.equals("create")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1019779949:
                if (str.equals("offset")) {
                    c4 = 1;
                    break;
                }
                break;
            case -934437708:
                if (str.equals("resize")) {
                    c4 = 2;
                    break;
                }
                break;
            case -756050293:
                if (str.equals("clearFocus")) {
                    c4 = 3;
                    break;
                }
                break;
            case -308988850:
                if (str.equals("synchronizeToNativeViewHierarchy")) {
                    c4 = 4;
                    break;
                }
                break;
            case 110550847:
                if (str.equals("touch")) {
                    c4 = 5;
                    break;
                }
                break;
            case 576796989:
                if (str.equals("setDirection")) {
                    c4 = 6;
                    break;
                }
                break;
            case 1671767583:
                if (str.equals("dispose")) {
                    c4 = 7;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                java.util.Map map = (java.util.Map) obj;
                boolean z4 = map.containsKey("hybrid") && ((java.lang.Boolean) map.get("hybrid")).booleanValue();
                java.nio.ByteBuffer wrap = map.containsKey("params") ? java.nio.ByteBuffer.wrap((byte[]) map.get("params")) : null;
                try {
                    if (z4) {
                        ((p043K2.InterfaceC0334j) c0026d.f100n).mo733e(new p043K2.C0331g(((java.lang.Integer) map.get("id")).intValue(), (java.lang.String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((java.lang.Integer) map.get("direction")).intValue(), 3, wrap));
                        c0335k.mo742b(null);
                        return;
                    }
                    boolean z5 = map.containsKey("hybridFallback") && ((java.lang.Boolean) map.get("hybridFallback")).booleanValue();
                    long mo739u = ((p043K2.InterfaceC0334j) c0026d.f100n).mo739u(new p043K2.C0331g(((java.lang.Integer) map.get("id")).intValue(), (java.lang.String) map.get("viewType"), map.containsKey("top") ? ((java.lang.Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((java.lang.Double) map.get("left")).doubleValue() : 0.0d, ((java.lang.Double) map.get("width")).doubleValue(), ((java.lang.Double) map.get("height")).doubleValue(), ((java.lang.Integer) map.get("direction")).intValue(), z5 ? 2 : 1, wrap));
                    if (mo739u != -2) {
                        c0335k.mo742b(java.lang.Long.valueOf(mo739u));
                        return;
                    } else {
                        if (!z5) {
                            throw new java.lang.AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                        }
                        c0335k.mo742b(null);
                        return;
                    }
                } catch (java.lang.IllegalStateException e4) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e4), null);
                    return;
                }
            case 1:
                java.util.Map map2 = (java.util.Map) obj;
                try {
                    ((p043K2.InterfaceC0334j) c0026d.f100n).mo737n(((java.lang.Integer) map2.get("id")).intValue(), ((java.lang.Double) map2.get("top")).doubleValue(), ((java.lang.Double) map2.get("left")).doubleValue());
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e5) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e5), null);
                    return;
                }
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.Map map3 = (java.util.Map) obj;
                try {
                    ((p043K2.InterfaceC0334j) c0026d.f100n).mo734i(new p043K2.C0333i(((java.lang.Integer) map3.get("id")).intValue(), ((java.lang.Double) map3.get("width")).doubleValue(), ((java.lang.Double) map3.get("height")).doubleValue()), new p017D1.C0173f(c0335k, 5));
                    return;
                } catch (java.lang.IllegalStateException e6) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e6), null);
                    return;
                }
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    ((p043K2.InterfaceC0334j) c0026d.f100n).mo732c(((java.lang.Integer) obj).intValue());
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e7) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e7), null);
                    return;
                }
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                try {
                    ((p043K2.InterfaceC0334j) c0026d.f100n).mo735k(((java.lang.Boolean) obj).booleanValue());
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e8) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e8), null);
                    return;
                }
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                java.util.List list = (java.util.List) obj;
                try {
                    ((p043K2.InterfaceC0334j) c0026d.f100n).mo736l(new p043K2.C0332h(((java.lang.Integer) list.get(0)).intValue(), (java.lang.Number) list.get(1), (java.lang.Number) list.get(2), ((java.lang.Integer) list.get(3)).intValue(), ((java.lang.Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((java.lang.Integer) list.get(7)).intValue(), ((java.lang.Integer) list.get(8)).intValue(), (float) ((java.lang.Double) list.get(9)).doubleValue(), (float) ((java.lang.Double) list.get(10)).doubleValue(), ((java.lang.Integer) list.get(11)).intValue(), ((java.lang.Integer) list.get(12)).intValue(), ((java.lang.Integer) list.get(13)).intValue(), ((java.lang.Integer) list.get(14)).intValue(), ((java.lang.Number) list.get(15)).longValue()));
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e9) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e9), null);
                    return;
                }
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.Map map4 = (java.util.Map) obj;
                try {
                    ((p043K2.InterfaceC0334j) c0026d.f100n).mo738o(((java.lang.Integer) map4.get("id")).intValue(), ((java.lang.Integer) map4.get("direction")).intValue());
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e10) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e10), null);
                    return;
                }
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    ((p043K2.InterfaceC0334j) c0026d.f100n).mo731A(((java.lang.Integer) ((java.util.Map) obj).get("id")).intValue());
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e11) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e11), null);
                    return;
                }
            default:
                c0335k.mo743c();
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: k */
    private final void m264k(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        char c4;
        p008B1.C0026d c0026d = (p008B1.C0026d) this.f188m;
        if (((io.flutter.plugin.platform.C1590m) c0026d.f100n) == null) {
            return;
        }
        java.lang.String str = c0384n.f1133a;
        str.getClass();
        java.lang.Object obj = c0384n.f1134b;
        switch (str.hashCode()) {
            case -1352294148:
                if (str.equals("create")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -756050293:
                if (str.equals("clearFocus")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 110550847:
                if (str.equals("touch")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 576796989:
                if (str.equals("setDirection")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 751366695:
                if (str.equals("isSurfaceControlEnabled")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 1671767583:
                if (str.equals("dispose")) {
                    c4 = 5;
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
                java.util.Map map = (java.util.Map) obj;
                java.nio.ByteBuffer wrap = map.containsKey("params") ? java.nio.ByteBuffer.wrap((byte[]) map.get("params")) : null;
                try {
                    int intValue = ((java.lang.Integer) map.get("id")).intValue();
                    java.lang.String str2 = (java.lang.String) map.get("viewType");
                    int intValue2 = ((java.lang.Integer) map.get("direction")).intValue();
                    io.flutter.plugin.platform.C1591n c1591n = (io.flutter.plugin.platform.C1591n) ((io.flutter.plugin.platform.C1590m) c0026d.f100n).f6591m;
                    p081U2.C0752b c0752b = (p081U2.C0752b) ((java.util.HashMap) c1591n.f6593l.f6591m).get(str2);
                    if (c0752b == null) {
                        throw new java.lang.IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                    }
                    java.lang.Object mo831a = wrap != null ? c0752b.f2612a.mo831a(wrap) : null;
                    android.app.Activity activity = c1591n.f6595n;
                    p078T2.C0730g c0730g = (p078T2.C0730g) mo831a;
                    java.util.Objects.requireNonNull(c0730g);
                    p081U2.C0751a c0751a = new p081U2.C0751a(activity, ((p078T2.AbstractC0735l) ((android.util.LongSparseArray) c0752b.f2613b.f219m).get(c0730g.f2528a.longValue())).f2540c);
                    android.view.SurfaceView surfaceView = c0751a.f2611a;
                    if (surfaceView == null) {
                        throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    }
                    surfaceView.setLayoutDirection(intValue2);
                    c1591n.f6601t.put(intValue, c0751a);
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e4) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e4), null);
                    return;
                }
            case 1:
                try {
                    ((io.flutter.plugin.platform.C1590m) c0026d.f100n).mo732c(((java.lang.Integer) obj).intValue());
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e5) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e5), null);
                    return;
                }
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.List list = (java.util.List) obj;
                try {
                    ((io.flutter.plugin.platform.C1590m) c0026d.f100n).mo736l(new p043K2.C0332h(((java.lang.Integer) list.get(0)).intValue(), (java.lang.Number) list.get(1), (java.lang.Number) list.get(2), ((java.lang.Integer) list.get(3)).intValue(), ((java.lang.Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((java.lang.Integer) list.get(7)).intValue(), ((java.lang.Integer) list.get(8)).intValue(), (float) ((java.lang.Double) list.get(9)).doubleValue(), (float) ((java.lang.Double) list.get(10)).doubleValue(), ((java.lang.Integer) list.get(11)).intValue(), ((java.lang.Integer) list.get(12)).intValue(), ((java.lang.Integer) list.get(13)).intValue(), ((java.lang.Integer) list.get(14)).intValue(), ((java.lang.Number) list.get(15)).longValue()));
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e6) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e6), null);
                    return;
                }
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                java.util.Map map2 = (java.util.Map) obj;
                try {
                    ((io.flutter.plugin.platform.C1590m) c0026d.f100n).mo738o(((java.lang.Integer) map2.get("id")).intValue(), ((java.lang.Integer) map2.get("direction")).intValue());
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e7) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e7), null);
                    return;
                }
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                io.flutter.embedding.engine.FlutterJNI flutterJNI = ((io.flutter.plugin.platform.C1591n) ((io.flutter.plugin.platform.C1590m) c0026d.f100n).f6591m).f6597p;
                c0335k.mo742b(java.lang.Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                try {
                    ((io.flutter.plugin.platform.C1590m) c0026d.f100n).mo731A(((java.lang.Integer) ((java.util.Map) obj).get("id")).intValue());
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.IllegalStateException e8) {
                    c0335k.mo741a("error", android.util.Log.getStackTraceString(e8), null);
                    return;
                }
            default:
                c0335k.mo743c();
                return;
        }
    }

    /* renamed from: l */
    private final void m265l(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        int i4 = 2;
        p009B2.C0061r c0061r = (p009B2.C0061r) this.f188m;
        if (((p063P2.C0528a) c0061r.f188m) == null) {
            return;
        }
        java.lang.String str = c0384n.f1133a;
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1937987631:
                if (str.equals("SensitiveContent.getContentSensitivity")) {
                    c4 = 0;
                    break;
                }
                break;
            case 598223325:
                if (str.equals("SensitiveContent.setContentSensitivity")) {
                    c4 = 1;
                    break;
                }
                break;
            case 1615625817:
                if (str.equals("SensitiveContent.isSupported")) {
                    c4 = 2;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                try {
                    int m1026g = ((p063P2.C0528a) c0061r.f188m).m1026g();
                    if (m1026g == 0) {
                        i4 = 0;
                    } else if (m1026g == 1) {
                        i4 = 1;
                    } else if (m1026g != 2) {
                        i4 = 3;
                    }
                    c0335k.mo742b(java.lang.Integer.valueOf(i4));
                    return;
                } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e4) {
                    c0335k.mo741a("error", e4.getMessage(), null);
                    return;
                }
            case 1:
                int intValue = ((java.lang.Integer) c0384n.f1134b).intValue();
                try {
                    p063P2.C0528a c0528a = (p063P2.C0528a) c0061r.f188m;
                    c0061r.getClass();
                    if (intValue == 0) {
                        i4 = 0;
                    } else if (intValue == 1) {
                        i4 = 1;
                    } else if (intValue != 2) {
                        throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m151j(intValue, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                    }
                    c0528a.m1032m(i4);
                    return;
                } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e5) {
                    c0335k.mo741a("error", e5.getMessage(), null);
                    return;
                }
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                ((p063P2.C0528a) c0061r.f188m).getClass();
                c0335k.mo742b(java.lang.Boolean.valueOf(android.os.Build.VERSION.SDK_INT >= 35));
                return;
            default:
                c0335k.mo743c();
                return;
        }
    }

    @Override // p200u3.InterfaceC2250d
    /* renamed from: C */
    public java.lang.Object mo266C(p200u3.InterfaceC2251e interfaceC2251e, p110b3.InterfaceC1190d interfaceC1190d) {
        java.lang.Object mo266C = ((p094Y.C0886x) this.f188m).mo266C(new p035I.C0298t(interfaceC2251e, 0), interfaceC1190d);
        return mo266C == p115c3.EnumC1252a.f4880l ? mo266C : p100Z2.C0934g.f3298a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031d A[Catch: JSONException -> 0x01cf, TryCatch #21 {JSONException -> 0x01cf, blocks: (B:113:0x01b9, B:114:0x01bf, B:118:0x0271, B:120:0x0276, B:122:0x02a7, B:125:0x02cd, B:127:0x02c0, B:130:0x02c7, B:131:0x02dc, B:133:0x0302, B:143:0x0306, B:136:0x0313, B:138:0x031d, B:140:0x032a, B:145:0x030b, B:146:0x032f, B:148:0x0341, B:150:0x0349, B:152:0x0351, B:154:0x0365, B:155:0x0368, B:157:0x038f, B:159:0x039f, B:187:0x0488, B:162:0x04a2, B:164:0x04b2, B:165:0x04c5, B:168:0x04c2, B:198:0x0386, B:231:0x03f7, B:212:0x0415, B:184:0x045b, B:205:0x0480, B:191:0x049a, B:170:0x04ca, B:233:0x01c4, B:236:0x01d2, B:239:0x01dd, B:242:0x01e9, B:245:0x01f5, B:248:0x0200, B:251:0x020b, B:254:0x0215, B:257:0x021f, B:260:0x0229, B:263:0x0233, B:266:0x023d, B:269:0x0248, B:272:0x0253, B:275:0x025e, B:173:0x041e, B:175:0x0428, B:176:0x042b, B:178:0x0443, B:179:0x0455, B:182:0x044c), top: B:112:0x01b9, inners: #1, #5, #6, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032a A[Catch: JSONException -> 0x01cf, TryCatch #21 {JSONException -> 0x01cf, blocks: (B:113:0x01b9, B:114:0x01bf, B:118:0x0271, B:120:0x0276, B:122:0x02a7, B:125:0x02cd, B:127:0x02c0, B:130:0x02c7, B:131:0x02dc, B:133:0x0302, B:143:0x0306, B:136:0x0313, B:138:0x031d, B:140:0x032a, B:145:0x030b, B:146:0x032f, B:148:0x0341, B:150:0x0349, B:152:0x0351, B:154:0x0365, B:155:0x0368, B:157:0x038f, B:159:0x039f, B:187:0x0488, B:162:0x04a2, B:164:0x04b2, B:165:0x04c5, B:168:0x04c2, B:198:0x0386, B:231:0x03f7, B:212:0x0415, B:184:0x045b, B:205:0x0480, B:191:0x049a, B:170:0x04ca, B:233:0x01c4, B:236:0x01d2, B:239:0x01dd, B:242:0x01e9, B:245:0x01f5, B:248:0x0200, B:251:0x020b, B:254:0x0215, B:257:0x021f, B:260:0x0229, B:263:0x0233, B:266:0x023d, B:269:0x0248, B:272:0x0253, B:275:0x025e, B:173:0x041e, B:175:0x0428, B:176:0x042b, B:178:0x0443, B:179:0x0455, B:182:0x044c), top: B:112:0x01b9, inners: #1, #5, #6, #11 }] */
    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo42I(p047L2.C0384n r13, p043K2.C0335k r14) {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009B2.C0061r.mo42I(L2.n, K2.k):void");
    }

    @Override // p047L2.InterfaceC0374d
    /* renamed from: R */
    public void mo103R(java.nio.ByteBuffer byteBuffer, p018D2.C0181g c0181g) {
        p047L2.C0393w.f1140b.getClass();
        p047L2.C0393w.m852c(byteBuffer);
        ((p018D2.C0176b) this.f188m).getClass();
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: a */
    public void mo267a(java.lang.String str, java.nio.ByteBuffer byteBuffer, p047L2.InterfaceC0375e interfaceC0375e) {
        ((p018D2.C0184j) this.f188m).mo267a(str, byteBuffer, interfaceC0375e);
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: b */
    public p025F1.C0215g mo268b(p047L2.C0382l c0382l) {
        return ((p018D2.C0184j) this.f188m).mo268b(c0382l);
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: c */
    public void mo269c(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        ((p018D2.C0184j) this.f188m).mo267a(str, byteBuffer, null);
    }

    @Override // p047L2.InterfaceC0372b
    /* renamed from: e */
    public void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
        android.support.v4.media.session.C1061t c1061t = (android.support.v4.media.session.C1061t) this.f188m;
        if (((io.flutter.view.C1604a) c1061t.f3863o) == null) {
            c0026d.mo106e(null);
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) obj;
        java.lang.String str = (java.lang.String) hashMap.get("type");
        java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get("data");
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1140076541:
                if (str.equals("tooltip")) {
                    c4 = 0;
                    break;
                }
                break;
            case -649620375:
                if (str.equals("announce")) {
                    c4 = 1;
                    break;
                }
                break;
            case 114595:
                if (str.equals("tap")) {
                    c4 = 2;
                    break;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c4 = 3;
                    break;
                }
                break;
            case 114203431:
                if (str.equals("longPress")) {
                    c4 = 4;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                java.lang.String str2 = (java.lang.String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.C1604a c1604a = (io.flutter.view.C1604a) c1061t.f3863o;
                    if (android.os.Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.C1610g c1610g = (io.flutter.view.C1610g) c1604a.f6662a;
                        android.view.accessibility.AccessibilityEvent m3562e = c1610g.m3562e(0, 32);
                        m3562e.getText().add(str2);
                        c1610g.m3566i(m3562e);
                        break;
                    } else {
                        c1604a.getClass();
                        break;
                    }
                }
                break;
            case 1:
                java.lang.String str3 = (java.lang.String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.C1604a c1604a2 = (io.flutter.view.C1604a) c1061t.f3863o;
                    if (android.os.Build.VERSION.SDK_INT >= 36) {
                        c1604a2.getClass();
                        android.util.Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.C1610g) c1604a2.f6662a).f6752a.announceForAccessibility(str3);
                    break;
                }
                break;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Integer num = (java.lang.Integer) hashMap.get("nodeId");
                if (num != null) {
                    ((io.flutter.view.C1610g) ((io.flutter.view.C1604a) c1061t.f3863o).f6662a).m3565h(num.intValue(), 1);
                    break;
                }
                break;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Integer num2 = (java.lang.Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    ((io.flutter.view.C1610g) ((io.flutter.view.C1604a) c1061t.f3863o).f6662a).m3565h(num2.intValue(), 8);
                    break;
                }
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Integer num3 = (java.lang.Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    ((io.flutter.view.C1610g) ((io.flutter.view.C1604a) c1061t.f3863o).f6662a).m3565h(num3.intValue(), 2);
                    break;
                }
                break;
        }
        c0026d.mo106e(null);
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: f */
    public void mo271f(java.lang.String str, p047L2.InterfaceC0374d interfaceC0374d, p025F1.C0215g c0215g) {
        ((p018D2.C0184j) this.f188m).mo271f(str, interfaceC0374d, c0215g);
    }

    @Override // p047L2.InterfaceC0376f
    /* renamed from: g */
    public void mo272g(java.lang.String str, p047L2.InterfaceC0374d interfaceC0374d) {
        ((p018D2.C0184j) this.f188m).mo271f(str, interfaceC0374d, null);
    }

    /* renamed from: h */
    public p035I.AbstractC0277b0 m273h() {
        p200u3.C2263q c2263q = (p200u3.C2263q) this.f188m;
        c2263q.getClass();
        p124e2.C1358f c1358f = p205v3.AbstractC2296l.f9086a;
        java.lang.Object obj = p200u3.C2263q.f8999p.get(c2263q);
        if (obj == c1358f) {
            obj = null;
        }
        return (p035I.AbstractC0277b0) obj;
    }

    /* renamed from: m */
    public void m274m(java.lang.String str, p013C2.C0138c c0138c) {
        java.util.HashMap hashMap = (java.util.HashMap) this.f188m;
        if (c0138c != null) {
            hashMap.put(str, c0138c);
        } else {
            hashMap.remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f830a > r3.f830a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m275n(p035I.AbstractC0277b0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            p154k3.AbstractC1803h.m3779e(r7, r0)
        L5:
            java.lang.Object r0 = r6.f188m
            u3.q r0 = (p200u3.C2263q) r0
            r0.getClass()
            e2.f r1 = p205v3.AbstractC2296l.f9086a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p200u3.C2263q.f8999p
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L17
            r2 = 0
        L17:
            r3 = r2
            I.b0 r3 = (p035I.AbstractC0277b0) r3
            boolean r4 = r3 instanceof p035I.C0268U
            if (r4 == 0) goto L20
            r4 = 1
            goto L26
        L20:
            I.c0 r4 = p035I.C0279c0.f833b
            boolean r4 = p154k3.AbstractC1803h.m3775a(r3, r4)
        L26:
            if (r4 == 0) goto L29
            goto L33
        L29:
            boolean r4 = r3 instanceof p035I.C0278c
            if (r4 == 0) goto L35
            int r4 = r3.f830a
            int r5 = r7.f830a
            if (r5 <= r4) goto L39
        L33:
            r3 = r7
            goto L39
        L35:
            boolean r4 = r3 instanceof p035I.C0266S
            if (r4 == 0) goto L47
        L39:
            if (r2 != 0) goto L3c
            r2 = r1
        L3c:
            if (r3 != 0) goto L3f
            goto L40
        L3f:
            r1 = r3
        L40:
            boolean r0 = r0.m4449b(r2, r1)
            if (r0 == 0) goto L5
            return
        L47:
            I1.a r7 = new I1.a
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p009B2.C0061r.m275n(I.b0):void");
    }

    public /* synthetic */ C0061r(int i4, boolean z4) {
        this.f187l = i4;
    }

    public C0061r(p018D2.C0176b c0176b, int i4) {
        this.f187l = i4;
        switch (i4) {
            case 25:
                new p035I.C0291m(c0176b, "flutter/scribe", p047L2.C0382l.f1132a, null).m702s(new p009B2.C0061r(24, this));
                return;
            case 26:
            case 28:
            default:
                new p035I.C0291m(c0176b, "flutter/mousecursor", p047L2.C0392v.f1138a, null).m702s(new p009B2.C0061r(17, this));
                return;
            case 27:
                new p035I.C0291m(c0176b, "flutter/sensitivecontent", p047L2.C0392v.f1138a, null).m702s(new p009B2.C0061r(26, this));
                return;
            case 29:
                new p035I.C0291m(c0176b, "flutter/spellcheck", p047L2.C0392v.f1138a, null).m702s(new p009B2.C0061r(28, this));
                return;
        }
    }

    public C0061r(int i4) {
        this.f187l = i4;
        switch (i4) {
            case 10:
                this.f188m = new java.util.concurrent.atomic.AtomicInteger(0);
                return;
            case 11:
            default:
                this.f188m = new java.util.HashMap();
                return;
            case 12:
                this.f188m = new p200u3.C2263q(p035I.C0279c0.f833b);
                return;
        }
    }

    public C0061r(p047L2.InterfaceC0376f interfaceC0376f) {
        this.f187l = 15;
        new p035I.C0291m(interfaceC0376f, "flutter/keyboard", p047L2.C0392v.f1138a, null).m702s(new p008B1.C0026d(this));
    }
}
