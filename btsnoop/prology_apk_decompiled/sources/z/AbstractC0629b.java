package z;

import a.AbstractC0110a;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import e1.C0262f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n.C0446i;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0629b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0446i f9189a = new C0446i(2);

    /* renamed from: b, reason: collision with root package name */
    public static final W0.d f9190b = new W0.d(15);

    public static C0262f a(Context context, List list) {
        Trace.beginSection(AbstractC0110a.Z("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                C0630c c0630c = (C0630c) list.get(i4);
                ProviderInfo b4 = b(context.getPackageManager(), c0630c, context.getResources());
                if (b4 == null) {
                    C0262f c0262f = new C0262f();
                    Trace.endSection();
                    return c0262f;
                }
                arrayList.add(c(context, c0630c, b4.authority));
            }
            C0262f c0262f2 = new C0262f(arrayList);
            Trace.endSection();
            return c0262f2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, z.a] */
    public static ProviderInfo b(PackageManager packageManager, C0630c c0630c, Resources resources) {
        Trace.beginSection(AbstractC0110a.Z("FontProvider.getProvider"));
        try {
            List list = c0630c.f9194d;
            String str = c0630c.f9191a;
            String str2 = c0630c.f9192b;
            if (list == null) {
                list = U1.a.x(resources, 0);
            }
            ?? obj = new Object();
            obj.f9186a = str;
            obj.f9187b = str2;
            obj.f9188c = list;
            C0446i c0446i = f9189a;
            ProviderInfo providerInfo = (ProviderInfo) c0446i.a(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(str));
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            W0.d dVar = f9190b;
            Collections.sort(arrayList, dVar);
            for (int i4 = 0; i4 < list.size(); i4++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i4));
                Collections.sort(arrayList2, dVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                            break;
                        }
                    }
                    c0446i.b(obj, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static C0635h[] c(Context context, C0630c c0630c, String str) {
        Trace.beginSection(AbstractC0110a.Z("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(AbstractC0110a.Z("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {c0630c.f9193c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e4) {
                            Log.w("FontsProvider", "Unable to query the content provider", e4);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new C0635h(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i4));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (C0635h[]) arrayList.toArray(new C0635h[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
