package I;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;

/* renamed from: I.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046o extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f853p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Q f854q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046o(Q q4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f854q = q4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new C0046o(this.f854q, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((C0046o) g((InterfaceC0190d) obj2, (u3.e) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f853p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            this.f853p = 1;
            if (Q.e(this.f854q, this) == enumC0225a) {
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
