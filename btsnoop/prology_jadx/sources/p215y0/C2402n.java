package p215y0;

/* renamed from: y0.n */
/* loaded from: classes.dex */
public final class C2402n implements p215y0.InterfaceC2387F {

    /* renamed from: a */
    public final byte[] f9464a = new byte[4096];

    @Override // p215y0.InterfaceC2387F
    /* renamed from: a */
    public final void mo1405a(p086W.C0798r c0798r, int i4, int i5) {
        c0798r.m1538H(i4);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: b */
    public final void mo1406b(long j4, int i4, int i5, int i6, p215y0.C2386E c2386e) {
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: c */
    public final void mo1407c(p076T.C0702p c0702p) {
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: d */
    public final int mo1408d(p076T.InterfaceC0696j interfaceC0696j, int i4, boolean z4) {
        byte[] bArr = this.f9464a;
        int read = interfaceC0696j.read(bArr, 0, java.lang.Math.min(bArr.length, i4));
        if (read != -1) {
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new java.io.EOFException();
    }
}
