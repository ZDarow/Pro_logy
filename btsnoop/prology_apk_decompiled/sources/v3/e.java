package v3;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class e extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f8719p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f8720q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f8721r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f8721r = fVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        e eVar = new e(this.f8721r, interfaceC0190d);
        eVar.f8720q = obj;
        return eVar;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((e) g((InterfaceC0190d) obj2, (t3.o) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f8719p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            t3.o oVar = (t3.o) this.f8720q;
            this.f8719p = 1;
            if (this.f8721r.a(oVar, this) == enumC0225a) {
                return enumC0225a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0462a.P(obj);
        }
        return Z2.g.f3186a;
    }
}
