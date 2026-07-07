package R2;

import B2.AbstractC0007h;
import I.C0044m;
import java.util.List;
import p1.AbstractC0462a;

/* renamed from: R2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0070f f1810a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Z2.e f1811b = new Z2.e(new C0068d(0));

    public static L2.m a() {
        return (L2.m) f1811b.a();
    }

    public static void b(L2.f fVar, final InterfaceC0071g interfaceC0071g, String str) {
        k3.h.e(fVar, "binaryMessenger");
        String concat = str.length() > 0 ? ".".concat(str) : "";
        F1.g d4 = fVar.d();
        C0044m c0044m = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i4 = 6;
            c0044m.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i4) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m.r(null);
        }
        C0044m c0044m2 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i5 = 12;
            c0044m2.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i5) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m2.r(null);
        }
        C0044m c0044m3 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i6 = 13;
            c0044m3.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i6) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m3.r(null);
        }
        C0044m c0044m4 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i7 = 14;
            c0044m4.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i7) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m4.r(null);
        }
        C0044m c0044m5 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i8 = 0;
            c0044m5.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i8) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m5.r(null);
        }
        C0044m c0044m6 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i9 = 1;
            c0044m6.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i9) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m6.r(null);
        }
        C0044m c0044m7 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i10 = 2;
            c0044m7.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i10) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m7.r(null);
        }
        C0044m c0044m8 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i11 = 3;
            c0044m8.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i11) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m8.r(null);
        }
        C0044m c0044m9 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i12 = 4;
            c0044m9.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i12) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m9.r(null);
        }
        C0044m c0044m10 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i13 = 5;
            c0044m10.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i13) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m10.r(null);
        }
        C0044m c0044m11 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i14 = 7;
            c0044m11.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i14) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m11.r(null);
        }
        C0044m c0044m12 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i15 = 8;
            c0044m12.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i15) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m12.r(null);
        }
        C0044m c0044m13 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i16 = 9;
            c0044m13.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i16) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m13.r(null);
        }
        C0044m c0044m14 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), d4);
        if (interfaceC0071g != null) {
            final int i17 = 10;
            c0044m14.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i17) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        } else {
            c0044m14.r(null);
        }
        C0044m c0044m15 = new C0044m(fVar, AbstractC0007h.l("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), d4);
        if (interfaceC0071g == null) {
            c0044m15.r(null);
        } else {
            final int i18 = 11;
            c0044m15.r(new L2.b() { // from class: R2.e
                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    List b4;
                    List b5;
                    List b6;
                    List b7;
                    List b8;
                    List b9;
                    List b10;
                    List b11;
                    List b12;
                    List b13;
                    List b14;
                    List b15;
                    List b16;
                    List b17;
                    List b18;
                    switch (i18) {
                        case 0:
                            InterfaceC0071g interfaceC0071g2 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            k3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            k3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            k3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g2.i(str2, str3, (C0072h) obj4);
                                b4 = AbstractC0462a.E(null);
                            } catch (Throwable th) {
                                b4 = AbstractC0462a.b(th);
                            }
                            dVar.e(b4);
                            return;
                        case 1:
                            InterfaceC0071g interfaceC0071g3 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            k3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            k3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            k3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g3.J(str4, list3, (C0072h) obj7);
                                b5 = AbstractC0462a.E(null);
                            } catch (Throwable th2) {
                                b5 = AbstractC0462a.b(th2);
                            }
                            dVar.e(b5);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0071g interfaceC0071g4 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            k3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            k3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b6 = AbstractC0462a.E(interfaceC0071g4.n(str5, (C0072h) obj9));
                            } catch (Throwable th3) {
                                b6 = AbstractC0462a.b(th3);
                            }
                            dVar.e(b6);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0071g interfaceC0071g5 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            k3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            k3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b7 = AbstractC0462a.E(interfaceC0071g5.m(str6, (C0072h) obj11));
                            } catch (Throwable th4) {
                                b7 = AbstractC0462a.b(th4);
                            }
                            dVar.e(b7);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0071g interfaceC0071g6 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            k3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            k3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b8 = AbstractC0462a.E(interfaceC0071g6.K(str7, (C0072h) obj13));
                            } catch (Throwable th5) {
                                b8 = AbstractC0462a.b(th5);
                            }
                            dVar.e(b8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0071g interfaceC0071g7 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            k3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            k3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b9 = AbstractC0462a.E(interfaceC0071g7.L(str8, (C0072h) obj15));
                            } catch (Throwable th6) {
                                b9 = AbstractC0462a.b(th6);
                            }
                            dVar.e(b9);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0071g interfaceC0071g8 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            k3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            k3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            k3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g8.D(str9, booleanValue, (C0072h) obj18);
                                b10 = AbstractC0462a.E(null);
                            } catch (Throwable th7) {
                                b10 = AbstractC0462a.b(th7);
                            }
                            dVar.e(b10);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0071g interfaceC0071g9 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            k3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            k3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b11 = AbstractC0462a.E(interfaceC0071g9.x(str10, (C0072h) obj20));
                            } catch (Throwable th8) {
                                b11 = AbstractC0462a.b(th8);
                            }
                            dVar.e(b11);
                            return;
                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0071g interfaceC0071g10 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            k3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            k3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b12 = AbstractC0462a.E(interfaceC0071g10.N(str11, (C0072h) obj22));
                            } catch (Throwable th9) {
                                b12 = AbstractC0462a.b(th9);
                            }
                            dVar.e(b12);
                            return;
                        case 9:
                            InterfaceC0071g interfaceC0071g11 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            k3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g11.h(list12, (C0072h) obj23);
                                b13 = AbstractC0462a.E(null);
                            } catch (Throwable th10) {
                                b13 = AbstractC0462a.b(th10);
                            }
                            dVar.e(b13);
                            return;
                        case 10:
                            InterfaceC0071g interfaceC0071g12 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            k3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b14 = AbstractC0462a.E(interfaceC0071g12.F(list14, (C0072h) obj24));
                            } catch (Throwable th11) {
                                b14 = AbstractC0462a.b(th11);
                            }
                            dVar.e(b14);
                            return;
                        case 11:
                            InterfaceC0071g interfaceC0071g13 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            k3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                b15 = AbstractC0462a.E(interfaceC0071g13.P(list16, (C0072h) obj25));
                            } catch (Throwable th12) {
                                b15 = AbstractC0462a.b(th12);
                            }
                            dVar.e(b15);
                            return;
                        case 12:
                            InterfaceC0071g interfaceC0071g14 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            k3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            k3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            k3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g14.O(str12, str13, (C0072h) obj28);
                                b16 = AbstractC0462a.E(null);
                            } catch (Throwable th13) {
                                b16 = AbstractC0462a.b(th13);
                            }
                            dVar.e(b16);
                            return;
                        case 13:
                            InterfaceC0071g interfaceC0071g15 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            k3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            k3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            k3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g15.p(str14, longValue, (C0072h) obj31);
                                b17 = AbstractC0462a.E(null);
                            } catch (Throwable th14) {
                                b17 = AbstractC0462a.b(th14);
                            }
                            dVar.e(b17);
                            return;
                        default:
                            InterfaceC0071g interfaceC0071g16 = interfaceC0071g;
                            k3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            k3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            k3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            k3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0071g16.G(str15, doubleValue, (C0072h) obj34);
                                b18 = AbstractC0462a.E(null);
                            } catch (Throwable th15) {
                                b18 = AbstractC0462a.b(th15);
                            }
                            dVar.e(b18);
                            return;
                    }
                }
            });
        }
    }
}
