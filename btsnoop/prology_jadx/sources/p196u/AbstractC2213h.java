package p196u;

/* renamed from: u.h */
/* loaded from: classes.dex */
public abstract class AbstractC2213h {

    /* renamed from: a */
    public static java.lang.Class f8829a;

    /* renamed from: b */
    public static java.lang.reflect.Method f8830b;

    /* renamed from: a */
    public static void m4417a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m4418b(java.io.File file, android.content.res.Resources resources, int i4) {
        java.io.InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i4);
            try {
                boolean m4419c = m4419c(file, inputStream);
                m4417a(inputStream);
                return m4419c;
            } catch (java.lang.Throwable th) {
                th = th;
                m4417a(inputStream);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: c */
    public static boolean m4419c(java.io.File file, java.io.InputStream inputStream) {
        java.io.FileOutputStream fileOutputStream;
        android.os.StrictMode.ThreadPolicy allowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new java.io.FileOutputStream(file, false);
            } catch (java.io.IOException e4) {
                e = e4;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    m4417a(fileOutputStream);
                    android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (java.io.IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            android.util.Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m4417a(fileOutputStream2);
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m4417a(fileOutputStream2);
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: d */
    public static java.io.File m4420d(android.content.Context context) {
        java.io.File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        java.lang.String str = ".font" + android.os.Process.myPid() + "-" + android.os.Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            java.io.File file = new java.io.File(cacheDir, str + i4);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final java.lang.Object m4421e(p209w3.C2358t c2358t, p209w3.C2358t c2358t2, p149j3.InterfaceC1741p interfaceC1741p) {
        java.lang.Object c2123n;
        java.lang.Object m4194L;
        try {
            p154k3.AbstractC1814s.m3789a(2, interfaceC1741p);
            c2123n = interfaceC1741p.mo502h(c2358t2, c2358t);
        } catch (java.lang.Throwable th) {
            c2123n = new p187r3.C2123n(th, false);
        }
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        if (c2123n == enumC1252a || (m4194L = c2358t.m4194L(c2123n)) == p187r3.AbstractC2131v.f8500d) {
            return enumC1252a;
        }
        if (m4194L instanceof p187r3.C2123n) {
            throw ((p187r3.C2123n) m4194L).f8485a;
        }
        return p187r3.AbstractC2131v.m4253l(m4194L);
    }
}
