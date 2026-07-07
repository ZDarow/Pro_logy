package r3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class T extends Z {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f8128n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(P p2) {
        super(true);
        boolean z4 = true;
        H(p2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.f8143m;
        InterfaceC0522i interfaceC0522i = (InterfaceC0522i) atomicReferenceFieldUpdater.get(this);
        C0523j c0523j = interfaceC0522i instanceof C0523j ? (C0523j) interfaceC0522i : null;
        if (c0523j != null) {
            Z n4 = c0523j.n();
            while (!n4.B()) {
                InterfaceC0522i interfaceC0522i2 = (InterfaceC0522i) atomicReferenceFieldUpdater.get(n4);
                C0523j c0523j2 = interfaceC0522i2 instanceof C0523j ? (C0523j) interfaceC0522i2 : null;
                if (c0523j2 != null) {
                    n4 = c0523j2.n();
                }
            }
            this.f8128n = z4;
        }
        z4 = false;
        this.f8128n = z4;
    }

    @Override // r3.Z
    public final boolean B() {
        return this.f8128n;
    }

    @Override // r3.Z
    public final boolean C() {
        return true;
    }
}
