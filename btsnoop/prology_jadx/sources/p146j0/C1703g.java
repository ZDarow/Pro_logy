package p146j0;

/* renamed from: j0.g */
/* loaded from: classes.dex */
public final class C1703g extends p098Z.C0921f {

    /* renamed from: u */
    public long f7084u;

    /* renamed from: v */
    public int f7085v;

    /* renamed from: w */
    public int f7086w;

    @Override // p098Z.C0921f
    /* renamed from: e */
    public final void mo1750e() {
        super.mo1750e();
        this.f7085v = 0;
    }

    /* renamed from: j */
    public final boolean m3658j(p098Z.C0921f c0921f) {
        java.nio.ByteBuffer byteBuffer;
        p086W.AbstractC0781a.m1416e(!c0921f.m1138c(1073741824));
        p086W.AbstractC0781a.m1416e(!c0921f.m1138c(268435456));
        p086W.AbstractC0781a.m1416e(!c0921f.m1138c(4));
        if (m3659k()) {
            if (this.f7085v >= this.f7086w) {
                return false;
            }
            java.nio.ByteBuffer byteBuffer2 = c0921f.f3251p;
            if (byteBuffer2 != null && (byteBuffer = this.f3251p) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i4 = this.f7085v;
        this.f7085v = i4 + 1;
        if (i4 == 0) {
            this.f3253r = c0921f.f3253r;
            if (c0921f.m1138c(1)) {
                this.f1957m = 1;
            }
        }
        java.nio.ByteBuffer byteBuffer3 = c0921f.f3251p;
        if (byteBuffer3 != null) {
            m1752h(byteBuffer3.remaining());
            this.f3251p.put(byteBuffer3);
        }
        this.f7084u = c0921f.f3253r;
        return true;
    }

    /* renamed from: k */
    public final boolean m3659k() {
        return this.f7085v > 0;
    }
}
