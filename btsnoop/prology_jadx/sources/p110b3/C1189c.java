package p110b3;

/* renamed from: b3.c */
/* loaded from: classes.dex */
public final class C1189c implements p110b3.InterfaceC1195i, java.io.Serializable {

    /* renamed from: l */
    public final p110b3.InterfaceC1195i f4620l;

    /* renamed from: m */
    public final p110b3.InterfaceC1193g f4621m;

    public C1189c(p110b3.InterfaceC1193g interfaceC1193g, p110b3.InterfaceC1195i interfaceC1195i) {
        p154k3.AbstractC1803h.m3779e(interfaceC1195i, "left");
        p154k3.AbstractC1803h.m3779e(interfaceC1193g, "element");
        this.f4620l = interfaceC1195i;
        this.f4621m = interfaceC1193g;
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: c */
    public final p110b3.InterfaceC1195i mo676c(p110b3.InterfaceC1195i interfaceC1195i) {
        p154k3.AbstractC1803h.m3779e(interfaceC1195i, "context");
        return interfaceC1195i == p110b3.C1196j.f4623l ? this : (p110b3.InterfaceC1195i) interfaceC1195i.mo679k(this, new p110b3.C1188b(1));
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z4;
        if (this != obj) {
            if (!(obj instanceof p110b3.C1189c)) {
                return false;
            }
            p110b3.C1189c c1189c = (p110b3.C1189c) obj;
            c1189c.getClass();
            int i4 = 2;
            p110b3.C1189c c1189c2 = c1189c;
            int i5 = 2;
            while (true) {
                p110b3.InterfaceC1195i interfaceC1195i = c1189c2.f4620l;
                c1189c2 = interfaceC1195i instanceof p110b3.C1189c ? (p110b3.C1189c) interfaceC1195i : null;
                if (c1189c2 == null) {
                    break;
                }
                i5++;
            }
            p110b3.C1189c c1189c3 = this;
            while (true) {
                p110b3.InterfaceC1195i interfaceC1195i2 = c1189c3.f4620l;
                c1189c3 = interfaceC1195i2 instanceof p110b3.C1189c ? (p110b3.C1189c) interfaceC1195i2 : null;
                if (c1189c3 == null) {
                    break;
                }
                i4++;
            }
            if (i5 != i4) {
                return false;
            }
            p110b3.C1189c c1189c4 = this;
            while (true) {
                p110b3.InterfaceC1193g interfaceC1193g = c1189c4.f4621m;
                if (!p154k3.AbstractC1803h.m3775a(c1189c.mo678j(interfaceC1193g.getKey()), interfaceC1193g)) {
                    z4 = false;
                    break;
                }
                p110b3.InterfaceC1195i interfaceC1195i3 = c1189c4.f4620l;
                if (!(interfaceC1195i3 instanceof p110b3.C1189c)) {
                    p154k3.AbstractC1803h.m3777c(interfaceC1195i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    p110b3.InterfaceC1193g interfaceC1193g2 = (p110b3.InterfaceC1193g) interfaceC1195i3;
                    z4 = p154k3.AbstractC1803h.m3775a(c1189c.mo678j(interfaceC1193g2.getKey()), interfaceC1193g2);
                    break;
                }
                c1189c4 = (p110b3.C1189c) interfaceC1195i3;
            }
            if (!z4) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f4621m.hashCode() + this.f4620l.hashCode();
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: j */
    public final p110b3.InterfaceC1193g mo678j(p110b3.InterfaceC1194h interfaceC1194h) {
        p154k3.AbstractC1803h.m3779e(interfaceC1194h, "key");
        p110b3.C1189c c1189c = this;
        while (true) {
            p110b3.InterfaceC1193g mo678j = c1189c.f4621m.mo678j(interfaceC1194h);
            if (mo678j != null) {
                return mo678j;
            }
            p110b3.InterfaceC1195i interfaceC1195i = c1189c.f4620l;
            if (!(interfaceC1195i instanceof p110b3.C1189c)) {
                return interfaceC1195i.mo678j(interfaceC1194h);
            }
            c1189c = (p110b3.C1189c) interfaceC1195i;
        }
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: k */
    public final java.lang.Object mo679k(java.lang.Object obj, p149j3.InterfaceC1741p interfaceC1741p) {
        return interfaceC1741p.mo502h(this.f4620l.mo679k(obj, interfaceC1741p), this.f4621m);
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: m */
    public final p110b3.InterfaceC1195i mo680m(p110b3.InterfaceC1194h interfaceC1194h) {
        p154k3.AbstractC1803h.m3779e(interfaceC1194h, "key");
        p110b3.InterfaceC1193g interfaceC1193g = this.f4621m;
        p110b3.InterfaceC1193g mo678j = interfaceC1193g.mo678j(interfaceC1194h);
        p110b3.InterfaceC1195i interfaceC1195i = this.f4620l;
        if (mo678j != null) {
            return interfaceC1195i;
        }
        p110b3.InterfaceC1195i mo680m = interfaceC1195i.mo680m(interfaceC1194h);
        return mo680m == interfaceC1195i ? this : mo680m == p110b3.C1196j.f4623l ? interfaceC1193g : new p110b3.C1189c(interfaceC1193g, mo680m);
    }

    public final java.lang.String toString() {
        return "[" + ((java.lang.String) mo679k("", new p110b3.C1188b(0))) + ']';
    }
}
