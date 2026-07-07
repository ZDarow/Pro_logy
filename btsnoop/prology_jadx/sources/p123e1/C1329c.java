package p123e1;

/* renamed from: e1.c */
/* loaded from: classes.dex */
public final class C1329c implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final p123e1.C1328b f5351a = new p123e1.C1328b(0, 1, null);

    /* renamed from: b */
    public final p086W.C0798r f5352b = new p086W.C0798r(16384);

    /* renamed from: c */
    public boolean f5353c;

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        this.f5353c = false;
        this.f5351a.mo3089b();
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f5351a.mo3092f(interfaceC2405q, new p123e1.C1325G(0, 1));
        interfaceC2405q.mo637s();
        interfaceC2405q.mo638t(new p002A0.C0004b(-9223372036854775807L));
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        p215y0.C2400l c2400l;
        int i4;
        p086W.C0798r c0798r = new p086W.C0798r(10);
        int i5 = 0;
        while (true) {
            c2400l = (p215y0.C2400l) interfaceC2404p;
            c2400l.mo634p(c0798r.f2786a, 0, 10, false);
            c0798r.m1537G(0);
            if (c0798r.m1562x() != 4801587) {
                break;
            }
            c0798r.m1538H(3);
            int m1558t = c0798r.m1558t();
            i5 += m1558t + 10;
            c2400l.m4631a(m1558t, false);
        }
        c2400l.f9452q = 0;
        c2400l.m4631a(i5, false);
        int i6 = 0;
        int i7 = i5;
        while (true) {
            int i8 = 7;
            c2400l.mo634p(c0798r.f2786a, 0, 7, false);
            c0798r.m1537G(0);
            int m1531A = c0798r.m1531A();
            if (m1531A == 44096 || m1531A == 44097) {
                i6++;
                if (i6 >= 4) {
                    return true;
                }
                byte[] bArr = c0798r.f2786a;
                if (bArr.length < 7) {
                    i4 = -1;
                } else {
                    int i9 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i9 == 65535) {
                        i9 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i8 = 4;
                    }
                    if (m1531A == 44097) {
                        i8 += 2;
                    }
                    i4 = i9 + i8;
                }
                if (i4 == -1) {
                    return false;
                }
                c2400l.m4631a(i4 - 7, false);
            } else {
                c2400l.f9452q = 0;
                i7++;
                if (i7 - i5 >= 8192) {
                    return false;
                }
                c2400l.m4631a(i7, false);
                i6 = 0;
            }
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        p086W.C0798r c0798r = this.f5352b;
        int read = ((p215y0.C2400l) interfaceC2404p).read(c0798r.f2786a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        c0798r.m1537G(0);
        c0798r.m1536F(read);
        boolean z4 = this.f5353c;
        p123e1.C1328b c1328b = this.f5351a;
        if (!z4) {
            c1328b.f5350n = 0L;
            this.f5353c = true;
        }
        c1328b.mo3090d(c0798r);
        return 0;
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
