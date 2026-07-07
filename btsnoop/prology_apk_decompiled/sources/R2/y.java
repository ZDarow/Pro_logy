package R2;

import I.InterfaceC0039h;
import android.content.Context;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class y extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public k3.p f1870p;

    /* renamed from: q, reason: collision with root package name */
    public int f1871q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f1872r;
    public final /* synthetic */ K s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k3.p f1873t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, K k4, k3.p pVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f1872r = str;
        this.s = k4;
        this.f1873t = pVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new y(this.f1872r, this.s, this.f1873t, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((y) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        k3.p pVar;
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f1871q;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            M.d dVar = new M.d(this.f1872r);
            Context context = this.s.f1788l;
            if (context == null) {
                k3.h.i("context");
                throw null;
            }
            C0079o c0079o = new C0079o(((InterfaceC0039h) L.a(context).f1009m).d(), dVar, 2);
            k3.p pVar2 = this.f1873t;
            this.f1870p = pVar2;
            this.f1871q = 1;
            Object c4 = u3.r.c(c0079o, this);
            if (c4 == enumC0225a) {
                return enumC0225a;
            }
            pVar = pVar2;
            obj = c4;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f1870p;
            AbstractC0462a.P(obj);
        }
        pVar.f7104l = obj;
        return Z2.g.f3186a;
    }
}
