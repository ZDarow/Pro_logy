package p204v2;

/* renamed from: v2.f */
/* loaded from: classes.dex */
public final class C2276f {

    /* renamed from: n */
    public static java.lang.Boolean f9014n;

    /* renamed from: a */
    public final boolean f9015a;

    /* renamed from: b */
    public final java.lang.String f9016b;

    /* renamed from: c */
    public final int f9017c;

    /* renamed from: d */
    public final int f9018d;

    /* renamed from: e */
    public final android.content.Context f9019e;

    /* renamed from: h */
    public p204v2.InterfaceC2279i f9022h;

    /* renamed from: i */
    public android.database.sqlite.SQLiteDatabase f9023i;

    /* renamed from: l */
    public java.lang.Integer f9026l;

    /* renamed from: f */
    public final java.util.ArrayList f9020f = new java.util.ArrayList();

    /* renamed from: g */
    public final java.util.HashMap f9021g = new java.util.HashMap();

    /* renamed from: j */
    public int f9024j = 0;

    /* renamed from: k */
    public int f9025k = 0;

    /* renamed from: m */
    public int f9027m = 0;

    public C2276f(android.content.Context context, java.lang.String str, int i4, boolean z4, int i5) {
        this.f9019e = context;
        this.f9016b = str;
        this.f9015a = z4;
        this.f9017c = i4;
        this.f9018d = i5;
    }

    /* renamed from: c */
    public static java.util.HashMap m4464c(android.database.Cursor cursor, java.lang.Integer num) {
        java.util.HashMap hashMap = null;
        java.util.ArrayList arrayList = null;
        int i4 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new java.util.ArrayList();
                hashMap = new java.util.HashMap();
                i4 = cursor.getColumnCount();
                hashMap.put("columns", java.util.Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                int type = cursor.getType(i5);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i5) : cursor.getString(i5) : java.lang.Double.valueOf(cursor.getDouble(i5)) : java.lang.Long.valueOf(cursor.getLong(i5)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new java.util.HashMap() : hashMap;
    }

    /* renamed from: a */
    public final void m4465a() {
        java.util.HashMap hashMap = this.f9021g;
        if (!hashMap.isEmpty() && p204v2.AbstractC2271a.m4460a(this.f9018d)) {
            android.util.Log.d("Sqflite", m4471h() + hashMap.size() + " cursor(s) are left opened");
        }
        this.f9023i.close();
    }

    /* renamed from: b */
    public final void m4466b(p204v2.C2280j c2280j) {
        try {
            int i4 = c2280j.f9036a;
            if (p204v2.AbstractC2271a.m4461b(this.f9018d)) {
                android.util.Log.d("Sqflite", m4471h() + "closing cursor " + i4);
            }
            this.f9021g.remove(java.lang.Integer.valueOf(i4));
            c2280j.f9038c.close();
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4467d(p196u.AbstractC2212g r11) {
        /*
            r10 = this;
            boolean r0 = r10.m4470g(r11)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r11.mo4414k()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r11.mo687c(r2)
            return r3
        L14:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r10.f9023i     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L9b
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r5 <= 0) goto L9b
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r5 == 0) goto L9b
            int r5 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            int r6 = r10.f9018d
            if (r5 != 0) goto L6b
            boolean r5 = p204v2.AbstractC2271a.m4460a(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r5 == 0) goto L64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = r10.m4471h()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
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
            r11.mo687c(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r0.close()
            return r3
        L6b:
            long r7 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            boolean r2 = p204v2.AbstractC2271a.m4460a(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r2 == 0) goto L90
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r2.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = r10.m4471h()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r2.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = "inserted "
            r2.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r2.append(r7)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.d(r4, r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
        L90:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r11.mo687c(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r0.close()
            return r3
        L9b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = r10.m4471h()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.e(r4, r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r11.mo687c(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
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
            r10.m4472i(r2, r11)     // Catch: java.lang.Throwable -> L5f
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
        throw new UnsupportedOperationException("Method not decompiled: p204v2.C2276f.m4467d(u.g):boolean");
    }

    /* renamed from: e */
    public final boolean m4468e(p196u.AbstractC2212g abstractC2212g) {
        android.database.Cursor cursor;
        java.lang.Integer num = (java.lang.Integer) abstractC2212g.mo4412i("cursorPageSize");
        java.lang.String str = (java.lang.String) abstractC2212g.mo4412i("sql");
        final p204v2.C2284n c2284n = new p204v2.C2284n(str, (java.util.List) abstractC2212g.mo4412i("arguments"));
        if (p204v2.AbstractC2271a.m4460a(this.f9018d)) {
            android.util.Log.d("Sqflite", m4471h() + c2284n);
        }
        p204v2.C2280j c2280j = null;
        try {
            cursor = this.f9023i.rawQueryWithFactory(new android.database.sqlite.SQLiteDatabase.CursorFactory() { // from class: v2.d
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str2, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                    java.util.List list = p204v2.C2284n.this.f9064b;
                    if (list != null) {
                        int size = list.size();
                        int i4 = 0;
                        while (i4 < size) {
                            java.lang.Object m4482a = p204v2.C2284n.m4482a(list.get(i4));
                            int i5 = i4 + 1;
                            if (m4482a == null) {
                                sQLiteQuery.bindNull(i5);
                            } else if (m4482a instanceof byte[]) {
                                sQLiteQuery.bindBlob(i5, (byte[]) m4482a);
                            } else if (m4482a instanceof java.lang.Double) {
                                sQLiteQuery.bindDouble(i5, ((java.lang.Double) m4482a).doubleValue());
                            } else if (m4482a instanceof java.lang.Integer) {
                                sQLiteQuery.bindLong(i5, ((java.lang.Integer) m4482a).intValue());
                            } else if (m4482a instanceof java.lang.Long) {
                                sQLiteQuery.bindLong(i5, ((java.lang.Long) m4482a).longValue());
                            } else if (m4482a instanceof java.lang.String) {
                                sQLiteQuery.bindString(i5, (java.lang.String) m4482a);
                            } else {
                                if (!(m4482a instanceof java.lang.Boolean)) {
                                    throw new java.lang.IllegalArgumentException("Could not bind " + m4482a + " from index " + i4 + ": Supported types are null, byte[], double, long, boolean and String");
                                }
                                sQLiteQuery.bindLong(i5, ((java.lang.Boolean) m4482a).booleanValue() ? 1L : 0L);
                            }
                            i4 = i5;
                        }
                    }
                    return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str2, sQLiteQuery);
                }
            }, str, p204v2.AbstractC2271a.f9009a, null);
            try {
                try {
                    java.util.HashMap m4464c = m4464c(cursor, num);
                    if (num != null && !cursor.isLast() && !cursor.isAfterLast()) {
                        int i4 = this.f9027m + 1;
                        this.f9027m = i4;
                        m4464c.put("cursorId", java.lang.Integer.valueOf(i4));
                        p204v2.C2280j c2280j2 = new p204v2.C2280j(i4, num.intValue(), cursor);
                        try {
                            this.f9021g.put(java.lang.Integer.valueOf(i4), c2280j2);
                            c2280j = c2280j2;
                        } catch (java.lang.Exception e4) {
                            e = e4;
                            c2280j = c2280j2;
                            m4472i(e, abstractC2212g);
                            if (c2280j != null) {
                                m4466b(c2280j);
                            }
                            if (c2280j != null || cursor == null) {
                                return false;
                            }
                            cursor.close();
                            return false;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            c2280j = c2280j2;
                            if (c2280j == null && cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    abstractC2212g.mo687c(m4464c);
                    if (c2280j == null) {
                        cursor.close();
                    }
                    return true;
                } catch (java.lang.Exception e5) {
                    e = e5;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception e6) {
            e = e6;
            cursor = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* renamed from: f */
    public final boolean m4469f(p196u.AbstractC2212g abstractC2212g) {
        if (!m4470g(abstractC2212g)) {
            return false;
        }
        android.database.Cursor cursor = null;
        try {
            if (abstractC2212g.mo4414k()) {
                abstractC2212g.mo687c(null);
                return true;
            }
            try {
                android.database.Cursor rawQuery = this.f9023i.rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i4 = rawQuery.getInt(0);
                            if (p204v2.AbstractC2271a.m4460a(this.f9018d)) {
                                android.util.Log.d("Sqflite", m4471h() + "changed " + i4);
                            }
                            abstractC2212g.mo687c(java.lang.Integer.valueOf(i4));
                            rawQuery.close();
                            return true;
                        }
                    } catch (java.lang.Exception e4) {
                        e = e4;
                        cursor = rawQuery;
                        m4472i(e, abstractC2212g);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                android.util.Log.e("Sqflite", m4471h() + "fail to read changes for Update/Delete");
                abstractC2212g.mo687c(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (java.lang.Exception e5) {
                e = e5;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: g */
    public final boolean m4470g(p196u.AbstractC2212g abstractC2212g) {
        java.lang.String str = (java.lang.String) abstractC2212g.mo4412i("sql");
        p204v2.C2284n c2284n = new p204v2.C2284n(str, (java.util.List) abstractC2212g.mo4412i("arguments"));
        if (p204v2.AbstractC2271a.m4460a(this.f9018d)) {
            android.util.Log.d("Sqflite", m4471h() + c2284n);
        }
        java.lang.Object mo4412i = abstractC2212g.mo4412i("inTransaction");
        java.lang.Boolean bool = mo4412i instanceof java.lang.Boolean ? (java.lang.Boolean) mo4412i : null;
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.f9023i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List list = c2284n.f9064b;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(p204v2.C2284n.m4482a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new java.lang.Object[0]));
            synchronized (this) {
                try {
                    if (java.lang.Boolean.TRUE.equals(bool)) {
                        this.f9024j++;
                    } else if (java.lang.Boolean.FALSE.equals(bool)) {
                        this.f9024j--;
                    }
                } finally {
                }
            }
            return true;
        } catch (java.lang.Exception e4) {
            m4472i(e4, abstractC2212g);
            return false;
        }
    }

    /* renamed from: h */
    public final java.lang.String m4471h() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        sb.append(this.f9017c + "," + currentThread.getName() + "(" + currentThread.getId() + ")");
        sb.append("] ");
        return sb.toString();
    }

    /* renamed from: i */
    public final void m4472i(java.lang.Exception exc, p196u.AbstractC2212g abstractC2212g) {
        if (exc instanceof android.database.sqlite.SQLiteCantOpenDatabaseException) {
            abstractC2212g.mo686a("open_failed " + this.f9016b, null);
            return;
        }
        if (exc instanceof android.database.SQLException) {
            java.lang.String message = exc.getMessage();
            java.lang.String str = (java.lang.String) abstractC2212g.mo4412i("sql");
            java.util.Collection collection = (java.util.List) abstractC2212g.mo4412i("arguments");
            if (collection == null) {
                collection = new java.util.ArrayList();
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("sql", str);
            hashMap.put("arguments", collection);
            abstractC2212g.mo686a(message, hashMap);
            return;
        }
        java.lang.String message2 = exc.getMessage();
        java.lang.String str2 = (java.lang.String) abstractC2212g.mo4412i("sql");
        java.util.Collection collection2 = (java.util.List) abstractC2212g.mo4412i("arguments");
        if (collection2 == null) {
            collection2 = new java.util.ArrayList();
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("sql", str2);
        hashMap2.put("arguments", collection2);
        abstractC2212g.mo686a(message2, hashMap2);
    }

    /* renamed from: j */
    public final synchronized boolean m4473j() {
        return this.f9024j > 0;
    }

    /* renamed from: k */
    public final void m4474k() {
        android.content.pm.ApplicationInfo applicationInfo;
        android.content.pm.PackageManager.ApplicationInfoFlags of;
        if (f9014n == null) {
            android.content.Context context = this.f9019e;
            boolean z4 = false;
            try {
                java.lang.String packageName = context.getPackageName();
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    android.content.pm.PackageManager packageManager = context.getPackageManager();
                    of = android.content.pm.PackageManager.ApplicationInfoFlags.of(128L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of);
                } else {
                    applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
                }
                if (applicationInfo.metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z4 = true;
                }
            } catch (java.lang.Exception e4) {
                e4.printStackTrace();
            }
            f9014n = java.lang.Boolean.valueOf(z4);
            if (z4 && p204v2.AbstractC2271a.m4461b(this.f9018d)) {
                android.util.Log.d("Sqflite", m4471h() + "[sqflite] WAL enabled");
            }
        }
        this.f9023i = android.database.sqlite.SQLiteDatabase.openDatabase(this.f9016b, null, f9014n.booleanValue() ? 805306368 : 268435456);
    }

    /* renamed from: l */
    public final void m4475l(p208w2.C2336b c2336b, java.lang.Runnable runnable) {
        java.lang.Integer num = (java.lang.Integer) c2336b.mo4412i("transactionId");
        java.lang.Integer num2 = this.f9026l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        java.util.ArrayList arrayList = this.f9020f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new p208w2.C2338d(runnable));
            return;
        }
        runnable.run();
        if (this.f9026l != null || arrayList.isEmpty()) {
            return;
        }
        this.f9022h.m4478b(this, new p026F2.RunnableC0226c(12, this));
    }
}
