package s1;

import B2.q;
import I.C0056z;
import b3.InterfaceC0190d;
import c3.EnumC0225a;
import d3.g;
import j3.p;
import p1.AbstractC0462a;
import r3.InterfaceC0533u;
import u3.d;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543a extends g implements p {

    /* renamed from: p, reason: collision with root package name */
    public int f8214p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f8215q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f8216r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0543a(d dVar, q qVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f8215q = dVar;
        this.f8216r = qVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new C0543a(this.f8215q, this.f8216r, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((C0543a) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f8214p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            C0056z c0056z = new C0056z(1, this.f8216r);
            this.f8214p = 1;
            if (this.f8215q.C(c0056z, this) == enumC0225a) {
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
