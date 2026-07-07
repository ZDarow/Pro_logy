package t3;

import B2.AbstractC0007h;
import a.AbstractC0110a;
import b3.InterfaceC0190d;
import r3.l0;

/* loaded from: classes.dex */
public final class l extends b {
    public final int w;

    public l(int i4, int i5, j3.l lVar) {
        super(i4, lVar);
        this.w = i5;
        if (i5 != 1) {
            if (i4 < 1) {
                throw new IllegalArgumentException(AbstractC0007h.j(i4, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + k3.q.a(b.class).b() + " instead").toString());
        }
    }

    public final Object D(Object obj, boolean z4) {
        j jVar;
        j3.l lVar;
        I1.a b4;
        Z2.g gVar = Z2.g.f3186a;
        if (this.w == 3) {
            Object g4 = super.g(obj);
            if (!(g4 instanceof h) || (g4 instanceof g)) {
                return g4;
            }
            if (!z4 || (lVar = this.f8438m) == null || (b4 = w3.a.b(lVar, obj, null)) == null) {
                return gVar;
            }
            throw b4;
        }
        Object obj2 = d.f8443d;
        j jVar2 = (j) b.f8433r.get(this);
        while (true) {
            long andIncrement = b.f8429n.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean r4 = r(andIncrement, false);
            int i4 = d.f8441b;
            long j5 = i4;
            long j6 = j4 / j5;
            int i5 = (int) (j4 % j5);
            if (jVar2.f8949n != j6) {
                j a4 = b.a(this, j6, jVar2);
                if (a4 != null) {
                    jVar = a4;
                } else if (r4) {
                    return new g(o());
                }
            } else {
                jVar = jVar2;
            }
            int d4 = b.d(this, jVar, i5, obj, j4, obj2, r4);
            if (d4 == 0) {
                jVar.a();
                return gVar;
            }
            if (d4 == 1) {
                return gVar;
            }
            if (d4 == 2) {
                if (r4) {
                    jVar.h();
                    return new g(o());
                }
                l0 l0Var = obj2 instanceof l0 ? (l0) obj2 : null;
                if (l0Var != null) {
                    l0Var.a(jVar, i5 + i4);
                }
                j((jVar.f8949n * j5) + i5);
                return gVar;
            }
            if (d4 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d4 == 4) {
                if (j4 < b.f8430o.get(this)) {
                    jVar.a();
                }
                return new g(o());
            }
            if (d4 == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // t3.b, t3.q
    public final Object e(InterfaceC0190d interfaceC0190d, Object obj) {
        I1.a b4;
        if (!(D(obj, true) instanceof g)) {
            return Z2.g.f3186a;
        }
        j3.l lVar = this.f8438m;
        if (lVar == null || (b4 = w3.a.b(lVar, obj, null)) == null) {
            throw o();
        }
        AbstractC0110a.c(b4, o());
        throw b4;
    }

    @Override // t3.b, t3.q
    public final Object g(Object obj) {
        return D(obj, false);
    }

    @Override // t3.b
    public final boolean t() {
        return this.w == 2;
    }
}
