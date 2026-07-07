package p193t0;

/* renamed from: t0.d */
/* loaded from: classes.dex */
public abstract class AbstractC2166d implements p193t0.InterfaceC2181s {

    /* renamed from: a */
    public final p076T.C0678V f8626a;

    /* renamed from: b */
    public final int f8627b;

    /* renamed from: c */
    public final int[] f8628c;

    /* renamed from: d */
    public final p076T.C0702p[] f8629d;

    /* renamed from: e */
    public final long[] f8630e;

    /* renamed from: f */
    public int f8631f;

    public AbstractC2166d(p076T.C0678V c0678v, int[] iArr) {
        int i4 = 0;
        p086W.AbstractC0781a.m1421j(iArr.length > 0);
        c0678v.getClass();
        this.f8626a = c0678v;
        int length = iArr.length;
        this.f8627b = length;
        this.f8629d = new p076T.C0702p[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f8629d[i5] = c0678v.f2252d[iArr[i5]];
        }
        java.util.Arrays.sort(this.f8629d, new p087W0.C0809d(5));
        this.f8628c = new int[this.f8627b];
        while (true) {
            int i6 = this.f8627b;
            if (i4 >= i6) {
                this.f8630e = new long[i6];
                return;
            } else {
                this.f8628c[i4] = c0678v.m1259b(this.f8629d[i4]);
                i4++;
            }
        }
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: a */
    public final int mo3969a() {
        return this.f8628c[mo3269g()];
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: b */
    public final p076T.C0678V mo3970b() {
        return this.f8626a;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: d */
    public final p076T.C0702p mo3972d() {
        return this.f8629d[mo3269g()];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p193t0.AbstractC2166d abstractC2166d = (p193t0.AbstractC2166d) obj;
        return this.f8626a.equals(abstractC2166d.f8626a) && java.util.Arrays.equals(this.f8628c, abstractC2166d.f8628c);
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: h */
    public final p076T.C0702p mo3974h(int i4) {
        return this.f8629d[i4];
    }

    public final int hashCode() {
        if (this.f8631f == 0) {
            this.f8631f = java.util.Arrays.hashCode(this.f8628c) + (java.lang.System.identityHashCode(this.f8626a) * 31);
        }
        return this.f8631f;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: i */
    public void mo3975i() {
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: j */
    public void mo3976j(float f4) {
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: k */
    public final int mo3977k(int i4) {
        return this.f8628c[i4];
    }

    @Override // p193t0.InterfaceC2181s
    public final int length() {
        return this.f8628c.length;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: n */
    public int mo3979n(long j4, java.util.List list) {
        return list.size();
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: o */
    public final boolean mo3980o(long j4, int i4) {
        return this.f8630e[i4] > j4;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: p */
    public final int mo3981p(p076T.C0702p c0702p) {
        for (int i4 = 0; i4 < this.f8627b; i4++) {
            if (this.f8629d[i4] == c0702p) {
                return i4;
            }
        }
        return -1;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: q */
    public final boolean mo3982q(long j4, int i4) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean mo3980o = mo3980o(elapsedRealtime, i4);
        int i5 = 0;
        while (i5 < this.f8627b && !mo3980o) {
            mo3980o = (i5 == i4 || mo3980o(elapsedRealtime, i5)) ? false : true;
            i5++;
        }
        if (!mo3980o) {
            return false;
        }
        long[] jArr = this.f8630e;
        long j5 = jArr[i4];
        int i6 = p086W.AbstractC0805y.f2801a;
        long j6 = elapsedRealtime + j4;
        if (((j4 ^ j6) & (elapsedRealtime ^ j6)) < 0) {
            j6 = Long.MAX_VALUE;
        }
        jArr[i4] = java.lang.Math.max(j5, j6);
        return true;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: r */
    public void mo3983r() {
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: u */
    public final int mo3985u(int i4) {
        for (int i5 = 0; i5 < this.f8627b; i5++) {
            if (this.f8628c[i5] == i4) {
                return i5;
            }
        }
        return -1;
    }
}
