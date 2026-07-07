package I;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class I extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f747p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Q f748q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Q q4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f748q = q4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new I(this.f748q, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((I) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f747p;
        Q q4 = this.f748q;
        try {
            if (i4 == 0) {
                AbstractC0462a.P(obj);
                if (q4.s.h() instanceof S) {
                    return q4.s.h();
                }
                this.f747p = 1;
                if (q4.i(this) == enumC0225a) {
                    return enumC0225a;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0462a.P(obj);
                    return (b0) obj;
                }
                AbstractC0462a.P(obj);
            }
            this.f747p = 2;
            obj = Q.f(q4, false, this);
            if (obj == enumC0225a) {
                return enumC0225a;
            }
            return (b0) obj;
        } catch (Throwable th) {
            return new U(th, -1);
        }
    }
}
