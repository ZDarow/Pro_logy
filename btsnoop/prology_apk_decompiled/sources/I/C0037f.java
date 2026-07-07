package I;

import b3.InterfaceC0190d;
import p1.AbstractC0462a;

/* renamed from: I.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037f extends d3.g implements j3.l {

    /* renamed from: p, reason: collision with root package name */
    public int f819p;

    @Override // j3.l
    public final Object b(Object obj) {
        d3.g gVar = new d3.g(1, (InterfaceC0190d) obj);
        Z2.g gVar2 = Z2.g.f3186a;
        gVar.k(gVar2);
        return gVar2;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        int i4 = this.f819p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            this.f819p = 1;
            throw null;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0462a.P(obj);
        return Z2.g.f3186a;
    }
}
