package p077T0;

/* renamed from: T0.h */
/* loaded from: classes.dex */
public final class C0720h extends p077T0.AbstractC0721i {

    /* renamed from: o */
    public static final byte[] f2486o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    public static final byte[] f2487p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    public boolean f2488n;

    /* renamed from: e */
    public static boolean m1312e(p086W.C0798r c0798r, byte[] bArr) {
        if (c0798r.m1539a() < bArr.length) {
            return false;
        }
        int i4 = c0798r.f2787b;
        byte[] bArr2 = new byte[bArr.length];
        c0798r.m1544f(bArr2, 0, bArr.length);
        c0798r.m1537G(i4);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    @Override // p077T0.AbstractC0721i
    /* renamed from: b */
    public final long mo1303b(p086W.C0798r c0798r) {
        byte[] bArr = c0798r.f2786a;
        return (this.f2497i * p215y0.AbstractC2390b.m4617l(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // p077T0.AbstractC0721i
    /* renamed from: c */
    public final boolean mo1304c(p086W.C0798r c0798r, long j4, p008B1.C0026d c0026d) {
        if (m1312e(c0798r, f2486o)) {
            byte[] copyOf = java.util.Arrays.copyOf(c0798r.f2786a, c0798r.f2788c);
            int i4 = copyOf[9] & 255;
            java.util.ArrayList m4608c = p215y0.AbstractC2390b.m4608c(copyOf);
            if (((p076T.C0702p) c0026d.f99m) != null) {
                return true;
            }
            p076T.C0701o c0701o = new p076T.C0701o();
            c0701o.f2370l = p076T.AbstractC0665H.m1201l("audio/opus");
            c0701o.f2384z = i4;
            c0701o.f2350A = 48000;
            c0701o.f2373o = m4608c;
            c0026d.f99m = new p076T.C0702p(c0701o);
            return true;
        }
        if (!m1312e(c0798r, f2487p)) {
            p086W.AbstractC0781a.m1422k((p076T.C0702p) c0026d.f99m);
            return false;
        }
        p086W.AbstractC0781a.m1422k((p076T.C0702p) c0026d.f99m);
        if (this.f2488n) {
            return true;
        }
        this.f2488n = true;
        c0798r.m1538H(8);
        p076T.C0664G m4624s = p215y0.AbstractC2390b.m4624s(p129f2.AbstractC1393I.m3163k((java.lang.String[]) p215y0.AbstractC2390b.m4627v(c0798r, false, false).f9102l));
        if (m4624s == null) {
            return true;
        }
        p076T.C0701o m1295a = ((p076T.C0702p) c0026d.f99m).m1295a();
        m1295a.f2368j = m4624s.m1187e(((p076T.C0702p) c0026d.f99m).f2406k);
        c0026d.f99m = new p076T.C0702p(m1295a);
        return true;
    }

    @Override // p077T0.AbstractC0721i
    /* renamed from: d */
    public final void mo1305d(boolean z4) {
        super.mo1305d(z4);
        if (z4) {
            this.f2488n = false;
        }
    }
}
