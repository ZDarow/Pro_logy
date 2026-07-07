package I;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class J extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f749p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d3.g f750q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0034c f751r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(j3.p pVar, C0034c c0034c, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f750q = (d3.g) pVar;
        this.f751r = c0034c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d3.g, j3.p] */
    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new J(this.f750q, this.f751r, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((J) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [d3.g, j3.p] */
    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f749p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            Object obj2 = this.f751r.f806b;
            this.f749p = 1;
            obj = this.f750q.h(obj2, this);
            if (obj == enumC0225a) {
                return enumC0225a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0462a.P(obj);
        }
        return obj;
    }
}
