package k3;

import B2.AbstractC0007h;

/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i4, Object obj) {
        if (obj == null || b(i4, obj)) {
            return;
        }
        String k4 = AbstractC0007h.k("kotlin.jvm.functions.Function", i4);
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + k4);
        h.g(classCastException, s.class.getName());
        throw classCastException;
    }

    public static boolean b(int i4, Object obj) {
        if (obj instanceof Z2.a) {
            return (obj instanceof f ? ((f) obj).e() : obj instanceof j3.a ? 0 : obj instanceof j3.l ? 1 : obj instanceof j3.p ? 2 : obj instanceof j3.q ? 3 : -1) == i4;
        }
        return false;
    }

    public static final a c(Object[] objArr) {
        h.e(objArr, "array");
        return new a(objArr);
    }
}
