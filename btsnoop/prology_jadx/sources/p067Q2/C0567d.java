package p067Q2;

/* renamed from: Q2.d */
/* loaded from: classes.dex */
public class C0567d implements p034H2.InterfaceC0248b {

    /* renamed from: l */
    public android.content.Context f1770l;

    /* renamed from: c */
    public static void m1084c(p047L2.InterfaceC0376f interfaceC0376f, final p067Q2.C0567d c0567d) {
        p025F1.C0215g m827d = interfaceC0376f.m827d();
        p067Q2.C0565b c0565b = p067Q2.C0565b.f1767d;
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", c0565b, m827d);
        if (c0567d != null) {
            final int i4 = 0;
            c0291m.m701r(new p047L2.InterfaceC0372b(c0567d) { // from class: Q2.a

                /* renamed from: m */
                public final /* synthetic */ p067Q2.C0567d f1766m;

                {
                    this.f1766m = c0567d;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i4) {
                        case 0:
                            p067Q2.C0567d c0567d2 = this.f1766m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c0567d2.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th) {
                                arrayList = p080U1.AbstractC0748a.m1366N(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p067Q2.C0567d c0567d3 = this.f1766m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            try {
                                android.content.Context context = c0567d3.f1770l;
                                java.io.File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new java.io.File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p080U1.AbstractC0748a.m1366N(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p067Q2.C0567d c0567d4 = this.f1766m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                android.content.Context context2 = c0567d4.f1770l;
                                java.io.File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new java.io.File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p080U1.AbstractC0748a.m1366N(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p067Q2.C0567d c0567d5 = this.f1766m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0567d5.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p080U1.AbstractC0748a.m1366N(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p067Q2.C0567d c0567d6 = this.f1766m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            try {
                                java.lang.String str = null;
                                java.io.File externalFilesDir = c0567d6.f1770l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p080U1.AbstractC0748a.m1366N(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p067Q2.C0567d c0567d7 = this.f1766m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                c0567d7.getClass();
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                for (java.io.File file : c0567d7.f1770l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p080U1.AbstractC0748a.m1366N(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            p067Q2.C0567d c0567d8 = this.f1766m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            try {
                                arrayList8.add(0, c0567d8.m1085a((p067Q2.EnumC0566c) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p080U1.AbstractC0748a.m1366N(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0291m.m701r(null);
        }
        p035I.C0291m c0291m2 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", c0565b, interfaceC0376f.m827d());
        if (c0567d != null) {
            final int i5 = 1;
            c0291m2.m701r(new p047L2.InterfaceC0372b(c0567d) { // from class: Q2.a

                /* renamed from: m */
                public final /* synthetic */ p067Q2.C0567d f1766m;

                {
                    this.f1766m = c0567d;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i5) {
                        case 0:
                            p067Q2.C0567d c0567d2 = this.f1766m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c0567d2.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th) {
                                arrayList = p080U1.AbstractC0748a.m1366N(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p067Q2.C0567d c0567d3 = this.f1766m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            try {
                                android.content.Context context = c0567d3.f1770l;
                                java.io.File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new java.io.File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p080U1.AbstractC0748a.m1366N(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p067Q2.C0567d c0567d4 = this.f1766m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                android.content.Context context2 = c0567d4.f1770l;
                                java.io.File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new java.io.File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p080U1.AbstractC0748a.m1366N(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p067Q2.C0567d c0567d5 = this.f1766m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0567d5.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p080U1.AbstractC0748a.m1366N(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p067Q2.C0567d c0567d6 = this.f1766m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            try {
                                java.lang.String str = null;
                                java.io.File externalFilesDir = c0567d6.f1770l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p080U1.AbstractC0748a.m1366N(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p067Q2.C0567d c0567d7 = this.f1766m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                c0567d7.getClass();
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                for (java.io.File file : c0567d7.f1770l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p080U1.AbstractC0748a.m1366N(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            p067Q2.C0567d c0567d8 = this.f1766m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            try {
                                arrayList8.add(0, c0567d8.m1085a((p067Q2.EnumC0566c) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p080U1.AbstractC0748a.m1366N(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0291m2.m701r(null);
        }
        p035I.C0291m c0291m3 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", c0565b, interfaceC0376f.m827d());
        if (c0567d != null) {
            final int i6 = 2;
            c0291m3.m701r(new p047L2.InterfaceC0372b(c0567d) { // from class: Q2.a

                /* renamed from: m */
                public final /* synthetic */ p067Q2.C0567d f1766m;

                {
                    this.f1766m = c0567d;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i6) {
                        case 0:
                            p067Q2.C0567d c0567d2 = this.f1766m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c0567d2.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th) {
                                arrayList = p080U1.AbstractC0748a.m1366N(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p067Q2.C0567d c0567d3 = this.f1766m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            try {
                                android.content.Context context = c0567d3.f1770l;
                                java.io.File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new java.io.File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p080U1.AbstractC0748a.m1366N(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p067Q2.C0567d c0567d4 = this.f1766m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                android.content.Context context2 = c0567d4.f1770l;
                                java.io.File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new java.io.File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p080U1.AbstractC0748a.m1366N(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p067Q2.C0567d c0567d5 = this.f1766m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0567d5.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p080U1.AbstractC0748a.m1366N(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p067Q2.C0567d c0567d6 = this.f1766m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            try {
                                java.lang.String str = null;
                                java.io.File externalFilesDir = c0567d6.f1770l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p080U1.AbstractC0748a.m1366N(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p067Q2.C0567d c0567d7 = this.f1766m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                c0567d7.getClass();
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                for (java.io.File file : c0567d7.f1770l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p080U1.AbstractC0748a.m1366N(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            p067Q2.C0567d c0567d8 = this.f1766m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            try {
                                arrayList8.add(0, c0567d8.m1085a((p067Q2.EnumC0566c) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p080U1.AbstractC0748a.m1366N(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0291m3.m701r(null);
        }
        p035I.C0291m c0291m4 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", c0565b, interfaceC0376f.m827d());
        if (c0567d != null) {
            final int i7 = 3;
            c0291m4.m701r(new p047L2.InterfaceC0372b(c0567d) { // from class: Q2.a

                /* renamed from: m */
                public final /* synthetic */ p067Q2.C0567d f1766m;

                {
                    this.f1766m = c0567d;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i7) {
                        case 0:
                            p067Q2.C0567d c0567d2 = this.f1766m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c0567d2.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th) {
                                arrayList = p080U1.AbstractC0748a.m1366N(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p067Q2.C0567d c0567d3 = this.f1766m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            try {
                                android.content.Context context = c0567d3.f1770l;
                                java.io.File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new java.io.File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p080U1.AbstractC0748a.m1366N(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p067Q2.C0567d c0567d4 = this.f1766m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                android.content.Context context2 = c0567d4.f1770l;
                                java.io.File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new java.io.File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p080U1.AbstractC0748a.m1366N(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p067Q2.C0567d c0567d5 = this.f1766m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0567d5.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p080U1.AbstractC0748a.m1366N(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p067Q2.C0567d c0567d6 = this.f1766m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            try {
                                java.lang.String str = null;
                                java.io.File externalFilesDir = c0567d6.f1770l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p080U1.AbstractC0748a.m1366N(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p067Q2.C0567d c0567d7 = this.f1766m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                c0567d7.getClass();
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                for (java.io.File file : c0567d7.f1770l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p080U1.AbstractC0748a.m1366N(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            p067Q2.C0567d c0567d8 = this.f1766m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            try {
                                arrayList8.add(0, c0567d8.m1085a((p067Q2.EnumC0566c) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p080U1.AbstractC0748a.m1366N(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0291m4.m701r(null);
        }
        p035I.C0291m c0291m5 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", c0565b, interfaceC0376f.m827d());
        if (c0567d != null) {
            final int i8 = 4;
            c0291m5.m701r(new p047L2.InterfaceC0372b(c0567d) { // from class: Q2.a

                /* renamed from: m */
                public final /* synthetic */ p067Q2.C0567d f1766m;

                {
                    this.f1766m = c0567d;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i8) {
                        case 0:
                            p067Q2.C0567d c0567d2 = this.f1766m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c0567d2.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th) {
                                arrayList = p080U1.AbstractC0748a.m1366N(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p067Q2.C0567d c0567d3 = this.f1766m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            try {
                                android.content.Context context = c0567d3.f1770l;
                                java.io.File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new java.io.File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p080U1.AbstractC0748a.m1366N(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p067Q2.C0567d c0567d4 = this.f1766m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                android.content.Context context2 = c0567d4.f1770l;
                                java.io.File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new java.io.File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p080U1.AbstractC0748a.m1366N(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p067Q2.C0567d c0567d5 = this.f1766m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0567d5.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p080U1.AbstractC0748a.m1366N(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p067Q2.C0567d c0567d6 = this.f1766m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            try {
                                java.lang.String str = null;
                                java.io.File externalFilesDir = c0567d6.f1770l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p080U1.AbstractC0748a.m1366N(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p067Q2.C0567d c0567d7 = this.f1766m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                c0567d7.getClass();
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                for (java.io.File file : c0567d7.f1770l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p080U1.AbstractC0748a.m1366N(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            p067Q2.C0567d c0567d8 = this.f1766m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            try {
                                arrayList8.add(0, c0567d8.m1085a((p067Q2.EnumC0566c) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p080U1.AbstractC0748a.m1366N(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0291m5.m701r(null);
        }
        p035I.C0291m c0291m6 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", c0565b, interfaceC0376f.m827d());
        if (c0567d != null) {
            final int i9 = 5;
            c0291m6.m701r(new p047L2.InterfaceC0372b(c0567d) { // from class: Q2.a

                /* renamed from: m */
                public final /* synthetic */ p067Q2.C0567d f1766m;

                {
                    this.f1766m = c0567d;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i9) {
                        case 0:
                            p067Q2.C0567d c0567d2 = this.f1766m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c0567d2.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th) {
                                arrayList = p080U1.AbstractC0748a.m1366N(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p067Q2.C0567d c0567d3 = this.f1766m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            try {
                                android.content.Context context = c0567d3.f1770l;
                                java.io.File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new java.io.File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p080U1.AbstractC0748a.m1366N(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p067Q2.C0567d c0567d4 = this.f1766m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                android.content.Context context2 = c0567d4.f1770l;
                                java.io.File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new java.io.File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p080U1.AbstractC0748a.m1366N(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p067Q2.C0567d c0567d5 = this.f1766m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0567d5.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p080U1.AbstractC0748a.m1366N(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p067Q2.C0567d c0567d6 = this.f1766m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            try {
                                java.lang.String str = null;
                                java.io.File externalFilesDir = c0567d6.f1770l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p080U1.AbstractC0748a.m1366N(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p067Q2.C0567d c0567d7 = this.f1766m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                c0567d7.getClass();
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                for (java.io.File file : c0567d7.f1770l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p080U1.AbstractC0748a.m1366N(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            p067Q2.C0567d c0567d8 = this.f1766m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            try {
                                arrayList8.add(0, c0567d8.m1085a((p067Q2.EnumC0566c) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p080U1.AbstractC0748a.m1366N(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0291m6.m701r(null);
        }
        p035I.C0291m c0291m7 = new p035I.C0291m(interfaceC0376f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", c0565b, interfaceC0376f.m827d());
        if (c0567d == null) {
            c0291m7.m701r(null);
        } else {
            final int i10 = 6;
            c0291m7.m701r(new p047L2.InterfaceC0372b(c0567d) { // from class: Q2.a

                /* renamed from: m */
                public final /* synthetic */ p067Q2.C0567d f1766m;

                {
                    this.f1766m = c0567d;
                }

                @Override // p047L2.InterfaceC0372b
                /* renamed from: e */
                public final void mo270e(java.lang.Object obj, p008B1.C0026d c0026d) {
                    switch (i10) {
                        case 0:
                            p067Q2.C0567d c0567d2 = this.f1766m;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, c0567d2.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th) {
                                arrayList = p080U1.AbstractC0748a.m1366N(th);
                            }
                            c0026d.mo106e(arrayList);
                            return;
                        case 1:
                            p067Q2.C0567d c0567d3 = this.f1766m;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            try {
                                android.content.Context context = c0567d3.f1770l;
                                java.io.File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new java.io.File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = p080U1.AbstractC0748a.m1366N(th2);
                            }
                            c0026d.mo106e(arrayList2);
                            return;
                        case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                            p067Q2.C0567d c0567d4 = this.f1766m;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                android.content.Context context2 = c0567d4.f1770l;
                                java.io.File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new java.io.File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (java.lang.Throwable th3) {
                                arrayList3 = p080U1.AbstractC0748a.m1366N(th3);
                            }
                            c0026d.mo106e(arrayList3);
                            return;
                        case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                            p067Q2.C0567d c0567d5 = this.f1766m;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            try {
                                arrayList4.add(0, c0567d5.f1770l.getCacheDir().getPath());
                            } catch (java.lang.Throwable th4) {
                                arrayList4 = p080U1.AbstractC0748a.m1366N(th4);
                            }
                            c0026d.mo106e(arrayList4);
                            return;
                        case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                            p067Q2.C0567d c0567d6 = this.f1766m;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            try {
                                java.lang.String str = null;
                                java.io.File externalFilesDir = c0567d6.f1770l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (java.lang.Throwable th5) {
                                arrayList5 = p080U1.AbstractC0748a.m1366N(th5);
                            }
                            c0026d.mo106e(arrayList5);
                            return;
                        case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                            p067Q2.C0567d c0567d7 = this.f1766m;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            try {
                                c0567d7.getClass();
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                for (java.io.File file : c0567d7.f1770l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (java.lang.Throwable th6) {
                                arrayList6 = p080U1.AbstractC0748a.m1366N(th6);
                            }
                            c0026d.mo106e(arrayList6);
                            return;
                        default:
                            p067Q2.C0567d c0567d8 = this.f1766m;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            try {
                                arrayList8.add(0, c0567d8.m1085a((p067Q2.EnumC0566c) ((java.util.ArrayList) obj).get(0)));
                            } catch (java.lang.Throwable th7) {
                                arrayList8 = p080U1.AbstractC0748a.m1366N(th7);
                            }
                            c0026d.mo106e(arrayList8);
                            return;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final java.util.ArrayList m1085a(p067Q2.EnumC0566c enumC0566c) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Context context = this.f1770l;
        switch (enumC0566c.ordinal()) {
            case 0:
                str = null;
                break;
            case 1:
                str = "music";
                break;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "podcasts";
                break;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "ringtones";
                break;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                str = "alarms";
                break;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                str = "notifications";
                break;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "pictures";
                break;
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "movies";
                break;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                str = "downloads";
                break;
            case 9:
                str = "dcim";
                break;
            case 10:
                str = "documents";
                break;
            default:
                throw new java.lang.RuntimeException("Unrecognized directory: " + enumC0566c);
        }
        for (java.io.File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        m1084c((p047L2.InterfaceC0376f) c0247a.f720m, null);
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        try {
            m1084c((p047L2.InterfaceC0376f) c0247a.f720m, this);
        } catch (java.lang.Exception e4) {
            android.util.Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e4);
        }
        this.f1770l = (android.content.Context) c0247a.f719l;
    }
}
