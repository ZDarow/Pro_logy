package t3;

import b3.InterfaceC0195i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p1.AbstractC0462a;
import r3.AbstractC0534v;
import r3.C0519f;
import r3.l0;
import w3.u;
import w3.v;

/* loaded from: classes.dex */
public final class a implements l0 {

    /* renamed from: l, reason: collision with root package name */
    public Object f8426l = d.f8455p;

    /* renamed from: m, reason: collision with root package name */
    public C0519f f8427m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b f8428n;

    public a(b bVar) {
        this.f8428n = bVar;
    }

    @Override // r3.l0
    public final void a(u uVar, int i4) {
        C0519f c0519f = this.f8427m;
        if (c0519f != null) {
            c0519f.a(uVar, i4);
        }
    }

    public final Object b(u3.f fVar) {
        C0519f c0519f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.s;
        b bVar = this.f8428n;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.r(b.f8429n.get(bVar), true)) {
                this.f8426l = d.f8451l;
                Throwable m4 = bVar.m();
                if (m4 == null) {
                    return Boolean.FALSE;
                }
                int i4 = v.f8950a;
                throw m4;
            }
            long andIncrement = b.f8430o.getAndIncrement(bVar);
            long j4 = d.f8441b;
            long j5 = andIncrement / j4;
            int i5 = (int) (andIncrement % j4);
            if (jVar.f8949n != j5) {
                j l4 = bVar.l(j5, jVar);
                if (l4 == null) {
                    continue;
                } else {
                    jVar = l4;
                }
            }
            Object A4 = bVar.A(jVar, i5, andIncrement, null);
            e2.f fVar2 = d.f8452m;
            if (A4 == fVar2) {
                throw new IllegalStateException("unreachable");
            }
            e2.f fVar3 = d.f8454o;
            if (A4 == fVar3) {
                if (andIncrement < bVar.p()) {
                    jVar.a();
                }
            } else {
                if (A4 != d.f8453n) {
                    jVar.a();
                    this.f8426l = A4;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f8428n;
                C0519f c4 = AbstractC0534v.c(AbstractC0462a.C(fVar));
                try {
                    this.f8427m = c4;
                    c0519f = c4;
                    try {
                        Object A5 = bVar2.A(jVar, i5, andIncrement, this);
                        if (A5 == fVar2) {
                            a(jVar, i5);
                        } else {
                            w3.p pVar = null;
                            InterfaceC0195i interfaceC0195i = c0519f.f8153p;
                            j3.l lVar = bVar2.f8438m;
                            if (A5 == fVar3) {
                                if (andIncrement < bVar2.p()) {
                                    jVar.a();
                                }
                                j jVar2 = (j) b.s.get(bVar2);
                                while (true) {
                                    if (bVar2.r(b.f8429n.get(bVar2), true)) {
                                        C0519f c0519f2 = this.f8427m;
                                        k3.h.b(c0519f2);
                                        this.f8427m = null;
                                        this.f8426l = d.f8451l;
                                        Throwable m5 = bVar.m();
                                        if (m5 == null) {
                                            c0519f2.i(Boolean.FALSE);
                                        } else {
                                            c0519f2.i(AbstractC0462a.s(m5));
                                        }
                                    } else {
                                        long andIncrement2 = b.f8430o.getAndIncrement(bVar2);
                                        long j6 = d.f8441b;
                                        long j7 = andIncrement2 / j6;
                                        int i6 = (int) (andIncrement2 % j6);
                                        if (jVar2.f8949n != j7) {
                                            j l5 = bVar2.l(j7, jVar2);
                                            if (l5 != null) {
                                                jVar2 = l5;
                                            }
                                        }
                                        j3.l lVar2 = lVar;
                                        Object A6 = bVar2.A(jVar2, i6, andIncrement2, this);
                                        if (A6 == d.f8452m) {
                                            a(jVar2, i6);
                                            break;
                                        }
                                        if (A6 == d.f8454o) {
                                            if (andIncrement2 < bVar2.p()) {
                                                jVar2.a();
                                            }
                                            lVar = lVar2;
                                        } else {
                                            if (A6 == d.f8453n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            jVar2.a();
                                            this.f8426l = A6;
                                            this.f8427m = null;
                                            bool = Boolean.TRUE;
                                            if (lVar2 != null) {
                                                pVar = new w3.p(lVar2, A6, interfaceC0195i);
                                            }
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f8426l = A5;
                                this.f8427m = null;
                                bool = Boolean.TRUE;
                                if (lVar != null) {
                                    pVar = new w3.p(lVar, A5, interfaceC0195i);
                                }
                            }
                            c0519f.l(bool, pVar);
                        }
                        return c0519f.u();
                    } catch (Throwable th) {
                        th = th;
                        c0519f.B();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0519f = c4;
                }
            }
        }
    }
}
