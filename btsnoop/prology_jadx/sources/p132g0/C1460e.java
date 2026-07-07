package p132g0;

/* renamed from: g0.e */
/* loaded from: classes.dex */
public final class C1460e extends p184r0.AbstractC2047e {

    /* renamed from: u */
    public byte[] f5844u;

    /* renamed from: v */
    public volatile boolean f5845v;

    /* renamed from: w */
    public byte[] f5846w;

    @Override // p197u0.InterfaceC2224k
    /* renamed from: b */
    public final void mo3266b() {
        try {
            this.f8339t.mo1686b(this.f8332m);
            int i4 = 0;
            int i5 = 0;
            while (i4 != -1 && !this.f5845v) {
                byte[] bArr = this.f5844u;
                if (bArr.length < i5 + 16384) {
                    this.f5844u = java.util.Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i4 = this.f8339t.read(this.f5844u, i5, 16384);
                if (i4 != -1) {
                    i5 += i4;
                }
            }
            if (!this.f5845v) {
                this.f5846w = java.util.Arrays.copyOf(this.f5844u, i5);
            }
            p101a.AbstractC0936a.m1805m(this.f8339t);
        } catch (java.lang.Throwable th) {
            p101a.AbstractC0936a.m1805m(this.f8339t);
            throw th;
        }
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: c */
    public final void mo3267c() {
        this.f5845v = true;
    }
}
