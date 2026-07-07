package p154k3;

/* renamed from: k3.s */
/* loaded from: classes.dex */
public abstract class AbstractC1814s {
    /* renamed from: a */
    public static void m3789a(int i4, java.lang.Object obj) {
        if (obj == null || m3790b(i4, obj)) {
            return;
        }
        java.lang.String m152k = p009B2.AbstractC0051h.m152k("kotlin.jvm.functions.Function", i4);
        java.lang.ClassCastException classCastException = new java.lang.ClassCastException(obj.getClass().getName() + " cannot be cast to " + m152k);
        p154k3.AbstractC1803h.m3781g(classCastException, p154k3.AbstractC1814s.class.getName());
        throw classCastException;
    }

    /* renamed from: b */
    public static boolean m3790b(int i4, java.lang.Object obj) {
        if (obj instanceof p100Z2.InterfaceC0928a) {
            return (obj instanceof p154k3.InterfaceC1801f ? ((p154k3.InterfaceC1801f) obj).mo3039e() : obj instanceof p149j3.InterfaceC1726a ? 0 : obj instanceof p149j3.InterfaceC1737l ? 1 : obj instanceof p149j3.InterfaceC1741p ? 2 : obj instanceof p149j3.InterfaceC1742q ? 3 : -1) == i4;
        }
        return false;
    }

    /* renamed from: c */
    public static final p154k3.C1796a m3791c(java.lang.Object[] objArr) {
        p154k3.AbstractC1803h.m3779e(objArr, "array");
        return new p154k3.C1796a(objArr);
    }
}
