package p222z3;

/* renamed from: z3.j */
/* loaded from: classes.dex */
public final class C2451j extends p209w3.AbstractC2359u {

    /* renamed from: p */
    public final java.util.concurrent.atomic.AtomicReferenceArray f9621p;

    public C2451j(long j4, p222z3.C2451j c2451j, int i4) {
        super(j4, c2451j, i4);
        this.f9621p = new java.util.concurrent.atomic.AtomicReferenceArray(p222z3.AbstractC2450i.f9620f);
    }

    @Override // p209w3.AbstractC2359u
    /* renamed from: f */
    public final int mo4375f() {
        return p222z3.AbstractC2450i.f9620f;
    }

    @Override // p209w3.AbstractC2359u
    /* renamed from: g */
    public final void mo4376g(int i4, p110b3.InterfaceC1195i interfaceC1195i) {
        this.f9621p.set(i4, p222z3.AbstractC2450i.f9619e);
        m4573h();
    }

    public final java.lang.String toString() {
        return "SemaphoreSegment[id=" + this.f9308n + ", hashCode=" + hashCode() + ']';
    }
}
