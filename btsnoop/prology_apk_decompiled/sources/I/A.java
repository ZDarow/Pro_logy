package I;

import b3.C0196j;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;
import r3.C0525l;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class A extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f713p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Q f714q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Q q4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f714q = q4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new A(this.f714q, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((A) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f713p;
        Z2.g gVar = Z2.g.f3186a;
        Q q4 = this.f714q;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            this.f713p = 1;
            Object U3 = ((C0525l) q4.f778t.f848m).U(this);
            if (U3 != enumC0225a) {
                U3 = gVar;
            }
            if (U3 == enumC0225a) {
                return enumC0225a;
            }
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    AbstractC0462a.P(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0462a.P(obj);
        }
        u3.d dVar = q4.h().f804c;
        u3.d a4 = dVar instanceof v3.j ? v3.l.a((v3.j) dVar, null, 0, 2, 1) : new v3.h(dVar, C0196j.f4462l, 0, 2);
        C0056z c0056z = new C0056z(0, q4);
        this.f713p = 2;
        return a4.C(c0056z, this) == enumC0225a ? enumC0225a : gVar;
    }
}
