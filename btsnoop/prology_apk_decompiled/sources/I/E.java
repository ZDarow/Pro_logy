package I;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class E extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public Throwable f727p;

    /* renamed from: q, reason: collision with root package name */
    public int f728q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f729r;
    public final /* synthetic */ Q s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f730t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Q q4, int i4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.s = q4;
        this.f730t = i4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        E e4 = new E(this.s, this.f730t, interfaceC0190d);
        e4.f729r = ((Boolean) obj).booleanValue();
        return e4;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) g((InterfaceC0190d) obj2, bool)).k(Z2.g.f3186a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // d3.b
    public final Object k(Object obj) {
        Throwable th;
        int i4;
        boolean z4;
        b0 b0Var;
        boolean z5;
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        boolean z6 = this.f728q;
        Q q4 = this.s;
        try {
        } catch (Throwable th2) {
            if (z6 != 0) {
                a0 h4 = q4.h();
                this.f727p = th2;
                this.f729r = z6;
                this.f728q = 2;
                Integer a4 = h4.a();
                if (a4 == enumC0225a) {
                    return enumC0225a;
                }
                z4 = z6;
                th = th2;
                obj = a4;
            } else {
                boolean z7 = z6;
                th = th2;
                i4 = this.f730t;
                z4 = z7;
            }
        }
        if (z6 == 0) {
            AbstractC0462a.P(obj);
            boolean z8 = this.f729r;
            this.f729r = z8;
            this.f728q = 1;
            obj = Q.g(q4, z8, this);
            z6 = z8;
            if (obj == enumC0225a) {
                return enumC0225a;
            }
        } else {
            if (z6 != 1) {
                if (z6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = this.f729r;
                th = this.f727p;
                AbstractC0462a.P(obj);
                i4 = ((Number) obj).intValue();
                U u4 = new U(th, i4);
                z5 = z4;
                b0Var = u4;
                return new Z2.b(b0Var, Boolean.valueOf(z5));
            }
            boolean z9 = this.f729r;
            AbstractC0462a.P(obj);
            z6 = z9;
        }
        b0Var = (b0) obj;
        z5 = z6;
        return new Z2.b(b0Var, Boolean.valueOf(z5));
    }
}
