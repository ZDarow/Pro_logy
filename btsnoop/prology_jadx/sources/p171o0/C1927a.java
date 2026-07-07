package p171o0;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public final class C1927a implements p184r0.InterfaceC2051i {

    /* renamed from: a */
    public final p197u0.InterfaceC2228o f7821a;

    /* renamed from: b */
    public final int f7822b;

    /* renamed from: c */
    public final p184r0.InterfaceC2048f[] f7823c;

    /* renamed from: d */
    public final p094Y.InterfaceC0870h f7824d;

    /* renamed from: e */
    public p193t0.InterfaceC2181s f7825e;

    /* renamed from: f */
    public p175p0.C1944c f7826f;

    /* renamed from: g */
    public int f7827g;

    /* renamed from: h */
    public p179q0.C1986b f7828h;

    public C1927a(p197u0.InterfaceC2228o interfaceC2228o, p175p0.C1944c c1944c, int i4, p193t0.InterfaceC2181s interfaceC2181s, p094Y.InterfaceC0870h interfaceC0870h, p046L1.C0363g c0363g, boolean z4) {
        p073S0.C0644v[] c0644vArr;
        this.f7821a = interfaceC2228o;
        this.f7826f = c1944c;
        this.f7822b = i4;
        this.f7825e = interfaceC2181s;
        this.f7824d = interfaceC0870h;
        p175p0.C1943b c1943b = c1944c.f7906f[i4];
        this.f7823c = new p184r0.InterfaceC2048f[interfaceC2181s.length()];
        for (int i5 = 0; i5 < this.f7823c.length; i5++) {
            int mo3977k = interfaceC2181s.mo3977k(i5);
            p076T.C0702p c0702p = c1943b.f7894j[mo3977k];
            if (c0702p.f2412q != null) {
                p175p0.C1942a c1942a = c1944c.f7905e;
                c1942a.getClass();
                c0644vArr = c1942a.f7884c;
            } else {
                c0644vArr = null;
            }
            p073S0.C0644v[] c0644vArr2 = c0644vArr;
            int i6 = c1943b.f7885a;
            this.f7823c[i5] = new p184r0.C2046d(new p073S0.C0636n(c0363g, !z4 ? 35 : 3, null, new p073S0.C0643u(mo3977k, i6, c1943b.f7887c, -9223372036854775807L, c1944c.f7907g, c0702p, 0, c0644vArr2, i6 == 2 ? 4 : 0, null, null), p129f2.C1415c0.f5744p, null), c1943b.f7885a, c0702p);
        }
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: a */
    public final void mo2994a() {
        p179q0.C1986b c1986b = this.f7828h;
        if (c1986b != null) {
            throw c1986b;
        }
        this.f7821a.mo2967a();
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: b */
    public final long mo2995b(long j4, p102a0.C0987m0 c0987m0) {
        p175p0.C1943b c1943b = this.f7826f.f7906f[this.f7822b];
        int m1611f = p086W.AbstractC0805y.m1611f(c1943b.f7899o, j4, true);
        long[] jArr = c1943b.f7899o;
        long j5 = jArr[m1611f];
        return c0987m0.m2029a(j4, j5, (j5 >= j4 || m1611f >= c1943b.f7895k - 1) ? j5 : jArr[m1611f + 1]);
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: c */
    public final boolean mo2996c(long j4, p184r0.AbstractC2047e abstractC2047e, java.util.List list) {
        if (this.f7828h != null) {
            return false;
        }
        return this.f7825e.mo3973f(j4, abstractC2047e, list);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q0.b, java.io.IOException] */
    @Override // p184r0.InterfaceC2051i
    /* renamed from: d */
    public final void mo2997d(p102a0.C0953Q c0953q, long j4, java.util.List list, p009B2.C0033D c0033d) {
        int mo4114a;
        long m3898b;
        if (this.f7828h != null) {
            return;
        }
        p175p0.C1943b[] c1943bArr = this.f7826f.f7906f;
        int i4 = this.f7822b;
        p175p0.C1943b c1943b = c1943bArr[i4];
        if (c1943b.f7895k == 0) {
            c0033d.f118a = !r4.f7904d;
            return;
        }
        boolean isEmpty = list.isEmpty();
        long[] jArr = c1943b.f7899o;
        if (isEmpty) {
            mo4114a = p086W.AbstractC0805y.m1611f(jArr, j4, true);
        } else {
            mo4114a = (int) (((p184r0.AbstractC2054l) list.get(list.size() - 1)).mo4114a() - this.f7827g);
            if (mo4114a < 0) {
                this.f7828h = new java.io.IOException();
                return;
            }
        }
        if (mo4114a >= c1943b.f7895k) {
            c0033d.f118a = !this.f7826f.f7904d;
            return;
        }
        long j5 = c0953q.f3450a;
        long j6 = j4 - j5;
        p175p0.C1944c c1944c = this.f7826f;
        if (c1944c.f7904d) {
            p175p0.C1943b c1943b2 = c1944c.f7906f[i4];
            int i5 = c1943b2.f7895k - 1;
            m3898b = (c1943b2.m3898b(i5) + c1943b2.f7899o[i5]) - j5;
        } else {
            m3898b = -9223372036854775807L;
        }
        int length = this.f7825e.length();
        p184r0.InterfaceC2056n[] interfaceC2056nArr = new p184r0.InterfaceC2056n[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.f7825e.mo3977k(i6);
            interfaceC2056nArr[i6] = new p117d0.C1266j(c1943b, mo4114a);
        }
        this.f7825e.mo3271s(j5, j6, m3898b, list, interfaceC2056nArr);
        long j7 = jArr[mo4114a];
        long m3898b2 = c1943b.m3898b(mo4114a) + j7;
        long j8 = list.isEmpty() ? j4 : -9223372036854775807L;
        int i7 = this.f7827g + mo4114a;
        int mo3269g = this.f7825e.mo3269g();
        p184r0.InterfaceC2048f interfaceC2048f = this.f7823c[mo3269g];
        int mo3977k = this.f7825e.mo3977k(mo3269g);
        p076T.C0702p[] c0702pArr = c1943b.f7894j;
        p086W.AbstractC0781a.m1421j(c0702pArr != null);
        java.util.ArrayList arrayList = c1943b.f7898n;
        p086W.AbstractC0781a.m1421j(arrayList != null);
        p086W.AbstractC0781a.m1421j(mo4114a < arrayList.size());
        java.lang.String num = java.lang.Integer.toString(c0702pArr[mo3977k].f2404i);
        java.lang.String l4 = ((java.lang.Long) arrayList.get(mo4114a)).toString();
        android.net.Uri m1436y = p086W.AbstractC0781a.m1436y(c1943b.f7896l, c1943b.f7897m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l4).replace("{start_time}", l4));
        android.os.SystemClock.elapsedRealtime();
        p076T.C0702p mo3972d = this.f7825e.mo3972d();
        int mo3268e = this.f7825e.mo3268e();
        java.lang.Object mo3270l = this.f7825e.mo3270l();
        java.util.Map emptyMap = java.util.Collections.emptyMap();
        p086W.AbstractC0781a.m1423l(m1436y, "The uri must be set.");
        c0033d.f119b = new p184r0.C2052j(this.f7824d, new p094Y.C0874l(m1436y, 1, null, emptyMap, 0L, -1L, null, 0), mo3972d, mo3268e, mo3270l, j7, m3898b2, j8, -9223372036854775807L, i7, 1, j7, interfaceC2048f);
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: e */
    public final boolean mo2998e(p184r0.AbstractC2047e abstractC2047e, boolean z4, p006B.C0020c c0020c, p193t0.C2164b c2164b) {
        p197u0.C2221h m3943t = p176p1.AbstractC1949a.m3943t(this.f7825e);
        c2164b.getClass();
        p128f1.C1383e m4284d = p193t0.C2164b.m4284d(m3943t, c0020c);
        if (z4 && m4284d != null && m4284d.f5683a == 2) {
            p193t0.InterfaceC2181s interfaceC2181s = this.f7825e;
            if (interfaceC2181s.mo3982q(m4284d.f5684b, interfaceC2181s.mo3981p(abstractC2047e.f8334o))) {
                return true;
            }
        }
        return false;
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: f */
    public final void mo2999f(p184r0.AbstractC2047e abstractC2047e) {
    }

    @Override // p184r0.InterfaceC2051i
    /* renamed from: g */
    public final int mo3000g(long j4, java.util.List list) {
        return (this.f7828h != null || this.f7825e.length() < 2) ? list.size() : this.f7825e.mo3979n(j4, list);
    }

    @Override // p184r0.InterfaceC2051i
    public final void release() {
        for (p184r0.InterfaceC2048f interfaceC2048f : this.f7823c) {
            ((p184r0.C2046d) interfaceC2048f).f8322l.release();
        }
    }
}
