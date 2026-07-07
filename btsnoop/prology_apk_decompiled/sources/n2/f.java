package n2;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import java.util.ArrayList;
import p1.AbstractC0462a;
import r3.AbstractC0534v;
import r3.B;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class f extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f7461p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f7462q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L2.p f7463r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, L2.p pVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f7462q = gVar;
        this.f7463r = pVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new f(this.f7462q, this.f7463r, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((f) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f7461p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            this.f7461p = 1;
            obj = AbstractC0534v.n(B.f8111b, new e(this.f7462q, null), this);
            if (obj == enumC0225a) {
                return enumC0225a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0462a.P(obj);
        }
        this.f7463r.b((ArrayList) obj);
        return Z2.g.f3186a;
    }
}
