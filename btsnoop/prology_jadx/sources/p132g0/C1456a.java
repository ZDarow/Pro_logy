package p132g0;

/* renamed from: g0.a */
/* loaded from: classes.dex */
public final class C1456a implements p094Y.InterfaceC0870h {

    /* renamed from: l */
    public final p094Y.InterfaceC0870h f5831l;

    /* renamed from: m */
    public final byte[] f5832m;

    /* renamed from: n */
    public final byte[] f5833n;

    /* renamed from: o */
    public javax.crypto.CipherInputStream f5834o;

    public C1456a(p094Y.InterfaceC0870h interfaceC0870h, byte[] bArr, byte[] bArr2) {
        this.f5831l = interfaceC0870h;
        this.f5832m = bArr;
        this.f5833n = bArr2;
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new javax.crypto.spec.SecretKeySpec(this.f5832m, "AES"), new javax.crypto.spec.IvParameterSpec(this.f5833n));
                p094Y.C0872j c0872j = new p094Y.C0872j(this.f5831l, c0874l);
                this.f5834o = new javax.crypto.CipherInputStream(c0872j, cipher);
                c0872j.m1694a();
                return -1L;
            } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException e4) {
                throw new java.lang.RuntimeException(e4);
            }
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e5) {
            throw new java.lang.RuntimeException(e5);
        }
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        if (this.f5834o != null) {
            this.f5834o = null;
            this.f5831l.close();
        }
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: j */
    public final void mo1688j(p094Y.InterfaceC0860C interfaceC0860C) {
        interfaceC0860C.getClass();
        this.f5831l.mo1688j(interfaceC0860C);
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        return this.f5831l.mo1687o();
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        this.f5834o.getClass();
        int read = this.f5834o.read(bArr, i4, i5);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: y */
    public final java.util.Map mo1689y() {
        return this.f5831l.mo1689y();
    }
}
