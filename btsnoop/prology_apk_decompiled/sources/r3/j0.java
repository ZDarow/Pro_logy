package r3;

import b3.InterfaceC0190d;
import b3.InterfaceC0195i;

/* loaded from: classes.dex */
public final class j0 extends w3.t {

    /* renamed from: p, reason: collision with root package name */
    public final ThreadLocal f8159p;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0(b3.InterfaceC0190d r3, b3.InterfaceC0195i r4) {
        /*
            r2 = this;
            r3.k0 r0 = r3.k0.f8160l
            b3.g r1 = r4.j(r0)
            if (r1 != 0) goto Ld
            b3.i r0 = r4.c(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f8159p = r0
            b3.i r3 = r3.f()
            b3.e r0 = b3.C0191e.f4461l
            b3.g r3 = r3.j(r0)
            boolean r3 = r3 instanceof r3.AbstractC0531s
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = w3.a.m(r4, r3)
            w3.a.h(r4, r3)
            r2.Y(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.j0.<init>(b3.d, b3.i):void");
    }

    public final boolean X() {
        boolean z4 = this.threadLocalIsSet && this.f8159p.get() == null;
        this.f8159p.remove();
        return !z4;
    }

    public final void Y(InterfaceC0195i interfaceC0195i, Object obj) {
        this.threadLocalIsSet = true;
        this.f8159p.set(new Z2.b(interfaceC0195i, obj));
    }

    @Override // w3.t, r3.Z
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            Z2.b bVar = (Z2.b) this.f8159p.get();
            if (bVar != null) {
                w3.a.h((InterfaceC0195i) bVar.f3179l, bVar.f3180m);
            }
            this.f8159p.remove();
        }
        Object h4 = AbstractC0534v.h(obj);
        InterfaceC0190d interfaceC0190d = this.f8947o;
        InterfaceC0195i f4 = interfaceC0190d.f();
        Object m4 = w3.a.m(f4, null);
        j0 m5 = m4 != w3.a.f8913f ? AbstractC0534v.m(interfaceC0190d, f4, m4) : null;
        try {
            this.f8947o.i(h4);
        } finally {
            if (m5 == null || m5.X()) {
                w3.a.h(f4, m4);
            }
        }
    }
}
