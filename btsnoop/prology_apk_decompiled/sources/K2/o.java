package K2;

import B2.D;
import B2.u;
import C.AbstractC0031s;
import C.C0023j;
import C.O;
import I.C0050t;
import I.InterfaceC0039h;
import T.AbstractC0082c;
import T.AbstractC0083d;
import T.AbstractC0086g;
import T.B;
import T.C0084e;
import T.C0088i;
import T.I;
import W.y;
import Y.x;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.t;
import android.util.SparseArray;
import android.view.PointerIcon;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import b3.InterfaceC0190d;
import c0.C0215n;
import c0.M;
import c0.RunnableC0214m;
import c3.EnumC0225a;
import d2.C0241d;
import f2.C0299v;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import n.C0442e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y0.E;

/* loaded from: classes.dex */
public final class o implements L2.o, InterfaceC0039h, N1.j, u3.d, V0.d, d0.h {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1008l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1009m;

    public /* synthetic */ o(int i4, Object obj) {
        this.f1008l = i4;
        this.f1009m = obj;
    }

    public static f0.b m(U1.a aVar) {
        new x(0, (byte) 0);
        aVar.getClass();
        new HashMap();
        throw null;
    }

    public void A(String str, List list, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        M(3, bundle3);
    }

    @Override // V0.d
    public long B(int i4) {
        W.a.e(i4 == 0);
        return 0L;
    }

    @Override // u3.d
    public Object C(u3.e eVar, InterfaceC0190d interfaceC0190d) {
        Object C4 = ((u3.d) this.f1009m).C(new C0050t(eVar, 1), interfaceC0190d);
        return C4 == EnumC0225a.f4710l ? C4 : Z2.g.f3186a;
    }

    @Override // d0.h
    public long D(long j4, long j5) {
        return -9223372036854775807L;
    }

    @Override // d0.h
    public e0.j E(long j4) {
        return (e0.j) this.f1009m;
    }

    public void F(String str, Bitmap bitmap) {
        C0442e c0442e = MediaMetadataCompat.f3644o;
        if (!c0442e.containsKey(str) || ((Integer) c0442e.get(str)).intValue() == 2) {
            ((Bundle) this.f1009m).putParcelable(str, bitmap);
            return;
        }
        throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
    }

    public void G(String str, long j4) {
        C0442e c0442e = MediaMetadataCompat.f3644o;
        if (!c0442e.containsKey(str) || ((Integer) c0442e.get(str)).intValue() == 0) {
            ((Bundle) this.f1009m).putLong(str, j4);
            return;
        }
        throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
    }

    public void H(String str, String str2) {
        C0442e c0442e = MediaMetadataCompat.f3644o;
        if (!c0442e.containsKey(str) || ((Integer) c0442e.get(str)).intValue() == 1) {
            ((Bundle) this.f1009m).putCharSequence(str, str2);
            return;
        }
        throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // L2.o
    public void I(L2.n nVar, k kVar) {
        char c4;
        Bundle bundle;
        B1.d dVar = (B1.d) this.f1009m;
        if (((io.flutter.plugin.editing.j) dVar.f97n) == null) {
            return;
        }
        String str = nVar.f1094a;
        str.getClass();
        Object obj = nVar.f1095b;
        switch (str.hashCode()) {
            case -1779068172:
                if (str.equals("TextInput.setPlatformViewClient")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1015421462:
                if (str.equals("TextInput.setEditingState")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -37561188:
                if (str.equals("TextInput.setClient")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 270476819:
                if (str.equals("TextInput.hide")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 270803918:
                if (str.equals("TextInput.show")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 649192816:
                if (str.equals("TextInput.sendAppPrivateCommand")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 1204752139:
                if (str.equals("TextInput.setEditableSizeAndTransform")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 1727570905:
                if (str.equals("TextInput.finishAutofillContext")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 1904427655:
                if (str.equals("TextInput.clearClient")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 2113369584:
                if (str.equals("TextInput.requestAutofill")) {
                    c4 = '\t';
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
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    int i4 = jSONObject.getInt("platformViewId");
                    boolean optBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                    io.flutter.plugin.editing.k kVar2 = ((io.flutter.plugin.editing.j) dVar.f97n).f6299a;
                    if (optBoolean) {
                        View view = kVar2.f6300a;
                        view.requestFocus();
                        kVar2.f6304e = new C0023j(3, i4, 5);
                        kVar2.f6301b.restartInput(view);
                        kVar2.f6308i = false;
                    } else {
                        kVar2.getClass();
                        kVar2.f6304e = new C0023j(4, i4, 5);
                        kVar2.f6309j = null;
                    }
                    kVar.b(null);
                    return;
                } catch (JSONException e4) {
                    kVar.a("error", e4.getMessage(), null);
                    return;
                }
            case 1:
                try {
                    ((io.flutter.plugin.editing.j) dVar.f97n).c(r.a((JSONObject) obj));
                    kVar.b(null);
                    return;
                } catch (JSONException e5) {
                    kVar.a("error", e5.getMessage(), null);
                    return;
                }
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    JSONArray jSONArray = (JSONArray) obj;
                    ((io.flutter.plugin.editing.j) dVar.f97n).a(jSONArray.getInt(0), p.a(jSONArray.getJSONObject(1)));
                    kVar.b(null);
                    return;
                } catch (NoSuchFieldException | JSONException e6) {
                    kVar.a("error", e6.getMessage(), null);
                    return;
                }
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                io.flutter.plugin.editing.k kVar3 = ((io.flutter.plugin.editing.j) dVar.f97n).f6299a;
                if (kVar3.f6304e.f320b == 4) {
                    kVar3.d();
                } else {
                    kVar3.d();
                    kVar3.f6301b.hideSoftInputFromWindow(kVar3.f6300a.getApplicationWindowToken(), 0);
                }
                kVar.b(null);
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                io.flutter.plugin.editing.k kVar4 = ((io.flutter.plugin.editing.j) dVar.f97n).f6299a;
                View view2 = kVar4.f6300a;
                p pVar = kVar4.f6305f;
                InputMethodManager inputMethodManager = kVar4.f6301b;
                if (pVar == null || pVar.f1016g.f1023a != 11) {
                    view2.requestFocus();
                    inputMethodManager.showSoftInput(view2, 0);
                } else {
                    kVar4.d();
                    inputMethodManager.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                }
                kVar.b(null);
                return;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    String string = jSONObject2.getString("action");
                    String string2 = jSONObject2.getString("data");
                    if (string2 == null || string2.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("data", string2);
                    }
                    io.flutter.plugin.editing.k kVar5 = ((io.flutter.plugin.editing.j) dVar.f97n).f6299a;
                    kVar5.f6301b.sendAppPrivateCommand(kVar5.f6300a, string, bundle);
                    kVar.b(null);
                    return;
                } catch (JSONException e7) {
                    kVar.a("error", e7.getMessage(), null);
                    return;
                }
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    JSONObject jSONObject3 = (JSONObject) obj;
                    double d4 = jSONObject3.getDouble("width");
                    double d5 = jSONObject3.getDouble("height");
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                    double[] dArr = new double[16];
                    for (int i5 = 0; i5 < 16; i5++) {
                        dArr[i5] = jSONArray2.getDouble(i5);
                    }
                    ((io.flutter.plugin.editing.j) dVar.f97n).b(d4, d5, dArr);
                    kVar.b(null);
                    return;
                } catch (JSONException e8) {
                    kVar.a("error", e8.getMessage(), null);
                    return;
                }
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) dVar.f97n;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AutofillManager autofillManager = jVar.f6299a.f6302c;
                if (autofillManager != null) {
                    if (booleanValue) {
                        autofillManager.commit();
                    } else {
                        autofillManager.cancel();
                    }
                }
                kVar.b(null);
                return;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                io.flutter.plugin.editing.k kVar6 = ((io.flutter.plugin.editing.j) dVar.f97n).f6299a;
                if (kVar6.f6304e.f320b != 3) {
                    kVar6.f6307h.e(kVar6);
                    kVar6.d();
                    kVar6.f6305f = null;
                    kVar6.f6306g = null;
                    kVar6.f6304e = new C0023j(1, 0, 5);
                    kVar6.f6312m = null;
                    Field field = C.x.f330a;
                    View view3 = kVar6.f6300a;
                    O a4 = AbstractC0031s.a(view3);
                    if (a4 != null && !a4.f296a.n(8)) {
                        kVar6.f6301b.restartInput(view3);
                    }
                }
                kVar.b(null);
                return;
            case '\t':
                io.flutter.plugin.editing.k kVar7 = ((io.flutter.plugin.editing.j) dVar.f97n).f6299a;
                AutofillManager autofillManager2 = kVar7.f6302c;
                if (autofillManager2 != null && kVar7.f6306g != null) {
                    String str2 = (String) kVar7.f6305f.f1019j.f847l;
                    int[] iArr = new int[2];
                    View view4 = kVar7.f6300a;
                    view4.getLocationOnScreen(iArr);
                    Rect rect = new Rect(kVar7.f6312m);
                    rect.offset(iArr[0], iArr[1]);
                    autofillManager2.notifyViewEntered(view4, str2.hashCode(), rect);
                }
                kVar.b(null);
                return;
            default:
                kVar.c();
                return;
        }
    }

    @Override // N1.j
    public void J(Object obj, Object obj2) {
        Object obj3 = this.f1009m;
        switch (this.f1008l) {
            case 11:
                C0241d c0241d = (C0241d) obj2;
                Q1.a aVar = (Q1.a) ((Q1.d) obj).q();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(aVar.f2813e);
                int i4 = W1.c.f2815a;
                O1.j jVar = (O1.j) obj3;
                if (jVar == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                }
                try {
                    aVar.f2812d.transact(1, obtain, null, 1);
                    obtain.recycle();
                    c0241d.a(null);
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                Y1.x xVar = (Y1.x) ((Y1.i) obj).q();
                Y1.e eVar = new Y1.e(0, (C0241d) obj2);
                Parcel K3 = xVar.K();
                Y1.c.b(K3, (a2.c) obj3);
                K3.writeStrongBinder(eVar);
                K3.writeString(null);
                xVar.V(K3, 63);
                return;
        }
    }

    public void K(f0.e eVar) {
    }

    public boolean L(String str) {
        return false;
    }

    public void M(int i4, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i4;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        ((Messenger) this.f1009m).send(obtain);
    }

    public void N(Object obj) {
        boolean z4 = obj instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.f1009m;
        if (!z4) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [Q0.c, java.lang.Object] */
    public void O(int i4, long j4, long j5) {
        Q0.d dVar = (Q0.d) this.f1009m;
        W.a.k(dVar.f1679d0);
        if (i4 == 160) {
            dVar.f1664S = false;
            dVar.f1665T = 0L;
            return;
        }
        if (i4 != 174) {
            if (i4 == 187) {
                dVar.f1653G = false;
                return;
            }
            if (i4 == 19899) {
                dVar.f1698y = -1;
                dVar.f1699z = -1L;
                return;
            }
            if (i4 == 20533) {
                dVar.c(i4);
                dVar.w.f1624h = true;
                return;
            }
            if (i4 == 21968) {
                dVar.c(i4);
                dVar.w.f1639y = true;
                return;
            }
            if (i4 == 408125543) {
                long j6 = dVar.s;
                if (j6 != -1 && j6 != j4) {
                    throw I.a(null, "Multiple Segment elements not supported");
                }
                dVar.s = j4;
                dVar.f1693r = j5;
                return;
            }
            if (i4 == 475249515) {
                dVar.f1651E = new B.c(4, false);
                dVar.f1652F = new B.c(4, false);
                return;
            } else {
                if (i4 == 524531317 && !dVar.f1697x) {
                    if (dVar.f1678d && dVar.f1648B != -1) {
                        dVar.f1647A = true;
                        return;
                    } else {
                        dVar.f1679d0.t(new A0.b(dVar.f1696v));
                        dVar.f1697x = true;
                        return;
                    }
                }
                return;
            }
        }
        ?? obj = new Object();
        obj.f1629m = -1;
        obj.f1630n = -1;
        obj.f1631o = -1;
        obj.f1632p = -1;
        obj.f1633q = -1;
        obj.f1634r = 0;
        obj.s = -1;
        obj.f1635t = 0.0f;
        obj.f1636u = 0.0f;
        obj.f1637v = 0.0f;
        obj.w = null;
        obj.f1638x = -1;
        obj.f1639y = false;
        obj.f1640z = -1;
        obj.f1592A = -1;
        obj.f1593B = -1;
        obj.f1594C = 1000;
        obj.f1595D = 200;
        obj.f1596E = -1.0f;
        obj.f1597F = -1.0f;
        obj.f1598G = -1.0f;
        obj.f1599H = -1.0f;
        obj.f1600I = -1.0f;
        obj.J = -1.0f;
        obj.f1601K = -1.0f;
        obj.f1602L = -1.0f;
        obj.f1603M = -1.0f;
        obj.f1604N = -1.0f;
        obj.f1606P = 1;
        obj.f1607Q = -1;
        obj.f1608R = 8000;
        obj.f1609S = 0L;
        obj.f1610T = 0L;
        obj.f1613W = true;
        obj.f1614X = "eng";
        dVar.w = obj;
    }

    @Override // V0.d
    public int Q() {
        return 1;
    }

    @Override // d0.h
    public long a(long j4) {
        return 0L;
    }

    @Override // I.InterfaceC0039h
    public Object b(j3.p pVar, d3.g gVar) {
        return ((InterfaceC0039h) this.f1009m).b(new M.c(pVar, null), gVar);
    }

    @Override // d0.h
    public long c(long j4, long j5) {
        return 0L;
    }

    @Override // I.InterfaceC0039h
    public u3.d d() {
        return ((InterfaceC0039h) this.f1009m).d();
    }

    public void e(f0.e eVar) {
    }

    @Override // d0.h
    public boolean f() {
        return true;
    }

    @Override // V0.d
    public int g(long j4) {
        return j4 < 0 ? 0 : -1;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractMap, B2.H, java.util.HashMap] */
    public void h(String str) {
        B1.d dVar = (B1.d) this.f1009m;
        N2.a aVar = (N2.a) dVar.f96m;
        if (B1.d.f94p == null) {
            ?? hashMap = new HashMap();
            hashMap.put("alias", 1010);
            hashMap.put("allScroll", 1013);
            hashMap.put("basic", 1000);
            hashMap.put("cell", 1006);
            hashMap.put("click", 1002);
            hashMap.put("contextMenu", 1001);
            hashMap.put("copy", 1011);
            hashMap.put("forbidden", 1012);
            hashMap.put("grab", 1020);
            hashMap.put("grabbing", 1021);
            hashMap.put("help", 1003);
            hashMap.put("move", 1013);
            hashMap.put("none", 0);
            hashMap.put("noDrop", 1012);
            hashMap.put("precise", 1007);
            hashMap.put("text", 1008);
            hashMap.put("resizeColumn", 1014);
            hashMap.put("resizeDown", 1015);
            hashMap.put("resizeUpLeft", 1016);
            hashMap.put("resizeDownRight", 1017);
            hashMap.put("resizeLeft", 1014);
            hashMap.put("resizeLeftRight", 1014);
            hashMap.put("resizeRight", 1014);
            hashMap.put("resizeRow", 1015);
            hashMap.put("resizeUp", 1015);
            hashMap.put("resizeUpDown", 1015);
            hashMap.put("resizeUpLeft", 1017);
            hashMap.put("resizeUpRight", 1016);
            hashMap.put("resizeUpLeftDownRight", 1017);
            hashMap.put("resizeUpRightDownLeft", 1016);
            hashMap.put("verticalText", 1009);
            hashMap.put("wait", 1004);
            hashMap.put("zoomIn", 1018);
            hashMap.put("zoomOut", 1019);
            B1.d.f94p = hashMap;
        }
        aVar.setPointerIcon(PointerIcon.getSystemIcon(((u) ((N2.a) dVar.f96m)).getContext(), ((Integer) B1.d.f94p.getOrDefault(str, 1000)).intValue()));
    }

    @Override // d0.h
    public long i(long j4, long j5) {
        return j5;
    }

    public void j(int i4, boolean z4) {
        D d4 = (D) this.f1009m;
        if (z4) {
            d4.a(i4);
        } else {
            d4.getClass();
        }
    }

    public void k(int i4, int i5, y0.l lVar) {
        Q0.c cVar;
        Q0.c cVar2;
        Q0.c cVar3;
        long j4;
        int i6;
        int i7;
        int i8;
        Q0.d dVar = (Q0.d) this.f1009m;
        SparseArray sparseArray = dVar.f1676c;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        if (i4 != 161 && i4 != 163) {
            if (i4 == 165) {
                if (dVar.f1655I != 2) {
                    return;
                }
                Q0.c cVar4 = (Q0.c) sparseArray.get(dVar.f1660O);
                if (dVar.f1663R != 4 || !"V_VP9".equals(cVar4.f1618b)) {
                    lVar.e(i5);
                    return;
                }
                W.r rVar = dVar.f1691p;
                rVar.D(i5);
                lVar.k(rVar.f2694a, 0, i5, false);
                return;
            }
            if (i4 == 16877) {
                dVar.c(i4);
                Q0.c cVar5 = dVar.w;
                int i12 = cVar5.f1623g;
                if (i12 != 1685485123 && i12 != 1685480259) {
                    lVar.e(i5);
                    return;
                }
                byte[] bArr = new byte[i5];
                cVar5.f1605O = bArr;
                lVar.k(bArr, 0, i5, false);
                return;
            }
            if (i4 == 16981) {
                dVar.c(i4);
                Q0.c cVar6 = dVar.w;
                byte[] bArr2 = new byte[i5];
                cVar6.f1625i = bArr2;
                lVar.k(bArr2, 0, i5, false);
                return;
            }
            if (i4 == 18402) {
                byte[] bArr3 = new byte[i5];
                lVar.k(bArr3, 0, i5, false);
                dVar.c(i4);
                dVar.w.f1626j = new E(1, 0, 0, bArr3);
                return;
            }
            if (i4 == 21419) {
                W.r rVar2 = dVar.f1686k;
                Arrays.fill(rVar2.f2694a, (byte) 0);
                lVar.k(rVar2.f2694a, 4 - i5, i5, false);
                rVar2.G(0);
                dVar.f1698y = (int) rVar2.w();
                return;
            }
            if (i4 == 25506) {
                dVar.c(i4);
                Q0.c cVar7 = dVar.w;
                byte[] bArr4 = new byte[i5];
                cVar7.f1627k = bArr4;
                lVar.k(bArr4, 0, i5, false);
                return;
            }
            if (i4 != 30322) {
                throw I.a(null, "Unexpected id: " + i4);
            }
            dVar.c(i4);
            Q0.c cVar8 = dVar.w;
            byte[] bArr5 = new byte[i5];
            cVar8.w = bArr5;
            lVar.k(bArr5, 0, i5, false);
            return;
        }
        int i13 = dVar.f1655I;
        W.r rVar3 = dVar.f1684i;
        if (i13 == 0) {
            Q0.e eVar = dVar.f1674b;
            dVar.f1660O = (int) eVar.c(lVar, false, true, 8);
            dVar.f1661P = eVar.f1703c;
            dVar.f1656K = -9223372036854775807L;
            dVar.f1655I = 1;
            rVar3.D(0);
        }
        Q0.c cVar9 = (Q0.c) sparseArray.get(dVar.f1660O);
        if (cVar9 == null) {
            lVar.e(i5 - dVar.f1661P);
            dVar.f1655I = 0;
            return;
        }
        cVar9.f1615Y.getClass();
        if (dVar.f1655I == 1) {
            dVar.h(lVar, 3);
            int i14 = (rVar3.f2694a[2] & 6) >> 1;
            byte b4 = 255;
            if (i14 == 0) {
                dVar.f1658M = 1;
                int[] iArr = dVar.f1659N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.f1659N = iArr;
                iArr[0] = (i5 - dVar.f1661P) - 3;
            } else {
                dVar.h(lVar, 4);
                int i15 = (rVar3.f2694a[3] & 255) + 1;
                dVar.f1658M = i15;
                int[] iArr2 = dVar.f1659N;
                if (iArr2 == null) {
                    iArr2 = new int[i15];
                } else if (iArr2.length < i15) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i15)];
                }
                dVar.f1659N = iArr2;
                if (i14 == 2) {
                    int i16 = (i5 - dVar.f1661P) - 4;
                    int i17 = dVar.f1658M;
                    Arrays.fill(iArr2, 0, i17, i16 / i17);
                } else {
                    if (i14 != 1) {
                        if (i14 != 3) {
                            throw I.a(null, "Unexpected lacing value: " + i14);
                        }
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = dVar.f1658M - i11;
                            if (i18 >= i20) {
                                cVar2 = cVar9;
                                dVar.f1659N[i20] = ((i5 - dVar.f1661P) - i9) - i19;
                                break;
                            }
                            dVar.f1659N[i18] = i10;
                            int i21 = i9 + 1;
                            dVar.h(lVar, i21);
                            if (rVar3.f2694a[i9] == 0) {
                                throw I.a(null, "No valid varint length mask found");
                            }
                            int i22 = i10;
                            while (true) {
                                if (i22 >= 8) {
                                    cVar3 = cVar9;
                                    j4 = 0;
                                    i9 = i21;
                                    break;
                                }
                                int i23 = i11 << (7 - i22);
                                if ((rVar3.f2694a[i9] & i23) != 0) {
                                    int i24 = i21 + i22;
                                    dVar.h(lVar, i24);
                                    Q0.c cVar10 = cVar9;
                                    j4 = rVar3.f2694a[i9] & b4 & (~i23);
                                    while (i21 < i24) {
                                        j4 = (j4 << 8) | (rVar3.f2694a[i21] & 255);
                                        i21++;
                                        cVar10 = cVar10;
                                    }
                                    cVar3 = cVar10;
                                    if (i18 > 0) {
                                        j4 -= (1 << ((i22 * 7) + 6)) - 1;
                                    }
                                    i9 = i24;
                                } else {
                                    i22++;
                                    b4 = 255;
                                    i11 = 1;
                                }
                            }
                            if (j4 < -2147483648L || j4 > 2147483647L) {
                                break;
                            }
                            int i25 = (int) j4;
                            int[] iArr3 = dVar.f1659N;
                            if (i18 != 0) {
                                i25 += iArr3[i18 - 1];
                            }
                            iArr3[i18] = i25;
                            i19 += i25;
                            i18++;
                            cVar9 = cVar3;
                            b4 = 255;
                            i10 = 0;
                            i11 = 1;
                        }
                        throw I.a(null, "EBML lacing sample size out of range.");
                    }
                    int i26 = 0;
                    int i27 = 0;
                    while (true) {
                        i6 = dVar.f1658M - 1;
                        if (i26 >= i6) {
                            break;
                        }
                        dVar.f1659N[i26] = 0;
                        while (true) {
                            i7 = i9 + 1;
                            dVar.h(lVar, i7);
                            int i28 = rVar3.f2694a[i9] & 255;
                            int[] iArr4 = dVar.f1659N;
                            i8 = iArr4[i26] + i28;
                            iArr4[i26] = i8;
                            if (i28 != 255) {
                                break;
                            } else {
                                i9 = i7;
                            }
                        }
                        i27 += i8;
                        i26++;
                        i9 = i7;
                    }
                    dVar.f1659N[i6] = ((i5 - dVar.f1661P) - i9) - i27;
                }
            }
            cVar2 = cVar9;
            byte[] bArr6 = rVar3.f2694a;
            dVar.J = dVar.m((bArr6[1] & 255) | (bArr6[0] << 8)) + dVar.f1650D;
            cVar = cVar2;
            dVar.f1662Q = (cVar.f1620d == 2 || (i4 == 163 && (rVar3.f2694a[2] & 128) == 128)) ? 1 : 0;
            dVar.f1655I = 2;
            dVar.f1657L = 0;
        } else {
            cVar = cVar9;
        }
        if (i4 == 163) {
            while (true) {
                int i29 = dVar.f1657L;
                if (i29 >= dVar.f1658M) {
                    dVar.f1655I = 0;
                    return;
                }
                dVar.e(cVar, ((dVar.f1657L * cVar.f1621e) / 1000) + dVar.J, dVar.f1662Q, dVar.n(lVar, cVar, dVar.f1659N[i29], false), 0);
                dVar.f1657L++;
                cVar = cVar;
            }
        } else {
            Q0.c cVar11 = cVar;
            while (true) {
                int i30 = dVar.f1657L;
                if (i30 >= dVar.f1658M) {
                    return;
                }
                int[] iArr5 = dVar.f1659N;
                iArr5[i30] = dVar.n(lVar, cVar11, iArr5[i30], true);
                dVar.f1657L++;
            }
        }
    }

    @Override // d0.h
    public long l() {
        return 0L;
    }

    public f0.i n(B b4) {
        b4.f2067b.getClass();
        b4.f2067b.getClass();
        return f0.i.f5458a;
    }

    public Z.a o() {
        return null;
    }

    public f0.c p() {
        return (f0.c) this.f1009m;
    }

    @Override // d0.h
    public long q(long j4) {
        return 1L;
    }

    @Override // d0.h
    public long r(long j4, long j5) {
        return 1L;
    }

    public UUID s() {
        return AbstractC0086g.f2240a;
    }

    public int t() {
        return 1;
    }

    @Override // d0.h
    public long u(long j4, long j5) {
        return 0L;
    }

    public String v(String str, String str2) {
        M2.a aVar = (M2.a) this.f1009m;
        Context context = aVar.f1172b;
        if (str2 != null) {
            Locale a4 = M2.a.a(str2);
            Configuration configuration = new Configuration(aVar.f1172b.getResources().getConfiguration());
            configuration.setLocale(a4);
            context = aVar.f1172b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", aVar.f1172b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    @Override // V0.d
    public List w(long j4) {
        return j4 >= 0 ? (List) this.f1009m : Collections.emptyList();
    }

    public void x(long j4, int i4) {
        Q0.d dVar = (Q0.d) this.f1009m;
        dVar.getClass();
        if (i4 == 20529) {
            if (j4 == 0) {
                return;
            }
            throw I.a(null, "ContentEncodingOrder " + j4 + " not supported");
        }
        if (i4 == 20530) {
            if (j4 == 1) {
                return;
            }
            throw I.a(null, "ContentEncodingScope " + j4 + " not supported");
        }
        switch (i4) {
            case 131:
                dVar.c(i4);
                dVar.w.f1620d = (int) j4;
                return;
            case 136:
                dVar.c(i4);
                dVar.w.f1613W = j4 == 1;
                return;
            case 155:
                dVar.f1656K = dVar.m(j4);
                return;
            case 159:
                dVar.c(i4);
                dVar.w.f1606P = (int) j4;
                return;
            case 176:
                dVar.c(i4);
                dVar.w.f1629m = (int) j4;
                return;
            case 179:
                dVar.a(i4);
                dVar.f1651E.e(dVar.m(j4));
                return;
            case 186:
                dVar.c(i4);
                dVar.w.f1630n = (int) j4;
                return;
            case 215:
                dVar.c(i4);
                dVar.w.f1619c = (int) j4;
                return;
            case 231:
                dVar.f1650D = dVar.m(j4);
                return;
            case 238:
                dVar.f1663R = (int) j4;
                return;
            case 241:
                if (dVar.f1653G) {
                    return;
                }
                dVar.a(i4);
                dVar.f1652F.e(j4);
                dVar.f1653G = true;
                return;
            case 251:
                dVar.f1664S = true;
                return;
            case 16871:
                dVar.c(i4);
                dVar.w.f1623g = (int) j4;
                return;
            case 16980:
                if (j4 == 3) {
                    return;
                }
                throw I.a(null, "ContentCompAlgo " + j4 + " not supported");
            case 17029:
                if (j4 < 1 || j4 > 2) {
                    throw I.a(null, "DocTypeReadVersion " + j4 + " not supported");
                }
                return;
            case 17143:
                if (j4 == 1) {
                    return;
                }
                throw I.a(null, "EBMLReadVersion " + j4 + " not supported");
            case 18401:
                if (j4 == 5) {
                    return;
                }
                throw I.a(null, "ContentEncAlgo " + j4 + " not supported");
            case 18408:
                if (j4 == 1) {
                    return;
                }
                throw I.a(null, "AESSettingsCipherMode " + j4 + " not supported");
            case 21420:
                dVar.f1699z = j4 + dVar.s;
                return;
            case 21432:
                int i5 = (int) j4;
                dVar.c(i4);
                if (i5 == 0) {
                    dVar.w.f1638x = 0;
                    return;
                }
                if (i5 == 1) {
                    dVar.w.f1638x = 2;
                    return;
                } else if (i5 == 3) {
                    dVar.w.f1638x = 1;
                    return;
                } else {
                    if (i5 != 15) {
                        return;
                    }
                    dVar.w.f1638x = 3;
                    return;
                }
            case 21680:
                dVar.c(i4);
                dVar.w.f1632p = (int) j4;
                return;
            case 21682:
                dVar.c(i4);
                dVar.w.f1634r = (int) j4;
                return;
            case 21690:
                dVar.c(i4);
                dVar.w.f1633q = (int) j4;
                return;
            case 21930:
                dVar.c(i4);
                dVar.w.f1612V = j4 == 1;
                return;
            case 21938:
                dVar.c(i4);
                Q0.c cVar = dVar.w;
                cVar.f1639y = true;
                cVar.f1631o = (int) j4;
                return;
            case 21998:
                dVar.c(i4);
                dVar.w.f1622f = (int) j4;
                return;
            case 22186:
                dVar.c(i4);
                dVar.w.f1609S = j4;
                return;
            case 22203:
                dVar.c(i4);
                dVar.w.f1610T = j4;
                return;
            case 25188:
                dVar.c(i4);
                dVar.w.f1607Q = (int) j4;
                return;
            case 30114:
                dVar.f1665T = j4;
                return;
            case 30321:
                dVar.c(i4);
                int i6 = (int) j4;
                if (i6 == 0) {
                    dVar.w.s = 0;
                    return;
                }
                if (i6 == 1) {
                    dVar.w.s = 1;
                    return;
                } else if (i6 == 2) {
                    dVar.w.s = 2;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    dVar.w.s = 3;
                    return;
                }
            case 2352003:
                dVar.c(i4);
                dVar.w.f1621e = (int) j4;
                return;
            case 2807729:
                dVar.f1694t = j4;
                return;
            default:
                switch (i4) {
                    case 21945:
                        dVar.c(i4);
                        int i7 = (int) j4;
                        if (i7 == 1) {
                            dVar.w.f1593B = 2;
                            return;
                        } else {
                            if (i7 != 2) {
                                return;
                            }
                            dVar.w.f1593B = 1;
                            return;
                        }
                    case 21946:
                        dVar.c(i4);
                        int g4 = C0088i.g((int) j4);
                        if (g4 != -1) {
                            dVar.w.f1592A = g4;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.c(i4);
                        dVar.w.f1639y = true;
                        int f4 = C0088i.f((int) j4);
                        if (f4 != -1) {
                            dVar.w.f1640z = f4;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.c(i4);
                        dVar.w.f1594C = (int) j4;
                        return;
                    case 21949:
                        dVar.c(i4);
                        dVar.w.f1595D = (int) j4;
                        return;
                    default:
                        return;
                }
        }
    }

    public void z(Exception exc) {
        W.a.o("MediaCodecAudioRenderer", "Audio sink error", exc);
        C0215n c0215n = ((M) this.f1009m).f4560Q0;
        Handler handler = c0215n.f4631a;
        if (handler != null) {
            handler.post(new RunnableC0214m(c0215n, exc, 4));
        }
    }

    public o(W.p pVar, N1.g gVar) {
        this.f1008l = 4;
        this.f1009m = pVar;
    }

    public o(C0084e c0084e) {
        this.f1008l = 14;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c0084e.f2236a).setFlags(c0084e.f2237b).setUsage(c0084e.f2238c);
        int i4 = y.f2709a;
        if (i4 >= 29) {
            AbstractC0082c.a(usage, 1);
        }
        if (i4 >= 32) {
            AbstractC0083d.a(usage, 0);
        }
        this.f1009m = usage.build();
    }

    public o(UUID uuid, int i4, byte[] bArr) {
        this.f1008l = 13;
        this.f1009m = uuid;
    }

    public o(int i4) {
        this.f1008l = i4;
        switch (i4) {
            case 21:
                this.f1009m = new Bundle();
                return;
            case 27:
                this.f1009m = new Object();
                return;
            case 29:
                this.f1009m = C0299v.a();
                return;
            default:
                this.f1009m = new D();
                return;
        }
    }

    public o(MediaMetadataCompat mediaMetadataCompat) {
        this.f1008l = 21;
        Bundle bundle = new Bundle(mediaMetadataCompat.f3648l);
        this.f1009m = bundle;
        t.b0(bundle);
    }
}
