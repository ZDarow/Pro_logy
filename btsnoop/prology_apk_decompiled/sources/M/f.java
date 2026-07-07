package M;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import j3.p;
import java.util.LinkedHashMap;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class f extends d3.g implements p {

    /* renamed from: p, reason: collision with root package name */
    public int f1109p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1110q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d3.g f1111r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(p pVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1111r = (d3.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.g, j3.p] */
    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        f fVar = new f(this.f1111r, interfaceC0190d);
        fVar.f1110q = obj;
        return fVar;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((f) g((InterfaceC0190d) obj2, (b) obj)).k(Z2.g.f3186a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [d3.g, j3.p] */
    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f1109p;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f1110q;
            AbstractC0462a.P(obj);
            return bVar;
        }
        AbstractC0462a.P(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f1110q).a()), false);
        this.f1110q = bVar2;
        this.f1109p = 1;
        return this.f1111r.h(bVar2, this) == enumC0225a ? enumC0225a : bVar2;
    }
}
