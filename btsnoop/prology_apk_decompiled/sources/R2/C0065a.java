package R2;

import I.C0044m;
import a.AbstractC0110a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: R2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0065a implements H2.b {

    /* renamed from: l, reason: collision with root package name */
    public SharedPreferences f1801l;

    /* renamed from: m, reason: collision with root package name */
    public final L1.g f1802m = new L1.g(11, false);

    public static void f(L2.f fVar, final C0065a c0065a) {
        F1.g d4 = fVar.d();
        C0066b c0066b = C0066b.f1803e;
        C0044m c0044m = new C0044m(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0066b, d4);
        if (c0065a != null) {
            final int i4 = 0;
            c0044m.r(new L2.b(c0065a) { // from class: R2.c

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0065a f1806m;

                {
                    this.f1806m = c0065a;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    switch (i4) {
                        case 0:
                            C0065a c0065a2 = this.f1806m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0065a2.f1801l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.b0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            C0065a c0065a3 = this.f1806m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0065a3.f1801l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.b0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0065a c0065a4 = this.f1806m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0065a4.e((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.b0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0065a c0065a5 = this.f1806m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0065a5.f1801l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.b0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            C0065a c0065a6 = this.f1806m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0065a6.getClass();
                                String d6 = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0065a6.f1801l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d6).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0110a.b0(th5);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            C0065a c0065a7 = this.f1806m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0065a7.f1801l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0110a.b0(th6);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0065a c0065a8 = this.f1806m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0065a8.f1801l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0065a8.f1802m.n(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0110a.b0(th7);
                            }
                            dVar.e(arrayList12);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0065a c0065a9 = this.f1806m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0065a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0110a.b0(th8);
                            }
                            dVar.e(arrayList14);
                            return;
                        default:
                            C0065a c0065a10 = this.f1806m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0065a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0110a.b0(th9);
                            }
                            dVar.e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0044m.r(null);
        }
        C0044m c0044m2 = new C0044m(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0066b, d4);
        if (c0065a != null) {
            final int i5 = 1;
            c0044m2.r(new L2.b(c0065a) { // from class: R2.c

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0065a f1806m;

                {
                    this.f1806m = c0065a;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    switch (i5) {
                        case 0:
                            C0065a c0065a2 = this.f1806m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0065a2.f1801l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.b0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            C0065a c0065a3 = this.f1806m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0065a3.f1801l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.b0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0065a c0065a4 = this.f1806m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0065a4.e((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.b0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0065a c0065a5 = this.f1806m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0065a5.f1801l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.b0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            C0065a c0065a6 = this.f1806m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0065a6.getClass();
                                String d6 = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0065a6.f1801l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d6).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0110a.b0(th5);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            C0065a c0065a7 = this.f1806m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0065a7.f1801l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0110a.b0(th6);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0065a c0065a8 = this.f1806m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0065a8.f1801l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0065a8.f1802m.n(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0110a.b0(th7);
                            }
                            dVar.e(arrayList12);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0065a c0065a9 = this.f1806m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0065a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0110a.b0(th8);
                            }
                            dVar.e(arrayList14);
                            return;
                        default:
                            C0065a c0065a10 = this.f1806m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0065a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0110a.b0(th9);
                            }
                            dVar.e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0044m2.r(null);
        }
        C0044m c0044m3 = new C0044m(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0066b, d4);
        if (c0065a != null) {
            final int i6 = 2;
            c0044m3.r(new L2.b(c0065a) { // from class: R2.c

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0065a f1806m;

                {
                    this.f1806m = c0065a;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    switch (i6) {
                        case 0:
                            C0065a c0065a2 = this.f1806m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0065a2.f1801l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.b0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            C0065a c0065a3 = this.f1806m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0065a3.f1801l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.b0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0065a c0065a4 = this.f1806m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0065a4.e((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.b0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0065a c0065a5 = this.f1806m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0065a5.f1801l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.b0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            C0065a c0065a6 = this.f1806m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0065a6.getClass();
                                String d6 = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0065a6.f1801l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d6).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0110a.b0(th5);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            C0065a c0065a7 = this.f1806m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0065a7.f1801l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0110a.b0(th6);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0065a c0065a8 = this.f1806m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0065a8.f1801l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0065a8.f1802m.n(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0110a.b0(th7);
                            }
                            dVar.e(arrayList12);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0065a c0065a9 = this.f1806m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0065a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0110a.b0(th8);
                            }
                            dVar.e(arrayList14);
                            return;
                        default:
                            C0065a c0065a10 = this.f1806m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0065a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0110a.b0(th9);
                            }
                            dVar.e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0044m3.r(null);
        }
        C0044m c0044m4 = new C0044m(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0066b, d4);
        if (c0065a != null) {
            final int i7 = 3;
            c0044m4.r(new L2.b(c0065a) { // from class: R2.c

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0065a f1806m;

                {
                    this.f1806m = c0065a;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    switch (i7) {
                        case 0:
                            C0065a c0065a2 = this.f1806m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0065a2.f1801l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.b0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            C0065a c0065a3 = this.f1806m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0065a3.f1801l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.b0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0065a c0065a4 = this.f1806m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0065a4.e((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.b0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0065a c0065a5 = this.f1806m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0065a5.f1801l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.b0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            C0065a c0065a6 = this.f1806m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0065a6.getClass();
                                String d6 = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0065a6.f1801l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d6).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0110a.b0(th5);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            C0065a c0065a7 = this.f1806m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0065a7.f1801l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0110a.b0(th6);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0065a c0065a8 = this.f1806m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0065a8.f1801l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0065a8.f1802m.n(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0110a.b0(th7);
                            }
                            dVar.e(arrayList12);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0065a c0065a9 = this.f1806m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0065a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0110a.b0(th8);
                            }
                            dVar.e(arrayList14);
                            return;
                        default:
                            C0065a c0065a10 = this.f1806m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0065a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0110a.b0(th9);
                            }
                            dVar.e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0044m4.r(null);
        }
        C0044m c0044m5 = new C0044m(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0066b, d4);
        if (c0065a != null) {
            final int i8 = 4;
            c0044m5.r(new L2.b(c0065a) { // from class: R2.c

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0065a f1806m;

                {
                    this.f1806m = c0065a;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    switch (i8) {
                        case 0:
                            C0065a c0065a2 = this.f1806m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0065a2.f1801l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.b0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            C0065a c0065a3 = this.f1806m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0065a3.f1801l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.b0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0065a c0065a4 = this.f1806m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0065a4.e((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.b0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0065a c0065a5 = this.f1806m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0065a5.f1801l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.b0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            C0065a c0065a6 = this.f1806m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0065a6.getClass();
                                String d6 = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0065a6.f1801l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d6).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0110a.b0(th5);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            C0065a c0065a7 = this.f1806m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0065a7.f1801l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0110a.b0(th6);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0065a c0065a8 = this.f1806m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0065a8.f1801l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0065a8.f1802m.n(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0110a.b0(th7);
                            }
                            dVar.e(arrayList12);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0065a c0065a9 = this.f1806m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0065a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0110a.b0(th8);
                            }
                            dVar.e(arrayList14);
                            return;
                        default:
                            C0065a c0065a10 = this.f1806m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0065a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0110a.b0(th9);
                            }
                            dVar.e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0044m5.r(null);
        }
        C0044m c0044m6 = new C0044m(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0066b, d4);
        if (c0065a != null) {
            final int i9 = 5;
            c0044m6.r(new L2.b(c0065a) { // from class: R2.c

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0065a f1806m;

                {
                    this.f1806m = c0065a;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    switch (i9) {
                        case 0:
                            C0065a c0065a2 = this.f1806m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0065a2.f1801l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.b0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            C0065a c0065a3 = this.f1806m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0065a3.f1801l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.b0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0065a c0065a4 = this.f1806m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0065a4.e((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.b0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0065a c0065a5 = this.f1806m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0065a5.f1801l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.b0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            C0065a c0065a6 = this.f1806m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0065a6.getClass();
                                String d6 = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0065a6.f1801l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d6).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0110a.b0(th5);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            C0065a c0065a7 = this.f1806m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0065a7.f1801l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0110a.b0(th6);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0065a c0065a8 = this.f1806m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0065a8.f1801l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0065a8.f1802m.n(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0110a.b0(th7);
                            }
                            dVar.e(arrayList12);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0065a c0065a9 = this.f1806m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0065a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0110a.b0(th8);
                            }
                            dVar.e(arrayList14);
                            return;
                        default:
                            C0065a c0065a10 = this.f1806m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0065a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0110a.b0(th9);
                            }
                            dVar.e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0044m6.r(null);
        }
        C0044m c0044m7 = new C0044m(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0066b, d4);
        if (c0065a != null) {
            final int i10 = 6;
            c0044m7.r(new L2.b(c0065a) { // from class: R2.c

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0065a f1806m;

                {
                    this.f1806m = c0065a;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    switch (i10) {
                        case 0:
                            C0065a c0065a2 = this.f1806m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0065a2.f1801l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.b0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            C0065a c0065a3 = this.f1806m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0065a3.f1801l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.b0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0065a c0065a4 = this.f1806m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0065a4.e((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.b0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0065a c0065a5 = this.f1806m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0065a5.f1801l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.b0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            C0065a c0065a6 = this.f1806m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0065a6.getClass();
                                String d6 = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0065a6.f1801l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d6).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0110a.b0(th5);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            C0065a c0065a7 = this.f1806m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0065a7.f1801l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0110a.b0(th6);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0065a c0065a8 = this.f1806m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0065a8.f1801l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0065a8.f1802m.n(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0110a.b0(th7);
                            }
                            dVar.e(arrayList12);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0065a c0065a9 = this.f1806m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0065a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0110a.b0(th8);
                            }
                            dVar.e(arrayList14);
                            return;
                        default:
                            C0065a c0065a10 = this.f1806m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0065a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0110a.b0(th9);
                            }
                            dVar.e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0044m7.r(null);
        }
        C0044m c0044m8 = new C0044m(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0066b, d4);
        if (c0065a != null) {
            final int i11 = 7;
            c0044m8.r(new L2.b(c0065a) { // from class: R2.c

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0065a f1806m;

                {
                    this.f1806m = c0065a;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    switch (i11) {
                        case 0:
                            C0065a c0065a2 = this.f1806m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0065a2.f1801l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.b0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            C0065a c0065a3 = this.f1806m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0065a3.f1801l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.b0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0065a c0065a4 = this.f1806m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0065a4.e((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.b0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0065a c0065a5 = this.f1806m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0065a5.f1801l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.b0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            C0065a c0065a6 = this.f1806m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0065a6.getClass();
                                String d6 = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0065a6.f1801l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d6).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0110a.b0(th5);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            C0065a c0065a7 = this.f1806m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0065a7.f1801l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0110a.b0(th6);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0065a c0065a8 = this.f1806m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0065a8.f1801l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0065a8.f1802m.n(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0110a.b0(th7);
                            }
                            dVar.e(arrayList12);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0065a c0065a9 = this.f1806m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0065a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0110a.b0(th8);
                            }
                            dVar.e(arrayList14);
                            return;
                        default:
                            C0065a c0065a10 = this.f1806m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0065a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0110a.b0(th9);
                            }
                            dVar.e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0044m8.r(null);
        }
        C0044m c0044m9 = new C0044m(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0066b, d4);
        if (c0065a == null) {
            c0044m9.r(null);
        } else {
            final int i12 = 8;
            c0044m9.r(new L2.b(c0065a) { // from class: R2.c

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0065a f1806m;

                {
                    this.f1806m = c0065a;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar) {
                    switch (i12) {
                        case 0:
                            C0065a c0065a2 = this.f1806m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0065a2.f1801l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0110a.b0(th);
                            }
                            dVar.e(arrayList);
                            return;
                        case 1:
                            C0065a c0065a3 = this.f1806m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0065a3.f1801l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0110a.b0(th2);
                            }
                            dVar.e(arrayList2);
                            return;
                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0065a c0065a4 = this.f1806m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0065a4.e((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0110a.b0(th3);
                            }
                            dVar.e(arrayList4);
                            return;
                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0065a c0065a5 = this.f1806m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0065a5.f1801l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0110a.b0(th4);
                            }
                            dVar.e(arrayList6);
                            return;
                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                            C0065a c0065a6 = this.f1806m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0065a6.getClass();
                                String d6 = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0065a6.f1801l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d6).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0110a.b0(th5);
                            }
                            dVar.e(arrayList8);
                            return;
                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                            C0065a c0065a7 = this.f1806m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0065a7.f1801l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0110a.b0(th6);
                            }
                            dVar.e(arrayList10);
                            return;
                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0065a c0065a8 = this.f1806m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0065a8.f1801l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0065a8.f1802m.n(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0110a.b0(th7);
                            }
                            dVar.e(arrayList12);
                            return;
                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0065a c0065a9 = this.f1806m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0065a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0110a.b0(th8);
                            }
                            dVar.e(arrayList14);
                            return;
                        default:
                            C0065a c0065a10 = this.f1806m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0065a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0110a.b0(th9);
                            }
                            dVar.e(arrayList16);
                            return;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f1801l.edit();
        Map<String, ?> all = this.f1801l.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        f((L2.f) aVar.f709m, null);
    }

    public final HashMap c(String str, List list) {
        Object obj;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f1801l.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z4 = obj2 instanceof String;
                L1.g gVar = this.f1802m;
                if (z4) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            String substring = str3.substring(40);
                            gVar.getClass();
                            try {
                                obj2 = (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(substring, 0))).readObject();
                            } catch (IOException | ClassNotFoundException e4) {
                                throw new RuntimeException(e4);
                            }
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        this.f1801l.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + gVar.n(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        L2.f fVar = (L2.f) aVar.f709m;
        this.f1801l = ((Context) aVar.f708l).getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            f(fVar, this);
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e4);
        }
    }

    public final Boolean e(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f1801l.edit().putString(str, str2).commit());
    }
}
