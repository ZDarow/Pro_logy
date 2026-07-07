package v3;

import b3.C0196j;
import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import c3.EnumC0225a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a */
    public static final e2.f f8732a = new e2.f("NULL", 1);

    public static /* synthetic */ u3.d a(j jVar, s3.c cVar, int i4, int i5, int i6) {
        InterfaceC0195i interfaceC0195i = cVar;
        if ((i6 & 1) != 0) {
            interfaceC0195i = C0196j.f4462l;
        }
        if ((i6 & 2) != 0) {
            i4 = -3;
        }
        if ((i6 & 4) != 0) {
            i5 = 1;
        }
        return jVar.y(interfaceC0195i, i4, i5);
    }

    public static final Object b(InterfaceC0195i interfaceC0195i, Object obj, Object obj2, j3.p pVar, InterfaceC0190d interfaceC0190d) {
        Object m4 = w3.a.m(interfaceC0195i, obj2);
        try {
            s sVar = new s(interfaceC0190d, interfaceC0195i);
            k3.s.a(2, pVar);
            Object h4 = pVar.h(obj, sVar);
            w3.a.h(interfaceC0195i, m4);
            if (h4 == EnumC0225a.f4710l) {
                k3.h.e(interfaceC0190d, "frame");
            }
            return h4;
        } catch (Throwable th) {
            w3.a.h(interfaceC0195i, m4);
            throw th;
        }
    }
}
