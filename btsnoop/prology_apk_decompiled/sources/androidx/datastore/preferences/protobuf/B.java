package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class B {
    public static void a(long j4, Object obj) {
        AbstractC0150b abstractC0150b = (AbstractC0150b) ((InterfaceC0170w) i0.f4100c.h(j4, obj));
        if (abstractC0150b.f4062l) {
            abstractC0150b.f4062l = false;
        }
    }

    public static InterfaceC0170w b(long j4, Object obj) {
        InterfaceC0170w interfaceC0170w = (InterfaceC0170w) i0.f4100c.h(j4, obj);
        if (((AbstractC0150b) interfaceC0170w).f4062l) {
            return interfaceC0170w;
        }
        T t4 = (T) interfaceC0170w;
        int i4 = t4.f4039n;
        T c4 = t4.c(i4 == 0 ? 10 : i4 * 2);
        i0.o(obj, j4, c4);
        return c4;
    }
}
