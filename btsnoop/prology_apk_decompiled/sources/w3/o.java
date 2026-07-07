package w3;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final s3.c f8942a;

    /* JADX WARN: Type inference failed for: r0v4, types: [s3.a, java.lang.Object] */
    static {
        String str;
        int i4 = w.f8951a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            k3.h.e(it, "<this>");
            Iterator it2 = p3.c.d0(new p3.a(new p3.e(it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int a4 = ((s3.a) obj).a();
                    do {
                        Object next = it2.next();
                        int a5 = ((s3.a) next).a();
                        if (a4 < a5) {
                            obj = next;
                            a4 = a5;
                        }
                    } while (it2.hasNext());
                }
            }
            s3.a aVar = (s3.a) obj;
            if (aVar == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                aVar.getClass();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new IllegalStateException("The main looper is not available");
                }
                f8942a = new s3.c(s3.d.a(mainLooper));
            } catch (Throwable th) {
                aVar.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
