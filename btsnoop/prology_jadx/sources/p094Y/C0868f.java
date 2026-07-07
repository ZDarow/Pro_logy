package p094Y;

/* renamed from: Y.f */
/* loaded from: classes.dex */
public final class C0868f extends p094Y.AbstractC0865c {

    /* renamed from: p */
    public p094Y.C0874l f3116p;

    /* renamed from: q */
    public byte[] f3117q;

    /* renamed from: r */
    public int f3118r;

    /* renamed from: s */
    public int f3119s;

    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        m1692f();
        this.f3116p = c0874l;
        android.net.Uri normalizeScheme = c0874l.f3135a.normalizeScheme();
        java.lang.String scheme = normalizeScheme.getScheme();
        p086W.AbstractC0781a.m1415d("Unsupported scheme: " + scheme, "data".equals(scheme));
        java.lang.String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i4 = p086W.AbstractC0805y.f2801a;
        java.lang.String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new p076T.C0666I("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        java.lang.String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f3117q = android.util.Base64.decode(str, 0);
            } catch (java.lang.IllegalArgumentException e4) {
                throw new p076T.C0666I(p009B2.AbstractC0051h.m153l("Error while parsing Base64 encoded string: ", str), e4, true, 0);
            }
        } else {
            this.f3117q = java.net.URLDecoder.decode(str, p124e2.AbstractC1356d.f5628a.name()).getBytes(p124e2.AbstractC1356d.f5630c);
        }
        byte[] bArr = this.f3117q;
        long length = bArr.length;
        long j4 = c0874l.f3139e;
        if (j4 > length) {
            this.f3117q = null;
            throw new p094Y.C0871i(2008);
        }
        int i5 = (int) j4;
        this.f3118r = i5;
        int length2 = bArr.length - i5;
        this.f3119s = length2;
        long j5 = c0874l.f3140f;
        if (j5 != -1) {
            this.f3119s = (int) java.lang.Math.min(length2, j5);
        }
        m1693i(c0874l);
        return j5 != -1 ? j5 : this.f3119s;
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        if (this.f3117q != null) {
            this.f3117q = null;
            m1691c();
        }
        this.f3116p = null;
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        p094Y.C0874l c0874l = this.f3116p;
        if (c0874l != null) {
            return c0874l.f3135a;
        }
        return null;
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f3119s;
        if (i6 == 0) {
            return -1;
        }
        int min = java.lang.Math.min(i5, i6);
        byte[] bArr2 = this.f3117q;
        int i7 = p086W.AbstractC0805y.f2801a;
        java.lang.System.arraycopy(bArr2, this.f3118r, bArr, i4, min);
        this.f3118r += min;
        this.f3119s -= min;
        m1690a(min);
        return min;
    }
}
