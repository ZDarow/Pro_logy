package p094Y;

/* renamed from: Y.B */
/* loaded from: classes.dex */
public final class C0859B implements p094Y.InterfaceC0870h {

    /* renamed from: l */
    public final p094Y.InterfaceC0870h f3089l;

    /* renamed from: m */
    public long f3090m;

    /* renamed from: n */
    public android.net.Uri f3091n;

    public C0859B(p094Y.InterfaceC0870h interfaceC0870h) {
        interfaceC0870h.getClass();
        this.f3089l = interfaceC0870h;
        this.f3091n = android.net.Uri.EMPTY;
        java.util.Collections.emptyMap();
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        this.f3091n = c0874l.f3135a;
        java.util.Collections.emptyMap();
        p094Y.InterfaceC0870h interfaceC0870h = this.f3089l;
        long mo1686b = interfaceC0870h.mo1686b(c0874l);
        android.net.Uri mo1687o = interfaceC0870h.mo1687o();
        mo1687o.getClass();
        this.f3091n = mo1687o;
        interfaceC0870h.mo1689y();
        return mo1686b;
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        this.f3089l.close();
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: j */
    public final void mo1688j(p094Y.InterfaceC0860C interfaceC0860C) {
        interfaceC0860C.getClass();
        this.f3089l.mo1688j(interfaceC0860C);
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        return this.f3089l.mo1687o();
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        int read = this.f3089l.read(bArr, i4, i5);
        if (read != -1) {
            this.f3090m += read;
        }
        return read;
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: y */
    public final java.util.Map mo1689y() {
        return this.f3089l.mo1689y();
    }
}
