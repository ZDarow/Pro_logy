package w3;

import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r3.A;
import r3.AbstractC0531s;
import r3.AbstractC0534v;
import r3.C0527n;
import r3.C0528o;
import r3.H;
import r3.h0;

/* loaded from: classes.dex */
public final class h extends A implements d3.c, InterfaceC0190d {
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC0531s f8921o;

    /* renamed from: p, reason: collision with root package name */
    public final d3.b f8922p;

    /* renamed from: q, reason: collision with root package name */
    public Object f8923q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f8924r;

    public h(AbstractC0531s abstractC0531s, d3.b bVar) {
        super(-1);
        this.f8921o = abstractC0531s;
        this.f8922p = bVar;
        this.f8923q = a.f8910c;
        this.f8924r = a.l(bVar.f());
    }

    @Override // r3.A
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0528o) {
            ((C0528o) obj).f8169b.b(cancellationException);
        }
    }

    @Override // r3.A
    public final InterfaceC0190d c() {
        return this;
    }

    @Override // d3.c
    public final d3.c d() {
        d3.b bVar = this.f8922p;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // b3.InterfaceC0190d
    public final InterfaceC0195i f() {
        return this.f8922p.f();
    }

    @Override // b3.InterfaceC0190d
    public final void i(Object obj) {
        d3.b bVar = this.f8922p;
        InterfaceC0195i f4 = bVar.f();
        Throwable a4 = Z2.d.a(obj);
        Object c0527n = a4 == null ? obj : new C0527n(a4, false);
        AbstractC0531s abstractC0531s = this.f8921o;
        if (abstractC0531s.f()) {
            this.f8923q = c0527n;
            this.f8109n = 0;
            abstractC0531s.e(f4, this);
            return;
        }
        H a5 = h0.a();
        if (a5.f8117n >= 4294967296L) {
            this.f8923q = c0527n;
            this.f8109n = 0;
            a3.b bVar2 = a5.f8119p;
            if (bVar2 == null) {
                bVar2 = new a3.b();
                a5.f8119p = bVar2;
            }
            bVar2.addLast(this);
            return;
        }
        a5.i(true);
        try {
            InterfaceC0195i f5 = bVar.f();
            Object m4 = a.m(f5, this.f8924r);
            try {
                bVar.i(obj);
                do {
                } while (a5.n());
            } finally {
                a.h(f5, m4);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // r3.A
    public final Object j() {
        Object obj = this.f8923q;
        this.f8923q = a.f8910c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f8921o + ", " + AbstractC0534v.k(this.f8922p) + ']';
    }
}
