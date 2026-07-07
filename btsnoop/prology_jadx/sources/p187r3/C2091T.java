package p187r3;

/* renamed from: r3.T */
/* loaded from: classes.dex */
public class C2091T extends p187r3.C2097Z {

    /* renamed from: n */
    public final boolean f8444n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2091T(p187r3.InterfaceC2088P interfaceC2088P) {
        super(true);
        boolean z4 = true;
        m4190H(interfaceC2088P);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p187r3.C2097Z.f8460m;
        p187r3.InterfaceC2114i interfaceC2114i = (p187r3.InterfaceC2114i) atomicReferenceFieldUpdater.get(this);
        p187r3.C2116j c2116j = interfaceC2114i instanceof p187r3.C2116j ? (p187r3.C2116j) interfaceC2114i : null;
        if (c2116j != null) {
            p187r3.C2097Z m4173n = c2116j.m4173n();
            while (!m4173n.mo4171B()) {
                p187r3.InterfaceC2114i interfaceC2114i2 = (p187r3.InterfaceC2114i) atomicReferenceFieldUpdater.get(m4173n);
                p187r3.C2116j c2116j2 = interfaceC2114i2 instanceof p187r3.C2116j ? (p187r3.C2116j) interfaceC2114i2 : null;
                if (c2116j2 != null) {
                    m4173n = c2116j2.m4173n();
                }
            }
            this.f8444n = z4;
        }
        z4 = false;
        this.f8444n = z4;
    }

    @Override // p187r3.C2097Z
    /* renamed from: B */
    public final boolean mo4171B() {
        return this.f8444n;
    }

    @Override // p187r3.C2097Z
    /* renamed from: C */
    public final boolean mo4172C() {
        return true;
    }
}
