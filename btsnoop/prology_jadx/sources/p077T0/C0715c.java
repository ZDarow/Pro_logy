package p077T0;

/* renamed from: T0.c */
/* loaded from: classes.dex */
public final class C0715c extends p077T0.AbstractC0721i {

    /* renamed from: n */
    public p215y0.C2407s f2469n;

    /* renamed from: o */
    public p073S0.C0627e f2470o;

    @Override // p077T0.AbstractC0721i
    /* renamed from: b */
    public final long mo1303b(p086W.C0798r c0798r) {
        byte[] bArr = c0798r.f2786a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i4 = (bArr[2] & 255) >> 4;
        if (i4 == 6 || i4 == 7) {
            c0798r.m1538H(4);
            c0798r.m1532B();
        }
        int m4625t = p215y0.AbstractC2390b.m4625t(i4, c0798r);
        c0798r.m1537G(0);
        return m4625t;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [S0.e, java.lang.Object] */
    @Override // p077T0.AbstractC0721i
    /* renamed from: c */
    public final boolean mo1304c(p086W.C0798r c0798r, long j4, p008B1.C0026d c0026d) {
        byte[] bArr = c0798r.f2786a;
        p215y0.C2407s c2407s = this.f2469n;
        if (c2407s == null) {
            p215y0.C2407s c2407s2 = new p215y0.C2407s(bArr, 17);
            this.f2469n = c2407s2;
            c0026d.f99m = c2407s2.m4642c(java.util.Arrays.copyOfRange(bArr, 9, c0798r.f2788c), null);
            return true;
        }
        byte b4 = bArr[0];
        if ((b4 & Byte.MAX_VALUE) != 3) {
            if (b4 != -1) {
                return true;
            }
            p073S0.C0627e c0627e = this.f2470o;
            if (c0627e != null) {
                c0627e.f1967l = j4;
                c0026d.f100n = c0627e;
            }
            ((p076T.C0702p) c0026d.f99m).getClass();
            return false;
        }
        p200u3.C2259m m4626u = p215y0.AbstractC2390b.m4626u(c0798r);
        p215y0.C2407s c2407s3 = new p215y0.C2407s(c2407s.f9466a, c2407s.f9467b, c2407s.f9468c, c2407s.f9469d, c2407s.f9470e, c2407s.f9472g, c2407s.f9473h, c2407s.f9475j, m4626u, c2407s.f9477l);
        this.f2469n = c2407s3;
        ?? obj = new java.lang.Object();
        obj.f1969n = c2407s3;
        obj.f1970o = m4626u;
        obj.f1967l = -1L;
        obj.f1968m = -1L;
        this.f2470o = obj;
        return true;
    }

    @Override // p077T0.AbstractC0721i
    /* renamed from: d */
    public final void mo1305d(boolean z4) {
        super.mo1305d(z4);
        if (z4) {
            this.f2469n = null;
            this.f2470o = null;
        }
    }
}
