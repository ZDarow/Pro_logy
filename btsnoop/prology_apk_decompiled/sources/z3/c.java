package z3;

import b3.InterfaceC0195i;
import j3.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r3.C0519f;
import r3.InterfaceC0518e;
import r3.l0;
import w3.u;

/* loaded from: classes.dex */
public final class c implements InterfaceC0518e, l0 {

    /* renamed from: l, reason: collision with root package name */
    public final C0519f f9238l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f9239m;

    public c(d dVar, C0519f c0519f) {
        this.f9239m = dVar;
        this.f9238l = c0519f;
    }

    @Override // r3.l0
    public final void a(u uVar, int i4) {
        this.f9238l.a(uVar, i4);
    }

    @Override // b3.InterfaceC0190d
    public final InterfaceC0195i f() {
        return this.f9238l.f8153p;
    }

    @Override // b3.InterfaceC0190d
    public final void i(Object obj) {
        this.f9238l.i(obj);
    }

    @Override // r3.InterfaceC0518e
    public final void l(Object obj, l lVar) {
        Z2.g gVar = Z2.g.f3186a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f9240g;
        d dVar = this.f9239m;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f9238l.l(gVar, new b(0, dVar, this));
    }

    @Override // r3.InterfaceC0518e
    public final e2.f n(Object obj, l lVar) {
        d dVar = this.f9239m;
        b bVar = new b(1, dVar, this);
        e2.f n4 = this.f9238l.n((Z2.g) obj, bVar);
        if (n4 != null) {
            d.f9240g.set(dVar, null);
        }
        return n4;
    }

    @Override // r3.InterfaceC0518e
    public final void o(Object obj) {
        this.f9238l.o(obj);
    }
}
