package v3;

import b3.C0191e;
import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import c3.EnumC0225a;
import p1.AbstractC0462a;
import r3.AbstractC0534v;
import r3.B;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class d extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f8716p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f8717q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u3.e f8718r;
    public final /* synthetic */ f s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u3.e eVar, f fVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f8718r = eVar;
        this.s = fVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        d dVar = new d(this.f8718r, this.s, interfaceC0190d);
        dVar.f8717q = obj;
        return dVar;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((d) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f8716p;
        Z2.g gVar = Z2.g.f3186a;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            InterfaceC0533u interfaceC0533u = (InterfaceC0533u) this.f8717q;
            f fVar = this.s;
            int i5 = fVar.f8723m;
            if (i5 == -3) {
                i5 = -2;
            }
            j3.p eVar = new e(fVar, null);
            t3.b a4 = t3.i.a(i5, fVar.f8724n, 4);
            InterfaceC0195i a5 = AbstractC0534v.a(interfaceC0533u.h(), fVar.f8722l, true);
            y3.d dVar = B.f8110a;
            if (a5 != dVar && a5.j(C0191e.f4461l) == null) {
                a5 = a5.c(dVar);
            }
            t3.n nVar = new t3.n(a5, a4);
            nVar.W(3, nVar, eVar);
            this.f8716p = 1;
            Object b4 = u3.r.b(this.f8718r, nVar, true, this);
            if (b4 != enumC0225a) {
                b4 = gVar;
            }
            if (b4 == enumC0225a) {
                return enumC0225a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0462a.P(obj);
        }
        return gVar;
    }
}
