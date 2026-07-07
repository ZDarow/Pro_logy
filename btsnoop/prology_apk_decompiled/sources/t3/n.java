package t3;

import I.L;
import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r3.AbstractC0514a;
import r3.AbstractC0534v;
import r3.C0527n;
import r3.Q;
import r3.X;

/* loaded from: classes.dex */
public final class n extends AbstractC0514a implements o, f {

    /* renamed from: o, reason: collision with root package name */
    public final b f8468o;

    public n(InterfaceC0195i interfaceC0195i, b bVar) {
        super(interfaceC0195i, true);
        this.f8468o = bVar;
    }

    @Override // r3.AbstractC0514a
    public final void U(Throwable th, boolean z4) {
        if (this.f8468o.h(th, false) || z4) {
            return;
        }
        AbstractC0534v.d(this.f8144n, th);
    }

    @Override // r3.AbstractC0514a
    public final void V(Object obj) {
        this.f8468o.h(null, false);
    }

    public final void X(L l4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f8468o;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f8436v;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, l4)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            e2.f fVar = d.f8456q;
            if (obj != fVar) {
                if (obj == d.f8457r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            e2.f fVar2 = d.f8457r;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, fVar, fVar2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != fVar) {
                    break;
                }
            }
            l4.b(bVar.m());
            return;
        }
    }

    @Override // r3.Z, r3.P
    public final void b(CancellationException cancellationException) {
        Object E3 = E();
        if (E3 instanceof C0527n) {
            return;
        }
        if ((E3 instanceof X) && ((X) E3).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Q(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // t3.q
    public final Object e(InterfaceC0190d interfaceC0190d, Object obj) {
        return this.f8468o.e(interfaceC0190d, obj);
    }

    @Override // t3.q
    public final Object g(Object obj) {
        return this.f8468o.g(obj);
    }

    @Override // r3.Z
    public final void t(CancellationException cancellationException) {
        this.f8468o.h(cancellationException, true);
        s(cancellationException);
    }
}
