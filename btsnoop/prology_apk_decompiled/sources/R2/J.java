package R2;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class J extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f1785p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K f1786q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f1787r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k4, String str, String str2, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1786q = k4;
        this.f1787r = str;
        this.s = str2;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new J(this.f1786q, this.f1787r, this.s, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((J) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f1785p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            this.f1785p = 1;
            if (K.a(this.f1786q, this.f1787r, this.s, this) == enumC0225a) {
                return enumC0225a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0462a.P(obj);
        }
        return Z2.g.f3186a;
    }
}
