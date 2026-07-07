package I;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class D extends d3.g implements j3.l {

    /* renamed from: p, reason: collision with root package name */
    public Throwable f724p;

    /* renamed from: q, reason: collision with root package name */
    public int f725q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Q f726r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Q q4, InterfaceC0190d interfaceC0190d) {
        super(1, interfaceC0190d);
        this.f726r = q4;
    }

    @Override // j3.l
    public final Object b(Object obj) {
        return new D(this.f726r, (InterfaceC0190d) obj).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        Throwable th;
        b0 b0Var;
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f725q;
        Q q4 = this.f726r;
        try {
        } catch (Throwable th2) {
            a0 h4 = q4.h();
            this.f724p = th2;
            this.f725q = 2;
            Integer a4 = h4.a();
            if (a4 == enumC0225a) {
                return enumC0225a;
            }
            th = th2;
            obj = a4;
        }
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            this.f725q = 1;
            obj = Q.g(q4, true, this);
            if (obj == enumC0225a) {
                return enumC0225a;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f724p;
                AbstractC0462a.P(obj);
                b0Var = new U(th, ((Number) obj).intValue());
                return new Z2.b(b0Var, Boolean.TRUE);
            }
            AbstractC0462a.P(obj);
        }
        b0Var = (b0) obj;
        return new Z2.b(b0Var, Boolean.TRUE);
    }
}
