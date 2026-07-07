package B2;

import I.C0044m;
import I.C0050t;
import I.b0;
import I.c0;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.SurfaceView;
import android.view.accessibility.AccessibilityEvent;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class r implements L2.d, L2.f, u3.d, L2.b, L2.o {

    /* renamed from: n, reason: collision with root package name */
    public static r f183n;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f184l;

    /* renamed from: m, reason: collision with root package name */
    public Object f185m;

    public /* synthetic */ r(int i4, Object obj) {
        this.f184l = i4;
        this.f185m = obj;
    }

    public static r i() {
        if (f183n == null) {
            f183n = new r(3);
        }
        return f183n;
    }

    private final void j(L2.n nVar, K2.k kVar) {
        B1.d dVar = (B1.d) this.f185m;
        if (((K2.j) dVar.f97n) == null) {
            return;
        }
        String str = nVar.f1094a;
        str.getClass();
        Object obj = nVar.f1095b;
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
                Map map = (Map) obj;
                boolean z4 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                try {
                    if (z4) {
                        ((K2.j) dVar.f97n).e(new K2.g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                        kVar.b(null);
                        return;
                    }
                    boolean z5 = map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue();
                    long u4 = ((K2.j) dVar.f97n).u(new K2.g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z5 ? 2 : 1, wrap));
                    if (u4 != -2) {
                        kVar.b(Long.valueOf(u4));
                        return;
                    } else {
                        if (!z5) {
                            throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                        }
                        kVar.b(null);
                        return;
                    }
                } catch (IllegalStateException e4) {
                    kVar.a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case 1:
                Map map2 = (Map) obj;
                try {
                    ((K2.j) dVar.f97n).n(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e5) {
                    kVar.a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                Map map3 = (Map) obj;
                try {
                    ((K2.j) dVar.f97n).i(new K2.i(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new D1.f(kVar, 5));
                    return;
                } catch (IllegalStateException e6) {
                    kVar.a("error", Log.getStackTraceString(e6), null);
                    return;
                }
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    ((K2.j) dVar.f97n).c(((Integer) obj).intValue());
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e7) {
                    kVar.a("error", Log.getStackTraceString(e7), null);
                    return;
                }
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                try {
                    ((K2.j) dVar.f97n).k(((Boolean) obj).booleanValue());
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e8) {
                    kVar.a("error", Log.getStackTraceString(e8), null);
                    return;
                }
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                List list = (List) obj;
                try {
                    ((K2.j) dVar.f97n).l(new K2.h(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e9) {
                    kVar.a("error", Log.getStackTraceString(e9), null);
                    return;
                }
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                Map map4 = (Map) obj;
                try {
                    ((K2.j) dVar.f97n).o(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e10) {
                    kVar.a("error", Log.getStackTraceString(e10), null);
                    return;
                }
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    ((K2.j) dVar.f97n).A(((Integer) ((Map) obj).get("id")).intValue());
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e11) {
                    kVar.a("error", Log.getStackTraceString(e11), null);
                    return;
                }
            default:
                kVar.c();
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void k(L2.n nVar, K2.k kVar) {
        char c4;
        B1.d dVar = (B1.d) this.f185m;
        if (((io.flutter.plugin.platform.m) dVar.f97n) == null) {
            return;
        }
        String str = nVar.f1094a;
        str.getClass();
        Object obj = nVar.f1095b;
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
                Map map = (Map) obj;
                ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                try {
                    int intValue = ((Integer) map.get("id")).intValue();
                    String str2 = (String) map.get("viewType");
                    int intValue2 = ((Integer) map.get("direction")).intValue();
                    io.flutter.plugin.platform.n nVar2 = (io.flutter.plugin.platform.n) ((io.flutter.plugin.platform.m) dVar.f97n).f6356m;
                    U2.b bVar = (U2.b) ((HashMap) nVar2.f6358l.f6356m).get(str2);
                    if (bVar == null) {
                        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                    }
                    Object a4 = wrap != null ? bVar.f2524a.a(wrap) : null;
                    Activity activity = nVar2.f6360n;
                    T2.g gVar = (T2.g) a4;
                    Objects.requireNonNull(gVar);
                    U2.a aVar = new U2.a(activity, ((T2.l) ((LongSparseArray) bVar.f2525b.f214m).get(gVar.f2441a.longValue())).f2453c);
                    SurfaceView surfaceView = aVar.f2523a;
                    if (surfaceView == null) {
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    }
                    surfaceView.setLayoutDirection(intValue2);
                    nVar2.f6365t.put(intValue, aVar);
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e4) {
                    kVar.a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case 1:
                try {
                    ((io.flutter.plugin.platform.m) dVar.f97n).c(((Integer) obj).intValue());
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e5) {
                    kVar.a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                List list = (List) obj;
                try {
                    ((io.flutter.plugin.platform.m) dVar.f97n).l(new K2.h(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e6) {
                    kVar.a("error", Log.getStackTraceString(e6), null);
                    return;
                }
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                Map map2 = (Map) obj;
                try {
                    ((io.flutter.plugin.platform.m) dVar.f97n).o(((Integer) map2.get("id")).intValue(), ((Integer) map2.get("direction")).intValue());
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e7) {
                    kVar.a("error", Log.getStackTraceString(e7), null);
                    return;
                }
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.n) ((io.flutter.plugin.platform.m) dVar.f97n).f6356m).f6362p;
                kVar.b(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                try {
                    ((io.flutter.plugin.platform.m) dVar.f97n).A(((Integer) ((Map) obj).get("id")).intValue());
                    kVar.b(null);
                    return;
                } catch (IllegalStateException e8) {
                    kVar.a("error", Log.getStackTraceString(e8), null);
                    return;
                }
            default:
                kVar.c();
                return;
        }
    }

    private final void l(L2.n nVar, K2.k kVar) {
        int i4 = 2;
        r rVar = (r) this.f185m;
        if (((P2.a) rVar.f185m) == null) {
            return;
        }
        String str = nVar.f1094a;
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
                    int g4 = ((P2.a) rVar.f185m).g();
                    if (g4 == 0) {
                        i4 = 0;
                    } else if (g4 == 1) {
                        i4 = 1;
                    } else if (g4 != 2) {
                        i4 = 3;
                    }
                    kVar.b(Integer.valueOf(i4));
                    return;
                } catch (IllegalArgumentException | IllegalStateException e4) {
                    kVar.a("error", e4.getMessage(), null);
                    return;
                }
            case 1:
                int intValue = ((Integer) nVar.f1095b).intValue();
                try {
                    P2.a aVar = (P2.a) rVar.f185m;
                    rVar.getClass();
                    if (intValue == 0) {
                        i4 = 0;
                    } else if (intValue == 1) {
                        i4 = 1;
                    } else if (intValue != 2) {
                        throw new IllegalArgumentException(AbstractC0007h.j(intValue, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                    }
                    aVar.m(i4);
                    return;
                } catch (IllegalArgumentException | IllegalStateException e5) {
                    kVar.a("error", e5.getMessage(), null);
                    return;
                }
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                ((P2.a) rVar.f185m).getClass();
                kVar.b(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                return;
            default:
                kVar.c();
                return;
        }
    }

    @Override // u3.d
    public Object C(u3.e eVar, InterfaceC0190d interfaceC0190d) {
        Object C4 = ((Y.x) this.f185m).C(new C0050t(eVar, 0), interfaceC0190d);
        return C4 == EnumC0225a.f4710l ? C4 : Z2.g.f3186a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031d A[Catch: JSONException -> 0x01cf, TryCatch #21 {JSONException -> 0x01cf, blocks: (B:113:0x01b9, B:114:0x01bf, B:118:0x0271, B:120:0x0276, B:122:0x02a7, B:125:0x02cd, B:127:0x02c0, B:130:0x02c7, B:131:0x02dc, B:133:0x0302, B:143:0x0306, B:136:0x0313, B:138:0x031d, B:140:0x032a, B:145:0x030b, B:146:0x032f, B:148:0x0341, B:150:0x0349, B:152:0x0351, B:154:0x0365, B:155:0x0368, B:157:0x038f, B:159:0x039f, B:187:0x0488, B:162:0x04a2, B:164:0x04b2, B:165:0x04c5, B:168:0x04c2, B:198:0x0386, B:231:0x03f7, B:212:0x0415, B:184:0x045b, B:205:0x0480, B:191:0x049a, B:170:0x04ca, B:233:0x01c4, B:236:0x01d2, B:239:0x01dd, B:242:0x01e9, B:245:0x01f5, B:248:0x0200, B:251:0x020b, B:254:0x0215, B:257:0x021f, B:260:0x0229, B:263:0x0233, B:266:0x023d, B:269:0x0248, B:272:0x0253, B:275:0x025e, B:173:0x041e, B:175:0x0428, B:176:0x042b, B:178:0x0443, B:179:0x0455, B:182:0x044c), top: B:112:0x01b9, inners: #1, #5, #6, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032a A[Catch: JSONException -> 0x01cf, TryCatch #21 {JSONException -> 0x01cf, blocks: (B:113:0x01b9, B:114:0x01bf, B:118:0x0271, B:120:0x0276, B:122:0x02a7, B:125:0x02cd, B:127:0x02c0, B:130:0x02c7, B:131:0x02dc, B:133:0x0302, B:143:0x0306, B:136:0x0313, B:138:0x031d, B:140:0x032a, B:145:0x030b, B:146:0x032f, B:148:0x0341, B:150:0x0349, B:152:0x0351, B:154:0x0365, B:155:0x0368, B:157:0x038f, B:159:0x039f, B:187:0x0488, B:162:0x04a2, B:164:0x04b2, B:165:0x04c5, B:168:0x04c2, B:198:0x0386, B:231:0x03f7, B:212:0x0415, B:184:0x045b, B:205:0x0480, B:191:0x049a, B:170:0x04ca, B:233:0x01c4, B:236:0x01d2, B:239:0x01dd, B:242:0x01e9, B:245:0x01f5, B:248:0x0200, B:251:0x020b, B:254:0x0215, B:257:0x021f, B:260:0x0229, B:263:0x0233, B:266:0x023d, B:269:0x0248, B:272:0x0253, B:275:0x025e, B:173:0x041e, B:175:0x0428, B:176:0x042b, B:178:0x0443, B:179:0x0455, B:182:0x044c), top: B:112:0x01b9, inners: #1, #5, #6, #11 }] */
    @Override // L2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(L2.n r13, K2.k r14) {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.r.I(L2.n, K2.k):void");
    }

    @Override // L2.d
    public void R(ByteBuffer byteBuffer, D2.g gVar) {
        L2.w.f1101b.getClass();
        L2.w.c(byteBuffer);
        ((D2.b) this.f185m).getClass();
    }

    @Override // L2.f
    public void a(String str, ByteBuffer byteBuffer, L2.e eVar) {
        ((D2.j) this.f185m).a(str, byteBuffer, eVar);
    }

    @Override // L2.f
    public F1.g b(L2.l lVar) {
        return ((D2.j) this.f185m).b(lVar);
    }

    @Override // L2.f
    public void c(String str, ByteBuffer byteBuffer) {
        ((D2.j) this.f185m).a(str, byteBuffer, null);
    }

    @Override // L2.b
    public void e(Object obj, B1.d dVar) {
        android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f185m;
        if (((io.flutter.view.a) tVar.f3736o) == null) {
            dVar.e(null);
            return;
        }
        HashMap hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        HashMap hashMap2 = (HashMap) hashMap.get("data");
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
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.a aVar = (io.flutter.view.a) tVar.f3736o;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.g gVar = (io.flutter.view.g) aVar.f6423a;
                        AccessibilityEvent e4 = gVar.e(0, 32);
                        e4.getText().add(str2);
                        gVar.i(e4);
                        break;
                    } else {
                        aVar.getClass();
                        break;
                    }
                }
                break;
            case 1:
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) tVar.f3736o;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.g) aVar2.f6423a).f6507a.announceForAccessibility(str3);
                    break;
                }
                break;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    ((io.flutter.view.g) ((io.flutter.view.a) tVar.f3736o).f6423a).h(num.intValue(), 1);
                    break;
                }
                break;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    ((io.flutter.view.g) ((io.flutter.view.a) tVar.f3736o).f6423a).h(num2.intValue(), 8);
                    break;
                }
                break;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    ((io.flutter.view.g) ((io.flutter.view.a) tVar.f3736o).f6423a).h(num3.intValue(), 2);
                    break;
                }
                break;
        }
        dVar.e(null);
    }

    @Override // L2.f
    public void f(String str, L2.d dVar, F1.g gVar) {
        ((D2.j) this.f185m).f(str, dVar, gVar);
    }

    @Override // L2.f
    public void g(String str, L2.d dVar) {
        ((D2.j) this.f185m).f(str, dVar, null);
    }

    public b0 h() {
        u3.q qVar = (u3.q) this.f185m;
        qVar.getClass();
        e2.f fVar = v3.l.f8732a;
        Object obj = u3.q.f8649p.get(qVar);
        if (obj == fVar) {
            obj = null;
        }
        return (b0) obj;
    }

    public void m(String str, C2.c cVar) {
        HashMap hashMap = (HashMap) this.f185m;
        if (cVar != null) {
            hashMap.put(str, cVar);
        } else {
            hashMap.remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f805a > r3.f805a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(I.b0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            k3.h.e(r7, r0)
        L5:
            java.lang.Object r0 = r6.f185m
            u3.q r0 = (u3.q) r0
            r0.getClass()
            e2.f r1 = v3.l.f8732a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = u3.q.f8649p
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L17
            r2 = 0
        L17:
            r3 = r2
            I.b0 r3 = (I.b0) r3
            boolean r4 = r3 instanceof I.U
            if (r4 == 0) goto L20
            r4 = 1
            goto L26
        L20:
            I.c0 r4 = I.c0.f808b
            boolean r4 = k3.h.a(r3, r4)
        L26:
            if (r4 == 0) goto L29
            goto L33
        L29:
            boolean r4 = r3 instanceof I.C0034c
            if (r4 == 0) goto L35
            int r4 = r3.f805a
            int r5 = r7.f805a
            if (r5 <= r4) goto L39
        L33:
            r3 = r7
            goto L39
        L35:
            boolean r4 = r3 instanceof I.S
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
            boolean r0 = r0.b(r2, r1)
            if (r0 == 0) goto L5
            return
        L47:
            I1.a r7 = new I1.a
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.r.n(I.b0):void");
    }

    public /* synthetic */ r(int i4, boolean z4) {
        this.f184l = i4;
    }

    public r(D2.b bVar, int i4) {
        this.f184l = i4;
        switch (i4) {
            case 25:
                new C0044m(bVar, "flutter/scribe", L2.l.f1093a, null).s(new r(24, this));
                return;
            case 26:
            case 28:
            default:
                new C0044m(bVar, "flutter/mousecursor", L2.v.f1099a, null).s(new r(17, this));
                return;
            case 27:
                new C0044m(bVar, "flutter/sensitivecontent", L2.v.f1099a, null).s(new r(26, this));
                return;
            case 29:
                new C0044m(bVar, "flutter/spellcheck", L2.v.f1099a, null).s(new r(28, this));
                return;
        }
    }

    public r(int i4) {
        this.f184l = i4;
        switch (i4) {
            case 10:
                this.f185m = new AtomicInteger(0);
                return;
            case 11:
            default:
                this.f185m = new HashMap();
                return;
            case 12:
                this.f185m = new u3.q(c0.f808b);
                return;
        }
    }

    public r(L2.f fVar) {
        this.f184l = 15;
        new C0044m(fVar, "flutter/keyboard", L2.v.f1099a, null).s(new B1.d(this));
    }
}
