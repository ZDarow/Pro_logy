package p161m0;

/* renamed from: m0.G */
/* loaded from: classes.dex */
public final class C1842G extends p094Y.AbstractC0865c implements p161m0.InterfaceC1848e {

    /* renamed from: p */
    public final java.util.concurrent.LinkedBlockingQueue f7441p;

    /* renamed from: q */
    public final long f7442q;

    /* renamed from: r */
    public byte[] f7443r;

    /* renamed from: s */
    public int f7444s;

    public C1842G() {
        super(true);
        this.f7442q = 8000L;
        this.f7441p = new java.util.concurrent.LinkedBlockingQueue();
        this.f7443r = new byte[0];
        this.f7444s = -1;
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        this.f7444s = c0874l.f3135a.getPort();
        return -1L;
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
    }

    @Override // p161m0.InterfaceC1848e
    /* renamed from: g */
    public final java.lang.String mo3804g() {
        p086W.AbstractC0781a.m1421j(this.f7444s != -1);
        int i4 = this.f7444s;
        int i5 = this.f7444s + 1;
        int i6 = p086W.AbstractC0805y.f2801a;
        java.util.Locale locale = java.util.Locale.US;
        return p009B2.AbstractC0051h.m150i(i4, i5, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // p161m0.InterfaceC1848e
    /* renamed from: h */
    public final boolean mo3805h() {
        return false;
    }

    @Override // p161m0.InterfaceC1848e
    /* renamed from: m */
    public final int mo3806m() {
        return this.f7444s;
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        return null;
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int min = java.lang.Math.min(i5, this.f7443r.length);
        java.lang.System.arraycopy(this.f7443r, 0, bArr, i4, min);
        byte[] bArr2 = this.f7443r;
        this.f7443r = java.util.Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i5) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f7441p.poll(this.f7442q, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = java.lang.Math.min(i5 - min, bArr3.length);
            java.lang.System.arraycopy(bArr3, 0, bArr, i4 + min, min2);
            if (min2 < bArr3.length) {
                this.f7443r = java.util.Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // p161m0.InterfaceC1848e
    /* renamed from: x */
    public final p161m0.C1842G mo3807x() {
        return this;
    }
}
