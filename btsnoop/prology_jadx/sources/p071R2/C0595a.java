package p071R2;

/* renamed from: R2.a */
/* loaded from: classes.dex */
public class C0595a implements p034H2.InterfaceC0248b {

    /* renamed from: l */
    public android.content.SharedPreferences f1867l;

    /* renamed from: m */
    public final p046L1.C0363g f1868m = new p046L1.C0363g(11, false);

    /* renamed from: f */
    public static void m1122f(p047L2.InterfaceC0376f interfaceC0376f, final p071R2.C0595a c0595a) {
        p025F1.C0215g m827d = interfaceC0376f.m827d();
        p071R2.C0596b c0596b = p071R2.C0596b.f1869e;
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0596b, m827d);
        if (c0595a != null) {
            final int i4 = 0;
            c0291m.m701r(new p047L2.InterfaceC0372b(c0595a) { // from class: R2.c

                /* renamed from: m */
                public final /* synthetic */ p071R2.C0595a f1872m;

                {
                    this.f1872m = c0595a;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i4) {
                        case 0:
                            p071R2.C0595a c0595a2 = this.f1872m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0595a2.f1867l.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1792b0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p071R2.C0595a c0595a3 = this.f1872m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0595a3.f1867l.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1792b0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.C0595a c0595a4 = this.f1872m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0595a4.m1125e((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1792b0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.C0595a c0595a5 = this.f1872m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0595a5.f1867l.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1792b0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.C0595a c0595a6 = this.f1872m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0595a6.getClass();
                                java.lang.String d5 = java.lang.Double.toString(d4.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0595a6.f1867l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = p101a.AbstractC0936a.m1792b0(th5);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.C0595a c0595a7 = this.f1872m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0595a7.f1867l.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = p101a.AbstractC0936a.m1792b0(th6);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.C0595a c0595a8 = this.f1872m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0595a8.f1867l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0595a8.f1868m.m823n(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = p101a.AbstractC0936a.m1792b0(th7);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.C0595a c0595a9 = this.f1872m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0595a9.m1123a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = p101a.AbstractC0936a.m1792b0(th8);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                        default:
                            p071R2.C0595a c0595a10 = this.f1872m;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0595a10.m1124c((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = p101a.AbstractC0936a.m1792b0(th9);
                            }
                            c0026d.mo106e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0291m.m701r(null);
        }
        p035I.C0291m c0291m2 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0596b, m827d);
        if (c0595a != null) {
            final int i5 = 1;
            c0291m2.m701r(new p047L2.InterfaceC0372b(c0595a) { // from class: R2.c

                /* renamed from: m */
                public final /* synthetic */ p071R2.C0595a f1872m;

                {
                    this.f1872m = c0595a;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i5) {
                        case 0:
                            p071R2.C0595a c0595a2 = this.f1872m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0595a2.f1867l.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1792b0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p071R2.C0595a c0595a3 = this.f1872m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0595a3.f1867l.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1792b0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.C0595a c0595a4 = this.f1872m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0595a4.m1125e((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1792b0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.C0595a c0595a5 = this.f1872m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0595a5.f1867l.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1792b0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.C0595a c0595a6 = this.f1872m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0595a6.getClass();
                                java.lang.String d5 = java.lang.Double.toString(d4.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0595a6.f1867l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = p101a.AbstractC0936a.m1792b0(th5);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.C0595a c0595a7 = this.f1872m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0595a7.f1867l.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = p101a.AbstractC0936a.m1792b0(th6);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.C0595a c0595a8 = this.f1872m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0595a8.f1867l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0595a8.f1868m.m823n(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = p101a.AbstractC0936a.m1792b0(th7);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.C0595a c0595a9 = this.f1872m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0595a9.m1123a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = p101a.AbstractC0936a.m1792b0(th8);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                        default:
                            p071R2.C0595a c0595a10 = this.f1872m;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0595a10.m1124c((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = p101a.AbstractC0936a.m1792b0(th9);
                            }
                            c0026d.mo106e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0291m2.m701r(null);
        }
        p035I.C0291m c0291m3 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0596b, m827d);
        if (c0595a != null) {
            final int i6 = 2;
            c0291m3.m701r(new p047L2.InterfaceC0372b(c0595a) { // from class: R2.c

                /* renamed from: m */
                public final /* synthetic */ p071R2.C0595a f1872m;

                {
                    this.f1872m = c0595a;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i6) {
                        case 0:
                            p071R2.C0595a c0595a2 = this.f1872m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0595a2.f1867l.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1792b0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p071R2.C0595a c0595a3 = this.f1872m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0595a3.f1867l.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1792b0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.C0595a c0595a4 = this.f1872m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0595a4.m1125e((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1792b0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.C0595a c0595a5 = this.f1872m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0595a5.f1867l.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1792b0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.C0595a c0595a6 = this.f1872m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0595a6.getClass();
                                java.lang.String d5 = java.lang.Double.toString(d4.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0595a6.f1867l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = p101a.AbstractC0936a.m1792b0(th5);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.C0595a c0595a7 = this.f1872m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0595a7.f1867l.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = p101a.AbstractC0936a.m1792b0(th6);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.C0595a c0595a8 = this.f1872m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0595a8.f1867l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0595a8.f1868m.m823n(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = p101a.AbstractC0936a.m1792b0(th7);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.C0595a c0595a9 = this.f1872m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0595a9.m1123a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = p101a.AbstractC0936a.m1792b0(th8);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                        default:
                            p071R2.C0595a c0595a10 = this.f1872m;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0595a10.m1124c((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = p101a.AbstractC0936a.m1792b0(th9);
                            }
                            c0026d.mo106e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0291m3.m701r(null);
        }
        p035I.C0291m c0291m4 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0596b, m827d);
        if (c0595a != null) {
            final int i7 = 3;
            c0291m4.m701r(new p047L2.InterfaceC0372b(c0595a) { // from class: R2.c

                /* renamed from: m */
                public final /* synthetic */ p071R2.C0595a f1872m;

                {
                    this.f1872m = c0595a;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i7) {
                        case 0:
                            p071R2.C0595a c0595a2 = this.f1872m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0595a2.f1867l.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1792b0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p071R2.C0595a c0595a3 = this.f1872m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0595a3.f1867l.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1792b0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.C0595a c0595a4 = this.f1872m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0595a4.m1125e((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1792b0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.C0595a c0595a5 = this.f1872m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0595a5.f1867l.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1792b0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.C0595a c0595a6 = this.f1872m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0595a6.getClass();
                                java.lang.String d5 = java.lang.Double.toString(d4.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0595a6.f1867l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = p101a.AbstractC0936a.m1792b0(th5);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.C0595a c0595a7 = this.f1872m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0595a7.f1867l.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = p101a.AbstractC0936a.m1792b0(th6);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.C0595a c0595a8 = this.f1872m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0595a8.f1867l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0595a8.f1868m.m823n(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = p101a.AbstractC0936a.m1792b0(th7);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.C0595a c0595a9 = this.f1872m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0595a9.m1123a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = p101a.AbstractC0936a.m1792b0(th8);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                        default:
                            p071R2.C0595a c0595a10 = this.f1872m;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0595a10.m1124c((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = p101a.AbstractC0936a.m1792b0(th9);
                            }
                            c0026d.mo106e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0291m4.m701r(null);
        }
        p035I.C0291m c0291m5 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0596b, m827d);
        if (c0595a != null) {
            final int i8 = 4;
            c0291m5.m701r(new p047L2.InterfaceC0372b(c0595a) { // from class: R2.c

                /* renamed from: m */
                public final /* synthetic */ p071R2.C0595a f1872m;

                {
                    this.f1872m = c0595a;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i8) {
                        case 0:
                            p071R2.C0595a c0595a2 = this.f1872m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0595a2.f1867l.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1792b0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p071R2.C0595a c0595a3 = this.f1872m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0595a3.f1867l.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1792b0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.C0595a c0595a4 = this.f1872m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0595a4.m1125e((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1792b0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.C0595a c0595a5 = this.f1872m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0595a5.f1867l.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1792b0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.C0595a c0595a6 = this.f1872m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0595a6.getClass();
                                java.lang.String d5 = java.lang.Double.toString(d4.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0595a6.f1867l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = p101a.AbstractC0936a.m1792b0(th5);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.C0595a c0595a7 = this.f1872m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0595a7.f1867l.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = p101a.AbstractC0936a.m1792b0(th6);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.C0595a c0595a8 = this.f1872m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0595a8.f1867l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0595a8.f1868m.m823n(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = p101a.AbstractC0936a.m1792b0(th7);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.C0595a c0595a9 = this.f1872m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0595a9.m1123a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = p101a.AbstractC0936a.m1792b0(th8);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                        default:
                            p071R2.C0595a c0595a10 = this.f1872m;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0595a10.m1124c((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = p101a.AbstractC0936a.m1792b0(th9);
                            }
                            c0026d.mo106e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0291m5.m701r(null);
        }
        p035I.C0291m c0291m6 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0596b, m827d);
        if (c0595a != null) {
            final int i9 = 5;
            c0291m6.m701r(new p047L2.InterfaceC0372b(c0595a) { // from class: R2.c

                /* renamed from: m */
                public final /* synthetic */ p071R2.C0595a f1872m;

                {
                    this.f1872m = c0595a;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i9) {
                        case 0:
                            p071R2.C0595a c0595a2 = this.f1872m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0595a2.f1867l.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1792b0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p071R2.C0595a c0595a3 = this.f1872m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0595a3.f1867l.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1792b0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.C0595a c0595a4 = this.f1872m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0595a4.m1125e((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1792b0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.C0595a c0595a5 = this.f1872m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0595a5.f1867l.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1792b0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.C0595a c0595a6 = this.f1872m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0595a6.getClass();
                                java.lang.String d5 = java.lang.Double.toString(d4.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0595a6.f1867l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = p101a.AbstractC0936a.m1792b0(th5);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.C0595a c0595a7 = this.f1872m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0595a7.f1867l.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = p101a.AbstractC0936a.m1792b0(th6);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.C0595a c0595a8 = this.f1872m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0595a8.f1867l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0595a8.f1868m.m823n(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = p101a.AbstractC0936a.m1792b0(th7);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.C0595a c0595a9 = this.f1872m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0595a9.m1123a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = p101a.AbstractC0936a.m1792b0(th8);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                        default:
                            p071R2.C0595a c0595a10 = this.f1872m;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0595a10.m1124c((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = p101a.AbstractC0936a.m1792b0(th9);
                            }
                            c0026d.mo106e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0291m6.m701r(null);
        }
        p035I.C0291m c0291m7 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0596b, m827d);
        if (c0595a != null) {
            final int i10 = 6;
            c0291m7.m701r(new p047L2.InterfaceC0372b(c0595a) { // from class: R2.c

                /* renamed from: m */
                public final /* synthetic */ p071R2.C0595a f1872m;

                {
                    this.f1872m = c0595a;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i10) {
                        case 0:
                            p071R2.C0595a c0595a2 = this.f1872m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0595a2.f1867l.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1792b0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p071R2.C0595a c0595a3 = this.f1872m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0595a3.f1867l.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1792b0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.C0595a c0595a4 = this.f1872m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0595a4.m1125e((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1792b0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.C0595a c0595a5 = this.f1872m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0595a5.f1867l.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1792b0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.C0595a c0595a6 = this.f1872m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0595a6.getClass();
                                java.lang.String d5 = java.lang.Double.toString(d4.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0595a6.f1867l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = p101a.AbstractC0936a.m1792b0(th5);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.C0595a c0595a7 = this.f1872m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0595a7.f1867l.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = p101a.AbstractC0936a.m1792b0(th6);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.C0595a c0595a8 = this.f1872m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0595a8.f1867l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0595a8.f1868m.m823n(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = p101a.AbstractC0936a.m1792b0(th7);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.C0595a c0595a9 = this.f1872m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0595a9.m1123a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = p101a.AbstractC0936a.m1792b0(th8);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                        default:
                            p071R2.C0595a c0595a10 = this.f1872m;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0595a10.m1124c((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = p101a.AbstractC0936a.m1792b0(th9);
                            }
                            c0026d.mo106e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0291m7.m701r(null);
        }
        p035I.C0291m c0291m8 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0596b, m827d);
        if (c0595a != null) {
            final int i11 = 7;
            c0291m8.m701r(new p047L2.InterfaceC0372b(c0595a) { // from class: R2.c

                /* renamed from: m */
                public final /* synthetic */ p071R2.C0595a f1872m;

                {
                    this.f1872m = c0595a;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i11) {
                        case 0:
                            p071R2.C0595a c0595a2 = this.f1872m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0595a2.f1867l.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1792b0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p071R2.C0595a c0595a3 = this.f1872m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0595a3.f1867l.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1792b0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.C0595a c0595a4 = this.f1872m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0595a4.m1125e((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1792b0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.C0595a c0595a5 = this.f1872m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0595a5.f1867l.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1792b0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.C0595a c0595a6 = this.f1872m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0595a6.getClass();
                                java.lang.String d5 = java.lang.Double.toString(d4.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0595a6.f1867l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = p101a.AbstractC0936a.m1792b0(th5);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.C0595a c0595a7 = this.f1872m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0595a7.f1867l.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = p101a.AbstractC0936a.m1792b0(th6);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.C0595a c0595a8 = this.f1872m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0595a8.f1867l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0595a8.f1868m.m823n(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = p101a.AbstractC0936a.m1792b0(th7);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.C0595a c0595a9 = this.f1872m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0595a9.m1123a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = p101a.AbstractC0936a.m1792b0(th8);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                        default:
                            p071R2.C0595a c0595a10 = this.f1872m;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0595a10.m1124c((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = p101a.AbstractC0936a.m1792b0(th9);
                            }
                            c0026d.mo106e(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0291m8.m701r(null);
        }
        p035I.C0291m c0291m9 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0596b, m827d);
        if (c0595a == null) {
            c0291m9.m701r(null);
        } else {
            final int i12 = 8;
            c0291m9.m701r(new p047L2.InterfaceC0372b(c0595a) { // from class: R2.c

                /* renamed from: m */
                public final /* synthetic */ p071R2.C0595a f1872m;

                {
                    this.f1872m = c0595a;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i12) {
                        case 0:
                            p071R2.C0595a c0595a2 = this.f1872m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0595a2.f1867l.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = p101a.AbstractC0936a.m1792b0(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p071R2.C0595a c0595a3 = this.f1872m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0595a3.f1867l.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p101a.AbstractC0936a.m1792b0(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p071R2.C0595a c0595a4 = this.f1872m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0595a4.m1125e((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = p101a.AbstractC0936a.m1792b0(th3);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p071R2.C0595a c0595a5 = this.f1872m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0595a5.f1867l.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = p101a.AbstractC0936a.m1792b0(th4);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p071R2.C0595a c0595a6 = this.f1872m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d4 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0595a6.getClass();
                                java.lang.String d5 = java.lang.Double.toString(d4.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0595a6.f1867l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = p101a.AbstractC0936a.m1792b0(th5);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p071R2.C0595a c0595a7 = this.f1872m;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0595a7.f1867l.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = p101a.AbstractC0936a.m1792b0(th6);
                            }
                            c0026d.mo106e(arrayList10);
                            return;
                        case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                            p071R2.C0595a c0595a8 = this.f1872m;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0595a8.f1867l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0595a8.f1868m.m823n(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = p101a.AbstractC0936a.m1792b0(th7);
                            }
                            c0026d.mo106e(arrayList12);
                            return;
                        case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                            p071R2.C0595a c0595a9 = this.f1872m;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0595a9.m1123a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = p101a.AbstractC0936a.m1792b0(th8);
                            }
                            c0026d.mo106e(arrayList14);
                            return;
                        default:
                            p071R2.C0595a c0595a10 = this.f1872m;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0595a10.m1124c((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = p101a.AbstractC0936a.m1792b0(th9);
                            }
                            c0026d.mo106e(arrayList16);
                            return;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final java.lang.Boolean m1123a(java.lang.String str, java.util.List list) {
        android.content.SharedPreferences.Editor edit = this.f1867l.edit();
        java.util.Map<java.lang.String, ?> all = this.f1867l.getAll();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((java.lang.String) it.next());
        }
        return java.lang.Boolean.valueOf(edit.commit());
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        m1122f((p047L2.InterfaceC0376f) c0247a.f720m, null);
    }

    /* renamed from: c */
    public final java.util.HashMap m1124c(java.lang.String str, java.util.List list) {
        java.lang.Object obj;
        java.util.Set hashSet = list == null ? null : new java.util.HashSet(list);
        java.util.Map<java.lang.String, ?> all = this.f1867l.getAll();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                java.lang.Object obj2 = all.get(str2);
                java.util.Objects.requireNonNull(obj2);
                boolean z4 = obj2 instanceof java.lang.String;
                p046L1.C0363g c0363g = this.f1868m;
                if (z4) {
                    java.lang.String str3 = (java.lang.String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            java.lang.String substring = str3.substring(40);
                            c0363g.getClass();
                            try {
                                obj2 = (java.util.List) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(substring, 0))).readObject();
                            } catch (java.io.IOException | java.lang.ClassNotFoundException e4) {
                                throw new java.lang.RuntimeException(e4);
                            }
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new java.math.BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = java.lang.Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof java.util.Set) {
                        java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Set) obj2);
                        this.f1867l.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0363g.m823n(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        this.f1867l = ((android.content.Context) c0247a.f719l).getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            m1122f(interfaceC0376f, this);
        } catch (java.lang.Exception e4) {
            android.util.Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e4);
        }
    }

    /* renamed from: e */
    public final java.lang.Boolean m1125e(java.lang.String str, java.lang.String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new java.lang.RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return java.lang.Boolean.valueOf(this.f1867l.edit().putString(str, str2).commit());
    }
}
