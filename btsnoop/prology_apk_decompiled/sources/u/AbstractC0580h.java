package u;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import c3.EnumC0225a;
import j3.p;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import k3.s;
import r3.AbstractC0534v;
import r3.C0527n;
import w3.t;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0580h {

    /* renamed from: a, reason: collision with root package name */
    public static Class f8489a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f8490b;

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean b(File file, Resources resources, int i4) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i4);
            try {
                boolean c4 = c(file, inputStream);
                a(inputStream);
                return c4;
            } catch (Throwable th) {
                th = th;
                a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean c(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static File d(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final Object e(t tVar, t tVar2, p pVar) {
        Object c0527n;
        Object L3;
        try {
            s.a(2, pVar);
            c0527n = pVar.h(tVar2, tVar);
        } catch (Throwable th) {
            c0527n = new C0527n(th, false);
        }
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        if (c0527n == enumC0225a || (L3 = tVar.L(c0527n)) == AbstractC0534v.f8182d) {
            return enumC0225a;
        }
        if (L3 instanceof C0527n) {
            throw ((C0527n) L3).f8167a;
        }
        return AbstractC0534v.l(L3);
    }
}
