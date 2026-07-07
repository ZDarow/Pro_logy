package I;

import a.AbstractC0110a;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import java.util.List;
import p1.AbstractC0462a;

/* renamed from: I.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035d extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f809p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f810q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f811r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0035d(List list, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f811r = list;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        C0035d c0035d = new C0035d(this.f811r, interfaceC0190d);
        c0035d.f810q = obj;
        return c0035d;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((C0035d) g((InterfaceC0190d) obj2, (C0042k) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f809p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            C0042k c0042k = (C0042k) this.f810q;
            this.f809p = 1;
            if (AbstractC0110a.b(this.f811r, c0042k, this) == enumC0225a) {
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
