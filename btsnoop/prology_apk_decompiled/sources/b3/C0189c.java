package b3;

import j3.p;
import java.io.Serializable;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189c implements InterfaceC0195i, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0195i f4459l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0193g f4460m;

    public C0189c(InterfaceC0193g interfaceC0193g, InterfaceC0195i interfaceC0195i) {
        k3.h.e(interfaceC0195i, "left");
        k3.h.e(interfaceC0193g, "element");
        this.f4459l = interfaceC0195i;
        this.f4460m = interfaceC0193g;
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i c(InterfaceC0195i interfaceC0195i) {
        k3.h.e(interfaceC0195i, "context");
        return interfaceC0195i == C0196j.f4462l ? this : (InterfaceC0195i) interfaceC0195i.k(this, new C0188b(1));
    }

    public final boolean equals(Object obj) {
        boolean z4;
        if (this != obj) {
            if (!(obj instanceof C0189c)) {
                return false;
            }
            C0189c c0189c = (C0189c) obj;
            c0189c.getClass();
            int i4 = 2;
            C0189c c0189c2 = c0189c;
            int i5 = 2;
            while (true) {
                InterfaceC0195i interfaceC0195i = c0189c2.f4459l;
                c0189c2 = interfaceC0195i instanceof C0189c ? (C0189c) interfaceC0195i : null;
                if (c0189c2 == null) {
                    break;
                }
                i5++;
            }
            C0189c c0189c3 = this;
            while (true) {
                InterfaceC0195i interfaceC0195i2 = c0189c3.f4459l;
                c0189c3 = interfaceC0195i2 instanceof C0189c ? (C0189c) interfaceC0195i2 : null;
                if (c0189c3 == null) {
                    break;
                }
                i4++;
            }
            if (i5 != i4) {
                return false;
            }
            C0189c c0189c4 = this;
            while (true) {
                InterfaceC0193g interfaceC0193g = c0189c4.f4460m;
                if (!k3.h.a(c0189c.j(interfaceC0193g.getKey()), interfaceC0193g)) {
                    z4 = false;
                    break;
                }
                InterfaceC0195i interfaceC0195i3 = c0189c4.f4459l;
                if (!(interfaceC0195i3 instanceof C0189c)) {
                    k3.h.c(interfaceC0195i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC0193g interfaceC0193g2 = (InterfaceC0193g) interfaceC0195i3;
                    z4 = k3.h.a(c0189c.j(interfaceC0193g2.getKey()), interfaceC0193g2);
                    break;
                }
                c0189c4 = (C0189c) interfaceC0195i3;
            }
            if (!z4) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f4460m.hashCode() + this.f4459l.hashCode();
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0193g j(InterfaceC0194h interfaceC0194h) {
        k3.h.e(interfaceC0194h, "key");
        C0189c c0189c = this;
        while (true) {
            InterfaceC0193g j4 = c0189c.f4460m.j(interfaceC0194h);
            if (j4 != null) {
                return j4;
            }
            InterfaceC0195i interfaceC0195i = c0189c.f4459l;
            if (!(interfaceC0195i instanceof C0189c)) {
                return interfaceC0195i.j(interfaceC0194h);
            }
            c0189c = (C0189c) interfaceC0195i;
        }
    }

    @Override // b3.InterfaceC0195i
    public final Object k(Object obj, p pVar) {
        return pVar.h(this.f4459l.k(obj, pVar), this.f4460m);
    }

    @Override // b3.InterfaceC0195i
    public final InterfaceC0195i m(InterfaceC0194h interfaceC0194h) {
        k3.h.e(interfaceC0194h, "key");
        InterfaceC0193g interfaceC0193g = this.f4460m;
        InterfaceC0193g j4 = interfaceC0193g.j(interfaceC0194h);
        InterfaceC0195i interfaceC0195i = this.f4459l;
        if (j4 != null) {
            return interfaceC0195i;
        }
        InterfaceC0195i m4 = interfaceC0195i.m(interfaceC0194h);
        return m4 == interfaceC0195i ? this : m4 == C0196j.f4462l ? interfaceC0193g : new C0189c(interfaceC0193g, m4);
    }

    public final String toString() {
        return "[" + ((String) k("", new C0188b(0))) + ']';
    }
}
