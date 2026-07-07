package R2;

import android.content.Context;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class I extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f1782p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f1783q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K f1784r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, K k4, long j4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1783q = str;
        this.f1784r = k4;
        this.s = j4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new I(this.f1783q, this.f1784r, this.s, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((I) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f1782p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            M.d dVar = new M.d(this.f1783q);
            Context context = this.f1784r.f1788l;
            if (context == null) {
                k3.h.i("context");
                throw null;
            }
            K2.o a4 = L.a(context);
            H h4 = new H(dVar, this.s, null);
            this.f1782p = 1;
            if (a4.b(new M.f(h4, null), this) == enumC0225a) {
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
