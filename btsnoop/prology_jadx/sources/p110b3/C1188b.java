package p110b3;

/* renamed from: b3.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1188b implements p149j3.InterfaceC1741p {

    /* renamed from: l */
    public final /* synthetic */ int f4619l;

    public /* synthetic */ C1188b(int i4) {
        this.f4619l = i4;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        p110b3.C1189c c1189c;
        switch (this.f4619l) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                p110b3.InterfaceC1193g interfaceC1193g = (p110b3.InterfaceC1193g) obj2;
                p154k3.AbstractC1803h.m3779e(str, "acc");
                p154k3.AbstractC1803h.m3779e(interfaceC1193g, "element");
                if (str.length() == 0) {
                    return interfaceC1193g.toString();
                }
                return str + ", " + interfaceC1193g;
            default:
                p110b3.InterfaceC1195i interfaceC1195i = (p110b3.InterfaceC1195i) obj;
                p110b3.InterfaceC1193g interfaceC1193g2 = (p110b3.InterfaceC1193g) obj2;
                p154k3.AbstractC1803h.m3779e(interfaceC1195i, "acc");
                p154k3.AbstractC1803h.m3779e(interfaceC1193g2, "element");
                p110b3.InterfaceC1195i mo680m = interfaceC1195i.mo680m(interfaceC1193g2.getKey());
                p110b3.C1196j c1196j = p110b3.C1196j.f4623l;
                if (mo680m == c1196j) {
                    return interfaceC1193g2;
                }
                p110b3.C1191e c1191e = p110b3.C1191e.f4622l;
                p110b3.InterfaceC1192f interfaceC1192f = (p110b3.InterfaceC1192f) mo680m.mo678j(c1191e);
                if (interfaceC1192f == null) {
                    c1189c = new p110b3.C1189c(interfaceC1193g2, mo680m);
                } else {
                    p110b3.InterfaceC1195i mo680m2 = mo680m.mo680m(c1191e);
                    if (mo680m2 == c1196j) {
                        return new p110b3.C1189c(interfaceC1192f, interfaceC1193g2);
                    }
                    c1189c = new p110b3.C1189c(interfaceC1192f, new p110b3.C1189c(interfaceC1193g2, mo680m2));
                }
                return c1189c;
        }
    }
}
