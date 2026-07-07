package I;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class N extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f758p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f759q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Q f760r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Q q4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f760r = q4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        N n4 = new N(this.f760r, interfaceC0190d);
        n4.f759q = obj;
        return n4;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((N) g((InterfaceC0190d) obj2, (T) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f758p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            T t4 = (T) this.f759q;
            this.f758p = 1;
            if (Q.c(this.f760r, t4, this) == enumC0225a) {
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
