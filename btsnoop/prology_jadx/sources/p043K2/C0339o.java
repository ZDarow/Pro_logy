package p043K2;

/* renamed from: K2.o */
/* loaded from: classes.dex */
public final class C0339o implements p047L2.InterfaceC0385o, p035I.InterfaceC0286h, p054N1.InterfaceC0455j, p200u3.InterfaceC2250d, p083V0.InterfaceC0766d, p117d0.InterfaceC1264h {

    /* renamed from: l */
    public final /* synthetic */ int f1047l;

    /* renamed from: m */
    public final java.lang.Object f1048m;

    public /* synthetic */ C0339o(int i4, java.lang.Object obj) {
        this.f1047l = i4;
        this.f1048m = obj;
    }

    /* renamed from: m */
    public static p127f0.AbstractC1369b m746m(p080U1.AbstractC0748a abstractC0748a) {
        new p094Y.C0886x(0, (byte) 0);
        abstractC0748a.getClass();
        new java.util.HashMap();
        throw null;
    }

    /* renamed from: A */
    public void m747A(java.lang.String str, java.util.List list, android.os.Bundle bundle, android.os.Bundle bundle2) {
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
        }
        m754M(3, bundle3);
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: B */
    public long mo654B(int i4) {
        p086W.AbstractC0781a.m1416e(i4 == 0);
        return 0L;
    }

    @Override // p200u3.InterfaceC2250d
    /* renamed from: C */
    public java.lang.Object mo266C(p200u3.InterfaceC2251e interfaceC2251e, p110b3.InterfaceC1190d interfaceC1190d) {
        java.lang.Object mo266C = ((p200u3.InterfaceC2250d) this.f1048m).mo266C(new p035I.C0298t(interfaceC2251e, 1), interfaceC1190d);
        return mo266C == p115c3.EnumC1252a.f4880l ? mo266C : p100Z2.C0934g.f3298a;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: D */
    public long mo620D(long j4, long j5) {
        return -9223372036854775807L;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: E */
    public p122e0.C1309j mo621E(long j4) {
        return (p122e0.C1309j) this.f1048m;
    }

    /* renamed from: F */
    public void m748F(java.lang.String str, android.graphics.Bitmap bitmap) {
        p165n.C1878e c1878e = android.support.v4.media.MediaMetadataCompat.f3769o;
        if (!c1878e.containsKey(str) || ((java.lang.Integer) c1878e.get(str)).intValue() == 2) {
            ((android.os.Bundle) this.f1048m).putParcelable(str, bitmap);
            return;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
    }

    /* renamed from: G */
    public void m749G(java.lang.String str, long j4) {
        p165n.C1878e c1878e = android.support.v4.media.MediaMetadataCompat.f3769o;
        if (!c1878e.containsKey(str) || ((java.lang.Integer) c1878e.get(str)).intValue() == 0) {
            ((android.os.Bundle) this.f1048m).putLong(str, j4);
            return;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a long");
    }

    /* renamed from: H */
    public void m750H(java.lang.String str, java.lang.String str2) {
        p165n.C1878e c1878e = android.support.v4.media.MediaMetadataCompat.f3769o;
        if (!c1878e.containsKey(str) || ((java.lang.Integer) c1878e.get(str)).intValue() == 1) {
            ((android.os.Bundle) this.f1048m).putCharSequence(str, str2);
            return;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        char c4;
        android.os.Bundle bundle;
        p008B1.C0026d c0026d = (p008B1.C0026d) this.f1048m;
        if (((io.flutter.plugin.editing.C1574j) c0026d.f100n) == null) {
            return;
        }
        java.lang.String str = c0384n.f1133a;
        str.getClass();
        java.lang.Object obj = c0384n.f1134b;
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
                    org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                    int i4 = jSONObject.getInt("platformViewId");
                    boolean optBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                    io.flutter.plugin.editing.C1575k c1575k = ((io.flutter.plugin.editing.C1574j) c0026d.f100n).f6534a;
                    if (optBoolean) {
                        android.view.View view = c1575k.f6535a;
                        view.requestFocus();
                        c1575k.f6539e = new p011C.C0118j(3, i4, 5);
                        c1575k.f6536b.restartInput(view);
                        c1575k.f6543i = false;
                    } else {
                        c1575k.getClass();
                        c1575k.f6539e = new p011C.C0118j(4, i4, 5);
                        c1575k.f6544j = null;
                    }
                    c0335k.mo742b(null);
                    return;
                } catch (org.json.JSONException e4) {
                    c0335k.mo741a("error", e4.getMessage(), null);
                    return;
                }
            case 1:
                try {
                    ((io.flutter.plugin.editing.C1574j) c0026d.f100n).m3496c(p043K2.C0342r.m770a((org.json.JSONObject) obj));
                    c0335k.mo742b(null);
                    return;
                } catch (org.json.JSONException e5) {
                    c0335k.mo741a("error", e5.getMessage(), null);
                    return;
                }
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                    ((io.flutter.plugin.editing.C1574j) c0026d.f100n).m3494a(jSONArray.getInt(0), p043K2.C0340p.m769a(jSONArray.getJSONObject(1)));
                    c0335k.mo742b(null);
                    return;
                } catch (java.lang.NoSuchFieldException | org.json.JSONException e6) {
                    c0335k.mo741a("error", e6.getMessage(), null);
                    return;
                }
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                io.flutter.plugin.editing.C1575k c1575k2 = ((io.flutter.plugin.editing.C1574j) c0026d.f100n).f6534a;
                if (c1575k2.f6539e.f326b == 4) {
                    c1575k2.m3499d();
                } else {
                    c1575k2.m3499d();
                    c1575k2.f6536b.hideSoftInputFromWindow(c1575k2.f6535a.getApplicationWindowToken(), 0);
                }
                c0335k.mo742b(null);
                return;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                io.flutter.plugin.editing.C1575k c1575k3 = ((io.flutter.plugin.editing.C1574j) c0026d.f100n).f6534a;
                android.view.View view2 = c1575k3.f6535a;
                p043K2.C0340p c0340p = c1575k3.f6540f;
                android.view.inputmethod.InputMethodManager inputMethodManager = c1575k3.f6536b;
                if (c0340p == null || c0340p.f1055g.f1062a != 11) {
                    view2.requestFocus();
                    inputMethodManager.showSoftInput(view2, 0);
                } else {
                    c1575k3.m3499d();
                    inputMethodManager.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                }
                c0335k.mo742b(null);
                return;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                try {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                    java.lang.String string = jSONObject2.getString("action");
                    java.lang.String string2 = jSONObject2.getString("data");
                    if (string2 == null || string2.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = new android.os.Bundle();
                        bundle.putString("data", string2);
                    }
                    io.flutter.plugin.editing.C1575k c1575k4 = ((io.flutter.plugin.editing.C1574j) c0026d.f100n).f6534a;
                    c1575k4.f6536b.sendAppPrivateCommand(c1575k4.f6535a, string, bundle);
                    c0335k.mo742b(null);
                    return;
                } catch (org.json.JSONException e7) {
                    c0335k.mo741a("error", e7.getMessage(), null);
                    return;
                }
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    org.json.JSONObject jSONObject3 = (org.json.JSONObject) obj;
                    double d4 = jSONObject3.getDouble("width");
                    double d5 = jSONObject3.getDouble("height");
                    org.json.JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                    double[] dArr = new double[16];
                    for (int i5 = 0; i5 < 16; i5++) {
                        dArr[i5] = jSONArray2.getDouble(i5);
                    }
                    ((io.flutter.plugin.editing.C1574j) c0026d.f100n).m3495b(d4, d5, dArr);
                    c0335k.mo742b(null);
                    return;
                } catch (org.json.JSONException e8) {
                    c0335k.mo741a("error", e8.getMessage(), null);
                    return;
                }
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                io.flutter.plugin.editing.C1574j c1574j = (io.flutter.plugin.editing.C1574j) c0026d.f100n;
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                android.view.autofill.AutofillManager autofillManager = c1574j.f6534a.f6537c;
                if (autofillManager != null) {
                    if (booleanValue) {
                        autofillManager.commit();
                    } else {
                        autofillManager.cancel();
                    }
                }
                c0335k.mo742b(null);
                return;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                io.flutter.plugin.editing.C1575k c1575k5 = ((io.flutter.plugin.editing.C1574j) c0026d.f100n).f6534a;
                if (c1575k5.f6539e.f326b != 3) {
                    c1575k5.f6542h.m3491e(c1575k5);
                    c1575k5.m3499d();
                    c1575k5.f6540f = null;
                    c1575k5.f6541g = null;
                    c1575k5.f6539e = new p011C.C0118j(1, 0, 5);
                    c1575k5.f6547m = null;
                    java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
                    android.view.View view3 = c1575k5.f6535a;
                    p011C.C0105O m450a = p011C.AbstractC0127s.m450a(view3);
                    if (m450a != null && !m450a.f302a.mo366n(8)) {
                        c1575k5.f6536b.restartInput(view3);
                    }
                }
                c0335k.mo742b(null);
                return;
            case '\t':
                io.flutter.plugin.editing.C1575k c1575k6 = ((io.flutter.plugin.editing.C1574j) c0026d.f100n).f6534a;
                android.view.autofill.AutofillManager autofillManager2 = c1575k6.f6537c;
                if (autofillManager2 != null && c1575k6.f6541g != null) {
                    java.lang.String str2 = (java.lang.String) c1575k6.f6540f.f1058j.f876l;
                    int[] iArr = new int[2];
                    android.view.View view4 = c1575k6.f6535a;
                    view4.getLocationOnScreen(iArr);
                    android.graphics.Rect rect = new android.graphics.Rect(c1575k6.f6547m);
                    rect.offset(iArr[0], iArr[1]);
                    autofillManager2.notifyViewEntered(view4, str2.hashCode(), rect);
                }
                c0335k.mo742b(null);
                return;
            default:
                c0335k.mo743c();
                return;
        }
    }

    @Override // p054N1.InterfaceC0455j
    /* renamed from: J */
    public void mo751J(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = this.f1048m;
        switch (this.f1047l) {
            case 11:
                p119d2.C1285d c1285d = (p119d2.C1285d) obj2;
                p066Q1.C0560a c0560a = (p066Q1.C0560a) ((p066Q1.C0563d) obj).m2935q();
                android.os.Parcel obtain = android.os.Parcel.obtain();
                obtain.writeInterfaceToken(c0560a.f2909e);
                int i4 = p088W1.AbstractC0817c.f2911a;
                p058O1.C0506j c0506j = (p058O1.C0506j) obj3;
                if (c0506j == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    c0506j.writeToParcel(obtain, 0);
                }
                try {
                    c0560a.f2908d.transact(1, obtain, null, 1);
                    obtain.recycle();
                    c1285d.m3021a(null);
                    return;
                } catch (java.lang.Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                p096Y1.C0913x c0913x = (p096Y1.C0913x) ((p096Y1.C0898i) obj).m2935q();
                p096Y1.BinderC0894e binderC0894e = new p096Y1.BinderC0894e(0, (p119d2.C1285d) obj2);
                android.os.Parcel m1657K = c0913x.m1657K();
                p096Y1.AbstractC0892c.m1735b(m1657K, (p104a2.C1005c) obj3);
                m1657K.writeStrongBinder(binderC0894e);
                m1657K.writeString(null);
                c0913x.m1658V(m1657K, 63);
                return;
        }
    }

    /* renamed from: K */
    public void m752K(p127f0.C1372e c1372e) {
    }

    /* renamed from: L */
    public boolean m753L(java.lang.String str) {
        return false;
    }

    /* renamed from: M */
    public void m754M(int i4, android.os.Bundle bundle) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i4;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        ((android.os.Messenger) this.f1048m).send(obtain);
    }

    /* renamed from: N */
    public void m755N(java.lang.Object obj) {
        boolean z4 = obj instanceof java.util.List;
        java.util.ArrayList arrayList = null;
        android.service.media.MediaBrowserService.Result result = (android.service.media.MediaBrowserService.Result) this.f1048m;
        if (!z4) {
            if (!(obj instanceof android.os.Parcel)) {
                result.sendResult(null);
                return;
            }
            android.os.Parcel parcel = (android.os.Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        java.util.List<android.os.Parcel> list = (java.util.List) obj;
        if (list != null) {
            arrayList = new java.util.ArrayList(list.size());
            for (android.os.Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((android.media.browse.MediaBrowser.MediaItem) android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [Q0.c, java.lang.Object] */
    /* renamed from: O */
    public void m756O(int i4, long j4, long j5) {
        p065Q0.C0558d c0558d = (p065Q0.C0558d) this.f1048m;
        p086W.AbstractC0781a.m1422k(c0558d.f1735d0);
        if (i4 == 160) {
            c0558d.f1720S = false;
            c0558d.f1721T = 0L;
            return;
        }
        if (i4 != 174) {
            if (i4 == 187) {
                c0558d.f1708G = false;
                return;
            }
            if (i4 == 19899) {
                c0558d.f1756y = -1;
                c0558d.f1757z = -1L;
                return;
            }
            if (i4 == 20533) {
                c0558d.m1066c(i4);
                c0558d.f1754w.f1677h = true;
                return;
            }
            if (i4 == 21968) {
                c0558d.m1066c(i4);
                c0558d.f1754w.f1694y = true;
                return;
            }
            if (i4 == 408125543) {
                long j6 = c0558d.f1750s;
                if (j6 != -1 && j6 != j4) {
                    throw p076T.C0666I.m1202a(null, "Multiple Segment elements not supported");
                }
                c0558d.f1750s = j4;
                c0558d.f1749r = j5;
                return;
            }
            if (i4 == 475249515) {
                c0558d.f1706E = new p006B.C0020c(4, false);
                c0558d.f1707F = new p006B.C0020c(4, false);
                return;
            } else {
                if (i4 == 524531317 && !c0558d.f1755x) {
                    if (c0558d.f1734d && c0558d.f1703B != -1) {
                        c0558d.f1702A = true;
                        return;
                    } else {
                        c0558d.f1735d0.mo638t(new p002A0.C0004b(c0558d.f1753v));
                        c0558d.f1755x = true;
                        return;
                    }
                }
                return;
            }
        }
        ?? obj = new java.lang.Object();
        obj.f1682m = -1;
        obj.f1683n = -1;
        obj.f1684o = -1;
        obj.f1685p = -1;
        obj.f1686q = -1;
        obj.f1687r = 0;
        obj.f1688s = -1;
        obj.f1689t = 0.0f;
        obj.f1690u = 0.0f;
        obj.f1691v = 0.0f;
        obj.f1692w = null;
        obj.f1693x = -1;
        obj.f1694y = false;
        obj.f1695z = -1;
        obj.f1644A = -1;
        obj.f1645B = -1;
        obj.f1646C = 1000;
        obj.f1647D = 200;
        obj.f1648E = -1.0f;
        obj.f1649F = -1.0f;
        obj.f1650G = -1.0f;
        obj.f1651H = -1.0f;
        obj.f1652I = -1.0f;
        obj.f1653J = -1.0f;
        obj.f1654K = -1.0f;
        obj.f1655L = -1.0f;
        obj.f1656M = -1.0f;
        obj.f1657N = -1.0f;
        obj.f1659P = 1;
        obj.f1660Q = -1;
        obj.f1661R = 8000;
        obj.f1662S = 0L;
        obj.f1663T = 0L;
        obj.f1666W = true;
        obj.f1667X = "eng";
        c0558d.f1754w = obj;
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: Q */
    public int mo655Q() {
        return 1;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: a */
    public long mo625a(long j4) {
        return 0L;
    }

    @Override // p035I.InterfaceC0286h
    /* renamed from: b */
    public java.lang.Object mo667b(p149j3.InterfaceC1741p interfaceC1741p, p120d3.AbstractC1297g abstractC1297g) {
        return ((p035I.InterfaceC0286h) this.f1048m).mo667b(new p048M.C0396c(interfaceC1741p, null), abstractC1297g);
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: c */
    public long mo626c(long j4, long j5) {
        return 0L;
    }

    @Override // p035I.InterfaceC0286h
    /* renamed from: d */
    public p200u3.InterfaceC2250d mo668d() {
        return ((p035I.InterfaceC0286h) this.f1048m).mo668d();
    }

    /* renamed from: e */
    public void m757e(p127f0.C1372e c1372e) {
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: f */
    public boolean mo629f() {
        return true;
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: g */
    public int mo657g(long j4) {
        return j4 < 0 ? 0 : -1;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractMap, B2.H, java.util.HashMap] */
    /* renamed from: h */
    public void m758h(java.lang.String str) {
        p008B1.C0026d c0026d = (p008B1.C0026d) this.f1048m;
        p055N2.InterfaceC0472a interfaceC0472a = (p055N2.InterfaceC0472a) c0026d.f99m;
        if (p008B1.C0026d.f97p == null) {
            ?? hashMap = new java.util.HashMap();
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
            p008B1.C0026d.f97p = hashMap;
        }
        interfaceC0472a.setPointerIcon(android.view.PointerIcon.getSystemIcon(((p009B2.C0064u) ((p055N2.InterfaceC0472a) c0026d.f99m)).getContext(), ((java.lang.Integer) p008B1.C0026d.f97p.getOrDefault(str, 1000)).intValue()));
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: i */
    public long mo630i(long j4, long j5) {
        return j5;
    }

    /* renamed from: j */
    public void m759j(int i4, boolean z4) {
        p009B2.C0033D c0033d = (p009B2.C0033D) this.f1048m;
        if (z4) {
            c0033d.m118a(i4);
        } else {
            c0033d.getClass();
        }
    }

    /* renamed from: k */
    public void m760k(int i4, int i5, p215y0.C2400l c2400l) {
        p065Q0.C0557c c0557c;
        p065Q0.C0557c c0557c2;
        p065Q0.C0557c c0557c3;
        long j4;
        int i6;
        int i7;
        int i8;
        p065Q0.C0558d c0558d = (p065Q0.C0558d) this.f1048m;
        android.util.SparseArray sparseArray = c0558d.f1732c;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        if (i4 != 161 && i4 != 163) {
            if (i4 == 165) {
                if (c0558d.f1710I != 2) {
                    return;
                }
                p065Q0.C0557c c0557c4 = (p065Q0.C0557c) sparseArray.get(c0558d.f1716O);
                if (c0558d.f1719R != 4 || !"V_VP9".equals(c0557c4.f1671b)) {
                    c2400l.mo628e(i5);
                    return;
                }
                p086W.C0798r c0798r = c0558d.f1747p;
                c0798r.m1534D(i5);
                c2400l.mo631k(c0798r.f2786a, 0, i5, false);
                return;
            }
            if (i4 == 16877) {
                c0558d.m1066c(i4);
                p065Q0.C0557c c0557c5 = c0558d.f1754w;
                int i12 = c0557c5.f1676g;
                if (i12 != 1685485123 && i12 != 1685480259) {
                    c2400l.mo628e(i5);
                    return;
                }
                byte[] bArr = new byte[i5];
                c0557c5.f1658O = bArr;
                c2400l.mo631k(bArr, 0, i5, false);
                return;
            }
            if (i4 == 16981) {
                c0558d.m1066c(i4);
                p065Q0.C0557c c0557c6 = c0558d.f1754w;
                byte[] bArr2 = new byte[i5];
                c0557c6.f1678i = bArr2;
                c2400l.mo631k(bArr2, 0, i5, false);
                return;
            }
            if (i4 == 18402) {
                byte[] bArr3 = new byte[i5];
                c2400l.mo631k(bArr3, 0, i5, false);
                c0558d.m1066c(i4);
                c0558d.f1754w.f1679j = new p215y0.C2386E(1, 0, 0, bArr3);
                return;
            }
            if (i4 == 21419) {
                p086W.C0798r c0798r2 = c0558d.f1742k;
                java.util.Arrays.fill(c0798r2.f2786a, (byte) 0);
                c2400l.mo631k(c0798r2.f2786a, 4 - i5, i5, false);
                c0798r2.m1537G(0);
                c0558d.f1756y = (int) c0798r2.m1561w();
                return;
            }
            if (i4 == 25506) {
                c0558d.m1066c(i4);
                p065Q0.C0557c c0557c7 = c0558d.f1754w;
                byte[] bArr4 = new byte[i5];
                c0557c7.f1680k = bArr4;
                c2400l.mo631k(bArr4, 0, i5, false);
                return;
            }
            if (i4 != 30322) {
                throw p076T.C0666I.m1202a(null, "Unexpected id: " + i4);
            }
            c0558d.m1066c(i4);
            p065Q0.C0557c c0557c8 = c0558d.f1754w;
            byte[] bArr5 = new byte[i5];
            c0557c8.f1692w = bArr5;
            c2400l.mo631k(bArr5, 0, i5, false);
            return;
        }
        int i13 = c0558d.f1710I;
        p086W.C0798r c0798r3 = c0558d.f1740i;
        if (i13 == 0) {
            p065Q0.C0559e c0559e = c0558d.f1730b;
            c0558d.f1716O = (int) c0559e.m1075c(c2400l, false, true, 8);
            c0558d.f1717P = c0559e.f1761c;
            c0558d.f1712K = -9223372036854775807L;
            c0558d.f1710I = 1;
            c0798r3.m1534D(0);
        }
        p065Q0.C0557c c0557c9 = (p065Q0.C0557c) sparseArray.get(c0558d.f1716O);
        if (c0557c9 == null) {
            c2400l.mo628e(i5 - c0558d.f1717P);
            c0558d.f1710I = 0;
            return;
        }
        c0557c9.f1668Y.getClass();
        if (c0558d.f1710I == 1) {
            c0558d.m1068h(c2400l, 3);
            int i14 = (c0798r3.f2786a[2] & 6) >> 1;
            byte b4 = 255;
            if (i14 == 0) {
                c0558d.f1714M = 1;
                int[] iArr = c0558d.f1715N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[java.lang.Math.max(iArr.length * 2, 1)];
                }
                c0558d.f1715N = iArr;
                iArr[0] = (i5 - c0558d.f1717P) - 3;
            } else {
                c0558d.m1068h(c2400l, 4);
                int i15 = (c0798r3.f2786a[3] & 255) + 1;
                c0558d.f1714M = i15;
                int[] iArr2 = c0558d.f1715N;
                if (iArr2 == null) {
                    iArr2 = new int[i15];
                } else if (iArr2.length < i15) {
                    iArr2 = new int[java.lang.Math.max(iArr2.length * 2, i15)];
                }
                c0558d.f1715N = iArr2;
                if (i14 == 2) {
                    int i16 = (i5 - c0558d.f1717P) - 4;
                    int i17 = c0558d.f1714M;
                    java.util.Arrays.fill(iArr2, 0, i17, i16 / i17);
                } else {
                    if (i14 != 1) {
                        if (i14 != 3) {
                            throw p076T.C0666I.m1202a(null, "Unexpected lacing value: " + i14);
                        }
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = c0558d.f1714M - i11;
                            if (i18 >= i20) {
                                c0557c2 = c0557c9;
                                c0558d.f1715N[i20] = ((i5 - c0558d.f1717P) - i9) - i19;
                                break;
                            }
                            c0558d.f1715N[i18] = i10;
                            int i21 = i9 + 1;
                            c0558d.m1068h(c2400l, i21);
                            if (c0798r3.f2786a[i9] == 0) {
                                throw p076T.C0666I.m1202a(null, "No valid varint length mask found");
                            }
                            int i22 = i10;
                            while (true) {
                                if (i22 >= 8) {
                                    c0557c3 = c0557c9;
                                    j4 = 0;
                                    i9 = i21;
                                    break;
                                }
                                int i23 = i11 << (7 - i22);
                                if ((c0798r3.f2786a[i9] & i23) != 0) {
                                    int i24 = i21 + i22;
                                    c0558d.m1068h(c2400l, i24);
                                    p065Q0.C0557c c0557c10 = c0557c9;
                                    j4 = c0798r3.f2786a[i9] & b4 & (~i23);
                                    while (i21 < i24) {
                                        j4 = (j4 << 8) | (c0798r3.f2786a[i21] & 255);
                                        i21++;
                                        c0557c10 = c0557c10;
                                    }
                                    c0557c3 = c0557c10;
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
                            int[] iArr3 = c0558d.f1715N;
                            if (i18 != 0) {
                                i25 += iArr3[i18 - 1];
                            }
                            iArr3[i18] = i25;
                            i19 += i25;
                            i18++;
                            c0557c9 = c0557c3;
                            b4 = 255;
                            i10 = 0;
                            i11 = 1;
                        }
                        throw p076T.C0666I.m1202a(null, "EBML lacing sample size out of range.");
                    }
                    int i26 = 0;
                    int i27 = 0;
                    while (true) {
                        i6 = c0558d.f1714M - 1;
                        if (i26 >= i6) {
                            break;
                        }
                        c0558d.f1715N[i26] = 0;
                        while (true) {
                            i7 = i9 + 1;
                            c0558d.m1068h(c2400l, i7);
                            int i28 = c0798r3.f2786a[i9] & 255;
                            int[] iArr4 = c0558d.f1715N;
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
                    c0558d.f1715N[i6] = ((i5 - c0558d.f1717P) - i9) - i27;
                }
            }
            c0557c2 = c0557c9;
            byte[] bArr6 = c0798r3.f2786a;
            c0558d.f1711J = c0558d.m1070m((bArr6[1] & 255) | (bArr6[0] << 8)) + c0558d.f1705D;
            c0557c = c0557c2;
            c0558d.f1718Q = (c0557c.f1673d == 2 || (i4 == 163 && (c0798r3.f2786a[2] & 128) == 128)) ? 1 : 0;
            c0558d.f1710I = 2;
            c0558d.f1713L = 0;
        } else {
            c0557c = c0557c9;
        }
        if (i4 == 163) {
            while (true) {
                int i29 = c0558d.f1713L;
                if (i29 >= c0558d.f1714M) {
                    c0558d.f1710I = 0;
                    return;
                }
                c0558d.m1067e(c0557c, ((c0558d.f1713L * c0557c.f1674e) / 1000) + c0558d.f1711J, c0558d.f1718Q, c0558d.m1071n(c2400l, c0557c, c0558d.f1715N[i29], false), 0);
                c0558d.f1713L++;
                c0557c = c0557c;
            }
        } else {
            p065Q0.C0557c c0557c11 = c0557c;
            while (true) {
                int i30 = c0558d.f1713L;
                if (i30 >= c0558d.f1714M) {
                    return;
                }
                int[] iArr5 = c0558d.f1715N;
                iArr5[i30] = c0558d.m1071n(c2400l, c0557c11, iArr5[i30], true);
                c0558d.f1713L++;
            }
        }
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: l */
    public long mo632l() {
        return 0L;
    }

    /* renamed from: n */
    public p127f0.InterfaceC1376i m761n(p076T.C0659B c0659b) {
        c0659b.f2143b.getClass();
        c0659b.f2143b.getClass();
        return p127f0.InterfaceC1376i.f5652a;
    }

    /* renamed from: o */
    public p098Z.InterfaceC0916a m762o() {
        return null;
    }

    /* renamed from: p */
    public p127f0.C1370c m763p() {
        return (p127f0.C1370c) this.f1048m;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: q */
    public long mo635q(long j4) {
        return 1L;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: r */
    public long mo636r(long j4, long j5) {
        return 1L;
    }

    /* renamed from: s */
    public java.util.UUID m764s() {
        return p076T.AbstractC0693g.f2320a;
    }

    /* renamed from: t */
    public int m765t() {
        return 1;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: u */
    public long mo639u(long j4, long j5) {
        return 0L;
    }

    /* renamed from: v */
    public java.lang.String m766v(java.lang.String str, java.lang.String str2) {
        p051M2.C0428a c0428a = (p051M2.C0428a) this.f1048m;
        android.content.Context context = c0428a.f1211b;
        if (str2 != null) {
            java.util.Locale m903a = p051M2.C0428a.m903a(str2);
            android.content.res.Configuration configuration = new android.content.res.Configuration(c0428a.f1211b.getResources().getConfiguration());
            configuration.setLocale(m903a);
            context = c0428a.f1211b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", c0428a.f1211b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: w */
    public java.util.List mo658w(long j4) {
        return j4 >= 0 ? (java.util.List) this.f1048m : java.util.Collections.emptyList();
    }

    /* renamed from: x */
    public void m767x(long j4, int i4) {
        p065Q0.C0558d c0558d = (p065Q0.C0558d) this.f1048m;
        c0558d.getClass();
        if (i4 == 20529) {
            if (j4 == 0) {
                return;
            }
            throw p076T.C0666I.m1202a(null, "ContentEncodingOrder " + j4 + " not supported");
        }
        if (i4 == 20530) {
            if (j4 == 1) {
                return;
            }
            throw p076T.C0666I.m1202a(null, "ContentEncodingScope " + j4 + " not supported");
        }
        switch (i4) {
            case 131:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1673d = (int) j4;
                return;
            case 136:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1666W = j4 == 1;
                return;
            case 155:
                c0558d.f1712K = c0558d.m1070m(j4);
                return;
            case 159:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1659P = (int) j4;
                return;
            case 176:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1682m = (int) j4;
                return;
            case 179:
                c0558d.m1065a(i4);
                c0558d.f1706E.m53e(c0558d.m1070m(j4));
                return;
            case 186:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1683n = (int) j4;
                return;
            case 215:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1672c = (int) j4;
                return;
            case 231:
                c0558d.f1705D = c0558d.m1070m(j4);
                return;
            case 238:
                c0558d.f1719R = (int) j4;
                return;
            case 241:
                if (c0558d.f1708G) {
                    return;
                }
                c0558d.m1065a(i4);
                c0558d.f1707F.m53e(j4);
                c0558d.f1708G = true;
                return;
            case 251:
                c0558d.f1720S = true;
                return;
            case 16871:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1676g = (int) j4;
                return;
            case 16980:
                if (j4 == 3) {
                    return;
                }
                throw p076T.C0666I.m1202a(null, "ContentCompAlgo " + j4 + " not supported");
            case 17029:
                if (j4 < 1 || j4 > 2) {
                    throw p076T.C0666I.m1202a(null, "DocTypeReadVersion " + j4 + " not supported");
                }
                return;
            case 17143:
                if (j4 == 1) {
                    return;
                }
                throw p076T.C0666I.m1202a(null, "EBMLReadVersion " + j4 + " not supported");
            case 18401:
                if (j4 == 5) {
                    return;
                }
                throw p076T.C0666I.m1202a(null, "ContentEncAlgo " + j4 + " not supported");
            case 18408:
                if (j4 == 1) {
                    return;
                }
                throw p076T.C0666I.m1202a(null, "AESSettingsCipherMode " + j4 + " not supported");
            case 21420:
                c0558d.f1757z = j4 + c0558d.f1750s;
                return;
            case 21432:
                int i5 = (int) j4;
                c0558d.m1066c(i4);
                if (i5 == 0) {
                    c0558d.f1754w.f1693x = 0;
                    return;
                }
                if (i5 == 1) {
                    c0558d.f1754w.f1693x = 2;
                    return;
                } else if (i5 == 3) {
                    c0558d.f1754w.f1693x = 1;
                    return;
                } else {
                    if (i5 != 15) {
                        return;
                    }
                    c0558d.f1754w.f1693x = 3;
                    return;
                }
            case 21680:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1685p = (int) j4;
                return;
            case 21682:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1687r = (int) j4;
                return;
            case 21690:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1686q = (int) j4;
                return;
            case 21930:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1665V = j4 == 1;
                return;
            case 21938:
                c0558d.m1066c(i4);
                p065Q0.C0557c c0557c = c0558d.f1754w;
                c0557c.f1694y = true;
                c0557c.f1684o = (int) j4;
                return;
            case 21998:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1675f = (int) j4;
                return;
            case 22186:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1662S = j4;
                return;
            case 22203:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1663T = j4;
                return;
            case 25188:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1660Q = (int) j4;
                return;
            case 30114:
                c0558d.f1721T = j4;
                return;
            case 30321:
                c0558d.m1066c(i4);
                int i6 = (int) j4;
                if (i6 == 0) {
                    c0558d.f1754w.f1688s = 0;
                    return;
                }
                if (i6 == 1) {
                    c0558d.f1754w.f1688s = 1;
                    return;
                } else if (i6 == 2) {
                    c0558d.f1754w.f1688s = 2;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    c0558d.f1754w.f1688s = 3;
                    return;
                }
            case 2352003:
                c0558d.m1066c(i4);
                c0558d.f1754w.f1674e = (int) j4;
                return;
            case 2807729:
                c0558d.f1751t = j4;
                return;
            default:
                switch (i4) {
                    case 21945:
                        c0558d.m1066c(i4);
                        int i7 = (int) j4;
                        if (i7 == 1) {
                            c0558d.f1754w.f1645B = 2;
                            return;
                        } else {
                            if (i7 != 2) {
                                return;
                            }
                            c0558d.f1754w.f1645B = 1;
                            return;
                        }
                    case 21946:
                        c0558d.m1066c(i4);
                        int m1283g = p076T.C0695i.m1283g((int) j4);
                        if (m1283g != -1) {
                            c0558d.f1754w.f1644A = m1283g;
                            return;
                        }
                        return;
                    case 21947:
                        c0558d.m1066c(i4);
                        c0558d.f1754w.f1694y = true;
                        int m1282f = p076T.C0695i.m1282f((int) j4);
                        if (m1282f != -1) {
                            c0558d.f1754w.f1695z = m1282f;
                            return;
                        }
                        return;
                    case 21948:
                        c0558d.m1066c(i4);
                        c0558d.f1754w.f1646C = (int) j4;
                        return;
                    case 21949:
                        c0558d.m1066c(i4);
                        c0558d.f1754w.f1647D = (int) j4;
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: z */
    public void m768z(java.lang.Exception exc) {
        p086W.AbstractC0781a.m1426o("MediaCodecAudioRenderer", "Audio sink error", exc);
        p112c0.C1232n c1232n = ((p112c0.C1214M) this.f1048m).f4724Q0;
        android.os.Handler handler = c1232n.f4797a;
        if (handler != null) {
            handler.post(new p112c0.RunnableC1231m(c1232n, exc, 4));
        }
    }

    public C0339o(p086W.C0796p c0796p, p054N1.C0452g c0452g) {
        this.f1047l = 4;
        this.f1048m = c0796p;
    }

    public C0339o(p076T.C0691e c0691e) {
        this.f1047l = 14;
        android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(c0691e.f2316a).setFlags(c0691e.f2317b).setUsage(c0691e.f2318c);
        int i4 = p086W.AbstractC0805y.f2801a;
        if (i4 >= 29) {
            p076T.AbstractC0687c.m1267a(usage, 1);
        }
        if (i4 >= 32) {
            p076T.AbstractC0689d.m1268a(usage, 0);
        }
        this.f1048m = usage.build();
    }

    public C0339o(java.util.UUID uuid, int i4, byte[] bArr) {
        this.f1047l = 13;
        this.f1048m = uuid;
    }

    public C0339o(int i4) {
        this.f1047l = i4;
        switch (i4) {
            case 21:
                this.f1048m = new android.os.Bundle();
                return;
            case 27:
                this.f1048m = new java.lang.Object();
                return;
            case 29:
                this.f1048m = p129f2.C1449v.m3246a();
                return;
            default:
                this.f1048m = new p009B2.C0033D();
                return;
        }
    }

    public C0339o(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        this.f1047l = 21;
        android.os.Bundle bundle = new android.os.Bundle(mediaMetadataCompat.f3773l);
        this.f1048m = bundle;
        android.support.v4.media.session.C1061t.m2199b0(bundle);
    }
}
