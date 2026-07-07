package p125e3;

/* renamed from: e3.a */
/* loaded from: classes.dex */
public abstract class AbstractC1365a {

    /* renamed from: a */
    public static final java.lang.reflect.Method f5644a;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
        p154k3.AbstractC1803h.m3776b(methods);
        int length = methods.length;
        int i4 = 0;
        while (true) {
            method = null;
            if (i4 >= length) {
                break;
            }
            java.lang.reflect.Method method2 = methods[i4];
            if (p154k3.AbstractC1803h.m3775a(method2.getName(), "addSuppressed")) {
                java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                p154k3.AbstractC1803h.m3778d(parameterTypes, "getParameterTypes(...)");
                if (p154k3.AbstractC1803h.m3775a(parameterTypes.length == 1 ? parameterTypes[0] : null, java.lang.Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i4++;
        }
        f5644a = method;
        int length2 = methods.length;
        for (int i5 = 0; i5 < length2 && !p154k3.AbstractC1803h.m3775a(methods[i5].getName(), "getSuppressed"); i5++) {
        }
    }
}
