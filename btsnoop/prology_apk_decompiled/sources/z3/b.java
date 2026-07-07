package z3;

import I.C0044m;
import I.L;
import I.M;
import j3.l;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r3.l0;

/* loaded from: classes.dex */
public final class b extends k3.i implements l {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9235m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f9236n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f9237o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i4, Object obj, Object obj2) {
        super(1);
        this.f9235m = i4;
        this.f9236n = obj;
        this.f9237o = obj2;
    }

    @Override // j3.l
    public final Object b(Object obj) {
        Object gVar;
        t3.j jVar;
        Z2.g gVar2;
        Z2.g gVar3;
        switch (this.f9235m) {
            case 0:
                ((c) this.f9237o).getClass();
                ((d) this.f9236n).e(null);
                return Z2.g.f3186a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f9240g;
                ((c) this.f9237o).getClass();
                d dVar = (d) this.f9236n;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return Z2.g.f3186a;
            default:
                Throwable th = (Throwable) obj;
                ((L) this.f9236n).b(th);
                C0044m c0044m = (C0044m) this.f9237o;
                ((t3.b) c0044m.f849n).h(th, false);
                do {
                    t3.b bVar = (t3.b) c0044m.f849n;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = t3.b.f8430o;
                    long j4 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = t3.b.f8429n;
                    long j5 = atomicLongFieldUpdater2.get(bVar);
                    if (bVar.r(j5, true)) {
                        gVar = new t3.g(bVar.m());
                    } else {
                        long j6 = j5 & 1152921504606846975L;
                        Object obj2 = t3.i.f8462a;
                        if (j4 < j6) {
                            Object obj3 = t3.d.f8450k;
                            t3.j jVar2 = (t3.j) t3.b.s.get(bVar);
                            for (boolean z4 = true; !bVar.r(atomicLongFieldUpdater2.get(bVar), z4); z4 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                long j7 = t3.d.f8441b;
                                Object obj4 = obj2;
                                long j8 = andIncrement / j7;
                                int i4 = (int) (andIncrement % j7);
                                if (jVar2.f8949n != j8) {
                                    t3.j l4 = bVar.l(j8, jVar2);
                                    if (l4 == null) {
                                        continue;
                                        obj2 = obj4;
                                    } else {
                                        jVar = l4;
                                    }
                                } else {
                                    jVar = jVar2;
                                }
                                Object A4 = bVar.A(jVar, i4, andIncrement, obj3);
                                if (A4 == t3.d.f8452m) {
                                    l0 l0Var = obj3 instanceof l0 ? (l0) obj3 : null;
                                    if (l0Var != null) {
                                        l0Var.a(jVar, i4);
                                    }
                                    bVar.C(andIncrement);
                                    jVar.h();
                                    obj2 = obj4;
                                } else if (A4 == t3.d.f8454o) {
                                    if (andIncrement < bVar.p()) {
                                        jVar.a();
                                    }
                                    jVar2 = jVar;
                                    obj2 = obj4;
                                } else {
                                    if (A4 == t3.d.f8453n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVar.a();
                                    obj2 = A4;
                                }
                            }
                            gVar = new t3.g(bVar.m());
                        }
                        gVar = obj2;
                    }
                    gVar2 = null;
                    if (gVar instanceof t3.h) {
                        gVar = null;
                    }
                    gVar3 = Z2.g.f3186a;
                    if (gVar != null) {
                        M.f757m.h(gVar, th);
                        gVar2 = gVar3;
                    }
                } while (gVar2 != null);
                return gVar3;
        }
    }
}
