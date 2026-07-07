package p209w3;

/* renamed from: w3.o */
/* loaded from: classes.dex */
public abstract class AbstractC2353o {

    /* renamed from: a */
    public static final p191s3.C2156c f9301a;

    /* JADX WARN: Type inference failed for: r0v4, types: [s3.a, java.lang.Object] */
    static {
        java.lang.String str;
        int i4 = p209w3.AbstractC2361w.f9310a;
        java.lang.Object obj = null;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str != null) {
            java.lang.Boolean.parseBoolean(str);
        }
        try {
            java.util.Iterator it = java.util.Arrays.asList(new java.lang.Object()).iterator();
            p154k3.AbstractC1803h.m3779e(it, "<this>");
            java.util.Iterator it2 = p177p3.AbstractC1955c.m3961d0(new p177p3.C1953a(new p177p3.C1957e(it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int m4281a = ((p191s3.C2154a) obj).m4281a();
                    do {
                        java.lang.Object next = it2.next();
                        int m4281a2 = ((p191s3.C2154a) next).m4281a();
                        if (m4281a < m4281a2) {
                            obj = next;
                            m4281a = m4281a2;
                        }
                    } while (it2.hasNext());
                }
            }
            p191s3.C2154a c2154a = (p191s3.C2154a) obj;
            if (c2154a == null) {
                throw new java.lang.IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                c2154a.getClass();
                android.os.Looper mainLooper = android.os.Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new java.lang.IllegalStateException("The main looper is not available");
                }
                f9301a = new p191s3.C2156c(p191s3.AbstractC2157d.m4283a(mainLooper));
            } catch (java.lang.Throwable th) {
                c2154a.getClass();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            throw new java.util.ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
