package n2;

import android.net.Uri;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import java.util.ArrayList;
import p1.AbstractC0462a;
import r3.AbstractC0534v;
import r3.B;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class m extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f7483p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o f7484q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L2.p f7485r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, L2.p pVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f7484q = oVar;
        this.f7485r = pVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new m(this.f7484q, this.f7485r, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((m) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f7483p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            this.f7483p = 1;
            Uri uri = o.f7489j;
            obj = AbstractC0534v.n(B.f8111b, new k(this.f7484q, null), this);
            if (obj == enumC0225a) {
                return enumC0225a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0462a.P(obj);
        }
        this.f7485r.b((ArrayList) obj);
        return Z2.g.f3186a;
    }
}
