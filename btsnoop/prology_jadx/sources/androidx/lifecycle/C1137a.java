package androidx.lifecycle;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public final class C1137a implements java.io.Closeable, p187r3.InterfaceC2130u {

    /* renamed from: l */
    public final p110b3.InterfaceC1195i f4300l;

    public C1137a(p110b3.InterfaceC1195i interfaceC1195i) {
        this.f4300l = interfaceC1195i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        p187r3.InterfaceC2088P interfaceC2088P = (p187r3.InterfaceC2088P) this.f4300l.mo678j(p187r3.C2129t.f8496m);
        if (interfaceC2088P != null) {
            interfaceC2088P.mo4170b(null);
        }
    }

    @Override // p187r3.InterfaceC2130u
    /* renamed from: h */
    public final p110b3.InterfaceC1195i mo2652h() {
        return this.f4300l;
    }
}
