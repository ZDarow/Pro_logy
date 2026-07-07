package p219z;

/* renamed from: z.b */
/* loaded from: classes.dex */
public abstract class AbstractC2431b {

    /* renamed from: a */
    public static final p165n.C1882i f9553a = new p165n.C1882i(2);

    /* renamed from: b */
    public static final p087W0.C0809d f9554b = new p087W0.C0809d(15);

    /* renamed from: a */
    public static p123e1.C1332f m4673a(android.content.Context context, java.util.List list) {
        android.os.Trace.beginSection(p101a.AbstractC0936a.m1788Z("FontProvider.getFontFamilyResult"));
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                p219z.C2432c c2432c = (p219z.C2432c) list.get(i4);
                android.content.pm.ProviderInfo m4674b = m4674b(context.getPackageManager(), c2432c, context.getResources());
                if (m4674b == null) {
                    p123e1.C1332f c1332f = new p123e1.C1332f();
                    android.os.Trace.endSection();
                    return c1332f;
                }
                arrayList.add(m4675c(context, c2432c, m4674b.authority));
            }
            p123e1.C1332f c1332f2 = new p123e1.C1332f(arrayList);
            android.os.Trace.endSection();
            return c1332f2;
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, z.a] */
    /* renamed from: b */
    public static android.content.pm.ProviderInfo m4674b(android.content.pm.PackageManager packageManager, p219z.C2432c c2432c, android.content.res.Resources resources) {
        android.os.Trace.beginSection(p101a.AbstractC0936a.m1788Z("FontProvider.getProvider"));
        try {
            java.util.List list = c2432c.f9558d;
            java.lang.String str = c2432c.f9555a;
            java.lang.String str2 = c2432c.f9556b;
            if (list == null) {
                list = p080U1.AbstractC0748a.m1389x(resources, 0);
            }
            ?? obj = new java.lang.Object();
            obj.f9550a = str;
            obj.f9551b = str2;
            obj.f9552c = list;
            p165n.C1882i c1882i = f9553a;
            android.content.pm.ProviderInfo providerInfo = (android.content.pm.ProviderInfo) c1882i.m3862a(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            android.content.pm.ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new android.content.pm.PackageManager.NameNotFoundException("No package found for authority: ".concat(str));
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new android.content.pm.PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.content.pm.Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            p087W0.C0809d c0809d = f9554b;
            java.util.Collections.sort(arrayList, c0809d);
            for (int i4 = 0; i4 < list.size(); i4++) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList((java.util.Collection) list.get(i4));
                java.util.Collections.sort(arrayList2, c0809d);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        if (!java.util.Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                            break;
                        }
                    }
                    c1882i.m3863b(obj, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            android.os.Trace.endSection();
            return null;
        } finally {
            android.os.Trace.endSection();
        }
    }

    /* renamed from: c */
    public static p219z.C2437h[] m4675c(android.content.Context context, p219z.C2432c c2432c, java.lang.String str) {
        android.os.Trace.beginSection(p101a.AbstractC0936a.m1788Z("FontProvider.query"));
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.net.Uri build = new android.net.Uri.Builder().scheme("content").authority(str).build();
            android.net.Uri build2 = new android.net.Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            android.database.Cursor cursor = null;
            try {
                java.lang.String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                android.os.Trace.beginSection(p101a.AbstractC0936a.m1788Z("ContentQueryWrapper.query"));
                try {
                    java.lang.String[] strArr2 = {c2432c.f9557c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (android.os.RemoteException e4) {
                            android.util.Log.w("FontsProvider", "Unable to query the content provider", e4);
                        }
                    }
                    android.os.Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new p219z.C2437h(columnIndex3 == -1 ? android.content.ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : android.content.ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i4));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (p219z.C2437h[]) arrayList.toArray(new p219z.C2437h[0]);
                } finally {
                    android.os.Trace.endSection();
                }
            } catch (java.lang.Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            throw th2;
        }
    }
}
