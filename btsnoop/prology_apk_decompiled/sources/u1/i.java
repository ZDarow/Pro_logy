package u1;

import B2.q;
import android.app.Activity;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import i1.ExecutorC0342b;
import j3.p;
import p1.AbstractC0462a;
import t3.o;
import v1.InterfaceC0588a;

/* loaded from: classes.dex */
public final class i extends d3.g implements p {

    /* renamed from: p, reason: collision with root package name */
    public int f8585p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f8586q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0582b f8587r;
    public final /* synthetic */ Activity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0582b c0582b, Activity activity, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f8587r = c0582b;
        this.s = activity;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        i iVar = new i(this.f8587r, this.s, interfaceC0190d);
        iVar.f8586q = obj;
        return iVar;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((i) g((InterfaceC0190d) obj2, (o) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f8585p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            o oVar = (o) this.f8586q;
            q qVar = new q(1, oVar);
            C0582b c0582b = this.f8587r;
            ((InterfaceC0588a) c0582b.f8571m).b(this.s, new ExecutorC0342b(0), qVar);
            L.b bVar = new L.b(1, c0582b, qVar);
            this.f8585p = 1;
            if (t3.i.b(oVar, bVar, this) == enumC0225a) {
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
