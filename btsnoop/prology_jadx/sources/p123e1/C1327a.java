package p123e1;

/* renamed from: e1.a */
/* loaded from: classes.dex */
public final class C1327a implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final p123e1.C1328b f5334a = new p123e1.C1328b();

    /* renamed from: b */
    public final p086W.C0798r f5335b = new p086W.C0798r(2786);

    /* renamed from: c */
    public boolean f5336c;

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        this.f5336c = false;
        this.f5334a.mo3089b();
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f5334a.mo3092f(interfaceC2405q, new p123e1.C1325G(0, 1));
        interfaceC2405q.mo637s();
        interfaceC2405q.mo638t(new p002A0.C0004b(-9223372036854775807L));
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        p215y0.C2400l c2400l;
        int m4613h;
        p086W.C0798r c0798r = new p086W.C0798r(10);
        int i4 = 0;
        while (true) {
            c2400l = (p215y0.C2400l) interfaceC2404p;
            c2400l.mo634p(c0798r.f2786a, 0, 10, false);
            c0798r.m1537G(0);
            if (c0798r.m1562x() != 4801587) {
                break;
            }
            c0798r.m1538H(3);
            int m1558t = c0798r.m1558t();
            i4 += m1558t + 10;
            c2400l.m4631a(m1558t, false);
        }
        c2400l.f9452q = 0;
        c2400l.m4631a(i4, false);
        int i5 = 0;
        int i6 = i4;
        while (true) {
            c2400l.mo634p(c0798r.f2786a, 0, 6, false);
            c0798r.m1537G(0);
            if (c0798r.m1531A() != 2935) {
                c2400l.f9452q = 0;
                i6++;
                if (i6 - i4 >= 8192) {
                    return false;
                }
                c2400l.m4631a(i6, false);
                i5 = 0;
            } else {
                i5++;
                if (i5 >= 4) {
                    return true;
                }
                byte[] bArr = c0798r.f2786a;
                if (bArr.length < 6) {
                    m4613h = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    m4613h = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b4 = bArr[4];
                    m4613h = p215y0.AbstractC2390b.m4613h((b4 & 192) >> 6, b4 & 63);
                }
                if (m4613h == -1) {
                    return false;
                }
                c2400l.m4631a(m4613h - 6, false);
            }
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        p086W.C0798r c0798r = this.f5335b;
        int read = ((p215y0.C2400l) interfaceC2404p).read(c0798r.f2786a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        c0798r.m1537G(0);
        c0798r.m1536F(read);
        boolean z4 = this.f5336c;
        p123e1.C1328b c1328b = this.f5334a;
        if (!z4) {
            c1328b.f5350n = 0L;
            this.f5336c = true;
        }
        c1328b.mo3090d(c0798r);
        return 0;
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
