package I;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;

/* renamed from: I.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053w extends d3.g implements j3.l {

    /* renamed from: p, reason: collision with root package name */
    public int f873p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ H f874q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053w(H h4, InterfaceC0190d interfaceC0190d) {
        super(1, interfaceC0190d);
        this.f874q = h4;
    }

    @Override // j3.l
    public final Object b(Object obj) {
        return new C0053w(this.f874q, (InterfaceC0190d) obj).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f873p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            this.f873p = 1;
            obj = this.f874q.b(this);
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
