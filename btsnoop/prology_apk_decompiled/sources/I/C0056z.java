package I;

import b3.InterfaceC0190d;
import c3.EnumC0225a;

/* renamed from: I.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056z implements u3.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f884l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f885m;

    public /* synthetic */ C0056z(int i4, Object obj) {
        this.f884l = i4;
        this.f885m = obj;
    }

    @Override // u3.e
    public final Object a(Object obj, InterfaceC0190d interfaceC0190d) {
        Object f4;
        switch (this.f884l) {
            case 0:
                Q q4 = (Q) this.f885m;
                boolean z4 = q4.s.h() instanceof S;
                Z2.g gVar = Z2.g.f3186a;
                return (z4 || (f4 = Q.f(q4, true, interfaceC0190d)) != EnumC0225a.f4710l) ? gVar : f4;
            case 1:
                ((B2.q) this.f885m).accept(obj);
                return Z2.g.f3186a;
            default:
                ((k3.p) this.f885m).f7104l = obj;
                throw new v3.a(this);
        }
    }
}
