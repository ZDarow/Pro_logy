package p112c0;

/* renamed from: c0.Q */
/* loaded from: classes.dex */
public final class C1218Q extends p079U.AbstractC0744e {

    /* renamed from: i */
    public int f4756i;

    /* renamed from: j */
    public int f4757j;

    /* renamed from: k */
    public boolean f4758k;

    /* renamed from: l */
    public int f4759l;

    /* renamed from: m */
    public byte[] f4760m;

    /* renamed from: n */
    public int f4761n;

    /* renamed from: o */
    public long f4762o;

    @Override // p079U.AbstractC0744e, p079U.InterfaceC0743d
    /* renamed from: c */
    public final java.nio.ByteBuffer mo1339c() {
        int i4;
        if (super.mo1341e() && (i4 = this.f4761n) > 0) {
            m1348l(i4).put(this.f4760m, 0, this.f4761n).flip();
            this.f4761n = 0;
        }
        return super.mo1339c();
    }

    @Override // p079U.AbstractC0744e, p079U.InterfaceC0743d
    /* renamed from: e */
    public final boolean mo1341e() {
        return super.mo1341e() && this.f4761n == 0;
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: f */
    public final void mo1342f(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i4 = limit - position;
        if (i4 == 0) {
            return;
        }
        int min = java.lang.Math.min(i4, this.f4759l);
        this.f4762o += min / this.f2558b.f2556d;
        this.f4759l -= min;
        byteBuffer.position(position + min);
        if (this.f4759l > 0) {
            return;
        }
        int i5 = i4 - min;
        int length = (this.f4761n + i5) - this.f4760m.length;
        java.nio.ByteBuffer m1348l = m1348l(length);
        int m1615j = p086W.AbstractC0805y.m1615j(length, 0, this.f4761n);
        m1348l.put(this.f4760m, 0, m1615j);
        int m1615j2 = p086W.AbstractC0805y.m1615j(length - m1615j, 0, i5);
        byteBuffer.limit(byteBuffer.position() + m1615j2);
        m1348l.put(byteBuffer);
        byteBuffer.limit(limit);
        int i6 = i5 - m1615j2;
        int i7 = this.f4761n - m1615j;
        this.f4761n = i7;
        byte[] bArr = this.f4760m;
        java.lang.System.arraycopy(bArr, m1615j, bArr, 0, i7);
        byteBuffer.get(this.f4760m, this.f4761n, i6);
        this.f4761n += i6;
        m1348l.flip();
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: h */
    public final p079U.C0741b mo1344h(p079U.C0741b c0741b) {
        if (c0741b.f2555c != 2) {
            throw new p079U.C0742c(c0741b);
        }
        this.f4758k = true;
        return (this.f4756i == 0 && this.f4757j == 0) ? p079U.C0741b.f2552e : c0741b;
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: i */
    public final void mo1345i() {
        if (this.f4758k) {
            this.f4758k = false;
            int i4 = this.f4757j;
            int i5 = this.f2558b.f2556d;
            this.f4760m = new byte[i4 * i5];
            this.f4759l = this.f4756i * i5;
        }
        this.f4761n = 0;
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: j */
    public final void mo1346j() {
        if (this.f4758k) {
            if (this.f4761n > 0) {
                this.f4762o += r0 / this.f2558b.f2556d;
            }
            this.f4761n = 0;
        }
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: k */
    public final void mo1347k() {
        this.f4760m = p086W.AbstractC0805y.f2806f;
    }
}
