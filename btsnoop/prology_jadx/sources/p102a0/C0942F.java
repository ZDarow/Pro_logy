package p102a0;

/* renamed from: a0.F */
/* loaded from: classes.dex */
public final class C0942F implements p102a0.InterfaceC0977h0 {

    /* renamed from: l */
    public p102a0.C0942F f3317l;

    /* renamed from: m */
    public p102a0.C0942F f3318m;

    /* renamed from: a */
    public final void m1821a(long j4, float[] fArr) {
        p102a0.C0942F c0942f = this.f3318m;
        if (c0942f != null) {
            c0942f.m1821a(j4, fArr);
        }
    }

    /* renamed from: b */
    public final void m1822b() {
        p102a0.C0942F c0942f = this.f3318m;
        if (c0942f != null) {
            c0942f.m1822b();
        }
    }

    /* renamed from: c */
    public final void m1823c(long j4, long j5) {
        p102a0.C0942F c0942f = this.f3317l;
        if (c0942f != null) {
            c0942f.m1823c(j4, j5);
        }
    }

    @Override // p102a0.InterfaceC0977h0
    /* renamed from: d */
    public final void mo1824d(int i4, java.lang.Object obj) {
        if (i4 == 7) {
            this.f3317l = (p102a0.C0942F) obj;
        } else if (i4 == 8) {
            this.f3318m = (p102a0.C0942F) obj;
        } else if (i4 == 10000 && obj != null) {
            throw new java.lang.ClassCastException();
        }
    }
}
