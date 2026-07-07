package p205v3;

/* renamed from: v3.l */
/* loaded from: classes.dex */
public abstract class AbstractC2296l {

    /* renamed from: a */
    public static final p124e2.C1358f f9086a = new p124e2.C1358f("NULL", 1);

    /* renamed from: a */
    public static /* synthetic */ p200u3.InterfaceC2250d m4483a(p205v3.InterfaceC2294j interfaceC2294j, p191s3.C2156c c2156c, int i4, int i5, int i6) {
        p110b3.InterfaceC1195i interfaceC1195i = c2156c;
        if ((i6 & 1) != 0) {
            interfaceC1195i = p110b3.C1196j.f4623l;
        }
        if ((i6 & 2) != 0) {
            i4 = -3;
        }
        if ((i6 & 4) != 0) {
            i5 = 1;
        }
        return interfaceC2294j.mo4450y(interfaceC1195i, i4, i5);
    }

    /* renamed from: b */
    public static final java.lang.Object m4484b(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Object obj, java.lang.Object obj2, p149j3.InterfaceC1741p interfaceC1741p, p110b3.InterfaceC1190d interfaceC1190d) {
        java.lang.Object m4550m = p209w3.AbstractC2339a.m4550m(interfaceC1195i, obj2);
        try {
            p205v3.C2303s c2303s = new p205v3.C2303s(interfaceC1190d, interfaceC1195i);
            p154k3.AbstractC1814s.m3789a(2, interfaceC1741p);
            java.lang.Object mo502h = interfaceC1741p.mo502h(obj, c2303s);
            p209w3.AbstractC2339a.m4545h(interfaceC1195i, m4550m);
            if (mo502h == p115c3.EnumC1252a.f4880l) {
                p154k3.AbstractC1803h.m3779e(interfaceC1190d, "frame");
            }
            return mo502h;
        } catch (java.lang.Throwable th) {
            p209w3.AbstractC2339a.m4545h(interfaceC1195i, m4550m);
            throw th;
        }
    }
}
