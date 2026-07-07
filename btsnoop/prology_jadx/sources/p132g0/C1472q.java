package p132g0;

/* renamed from: g0.q */
/* loaded from: classes.dex */
public final class C1472q extends p179q0.C1983Z {

    /* renamed from: H */
    public final java.util.Map f5949H;

    /* renamed from: I */
    public p076T.C0699m f5950I;

    public C1472q(p197u0.C2218e c2218e, p127f0.InterfaceC1376i interfaceC1376i, p127f0.C1372e c1372e, java.util.Map map) {
        super(c2218e, interfaceC1376i, c1372e);
        this.f5949H = map;
    }

    @Override // p179q0.C1983Z
    /* renamed from: k */
    public final p076T.C0702p mo3289k(p076T.C0702p c0702p) {
        p076T.C0699m c0699m;
        p076T.C0699m c0699m2 = this.f5950I;
        if (c0699m2 == null) {
            c0699m2 = c0702p.f2412q;
        }
        if (c0699m2 != null && (c0699m = (p076T.C0699m) this.f5949H.get(c0699m2.f2347n)) != null) {
            c0699m2 = c0699m;
        }
        p076T.C0664G c0664g = c0702p.f2406k;
        p076T.C0664G c0664g2 = null;
        if (c0664g != null) {
            p076T.InterfaceC0663F[] interfaceC0663FArr = c0664g.f2198l;
            int length = interfaceC0663FArr.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                }
                p076T.InterfaceC0663F interfaceC0663F = interfaceC0663FArr[i5];
                if ((interfaceC0663F instanceof p049M0.C0414m) && "com.apple.streaming.transportStreamTimestamp".equals(((p049M0.C0414m) interfaceC0663F).f1191m)) {
                    break;
                }
                i5++;
            }
            if (i5 != -1) {
                if (length != 1) {
                    p076T.InterfaceC0663F[] interfaceC0663FArr2 = new p076T.InterfaceC0663F[length - 1];
                    while (i4 < length) {
                        if (i4 != i5) {
                            interfaceC0663FArr2[i4 < i5 ? i4 : i4 - 1] = interfaceC0663FArr[i4];
                        }
                        i4++;
                    }
                    c0664g2 = new p076T.C0664G(interfaceC0663FArr2);
                }
            }
            if (c0699m2 == c0702p.f2412q || c0664g != c0702p.f2406k) {
                p076T.C0701o m1295a = c0702p.m1295a();
                m1295a.f2374p = c0699m2;
                m1295a.f2368j = c0664g;
                c0702p = new p076T.C0702p(m1295a);
            }
            return super.mo3289k(c0702p);
        }
        c0664g = c0664g2;
        if (c0699m2 == c0702p.f2412q) {
        }
        p076T.C0701o m1295a2 = c0702p.m1295a();
        m1295a2.f2374p = c0699m2;
        m1295a2.f2368j = c0664g;
        c0702p = new p076T.C0702p(m1295a2);
        return super.mo3289k(c0702p);
    }
}
