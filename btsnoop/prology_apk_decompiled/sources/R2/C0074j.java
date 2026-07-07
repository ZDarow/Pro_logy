package R2;

import android.content.Context;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import java.util.List;
import p1.AbstractC0462a;
import r3.InterfaceC0533u;

/* renamed from: R2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074j extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f1817p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K f1818q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f1819r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0074j(K k4, List list, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1818q = k4;
        this.f1819r = list;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new C0074j(this.f1818q, this.f1819r, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((C0074j) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f1817p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            Context context = this.f1818q.f1788l;
            if (context == null) {
                k3.h.i("context");
                throw null;
            }
            K2.o a4 = L.a(context);
            C0073i c0073i = new C0073i(this.f1819r, null);
            this.f1817p = 1;
            obj = a4.b(new M.f(c0073i, null), this);
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
