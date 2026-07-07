package p204v2;

/* renamed from: v2.m */
/* loaded from: classes.dex */
public class C2283m implements p034H2.InterfaceC0248b, p047L2.InterfaceC0385o {

    /* renamed from: s */
    public static java.lang.String f9056s;

    /* renamed from: w */
    public static p204v2.InterfaceC2279i f9060w;

    /* renamed from: l */
    public android.content.Context f9061l;

    /* renamed from: m */
    public p035I.C0291m f9062m;

    /* renamed from: n */
    public static final java.util.HashMap f9051n = new java.util.HashMap();

    /* renamed from: o */
    public static final java.util.HashMap f9052o = new java.util.HashMap();

    /* renamed from: p */
    public static final java.lang.Object f9053p = new java.lang.Object();

    /* renamed from: q */
    public static final java.lang.Object f9054q = new java.lang.Object();

    /* renamed from: r */
    public static int f9055r = 0;

    /* renamed from: t */
    public static int f9057t = 0;

    /* renamed from: u */
    public static int f9058u = 1;

    /* renamed from: v */
    public static int f9059v = 0;

    /* renamed from: a */
    public static void m4479a(p204v2.C2283m c2283m, p204v2.C2276f c2276f) {
        c2283m.getClass();
        try {
            if (p204v2.AbstractC2271a.m4460a(c2276f.f9018d)) {
                android.util.Log.d("Sqflite", c2276f.m4471h() + "closing database ");
            }
            c2276f.m4465a();
        } catch (java.lang.Exception e4) {
            android.util.Log.e("Sqflite", "error " + e4 + " while closing database " + f9059v);
        }
        synchronized (f9053p) {
            try {
                if (f9052o.isEmpty() && f9060w != null) {
                    if (p204v2.AbstractC2271a.m4460a(c2276f.f9018d)) {
                        android.util.Log.d("Sqflite", c2276f.m4471h() + "stopping thread");
                    }
                    f9060w.mo727c();
                    f9060w = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public static p204v2.C2276f m4480c(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        java.lang.Integer num = (java.lang.Integer) c0384n.m839a("id");
        int intValue = num.intValue();
        p204v2.C2276f c2276f = (p204v2.C2276f) f9052o.get(num);
        if (c2276f != null) {
            return c2276f;
        }
        c0335k.mo741a("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    /* renamed from: e */
    public static java.util.HashMap m4481e(int i4, boolean z4, boolean z5) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("id", java.lang.Integer.valueOf(i4));
        if (z4) {
            hashMap.put("recovered", java.lang.Boolean.TRUE);
        }
        if (z5) {
            hashMap.put("recoveredInTransaction", java.lang.Boolean.TRUE);
        }
        return hashMap;
    }

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public final void mo42I(final p047L2.C0384n c0384n, final p043K2.C0335k c0335k) {
        final int i4;
        p204v2.C2276f c2276f;
        p204v2.C2276f c2276f2;
        java.lang.String str = c0384n.f1133a;
        str.getClass();
        p204v2.C2276f c2276f3 = null;
        boolean z4 = false;
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c4 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c4 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c4 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str.equals("androidSetLocale")) {
                    c4 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c4 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c4 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c4 = '\b';
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c4 = '\t';
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c4 = '\n';
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c4 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c4 = '\f';
                    break;
                }
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c4 = '\r';
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c4 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c4 = 15;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                p204v2.C2276f m4480c = m4480c(c0384n, c0335k);
                if (m4480c == null) {
                    return;
                }
                f9060w.m4478b(m4480c, new p204v2.RunnableC2281k(c0384n, c0335k, m4480c, 4));
                return;
            case 1:
                java.lang.Integer num = (java.lang.Integer) c0384n.m839a("id");
                int intValue = num.intValue();
                p204v2.C2276f m4480c2 = m4480c(c0384n, c0335k);
                if (m4480c2 == null) {
                    return;
                }
                if (p204v2.AbstractC2271a.m4460a(m4480c2.f9018d)) {
                    android.util.Log.d("Sqflite", m4480c2.m4471h() + "closing " + intValue + " " + m4480c2.f9016b);
                }
                java.lang.String str2 = m4480c2.f9016b;
                synchronized (f9053p) {
                    try {
                        f9052o.remove(num);
                        if (m4480c2.f9015a) {
                            f9051n.remove(str2);
                        }
                    } finally {
                    }
                }
                f9060w.m4478b(m4480c2, new p064Q.RunnableC0536h(this, m4480c2, c0335k, 1));
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object m839a = c0384n.m839a("androidThreadPriority");
                if (m839a != null) {
                    f9057t = ((java.lang.Integer) m839a).intValue();
                }
                java.lang.Object m839a2 = c0384n.m839a("androidThreadCount");
                if (m839a2 != null && !m839a2.equals(java.lang.Integer.valueOf(f9058u))) {
                    f9058u = ((java.lang.Integer) m839a2).intValue();
                    p204v2.InterfaceC2279i interfaceC2279i = f9060w;
                    if (interfaceC2279i != null) {
                        interfaceC2279i.mo727c();
                        f9060w = null;
                    }
                }
                java.lang.Integer num2 = (java.lang.Integer) c0384n.m839a("logLevel");
                if (num2 != null) {
                    f9055r = num2.intValue();
                }
                c0335k.mo742b(null);
                return;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                p204v2.C2276f m4480c3 = m4480c(c0384n, c0335k);
                if (m4480c3 == null) {
                    return;
                }
                f9060w.m4478b(m4480c3, new p204v2.RunnableC2281k(c0384n, c0335k, m4480c3, 1));
                return;
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                p204v2.C2276f m4480c4 = m4480c(c0384n, c0335k);
                if (m4480c4 == null) {
                    return;
                }
                f9060w.m4478b(m4480c4, new p204v2.RunnableC2281k(c0384n, c0335k, m4480c4, 5));
                return;
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                p204v2.C2276f m4480c5 = m4480c(c0384n, c0335k);
                if (m4480c5 == null) {
                    return;
                }
                f9060w.m4478b(m4480c5, new p204v2.RunnableC2281k(c0384n, m4480c5, c0335k));
                return;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.String str3 = (java.lang.String) c0384n.m839a("path");
                synchronized (f9053p) {
                    try {
                        if (p204v2.AbstractC2271a.m4461b(f9055r)) {
                            android.util.Log.d("Sqflite", "Look for " + str3 + " in " + f9051n.keySet());
                        }
                        java.util.HashMap hashMap = f9051n;
                        java.lang.Integer num3 = (java.lang.Integer) hashMap.get(str3);
                        if (num3 != null) {
                            java.util.HashMap hashMap2 = f9052o;
                            p204v2.C2276f c2276f4 = (p204v2.C2276f) hashMap2.get(num3);
                            if (c2276f4 != null && c2276f4.f9023i.isOpen()) {
                                if (p204v2.AbstractC2271a.m4461b(f9055r)) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(c2276f4.m4471h());
                                    sb.append("found single instance ");
                                    sb.append(c2276f4.m4473j() ? "(in transaction) " : "");
                                    sb.append(num3);
                                    sb.append(" ");
                                    sb.append(str3);
                                    android.util.Log.d("Sqflite", sb.toString());
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str3);
                                c2276f3 = c2276f4;
                            }
                        }
                    } finally {
                    }
                }
                p064Q.RunnableC0544p runnableC0544p = new p064Q.RunnableC0544p(this, c2276f3, str3, c0335k, 3);
                p204v2.InterfaceC2279i interfaceC2279i2 = f9060w;
                if (interfaceC2279i2 != null) {
                    interfaceC2279i2.m4478b(c2276f3, runnableC0544p);
                    return;
                } else {
                    runnableC0544p.run();
                    return;
                }
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                boolean equals = java.lang.Boolean.TRUE.equals(c0384n.f1134b);
                if (!equals) {
                    f9055r = 0;
                } else if (equals) {
                    f9055r = 1;
                }
                c0335k.mo742b(null);
                return;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                final java.lang.String str4 = (java.lang.String) c0384n.m839a("path");
                final java.lang.Boolean bool = (java.lang.Boolean) c0384n.m839a("readOnly");
                final boolean z5 = str4 == null || str4.equals(":memory:");
                boolean z6 = (java.lang.Boolean.FALSE.equals(c0384n.m839a("singleInstance")) || z5) ? false : true;
                if (z6) {
                    synchronized (f9053p) {
                        try {
                            if (p204v2.AbstractC2271a.m4461b(f9055r)) {
                                android.util.Log.d("Sqflite", "Look for " + str4 + " in " + f9051n.keySet());
                            }
                            java.lang.Integer num4 = (java.lang.Integer) f9051n.get(str4);
                            if (num4 != null && (c2276f2 = (p204v2.C2276f) f9052o.get(num4)) != null) {
                                if (c2276f2.f9023i.isOpen()) {
                                    if (p204v2.AbstractC2271a.m4461b(f9055r)) {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        sb2.append(c2276f2.m4471h());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(c2276f2.m4473j() ? "(in transaction) " : "");
                                        sb2.append(num4);
                                        sb2.append(" ");
                                        sb2.append(str4);
                                        android.util.Log.d("Sqflite", sb2.toString());
                                    }
                                    c0335k.mo742b(m4481e(num4.intValue(), true, c2276f2.m4473j()));
                                    return;
                                }
                                if (p204v2.AbstractC2271a.m4461b(f9055r)) {
                                    android.util.Log.d("Sqflite", c2276f2.m4471h() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                java.lang.Object obj = f9053p;
                synchronized (obj) {
                    i4 = f9059v + 1;
                    f9059v = i4;
                }
                p204v2.C2276f c2276f5 = new p204v2.C2276f(this.f9061l, str4, i4, z6, f9055r);
                synchronized (obj) {
                    try {
                        if (f9060w == null) {
                            int i5 = f9058u;
                            int i6 = f9057t;
                            p204v2.InterfaceC2279i c0528a = i5 == 1 ? new p063P2.C0528a(i6, 9) : new p043K2.C0329e(i5, i6);
                            f9060w = c0528a;
                            c0528a.mo728d();
                            c2276f = c2276f5;
                            if (p204v2.AbstractC2271a.m4460a(c2276f.f9018d)) {
                                android.util.Log.d("Sqflite", c2276f.m4471h() + "starting worker pool with priority " + f9057t);
                            }
                        } else {
                            c2276f = c2276f5;
                        }
                        c2276f.f9022h = f9060w;
                        if (p204v2.AbstractC2271a.m4460a(c2276f.f9018d)) {
                            android.util.Log.d("Sqflite", c2276f.m4471h() + "opened " + i4 + " " + str4);
                        }
                        final p204v2.C2276f c2276f6 = c2276f;
                        final boolean z7 = z6;
                        f9060w.m4478b(c2276f, new java.lang.Runnable() { // from class: v2.l
                            /* JADX WARN: Type inference failed for: r0v17, types: [android.database.DatabaseErrorHandler, java.lang.Object] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z8 = z5;
                                java.lang.String str5 = str4;
                                p043K2.C0335k c0335k2 = c0335k;
                                java.lang.Boolean bool2 = bool;
                                p204v2.C2276f c2276f7 = c2276f6;
                                p047L2.C0384n c0384n2 = c0384n;
                                boolean z9 = z7;
                                int i7 = i4;
                                synchronized (p204v2.C2283m.f9054q) {
                                    if (!z8) {
                                        java.io.File file = new java.io.File(new java.io.File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            c0335k2.mo741a("sqlite_error", "open_failed " + str5, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (java.lang.Boolean.TRUE.equals(bool2)) {
                                            c2276f7.f9023i = android.database.sqlite.SQLiteDatabase.openDatabase(c2276f7.f9016b, null, 1, new java.lang.Object());
                                        } else {
                                            c2276f7.m4474k();
                                        }
                                        synchronized (p204v2.C2283m.f9053p) {
                                            if (z9) {
                                                try {
                                                    p204v2.C2283m.f9051n.put(str5, java.lang.Integer.valueOf(i7));
                                                } finally {
                                                }
                                            }
                                            p204v2.C2283m.f9052o.put(java.lang.Integer.valueOf(i7), c2276f7);
                                        }
                                        if (p204v2.AbstractC2271a.m4460a(c2276f7.f9018d)) {
                                            android.util.Log.d("Sqflite", c2276f7.m4471h() + "opened " + i7 + " " + str5);
                                        }
                                        c0335k2.mo742b(p204v2.C2283m.m4481e(i7, false, false));
                                    } catch (java.lang.Exception e4) {
                                        c2276f7.m4472i(e4, new p208w2.C2336b(c0384n2, c0335k2));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case '\t':
                p204v2.C2276f m4480c6 = m4480c(c0384n, c0335k);
                if (m4480c6 == null) {
                    return;
                }
                f9060w.m4478b(m4480c6, new p204v2.RunnableC2281k(m4480c6, c0384n, c0335k));
                return;
            case '\n':
                java.lang.String str5 = (java.lang.String) c0384n.m839a("cmd");
                java.util.HashMap hashMap3 = new java.util.HashMap();
                if ("get".equals(str5)) {
                    int i7 = f9055r;
                    if (i7 > 0) {
                        hashMap3.put("logLevel", java.lang.Integer.valueOf(i7));
                    }
                    java.util.HashMap hashMap4 = f9052o;
                    if (!hashMap4.isEmpty()) {
                        java.util.HashMap hashMap5 = new java.util.HashMap();
                        for (java.util.Map.Entry entry : hashMap4.entrySet()) {
                            p204v2.C2276f c2276f7 = (p204v2.C2276f) entry.getValue();
                            java.util.HashMap hashMap6 = new java.util.HashMap();
                            hashMap6.put("path", c2276f7.f9016b);
                            hashMap6.put("singleInstance", java.lang.Boolean.valueOf(c2276f7.f9015a));
                            int i8 = c2276f7.f9018d;
                            if (i8 > 0) {
                                hashMap6.put("logLevel", java.lang.Integer.valueOf(i8));
                            }
                            hashMap5.put(((java.lang.Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                c0335k.mo742b(hashMap3);
                return;
            case 11:
                p204v2.C2276f m4480c7 = m4480c(c0384n, c0335k);
                if (m4480c7 == null) {
                    return;
                }
                f9060w.m4478b(m4480c7, new p204v2.RunnableC2281k(c0384n, c0335k, m4480c7, 2));
                return;
            case '\f':
                try {
                    z4 = new java.io.File((java.lang.String) c0384n.m839a("path")).exists();
                } catch (java.lang.Exception unused) {
                }
                c0335k.mo742b(java.lang.Boolean.valueOf(z4));
                return;
            case '\r':
                p204v2.C2276f m4480c8 = m4480c(c0384n, c0335k);
                if (m4480c8 == null) {
                    return;
                }
                f9060w.m4478b(m4480c8, new p204v2.RunnableC2281k(c0384n, c0335k, m4480c8, 0));
                return;
            case 14:
                c0335k.mo742b("Android " + android.os.Build.VERSION.RELEASE);
                return;
            case 15:
                if (f9056s == null) {
                    f9056s = this.f9061l.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                c0335k.mo742b(f9056s);
                return;
            default:
                c0335k.mo743c();
                return;
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        this.f9061l = null;
        this.f9062m.m702s(null);
        this.f9062m = null;
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        this.f9061l = (android.content.Context) c0247a.f719l;
        p047L2.C0392v c0392v = p047L2.C0392v.f1138a;
        p047L2.InterfaceC0376f interfaceC0376f = (p047L2.InterfaceC0376f) c0247a.f720m;
        p035I.C0291m c0291m = new p035I.C0291m(interfaceC0376f, "com.tekartik.sqflite", c0392v, interfaceC0376f.m827d());
        this.f9062m = c0291m;
        c0291m.m702s(this);
    }
}
