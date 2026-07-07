package b3;

import j3.p;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0188b implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4458l;

    public /* synthetic */ C0188b(int i4) {
        this.f4458l = i4;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        C0189c c0189c;
        switch (this.f4458l) {
            case 0:
                String str = (String) obj;
                InterfaceC0193g interfaceC0193g = (InterfaceC0193g) obj2;
                k3.h.e(str, "acc");
                k3.h.e(interfaceC0193g, "element");
                if (str.length() == 0) {
                    return interfaceC0193g.toString();
                }
                return str + ", " + interfaceC0193g;
            default:
                InterfaceC0195i interfaceC0195i = (InterfaceC0195i) obj;
                InterfaceC0193g interfaceC0193g2 = (InterfaceC0193g) obj2;
                k3.h.e(interfaceC0195i, "acc");
                k3.h.e(interfaceC0193g2, "element");
                InterfaceC0195i m4 = interfaceC0195i.m(interfaceC0193g2.getKey());
                C0196j c0196j = C0196j.f4462l;
                if (m4 == c0196j) {
                    return interfaceC0193g2;
                }
                C0191e c0191e = C0191e.f4461l;
                InterfaceC0192f interfaceC0192f = (InterfaceC0192f) m4.j(c0191e);
                if (interfaceC0192f == null) {
                    c0189c = new C0189c(interfaceC0193g2, m4);
                } else {
                    InterfaceC0195i m5 = m4.m(c0191e);
                    if (m5 == c0196j) {
                        return new C0189c(interfaceC0192f, interfaceC0193g2);
                    }
                    c0189c = new C0189c(interfaceC0192f, new C0189c(interfaceC0193g2, m5));
                }
                return c0189c;
        }
    }
}
