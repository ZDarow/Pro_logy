package p179q0;

/* renamed from: q0.f0 */
/* loaded from: classes.dex */
public final class C1995f0 implements p179q0.InterfaceC1985a0 {

    /* renamed from: l */
    public final long f8138l;

    /* renamed from: m */
    public boolean f8139m;

    /* renamed from: n */
    public long f8140n;

    public C1995f0(long j4) {
        p076T.C0702p c0702p = p179q0.C1997g0.f8150u;
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f8138l = 4 * ((j4 * 44100) / 1000000);
        m4047b(0L);
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: a */
    public final void mo49a() {
    }

    /* renamed from: b */
    public final void m4047b(long j4) {
        p076T.C0702p c0702p = p179q0.C1997g0.f8150u;
        int i4 = p086W.AbstractC0805y.f2801a;
        this.f8140n = p086W.AbstractC0805y.m1616k(4 * ((j4 * 44100) / 1000000), 0L, this.f8138l);
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: d */
    public final boolean mo52d() {
        return true;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: n */
    public final int mo58n(long j4) {
        long j5 = this.f8140n;
        m4047b(j4);
        return (int) ((this.f8140n - j5) / p179q0.C1997g0.f8152w.length);
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: o */
    public final int mo59o(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4) {
        if (!this.f8139m || (i4 & 2) != 0) {
            c0886x.f3176n = p179q0.C1997g0.f8150u;
            this.f8139m = true;
            return -5;
        }
        long j4 = this.f8140n;
        long j5 = this.f8138l - j4;
        if (j5 == 0) {
            c0921f.m1137a(4);
            return -4;
        }
        p076T.C0702p c0702p = p179q0.C1997g0.f8150u;
        int i5 = p086W.AbstractC0805y.f2801a;
        c0921f.f3253r = ((j4 / 4) * 1000000) / 44100;
        c0921f.m1137a(1);
        byte[] bArr = p179q0.C1997g0.f8152w;
        int min = (int) java.lang.Math.min(bArr.length, j5);
        if ((4 & i4) == 0) {
            c0921f.m1752h(min);
            c0921f.f3251p.put(bArr, 0, min);
        }
        if ((i4 & 1) == 0) {
            this.f8140n += min;
        }
        return -4;
    }
}
