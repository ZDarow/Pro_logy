package p187r3;

/* renamed from: r3.D */
/* loaded from: classes.dex */
public final class C2076D implements p187r3.InterfaceC2103c0, p149j3.InterfaceC1737l {

    /* renamed from: l */
    public final p187r3.InterfaceC2075C f8427l;

    public C2076D(p187r3.InterfaceC2075C interfaceC2075C) {
        this.f8427l = interfaceC2075C;
    }

    /* renamed from: a */
    public final void m4156a(java.lang.Throwable th) {
        this.f8427l.mo4155d();
    }

    @Override // p149j3.InterfaceC1737l
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ java.lang.Object mo661b(java.lang.Object obj) {
        m4156a((java.lang.Throwable) obj);
        return p100Z2.C0934g.f3298a;
    }

    public final java.lang.String toString() {
        return "DisposeOnCancel[" + this.f8427l + ']';
    }
}
