package p071R2;

/* renamed from: R2.f */
/* loaded from: classes.dex */
public final class C0600f {

    /* renamed from: a */
    public static final /* synthetic */ p071R2.C0600f f1876a = new java.lang.Object();

    /* renamed from: b */
    public static final p100Z2.C0932e f1877b = new p100Z2.C0932e(new p071R2.C0598d(0));

    /* renamed from: a */
    public static p047L2.InterfaceC0383m m1126a() {
        return (p047L2.InterfaceC0383m) f1877b.m1762a();
    }

    /* renamed from: b */
    public static void m1127b(p047L2.InterfaceC0376f interfaceC0376f, final p071R2.InterfaceC0601g interfaceC0601g, java.lang.String str) {
        p154k3.AbstractC1803h.m3779e(interfaceC0376f, "binaryMessenger");
        java.lang.String concat = str.length() > 0 ? ".".concat(str) : "";
        p025F1.C0215g m827d = interfaceC0376f.m827d();
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i4 = 6;
            c0291m.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i4) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m.m701r(null);
        }
        p035I.C0291m c0291m2 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i5 = 12;
            c0291m2.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i5) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m2.m701r(null);
        }
        p035I.C0291m c0291m3 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i6 = 13;
            c0291m3.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i6) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m3.m701r(null);
        }
        p035I.C0291m c0291m4 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i7 = 14;
            c0291m4.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i7) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m4.m701r(null);
        }
        p035I.C0291m c0291m5 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i8 = 0;
            c0291m5.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i8) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m5.m701r(null);
        }
        p035I.C0291m c0291m6 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i9 = 1;
            c0291m6.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i9) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m6.m701r(null);
        }
        p035I.C0291m c0291m7 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i10 = 2;
            c0291m7.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i10) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m7.m701r(null);
        }
        p035I.C0291m c0291m8 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i11 = 3;
            c0291m8.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i11) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m8.m701r(null);
        }
        p035I.C0291m c0291m9 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i12 = 4;
            c0291m9.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i12) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m9.m701r(null);
        }
        p035I.C0291m c0291m10 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i13 = 5;
            c0291m10.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i13) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m10.m701r(null);
        }
        p035I.C0291m c0291m11 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i14 = 7;
            c0291m11.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i14) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m11.m701r(null);
        }
        p035I.C0291m c0291m12 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i15 = 8;
            c0291m12.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i15) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m12.m701r(null);
        }
        p035I.C0291m c0291m13 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i16 = 9;
            c0291m13.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i16) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m13.m701r(null);
        }
        p035I.C0291m c0291m14 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), m1126a(), m827d);
        if (interfaceC0601g != null) {
            final int i17 = 10;
            c0291m14.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i17) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        } else {
            c0291m14.m701r(null);
        }
        p035I.C0291m c0291m15 = new p035I.C0291m(interfaceC0376f, p009B2.AbstractC0051h.m153l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), m1126a(), m827d);
        if (interfaceC0601g == null) {
            c0291m15.m701r(null);
        } else {
            final int i18 = 11;
            c0291m15.m701r(new p047L2.InterfaceC0372b() { // from class: R2.e
                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    java.util.List m3926b;
                    java.util.List m3926b2;
                    java.util.List m3926b3;
                    java.util.List m3926b4;
                    java.util.List m3926b5;
                    java.util.List m3926b6;
                    java.util.List m3926b7;
                    java.util.List m3926b8;
                    java.util.List m3926b9;
                    java.util.List m3926b10;
                    java.util.List m3926b11;
                    java.util.List m3926b12;
                    java.util.List m3926b13;
                    java.util.List m3926b14;
                    java.util.List m3926b15;
                    switch (i18) {
                        case 0:
                            p071R2.InterfaceC0601g interfaceC0601g2 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            p154k3.AbstractC1803h.m3777c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            p154k3.AbstractC1803h.m3777c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            p154k3.AbstractC1803h.m3777c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g2.mo1114i(str2, str3, (p071R2.C0602h) obj4);
                                m3926b = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th) {
                                m3926b = p176p1.AbstractC1949a.m3926b(th);
                            }
                            c0026d.mo106e(m3926b);
                            return;
                        case 1:
                            p071R2.InterfaceC0601g interfaceC0601g3 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            p154k3.AbstractC1803h.m3777c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            p154k3.AbstractC1803h.m3777c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            p154k3.AbstractC1803h.m3777c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g3.mo1107J(str4, list3, (p071R2.C0602h) obj7);
                                m3926b2 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th2) {
                                m3926b2 = p176p1.AbstractC1949a.m3926b(th2);
                            }
                            c0026d.mo106e(m3926b2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.InterfaceC0601g interfaceC0601g4 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            p154k3.AbstractC1803h.m3777c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            p154k3.AbstractC1803h.m3777c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b3 = p176p1.AbstractC1949a.m3904E(interfaceC0601g4.mo1116n(str5, (p071R2.C0602h) obj9));
                            } catch (java.lang.Throwable th3) {
                                m3926b3 = p176p1.AbstractC1949a.m3926b(th3);
                            }
                            c0026d.mo106e(m3926b3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.InterfaceC0601g interfaceC0601g5 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            p154k3.AbstractC1803h.m3777c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            p154k3.AbstractC1803h.m3777c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b4 = p176p1.AbstractC1949a.m3904E(interfaceC0601g5.mo1115m(str6, (p071R2.C0602h) obj11));
                            } catch (java.lang.Throwable th4) {
                                m3926b4 = p176p1.AbstractC1949a.m3926b(th4);
                            }
                            c0026d.mo106e(m3926b4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.InterfaceC0601g interfaceC0601g6 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            p154k3.AbstractC1803h.m3777c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            p154k3.AbstractC1803h.m3777c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b5 = p176p1.AbstractC1949a.m3904E(interfaceC0601g6.mo1108K(str7, (p071R2.C0602h) obj13));
                            } catch (java.lang.Throwable th5) {
                                m3926b5 = p176p1.AbstractC1949a.m3926b(th5);
                            }
                            c0026d.mo106e(m3926b5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.InterfaceC0601g interfaceC0601g7 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            p154k3.AbstractC1803h.m3777c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            p154k3.AbstractC1803h.m3777c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b6 = p176p1.AbstractC1949a.m3904E(interfaceC0601g7.mo1109L(str8, (p071R2.C0602h) obj15));
                            } catch (java.lang.Throwable th6) {
                                m3926b6 = p176p1.AbstractC1949a.m3926b(th6);
                            }
                            c0026d.mo106e(m3926b6);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.InterfaceC0601g interfaceC0601g8 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            p154k3.AbstractC1803h.m3777c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            p154k3.AbstractC1803h.m3777c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            p154k3.AbstractC1803h.m3777c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g8.mo1104D(str9, booleanValue, (p071R2.C0602h) obj18);
                                m3926b7 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th7) {
                                m3926b7 = p176p1.AbstractC1949a.m3926b(th7);
                            }
                            c0026d.mo106e(m3926b7);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.InterfaceC0601g interfaceC0601g9 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            p154k3.AbstractC1803h.m3777c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            p154k3.AbstractC1803h.m3777c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b8 = p176p1.AbstractC1949a.m3904E(interfaceC0601g9.mo1118x(str10, (p071R2.C0602h) obj20));
                            } catch (java.lang.Throwable th8) {
                                m3926b8 = p176p1.AbstractC1949a.m3926b(th8);
                            }
                            c0026d.mo106e(m3926b8);
                            return;
                        case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                            p071R2.InterfaceC0601g interfaceC0601g10 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            p154k3.AbstractC1803h.m3777c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            p154k3.AbstractC1803h.m3777c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b9 = p176p1.AbstractC1949a.m3904E(interfaceC0601g10.mo1110N(str11, (p071R2.C0602h) obj22));
                            } catch (java.lang.Throwable th9) {
                                m3926b9 = p176p1.AbstractC1949a.m3926b(th9);
                            }
                            c0026d.mo106e(m3926b9);
                            return;
                        case 9:
                            p071R2.InterfaceC0601g interfaceC0601g11 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            p154k3.AbstractC1803h.m3777c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g11.mo1113h(list12, (p071R2.C0602h) obj23);
                                m3926b10 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th10) {
                                m3926b10 = p176p1.AbstractC1949a.m3926b(th10);
                            }
                            c0026d.mo106e(m3926b10);
                            return;
                        case 10:
                            p071R2.InterfaceC0601g interfaceC0601g12 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            p154k3.AbstractC1803h.m3777c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b11 = p176p1.AbstractC1949a.m3904E(interfaceC0601g12.mo1105F(list14, (p071R2.C0602h) obj24));
                            } catch (java.lang.Throwable th11) {
                                m3926b11 = p176p1.AbstractC1949a.m3926b(th11);
                            }
                            c0026d.mo106e(m3926b11);
                            return;
                        case 11:
                            p071R2.InterfaceC0601g interfaceC0601g13 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            p154k3.AbstractC1803h.m3777c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                m3926b12 = p176p1.AbstractC1949a.m3904E(interfaceC0601g13.mo1112P(list16, (p071R2.C0602h) obj25));
                            } catch (java.lang.Throwable th12) {
                                m3926b12 = p176p1.AbstractC1949a.m3926b(th12);
                            }
                            c0026d.mo106e(m3926b12);
                            return;
                        case 12:
                            p071R2.InterfaceC0601g interfaceC0601g14 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            p154k3.AbstractC1803h.m3777c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            p154k3.AbstractC1803h.m3777c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            p154k3.AbstractC1803h.m3777c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g14.mo1111O(str12, str13, (p071R2.C0602h) obj28);
                                m3926b13 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th13) {
                                m3926b13 = p176p1.AbstractC1949a.m3926b(th13);
                            }
                            c0026d.mo106e(m3926b13);
                            return;
                        case 13:
                            p071R2.InterfaceC0601g interfaceC0601g15 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            p154k3.AbstractC1803h.m3777c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            p154k3.AbstractC1803h.m3777c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            p154k3.AbstractC1803h.m3777c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g15.mo1117p(str14, longValue, (p071R2.C0602h) obj31);
                                m3926b14 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th14) {
                                m3926b14 = p176p1.AbstractC1949a.m3926b(th14);
                            }
                            c0026d.mo106e(m3926b14);
                            return;
                        default:
                            p071R2.InterfaceC0601g interfaceC0601g16 = interfaceC0601g;
                            p154k3.AbstractC1803h.m3777c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            p154k3.AbstractC1803h.m3777c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            p154k3.AbstractC1803h.m3777c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            p154k3.AbstractC1803h.m3777c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0601g16.mo1106G(str15, doubleValue, (p071R2.C0602h) obj34);
                                m3926b15 = p176p1.AbstractC1949a.m3904E(null);
                            } catch (java.lang.Throwable th15) {
                                m3926b15 = p176p1.AbstractC1949a.m3926b(th15);
                            }
                            c0026d.mo106e(m3926b15);
                            return;
                    }
                }
            });
        }
    }
}
