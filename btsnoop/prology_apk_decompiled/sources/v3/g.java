package v3;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class g extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f8725p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f8726q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f8727r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f8727r = hVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        g gVar = new g(this.f8727r, interfaceC0190d);
        gVar.f8726q = obj;
        return gVar;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((g) g((InterfaceC0190d) obj2, (u3.e) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f8725p;
        Z2.g gVar = Z2.g.f3186a;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            u3.e eVar = (u3.e) this.f8726q;
            this.f8725p = 1;
            Object C4 = this.f8727r.f8728o.C(eVar, this);
            if (C4 != enumC0225a) {
                C4 = gVar;
            }
            if (C4 == enumC0225a) {
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
