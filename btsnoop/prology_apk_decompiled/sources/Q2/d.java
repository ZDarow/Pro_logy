package Q2;

import F1.g;
import I.C0044m;
import L.k;
import L2.f;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d implements H2.b {

    /* renamed from: l, reason: collision with root package name */
    public Context f1711l;

    public static void c(f fVar, final d dVar) {
        g d4 = fVar.d();
        b bVar = b.f1708d;
        C0044m c0044m = new C0044m(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, d4);
        if (dVar != null) {
            final int i4 = 0;
            c0044m.r(new L2.b(dVar) { // from class: Q2.a

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f1707m;

                {
                    this.f1707m = dVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar2) {
                    switch (i4) {
                        case 0:
                            d dVar3 = this.f1707m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar3.f1711l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = U1.a.N(th);
                            }
                            dVar2.e(arrayList);
                            return;
                        case 1:
                            d dVar4 = this.f1707m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar4.f1711l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = U1.a.N(th2);
                            }
                            dVar2.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar5 = this.f1707m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar5.f1711l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = U1.a.N(th3);
                            }
                            dVar2.e(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar6 = this.f1707m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar6.f1711l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = U1.a.N(th4);
                            }
                            dVar2.e(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar7 = this.f1707m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar7.f1711l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = U1.a.N(th5);
                            }
                            dVar2.e(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar8 = this.f1707m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar8.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar8.f1711l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = U1.a.N(th6);
                            }
                            dVar2.e(arrayList6);
                            return;
                        default:
                            d dVar9 = this.f1707m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar9.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = U1.a.N(th7);
                            }
                            dVar2.e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0044m.r(null);
        }
        C0044m c0044m2 = new C0044m(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, fVar.d());
        if (dVar != null) {
            final int i5 = 1;
            c0044m2.r(new L2.b(dVar) { // from class: Q2.a

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f1707m;

                {
                    this.f1707m = dVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar2) {
                    switch (i5) {
                        case 0:
                            d dVar3 = this.f1707m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar3.f1711l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = U1.a.N(th);
                            }
                            dVar2.e(arrayList);
                            return;
                        case 1:
                            d dVar4 = this.f1707m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar4.f1711l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = U1.a.N(th2);
                            }
                            dVar2.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar5 = this.f1707m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar5.f1711l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = U1.a.N(th3);
                            }
                            dVar2.e(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar6 = this.f1707m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar6.f1711l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = U1.a.N(th4);
                            }
                            dVar2.e(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar7 = this.f1707m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar7.f1711l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = U1.a.N(th5);
                            }
                            dVar2.e(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar8 = this.f1707m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar8.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar8.f1711l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = U1.a.N(th6);
                            }
                            dVar2.e(arrayList6);
                            return;
                        default:
                            d dVar9 = this.f1707m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar9.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = U1.a.N(th7);
                            }
                            dVar2.e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0044m2.r(null);
        }
        C0044m c0044m3 = new C0044m(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, fVar.d());
        if (dVar != null) {
            final int i6 = 2;
            c0044m3.r(new L2.b(dVar) { // from class: Q2.a

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f1707m;

                {
                    this.f1707m = dVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar2) {
                    switch (i6) {
                        case 0:
                            d dVar3 = this.f1707m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar3.f1711l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = U1.a.N(th);
                            }
                            dVar2.e(arrayList);
                            return;
                        case 1:
                            d dVar4 = this.f1707m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar4.f1711l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = U1.a.N(th2);
                            }
                            dVar2.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar5 = this.f1707m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar5.f1711l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = U1.a.N(th3);
                            }
                            dVar2.e(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar6 = this.f1707m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar6.f1711l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = U1.a.N(th4);
                            }
                            dVar2.e(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar7 = this.f1707m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar7.f1711l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = U1.a.N(th5);
                            }
                            dVar2.e(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar8 = this.f1707m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar8.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar8.f1711l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = U1.a.N(th6);
                            }
                            dVar2.e(arrayList6);
                            return;
                        default:
                            d dVar9 = this.f1707m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar9.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = U1.a.N(th7);
                            }
                            dVar2.e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0044m3.r(null);
        }
        C0044m c0044m4 = new C0044m(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, fVar.d());
        if (dVar != null) {
            final int i7 = 3;
            c0044m4.r(new L2.b(dVar) { // from class: Q2.a

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f1707m;

                {
                    this.f1707m = dVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar2) {
                    switch (i7) {
                        case 0:
                            d dVar3 = this.f1707m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar3.f1711l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = U1.a.N(th);
                            }
                            dVar2.e(arrayList);
                            return;
                        case 1:
                            d dVar4 = this.f1707m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar4.f1711l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = U1.a.N(th2);
                            }
                            dVar2.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar5 = this.f1707m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar5.f1711l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = U1.a.N(th3);
                            }
                            dVar2.e(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar6 = this.f1707m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar6.f1711l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = U1.a.N(th4);
                            }
                            dVar2.e(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar7 = this.f1707m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar7.f1711l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = U1.a.N(th5);
                            }
                            dVar2.e(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar8 = this.f1707m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar8.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar8.f1711l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = U1.a.N(th6);
                            }
                            dVar2.e(arrayList6);
                            return;
                        default:
                            d dVar9 = this.f1707m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar9.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = U1.a.N(th7);
                            }
                            dVar2.e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0044m4.r(null);
        }
        C0044m c0044m5 = new C0044m(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, fVar.d());
        if (dVar != null) {
            final int i8 = 4;
            c0044m5.r(new L2.b(dVar) { // from class: Q2.a

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f1707m;

                {
                    this.f1707m = dVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar2) {
                    switch (i8) {
                        case 0:
                            d dVar3 = this.f1707m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar3.f1711l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = U1.a.N(th);
                            }
                            dVar2.e(arrayList);
                            return;
                        case 1:
                            d dVar4 = this.f1707m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar4.f1711l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = U1.a.N(th2);
                            }
                            dVar2.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar5 = this.f1707m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar5.f1711l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = U1.a.N(th3);
                            }
                            dVar2.e(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar6 = this.f1707m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar6.f1711l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = U1.a.N(th4);
                            }
                            dVar2.e(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar7 = this.f1707m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar7.f1711l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = U1.a.N(th5);
                            }
                            dVar2.e(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar8 = this.f1707m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar8.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar8.f1711l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = U1.a.N(th6);
                            }
                            dVar2.e(arrayList6);
                            return;
                        default:
                            d dVar9 = this.f1707m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar9.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = U1.a.N(th7);
                            }
                            dVar2.e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0044m5.r(null);
        }
        C0044m c0044m6 = new C0044m(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, fVar.d());
        if (dVar != null) {
            final int i9 = 5;
            c0044m6.r(new L2.b(dVar) { // from class: Q2.a

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f1707m;

                {
                    this.f1707m = dVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar2) {
                    switch (i9) {
                        case 0:
                            d dVar3 = this.f1707m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar3.f1711l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = U1.a.N(th);
                            }
                            dVar2.e(arrayList);
                            return;
                        case 1:
                            d dVar4 = this.f1707m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar4.f1711l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = U1.a.N(th2);
                            }
                            dVar2.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar5 = this.f1707m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar5.f1711l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = U1.a.N(th3);
                            }
                            dVar2.e(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar6 = this.f1707m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar6.f1711l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = U1.a.N(th4);
                            }
                            dVar2.e(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar7 = this.f1707m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar7.f1711l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = U1.a.N(th5);
                            }
                            dVar2.e(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar8 = this.f1707m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar8.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar8.f1711l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = U1.a.N(th6);
                            }
                            dVar2.e(arrayList6);
                            return;
                        default:
                            d dVar9 = this.f1707m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar9.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = U1.a.N(th7);
                            }
                            dVar2.e(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0044m6.r(null);
        }
        C0044m c0044m7 = new C0044m(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, fVar.d());
        if (dVar == null) {
            c0044m7.r(null);
        } else {
            final int i10 = 6;
            c0044m7.r(new L2.b(dVar) { // from class: Q2.a

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f1707m;

                {
                    this.f1707m = dVar;
                }

                @Override // L2.b
                public final void e(Object obj, B1.d dVar2) {
                    switch (i10) {
                        case 0:
                            d dVar3 = this.f1707m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar3.f1711l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = U1.a.N(th);
                            }
                            dVar2.e(arrayList);
                            return;
                        case 1:
                            d dVar4 = this.f1707m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar4.f1711l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = U1.a.N(th2);
                            }
                            dVar2.e(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            d dVar5 = this.f1707m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar5.f1711l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = U1.a.N(th3);
                            }
                            dVar2.e(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar6 = this.f1707m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar6.f1711l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = U1.a.N(th4);
                            }
                            dVar2.e(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar7 = this.f1707m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = dVar7.f1711l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = U1.a.N(th5);
                            }
                            dVar2.e(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar8 = this.f1707m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar8.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar8.f1711l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = U1.a.N(th6);
                            }
                            dVar2.e(arrayList6);
                            return;
                        default:
                            d dVar9 = this.f1707m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar9.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = U1.a.N(th7);
                            }
                            dVar2.e(arrayList8);
                            return;
                    }
                }
            });
        }
    }

    public final ArrayList a(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f1711l;
        switch (cVar.ordinal()) {
            case 0:
                str = null;
                break;
            case 1:
                str = "music";
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "podcasts";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "ringtones";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "alarms";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "notifications";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "pictures";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "movies";
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                str = "downloads";
                break;
            case 9:
                str = "dcim";
                break;
            case 10:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        c((f) aVar.f709m, null);
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        try {
            c((f) aVar.f709m, this);
        } catch (Exception e4) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e4);
        }
        this.f1711l = (Context) aVar.f708l;
    }
}
