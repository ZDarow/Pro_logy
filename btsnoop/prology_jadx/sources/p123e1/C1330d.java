package p123e1;

/* renamed from: e1.d */
/* loaded from: classes.dex */
public final class C1330d implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final int f5354a;

    /* renamed from: b */
    public final p123e1.C1331e f5355b;

    /* renamed from: c */
    public final p086W.C0798r f5356c;

    /* renamed from: d */
    public final p086W.C0798r f5357d;

    /* renamed from: e */
    public final p086W.C0797q f5358e;

    /* renamed from: f */
    public p215y0.InterfaceC2405q f5359f;

    /* renamed from: g */
    public long f5360g;

    /* renamed from: h */
    public long f5361h;

    /* renamed from: i */
    public int f5362i;

    /* renamed from: j */
    public boolean f5363j;

    /* renamed from: k */
    public boolean f5364k;

    /* renamed from: l */
    public boolean f5365l;

    public C1330d(int i4) {
        this.f5354a = (i4 & 2) != 0 ? i4 | 1 : i4;
        this.f5355b = new p123e1.C1331e(0, null, true);
        this.f5356c = new p086W.C0798r(2048);
        this.f5362i = -1;
        this.f5361h = -1L;
        p086W.C0798r c0798r = new p086W.C0798r(10);
        this.f5357d = c0798r;
        byte[] bArr = c0798r.f2786a;
        this.f5358e = new p086W.C0797q(bArr, bArr.length);
    }

    /* renamed from: a */
    public final int m3094a(p215y0.C2400l c2400l) {
        int i4 = 0;
        while (true) {
            p086W.C0798r c0798r = this.f5357d;
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
        if (this.f5361h == -1) {
            this.f5361h = i4;
        }
        return i4;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        this.f5364k = false;
        this.f5355b.mo3089b();
        this.f5360g = j5;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f5359f = interfaceC2405q;
        this.f5355b.mo3092f(interfaceC2405q, new p123e1.C1325G(0, 1));
        interfaceC2405q.mo637s();
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
        int m3094a = m3094a(c2400l);
        int i4 = m3094a;
        int i5 = 0;
        int i6 = 0;
        do {
            p086W.C0798r c0798r = this.f5357d;
            c2400l.mo634p(c0798r.f2786a, 0, 2, false);
            c0798r.m1537G(0);
            if ((c0798r.m1531A() & 65526) == 65520) {
                i5++;
                if (i5 >= 4 && i6 > 188) {
                    return true;
                }
                c2400l.mo634p(c0798r.f2786a, 0, 4, false);
                p086W.C0797q c0797q = this.f5358e;
                c0797q.m1526q(14);
                int m1518i = c0797q.m1518i(13);
                if (m1518i <= 6) {
                    i4++;
                    c2400l.f9452q = 0;
                    c2400l.m4631a(i4, false);
                } else {
                    c2400l.m4631a(m1518i - 6, false);
                    i6 += m1518i;
                }
            } else {
                i4++;
                c2400l.f9452q = 0;
                c2400l.m4631a(i4, false);
            }
            i5 = 0;
            i6 = 0;
        } while (i4 - m3094a < 8192);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0095, code lost:
    
        r18.f5363j = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009f, code lost:
    
        throw p076T.C0666I.m1202a(null, "Malformed ADTS stream");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo37l(p215y0.InterfaceC2404p r19, p076T.C0706t r20) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p123e1.C1330d.mo37l(y0.p, T.t):int");
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
