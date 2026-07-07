package I;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class r extends d3.g implements j3.q {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f858p = 1;

    /* renamed from: q, reason: collision with root package name */
    public int f859q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f860r;

    public /* synthetic */ r(int i4, InterfaceC0190d interfaceC0190d) {
        super(i4, interfaceC0190d);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        switch (this.f858p) {
            case 0:
                EnumC0225a enumC0225a = EnumC0225a.f4710l;
                int i4 = this.f859q;
                if (i4 == 0) {
                    AbstractC0462a.P(obj);
                    this.f859q = 1;
                    if (Q.a((Q) this.f860r, this) == enumC0225a) {
                        return enumC0225a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0462a.P(obj);
                }
                return Z2.g.f3186a;
            default:
                EnumC0225a enumC0225a2 = EnumC0225a.f4710l;
                int i5 = this.f859q;
                if (i5 == 0) {
                    AbstractC0462a.P(obj);
                    K.c cVar = (K.c) this.f860r;
                    this.f859q = 1;
                    cVar.getClass();
                    obj = K.c.a(cVar, this);
                    if (obj == enumC0225a2) {
                        return enumC0225a2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0462a.P(obj);
                }
                return obj;
        }
    }

    public final Object p(Object obj, Object obj2, d3.b bVar) {
        switch (this.f858p) {
            case 0:
                return new r((Q) this.f860r, bVar).k(Z2.g.f3186a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, bVar);
                rVar.f860r = (K.c) obj;
                return rVar.k(Z2.g.f3186a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Q q4, InterfaceC0190d interfaceC0190d) {
        super(3, interfaceC0190d);
        this.f860r = q4;
    }
}
