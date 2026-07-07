package M;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import j3.p;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class c extends d3.g implements p {

    /* renamed from: p, reason: collision with root package name */
    public int f1105p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1106q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d3.g f1107r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1107r = (d3.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.g, j3.p] */
    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        c cVar = new c(this.f1107r, interfaceC0190d);
        cVar.f1106q = obj;
        return cVar;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((c) g((InterfaceC0190d) obj2, (b) obj)).k(Z2.g.f3186a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [d3.g, j3.p] */
    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f1105p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            b bVar = (b) this.f1106q;
            this.f1105p = 1;
            obj = this.f1107r.h(bVar, this);
            if (obj == enumC0225a) {
                return enumC0225a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0462a.P(obj);
        }
        b bVar2 = (b) obj;
        k3.h.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        bVar2.f1104b.f897a.set(true);
        return bVar2;
    }
}
