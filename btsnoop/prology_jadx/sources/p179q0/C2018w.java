package p179q0;

/* renamed from: q0.w */
/* loaded from: classes.dex */
public final class C2018w implements p094Y.InterfaceC0870h {

    /* renamed from: l */
    public final p094Y.InterfaceC0870h f8232l;

    /* renamed from: m */
    public final int f8233m;

    /* renamed from: n */
    public final p179q0.C1974P f8234n;

    /* renamed from: o */
    public final byte[] f8235o;

    /* renamed from: p */
    public int f8236p;

    public C2018w(p094Y.InterfaceC0870h interfaceC0870h, int i4, p179q0.C1974P c1974p) {
        p086W.AbstractC0781a.m1416e(i4 > 0);
        this.f8232l = interfaceC0870h;
        this.f8233m = i4;
        this.f8234n = c1974p;
        this.f8235o = new byte[1];
        this.f8236p = i4;
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: j */
    public final void mo1688j(p094Y.InterfaceC0860C interfaceC0860C) {
        interfaceC0860C.getClass();
        this.f8232l.mo1688j(interfaceC0860C);
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        return this.f8232l.mo1687o();
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        int i6 = this.f8236p;
        p094Y.InterfaceC0870h interfaceC0870h = this.f8232l;
        if (i6 == 0) {
            byte[] bArr2 = this.f8235o;
            if (interfaceC0870h.read(bArr2, 0, 1) != -1) {
                int i7 = (bArr2[0] & 255) << 4;
                if (i7 != 0) {
                    byte[] bArr3 = new byte[i7];
                    int i8 = i7;
                    int i9 = 0;
                    while (i8 > 0) {
                        int read = interfaceC0870h.read(bArr3, i9, i8);
                        if (read != -1) {
                            i9 += read;
                            i8 -= read;
                        }
                    }
                    while (i7 > 0 && bArr3[i7 - 1] == 0) {
                        i7--;
                    }
                    if (i7 > 0) {
                        p086W.C0798r c0798r = new p086W.C0798r(bArr3, i7);
                        p179q0.C1974P c1974p = this.f8234n;
                        long max = !c1974p.f8006x ? c1974p.f8003u : java.lang.Math.max(c1974p.f8007y.m3996o(true), c1974p.f8003u);
                        int m1539a = c0798r.m1539a();
                        p215y0.InterfaceC2387F interfaceC2387F = c1974p.f8005w;
                        interfaceC2387F.getClass();
                        interfaceC2387F.mo1405a(c0798r, m1539a, 0);
                        interfaceC2387F.mo1406b(max, 1, m1539a, 0, null);
                        c1974p.f8006x = true;
                    }
                }
                this.f8236p = this.f8233m;
            }
            return -1;
        }
        int read2 = interfaceC0870h.read(bArr, i4, java.lang.Math.min(this.f8236p, i5));
        if (read2 != -1) {
            this.f8236p -= read2;
        }
        return read2;
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: y */
    public final java.util.Map mo1689y() {
        return this.f8232l.mo1689y();
    }
}
