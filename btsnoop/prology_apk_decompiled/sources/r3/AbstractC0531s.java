package r3;

import b3.AbstractC0187a;
import b3.C0191e;
import b3.C0196j;
import b3.InterfaceC0192f;
import b3.InterfaceC0193g;
import b3.InterfaceC0194h;
import b3.InterfaceC0195i;

/* renamed from: r3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0531s extends AbstractC0187a implements InterfaceC0192f {

    /* renamed from: m, reason: collision with root package name */
    public static final r f8176m = new r(C0191e.f4461l, C0530q.f8173m);

    public AbstractC0531s() {
        super(C0191e.f4461l);
    }

    public abstract void e(InterfaceC0195i interfaceC0195i, Runnable runnable);

    public boolean f() {
        return !(this instanceof i0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [k3.i, j3.l] */
    @Override // b3.AbstractC0187a, b3.InterfaceC0195i
    public final InterfaceC0193g j(InterfaceC0194h interfaceC0194h) {
        InterfaceC0193g interfaceC0193g;
        k3.h.e(interfaceC0194h, "key");
        if (!(interfaceC0194h instanceof r)) {
            if (C0191e.f4461l == interfaceC0194h) {
                return this;
            }
            return null;
        }
        r rVar = (r) interfaceC0194h;
        InterfaceC0194h interfaceC0194h2 = this.f4457l;
        if ((interfaceC0194h2 == rVar || rVar.f8175m == interfaceC0194h2) && (interfaceC0193g = (InterfaceC0193g) rVar.f8174l.b(this)) != null) {
            return interfaceC0193g;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [k3.i, j3.l] */
    @Override // b3.AbstractC0187a, b3.InterfaceC0195i
    public final InterfaceC0195i m(InterfaceC0194h interfaceC0194h) {
        k3.h.e(interfaceC0194h, "key");
        boolean z4 = interfaceC0194h instanceof r;
        C0196j c0196j = C0196j.f4462l;
        if (z4) {
            r rVar = (r) interfaceC0194h;
            InterfaceC0194h interfaceC0194h2 = this.f4457l;
            if ((interfaceC0194h2 == rVar || rVar.f8175m == interfaceC0194h2) && ((InterfaceC0193g) rVar.f8174l.b(this)) != null) {
                return c0196j;
            }
        } else if (C0191e.f4461l == interfaceC0194h) {
            return c0196j;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0534v.b(this);
    }
}
