package v2;

import I.C0044m;
import L2.o;
import L2.v;
import Q.p;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import w2.C0607b;

/* loaded from: classes.dex */
public class m implements H2.b, o {
    public static String s;
    public static i w;

    /* renamed from: l, reason: collision with root package name */
    public Context f8708l;

    /* renamed from: m, reason: collision with root package name */
    public C0044m f8709m;

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f8700n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f8701o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f8702p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static final Object f8703q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static int f8704r = 0;

    /* renamed from: t, reason: collision with root package name */
    public static int f8705t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static int f8706u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static int f8707v = 0;

    public static void a(m mVar, f fVar) {
        mVar.getClass();
        try {
            if (AbstractC0589a.a(fVar.f8668d)) {
                Log.d("Sqflite", fVar.h() + "closing database ");
            }
            fVar.a();
        } catch (Exception e4) {
            Log.e("Sqflite", "error " + e4 + " while closing database " + f8707v);
        }
        synchronized (f8702p) {
            try {
                if (f8701o.isEmpty() && w != null) {
                    if (AbstractC0589a.a(fVar.f8668d)) {
                        Log.d("Sqflite", fVar.h() + "stopping thread");
                    }
                    w.c();
                    w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f c(L2.n nVar, K2.k kVar) {
        Integer num = (Integer) nVar.a("id");
        int intValue = num.intValue();
        f fVar = (f) f8701o.get(num);
        if (fVar != null) {
            return fVar;
        }
        kVar.a("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    public static HashMap e(int i4, boolean z4, boolean z5) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i4));
        if (z4) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z5) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    @Override // L2.o
    public final void I(final L2.n nVar, final K2.k kVar) {
        final int i4;
        f fVar;
        f fVar2;
        String str = nVar.f1094a;
        str.getClass();
        f fVar3 = null;
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
                f c5 = c(nVar, kVar);
                if (c5 == null) {
                    return;
                }
                w.b(c5, new k(nVar, kVar, c5, 4));
                return;
            case 1:
                Integer num = (Integer) nVar.a("id");
                int intValue = num.intValue();
                f c6 = c(nVar, kVar);
                if (c6 == null) {
                    return;
                }
                if (AbstractC0589a.a(c6.f8668d)) {
                    Log.d("Sqflite", c6.h() + "closing " + intValue + " " + c6.f8666b);
                }
                String str2 = c6.f8666b;
                synchronized (f8702p) {
                    try {
                        f8701o.remove(num);
                        if (c6.f8665a) {
                            f8700n.remove(str2);
                        }
                    } finally {
                    }
                }
                w.b(c6, new Q.h(this, c6, kVar, 1));
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object a4 = nVar.a("androidThreadPriority");
                if (a4 != null) {
                    f8705t = ((Integer) a4).intValue();
                }
                Object a5 = nVar.a("androidThreadCount");
                if (a5 != null && !a5.equals(Integer.valueOf(f8706u))) {
                    f8706u = ((Integer) a5).intValue();
                    i iVar = w;
                    if (iVar != null) {
                        iVar.c();
                        w = null;
                    }
                }
                Integer num2 = (Integer) nVar.a("logLevel");
                if (num2 != null) {
                    f8704r = num2.intValue();
                }
                kVar.b(null);
                return;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                f c7 = c(nVar, kVar);
                if (c7 == null) {
                    return;
                }
                w.b(c7, new k(nVar, kVar, c7, 1));
                return;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                f c8 = c(nVar, kVar);
                if (c8 == null) {
                    return;
                }
                w.b(c8, new k(nVar, kVar, c8, 5));
                return;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                f c9 = c(nVar, kVar);
                if (c9 == null) {
                    return;
                }
                w.b(c9, new k(nVar, c9, kVar));
                return;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = (String) nVar.a("path");
                synchronized (f8702p) {
                    try {
                        if (AbstractC0589a.b(f8704r)) {
                            Log.d("Sqflite", "Look for " + str3 + " in " + f8700n.keySet());
                        }
                        HashMap hashMap = f8700n;
                        Integer num3 = (Integer) hashMap.get(str3);
                        if (num3 != null) {
                            HashMap hashMap2 = f8701o;
                            f fVar4 = (f) hashMap2.get(num3);
                            if (fVar4 != null && fVar4.f8673i.isOpen()) {
                                if (AbstractC0589a.b(f8704r)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(fVar4.h());
                                    sb.append("found single instance ");
                                    sb.append(fVar4.j() ? "(in transaction) " : "");
                                    sb.append(num3);
                                    sb.append(" ");
                                    sb.append(str3);
                                    Log.d("Sqflite", sb.toString());
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str3);
                                fVar3 = fVar4;
                            }
                        }
                    } finally {
                    }
                }
                p pVar = new p(this, fVar3, str3, kVar, 3);
                i iVar2 = w;
                if (iVar2 != null) {
                    iVar2.b(fVar3, pVar);
                    return;
                } else {
                    pVar.run();
                    return;
                }
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                boolean equals = Boolean.TRUE.equals(nVar.f1095b);
                if (!equals) {
                    f8704r = 0;
                } else if (equals) {
                    f8704r = 1;
                }
                kVar.b(null);
                return;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                final String str4 = (String) nVar.a("path");
                final Boolean bool = (Boolean) nVar.a("readOnly");
                final boolean z5 = str4 == null || str4.equals(":memory:");
                boolean z6 = (Boolean.FALSE.equals(nVar.a("singleInstance")) || z5) ? false : true;
                if (z6) {
                    synchronized (f8702p) {
                        try {
                            if (AbstractC0589a.b(f8704r)) {
                                Log.d("Sqflite", "Look for " + str4 + " in " + f8700n.keySet());
                            }
                            Integer num4 = (Integer) f8700n.get(str4);
                            if (num4 != null && (fVar2 = (f) f8701o.get(num4)) != null) {
                                if (fVar2.f8673i.isOpen()) {
                                    if (AbstractC0589a.b(f8704r)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(fVar2.h());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(fVar2.j() ? "(in transaction) " : "");
                                        sb2.append(num4);
                                        sb2.append(" ");
                                        sb2.append(str4);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    kVar.b(e(num4.intValue(), true, fVar2.j()));
                                    return;
                                }
                                if (AbstractC0589a.b(f8704r)) {
                                    Log.d("Sqflite", fVar2.h() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f8702p;
                synchronized (obj) {
                    i4 = f8707v + 1;
                    f8707v = i4;
                }
                f fVar5 = new f(this.f8708l, str4, i4, z6, f8704r);
                synchronized (obj) {
                    try {
                        if (w == null) {
                            int i5 = f8706u;
                            int i6 = f8705t;
                            i aVar = i5 == 1 ? new P2.a(i6, 9) : new K2.e(i5, i6);
                            w = aVar;
                            aVar.d();
                            fVar = fVar5;
                            if (AbstractC0589a.a(fVar.f8668d)) {
                                Log.d("Sqflite", fVar.h() + "starting worker pool with priority " + f8705t);
                            }
                        } else {
                            fVar = fVar5;
                        }
                        fVar.f8672h = w;
                        if (AbstractC0589a.a(fVar.f8668d)) {
                            Log.d("Sqflite", fVar.h() + "opened " + i4 + " " + str4);
                        }
                        final f fVar6 = fVar;
                        final boolean z7 = z6;
                        w.b(fVar, new Runnable() { // from class: v2.l
                            /* JADX WARN: Type inference failed for: r0v17, types: [android.database.DatabaseErrorHandler, java.lang.Object] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z8 = z5;
                                String str5 = str4;
                                K2.k kVar2 = kVar;
                                Boolean bool2 = bool;
                                f fVar7 = fVar6;
                                L2.n nVar2 = nVar;
                                boolean z9 = z7;
                                int i7 = i4;
                                synchronized (m.f8703q) {
                                    if (!z8) {
                                        File file = new File(new File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            kVar2.a("sqlite_error", "open_failed " + str5, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            fVar7.f8673i = SQLiteDatabase.openDatabase(fVar7.f8666b, null, 1, new Object());
                                        } else {
                                            fVar7.k();
                                        }
                                        synchronized (m.f8702p) {
                                            if (z9) {
                                                try {
                                                    m.f8700n.put(str5, Integer.valueOf(i7));
                                                } finally {
                                                }
                                            }
                                            m.f8701o.put(Integer.valueOf(i7), fVar7);
                                        }
                                        if (AbstractC0589a.a(fVar7.f8668d)) {
                                            Log.d("Sqflite", fVar7.h() + "opened " + i7 + " " + str5);
                                        }
                                        kVar2.b(m.e(i7, false, false));
                                    } catch (Exception e4) {
                                        fVar7.i(e4, new C0607b(nVar2, kVar2));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case '\t':
                f c10 = c(nVar, kVar);
                if (c10 == null) {
                    return;
                }
                w.b(c10, new k(c10, nVar, kVar));
                return;
            case '\n':
                String str5 = (String) nVar.a("cmd");
                HashMap hashMap3 = new HashMap();
                if ("get".equals(str5)) {
                    int i7 = f8704r;
                    if (i7 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i7));
                    }
                    HashMap hashMap4 = f8701o;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            f fVar7 = (f) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("path", fVar7.f8666b);
                            hashMap6.put("singleInstance", Boolean.valueOf(fVar7.f8665a));
                            int i8 = fVar7.f8668d;
                            if (i8 > 0) {
                                hashMap6.put("logLevel", Integer.valueOf(i8));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                kVar.b(hashMap3);
                return;
            case 11:
                f c11 = c(nVar, kVar);
                if (c11 == null) {
                    return;
                }
                w.b(c11, new k(nVar, kVar, c11, 2));
                return;
            case '\f':
                try {
                    z4 = new File((String) nVar.a("path")).exists();
                } catch (Exception unused) {
                }
                kVar.b(Boolean.valueOf(z4));
                return;
            case '\r':
                f c12 = c(nVar, kVar);
                if (c12 == null) {
                    return;
                }
                w.b(c12, new k(nVar, kVar, c12, 0));
                return;
            case 14:
                kVar.b("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                if (s == null) {
                    s = this.f8708l.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                kVar.b(s);
                return;
            default:
                kVar.c();
                return;
        }
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        this.f8708l = null;
        this.f8709m.s(null);
        this.f8709m = null;
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        this.f8708l = (Context) aVar.f708l;
        v vVar = v.f1099a;
        L2.f fVar = (L2.f) aVar.f709m;
        C0044m c0044m = new C0044m(fVar, "com.tekartik.sqflite", vVar, fVar.d());
        this.f8709m = c0044m;
        c0044m.s(this);
    }
}
