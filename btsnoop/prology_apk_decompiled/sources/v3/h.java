package v3;

import b3.C0191e;
import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import c3.EnumC0225a;
import r3.AbstractC0534v;
import r3.C0529p;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: o, reason: collision with root package name */
    public final u3.d f8728o;

    public h(u3.d dVar, InterfaceC0195i interfaceC0195i, int i4, int i5) {
        super(interfaceC0195i, i4, i5);
        this.f8728o = dVar;
    }

    @Override // v3.f, u3.d
    public final Object C(u3.e eVar, InterfaceC0190d interfaceC0190d) {
        Object C4;
        Z2.g gVar = Z2.g.f3186a;
        int i4 = this.f8723m;
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        if (i4 == -3) {
            InterfaceC0195i f4 = interfaceC0190d.f();
            Boolean bool = Boolean.FALSE;
            C0529p c0529p = C0529p.f8171o;
            InterfaceC0195i interfaceC0195i = this.f8722l;
            InterfaceC0195i c4 = !((Boolean) interfaceC0195i.k(bool, c0529p)).booleanValue() ? f4.c(interfaceC0195i) : AbstractC0534v.a(f4, interfaceC0195i, false);
            if (k3.h.a(c4, f4)) {
                C4 = this.f8728o.C(eVar, interfaceC0190d);
                if (C4 != enumC0225a) {
                    C4 = gVar;
                }
                if (C4 != enumC0225a) {
                    return gVar;
                }
            } else {
                C0191e c0191e = C0191e.f4461l;
                if (k3.h.a(c4.j(c0191e), f4.j(c0191e))) {
                    InterfaceC0195i f5 = interfaceC0190d.f();
                    if (!(eVar instanceof r)) {
                        eVar = new R2.r(eVar, f5);
                    }
                    C4 = l.b(c4, eVar, w3.a.l(c4), new g(this, null), interfaceC0190d);
                    if (C4 != enumC0225a) {
                        C4 = gVar;
                    }
                    if (C4 != enumC0225a) {
                        return gVar;
                    }
                }
            }
            return C4;
        }
        C4 = super.C(eVar, interfaceC0190d);
        if (C4 != enumC0225a) {
            return gVar;
        }
        return C4;
    }

    @Override // v3.f
    public final Object a(t3.o oVar, InterfaceC0190d interfaceC0190d) {
        Object C4 = this.f8728o.C(new r(oVar), interfaceC0190d);
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        Z2.g gVar = Z2.g.f3186a;
        if (C4 != enumC0225a) {
            C4 = gVar;
        }
        return C4 == enumC0225a ? C4 : gVar;
    }

    @Override // v3.f
    public final f b(InterfaceC0195i interfaceC0195i, int i4, int i5) {
        return new h(this.f8728o, interfaceC0195i, i4, i5);
    }

    @Override // v3.f
    public final String toString() {
        return this.f8728o + " -> " + super.toString();
    }
}
