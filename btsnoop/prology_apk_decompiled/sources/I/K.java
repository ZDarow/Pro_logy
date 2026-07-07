package I;

import b3.InterfaceC0190d;
import c3.EnumC0225a;
import java.util.concurrent.atomic.AtomicInteger;
import p1.AbstractC0462a;
import r3.AbstractC0534v;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class K extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public int f752p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f753q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Q f754r;
    public final /* synthetic */ d3.g s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(Q q4, j3.p pVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f754r = q4;
        this.s = (d3.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.g, j3.p] */
    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        K k4 = new K(this.f754r, this.s, interfaceC0190d);
        k4.f753q = obj;
        return k4;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((K) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [r3.Z, r3.l] */
    /* JADX WARN: Type inference failed for: r7v0, types: [d3.g, j3.p] */
    @Override // d3.b
    public final Object k(Object obj) {
        EnumC0225a enumC0225a = EnumC0225a.f4710l;
        int i4 = this.f752p;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            InterfaceC0533u interfaceC0533u = (InterfaceC0533u) this.f753q;
            ?? z4 = new r3.Z(true);
            z4.H(null);
            Q q4 = this.f754r;
            T t4 = new T(this.s, z4, q4.s.h(), interfaceC0533u.h());
            C0044m c0044m = q4.w;
            Object g4 = ((t3.b) c0044m.f849n).g(t4);
            if (g4 instanceof t3.g) {
                t3.g gVar = (t3.g) g4;
                if (gVar == null) {
                    gVar = null;
                }
                Throwable th = gVar != null ? gVar.f8461a : null;
                if (th == null) {
                    throw new IllegalStateException("Channel was closed normally");
                }
                throw th;
            }
            if (g4 instanceof t3.h) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((B2.r) c0044m.f850o).f185m).getAndIncrement() == 0) {
                AbstractC0534v.g((InterfaceC0533u) c0044m.f847l, new W(c0044m, null));
            }
            this.f752p = 1;
            obj = z4.U(this);
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
