package p079U;

/* renamed from: U.e */
/* loaded from: classes.dex */
public abstract class AbstractC0744e implements p079U.InterfaceC0743d {

    /* renamed from: b */
    public p079U.C0741b f2558b;

    /* renamed from: c */
    public p079U.C0741b f2559c;

    /* renamed from: d */
    public p079U.C0741b f2560d;

    /* renamed from: e */
    public p079U.C0741b f2561e;

    /* renamed from: f */
    public java.nio.ByteBuffer f2562f;

    /* renamed from: g */
    public java.nio.ByteBuffer f2563g;

    /* renamed from: h */
    public boolean f2564h;

    public AbstractC0744e() {
        java.nio.ByteBuffer byteBuffer = p079U.InterfaceC0743d.f2557a;
        this.f2562f = byteBuffer;
        this.f2563g = byteBuffer;
        p079U.C0741b c0741b = p079U.C0741b.f2552e;
        this.f2560d = c0741b;
        this.f2561e = c0741b;
        this.f2558b = c0741b;
        this.f2559c = c0741b;
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: a */
    public boolean mo1337a() {
        return this.f2561e != p079U.C0741b.f2552e;
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: b */
    public final void mo1338b() {
        flush();
        this.f2562f = p079U.InterfaceC0743d.f2557a;
        p079U.C0741b c0741b = p079U.C0741b.f2552e;
        this.f2560d = c0741b;
        this.f2561e = c0741b;
        this.f2558b = c0741b;
        this.f2559c = c0741b;
        mo1347k();
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: c */
    public java.nio.ByteBuffer mo1339c() {
        java.nio.ByteBuffer byteBuffer = this.f2563g;
        this.f2563g = p079U.InterfaceC0743d.f2557a;
        return byteBuffer;
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: d */
    public final void mo1340d() {
        this.f2564h = true;
        mo1346j();
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: e */
    public boolean mo1341e() {
        return this.f2564h && this.f2563g == p079U.InterfaceC0743d.f2557a;
    }

    @Override // p079U.InterfaceC0743d
    public final void flush() {
        this.f2563g = p079U.InterfaceC0743d.f2557a;
        this.f2564h = false;
        this.f2558b = this.f2560d;
        this.f2559c = this.f2561e;
        mo1345i();
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: g */
    public final p079U.C0741b mo1343g(p079U.C0741b c0741b) {
        this.f2560d = c0741b;
        this.f2561e = mo1344h(c0741b);
        return mo1337a() ? this.f2561e : p079U.C0741b.f2552e;
    }

    /* renamed from: h */
    public abstract p079U.C0741b mo1344h(p079U.C0741b c0741b);

    /* renamed from: i */
    public void mo1345i() {
    }

    /* renamed from: j */
    public void mo1346j() {
    }

    /* renamed from: k */
    public void mo1347k() {
    }

    /* renamed from: l */
    public final java.nio.ByteBuffer m1348l(int i4) {
        if (this.f2562f.capacity() < i4) {
            this.f2562f = java.nio.ByteBuffer.allocateDirect(i4).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.f2562f.clear();
        }
        java.nio.ByteBuffer byteBuffer = this.f2562f;
        this.f2563g = byteBuffer;
        return byteBuffer;
    }
}
