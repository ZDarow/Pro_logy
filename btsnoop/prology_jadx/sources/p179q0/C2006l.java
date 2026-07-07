package p179q0;

/* renamed from: q0.l */
/* loaded from: classes.dex */
public final class C2006l implements p179q0.InterfaceC1989c0 {

    /* renamed from: l */
    public final p129f2.C1415c0 f8187l;

    /* renamed from: m */
    public long f8188m;

    public C2006l(java.util.List list, java.util.List list2) {
        p129f2.C1390F m3161i = p129f2.AbstractC1393I.m3161i();
        p086W.AbstractC0781a.m1416e(list.size() == list2.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            m3161i.m3145a(new p179q0.C2004k((p179q0.InterfaceC1989c0) list.get(i4), (java.util.List) list2.get(i4)));
        }
        this.f8187l = m3161i.m3157g();
        this.f8188m = -9223372036854775807L;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        int i4 = 0;
        while (true) {
            p129f2.C1415c0 c1415c0 = this.f8187l;
            if (i4 >= c1415c0.size()) {
                return false;
            }
            if (((p179q0.C2004k) c1415c0.get(i4)).mo2954c()) {
                return true;
            }
            i4++;
        }
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        int i4 = 0;
        long j4 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        while (true) {
            p129f2.C1415c0 c1415c0 = this.f8187l;
            if (i4 >= c1415c0.size()) {
                break;
            }
            p179q0.C2004k c2004k = (p179q0.C2004k) c1415c0.get(i4);
            long mo2958h = c2004k.mo2958h();
            if ((c2004k.m4052a().contains(1) || c2004k.m4052a().contains(2) || c2004k.m4052a().contains(4)) && mo2958h != Long.MIN_VALUE) {
                j4 = java.lang.Math.min(j4, mo2958h);
            }
            if (mo2958h != Long.MIN_VALUE) {
                j5 = java.lang.Math.min(j5, mo2958h);
            }
            i4++;
        }
        if (j4 != Long.MAX_VALUE) {
            this.f8188m = j4;
            return j4;
        }
        if (j5 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j6 = this.f8188m;
        return j6 != -9223372036854775807L ? j6 : j5;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        boolean z4;
        boolean z5 = false;
        do {
            long mo2964r = mo2964r();
            if (mo2964r == Long.MIN_VALUE) {
                break;
            }
            int i4 = 0;
            z4 = false;
            while (true) {
                p129f2.C1415c0 c1415c0 = this.f8187l;
                if (i4 >= c1415c0.size()) {
                    break;
                }
                long mo2964r2 = ((p179q0.C2004k) c1415c0.get(i4)).mo2964r();
                boolean z6 = mo2964r2 != Long.MIN_VALUE && mo2964r2 <= c0953q.f3450a;
                if (mo2964r2 == mo2964r || z6) {
                    z4 |= ((p179q0.C2004k) c1415c0.get(i4)).mo2959i(c0953q);
                }
                i4++;
            }
            z5 |= z4;
        } while (z4);
        return z5;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        int i4 = 0;
        long j4 = Long.MAX_VALUE;
        while (true) {
            p129f2.C1415c0 c1415c0 = this.f8187l;
            if (i4 >= c1415c0.size()) {
                break;
            }
            long mo2964r = ((p179q0.C2004k) c1415c0.get(i4)).mo2964r();
            if (mo2964r != Long.MIN_VALUE) {
                j4 = java.lang.Math.min(j4, mo2964r);
            }
            i4++;
        }
        if (j4 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
        int i4 = 0;
        while (true) {
            p129f2.C1415c0 c1415c0 = this.f8187l;
            if (i4 >= c1415c0.size()) {
                return;
            }
            ((p179q0.C2004k) c1415c0.get(i4)).mo2966w(j4);
            i4++;
        }
    }
}
