package p161m0;

/* renamed from: m0.H */
/* loaded from: classes.dex */
public final class C1843H implements p161m0.InterfaceC1848e {

    /* renamed from: l */
    public final p094Y.C0862E f7445l = new p094Y.C0862E(p101a.AbstractC0936a.m1804l(8000));

    /* renamed from: m */
    public p161m0.C1843H f7446m;

    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        this.f7445l.mo1686b(c0874l);
        return -1L;
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        this.f7445l.close();
        p161m0.C1843H c1843h = this.f7446m;
        if (c1843h != null) {
            c1843h.close();
        }
    }

    @Override // p161m0.InterfaceC1848e
    /* renamed from: g */
    public final java.lang.String mo3804g() {
        int mo3806m = mo3806m();
        p086W.AbstractC0781a.m1421j(mo3806m != -1);
        int i4 = p086W.AbstractC0805y.f2801a;
        java.util.Locale locale = java.util.Locale.US;
        return p009B2.AbstractC0051h.m150i(mo3806m, 1 + mo3806m, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // p161m0.InterfaceC1848e
    /* renamed from: h */
    public final boolean mo3805h() {
        return true;
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: j */
    public final void mo1688j(p094Y.InterfaceC0860C interfaceC0860C) {
        this.f7445l.mo1688j(interfaceC0860C);
    }

    @Override // p161m0.InterfaceC1848e
    /* renamed from: m */
    public final int mo3806m() {
        java.net.DatagramSocket datagramSocket = this.f7445l.f3096t;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        return this.f7445l.f3095s;
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        try {
            return this.f7445l.read(bArr, i4, i5);
        } catch (p094Y.C0861D e4) {
            if (e4.f3121l == 2002) {
                return -1;
            }
            throw e4;
        }
    }

    @Override // p161m0.InterfaceC1848e
    /* renamed from: x */
    public final p161m0.C1842G mo3807x() {
        return null;
    }
}
