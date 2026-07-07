package p117d0;

/* renamed from: d0.l */
/* loaded from: classes.dex */
public final class C1268l implements p179q0.InterfaceC1985a0 {

    /* renamed from: l */
    public final p076T.C0702p f5088l;

    /* renamed from: n */
    public long[] f5090n;

    /* renamed from: o */
    public boolean f5091o;

    /* renamed from: p */
    public p122e0.C1306g f5092p;

    /* renamed from: q */
    public boolean f5093q;

    /* renamed from: r */
    public int f5094r;

    /* renamed from: m */
    public final p008B1.C0026d f5089m = new p008B1.C0026d(7);

    /* renamed from: s */
    public long f5095s = -9223372036854775807L;

    public C1268l(p122e0.C1306g c1306g, p076T.C0702p c0702p, boolean z4) {
        this.f5088l = c0702p;
        this.f5092p = c1306g;
        this.f5090n = c1306g.f5246b;
        m3003b(c1306g, z4);
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: a */
    public final void mo49a() {
    }

    /* renamed from: b */
    public final void m3003b(p122e0.C1306g c1306g, boolean z4) {
        int i4 = this.f5094r;
        long j4 = -9223372036854775807L;
        long j5 = i4 == 0 ? -9223372036854775807L : this.f5090n[i4 - 1];
        this.f5091o = z4;
        this.f5092p = c1306g;
        long[] jArr = c1306g.f5246b;
        this.f5090n = jArr;
        long j6 = this.f5095s;
        if (j6 == -9223372036854775807L) {
            if (j5 != -9223372036854775807L) {
                this.f5094r = p086W.AbstractC0805y.m1607b(jArr, j5, false);
            }
        } else {
            int m1607b = p086W.AbstractC0805y.m1607b(jArr, j6, true);
            this.f5094r = m1607b;
            if (this.f5091o && m1607b == this.f5090n.length) {
                j4 = j6;
            }
            this.f5095s = j4;
        }
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: d */
    public final boolean mo52d() {
        return true;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: n */
    public final int mo58n(long j4) {
        int max = java.lang.Math.max(this.f5094r, p086W.AbstractC0805y.m1607b(this.f5090n, j4, true));
        int i4 = max - this.f5094r;
        this.f5094r = max;
        return i4;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: o */
    public final int mo59o(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4) {
        int i5 = this.f5094r;
        boolean z4 = i5 == this.f5090n.length;
        if (z4 && !this.f5091o) {
            c0921f.f1957m = 4;
            return -4;
        }
        if ((i4 & 2) != 0 || !this.f5093q) {
            c0886x.f3176n = this.f5088l;
            this.f5093q = true;
            return -5;
        }
        if (z4) {
            return -3;
        }
        if ((i4 & 1) == 0) {
            this.f5094r = i5 + 1;
        }
        if ((i4 & 4) == 0) {
            byte[] m109k = this.f5089m.m109k(this.f5092p.f5245a[i5]);
            c0921f.m1752h(m109k.length);
            c0921f.f3251p.put(m109k);
        }
        c0921f.f3253r = this.f5090n[i5];
        c0921f.f1957m = 1;
        return -4;
    }
}
