package v2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import u.AbstractC0579g;
import w2.C0607b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f8664n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8665a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8667c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8668d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8669e;

    /* renamed from: h, reason: collision with root package name */
    public i f8672h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f8673i;

    /* renamed from: l, reason: collision with root package name */
    public Integer f8676l;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8670f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f8671g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f8674j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8675k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f8677m = 0;

    public f(Context context, String str, int i4, boolean z4, int i5) {
        this.f8669e = context;
        this.f8666b = str;
        this.f8665a = z4;
        this.f8667c = i4;
        this.f8668d = i5;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i4 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i4 = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                int type = cursor.getType(i5);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i5) : cursor.getString(i5) : Double.valueOf(cursor.getDouble(i5)) : Long.valueOf(cursor.getLong(i5)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public final void a() {
        HashMap hashMap = this.f8671g;
        if (!hashMap.isEmpty() && AbstractC0589a.a(this.f8668d)) {
            Log.d("Sqflite", h() + hashMap.size() + " cursor(s) are left opened");
        }
        this.f8673i.close();
    }

    public final void b(j jVar) {
        try {
            int i4 = jVar.f8686a;
            if (AbstractC0589a.b(this.f8668d)) {
                Log.d("Sqflite", h() + "closing cursor " + i4);
            }
            this.f8671g.remove(Integer.valueOf(i4));
            jVar.f8688c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(u.AbstractC0579g r11) {
        /*
            r10 = this;
            boolean r0 = r10.g(r11)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r11.k()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r11.c(r2)
            return r3
        L14:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r10.f8673i     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L9b
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r5 <= 0) goto L9b
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r5 == 0) goto L9b
            int r5 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            int r6 = r10.f8668d
            if (r5 != 0) goto L6b
            boolean r5 = v2.AbstractC0589a.a(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r5 == 0) goto L64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = r10.h()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            long r6 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.d(r4, r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            goto L64
        L5f:
            r11 = move-exception
            r2 = r0
            goto Lcb
        L62:
            r2 = move-exception
            goto Lc2
        L64:
            r11.c(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r0.close()
            return r3
        L6b:
            long r7 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            boolean r2 = v2.AbstractC0589a.a(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r2 == 0) goto L90
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r2.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = r10.h()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r2.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = "inserted "
            r2.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r2.append(r7)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.d(r4, r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
        L90:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r11.c(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r0.close()
            return r3
        L9b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = r10.h()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.e(r4, r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r11.c(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r0 == 0) goto Lbb
            r0.close()
        Lbb:
            return r3
        Lbc:
            r11 = move-exception
            goto Lcb
        Lbe:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
        Lc2:
            r10.i(r2, r11)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto Lca
            r0.close()
        Lca:
            return r1
        Lcb:
            if (r2 == 0) goto Ld0
            r2.close()
        Ld0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.f.d(u.g):boolean");
    }

    public final boolean e(AbstractC0579g abstractC0579g) {
        Cursor cursor;
        Integer num = (Integer) abstractC0579g.i("cursorPageSize");
        String str = (String) abstractC0579g.i("sql");
        final n nVar = new n(str, (List) abstractC0579g.i("arguments"));
        if (AbstractC0589a.a(this.f8668d)) {
            Log.d("Sqflite", h() + nVar);
        }
        j jVar = null;
        try {
            cursor = this.f8673i.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: v2.d
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str2, SQLiteQuery sQLiteQuery) {
                    List list = n.this.f8711b;
                    if (list != null) {
                        int size = list.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object a4 = n.a(list.get(i4));
                            int i5 = i4 + 1;
                            if (a4 == null) {
                                sQLiteQuery.bindNull(i5);
                            } else if (a4 instanceof byte[]) {
                                sQLiteQuery.bindBlob(i5, (byte[]) a4);
                            } else if (a4 instanceof Double) {
                                sQLiteQuery.bindDouble(i5, ((Double) a4).doubleValue());
                            } else if (a4 instanceof Integer) {
                                sQLiteQuery.bindLong(i5, ((Integer) a4).intValue());
                            } else if (a4 instanceof Long) {
                                sQLiteQuery.bindLong(i5, ((Long) a4).longValue());
                            } else if (a4 instanceof String) {
                                sQLiteQuery.bindString(i5, (String) a4);
                            } else {
                                if (!(a4 instanceof Boolean)) {
                                    throw new IllegalArgumentException("Could not bind " + a4 + " from index " + i4 + ": Supported types are null, byte[], double, long, boolean and String");
                                }
                                sQLiteQuery.bindLong(i5, ((Boolean) a4).booleanValue() ? 1L : 0L);
                            }
                            i4 = i5;
                        }
                    }
                    return new SQLiteCursor(sQLiteCursorDriver, str2, sQLiteQuery);
                }
            }, str, AbstractC0589a.f8659a, null);
            try {
                try {
                    HashMap c4 = c(cursor, num);
                    if (num != null && !cursor.isLast() && !cursor.isAfterLast()) {
                        int i4 = this.f8677m + 1;
                        this.f8677m = i4;
                        c4.put("cursorId", Integer.valueOf(i4));
                        j jVar2 = new j(i4, num.intValue(), cursor);
                        try {
                            this.f8671g.put(Integer.valueOf(i4), jVar2);
                            jVar = jVar2;
                        } catch (Exception e4) {
                            e = e4;
                            jVar = jVar2;
                            i(e, abstractC0579g);
                            if (jVar != null) {
                                b(jVar);
                            }
                            if (jVar != null || cursor == null) {
                                return false;
                            }
                            cursor.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            jVar = jVar2;
                            if (jVar == null && cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    abstractC0579g.c(c4);
                    if (jVar == null) {
                        cursor.close();
                    }
                    return true;
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final boolean f(AbstractC0579g abstractC0579g) {
        if (!g(abstractC0579g)) {
            return false;
        }
        Cursor cursor = null;
        try {
            if (abstractC0579g.k()) {
                abstractC0579g.c(null);
                return true;
            }
            try {
                Cursor rawQuery = this.f8673i.rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i4 = rawQuery.getInt(0);
                            if (AbstractC0589a.a(this.f8668d)) {
                                Log.d("Sqflite", h() + "changed " + i4);
                            }
                            abstractC0579g.c(Integer.valueOf(i4));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        cursor = rawQuery;
                        i(e, abstractC0579g);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", h() + "fail to read changes for Update/Delete");
                abstractC0579g.c(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean g(AbstractC0579g abstractC0579g) {
        String str = (String) abstractC0579g.i("sql");
        n nVar = new n(str, (List) abstractC0579g.i("arguments"));
        if (AbstractC0589a.a(this.f8668d)) {
            Log.d("Sqflite", h() + nVar);
        }
        Object i4 = abstractC0579g.i("inTransaction");
        Boolean bool = i4 instanceof Boolean ? (Boolean) i4 : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f8673i;
            ArrayList arrayList = new ArrayList();
            List list = nVar.f8711b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(n.a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.f8674j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.f8674j--;
                    }
                } finally {
                }
            }
            return true;
        } catch (Exception e4) {
            i(e4, abstractC0579g);
            return false;
        }
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("[");
        Thread currentThread = Thread.currentThread();
        sb.append(this.f8667c + "," + currentThread.getName() + "(" + currentThread.getId() + ")");
        sb.append("] ");
        return sb.toString();
    }

    public final void i(Exception exc, AbstractC0579g abstractC0579g) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            abstractC0579g.a("open_failed " + this.f8666b, null);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) abstractC0579g.i("sql");
            Collection collection = (List) abstractC0579g.i("arguments");
            if (collection == null) {
                collection = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sql", str);
            hashMap.put("arguments", collection);
            abstractC0579g.a(message, hashMap);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) abstractC0579g.i("sql");
        Collection collection2 = (List) abstractC0579g.i("arguments");
        if (collection2 == null) {
            collection2 = new ArrayList();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sql", str2);
        hashMap2.put("arguments", collection2);
        abstractC0579g.a(message2, hashMap2);
    }

    public final synchronized boolean j() {
        return this.f8674j > 0;
    }

    public final void k() {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (f8664n == null) {
            Context context = this.f8669e;
            boolean z4 = false;
            try {
                String packageName = context.getPackageName();
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = context.getPackageManager();
                    of = PackageManager.ApplicationInfoFlags.of(128L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of);
                } else {
                    applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
                }
                if (applicationInfo.metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z4 = true;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            f8664n = Boolean.valueOf(z4);
            if (z4 && AbstractC0589a.b(this.f8668d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        this.f8673i = SQLiteDatabase.openDatabase(this.f8666b, null, f8664n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(C0607b c0607b, Runnable runnable) {
        Integer num = (Integer) c0607b.i("transactionId");
        Integer num2 = this.f8676l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f8670f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new w2.d(runnable));
            return;
        }
        runnable.run();
        if (this.f8676l != null || arrayList.isEmpty()) {
            return;
        }
        this.f8672h.b(this, new F2.c(12, this));
    }
}
