package p123e1;

/* renamed from: e1.C */
/* loaded from: classes.dex */
public final class C1321C implements p123e1.InterfaceC1326H {

    /* renamed from: a */
    public final p123e1.InterfaceC1320B f5298a;

    /* renamed from: b */
    public final p086W.C0798r f5299b = new p086W.C0798r(32);

    /* renamed from: c */
    public int f5300c;

    /* renamed from: d */
    public int f5301d;

    /* renamed from: e */
    public boolean f5302e;

    /* renamed from: f */
    public boolean f5303f;

    public C1321C(p123e1.InterfaceC1320B interfaceC1320B) {
        this.f5298a = interfaceC1320B;
    }

    @Override // p123e1.InterfaceC1326H
    /* renamed from: a */
    public final void mo3079a(p086W.C0803w c0803w, p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        this.f5298a.mo1314a(c0803w, interfaceC2405q, c1325g);
        this.f5303f = true;
    }

    @Override // p123e1.InterfaceC1326H
    /* renamed from: b */
    public final void mo3080b() {
        this.f5303f = true;
    }

    @Override // p123e1.InterfaceC1326H
    /* renamed from: c */
    public final void mo3081c(int i4, p086W.C0798r c0798r) {
        boolean z4 = (i4 & 1) != 0;
        int m1559u = z4 ? c0798r.f2787b + c0798r.m1559u() : -1;
        if (this.f5303f) {
            if (!z4) {
                return;
            }
            this.f5303f = false;
            c0798r.m1537G(m1559u);
            this.f5301d = 0;
        }
        while (c0798r.m1539a() > 0) {
            int i5 = this.f5301d;
            p086W.C0798r c0798r2 = this.f5299b;
            if (i5 < 3) {
                if (i5 == 0) {
                    int m1559u2 = c0798r.m1559u();
                    c0798r.m1537G(c0798r.f2787b - 1);
                    if (m1559u2 == 255) {
                        this.f5303f = true;
                        return;
                    }
                }
                int min = java.lang.Math.min(c0798r.m1539a(), 3 - this.f5301d);
                c0798r.m1544f(c0798r2.f2786a, this.f5301d, min);
                int i6 = this.f5301d + min;
                this.f5301d = i6;
                if (i6 == 3) {
                    c0798r2.m1537G(0);
                    c0798r2.m1536F(3);
                    c0798r2.m1538H(1);
                    int m1559u3 = c0798r2.m1559u();
                    int m1559u4 = c0798r2.m1559u();
                    this.f5302e = (m1559u3 & 128) != 0;
                    int i7 = (((m1559u3 & 15) << 8) | m1559u4) + 3;
                    this.f5300c = i7;
                    byte[] bArr = c0798r2.f2786a;
                    if (bArr.length < i7) {
                        c0798r2.m1540b(java.lang.Math.min(4098, java.lang.Math.max(i7, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = java.lang.Math.min(c0798r.m1539a(), this.f5300c - this.f5301d);
                c0798r.m1544f(c0798r2.f2786a, this.f5301d, min2);
                int i8 = this.f5301d + min2;
                this.f5301d = i8;
                int i9 = this.f5300c;
                if (i8 != i9) {
                    continue;
                } else {
                    if (!this.f5302e) {
                        c0798r2.m1536F(i9);
                    } else {
                        if (p086W.AbstractC0805y.m1618m(0, i9, -1, c0798r2.f2786a) != 0) {
                            this.f5303f = true;
                            return;
                        }
                        c0798r2.m1536F(this.f5300c - 4);
                    }
                    c0798r2.m1537G(0);
                    this.f5298a.mo1317d(c0798r2);
                    this.f5301d = 0;
                }
            }
        }
    }
}
