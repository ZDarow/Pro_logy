package R2;

import b3.InterfaceC0190d;
import java.util.List;
import p1.AbstractC0462a;

/* renamed from: R2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073i extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1815p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f1816q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073i(List list, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1816q = list;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        C0073i c0073i = new C0073i(this.f1816q, interfaceC0190d);
        c0073i.f1815p = obj;
        return c0073i;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        C0073i c0073i = (C0073i) g((InterfaceC0190d) obj2, (M.b) obj);
        Z2.g gVar = Z2.g.f3186a;
        c0073i.k(gVar);
        return gVar;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        AbstractC0462a.P(obj);
        M.b bVar = (M.b) this.f1815p;
        List<String> list = this.f1816q;
        if (list != null) {
            for (String str : list) {
                k3.h.e(str, "name");
                M.d dVar = new M.d(str);
                bVar.b();
                bVar.f1103a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f1103a.clear();
        }
        return Z2.g.f3186a;
    }
}
