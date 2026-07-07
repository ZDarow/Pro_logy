package r3;

import b3.InterfaceC0190d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: r3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521h extends S {

    /* renamed from: p, reason: collision with root package name */
    public final C0519f f8155p;

    public C0521h(C0519f c0519f) {
        this.f8155p = c0519f;
    }

    @Override // j3.l
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        o((Throwable) obj);
        return Z2.g.f3186a;
    }

    @Override // r3.U
    public final void o(Throwable th) {
        Z n4 = n();
        C0519f c0519f = this.f8155p;
        Throwable t4 = c0519f.t(n4);
        if (c0519f.y()) {
            InterfaceC0190d interfaceC0190d = c0519f.f8152o;
            k3.h.c(interfaceC0190d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            w3.h hVar = (w3.h) interfaceC0190d;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w3.h.s;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                e2.f fVar = w3.a.f8911d;
                if (!k3.h.a(obj, fVar)) {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, t4)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != fVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0519f.q(t4);
        if (c0519f.y()) {
            return;
        }
        c0519f.r();
    }
}
