package p112c0;

/* renamed from: c0.w */
/* loaded from: classes.dex */
public final class C1241w extends p079U.AbstractC0744e {

    /* renamed from: i */
    public int[] f4854i;

    /* renamed from: j */
    public int[] f4855j;

    @Override // p079U.InterfaceC0743d
    /* renamed from: f */
    public final void mo1342f(java.nio.ByteBuffer byteBuffer) {
        int[] iArr = this.f4855j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        java.nio.ByteBuffer m1348l = m1348l(((limit - position) / this.f2558b.f2556d) * this.f2559c.f2556d);
        while (position < limit) {
            for (int i4 : iArr) {
                m1348l.putShort(byteBuffer.getShort((i4 * 2) + position));
            }
            position += this.f2558b.f2556d;
        }
        byteBuffer.position(limit);
        m1348l.flip();
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: h */
    public final p079U.C0741b mo1344h(p079U.C0741b c0741b) {
        int[] iArr = this.f4854i;
        if (iArr == null) {
            return p079U.C0741b.f2552e;
        }
        if (c0741b.f2555c != 2) {
            throw new p079U.C0742c(c0741b);
        }
        int length = iArr.length;
        int i4 = c0741b.f2554b;
        boolean z4 = i4 != length;
        int i5 = 0;
        while (i5 < iArr.length) {
            int i6 = iArr[i5];
            if (i6 >= i4) {
                throw new p079U.C0742c(c0741b);
            }
            z4 |= i6 != i5;
            i5++;
        }
        return z4 ? new p079U.C0741b(c0741b.f2553a, iArr.length, 2) : p079U.C0741b.f2552e;
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: i */
    public final void mo1345i() {
        this.f4855j = this.f4854i;
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: k */
    public final void mo1347k() {
        this.f4855j = null;
        this.f4854i = null;
    }
}
