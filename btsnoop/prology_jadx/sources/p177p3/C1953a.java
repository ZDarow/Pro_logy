package p177p3;

/* renamed from: p3.a */
/* loaded from: classes.dex */
public final class C1953a implements p177p3.InterfaceC1954b {

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicReference f7947a;

    public C1953a(p177p3.C1957e c1957e) {
        this.f7947a = new java.util.concurrent.atomic.AtomicReference(c1957e);
    }

    @Override // p177p3.InterfaceC1954b
    public final java.util.Iterator iterator() {
        p177p3.InterfaceC1954b interfaceC1954b = (p177p3.InterfaceC1954b) this.f7947a.getAndSet(null);
        if (interfaceC1954b != null) {
            return interfaceC1954b.iterator();
        }
        throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
    }
}
