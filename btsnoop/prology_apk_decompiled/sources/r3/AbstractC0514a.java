package r3;

import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import c3.EnumC0225a;
import p1.AbstractC0462a;
import u.AbstractC0579g;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0514a extends Z implements InterfaceC0190d, InterfaceC0533u {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0195i f8144n;

    public AbstractC0514a(InterfaceC0195i interfaceC0195i, boolean z4) {
        super(z4);
        H((P) interfaceC0195i.j(C0532t.f8178m));
        this.f8144n = interfaceC0195i.c(this);
    }

    @Override // r3.Z
    public final void G(I1.a aVar) {
        AbstractC0534v.d(this.f8144n, aVar);
    }

    @Override // r3.Z
    public final void O(Object obj) {
        if (!(obj instanceof C0527n)) {
            V(obj);
        } else {
            C0527n c0527n = (C0527n) obj;
            U(c0527n.f8167a, C0527n.f8166b.get(c0527n) != 0);
        }
    }

    public void U(Throwable th, boolean z4) {
    }

    public void V(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(int i4, AbstractC0514a abstractC0514a, j3.p pVar) {
        int b4 = L.j.b(i4);
        if (b4 == 0) {
            AbstractC0579g.n(pVar, abstractC0514a, this);
            return;
        }
        if (b4 != 1) {
            if (b4 == 2) {
                AbstractC0462a.C(((d3.b) pVar).g(this, abstractC0514a)).i(Z2.g.f3186a);
                return;
            }
            if (b4 != 3) {
                throw new RuntimeException();
            }
            try {
                InterfaceC0195i interfaceC0195i = this.f8144n;
                Object m4 = w3.a.m(interfaceC0195i, null);
                try {
                    k3.s.a(2, pVar);
                    Object h4 = pVar.h(abstractC0514a, this);
                    if (h4 != EnumC0225a.f4710l) {
                        i(h4);
                    }
                } finally {
                    w3.a.h(interfaceC0195i, m4);
                }
            } catch (Throwable th) {
                i(AbstractC0462a.s(th));
            }
        }
    }

    @Override // b3.InterfaceC0190d
    public final InterfaceC0195i f() {
        return this.f8144n;
    }

    @Override // r3.InterfaceC0533u
    public final InterfaceC0195i h() {
        return this.f8144n;
    }

    @Override // b3.InterfaceC0190d
    public final void i(Object obj) {
        Throwable a4 = Z2.d.a(obj);
        if (a4 != null) {
            obj = new C0527n(a4, false);
        }
        Object L3 = L(obj);
        if (L3 == AbstractC0534v.f8182d) {
            return;
        }
        r(L3);
    }

    @Override // r3.Z
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
